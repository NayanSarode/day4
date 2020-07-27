package day1;


class Paramconst{
	int id;
    String name;
    static int c=0;

	static String school="smvm";
    static void check() {
        school="xyz" ;
    }
    
    Paramconst(int id,String name)
    {
    	this.id=id;
    	this.name=name;
    	c++;
    
    }
    
    void display()
    {
		System.out.println(name+" "+id+" "+school+" "+c);
    }
    
}

public class constru {
	public static void main(String [] args)
	{
		Paramconst pm=new Paramconst(10,"nayan");
		pm.display();
		
		Paramconst pm1=new Paramconst(1,"rushi");
		Paramconst.check();
		
		pm1.display();
		
		
	}

}
