package syntaxtree;

import java.util.List;

public class IfStmt extends Stmt implements PrintAST {

	Exp exp;
	List<Stmt> ifStmt;
	List<Stmt> elseStmt;
	String returnValue;
	
	public IfStmt(Stmt stmt) {
		super(stmt);
	}

	@Override
	public String printAst() {
		returnValue = "(IF_STMT "+exp.printAst()+" )";
		if(ifStmt!= null){
			returnValue += "\t(\n";
			for(int i = 0;i<ifStmt.size();i++){
				returnValue+=ifStmt.get(i).printAst();
			}
			returnValue+=")\n";
		}else if(elseStmt!=null){
			returnValue += "\t(\n";
			for(int i = 0;i<elseStmt.size();i++){
				returnValue+=elseStmt.get(i).printAst();
			}
			returnValue+=")\n";
		}
		return returnValue;
	}

}
