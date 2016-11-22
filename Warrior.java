/*=============================================
  class Warrior -- protagonist of Ye Olde RPG
  =============================================*/

public class Warrior extends Character
{

    // Instance Variables

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Warrior() {
	hp = 125;
	strength = 100;
	defense = 40;
	attack = .4;
	evade=0;
	crit=0;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Warrior( String newName ) {
	this();
	name = newName;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public String about(){
	return "Warrior: A Brawny brawler for any fight\n";
    }
    
}//end class Warrior