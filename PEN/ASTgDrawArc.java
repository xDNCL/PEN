/* Generated By:JJTree: Do not edit this line. ASTgDrawArc.java */

public class ASTgDrawArc extends SimpleNode {
  public ASTgDrawArc(int id) {
    super(id);
  }

  public ASTgDrawArc(IntVParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(IntVParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
