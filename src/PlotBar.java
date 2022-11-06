package src;

import java.awt.*;

/**
 * The PlotBar class is a decorator for Dot class. 
 * It is inheriting PlotDecorator.
 * It will depend on its PlotCommon Component for the plotting 
 * of squares and dots on the graphic.
 * It will decorate the graphic with Bars at each point.
 */
public class PlotBar extends PlotDecorator{

    /**
	 * The operation will plot a bar for each point on the graphic.
	 * @param graphic Graphics object on which bars are to be plotted.
	 */
    @Override
    public void operation(Graphics graphic){
        for (int i = 0; i < rndNum.size(); i++){
            graphic.setColor(Color.lightGray);
			graphic.fillRect(i*20-4, rndNum.get(i)+4, 8, 500 - rndNum.get(i));
		}
        graphic.setColor(Color.black);
        super.operation(graphic);
    }
}
