import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Datum> iris = new ArrayList<>();

        //adding dataset
                iris.add(new Datum(5.1,3.5,1.4,0.2,0));
        iris.add(new Datum(4.9,3.0,1.4,0.2,0));
        iris.add(new Datum(4.7,3.2,1.3,0.2,0));
        iris.add(new Datum(4.6,3.1,1.5,0.2,0));
        iris.add(new Datum(5.0,3.6,1.4,0.2,0));
        iris.add(new Datum(5.4,3.9,1.7,0.4,0));
        iris.add(new Datum(4.6,3.4,1.4,0.3,0));
        iris.add(new Datum(5.0,3.4,1.5,0.2,0));
        iris.add(new Datum(4.4,2.9,1.4,0.2,0));
        iris.add(new Datum(4.9,3.1,1.5,0.1,0));
        iris.add(new Datum(5.4,3.7,1.5,0.2,0));
        iris.add(new Datum(4.8,3.4,1.6,0.2,0));
        iris.add(new Datum(4.8,3.0,1.4,0.1,0));
        iris.add(new Datum(4.3,3.0,1.1,0.1,0));
        iris.add(new Datum(5.8,4.0,1.2,0.2,0));
        iris.add(new Datum(5.7,4.4,1.5,0.4,0));
        iris.add(new Datum(5.4,3.9,1.3,0.4,0));
        iris.add(new Datum(5.1,3.5,1.4,0.3,0));
        iris.add(new Datum(5.7,3.8,1.7,0.3,0));
        iris.add(new Datum(5.1,3.8,1.5,0.3,0));
        iris.add(new Datum(5.4,3.4,1.7,0.2,0));
        iris.add(new Datum(5.1,3.7,1.5,0.4,0));
        iris.add(new Datum(4.6,3.6,1.0,0.2,0));
        iris.add(new Datum(5.1,3.3,1.7,0.5,0));
        iris.add(new Datum(4.8,3.4,1.9,0.2,0));
        iris.add(new Datum(5.0,3.0,1.6,0.2,0));
        iris.add(new Datum(5.0,3.4,1.6,0.4,0));
        iris.add(new Datum(5.2,3.5,1.5,0.2,0));
        iris.add(new Datum(5.2,3.4,1.4,0.2,0));
        iris.add(new Datum(4.7,3.2,1.6,0.2,0));
        iris.add(new Datum(4.8,3.1,1.6,0.2,0));
        iris.add(new Datum(5.4,3.4,1.5,0.4,0));
        iris.add(new Datum(5.2,4.1,1.5,0.1,0));
        iris.add(new Datum(5.5,4.2,1.4,0.2,0));
        iris.add(new Datum(4.9,3.1,1.5,0.1,0));
        iris.add(new Datum(5.0,3.2,1.2,0.2,0));
        iris.add(new Datum(5.5,3.5,1.3,0.2,0));
        iris.add(new Datum(4.9,3.1,1.5,0.1,0));
        iris.add(new Datum(4.4,3.0,1.3,0.2,0));
        iris.add(new Datum(5.1,3.4,1.5,0.2,0));
        iris.add(new Datum(5.0,3.5,1.3,0.3,0));
        iris.add(new Datum(4.5,2.3,1.3,0.3,0));
        iris.add(new Datum(4.4,3.2,1.3,0.2,0));
        iris.add(new Datum(5.0,3.5,1.6,0.6,0));
        iris.add(new Datum(5.1,3.8,1.9,0.4,0));
        iris.add(new Datum(4.8,3.0,1.4,0.3,0));
        iris.add(new Datum(5.1,3.8,1.6,0.2,0));
        iris.add(new Datum(4.6,3.2,1.4,0.2,0));
        iris.add(new Datum(5.3,3.7,1.5,0.2,0));
        iris.add(new Datum(5.0,3.3,1.4,0.2,0));
        iris.add(new Datum(7.0,3.2,4.7,1.4,1));
        iris.add(new Datum(6.4,3.2,4.5,1.5,1));
        iris.add(new Datum(6.9,3.1,4.9,1.5,1));
        iris.add(new Datum(5.5,2.3,4.0,1.3,1));
        iris.add(new Datum(6.5,2.8,4.6,1.5,1));
        iris.add(new Datum(5.7,2.8,4.5,1.3,1));
        iris.add(new Datum(6.3,3.3,4.7,1.6,1));
        iris.add(new Datum(4.9,2.4,3.3,1.0,1));
        iris.add(new Datum(6.6,2.9,4.6,1.3,1));
        iris.add(new Datum(5.2,2.7,3.9,1.4,1));
        iris.add(new Datum(5.0,2.0,3.5,1.0,1));
        iris.add(new Datum(5.9,3.0,4.2,1.5,1));
        iris.add(new Datum(6.0,2.2,4.0,1.0,1));
        iris.add(new Datum(6.1,2.9,4.7,1.4,1));
        iris.add(new Datum(5.6,2.9,3.6,1.3,1));
        iris.add(new Datum(6.7,3.1,4.4,1.4,1));
        iris.add(new Datum(5.6,3.0,4.5,1.5,1));
        iris.add(new Datum(5.8,2.7,4.1,1.0,1));
        iris.add(new Datum(6.2,2.2,4.5,1.5,1));
        iris.add(new Datum(5.6,2.5,3.9,1.1,1));
        iris.add(new Datum(5.9,3.2,4.8,1.8,1));
        iris.add(new Datum(6.1,2.8,4.0,1.3,1));
        iris.add(new Datum(6.3,2.5,4.9,1.5,1));
        iris.add(new Datum(6.1,2.8,4.7,1.2,1));
        iris.add(new Datum(6.4,2.9,4.3,1.3,1));
        iris.add(new Datum(6.6,3.0,4.4,1.4,1));
        iris.add(new Datum(6.8,2.8,4.8,1.4,1));
        iris.add(new Datum(6.7,3.0,5.0,1.7,1));
        iris.add(new Datum(6.0,2.9,4.5,1.5,1));
        iris.add(new Datum(5.7,2.6,3.5,1.0,1));
        iris.add(new Datum(5.5,2.4,3.8,1.1,1));
        iris.add(new Datum(5.5,2.4,3.7,1.0,1));
        iris.add(new Datum(5.8,2.7,3.9,1.2,1));
        iris.add(new Datum(6.0,2.7,5.1,1.6,1));
        iris.add(new Datum(5.4,3.0,4.5,1.5,1));
        iris.add(new Datum(6.0,3.4,4.5,1.6,1));
        iris.add(new Datum(6.7,3.1,4.7,1.5,1));
        iris.add(new Datum(6.3,2.3,4.4,1.3,1));
        iris.add(new Datum(5.6,3.0,4.1,1.3,1));
        iris.add(new Datum(5.5,2.5,4.0,1.3,1));
        iris.add(new Datum(5.5,2.6,4.4,1.2,1));
        iris.add(new Datum(6.1,3.0,4.6,1.4,1));
        iris.add(new Datum(5.8,2.6,4.0,1.2,1));
        iris.add(new Datum(5.0,2.3,3.3,1.0,1));
        iris.add(new Datum(5.6,2.7,4.2,1.3,1));
        iris.add(new Datum(5.7,3.0,4.2,1.2,1));
        iris.add(new Datum(5.7,2.9,4.2,1.3,1));
        iris.add(new Datum(6.2,2.9,4.3,1.3,1));
        iris.add(new Datum(5.1,2.5,3.0,1.1,1));
        iris.add(new Datum(5.7,2.8,4.1,1.3,1));


        stochasticGradientDescent(iris);
    }



    public static void stochasticGradientDescent(ArrayList<Datum> array) {
        double teta1    = 0.1;
        double teta2    = 0.2;
        double teta3    = 0.3;
        double teta4    = 0.4;
        double bias     = 0.5;
        double euler        = 2.7182818;
        double learningRate = 0.1;

        double h;
        double sigmoid;
        int prediksi;
        double error = 0;
        double deltaTeta;
        DecimalFormat df = new DecimalFormat("#.########");

        for(int j=0; j<60; j++) {
            System.out.println("\nEpoch " + (j+1) + ":");
            System.out.println("No\tError");
            System.out.println("==================");

            for(int i=0; i<array.size(); i++) {
                h = (teta1 * array.get(i).getX1())
                        + (teta2 * array.get(i).getX2())
                        + (teta3 * array.get(i).getX3())
                        + (teta4 * array.get(i).getX4())
                        + bias
                ;

                sigmoid = 1/(1+Math.pow(euler,-1*h));

                if(sigmoid > 0.5) {
                    prediksi = 1;
                } else {prediksi = 0;}


                deltaTeta = 2 * (sigmoid - array.get(i).getTheClass())
                        * (1 - sigmoid) * sigmoid * array.get(i).getX1()
                ;
                teta1 = teta1 - (learningRate * deltaTeta);


                deltaTeta = 2 * (sigmoid - array.get(i).getTheClass())
                        * (1 - sigmoid) * sigmoid * array.get(i).getX2()
                ;
                teta2 = teta2 - (learningRate * deltaTeta);


                deltaTeta = 2 * (sigmoid - array.get(i).getTheClass())
                        * (1 - sigmoid) * sigmoid * array.get(i).getX3()
                ;
                teta3 = teta3 - (learningRate * deltaTeta);


                deltaTeta = 2 * (sigmoid - array.get(i).getTheClass())
                        * (1 - sigmoid) * sigmoid * array.get(i).getX4()
                ;
                teta4 = teta4 - (learningRate * deltaTeta);


                deltaTeta = 2 * (sigmoid - array.get(i).getTheClass())
                        * (1 - sigmoid) * sigmoid
                ;
                bias = bias - (learningRate * deltaTeta);

                error = (prediksi - sigmoid) * (prediksi - sigmoid);

//                System.out.println((i+1) + "\t" + df.format(error));
            }
            System.out.println(df.format(error));

        }


    }
}
