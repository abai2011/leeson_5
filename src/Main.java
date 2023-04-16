public class Main {
    public static void main(String[] args) {
        public class Main {
            public static void main(String[] args) {
                Boss boss = new Boss();
                boss.setHealth(1000);
                boss.setDamage(50);
                boss.setDefenseType("Armor");

                System.out.println("Boss health: " + boss.getHealth());
                System.out.println("Boss damage: " + boss.getDamage());
                System.out.println("Boss defense type: " + boss.getDefenseType());

                Hero[] heroes = createHeroes();
                for (int i = 0; i < heroes.length; i++) {
                    System.out.println("Hero #" + (i + 1));
                    System.out.println("Health: " + heroes[i].getHealth());
                    System.out.println("Damage: " + heroes[i].getDamage());
                    System.out.println("Superpower: " + heroes[i].getSuperpower());
                    System.out.println();
                }
            }

            public static Hero[] createHeroes() {
                Hero hero1 = new Hero(100, 10, "Flying");
                Hero hero2 = new Hero(120, 15);
                Hero hero3 = new Hero(80, 8, "Invisibility");

                Hero[] heroes = {hero1, hero2, hero3};
                return heroes;
            }
        }
    }
}