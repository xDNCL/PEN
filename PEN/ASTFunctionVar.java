/* Generated By:JJTree: Do not edit this line. ASTFunctionVar.java */

public class ASTFunctionVar extends SimpleNode {
  public ASTFunctionVar(int id) {
    super(id);
  }

  public ASTFunctionVar(IntVParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(IntVParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  /** customizing codes **/
  	public int decl;
}
