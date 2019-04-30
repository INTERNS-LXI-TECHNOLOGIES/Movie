package com.lxisoft.movie.crew;
import java.util.List;

public class Scene
{

	private int number;
	private List<Action> actionList;
	private String type;
	
	public void setNumber(int number) 
	{
		this.number = number;
	}
	public int getNumber()
	{
		return number;
	}
	
	public void setActionList(List<Action> actionList) 
	{
		this.actionList = actionList;
	}
	public List<Action> getActionList() 
	{
		return actionList;
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
	public String getType() 
	{
		return type;
	}

} 