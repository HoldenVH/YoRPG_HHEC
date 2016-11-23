/*=============================================
  class Monster -- Represents random incarnations of 
  the adventurer's natural enemy in Ye Olde RPG
  =============================================*/

public class Monster extends Character
{

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Monster() {
	hp = 150;
	strength = 20 + (int)( Math.random() * 45 ); // [20,65)
	defense = 20;
	attack = 1;
	name="A Monster hath no name.";
	evade=0;
	crit=0;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public String about(){
	return "Monster:The cruel creature in the night, a scourge on all things good\n";
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
}//end class Monster
