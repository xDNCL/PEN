/* Generated By:JJTree: Do not edit this line. ASTgDrawLine.java */

public class ASTgDrawLine extends SimpleNode {
  public ASTgDrawLine(int id) {
    super(id);
  }

  public ASTgDrawLine(IntVParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(IntVParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
