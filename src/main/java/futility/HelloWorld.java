package futility;

import static java.lang.System.out;

public class HelloWorld {
  
  public void printHi() {
    out.println("Hello There!");
  }

  public void printFun() {
    if(Math.random() < 0.25) {
      out.println("Jin is dumb");
    } else if(Math.random() < .50) {
      out.println("Pratham X Pelican = Prathelican for life");
    } else if(Math.random() < .75) {
      out.println("Spinda is the best Pokemon");
    } else {
      out.println("I am a weeb, and I declare that Naruto is the bible");
    }
  }
}

