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
 	//Script script=new Script();
 	//ScriptWriter writer=new ScriptWriter();

	//Scanner Scan=new Scanner(System.in);
	private String directorName="RAFI";
	String actorName;
	String characterName;

	ArrayList <Dialogue> dialog=new ArrayList <Dialogue> ();
	ArrayList <String> dial=new ArrayList <String> ();
	ArrayList <String> actorList= new ArrayList <String>();
	
	Random Random=new Random();
	public String getDirectorName()
	{
		return directorName;
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
	    actorList.add(characterName);

	    String heNameList []={"Indhu","Priya"};
	    characterName=(heNameList[new Random().nextInt(heNameList.length)]);
	    heroine.setCharacterName(characterName);
	    actorList.add(characterName);

	    String cNameList []={"Pappi","Dude"};
	    characterName=(cNameList[new Random().nextInt(cNameList.length)]);
	    comedian.setCharacterName(characterName);
	    actorList.add(characterName);

	    String vNameList []={"Shankar","Hyna"};
	    characterName=(vNameList[new Random().nextInt(vNameList.length)]);
	    villain.setCharacterName(characterName);
	    actorList.add(characterName);


	    System.out.println("Staring\n\tHero    :\t"+hero.getActorName()+" As "+hero.getCharacterName()+"\n\tHeroine :\t"+heroine.getActorName()+" As "+heroine.getCharacterName()+"\n\tVillain :\t"+villain.getActorName()+" As "+villain.getCharacterName()+"\n\tComedian:\t"+comedian.getActorName()+" As "+comedian.getCharacterName());
    	
    }
    public ArrayList<String> getList()
    {
    	return actorList;
    }

 	/*public void dialogueFile(int choice)throws Exception
	{
		//try
		//{
			FileWriter fw=new FileWriter("prop.properties",true);
			FileReader fr=new FileReader("prop.properties");
			Properties p=new Properties();
			p.load(fr);
			if (choice==1||choice==2||choice==3)
			{

				String c="file"+choice;
						String fileName=p.getProperty(c);
						File file=new File(fileName);
						dialogueDeliver(dialog,file);
			}
			else if (choice==4)
			{
				for(int k=1;k<=3;k++)
				{
					String S="file"+k;
					String fileName=p.getProperty(S);
					File file=new File(fileName);
					dialogueDeliver(dialog,file);
				}
			}
			else
				{
					System.out.println("Invalid Choice");
				}
		/*}
		catch(FileNotFoundException e)
    	    {
        		e.printStackTrace();
        	}
        	catch(IOException e)
         	{
    			e.printStackTrace();
         	}*/
 /*   }
  	public void dialogueDeliver(ArrayList <Dialogue> dialog,File file)throws Exception
	{
			FileWriter fw=new FileWriter(file,true);
       		FileReader fR=new FileReader(file);
            BufferedReader bR=new BufferedReader(fR);
   	        String line;
   	        int i=0;
   	        Actor actor=new Actor();
			//Dialogue dialogue= new Dialogue();
   	          
    		while ((line=bR.readLine())!=null)
    		{
    			dial.add(line);
    			//line=dial.get(Random.nextInt(dial.size()));
    		     // line=Collections.shuffle(dial, new Random(1));					
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
                  Collections.shuffle(dial);
                 // line=dial.get(i);
                  int k=Random.nextInt(dial.size());
                  System.out.println("\n "+name+"\t:"+dial.get(k));
                  dial.remove(k);
                //	System.out.println("\n"+name+":"+line);
                	i++;
			}
			//fw.close();
		}
		/*else

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
     
 }*/


}