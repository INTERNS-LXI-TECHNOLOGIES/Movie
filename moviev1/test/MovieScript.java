package com.lxisoft.moviev1.test;
import com.lxisoft.moviev1.crew.*;
import com.lxisoft.moviev1.cast.*;
import java.util.ArrayList;
public class MovieScript
{
	private String title;
	private String type;
	private Director director;
	private ScriptWriter sw;
	private ArrayList <Character> characters;
	private Hero hero;
	private Heroine heroine;
	private Comedian comedian;
	private Villain villain;
	private ArrayList <Scene> scenes;
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}
	public void setDirector(Director director)
	{
		this.director=director;
	}
	public Director getDirector()
	{
		return director;
	}
	public void setSw(ScriptWriter sw)
	{
		this.sw=sw;
	}
	public ScriptWriter getSw()
	{
		return sw;
	}
	public void setCharacters(ArrayList <Character> characters)
	{
		this.characters=characters;
	}
	public ArrayList <Character> getCharacters()
	{
		return characters;
	}
	public void setHero(Hero hero)
	{
		this.hero=hero;
	}
	public Hero getHero()
	{
		return hero;
	}
	public void setHeroine(Heroine heroine)
	{
		this.heroine=heroine;
	}
	public Heroine getHeroine()
	{
		return heroine;
	}
	public void setComedian(Comedian comedian)
	{
		this.comedian=comedian;
	}
	public Comedian getComedian()
	{
		return comedian;
	}
	public void setVillain(Villain villain)
	{
		this.villain=villain;
	}
	public Villain getVillain()
	{
		return villain;
	}
	public void setScenes(ArrayList <Scene> scenes)
	{
		this.scenes=scenes;
	}
	public ArrayList <Scene> getScenes()
	{
		return scenes;
	}
	public MovieScript()
	{
	setDirector(new Director());
	setSw(new ScriptWriter());
	setHero(new Hero());
	setHeroine(new Heroine());
	setComedian(new Comedian());
	setVillain(new Villain());
	//setScenes(new ArrayList <Scene> scenes());
	}
	public void scriptPlay(MovieScript ms)
	{
		sw.writeScript(ms);
		System.out.print("Movie title:"+title+"\n");
		System.out.print("Director:"+director.getName()+"\n");
		System.out.print("Script Writer:"+sw.getName()+"\n");
		System.out.print("Movie type:"+type+"\n");
		System.out.println("Cast:");
		System.out.println("Charactername\t\t\t\tCastname");
		
	}
	
}