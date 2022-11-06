package src;
import java.awt.*;

abstract class DecoratorPlot extends CommonPlot {
    protected CommonPlot component;
    // private JPanel 

    public void setComponent(CommonPlot component){
        this.component = component;
    }

    @Override
    public void setNumber(int num){
        super.setNumber(num);
    }
    @Override
    public void operation(Graphics graphic) {
       if(component!=null)
        component.operation(graphic);
    }
    
}
