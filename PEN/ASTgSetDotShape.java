/* Generated By:JJTree: Do not edit this line. ASTgSetDotShape.java */

public class ASTgSetDotShape extends SimpleNode {
  public ASTgSetDotShape(int id) {
    super(id);
  }

  public ASTgSetDotShape(IntVParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(IntVParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
