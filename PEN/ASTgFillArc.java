/* Generated By:JJTree: Do not edit this line. ASTgFillArc.java */

public class ASTgFillArc extends SimpleNode {
  public ASTgFillArc(int id) {
    super(id);
  }

  public ASTgFillArc(IntVParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(IntVParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
