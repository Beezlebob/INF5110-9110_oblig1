package syntaxtree;

import java.util.*;

public class ClassDecl implements PrintAST{

    String name;
    List<VarDecl> varDecls;
    
    public ClassDecl (String name) {
        this.name = name;
    }

    public String printAst() {
	
        return "(CLASS_DECL (NAME " + name + "))";
    }
}
