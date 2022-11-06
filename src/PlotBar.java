package src;

import java.awt.*;

/**
 * The Bar class is a decorator for Dot class. 
 * It is inheriting Decorator Plot.
 * It will depend
 */
public class PlotBar extends PlotDecorator{

    /**
	 * The operation will plot a bar for each point on the plot.
	 * @param graphic Graphics object to plot bars.
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
