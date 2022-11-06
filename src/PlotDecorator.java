package src;
import java.awt.*;

abstract class PlotDecorator extends PlotCommon {
    protected PlotCommon component;
    // private JPanel 

    public void setComponent(PlotCommon component){
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
