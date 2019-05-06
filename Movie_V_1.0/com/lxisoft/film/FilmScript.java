package com.lxisoft.film;
import com.lxisoft.scriptwriter.ScriptWriter;
import com.lxisoft.scene.Scene;
import com.lxisoft.dialogue.Dialogue;
import com.lxisoft.cast.*;
import java.util.*;
import java.io.*;
public class FilmScript{
	
private String name;
Director director;

ScriptWriter scriptwriter;
//public File file = null;
//public ArrayList<Dialogue> dialogues;
private ArrayList<Scene> scenes;
public ArrayList<Actor> roles;

public void setScenes(ArrayList<Scene> scenes){
	this.scenes=scenes;
} 
public ArrayList<Scene> getScenes(){
	return scenes;
}
public Director createDirector(){
	director = new Director("Fazil");
	System.out.println(director);

	return director;
}
public ScriptWriter createScriptwriter(){
	scriptwriter = new ScriptWriter("Aravind");
	System.out.println(scriptwriter);

	return scriptwriter;
}
	  public void createDialogue()
    {

      try{
        int count=0;
  File file=new File("Comedy.csv");
  File file1=new File("Action.csv");
     File file2=new File("Romance.csv");
     FileReader f=new FileReader(file);
     BufferedReader b=new BufferedReader(f);
     FileReader fr=new FileReader(file1);
     BufferedReader br=new BufferedReader(fr);
     FileReader fre=new FileReader(file2);
     BufferedReader bre=new BufferedReader(fre);
     String data;
     Cast cast=new Cast();
    ArrayList<Comedian> comedy=new ArrayList <Comedian>();
     while((data = b.readLine())!= null){
       Comedian  c=new Comedian();
       c.setName(data);
       comedy.add(c);

       //System.out.println("************************************");
      for(int k=0;k<cast.actors.size();k++){

       System.out.println(cast.actors.get(k).getCharectorName()+":"+comedy.get(k).getName());
     }
     //System.out.println(cast.actors.size());
       System.out.println(data);
       count++;
     }
     System.out.println(count);
    }
    catch(FileNotFoundException e){

    }
    catch(IOException e){

    }
       
   
}

}