import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.StringReader;

import javax.swing.JTextArea;

public class xDCNL2ArduinoConvertListener implements ActionListener {
	private MainGUI gui;
	private PenProperties penPro;

	public xDCNL2ArduinoConvertListener(MainGUI gui, PenProperties penPro) {
		this.gui = gui;
		this.penPro = penPro;
	}

	public void actionPerformed(ActionEvent ae) {
		gui.consoleAppend.clean(ConsoleAppend.CONSOLE);
		
		if(penPro.containsKey(penPro.Arduino_EXEC_PATH)){
			File pathCheck = new File(penPro.getProperty(penPro.Arduino_EXEC_PATH));
			if(pathCheck.isFile() || 
					(System.getProperty("os.name").indexOf("Mac")>=0
					&& pathCheck.isDirectory())){

				String str = gui.edit_area.getText() + "\n";
				
				try {
					gui.edit_area.setSelectionStart(0);
					gui.edit_area.setSelectionEnd(0);
					
					IntVParser parser = new IntVParser(new StringReader(str));
					parser.setMainGUI(gui);
					if(gui.Flags.DebugFlag) {
						parser.enable_tracing();
					} else {
						parser.disable_tracing();
					}
					parser.IntVUnit();
					
					try {
						IntVConvertArduino visitor = new IntVConvertArduino(penPro);
						parser.jjtree.rootNode().jjtAccept(visitor, null);
					} catch (Exception e) {
						
					}
				} catch (Exception e) {
					gui.consoleAppend.appendAll(ParseIsolateCause.isolateCause(e));
				} catch (Error e){
					gui.consoleAppend.appendAll(ParseIsolateCause.isolateCause(e));
				} finally {
					gui.consoleAppend.appendAll("\n--------\n");
				}
			} else {
				// TODO ArduinoIDEのパスが間違えているときの処理
			}
		} else {
			// TODO ArduinoIDEのパスが設定されていないときの処理
		}
	}
}
