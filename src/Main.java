import kid.kidParser;
import kid.kidLexer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.imageio.IIOException;
import java.io.*;

public class Main {
    public static void main(String[] args)  {
        try {
            ANTLRInputStream input = new ANTLRInputStream(
                    //new FileInputStream(new File("src/float"))
                    //new FileInputStream(new File("src/text.txt"))
                    //new FileInputStream(new File("src/primer"))
                   // new FileInputStream(new File("src/char"))
                    new FileInputStream(new File("src/if"))
            );
            //CharStream input = CharStreams.fromFileName("src/primer")
          //  System.out.println(input);
            kidLexer lexer=new kidLexer(input);
            CommonTokenStream tokens=new CommonTokenStream(lexer);
            kidParser parser = new kidParser(tokens);
            ParseTree tree = parser.program();
            //MyVisitor2 visitor = new MyVisitor2();
            MyVisitor visitor=new MyVisitor();
            visitor.visit(tree);
        } catch (IIOException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}