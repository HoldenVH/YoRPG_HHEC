/*==============================
Knight--a slow, armored unit in Ye Old RPG
===============================*/
public class Knight extends Character{

    // Instance Variables

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Knight() {
	hp = 150;
	strength = 100;
	defense = 60;
	attack = .2;
	evade=0;
	crit=0;
    }

    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Knight( String newName ) {
	this();
	name = newName;
    }
    public String about(){
	return "Knight: An armored fighter with high defense and low attack\n";
    }
    public abstract void specialize();
	if(normal){
	    attack*=2;
	    defense/=2;
	    normal=false;
	}
    }*/

    //revert to normal mode
    public abstract void normalize();
 	if(!normal){
	    attack/=2;
	    defense*=2;
	    normal=true;
	}
    }
}
