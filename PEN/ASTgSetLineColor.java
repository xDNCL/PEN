/* Generated By:JJTree: Do not edit this line. ASTgSetLineColor.java */

public class ASTgSetLineColor extends SimpleNode {
  public ASTgSetLineColor(int id) {
    super(id);
  }

  public ASTgSetLineColor(IntVParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(IntVParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
