
package com.lxisoft.film;
import com.lxisoft.scriptwriter.Script;
import com.lxisoft.cast.Cast;

public class Film{

public static final String filmName="Manichitrathazhu";
	public void displaymovie(){
	FilmScript filmscript=new FilmScript();
	System.out.println("             "+"moviename :"+filmName);
	System.out.println("directorname:"+filmscript.createDirector().getName());
	System.out.println("scriptwriter:"+filmscript.createScriptwriter().getName());
	
	Cast cast=new Cast();
	cast.setDetails();
	FilmScript s = new FilmScript();
	s.createDialogue();
    
	//System.out.println(s.scenes.get(0).getSceneNumber());

	



}	
}
