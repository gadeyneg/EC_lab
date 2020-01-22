package lab2;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();

        int crosspoint = random.nextInt(p1.length-1);

        double[] c1 = Arrays.copyOf(p1, p1.length);
        double[] c2 = Arrays.copyOf(p2, p2.length);

        for(int k = crosspoint; k < p1.length; k++){
            c1[k] = p2[k];
            c2[k] = p1[k];
        }

        children.add(c1);
        children.add(c2);
        // your implementation:
        return children;
    }
}
