/* Generated By:JJTree: Do not edit this line. ASTInfiniteLoop.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTInfiniteLoop extends SimpleNode {
  public ASTInfiniteLoop(int id) {
    super(id);
  }

  public ASTInfiniteLoop(IntVParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(IntVParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=21f6613cc2a66d24ed2818b74f0dda0c (do not edit this line) */