import java.io.*;
import java.util.*;
class ScriptWriter{
  private String script="script.txt";
  private String scriptName="ABCD";
  
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
	

   public void script()
   {
   	 //String script=getScript();
	 
   	try
	 {
       File file=new File(script);
       FileReader fR=new FileReader(file);
      
  	   BufferedReader bR=new BufferedReader(fR);
  	   
  	   String line;
      
  	   while((line=bR.readLine())!=null)
  	    {
  	    String[] split = line.split(":");  
  	       
       

       if(split[0].equals("Hero")){
       	    FileWriter fW = new FileWriter("HeroDialogue.csv",true);
       	    BufferedWriter bW=new BufferedWriter(fW);
  	    	bW.write(split[1]+"\n");
  	    	bW.close();
             
  	    }
  	    else if(split[0].equals("Heroine"))
  	    {
  	    	FileWriter fW = new FileWriter("HeroineDialogue.csv",true);
       	    BufferedWriter bW=new BufferedWriter(fW);
  	    	bW.write(split[1]+"\n");
  	    	bW.close();
  	    }
  	    else if(split[0].equals("Villain"))
  	    {
  	    	FileWriter fW = new FileWriter("VillainDialogue.csv",true);
       	    BufferedWriter bW=new BufferedWriter(fW);
  	    	bW.write(split[1]+"\n");
  	    	bW.close();
  	    }
  	    else
  	    {
  	    	FileWriter fW = new FileWriter("ComedianDialogue.csv",true);
       	    BufferedWriter bW=new BufferedWriter(fW);
  	    	bW.write(split[1]+"\n");
  	    	bW.close();
  	    }
  	   
        }
     
    
      
	 }
	 catch(IOException ex)
	 {

	 }
   }
    
    
}