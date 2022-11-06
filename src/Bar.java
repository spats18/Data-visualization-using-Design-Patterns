package src;

import java.awt.*;

public class Bar extends DecoratorPlot{
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
