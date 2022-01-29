package Day4_121221;

public class Loop_Array_Conditions {



        public static void main(String[] args) {

            //create a dynamic array for 4 different cities, iterate through the values but only print when city is
            //either brooklyn or queens

            String[] cities = new String[4];
            cities[0] = "Brooklyn";
            cities[1] = "Manhattan";
            cities[2] = "Queens";
            cities[3] = "Bronx";

            for(int i = 0; i <cities.length; i++){

                //two if conditions
                if(cities[i] == "Brooklyn"){
                    System.out.println("City is " + cities[i]);
                }else if (cities[i] == "Queens") {
                    System.out.println("City is " + cities[i]);
                }//end of conditions



            }//end of for loop

        }//end of main method





    }//end of java class






