/* Generated By:JJTree: Do not edit this line. ASTAssignStat.java */

public class ASTAssignStat extends SimpleNode {
	public ASTAssignStat(int id) {
		super(id);
	}

	public ASTAssignStat(IntVParser p, int id) {
		super(p, id);
	}


	/** Accept the visitor. **/
	public Object jjtAccept(IntVParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}
	
	boolean InputFlag = false;
}
