package src;

/**
 * The class RandomNumbers is an Observable class to be observed by
 * PlotPanel class. 
 * It is inheriting the Observable class.
 * It will generate Random Numbers for the PlotPanel to plot.
 */
class RandomNumbers extends Observable{
    private int number;

    /**
     * The setNumber will generate a random number and will 
     * notify its observers.
     */
    public void setNumber() {
        this.number =  (int) (Math.random() * 200) + 1;
        super.notifying();
    }

    /**
     * getNumber method will return the random number generated.
     * @return the random number generated.
     */
    public int getNumber() {
        return number;
    }
}
