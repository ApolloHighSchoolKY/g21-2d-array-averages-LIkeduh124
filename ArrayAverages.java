import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    double sum = 0;

    for(int row = 0; row<ray.length; row++)
    {
      sum = 0;
      for(int col = 0; col<ray[row].length; col++)
      {
        sum += ray[row][col];
      }
      sum /= ray[row].length;
      System.out.println("The average of row " + row + " is " + sum);
    }
  }

  public void columnAverages(){
    //Column major order
    //   Take each column and go through all of the rows
    //   Top down and Left to Right

    double sum = 0;
    int height = ray[0].length;
    for(int col = 0; col<height; col++)
    {
      sum = 0;
      for(int row = 0; row<ray.length; row++)
      {
        sum += ray[row][col];
      }
      sum /= height;
      System.out.println("The average of Column " + col+ " is " + sum);
    }
  }

  public void arrayAverage(){
    double sum = 0;

    for(int row = 0; row<ray.length; row++)
    {
      for(int col = 0; col<ray[row].length; col++)
      {
        sum += ray[row][col];
      }
    }

    sum /= (ray.length * ray[0].length);

    System.out.println("The average of the array is " + sum);
    

  }


  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
