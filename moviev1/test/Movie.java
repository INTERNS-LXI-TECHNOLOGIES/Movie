package com.lxisoft.moviev1.test;
import java.util.Scanner;
public class Movie
{
	Scanner scan=new Scanner(System.in);
	private MovieScript ms;
	public void setMs(MovieScript ms)
	{
		this.ms=ms;
	}
	public MovieScript getMs()
	{
		return ms;
	}
	public Movie()
	{
		ms=new MovieScript();
	}
	public void doMovie()
	{
		do
		{
		System.out.println("1.Edit Script\n2.Play Script");
		switch(scan.nextInt())
		{
			case 1:
			do{
			System.out.println("1.Add characters\n2.Cast \n3.Add scene");
			switch(scan.nextInt())
			{
				case 1://ms.scriptDetails();
				ms.characterDetails();
				break;
				case 2:
				ms.castDetails();
				break;
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