import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String color = "";
        String pastTenseVerb = "";
        String adjective = "";
        String noun = "";



        System.out.print("The " + color + " dragon " + pastTenseVerb + " at the " + adjective);
        System.out.println(" knight, who rode in on a sturdy, giant " + noun + ".");
        scan.close();
    }
}
