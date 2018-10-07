package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class IntAsArrayMultiply {
  @EpiTest(testDataFile = "int_as_array_multiply.tsv")
  public static List<Integer> multiply(List<Integer> num1, List<Integer> num2) {
    // TODO - you fill in here.
    
    int a = 0;
    int b = 0;

    // Compute value of num1
    int size = num1.size() - 1;
    int exp = 0;
    for(int i = size; i >= 0; i--) {

      a += num1.get(i) * Math.pow(10, exp);
      exp++;
    }

    exp = 0;
    int size2 = num1.size() - 1;
    for(int j = size2; j >= 0; j--) {

      b += num2.get(i) * Math.pow(10, exp);
      exp++;
    }

    int total = a * b; 

    boolean reNeg = false;
    if (total < 0 ) {
      reNeg = true;
      total *= total;
    } else {
      reNeg = false; 
    }


    // decompose total
    ArrayList<Integer> dc = new ArrayList<Integer>();
    
    while(total > 0) {
      // store 
      int modAdd = Math.floorMod(total, 10);
      dc.add(0, modAdd);
      total /= 10;
    }

    // return null;
    return dc;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "IntAsArrayMultiply.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
