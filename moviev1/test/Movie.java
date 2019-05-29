package com.lxisoft.moviev1.test;
import com.lxisoft.moviev1.crew.*;
import java.util.*;
public class Movie
{
	private String title;
	private String type;
	private MovieScript ms;
	private Director director;
	private ArrayList <Singer> singers;
	Scanner scan=new Scanner(System.in);
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
	public void setMs(MovieScript ms)
	{
		this.ms=ms;
	}
	public MovieScript getMs()
	{
		return ms;
	}
	public void setDirector(Director director)
	{
		this.director=director;
	}
	public Director getDirector()
	{
		return director;
	}
	public void setSingers(ArrayList <Singer> singers)
	{
		this.singers=singers;
	}
	public ArrayList <Singer> getSingers()
	{
		return singers;
	}
	public Movie()
	{
		setMs(new MovieScript());
		setDirector(new Director());
	}
	public void doMovie()throws MyException
	{
		do
		{
		System.out.println("1.Edit Script\n2.Play Script");
		switch(scan.nextInt())
		{
		case 1:
		System.out.println("1.Add\n2.Delete\n3.Update");
		switch(scan.nextInt())
		{
			case 1:
			do{
			System.out.println("1.Add characters\n2.Cast \n3.Add scene\n4.Add dialogues");
			switch(scan.nextInt())
			{
				case 1://ms.scriptDetails();
				ms.characterDetails();
				break;
				case 2:
				try
				{
				ms.castDetails();
				}
				catch(MyException m)
				{
				m.printStackTrace();
				}
				break;
				case 3:
				ms.createScenes();
				break;
				case 4:
				ms.addDialogues();
				break;
				default:System.out.println("Wrong choice");
				break;
			}
			System.out.println("To Select again press 1");
			}while(scan.nextInt()==1);
			break;
			case 2:
			System.out.println("1.Remove characters\n2.Remove Cast \n3.Remove scene\n4.Remove dialogues");
			switch(scan.nextInt())
			{
				case 1:
				ms.removeCharacters();
				break;
				case 2:
				ms.removeCasts();
				break;
				case 3:
				ms.deleteScene();
				break;
				case 4:
				ms.removeDialogues();
				break;
				default:System.out.println("Wrong choice");
				break;
			}
			break;
			case 3:
			System.out.println("1.Change characters\n2.Change Cast \n3.Change dialogues");
			switch(scan.nextInt())
			{
				case 1:
				ms.changeCharacters();
				break;
				case 2:
				ms.changeCasts();
				break;
				case 3:
				ms.changeDialogues();
				break;
				default:System.out.println("Wrong choice");
				break;
			}
			break;
			default:System.out.println("Wrong choice");
			break;
		}
		break;
		case 2:
		ms.scriptPlay(ms);
		break;
		default:System.out.println("Wrong choice");
		break;
		}
		System.out.println("To Select again press 1");
		}while(scan.nextInt()==1);
	}
	
}