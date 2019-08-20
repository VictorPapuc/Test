package javatest.functionality.variables;

public class Operators {


    public void operators() {

        int r = 2;
        int f = 6;

        // + operator

        int sum = r + f;

        // - operator

        sum = r - f;

        // * operator

        sum = r * f;

        // / operator - div ;

        sum = r / f;

        // modulus operator
        sum = r % f;


        // boolean operator |

        if (r == 2 | f == 4) {
            sum = r - 2;
            f--;
        } else if (r == 4 && f == 2) {
            r++;
        }
    }
}
