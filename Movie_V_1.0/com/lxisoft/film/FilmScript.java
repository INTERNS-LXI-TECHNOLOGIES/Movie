package com.lxisoft.film;
import com.lxisoft.scriptwriter.ScriptWriter;
import com.lxisoft.scene.Scene;
import com.lxisoft.dialogue.Dialogue;
import com.lxisoft.cast.*;
import java.util.*;
import java.io.*;
public class FilmScript{


public static final String filmName="Sasanthosham Kumaran";

private String name;
Director director;

ScriptWriter scriptwriter;
//public File file = null;
//public ArrayList<Dialogue> dialogues;
private ArrayList<Scene> scenes;
public ArrayList<Actor> roles;
static Scanner in=new Scanner(System.in);

public void setScenes(ArrayList<Scene> scenes){
	this.scenes=scenes;
} 
public ArrayList<Scene> getScenes(){
	return scenes;
}
public Director createDirector(){
	director = new Director("Fazil");
	//System.out.println(director);

	return director;
}
public ScriptWriter createScriptwriter(){
	scriptwriter = new ScriptWriter("Aravind");
	//System.out.println(scriptwriter.getName());

	return scriptwriter;
}
public void setFilm(){
  System.out.println("                      "+"moviename :"+filmName);
  System.out.println("directorname:" +director.getName());
  System.out.println("scriptwriter:" +scriptwriter.getName());
}


//public ArrayList<Actor> actors = new ArrayList<Actor>();
public ArrayList<Actor> comedians=new ArrayList<Actor>();
public ArrayList<Actor> villains=new ArrayList<Actor>();
public ArrayList<Actor> mainActors=new ArrayList<Actor>();

public void display(){
 System.out.println("1.Play Movie\n2.Edit\n3.Exit");
 System.out.println("Enter your choice");
 int a= in.nextInt();
 if(a==1){
  createDirector();
  createScriptwriter();
  setFilm();
  setMainActors();
  villain();
  comedian();
  setScene();
 }
 if(a==2){
   setNewCharectors();
 }
 if(a==3){
  exit();
 }
}

public void setNewCharectors(){
  System.out.println("to add new charector choose the role");
  System.out.println("1.villain\n2.comedian\n3.mainActor");
  int a = in.nextInt();
    if(a==1){
     // Actor actor=new Actor();
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the actor name ");
      String name=in.next();
      //actor.setName(name);
      
      System.out.println("Enter the charector name ");
      String charector=in.next();
      
      //actor.setCharectorName(charector);
      getNewVillain(name,charector);
      display();
      //villains.add(actor);
    }
    else if(a==2){
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the actor name ");
      String name=in.next();
      //actor.setName(name);
      
      System.out.println("Enter the charector name ");
      String charector=in.next();
      getNewComedian(name,charector);
      display();
    }
  }

public void getNewVillain(String name,String charector){
  try{
    int count=count();

      //FileReader reader=new FileReader("villain.properties");
      Properties p=new Properties();
      //p.load(reader);

      p.setProperty("name"+(count/4),name);
      p.setProperty("charector"+(count/4),charector);
      p.store(new FileWriter("Villain.properties",true)," ");
      System.out.println("new charecter added");
      System.out.print("negative actors : ");
      System.out.print(p.getProperty("name"+(count/4)));
      System.out.print("\t\tcharector name : ");
      System.out.print(p.getProperty("charector"+(count/4)));
      System.out.println("\n");
      display();

  
 //for(int i=0;i<villains.size();i++){
 
  //System.out.println("negative actors:"+villains.get(i).getName()+"\t\tcharactor name:"+villains.get(i).getCharectorName());
  //}
}
catch(FileNotFoundException e){

}
catch(IOException e){

}
}

public void villain(){
  try{
      int count=count();
      FileReader reader=new FileReader("Villain.properties");  
      
      Properties p=new Properties();  
      p.load(reader);
      for(int i=0;i<(count/4);i++){
        Villain villain=new Villain();
        villain.setName(p.getProperty("name"+i));
        villain.setCharectorName(p.getProperty("charector"+i));
        villains.add(villain);
      }
      for(int i=count;i>=4;i=i-4){
      System.out.print("negative actors : ");
      System.out.print(p.getProperty("name"+((i/4)-1)));
      System.out.print("\t\tcharector name : ");
      System.out.println(p.getProperty("charector"+((i/4)-1)));

    }
}
catch(FileNotFoundException e){

}
catch(IOException e){

}
}
public int count()
  {
    int count=0;
  try{  
    FileReader reader=new FileReader(new File("villain.properties"));  
         
     BufferedReader bR=new BufferedReader(reader);
     String data;   
  
    while(bR.readLine()!= null)
    { 
      count++;
        }
    }
    catch(IOException e){

    } 
    return count;

}
public void getNewComedian(String name,String charector){
  try{
      int count1=count1();
      //FileReader reader=new FileReader("db.properties");
      Properties p=new Properties();
      //p.load(reader);
      p.setProperty("name"+(count1/4),name);
      p.setProperty("charector"+(count1/4),charector);
      p.store(new FileWriter("comedian.properties",true)," ");
      System.out.println("new charecter added");
      System.out.print("comic  actors : ");
      System.out.print(p.getProperty("name"+(count1/4)));
      System.out.print("\t\tcharector name : ");
      System.out.print(p.getProperty("charector"+(count1/4)));
      display();
    }
catch(FileNotFoundException e){

}
catch(IOException e){

}
}
public void comedian(){
  try{

      int count1=count1();
      FileReader reader=new FileReader("comedian.properties");  
      
      Properties p=new Properties();  
      p.load(reader);
      for(int i=0;i<(count1/4);i++){
        Comedian comedian=new Comedian();
        comedian.setName(p.getProperty("name"+i));
        comedian.setCharectorName(p.getProperty("charector"+i));
        comedians.add(comedian);
      }
      for(int i=count1;i>=4;i=i-4){
      System.out.print("comic  actors : ");
      System.out.print(p.getProperty("name"+((i/4)-1)));
      System.out.print("\t\tcharector name : ");
      System.out.println(p.getProperty("charector"+((i/4)-1)));
    }
}
catch(FileNotFoundException e){

}
catch(IOException e){

}
}

public int count1()
  {
    int count1=0;
  try{  
    FileReader reader=new FileReader(new File("comedian.properties"));  
         
     BufferedReader bR=new BufferedReader(reader);
     String data;   
  
    while(bR.readLine()!= null)
    { 
      count1++;
        }
    }
    catch(IOException e){

    } 
    return count1;
  }



public void setMainActors(){
  System.out.println("*****************************");
  createMainActor(new Hero(),"Nivin Pauly","Nivin");
  createMainActor(new Heroine(),"Nazriya","Nimmi");
    
    System.out.println("Hero   :"+mainActors.get(0).getName()+"   \t\tcharactor name:"+mainActors.get(0).getCharectorName());
    System.out.println("Heroine:"+mainActors.get(1).getName()+"   \t\tcharactor name:"+mainActors.get(1).getCharectorName());

}
public void createMainActor(Actor mainActor,String name,String charector){
  Actor main=new Hero();
  main.setName(name);
  main.setCharectorName(charector);
  mainActors.add(main);
}
 public void setScene()
    {
      System.out.println("*****************************");
      System.out.println("                            scene 1                        ");

      try{
        int count=count();
     File file=new File("Comedy.csv");
  
     FileReader f=new FileReader(file);
     BufferedReader b=new BufferedReader(f);
     
     String data;
     ArrayList<Dialogue> comedyDialogues=new ArrayList <Dialogue>();
     while((data = b.readLine())!= null){
       Dialogue d=new Dialogue();
       d.setDialogue(data);
       comedyDialogues.add(d);

       //System.out.println(actors.size());
       //System.out.println("************************************");
      
     
       //System.out.println(data);
       count++;
     }
     //Collections.shuffle(comedians);
     for(int i=0;i<2;i++){
     //for(int k=(int)(Math.random()*3);k<comedians.size();k++){
      Collections.shuffle(comedyDialogues);
      Collections.shuffle(comedians);
       // System.out.println(comedy.size());
      //int j=(int)(Math.random()*4);
      System.out.println( comedians.get(i).getCharectorName()+":"+comedyDialogues.get(i).getDialogue());
      //System.out.println(comedyDialogues.get(j).getDialogue());
      
    // }
   }

     //}

     //System.out.println(count);
    }
    catch(FileNotFoundException e){

    }
    catch(IOException e){

    }
      System.out.println("*****************************");
      System.out.println("                            scene 2                        ");

      try{
        int count=0;
        File file=new File("Romance.csv");
  
        FileReader f=new FileReader(file);
        BufferedReader b=new BufferedReader(f);
     
        String data;
        ArrayList<Dialogue> romanticDialogues=new ArrayList <Dialogue>();
        while((data = b.readLine())!= null){
        Dialogue d1=new Dialogue();
        d1.setRomantic(data);
        romanticDialogues.add(d1);
        count++;
        }
        for(int i=0;i<2;i++){
        //for(int k=0;k<mainActors.size();k++){
        Collections.shuffle(romanticDialogues);
        Collections.shuffle(mainActors);
        int j=(int)(Math.random()*2);
        System.out.println( mainActors.get(j).getCharectorName()+":"+romanticDialogues.get(i).getRomantic());
     

      }
    }
    catch(FileNotFoundException e){

    }
    catch(IOException e){

    }
      System.out.println("*****************************");
      System.out.println("                            scene 3                        ");
      System.out.println("(nayika on the way to meet nayakan)");
      System.out.println("\t(nayakan waiting for nayika at the park)");
      try{
        //int count=0;
        File file=new File("song.csv");
  
        FileReader f=new FileReader(file);
        BufferedReader b=new BufferedReader(f);
     
        String data;
        //ArrayList<Dialogue> villainDialogues=new ArrayList <Dialogue>();
        while((data = b.readLine())!= null){
        System.out.println(data);
        //count++;
    
    }
  }

    catch(FileNotFoundException e){

    }
    catch(IOException e){

    } 
      System.out.println("*****************************");
      System.out.println("                            scene 4                        ");
     try{
        int count=0;
        File file=new File("Action.csv");
  
        FileReader f=new FileReader(file);
        BufferedReader b=new BufferedReader(f);
     
        String data;
        ArrayList<Dialogue> villainDialogues=new ArrayList <Dialogue>();
        while((data = b.readLine())!= null){
        Dialogue  d2=new Dialogue();
        d2.setAction(data);
        villainDialogues.add(d2);
        count++;
        }
        for(int k=0;k<villainDialogues.size();k++){
        //for(int k=0;k<villains.size();k++){                                                                
        int j=(int)(Math.random()*villains.size());
        int i=(int)(Math.random()*villainDialogues.size());
        if(i!=i+1 && j!=j+1){
        Collections.shuffle(villains);
        Collections.shuffle(villainDialogues);

        System.out.println(villains.get(j).getCharectorName()+":"+villainDialogues.get(i).getAction());
        //System.out.println(villainDialogues.get(j).getAction());
        i++;
        j++;
        }

      }
        System.out.println("\n                          The End..........                 ");
    }

    catch(FileNotFoundException e){

    }
    catch(IOException e){

    }
    display(); 

  }
  public void exit(){
    System.out.println("Thank you.....");
  }
   


}