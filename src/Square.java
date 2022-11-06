package src;

import java.awt.*;

public class Square extends DecoratorPlot{
    @Override
    public void operation(Graphics graphic){
        for (int i = 0; i < rndNum.size(); i++){
			graphic.fillRect(i*20-4, rndNum.get(i)-4, 8, 8);
		}
        graphic.setColor(Color.black);
        super.operation(graphic);
    }
}
