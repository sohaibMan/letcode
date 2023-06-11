import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        TowersOfHanoi from_tower = new TowersOfHanoi();
        TowersOfHanoi aux_tower = new TowersOfHanoi();
        TowersOfHanoi to_tower = new TowersOfHanoi();
        from_tower.add_slide(3).add_slide(2).add_slide(1);
        System.out.println("from_tower: " + from_tower);
        System.out.println("aux_tower: " + aux_tower);
        System.out.println("to_tower: " + to_tower);
        TowersOfHanoi.towersOfHanoi(3, from_tower, to_tower, aux_tower);
        System.out.println("from_tower: " + from_tower);
        System.out.println("aux_tower: " + aux_tower);
        System.out.println("to_tower: " + to_tower);
        File file = new File("tower_of_hanoi_result");
        if(!file.exists()){
            boolean result=file.createNewFile();
            System.out.println(result);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(from_tower);
        objectOutputStream.writeObject(aux_tower);
        objectOutputStream.writeObject(to_tower);
        objectOutputStream.flush();
        objectOutputStream.close();




//          FileOutputStream

    }


}

