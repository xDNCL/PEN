/* Generated By:JJTree: Do not edit this line. ASTWhileSwitch.java */

public class ASTWhileSwitchFor extends SimpleNode {
	public ASTWhileSwitchFor(int id) {
		super(id);
	}

	public ASTWhileSwitchFor(IntVParser p, int id) {
		super(p, id);
	}


	/** Accept the visitor. **/
	public Object jjtAccept(IntVParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}
	
	public String p;
	
	public final String wh = "while";
	public final String sw = "switch";
	public final String fr = "for";
}
