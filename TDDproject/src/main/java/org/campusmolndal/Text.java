package org.campusmolndal;

public class Text {


        public static void mainMenu (){
            System.out.println("Please Enter Number");
            System.out.println("1:Show data");
            System.out.println("2:Add data");
            System.out.println("3:Update data");
            System.out.println("4:Delete Data");
            System.out.println("5: Close program");
        }

        public static void showDataMenu(){
            System.out.println("Please Enter Choice");
            System.out.println("1:Show ALL TODO List");
            System.out.println("2:Show a TODO List");
            System.out.println("3:Show ALL Users");
            System.out.println("4:Show a user");
            System.out.println("5:Go back to Main Menu");
        }

        public static void addDataMenu(){
            System.out.println("Please Enter Choice");
            System.out.println("1:Add a TODO List");
            System.out.println("2:Add a user");
            System.out.println("3:Go back to Main Menu");
        }

        public static void updateDataMenu(){
            System.out.println("Please Enter Choice");
            System.out.println("1:Update a TODO List");
            System.out.println("2:Update a user");
            System.out.println("3:Go back to Main Menu");
        }

        public static void updateTODOList(){
            System.out.println("Please Enter Choice");
            System.out.println("1:update Description");
            System.out.println("2:update status");
            System.out.println("3:update assignedTo");
            System.out.println("4:Go back to Main Menu");
        }

        public static void updateUser(){
            System.out.println("Please Enter Choice");
            System.out.println("1:update Name");
            System.out.println("2:Update Age");
            System.out.println("3:Go back to Main Menu");
        }

         public static void deleteDataMenu(){
            System.out.println("Please Enter Choice");
            System.out.println("1:Delete a TODO");
            System.out.println("2:Delete a user");
             System.out.println("3:Go back to Main Menu");
        }

        public static void showData(String description,String progress,String status,String user,int age){
            System.out.println("Description: "+ description);
            System.out.println("Progress: " +progress);
            System.out.println("Status: "+status);
            System.out.println("Name: "+ user + " Age: "+ age);
            System.out.println();

        }

        public static void whichDescripion(){
            System.out.println("Which TODO details do you want to check?");
        }
        public static void choseTodo(){
            System.out.println("Chose ToDO");
        }
        public static void noDataFound(){
            System.out.println("Data not Found");
        }

        public static void inputNumber(){
            System.out.println("Please input Number");
        }

        public static void choseUser(){
            System.out.println("Chose User");
        }
        public static void choseName(){
            System.out.println("Who do you want to assign to TODO?");
            System.out.println("");
        }

        public static void inputName(){
        System.out.println("Enter Name");
        }
        public static void inputNewName(){
        System.out.println("Enter New Name");
    }
        public static void inputNewAge(){
            System.out.println("Enter New Age");
        }

        public static void inputAge(){
            System.out.println("Enter Age");
        }

        public static void inputTodo(){
        System.out.println("Enter Todo");
        }


        public static void wrongInput(){
            System.out.println("Wrong Input. Please Enter Again.");
        }

        public void test(){
            System.out.println("hej");
        }
        public static void statusChoice(){
            System.out.println("Enter number");
            System.out.println("1:TODO");
            System.out.println("2:DONE");
        }

}
