package Question01;

public class Question01 {
  
  public static void main(String[] args){
    System.out.println(approximateArea(1, 1));
  }
  
  /**
   *Approximates area of an elipses defined by x**2/a**2 + y**2/b = 1
   * @param a 
   * @param b
   * @param numberOfRectangles The higher the number, the more precise
   */
  public static double approximateArea(double a, double b, int numberOfRectangles){
    double rectangleWidth = a/numberOfRectangles;
    double rectangleAreaSum = 0;
    for(double i = a; i > 0; i -= rectangleWidth){
      rectangleAreaSum += rectangleWidth * get_y_coordinate(a, b, i);
    }
    return rectangleAreaSum * 4;
  }

  public static double approximateArea(double a, double b){
    int numberOfRectangles = 1_000_000;
    double rectangleWidth = a/numberOfRectangles;
    double rectangleAreaSum = 0;
    for(double i = a; i > 0; i -= rectangleWidth){
      rectangleAreaSum += rectangleWidth * get_y_coordinate(a, b, i);
    }
    return rectangleAreaSum * 4;
  }

  /**
   * Returns the y-coordinate of an x value on a radii of an
   * elipses defined by the equation x**2/a**2 + b**2/y**2 = 1
   * @param a double = the length of a radius
   * @param b double = the length of a radius
   * @return double
  */
  private static double get_y_coordinate(double a, double b, double x){
    return Math.sqrt(
        Math.pow(b, 2) - Math.pow(b * x / a, 2)
        );
  }
}
