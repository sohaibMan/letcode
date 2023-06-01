public class Main {
    public static void main(String[] args) {
        TowersOfHanoi source = new TowersOfHanoi();
        source
                .add_slide(8)
                .add_slide(7)
                .add_slide(6)
                .add_slide(5)
                .add_slide(4)
                .add_slide(3)
                .add_slide(2)
                .add_slide(1);
        TowersOfHanoi aux = new TowersOfHanoi();
        TowersOfHanoi target = new TowersOfHanoi();
        System.out.println("Before moving the towers");
        System.out.println("Source: " + source);
        System.out.println("Aux: " + aux);
        System.out.println("Target: " + target);
        TowersOfHanoi.towersOfHanoi(8, source, target, aux);
        System.out.println("After moving the towers");
        System.out.println("Source: " + source);
        System.out.println("Aux: " + aux);
        System.out.println("Target: " + target);

    }
}