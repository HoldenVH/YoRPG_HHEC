// Team HHEC - Eric Chen, Holden Higgins
// APCS1 pd3
// HW34 -- Ye Olde Role Playing Game, Unchained
// 2016-11-21

public abstract class Character {
    
    // Inst Vars

    protected int hp;
    protected int strength;
    protected int defense;
    protected double attack;
    protected String name;
    protected double crit;
    protected double evade;
    protected boolean normal=true;
    
    // Methods

    public boolean isAlive() { return hp > 0; }
    
    public String getName() { return name; }

    public int getDefense() { return defense; }
    
    public double getEvade() { return evade; }

    public void lowerHP( int dmg ) { hp = hp - dmg; }

    public int attack( Character c ) {
	int dmg = (int)(strength * attack );
	//critical hits do extra damage
	if (Math.random()<crit){
	    dmg*=4;
	}
	//if the character under attack evades, 0 dmg is dealt
	if(Math.random()<c.getEvade()){
	    dmg=0;
	}
	//gives some randomization
	dmg+=(int)((Math.random()*10)-5);
	dmg-= c.getDefense();
	if ( dmg < 0 ){dmg = 0;};
	c.lowerHP( dmg );
	return dmg;
    }
    
    //prepare for a special attack
    public abstract void specialize();
/*	if(normal){
	    attack*=2;
	    defense/=2;
	    normal=false;
	}
    }*/

    //revert to normal mode
    public abstract void normalize();
/*	if(!normal){
	    attack/=2;
	    defense*=2;
	    normal=true;
	}
    }*/
    
    public abstract String about();

}
