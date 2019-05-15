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
			do{
			System.out.println("1.Add characters\n2.Cast \n3.Crew\n4.Add scene");
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
				/*case 3:
				System.out.println("Select crew\n1.Singers");
					switch(scan.nextInt())
					{
						case 1:
						ms.selectSinger();
						
						break;
						default:System.out.println("Wrong choice");
						break;
					}
				break;*/
				case 3:
				ms.createScenes();
				break;
				default:System.out.println("Wrong choice");
				break;
			}
			System.out.println("To Select again press 1");
			}while(scan.nextInt()==1);
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