package com.lxisoft.film;
import com.lxisoft.scriptwriter.Script;
public class Film{

public static final String filmName="Manichitrathazhu";
	public void displaymovie(){
	FilmScript filmscript=new FilmScript();
	System.out.println("moviename :"+filmName);
	System.out.println("directorname:"+filmscript.createDirector().getName());
	System.out.println("scriptwriter:"+filmscript.createScriptwriter().getName());
	Script s = new Script();
	s.creatingScene();
	System.out.println(s.scenes.get(0).getSceneName());

	



}	
}
