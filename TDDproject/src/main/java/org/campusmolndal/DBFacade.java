package org.campusmolndal;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class DBFacade {
SQLite sqlite;
DBCRUD dbCRUD;
Connection conn;


    public DBFacade(String dbName) {
        sqlite = new SQLite(dbName);
        dbCRUD = new DBCRUD(sqlite);
    }

    public Connection connectDB(){
        return sqlite.connection();
    }

    public Map<Todo, User> showALLTODOList(){
        Map<Todo, User> allTodoList ;
        allTodoList =dbCRUD.showALLTodo(DBQuery.showALLData());

        return allTodoList;
    }

    public void showALLTODO(Map<Todo, User> allTodoList){
        if(allTodoList.isEmpty()){
            Text.noDataFound();
        }else{allTodoList.forEach((todo,user)->{
            showResult(user,todo);
        });
        }

    }



    public Map<Integer, Todo> showOnlyDescription(){

        Map<Integer, Todo> allDescription;
        allDescription=dbCRUD.showTodo(DBQuery.showAllTODO());
        allDescription.forEach((id,todo)->{
            System.out.println("   | " + id + ": " + todo.getText() + " |");
            System.out.println("------------------------------");
        });

        return allDescription;
    }

    public void showONETODO (int id){

        Map<Todo, User> allTodoList ;
        allTodoList =dbCRUD.showALLTodo(DBQuery.showONETODO(id));
        allTodoList.forEach((todo,user)->{
            showResult(user,todo);
        });

    }

    public void showSingleUser(int id){

        Map<Integer, User> userList ;
        User user =dbCRUD.showSingleUser(DBQuery.showSingleUser(id));

        userList =dbCRUD.showUsers(DBQuery.showSingleUser(id));
        userList.forEach((key,todo)->{
           try{
             showSingleResult(todo);
           }catch (Exception e){
               showSingleResultNull(user);
           }
        });

    }


    public Map<Integer, User> showUsersList(){
        Map<Integer, User> userList = dbCRUD.showALLUser(DBQuery.showOnlyUsers());
         return userList;
    }

    public void showAllUsers(Map<Integer, User> userList ){
        userList.forEach((id,user)->{
            System.out.print("   | " + id + ": " + user.getName());
            System.out.println("  Age :"+ user.getAge() +" |");
            System.out.println("--------------------------------");
        });
    }



    public void updateString (String table,String colum,int id,String description)  {
        try{
            dbCRUD.updateDataString( DBQuery.updateTODOTable(table,colum,id),description);
            }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void updateInt (String table,String colum,int id,int StatusNo)  {
        try{
            dbCRUD.updateDataInt( DBQuery.updateTODOTable(table,colum,id),StatusNo);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public void addTODO(String value1,int value2){

        dbCRUD.addData(DBQuery.addDataToTODO(),value1,value2);

    }

    public void addUser(String name,int age){
        dbCRUD.addData(DBQuery.addDataToUser(),name,age);

    }

    public void deleteData(String table,int id){

        dbCRUD.deleteData(DBQuery.deleteData(table),id);

    }


    public void showResult(User user,Todo todo){
        if (user.getName() == null) {
            System.out.println( todo.toString() + " User: Not Registered");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println(todo.toString() + " " + user.toString());
            System.out.println("-----------------------------------------");
        }
    }

    public void showSingleResult(User user){

            ArrayList<Todo> todoList =user.getTodos();
            for(Todo mission:todoList){
                System.out.println("Progress: "+mission.getDone());
                System.out.println("Todo :" + mission.getText());
            }
            System.out.println("-----------------------------------------");
    }

    public void showSingleResultNull(User user){
        System.out.println( user.toString() + " Todo: No Assigment");
        System.out.println("-----------------------------------------");
    }
}
