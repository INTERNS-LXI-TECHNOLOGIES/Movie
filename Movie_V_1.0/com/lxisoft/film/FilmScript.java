package com.lxisoft.film;
import com.lxisoft.scriptwriter.ScriptWriter;
import com.lxisoft.scene.Scene;
import com.lxisoft.dialogue.Dialogue;
import java.util.*;
import java.io.*;
public class FilmScript{
	
private String name;
Director director;
ScriptWriter scriptwriter;
//public File file = null;
public ArrayList<Dialogue> dialogues = new ArrayList<Dialogue>();
private ArrayList<Scene>scenes;


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
	  
    public void creatingDialogue(){
     
    try{
    	String fileName=null;
    File file=new File("Dialogue.properties");  
      
    Properties p=new Properties();  
    p.load(new FileInputStream(file));   
    String dia=p.getProperty("file");
     File log=new File(dia);
     FileReader fR=new FileReader("file");
  	 BufferedReader bR=new BufferedReader(fR);
  	 String data;
  	 int count=0;
  	 dialogues.add(new Dialogue());
  	 dialogues.get(0).setComedy(new String[5]);
  	 while((data = bR.readLine())!= null){
  	 	dialogues.get(0).getComedy();
  	 	 System.out.println(data);
  	 	 System.out.println(dialogues.get(0).getComedy());
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