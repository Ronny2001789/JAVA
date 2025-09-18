package Chap09.exercises;

class Honey {
}

class Bees {
    Honey[] beeHoney;
}

class Kit {
    Honey honey;
}

class Raccoon {
    Kit rk;
    Honey rh;
}

class Bear {
    Honey hunny;
}

public class Main {
    public static void main(String[] args) {
        // Create the main Honey object
        Honey honeyPot = new Honey();

        // Create an array of Honey references
        Honey[] ha = {honeyPot, honeyPot, honeyPot, honeyPot};

        // Create Bees and assign the honey array
        Bees bees = new Bees();
        bees.beeHoney = ha;

        // Create Bears and assign honeyPot to each bear
        Bear[] bears = new Bear[5];
        for (int i = 0; i < 5; i++) {
            bears[i] = new Bear();
            bears[i].hunny = honeyPot;
        }

        // Create Kit and assign honeyPot
        Kit kit = new Kit();
        kit.honey = honeyPot;

        // Create Raccoon and assign honeyPot and Kit
        Raccoon raccoon = new Raccoon();
        raccoon.rh = honeyPot;
        raccoon.rk = kit;

        // Null the local kit reference
        kit = null;

        // Print out a summary
        System.out.println("References to honeyPot:");
        System.out.println("Local variable honeyPot: " + (honeyPot != null));
        System.out.println("Array ha: " + ha.length + " references");
        for (int i = 0; i < bears.length; i++) {
            System.out.println("bears[" + i + "].hunny: " + (bears[i].hunny != null));
        }
        System.out.println("raccoon.rh: " + (raccoon.rh != null));
        System.out.println("raccoon.rk.honey: " + (raccoon.rk.honey != null));
    }
}
