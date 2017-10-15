import java.util.Scanner;

public class WrapperDemo {

    public static void main(String args[]) {

        Wrapper wrapper = new Wrapper();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence to be cut: ");
        String input = sc.nextLine();

        System.out.println("Enter the column limit for this sentence: ");
        int column = sc.nextInt();

        String output = wrapper.wrap(input, column);
        System.out.println(output);

    }

}
