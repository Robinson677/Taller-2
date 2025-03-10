
/**
 * Maquinas de la flota: Ship, Plane, AircraftCarrier
 */
public abstract class Machine{
    private int longitude;
    private int latitude;
    public Machine(){
        this.longitude = longitude;
        this.latitude = latitude;
    }
    
    public int getLongitude(){
        return longitude;
    }
    
    public int getLatitude(){
        return latitude;
    }
    
    /**
     * Mueve las maquinas
     */
    public void mover(int longitud, int latitud){
        longitude += 1;
        latitude += 1;
    }
    
    public abstract boolean canBeDestroyed();
}
