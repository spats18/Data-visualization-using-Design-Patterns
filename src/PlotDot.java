package src;

import java.awt.*;

public class PlotDot extends PlotCommon{
    public void operation(Graphics graphic){
        for (int i = 1; i < rndNum.size(); i++){
			graphic.drawLine(i*20, rndNum.get(i), (i-1)*20, rndNum.get(i-1));
            graphic.drawLine(0, (int)Evaluator.mean % 300, 500, (int)Evaluator.mean % 300);
		}
    };
}