package ActionItem;

public class ActionItem_1 {

    public static void main(String[] args) {

        //String zipcode
        String[] zipCode = new String[4];
        zipCode[0] = "11210";
        zipCode[1] = "11218";
        zipCode[2] = "18302";
        zipCode[3] = "11219";


        //integer streetNumber
        int[] streetNumber = new int[4];
        streetNumber[0] = 37;
        streetNumber[1] = 54;
        streetNumber[2] = 26;
        streetNumber[3] = 100;


        for(int i = 0; i < zipCode.length;i++){
            //print statement
            System.out.println("My zipcode is " + zipCode[i] + " and my street number is " + streetNumber[i]);

        }//end of for loop



    }//end of main method



}//end of java class
