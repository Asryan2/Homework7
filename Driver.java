import animals.Puppy;
import utils.ArrayUtils;
import utils.Math;;
class Driver {
  public static void main(String[] args) {
    
    Puppy puppy1 = new Puppy("Joey");

    Puppy puppy2 = new Puppy("Chandler");

    Puppy puppy3 = new Puppy("Ross");
    
    System.out.println(puppy1.getName());
    System.out.println(puppy2.getName());
    System.out.println(puppy3.getName());
    
    int[] arr = {9, 20, 3, 44, 88, 300};
    
    System.out.println(ArrayUtils.stringifyArray(ArrayUtils.reverse(arr)));
    
    double num = 15.4;
    System.out.println(Math.factorial((int)num));
  }
}