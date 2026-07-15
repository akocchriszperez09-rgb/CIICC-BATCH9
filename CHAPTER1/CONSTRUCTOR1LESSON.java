package CHAPTER1;

public class CONSTRUCTOR1LESSON {
    public static void main(String[] args) {
        Chicken c1 = new Chicken();
        Chicken c2 = new Chicken();
        System.out.println();
    }
    
}


class Chicken{
    int numEggs = 0;
    String name;
    public Chicken(){
        name = "Duke";
    }
}

class Chick{ //🥚
    public Chick(){
        System.out.println("🐣 in constructor");
    }
    public void Chick(){
        System.out.println("🐥💬 I'm a method");
    }
}