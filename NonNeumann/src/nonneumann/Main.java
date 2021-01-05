package nonneumann;

import java.io.*;

import nonneumann.lexer.*;
import nonneumann.node.*;
import nonneumann.parser.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			String arquivo = "teste/teste.non";

			Lexer lex =
					new Lexer(
							new PushbackReader(  
									new FileReader(arquivo), 1024)); 
			Parser p = new Parser(lex); 
			   
		    Start tree = p.parse();
		    //Imprime √°rvore na sa√≠da padr√£o
		    //tree.apply(new ASTPrinter());
		    //Imprime √°rvore em interface gr√°fica
		    tree.apply(new ASTDisplay());
		    
		    //Coment·rio abaixo relacionado ‡ fase de analisador lÈxico
			/*Token token;
			while(!((token = lexer.next()) instanceof EOF)) {
				System.out.print(token.getClass());
				System.out.println(" ( "+token.toString()+")");
			}*/
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}