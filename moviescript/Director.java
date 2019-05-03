import java.util.*;
public class Director
{
private String name="Prithviraj";

Scanner scan=new Scanner(System.in);

public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
    Hero hero=new Hero();
	Heroine heroine=new Heroine();
	Villain villain=new Villain();
	
public void cast()
{	
	hero.setCharacterName("Mohanlal");
	hero.setRoleName("Stephen nedumpalli");
	hero.setRole("Hero");
	
	heroine.setCharacterName("Manju warrier");
	heroine.setRoleName("Priyadarshini ramdas");
	heroine.setRole("Heroine");
	
	villain.setCharacterName("vivek oberoi");
	villain.setRoleName("Bobby");
	villain.setRole("Villain");
	
	System.out.println(hero.getRole()+": "+hero.getCharacterName()+" as "+hero.getRoleName());
	System.out.println(heroine.getRole()+": "+heroine.getCharacterName()+" as "+heroine.getRoleName());	
	System.out.println(villain.getRole()+": "+villain.getCharacterName()+" as "+villain.getRoleName());
	
}

}