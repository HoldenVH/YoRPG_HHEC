/*==============================
Elf-- a quick, lightly armored attack unit in Ye Old RPG
===============================*/
public class Elf extends Character{

    // Instance Variables

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Elf() {
	hp = 100;
	strength = 75;
	defense = 30;
	attack = .7;
	evade=0;
	crit=0;
    }

    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Elf( String newName ) {
	this();
	name = newName;
    }
    
    public String about(){
	return "Elf: A forest warrior with high attack and low defense\n";
    }

}
