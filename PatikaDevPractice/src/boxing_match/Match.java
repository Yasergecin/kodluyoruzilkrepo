package boxing_match;

public class Match {
	Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    
    public void run() {

        if (checkWeight()) {
        	if(isStart()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("======== YENÝ ROUND ===========");
                f2.health = f1.hit(f2);
                if (isWin()){
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()){
                    break;
                }
                printScore();
            }
        	}
        	else {
        		while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("======== YENÝ ROUND ===========");
                    this.f1.health = this.f1.hit(f1);
                    if (isWin()){
                        break;
                    }
                    this.f2.health = this.f1.hit(f1);
                    if (isWin()){
                        break;
                    }
                    printScore();
                }
        	}

        } else {
            System.out.println("Sporcularýn aðýrlýklarý uyuþmuyor.");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçý Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçý Kazanan : " + f2.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
    
    public boolean isStart() {
    	double randomChance =Math.random()*100;
    	if(randomChance<=50) {
    		System.out.println("Ilk hamleyi "+this.f1.name+" yapacak.");
    		return true;
    	}
    	else {
    		System.out.println("Ilk hamleyi "+this.f2.name+" yapacak.");
    		return false;
    	}
    	
    }


}
