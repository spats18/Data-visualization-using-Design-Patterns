package src;

import java.awt.*;
import java.util.*;
import java.util.List;

abstract class CommonPlot {
    protected List<Integer> rndNum  = new ArrayList<>(25);

    public void setNumber(int num){
        Evaluator.mean *= rndNum.size();
		if(rndNum.size() == 25){
            Evaluator.mean -= rndNum.remove(0);
		}
		rndNum.add(num);
        Evaluator.mean += num;
        Evaluator.mean /= rndNum.size();
	}
    public void operation(Graphics graphic){

    };
}
