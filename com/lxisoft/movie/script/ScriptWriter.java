package com.lxisoft.movie.script;
import com.lxisoft.movie.crew.*;
import com.lxisoft.movie.dialogue.*;
import java.util.*;
import java.io.*;

public class ScriptWriter
{
	Hero hero =new Hero();
 	Heroine heroine =new Heroine();
  	Villain villain =new Villain();
 	Comedian comedian =new Comedian();
 	Actor actor=new Actor();
 	ArrayList <Dialogue> dialog=new ArrayList <Dialogue> ();
 	ArrayList < Song > musiq = new ArrayList <Song> ();
 	ArrayList <String> mp=new ArrayList<String>();
	ArrayList <String> dial=new ArrayList <String> ();
	Scanner scan=new Scanner(System.in);
	Random Random=new Random();
	Director director=new Director();

	private String scriptWriterName;
	public void setScriptWritername(String scriptWriterName)
	{
		this.scriptWriterName=scriptWriterName;
	}
	public String getScriptWriterName()
	{ 
		return scriptWriterName;
	}
	
	public void scriptCasting()
	{
		director.casting();
	}
	public void dialogueFile(int choice)throws Exception
	{
		//director.casting();
		try
		{
			FileWriter fw=new FileWriter("prop.properties",true);
			FileReader fr=new FileReader("prop.properties");
			Properties p=new Properties();
			p.load(fr);
			if (choice==1||choice==2||choice==3||choice==4||choice==5)
			{

				String c="Scene"+choice;
				System.out.println("\n\t"+c);
						String fileName=p.getProperty(c);
						File file=new File(fileName);
						dialogueDeliver(dialog,file);
			}
			else if(choice==6)
			{
				String s="Scene"+"song";
				System.out.println("\n"+s);
				String fileName=p.getProperty(s);
				File file=new File(fileName);
				song(musiq,file);
			}
			else if (choice==7)
			{
				for(int k=1;k<=5;k++)
				{
					String S="Scene"+k;
					System.out.println("\n \t"+S);
					String fileName=p.getProperty(S);
					//System.out.println(fileName);
					File file=new File(fileName);
					dialogueDeliver(dialog,file);
					//song(musiq,file);

				}
				String s="Scene"+"song";
				System.out.println("\n"+s);
				String fileName=p.getProperty(s);
				File file=new File(fileName);
				song(musiq,file);
				
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
  	public void dialogueDeliver(ArrayList <Dialogue> dialog,File file)throws Exception
	{
			FileWriter fw=new FileWriter(file,true);
       		FileReader fR=new FileReader(file);
            BufferedReader bR=new BufferedReader(fR);
   	        String line;
   	        int i=0;
   	        Actor actor=new Actor();
   	        
   	       // ArrayList<String> list=new ArrayList<String>();
			//Dialogue dialogue= new Dialogue();
   	       // director.casting();
    		while ((line=bR.readLine())!=null)
    		{
    			dial.add(line);
    			
    			//line=dial.get(Random.nextInt(dial.size()));
    		     // line=Collections.shuffle(dial, new Random(1));					
        		/*	String charList[]={"Hero","Comedian","Heroine","Villain"};
        			String character=(charList[new Random().nextInt(charList.length)]);
        			String name=null;
        			if(character.equals("Hero"))
                	{
                	  name=actor.getCharacterName();
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
                	}*/

              /*  int h= Random.nextInt(director.getList().size());
               //	System.out.println(director.getList().get(h));
                
                Collections.shuffle(dial);
                int k=Random.nextInt(dial.size());
                System.out.println("\n"+director.getList().get(h)+"\t:"+dial.get(k));
                dial.remove(k);*/
               	i++;
			}
			for(int y=0;y<=dial.size();y++)
			{
			 int h= Random.nextInt(director.getList().size());
              // System.out.println(director.getList().get(h));
                
                Collections.shuffle(dial);
                int k=Random.nextInt(dial.size());
                System.out.println("\n"+director.getList().get(h)+"\t:"+dial.get(k));
                Thread.sleep(750);
                dial.remove(k);
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

	public void song(ArrayList <Song> musiq,File file)throws Exception
	{
		
		FileWriter fw=new FileWriter(file,true);
       	FileReader fR=new FileReader(file);
        BufferedReader bR=new BufferedReader(fR);
   	    String line;
		int l=0;
		while((line=bR.readLine())!=null)
		{
			mp.add(line);
			l++;
		}
		for(int q=1;q<=mp.size();q++)
		{
			System.out.println("\n    \t"+mp.get(q-1));
			Thread.sleep(700);	
			mp.remove(q-1);
			q=0;
		}
		
	}
}

