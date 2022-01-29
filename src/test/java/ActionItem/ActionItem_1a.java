package ActionItem;

public class ActionItem_1a {

    public static void main(String[] args) {


        //iterate through all zipcode defined by dynamic array using for loop
        String[] zipCode = new String[6];
        zipCode[0] = "11210";
        zipCode[1] = "11218";
        zipCode[2] = "11219";
        zipCode[3] = "10001";
        zipCode[4] = "18302";
        zipCode[5] = "18301";

        //declare and define the initial starting point
        int i = 0;
        //define while loop with your end point(condition)
        while(i<zipCode.length){
            System.out.println("My current zipcode is " + zipCode[i]);
            i = i+1; //if there is no incrementation, the while loop becomes infinite loop
        }//end of while loop





    }//end of main method







}//end of java class
