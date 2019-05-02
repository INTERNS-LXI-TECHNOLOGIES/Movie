package com.lxisoft.film;
import com.lxisoft.scriptwriter.ScriptWriter;
import com.lxisoft.scene.Scene;
import java.util.*;
public class FilmScript{
	
private String name;
Director director;
ScriptWriter scriptwriter;
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
	scriptwriter = new ScriptWriter("Ayana");
	System.out.println(scriptwriter);

	return scriptwriter;
}
 
}