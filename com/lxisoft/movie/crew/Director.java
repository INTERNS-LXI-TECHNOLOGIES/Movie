package com.lxisoft.movie.crew;
import com.lxisoft.movie.script.*;
import com.lxisoft.movie.dialogue.*;
import java.util.*;
import java.io.*;


public class Director
{
	Hero hero =new Hero();
 	Heroine heroine =new Heroine();
  	Villain villain =new Villain();
 	Comedian comedian =new Comedian();
 	Script script=new Script();
	Scanner Scan=new Scanner(System.in);
	private String directorName="Rafi";
	String actorName;
	String characterName;
	ArrayList <String> dialog=new ArrayList <String> ();
	Scanner scan=new Scanner(System.in);
	Random Random=new Random();
	public String getDirectorName()
	{
		return directorName;
	}
	public void movieType()
	{
		System.out.println("Your Movie Type");
		System.out.println("1.Romantic\n2.Action\n3.Comic");
		System.out.print("Select your choice:");
		int choice=Scan.nextInt();
		System.out.println("Film Name :"+script.getFilmName());
		System.out.println("Directoe Name :"+getDirectorName());
		System.out.println("Script WritterName :"+script.getWritterName());
		casting();
		//script.createDialogue(choice);
		dialogueDeliver(choice);
	}

 public void casting()
   {
	    String heroNameList []={"Mohanlal","Mammotty","Prithiraj","Dileep","Tovino"};
	    actorName=(heroNameList[new Random().nextInt(heroNameList.length)]);
	    hero.setActorName(actorName);

	    String heroineNameList []={"Anu Sithara","Manju Varrier","Nazriya"};
	    actorName=(heroineNameList[new Random().nextInt(heroineNameList.length)]);
	    heroine.setActorName(actorName);

	    String comedianNameList []={"Jagathy","SalimKumar","Indranse","Harisree"};
	    actorName=(comedianNameList[new Random().nextInt(comedianNameList.length)]);
	    comedian.setActorName(actorName);

	    String villainNameList []={"Devan","Murali","Prakash Raj"};
	    actorName=(villainNameList[new Random().nextInt(villainNameList.length)]);
	    villain.setActorName(actorName);

	    String hcNameList []={"Mohan","Sagar"};
	    characterName=(hcNameList[new Random().nextInt(hcNameList.length)]);
	    hero.setCharacterName(characterName);

	    String heNameList []={"Indhu","Priya"};
	    characterName=(heNameList[new Random().nextInt(heNameList.length)]);
	    heroine.setCharacterName(characterName);

	    String cNameList []={"Pappi","Dude"};
	    characterName=(cNameList[new Random().nextInt(cNameList.length)]);
	    comedian.setCharacterName(characterName);

	    String vNameList []={"Shankar","Hyna"};
	    characterName=(vNameList[new Random().nextInt(vNameList.length)]);
	    villain.setCharacterName(characterName);


	    System.out.println("Staring\n\tHero:"+hero.getActorName()+" As "+hero.getCharacterName()+"\n\tHeroine:"+heroine.getActorName()+" As "+heroine.getCharacterName()+"\n\tVillain:"+villain.getActorName()+" As "+villain.getCharacterName()+"\n\tComedian:"+comedian.getActorName()+" As "+comedian.getCharacterName());
    }
 	public void dialogueDeliver(int choice)
	{
	try
	{
		FileWriter fw=new FileWriter("prop.properties",true);
		FileReader fr=new FileReader("prop.properties");
		Properties p=new Properties();
		p.load(fr);
		if (choice==1||choice==2||choice==3)
		{
			File file=new File("file"+choice);
       		FileReader fR=new FileReader(file);
            BufferedReader bR=new BufferedReader(fR);
   	        String line;
   	        int i=0;
   	        Actor actor=new Actor();
			Dialogue dialogue= new Dialogue();
   	          
    		while ((line=bR.readLine())!=null)
    		{
    			dialog.add(line);
    			line=dialog.get(Random.nextInt(dialog.size()));
    		      					
        			String charList[]={"Hero","Comedian","Heroine","Villain"};
        			String character=(charList[new Random().nextInt(charList.length)]);
        			String name=null;
        			if(character.equals("Hero"))
                	{
                	  name=hero.getCharacterName();
                	}
                	else if(character.equals("Heroine"))
                	{
                	  name=heroine.getCharacterName();
                	}
                	else if(character.equals("Villain"))
                	{
                  	name=villain.getCharacterName();
                	}
                	else
                	{
                  	name=comedian.getCharacterName();
                	}
                
                	System.out.println("\n"+name+":"+line);
                	i++;
			}
			fw.close();
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}
	catch(FileNotFoundException e)
        {
        	e.printStackTrace();
        }
        catch(IOException e)
         {
    		e.printStackTrace();
         }
     
 }


}