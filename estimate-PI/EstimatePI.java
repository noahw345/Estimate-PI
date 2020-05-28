import java.lang.Math.*;

public class EstimatePI {
	public static void main(String[] args) {
		leibniz();
        System.out.println();
        double est, pError;
        for(int i = 10 ; i <= 1000000; i*=10)
        {
        	est = estimate(i);
            pError = (Math.round((Math.abs((est - Math.PI) / Math.PI)) * 10000)) / 100.0;
            System.out.println("Number of points generated: " + i);
            System.out.println("Estimation of PI: " + est);
            System.out.println("Percent Error: %" + pError + '\n');
        }
	}
	
	public static void leibniz()
    {
        double pi = 0;
        for (int i = 1; i < 1000000; i ++)
        {
            pi += (Math.pow(-1, i + 1))/(2*i - 1);
        }
        System.out.println("Leibniz Sum: " +  4* pi);
    }
    
    public static double estimate(int n)
    {
        double distance = 0;
        double x, y;
        double numCircle = 0.0;
        double numTotal = 0.0;
        for(int i = 0; i < n; i++)
        {
            x = Math.random();
            y = Math.random();
            distance = Math.pow(x, 2) + Math.pow(y, 2);
            if(distance <= 1)
            {
                numCircle++;
            }
            numTotal++;
        }
        return 4 * (numCircle / numTotal);
    } 
}
