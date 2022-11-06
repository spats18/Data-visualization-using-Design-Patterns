package src;
import javax.swing.JPanel;
import java.awt.*;

class PlotPanel extends JPanel implements Observer {
    PlotCommon plot;

    public PlotPanel(PlotCommon plot){
        this.plot = plot;
    }

    public void update(Observable observable) {
        plot.setNumber(((RandomNumbers)observable).getNumber());
        super.repaint();
    }
    
    @Override
    public void paintComponent (Graphics graphic){
		if(plot != null){
			plot.operation(graphic);
		}
	}
}
