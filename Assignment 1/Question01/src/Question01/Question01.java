package Question01;

public class Question01 {
  
  public static void main(String[] args){
    if args.length < 2 {
      System.out.println("Missing required arguments: a, b");
      System.exit(1);
    }
    
    for(int i = 0; i < args.length; i++){
      
      if(i >= 3){
        System.out.println("unrecognised argument: " + args[i]);
        System.exit(1);
      }
      
      switch(args[i]){
        case "--number-of-rectangles":
        case "-n":

      }

    }
  }

  public static double approximateArea(double a, double b, int numberOfRectangles){
    double rectangleWidth = a/numberOfRectangles;
    double rectangleAreaSum = 0;
    for(double i = a; i > 0; i -= rectangleWidth){
      rectangleAreaSum += rectangleWidth * get_y_coordinate(a, b, i);
    }
    return rectangleAreaSum * 4;
  }

  public static double approximateArea(double a, double b){
    int numberOfRectangles = 10000000;
    double rectangleWidth = a/numberOfRectangles;
    double rectangleAreaSum = 0;
    for(double i = a; i > 0; i -= rectangleWidth){
      rectangleAreaSum += rectangleWidth * get_y_coordinate(a, b, i);
    }
    return rectangleAreaSum * 4;
  }

  private static double get_y_coordinate(double a, double b, double x){
    return Math.sqrt(
        Math.pow(b, 2) - Math.pow(b * x / a, 2)
        );
  }
}
