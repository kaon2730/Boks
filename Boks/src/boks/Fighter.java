package boks;

public class Fighter {
	String name;
	int damage;
	int healt;
	int weight;
	int dodge;
	
	Fighter(String name, int damage, int healt, int weight, int dodge){
		this.name = name;
		this.damage=damage;
		this.healt=healt;
		this.weight=weight;
		if(dodge >=0 && dodge<=100) {
			this.dodge = dodge;
		}
		else {
		this.dodge = 0;
		}
	}
	int hit(Fighter foe) {
		System.out.println(this.name + "=>" + foe.name + " " + this.damage + " hasar vurdu" );
		if(foe.isDodge()) {
			System.out.println(foe.name + " gelen hasarý blokladý");
			return foe.healt;
		}
		if(foe.healt-this.damage < 0) {
			return 0;
		}
		return foe.healt - this.damage;
	}
	boolean isDodge() {
		double random = Math.random() * 100;
		return random <= this.dodge;
	}
}
