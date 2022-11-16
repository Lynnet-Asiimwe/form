/**
 * Students registration form
 */
package kevin;
import java.util.Scanner;

/**
 	* Asiimwe Linnet
	*2021/A/KIT/1748/G/F
	*/
class univ {
	  private int age;
	  public int getb() {
	    return age;
	  }
	  public void setb(int age) {
	    this.age = age;
	  }
	}
	class Main extends univ {
	  public static void main(String[] args) {
	    age s = new age();
	    s.setAge(2022);
	    System.out.println("\nYear of Entry " + s.getAge());
	    Scanner input = new Scanner(System.in);
	    System.out.println("\nEnter FirstName: ");
	    String myString = input.next();
	    System.out.println("\nYour Name : " + myString);
	    System.out.println("\nEnter last Name: ");
	    String yString = input.next();
	    System.out.println("\nYour last : " + yString);
	    System.out.println("\nEnter Course: ");
	    String xString = input.next();
	    System.out.println("\nYour Your Course is : " + xString);
	  }
	}


