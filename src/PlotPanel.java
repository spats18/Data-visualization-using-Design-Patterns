package src;

import javax.swing.JPanel;
import java.awt.*;

/**
 * The PlotPanel is the main class for plotting all the graphics.
 * It is inheriting the JPanel class.
 * It implements the Observer interface to observe RandomNumbers class.
 */
class PlotPanel extends JPanel implements Observer {
    PlotCommon plot;

    /**
     * This is the constructor for PlotPanel class.
     * @param plot The constructor will take in PlotCommon object as parameter
     * and will assign the same to its PlotCommon Object.
     */
    public PlotPanel(PlotCommon plot){
        this.plot = plot;
    }

    /**
     * The Update method will be notified via Observable whenever there is 
     * change in the dataset.
     * @param observable The observable object which can be referenced to get the 
     * changed dataset.
     */
    @Override
    public void update(Observable observable) {
        plot.setNumber(((RandomNumbers)observable).getNumber());
        super.repaint();
    }
    
    /**
     * This is an overridden method of JPanel to call the operation 
     * method of the PlotDecorator.
     * @param graphic Graphics Object to draw the plot.
     */
    @Override
    public void paintComponent (Graphics graphic){
		if(plot != null){
			plot.operation(graphic);
		}
	}
}
