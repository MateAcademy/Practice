package hillel.lesson7.clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human human = new Human(20, "Herman", new Car("audi"));
        // human.setCar(new Car("bmw"));
        System.out.println("Оригинал:");
        System.out.println(human);

        Human cloneHuman = null;
        if (human != null) {
            cloneHuman = human.clone();
            System.out.println("\nКлонированный человек:");
            System.out.println(cloneHuman);
        }

        human.getCar().setName("bmw");
        human.setName("Ava");

        System.out.println("\nПосле изменений:");
        System.out.println(human);
        System.out.println(cloneHuman);
    }
}
