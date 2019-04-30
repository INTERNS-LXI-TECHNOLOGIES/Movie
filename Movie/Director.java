import java.io.*;
class Director{
   String name="D";
   public String getName()
   {
	return this.name;
   }
   public void casting()
   {
   	 ScriptWriter scriptWriter=new ScriptWriter();
	 String script=scriptWriter.getScript();
	 try
	 {
       File file=new File(script);
       FileReader fR=new FileReader(file);
  	   BufferedReader bR=new BufferedReader(fR);
  	   String line;
  	   String[] split1=null;
       String[] split2=null;
  	   while((line=bR.readLine())!=null)
  	   {
  	    split1 = line.split(",");
  	    if(split1[0].equals("aaa")){
  	    	System.out.println(split1[1]);
  	    }
  	    else if(split1[0].equals("sss"))
  	    {
  	    	System.out.println(split1[1]);
  	    }
  	}
         for(int i=0;i<split1.length;i++){
  	    split2 = split1[i].split("#");
        }
        for(int i=0;i<split2.length;i++){System.out.println(split2[i]);}
	 }
	 catch(IOException ex)
	 {

	 }
   }
	
}