import java.io.*;
import java.util.*;
class ScriptWriter{
  private String script="script.txt";
  private String scriptName="ABCD";
  ArrayList<String> heroDialogue=new ArrayList<String>();
	 ArrayList<String> heroineDialogue=new ArrayList<String>();
	 ArrayList<String> villainDialogue=new ArrayList<String>();
	  ArrayList<String> comedianDialogue=new ArrayList<String>();
   String name="S";
   public String getName()
   {
	return this.name;
   }
	public String getScriptName()
	{
      return this.scriptName;
	}
	public String getScript()
	{
		return this.script;
	}
	 public ArrayList<String> getHeroDialogue()
   {
	return this.heroDialogue;
   }
   public ArrayList<String> getHeroineDialogue()
   {
	return this.heroineDialogue;
   }

   public void script()
   {
   	 //String script=getScript();
	 
   	try
	 {
       File file=new File(script);
       FileReader fR=new FileReader(file);
       FileWriter fileWriter = new FileWriter("blueprint.txt");
  	   BufferedReader bR=new BufferedReader(fR);
  	   BufferedWriter bW=new BufferedWriter(fileWriter);
  	   String line;
      
  	   while((line=bR.readLine())!=null)
  	    {
  	    String[] split = line.split(":");  
  	       
       

       if(split[0].equals("Hero")){
  	    	//System.out.println(split1[1]);System.out.println("**"+Arrays.toString(split1));
  	    	heroDialogue.add(split[1]);
  	    	bW.write("Hero\n");
             
  	    }
  	    else if(split[0].equals("Heroine"))
  	    {
  	    	heroineDialogue.add(split[1]);
  	    	bW.write("Heroine\n");
  	    	//System.out.println(split1[1]);
  	    }
  	    else if(split[0].equals("Villain"))
  	    {
  	    	villainDialogue.add(split[1]);
  	    	//System.out.println(split1[1]);
  	    }
  	    else 
  	    {
  	    	comedianDialogue.add(split[1]);
  	    	//System.out.println(split1[1]);
  	    }
        }
     bW.close();
     
      
	 }
	 catch(IOException ex)
	 {

	 }
      

	
   }

}