import java.util.Scanner;

public class group {

    public static void main(String[] args) {

        short numA, numB;
        numA = 69;
        numB = -33;

        System.out.println("The biggest number is");
        System.out.println(Math.max(numA,numB));

        System.out.println("The smallest number is");
        System.out.println(Math.min(numA,numB));

      if (numA == numB){
          System.out.println("numbers are equal");
      } else {
          System.out.println("numbers are not equal");
      }

      if (numA % 2 == 0 || numB % 2 ==0) {
          System.out.println("even number");
      } else {
          System.out.println("At least one of them are not even");
      }

      if (numA < 0 || numB < 0) {
          System.out.println("at least one of them is negative");
      } else {
          System.out.println("At least one of them is not negative");
      }

        if (numA > 0 || numB > 0) {
            System.out.println("at least one of them is positive");
        } else {
            System.out.println("At least one of them is not positive");
        }

        if (numA < 100 || numB < 100) {
            System.out.println("at least one of the numbers is smaller than hundred");
        } else {
            System.out.println("at least one of the numbers is bigger than hundred");
        }

        System.out.println(Math.round(numA + numB));

        System.out.println(Math.round(numA / numB * 100 )/100 );


    }

    }



