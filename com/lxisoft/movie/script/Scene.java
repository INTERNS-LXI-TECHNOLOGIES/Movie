package com.lxisoft.movie.script;
import com.lxisoft.movie.crew.*;
import com.lxisoft.movie.dialogue.*;
import java.util.*;
import java.io.*;

public class Scene
{
	Script script=new Script();
 	ScriptWriter writer=new ScriptWriter();
 	Director director=new Director();
	Scanner Scan=new Scanner(System.in);

	public void movieScene()throws Exception
	{
		System.out.println("\n\tFilm Name     :\t"+script.getFilmName());
		System.out.print("\tDirector Name :\t"+director.getDirectorName());
		System.out.println("\n\tWriterName    :\t"+script.getWritterName());
		writer.scriptCasting();
		do{
		System.out.println("\nCategories the script as :");
		System.out.println("1. Scene1\n2. Scene2\n3. Scene3\n4. Scene4 \n5. Scene5\n6. Song Scene \n7.Full Script");
		System.out.print("\nSelect your choice:");
		int choice=Scan.nextInt();
		
		
		//script.createDialogue(choice);
		writer.dialogueFile(choice);
		System.out.print("\nDo you want to continue press 1:");
		}while(Scan.nextInt()==1);
	}
}