/* Generated By:JJTree: Do not edit this line. ASTCompare.java */

public class ASTCompare extends SimpleNode {
  public ASTCompare(int id) {
    super(id);
  }

  public ASTCompare(IntVParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(IntVParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
