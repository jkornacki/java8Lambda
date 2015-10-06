package examples.example2;

/**
 * Example with optional
 *
 * @author toto
 */
public class OptionalExample {

    public static void main(String[] args) {
        /*Computer computer = new Computer();
        computer.setSoundcard(new Soundcard());

        String version = "UNKNOWN";
        if(computer != null){
            Soundcard soundcard = computer.getSoundcard();
            if(soundcard != null){
                USB usb = soundcard.getUSB();
                if(usb != null){
                    version = usb.getVersion();
                }
            }
        }*/

        //System.out.println(computer.getSoundcard().getUSB().getVersion());



    }


}

class Computer {
    private Soundcard soundcard;

    public Soundcard getSoundcard() {
        return soundcard;
    }

    public void setSoundcard(Soundcard soundcard) {
        this.soundcard = soundcard;
    }
}

class Soundcard {
    private USB usb;

    public USB getUSB() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }
}

class USB {
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
