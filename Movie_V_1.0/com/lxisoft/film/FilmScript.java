package com.lxisoft.film;
import com.lxisoft.scriptwriter.ScriptWriter;
import com.lxisoft.scene.Scene;
import com.lxisoft.dialogue.Dialogue;
import com.lxisoft.cast.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.*;
import java.io.*;
public class FilmScript{

public static final String filmName="Sasanthosham Kumaran";
public static final String directorName="Arvind";
ScriptWriter scriptWriter;

private ArrayList<Scene> scenes;
public ArrayList<Actor> roles;
static Scanner in=new Scanner(System.in);

public void setScenes(ArrayList<Scene> scenes){
	this.scenes=scenes;
} 
public ArrayList<Scene> getScenes(){
	return scenes;
}
public ScriptWriter createScriptWriter(){
	scriptWriter = new ScriptWriter("Fazil");
	
	return scriptWriter;
}
public void setFilm(){
  System.out.println("                      "+"moviename :"+filmName);
  System.out.println("directorname:" +directorName);
  System.out.println("scriptwriter:" +scriptWriter.getName());
}

Random random = new Random();
public ArrayList<Actor> comedians=new ArrayList<Actor>();
public ArrayList<Actor> villains=new ArrayList<Actor>();
public ArrayList<Actor> mainActors=new ArrayList<Actor>();

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
      System.out.println("                            Comedy Scene                     ");
      System.out.println("*****************************");
      try{
         
      for (int a = 1; a < 5; a++) {
      final LocalTime time = LocalTime.of(random.nextInt(24), random.nextInt(60),
      random.nextInt(60), random.nextInt(999999999 + 1));
      //for(int x=1;x<5;x++){
      System.out.println("                            Scene"+a+" "+time);
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
       count++;
     }
     for(int i=0;i<=comedyDialogues.size();i++){
        Collections.shuffle(comedyDialogues);
        int p=random.nextInt(comedyDialogues.size());
        Collections.shuffle(comedians);
        int q=random.nextInt(comedians.size());
        System.out.println( comedians.get(q).getCharectorName()+":"+comedyDialogues.get(p).getDialogue());
        comedyDialogues.remove(p);
        }
  //}
 }
    }
    catch(FileNotFoundException e){

    }
    catch(IOException e){

    
  }
      System.out.println("*****************************");
      System.out.println("                            Romantic Scene                       ");
      System.out.println("*****************************");
      try{
        for(int y=1;y<5;y++){
          final LocalTime time = LocalTime.of(random.nextInt(24), random.nextInt(60),
      random.nextInt(60), random.nextInt(999999999 + 1));
          System.out.println("                            Scene"+y+" "+time); 
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
       for(int i=0;i<mainActors.size();i++){

          Collections.shuffle(romanticDialogues);
          int a=random.nextInt(romanticDialogues.size());
          Collections.shuffle(mainActors);
          int c=random.nextInt(mainActors.size());
          System.out.println( mainActors.get(c).getCharectorName()+":"+romanticDialogues.get(a).getRomantic());
          romanticDialogues.remove(a);
        }
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
        File file=new File("song.csv");
  
        FileReader f=new FileReader(file); 
        BufferedReader b=new BufferedReader(f);
     
        String data;
        while((data = b.readLine())!= null){
        System.out.println(data);
    }
  }

    catch(FileNotFoundException e){

    }
    catch(IOException e){

    } 
      System.out.println("*****************************");
      System.out.println("                            Action Scene                        ");
      System.out.println("*****************************");
     try{
      for(int z=1;z<5;z++){
        final LocalTime time = LocalTime.of(random.nextInt(24), random.nextInt(60),
      random.nextInt(60), random.nextInt(999999999 + 1));
        System.out.println("                            Scene"+z+" "+time                        );
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
       for(int k=0;k<=villainDialogues.size();k++){                                                              
        Collections.shuffle(villainDialogues);
        int m=random.nextInt(villainDialogues.size());
        Collections.shuffle(villains);
        int n=random.nextInt(villains.size());
        System.out.println(villains.get(n).getCharectorName()+":"+villainDialogues.get(m).getAction());
        villainDialogues.remove(m);
      } 
    }
        System.out.println("\n                          The End..........                 ");
        Director dia=new Director();
        dia.display();
    }

    catch(FileNotFoundException e){

    }
    catch(IOException e){

    }
  //  scriptwriter.display();

  }
  public void exit(){
    System.out.println("Thank you.....");
  }
   


}