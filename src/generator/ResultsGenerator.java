package generator;

import algos.Algo1;
import algos.Algo2;
import algos.Algos;

import java.util.ArrayList;
import java.util.List;

public class ResultsGenerator {

    public int nbrExec = 1000;
    Algos a;
    private boolean algoChoice;
    public ResultsGenerator(){}

    /**
     *
     * @param algo choose algo1 if true else algo2
     * @return
     */
    public List<Double> computeResults(boolean algo){
        algoChoice = algo;
        List<Double> table = new ArrayList<>();
        for(int p = 2; p <= 10; p++){
            for (int t = 10; t <= 100; t+=10){
                table.add(computeCase(p,t));
            }
        }
        return table;
    }

    public double computeCase(int p, int t){
        double moy = 0;
        List<Double> valuesFound = new ArrayList<>();
        for (int i =0; i<nbrExec; i++){
            ProblemGenerator pbg = new ProblemGenerator(100,p,t);
            if(algoChoice){
                a = new Algo1(pbg);
            }else{
                a = new Algo2(pbg);
            }
            a.computeSolution();
            valuesFound.add((double)a.getNbrLinks());
        }
        for (double value : valuesFound){
            moy += value;
        }
        moy /= valuesFound.size();
        return moy;
    }
}
