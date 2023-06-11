import java.io.Serializable;
import java.util.Stack;

public class TowersOfHanoi implements Serializable {
    Stack<Integer> slides = new Stack<>();

    /**
     * @param n          the number of slides in the from_tower
     * @param from_tower the initial tower (in the right)
     * @param aux_tower  the tower in the middle as an auxiliary tower (in the middle)
     * @param to_tower   the tower we want to move the slider to (in the right)
     */
    static void towersOfHanoi(int n, TowersOfHanoi from_tower, TowersOfHanoi to_tower, TowersOfHanoi aux_tower) {

        // base case
        if (n <= 0) return;
        // move the n-1 slides from the from_tower to the aux_tower
        towersOfHanoi(n - 1, from_tower, aux_tower, to_tower);
        // move the biggest slider from the top_tower to the aux_tower
        Integer top_slide = from_tower.get_top_slide();
        to_tower.add_slide(top_slide);
        // move the towers that are in the aux_tower to the from_tower (above the biggest slide we have moved earlier)
        towersOfHanoi(n - 1, aux_tower, to_tower, from_tower);

    }

    /**
     * @param i slide
     */
    TowersOfHanoi add_slide(Integer i) {
        this.slides.push(i);
        return this;
    }

    /**
     * @param i slide
     */
    TowersOfHanoi remove_slide(Integer i) {
        this.slides.remove(i);
        return this;
    }

    Integer get_top_slide() {
        return this.slides.pop();
    }

    @Override
    public String toString() {
        return this.slides.toString();
    }
}
