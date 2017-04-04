package instance.expression;

import instance.context.PlayContext;

/**
 * @author zmz
 */
public abstract class Expression {
    public void interpret(PlayContext context){
        if(context.getText().length()==0){
            return;
        }
        String playKey = context.toString().substring(0,1);
        context.setText(context.getText().substring(2));
        double playValue = Double.parseDouble(context.getText().substring(0, context.getText().indexOf(' ')));
        context.setText(context.getText().substring(context.getText().indexOf(' ')));
        execute(playKey, playValue);
    }

    public abstract void execute(String key, double value);
}
