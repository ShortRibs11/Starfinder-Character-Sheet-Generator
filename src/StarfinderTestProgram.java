
public class StarfinderTestProgram {

	public static void main(String[] args) {
		StarfinderRace race = new StarfinderRace(0,2,0,2,0,-2,4);
		StarfinderTrait trait = new StarfinderTrait(
				"Constructed",
				"For effects targeting creatures by type,\n" + 
				"androids count as both humanoids and\n" + 
				"constructs (whichever effect is worse). They\n" + 
				"receive a +2 racial bonus to saving throws\n" + 
				"against disease, mind-affecting effects,\n" + 
				"poison, and sleep, unless those effects\n" + 
				"specifically target constructs. In addition,\n" + 
				"androids do not breathe or suffer the normal\n" + 
				"environmental effects of being in a vacuum.");
		
		
		System.out.println("Character Race:");
		System.out.println("HP:" + race.getHitPoints());
		System.out.println("Strength: " + 
				race.getAbility(StarfinderAbility.Strength));
		System.out.println("Dexterity: " + 
				race.getAbility(StarfinderAbility.Dexterity));
		System.out.println("Constitution: " + 
				race.getAbility(StarfinderAbility.Constitution));
		System.out.println("Intelligence: " + 
				race.getAbility(StarfinderAbility.Intelligence));
		System.out.println("Wisdom: " + 
				race.getAbility(StarfinderAbility.Wisdom));
		System.out.println("Charisma: " + 
				race.getAbility(StarfinderAbility.Charisma));
		
		System.out.println(trait);
	}

}
