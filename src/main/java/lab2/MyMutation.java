package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!

        // your implementation:
        double mutation_rate = 0.2;
        int dimension = population.get(0).length;

        for (double[] ind: population
             ) {
            if(random.nextDouble() < mutation_rate){
                for(int i = 0; i < dimension-1; i++){
                    if(random.nextDouble()< -0.45/100*dimension + 0.5){
                        // we modifie in average one value when dimension = 2 and 5 when dimension = 100
                        ind[i] = random.nextDouble()*10-5;
                    }
                }
            }
        }
        System.out.println("success");
        //result population
        return population;
    }
}
