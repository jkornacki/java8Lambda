package examples;

import java.util.Optional;

/**
 * Created by kornaja.
 */
public class OptionalExample {

    private static String getSerialNumber_Java7(Komputer komputer) {
        if (komputer != null) {
            if (komputer.getPart() != null) {
                Part part = komputer.getPart();
                if (part.getSerialNumber() != null) {
                    return part.getSerialNumber();
                }
            }
        }
        return "Dupa";
    }

    private static String getSerialNumber_Java8(Komputer komputer) {
        return Optional.ofNullable(komputer)
                .map(Komputer::getPart)
                .map(Part::getSerialNumber)
                .orElse("dupa");
    }

    public static void main(String[] args) {

        Komputer komputer = new Komputer();
        Part part = new Part();
//        part.setSerialNumber("123");
        komputer.setPart(part);

        System.out.println(getSerialNumber_Java7(komputer));
        System.out.println("");
        System.out.println(getSerialNumber_Java8(null));
    }
}

class Komputer {
    private Part part;

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }
}

class Part {

    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
