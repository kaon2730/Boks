package boks;

public class Match {
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
		this.f1=f1;
		this.f2=f2;
		this.maxWeight=maxWeight;
		this.minWeight=minWeight;
	}
	
	public  void run() {
		if(isCheck()) {
			if(isWhoStart()) {
			while(this.f1.healt>0 && this.f2.healt>0) {
			System.out.println("****ROUND***");
				this.f2.healt = this.f1.hit(this.f2);
				if(isWin()) {
					break;
				}
				this.f1.healt = this.f2.hit(this.f1);
				if(isWin()) {
					break;
				}
				System.out.println(this.f1.name + "saðlýk : " + this.f1.healt);
				System.out.println(this.f2.name + "saðlýk : " + this.f2.healt);
			}
			} else {
				while(this.f1.healt>0 && this.f2.healt>0) {
					System.out.println("****ROUND***");
						this.f1.healt = this.f2.hit(this.f1);
						if(isWin()) {
							break;
						}
						this.f2.healt = this.f1.hit(this.f2);
						if(isWin()) {
							break;
						}
						System.out.println(this.f1.name + "saðlýk : " + this.f1.healt);
						System.out.println(this.f2.name + "saðlýk : " + this.f2.healt);
					}
			}
		}
		else {
			System.out.println("Sporcularýn sikletleri uygun deðil!!");
		}
	}
	boolean isCheck() {
		return((this.f1.weight>= minWeight && this.f1.weight<=maxWeight) &&(this.f2.weight >=minWeight && this.f2.weight <= maxWeight));
	}
	boolean isWin() {
		if(this.f1.healt == 0) {
			System.out.println(this.f2.name +" kazandý. !! ");
			return true;
		}
		if(this.f2.healt==0) {
			System.out.println(this.f1.name + " kazandý. !" );
			return true;
		}
		return false;
	}
	boolean isWhoStart() {
		double rnd = Math.random() *2;
		if(rnd <=1) {
			System.out.println( this.f1.name + " ilk hamleyi yapacak.");
			return true;
			
		}
		else {
			System.out.println(this.f2.name + " ilk hamleyi yapacak.");
			return false;
			
		}
	}
}
