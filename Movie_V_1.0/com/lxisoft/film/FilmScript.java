package com.lxisoft.film;
import com.lxisoft.scriptwriter.ScriptWriter;
import com.lxisoft.scene.Scene;
import com.lxisoft.dialogue.Dialogue;
import java.util.*;
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
     FileReader fR=new FileReader(file);
     BufferedReader bR=new BufferedReader(fR);
       
     String data;
     while((data = bR.readLine())!=null){
   			String[] split = data.split(",");
   			Dialogue dialogue = new Dialogue();
   			int i=0;
   			dialogue.setDialogue(split[i]);
   			dialogues.add(dialogue);
   		 }
      }
      catch(FileNotFoundException e){}
      catch(IOException e){}
      
	 }
   public void gettingDialogue(int selectedScene){
      Properties p = new Properties();
      try{
      p.load(new FileReader("Dialogue.properties"));
      }
      catch(Exception e){
      }
      file = new File(p.getProperty("filename"+seletedScene));
   }
 
}//sanjana achu anjana baby