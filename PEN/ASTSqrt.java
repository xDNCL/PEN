/* Generated By:JJTree: Do not edit this line. ASTSqrt.java */

public class ASTSqrt extends SimpleNode {
	public ASTSqrt(int id) {
		super(id);
	}

	public ASTSqrt(IntVParser p, int id) {
		super(p, id);
	}


	/** Accept the visitor. **/
	public Object jjtAccept(IntVParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}
}
