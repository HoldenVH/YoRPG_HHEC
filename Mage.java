/*==============================
Mage--The wizend magician of Ye Old RPG
===============================*/
public class Mage extends Character{

    // Instance Variables

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Mage() {
	hp = 75;
	strength = 50;
	defense = 30;
	attack = .4;
	crit=.3;
	evade=0;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Mage( String newName ) {
	this();
	name = newName;
    }
    public String about(){
	return "Mage:An ancient magician who will sometimes cast poweful spells for massive damage\n";
    }
    public abstract void specialize();
	if(normal){
	    attack*=2;
	    defense/=2;
	    normal=false;
	}
    }

    //revert to normal mode
    public abstract void normalize();
 	if(!normal){
	    attack/=2;
	    defense*=2;
	    normal=true;
	}
    }
}
