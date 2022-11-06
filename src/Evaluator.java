package src;

class Evaluator{
private static Evaluator eval;
    static double mean = 0;
    private Evaluator(){
    }

    public static Evaluator getEval(){
        if(eval ==null)
            eval = new Evaluator();
        return eval;
    }
    public double getMean(){
        return mean;
    }
}
