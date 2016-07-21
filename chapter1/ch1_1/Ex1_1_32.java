package chapter1.ch1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdStats;

public class Ex1_1_32 {
    public static void histogram(double[] values, int n, double l, double r)
    {
        int[] counts = new int[n];
        
        for (int i = 0; i < values.length; i++)
        {
            int k = getInterval(values[i], n, l, r);
            if (k >= 0)
                counts[k]++;
        }
        
        int maxCount = StdStats.max(counts);
        
        StdDraw.setCanvasSize(512, 256);
        StdDraw.setXscale(l, r);
        StdDraw.setYscale(0, maxCount);
        
        double w = (r - l) / n;
        
        for (int i = 0; i < n; i++)
        {
            double x = l + (i + 0.5) * w,
                   y = counts[i] / 2.0,
                   rw = 0.5 * w,
                   rh = counts[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
    
    private static int getInterval(double v, int n, double l, double r)
    {
        if (v < l || v >= r)
            return -1;
        else
            return (int)(n * (v - l) / (r - l));
    }
    
    public static void main(String[] args)
    {
        int n = 10;
        double l = 0.0, r = 10.0;
        
        double[] values = {0.2,1.3,2.4,3.5,4.2,5.7,6.7,6.5,7.2,8.3,9.2,4.7,2.8};
        
        histogram(values, n, l, r);
    }
}
