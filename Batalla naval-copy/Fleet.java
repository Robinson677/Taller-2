import java.util.ArrayList;

/**
 * Conjunto de maquinas y los marineros que las manejan
 */
public class Fleet {
    private int name;
    private ArrayList<Machine> machines;
    private ArrayList<Sailor> sailors;
    private ArrayList<Plane> airPlanes;
    private ArrayList<Ship> ships;
    
    public void advance (int dLon, int dLat){
        for (Machine m: machines){
            int newLongitude = m.getLongitude() + dLon;
            int newLatitude = m.getLatitude() + dLat;

            if (newLongitude >= 0 && newLongitude <= 180 &&
                newLatitude >= -90 && newLatitude <= 90){
                    m.mover(dLon, dLat);
            }
        }
    }
    
    public ArrayList<Machine> willBeDestroyed(int longitude, int latitude) {
        ArrayList<Machine> destroyedMachines = new ArrayList<>();
        for (Machine machine : machines) {
            if (machine.getLongitude() == longitude && machine.getLatitude() == latitude) {
                if (machine.canBeDestroyed()) {
                    destroyedMachines.add(machine);
                }
            }
        }
        return destroyedMachines;
    }

    public void addMachine(Machine machine) {
        machines.add(machine);
    }
    
    public boolean canBeDestroyed(){
        return true;
    }
}

