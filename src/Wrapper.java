import java.util.Arrays;

public class Wrapper {

    public String wrap(String sentence, int colNum) {

        // Input the string into a StringBuilder for later one.
        StringBuilder splitSentence = new StringBuilder(sentence);

        // Creating a string for the output.
        String output;

        // This is to create a fixed column length.
        int fixedCol = colNum + 1;


        // Checks to see if the sentence number exceeds the column length.
        if ( sentence.length() > colNum ) {

            // A for loop that goes through the whole StringBuilder string.
            for (int i = 0; i <= splitSentence.length(); i++) {

                // Checks to see if the colNum never exceeds the sentence length.
                if ( colNum < splitSentence.length()) {

                    // Checks the index to see if it is at the column limit.
                    if (i == colNum) {

                        // If it is split the string at the colNum with a break line.
                        splitSentence.insert(colNum, "\n");

                        // Then add the fixedCol number to colNum to find the next index to cut at.
                        colNum += fixedCol;

                    }

                    // If it doesn't for fill the if then it'll continue the loop till it does and then fails all the if
                    // statements.

                }

            }

            // Convert the StringBuilder back into the string.
            output = splitSentence.toString();

            // Returns the string to WrapperDemo to be displayed.
            return output;

        // If the first condition isnt met go to this else statement.
        } else {

            // This string is returned when the sentence does not need to be cut and just returns the sentence.
            return sentence;
        }

    }

}
