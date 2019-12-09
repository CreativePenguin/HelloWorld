package futility;

import static java.lang.System.out;

/**
 * This class will print out various secret messages. OOOOOooohhhh.
 * You can use basic formatting in javadocs like <b>bold</b>, <i>italics</i> and <u>underline</u>
 * Fun fact, I made this whole thing in 20 mins, in the middle of econ class.
 */
public class HelloWorld {

    /**
     * This prints stuff
     *
     * @param input - prints out whatever you put here
     * @return - It returns zero just cause... idk, I just wanted to show that this was a thing
     */
    public int printHi(String input) {
        out.println(input);
        return 0;
    }

    /**
     * This will print out a secret message. OooooOOooh
     */
    public void printFun() {
        if (Math.random() < 0.25) {
            out.println("Jin is dumb");
        } else if (Math.random() < .50) {
            out.println("Pratham X Pelican = Prathelican for life");
        } else if (Math.random() < .75) {
            out.println("Spinda is the best Pokemon");
        } else {
            out.println("I am a weeb, and I declare that Naruto is the bible");
        }
    }
}

