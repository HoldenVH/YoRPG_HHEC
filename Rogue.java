/*==============================
Rogue--a stealthy unit with the ability to evade attacks in Ye Old RPG
===============================*/
public class Rogue extends Character{

    // Instance Variables

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Rogue() {
	hp = 125;
	strength = 100;
	defense = 30;
	attack = .5;
	evade=.3;
	crit=0;
    }

    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Rogue( String newName ) {
	this();
	name = newName;
    }

    public String about(){
	return "Rogue:A stealthy scout, sometimes blows will entirely miss him\n";
    }
    public void specialize(){
	if(normal){
	    attack*=2;
	    defense/=2;
	    normal=false;
	}
    }

    //revert to normal mode
    public void normalize(){
 	if(!normal){
	    attack/=2;
	    defense*=2;
	    normal=true;
	}
    }
}
