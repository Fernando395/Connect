import java.util.ArrayList;

public class EquipmentsManager {
    ArrayList<Equipment> equipments = new ArrayList<>();

    public void list() {
        for (int i = 0; i <= equipments.size(); i++) {
            System.out.println(equipments.get(i));
        }
    }

    public void add(Equipment equipment) {
        equipments.add(equipment);
    }

    public void remove(int i) {
        equipments.remove(i);
    }
}
