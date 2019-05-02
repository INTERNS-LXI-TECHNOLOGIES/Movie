package com.lxisoft.movie.movieScript;
public class ScriptWriter
{
	private String name;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void scriptCalling()
	{
    Script script=new Script();
	script.sceneCalling();
    }
}	