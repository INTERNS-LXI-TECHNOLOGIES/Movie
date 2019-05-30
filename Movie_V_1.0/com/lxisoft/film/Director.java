package com.lxisoft.film;
import com.lxisoft.film.FilmScript;
import java.util.*;
import java.io.*;
public class Director{

FilmScript filmscript=new FilmScript();
static Scanner in=new Scanner(System.in);

public void display(){
 System.out.println("1.Play Movie\n2.Edit\n3.Exit");
 System.out.println("Enter your choice");
 int a= in.nextInt();
 if(a==1){
  
  filmscript.createScriptWriter();
  filmscript.setFilm();
  filmscript.setMainActors();
  filmscript.villain();
  filmscript.comedian();
  filmscript.setScene();
 }
 if(a==2){
   setNewCharectors();
 }
 if(a==3){
  filmscript.exit();
 }
}

public void setNewCharectors(){
  System.out.println("to add new charector choose the role");
  System.out.println("1.villain\n2.comedian\n3.mainActor");
  int a = in.nextInt();
    if(a==1){
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the actor name ");
      String name=in.next();
      System.out.println("Enter the charector name ");
      String charector=in.next();
      getNewVillain(name,charector);
      display();
    }
    else if(a==2){
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the actor name ");
      String name=in.next();
      System.out.println("Enter the charector name ");
      String charector=in.next();
      getNewComedian(name,charector);
      display();
    }
  }

public void getNewVillain(String name,String charector){
  try{
    int count=filmscript.count();

      Properties p=new Properties();

      p.setProperty("name"+(count/4),name);
      p.setProperty("charector"+(count/4),charector);
      p.store(new FileWriter("Villain.properties",true)," ");
      System.out.println("new charecter added");
      System.out.print("negative actors : ");
      System.out.print(p.getProperty("name"+(count/4)));
      System.out.print("\t\tcharector name : ");
      System.out.print(p.getProperty("charector"+(count/4)));
      System.out.println("\n");
      display();
}
catch(FileNotFoundException e){

}
catch(IOException e){

}
}
public void getNewComedian(String name,String charector){
  try{
      int count1=filmscript.count1();
      Properties p=new Properties();
      p.setProperty("name"+(count1/4),name);
      p.setProperty("charector"+(count1/4),charector);
      p.store(new FileWriter("comedian.properties",true)," ");
      System.out.println("new charecter added");
      System.out.print("comic  actors : ");
      System.out.print(p.getProperty("name"+(count1/4)));
      System.out.print("\t\tcharector name : ");
      System.out.print(p.getProperty("charector"+(count1/4)));
      
      display();
    }
catch(FileNotFoundException e){

}
catch(IOException e){ 

}
}



}