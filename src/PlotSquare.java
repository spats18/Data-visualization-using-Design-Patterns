package src;

import java.awt.*;

/**
 * The PlotSquare class is a decorator for Dot class. 
 * It is inheriting PlotDecorator.
 * It will depend on its PlotCommon Component for the plotting 
 * of dots on the graphic.
 * It will decorate the graphic with squares at each point.
 */
public class PlotSquare extends PlotDecorator{

    /**
     * The operation will plot a square for each point on the graphic.
	 * @param graphic Graphics object on which squares are to be plotted.
     */
    @Override
    public void operation(Graphics graphic){
        for (int i = 0; i < rndNum.size(); i++){
			graphic.fillRect(i*20-4, rndNum.get(i)-4, 8, 8);
		}
        graphic.setColor(Color.black);
        super.operation(graphic);
    }
}
