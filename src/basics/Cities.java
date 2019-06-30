package basics;

public class Cities {
    public static void main(String[] args) {
        //Declare and define an array
        String[] cities = {"New York", "Philadelphia", "Miami", "Los Angeles"};

        //Declare an array
        String[] countries;

        //Define the array
        countries = new String[3];
        countries[0] = "USA";
        countries[1] = "Mexico";
        countries[2] = "Canada";

        //Declare & define the array (only size)
        String[] states = new String[5];
        states[0] = "New York";
        states[1] = "Pennsylvania";
        states[2] = "Florida";
        states[3] = "California";
        states[4] = "Maryland";



        //Do Loop: enters the loop THEN tests condition
        int i = 0;
        do{
            System.out.println("STATE: " + states[i]);

            i = i + 1;
        } while (i < 5);

        //While Loop: tests condition first the enters loop
        int c = 0;
        boolean stateFound = false;
        while(!stateFound){
            String state = states[c];
            System.out.println(state);
            if(state == "California"){
                System.out.println("STATE FOUND!");
                stateFound = true;
            }
            c++;
        }

        //For Loop: best structure for iterating through an array
        for(int x = 0; x < 5; x++){
            System.out.println(states[x]);
        }

    }


}
