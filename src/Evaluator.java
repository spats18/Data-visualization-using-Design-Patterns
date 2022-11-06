package src;

/**
 * Evaluator is a Singleton class. 
 * The class will calculate and store the mean for numbers 
 * that are being plotted for that instance of time.
 */
class Evaluator{
    private static Evaluator eval;
    static double mean = 0;

    /**
     * This is the private constructor for the class.
     * The private access specifier will make sure that no more than 1 instance
     * for the class is formed.
     */
    private Evaluator(){
    }
    
    /**
     * The getEval method will make sure that there's only one instance for the 
     * Evaluator class.
     * @return the static instance for the Evaluator class.
     */
    public static Evaluator getEval(){
        if(eval ==null)
            eval = new Evaluator();
        return eval;
    }

    /**
     * The method will return the Current mean value for the 
     * points being plotted.
     * @return the mean value for the points.
     */
    public double getMean(){
        return mean;
    }
}
