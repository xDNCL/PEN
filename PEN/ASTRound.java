/* Generated By:JJTree: Do not edit this line. ASTRound.java */

public class ASTRound extends SimpleNode {
	public ASTRound(int id) {
		super(id);
	}

	public ASTRound(IntVParser p, int id) {
		super(p, id);
	}


	/** Accept the visitor. **/
	public Object jjtAccept(IntVParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}
}
