package instructure;

import java.util.ArrayList;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        Context context = new Context();
        ArrayList<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());

        for(AbstractExpression e : list){
            e.interpret(context);
        }
    }
}
