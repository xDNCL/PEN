/* Generated By:JJTree: Do not edit this line. ASTLog.java */

public class ASTLog extends SimpleNode {
	public ASTLog(int id) {
		super(id);
	}

	public ASTLog(IntVParser p, int id) {
		super(p, id);
	}


	/** Accept the visitor. **/
	public Object jjtAccept(IntVParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}
}
