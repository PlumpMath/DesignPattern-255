package instance.test;

import instance.context.PlayContext;
import instance.expression.Expression;
import instance.expression.Note;
import instance.expression.Scale;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        PlayContext context = new PlayContext();
        System.out.println("上海滩：");
        context.setText("O 2 E 0.5 G 0.5");
        Expression expression = null;

        while(context.getText().length()>0){
            String str = context.getText().substring(0,1);
            switch (str){
                case "O":
                    expression  = new Scale();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                case "P":
                    expression = new Note();
                    break;
            }
            expression.interpret(context);
        }
    }
}
