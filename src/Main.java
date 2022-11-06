package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The main class is the driver class. 
 * It will plot the points on the frame with decorations and mean value.
 * 
 */
class Main extends JFrame implements ActionListener{
    static RandomNumbers rndNum;
    static PlotPanel[] panels = new PlotPanel[3];
    
    /**
     * main method is the driver method to start the plotting of points.
     */
    public static void main(String args[]){
        Main main = new Main();
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setSize(500,900);
		main.setVisible(true);
    }

    /**
     * This is the constructor for the Main class.
     * It will listen when the button is clicked.
     * and will plot the points on the frame with decorations and mean value.
     */
    public Main(){
        JPanel plot = new JPanel(new GridLayout(3,1,0,10));
        plot.setBorder(BorderFactory.createLineBorder(Color.black));
		JPanel buttonPanel = new JPanel(new GridLayout(1,1));

		PlotDot dot = new PlotDot();
        PlotSquare sqr = new PlotSquare();
		PlotBar bar = new PlotBar();

		sqr.setComponent(dot);
		bar.setComponent(sqr);

		JButton button = new JButton("Run");
		button.setFont(new Font("OPEN SANS", Font.PLAIN, 35));

		panels[0]= new PlotPanel(dot);
		panels[1] = new PlotPanel(sqr);
		panels[2] = new PlotPanel(bar);

        rndNum = new RandomNumbers();
        for(PlotPanel panel : panels)
            rndNum.addObserver(panel);

		add(plot);
		add(buttonPanel,BorderLayout.SOUTH);
        for(int i=2; i>=0; i--)
            plot.add(panels[i]);

		buttonPanel.add(button);
		button.addActionListener(this);
    }

    /**
     * This is an overridden method to define what should the Main class do
     * when the button is clicked.
     * The method will call the setNumber method of RandomNumbers 
     * to generate the random number.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        rndNum.setNumber();
		repaint();
    }
}