package iselectricaldevice;

public class Switch  {
    private static Switch instance;
    private ElectricDevice device;
    
    private Switch(ElectricDevice device) {
        this.device = device;
        this.device.turnOff();
    }
    
    public static Switch getInstance (ElectricDevice device){
        if(instance == null){
            instance = new Switch(device);
        }
        return instance;
    }

    public ElectricDevice getDevice() {
        return device;
    }
    
    public void push(){
        if(device.getState() == ElectricDevice.State.ON){
            device.turnOff();
        }
        else{
            device.turnOn();
        }
    }
    
}
