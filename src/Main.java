import generator.ProblemGenerator;
import generator.ResultsGenerator;

import java.util.List;

public class Main {
    static public void main(String[] args){
        ResultsGenerator rg = new ResultsGenerator();
        rg.nbrExec = 100;
        List<Double> result = rg.computeResults(false);
        for (int j = 0; j<90 ; j+=10){
            for(int i = 0; i<10; i++){
                System.out.print(result.get(i+j) + "    ");
            }
            System.out.println();
        }
    }
}
