package syntaxtree;


public class Stmt implements PrintAST {

	AssignStmt assignStmt;
	IfStmt ifStmt;
	WhileStmt whileStmt;
	ReturnStmt returnStmt;
	CallStmt callStmt;
	
	public Stmt(Stmt stmt){
		if(stmt.getClass() == AssignStmt.class){
			assignStmt = (AssignStmt)stmt;
		}else if(stmt.getClass() == IfStmt.class){
			ifStmt = (IfStmt)stmt;
		}else if(stmt.getClass() == WhileStmt.class){
			whileStmt = (WhileStmt) stmt;
		}else if(stmt.getClass() == ReturnStmt.class){
			returnStmt = (ReturnStmt)stmt;
		}else if(stmt.getClass()== CallStmt.class){
			callStmt = (CallStmt) stmt;
		}
	}
	
	@Override
	public String printAst() {
		if(assignStmt!=null){
			return assignStmt.printAst();
		}else if(ifStmt!=null){
			return ifStmt.printAst();
		}else if(whileStmt!=null){
			return whileStmt.printAst();
		}else if(returnStmt!=null){
			return returnStmt.printAst();
		}else if(callStmt!=null){
			return callStmt.printAst();
		}
		return null;
	}

}
