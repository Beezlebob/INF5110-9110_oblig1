package syntaxtree;

public class AssignStmt extends Stmt implements PrintAST {

	Var var;
	Exp exp;
	
	public AssignStmt(Stmt stmt) {
		super(stmt);
	}

	@Override
	public String printAst() {
		return "(ASSIGN_STMT \n"+var.printAst()+"\n"+exp.printAst()+"\n)";
	}

}
