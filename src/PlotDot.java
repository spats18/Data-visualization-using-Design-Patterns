package src;

import java.awt.*;

/**
 * The PlotDot class is a child of abstract class PlotCommon.
 * It will plot the random points stored in the list of PlotCommon.
 * The graphic will also connect the points to make a continuous graph.
 */
public class PlotDot extends PlotCommon{

    /**
     * This is the definition for the operation method declared in PlotCommon.
     * The method will plot the random points stored in the list of PlotCommon.
     * @param graphic Graphics object on which dots are to be plotted.
     */
    @Override
    public void operation(Graphics graphic){
        for (int i = 1; i < rndNum.size(); i++){
			graphic.drawLine(i*20, rndNum.get(i), (i-1)*20, rndNum.get(i-1));
		}
        graphic.setColor(Color.red);
        graphic.drawLine(0, (int)Evaluator.mean % 300, 500, (int)Evaluator.mean % 300);
    };
}