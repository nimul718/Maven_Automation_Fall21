package ActionItem;

public class ActionItem_2a {

    public static void main(String[] args) {
        //create a dynamic array for 4 different States, iterate through the values but only print when
        //state is either California or New York
        String[] states = new String[4];
        states[0] = "New York";
        states[1] = "California";
        states[2] = "Ohio";
        states[3] = "Georgia";

        for (int i = 0; i < states.length; i++) {

            //two if conditions
            if (states[i] == "California") {
                System.out.println("State is " + states[i]);
            } else if (states[i] == "New York") {
                System.out.println("State is " + states[i]);
            }//end of conditions

        }//end of for loop

    }//end of main method

}//end of java class
