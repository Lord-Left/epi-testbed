/* a DP exponentation calculator. very space intensive! */ 

public class pow {

    public static void main(String[] args) {

        System.out.println(myPow(2, -5));
        System.out.println(myPow(2,2147483647));
    }

    public static double myPow(double x, int n) {

        // if(n < 0) {
        //     // handle negative values here
        //     x = 1/x;
        //     n = n * -1;
        // }
        
        // double[] arr = new double[n+1];
        // return powHelp(arr, x, n);
        return powHelp(x, n);

    }

//     public double powHelp(double x, int m) {
//         double temp=x;
//         if(m==0)
//         return 1;
//         temp=powHelp(x,m/2);
//         if(m%2==0)
//         return temp*temp;
//         else 
//         {
//         if(m > 0)
//             return x*temp*temp;
//         else
//             return (temp*temp)/x;
//         }
      
// }

    public static double powHelp(double base, int exp) {
        
        if(exp == 0) {
            return 1;
        } else if (exp == 1) {
            return base;
        }
       
        if(exp % 2 == 0) {
            double temp = powHelp(base, exp/2);
            return temp * temp;
        } else {

            if(exp > 0) {
            double temp = powHelp(base, (exp-1) / 2);
            return base * temp * temp;
            } else {
                int temp = exp * -1;
                return powHelp((1/base), temp); 
            }
        }
        
    }

    // public static double powHelp(double[] a, double base, int exp) {

    //     if (exp == 0) {
    //         a[0] = 0;
    //         return a[0];
    //     } else if (exp == 1) {
    //         a[1] = base;
    //         return a[1];
    //     } else if (a[exp] == 0) {
    //         a[exp] = (base * powHelp(a, base, exp-1));
    //         return a[exp];
    //     } else {
    //         return a[exp];
    //     }

    // } 

    // public static double powHelp(double base, int exp) {

        // if(exp == 0) {
        //     return 0;
        // } else if (exp == 1) {
        //     return base;
        // } else {
        //     return base * powHelp(base, exp-1);
        // }

        // if (exp == 0) {
        //     return 0;
        // } else {
            
        //     double tmp = base;

        //     for(int i = 1; i <= exp; i++) {
        //         base *= tmp;
        //     }
        // }

        // return base;

        
    // }
}