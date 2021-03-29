public class Animal {
    public int run;
    public String swimCat;
    public int swimDog;

    }

    class Cat extends Animal{
    int run;
    int swim;
    public Cat(){
        super();


    }
    public static class Dog extends Animal{
        int run;
        int swim;
        public Dog(){
            super();
            this.run = run;
            this.swimDog = swim;
        }

        public static class AnimalApp{
            public static void main(String[] args) {
               Animal animal = new Animal();
               Cat Barsik = new Cat();
               Dog Bobik = new Dog();
               Barsik.run = 150;
               Barsik.swimCat = "не плавает";
               Bobik.run = 500;
               Bobik.swimDog = 10;
                System.out.println("Кот барсик пробегает " + Barsik.run + " метров; " + "Кот барсик " + Barsik.swimCat +";" + " " + "Пес Бобик пробегает " + Bobik.run + " метров; " + "Пес Бобик проплывает " + Bobik.swimDog + " метров!");


            }
        }


        }
    }

