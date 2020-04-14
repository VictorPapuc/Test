package calculator;

public class Main {

    public static void main(String[] args) {


//
//        MathEquation testEquation = new MathEquation();
//        testEquation.execute();
//        System.out.println("test =");
//        System.out.println(testEquation.getResult());


        MathEquation[] mathEquations = new MathEquation[4];
        mathEquations[0] = new MathEquation('d', 100.0d, 50.0d);
        mathEquations[1] = new MathEquation('a', 25.0d, 92.0d);
        mathEquations[2] = new MathEquation('s', 225.0d, 17.0d);
        mathEquations[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation : mathEquations) {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }
    }


//    public static MathEquation create(double leftVal, double rightVal, char oPcode) {
//
////        MathEquation equation = new MathEquation();
////        equation.setLeftVal(leftVal);
////        equation.setRightVal(rightVal);
////        equation.setOpCode(oPcode);
////
////        return equation;
////
////    }

}
