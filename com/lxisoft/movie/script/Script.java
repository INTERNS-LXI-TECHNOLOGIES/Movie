package com.lxisoft.movie.script;
import com.lxisoft.movie.crew.*;
import com.lxisoft.movie.dialogue.*;
import java.util.*;
import java.io.*;

public class Script
{
	//private List<Scene> sceneList;
	private Dialogue dialogue;
	private List<Actor>actorList;
	public static final String filmName="ABCD";
	
	/*public void setSceneList(List<Scene> sceneList)
	{
		this.sceneList=sceneList;
	}
	public List<Scene> getSceneList()
	{
		return sceneList;
	}*/

	public void createCast(Actor actor, String actorName, String characterName)
	{
		Actor act=new Actor();
		act.setActorName(actorName);
		act.setCharacterName(characterName);
        System.out.println("\n"+"\t"+"* "+act.getActorName()+" As "+act.getCharacterName());
	}
	public void setActor()
	{
		System.out.println("\n\tFilm Name      "+filmName);
		createCast(new Hero(),"Mammootty","Joseph");
		createCast(new Heroine(),"Sobhana","Anuradha");
		createCast(new Villain(),"Murali","Jayakrishnan");
		createCast(new Villain(),"Devan","Shankar");
		createCast(new Comedian(),"Harisree Ashokan","Kunjachan");
		createCast(new Comedian(),"Suraj Venjaramoodu","Pappi");
	}


}