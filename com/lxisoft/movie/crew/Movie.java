package com.lxisoft.movies.crew;
import java.util.*;

public class Movie 
{
	
	private String name;
	private Director director;
	private ScriptWriter scriptWriter;
	private List<Actor> actorList;
	private Script script;
	
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	public void setDirector(Director director) 
	{
		this.director = director;
	}
	public Director getDirector() 
	{
		return director;
	}
	public void setScriptWriter(ScriptWriter scriptWriter) 
	{
		this.scriptWriter = scriptWriter;
	}
	public ScriptWriter getScriptWriter() 
	{
		return scriptWriter;
	}
	public void setActorList(List<Actor> actorList) 
	{
		this.actorList = actorList;
	}
	public List<Actor> getActorList() 
	{
		return actorList;
	}
	public void setScript(Script script) 
	{
		this.script = script;
	}
	public Script getScript() {
		return script;
	}
	
}