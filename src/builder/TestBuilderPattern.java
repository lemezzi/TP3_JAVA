package builder;
import builder.Computer.ComputerBuilder;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer computer1 = new Computer.ComputerBuilder("500 GB", "8 GB")
                                    .setandchangegra(true)
                                    .build();

        Computer computer2 = new Computer.ComputerBuilder("1 TB", "16 GB")
                                    .setandchangeblu(true)
                                    .build();

        System.out.println("Computer 1: HDD = " + computer1.getHDD()
                            + ", RAM = " + computer1.getRAM()
                            + ", Graphics card enabled = " + computer1.isGraphicsCardEnabled()
                            + ", Bluetooth enabled = " + computer1.isBluetoothEnabled());

        System.out.println("Computer 2: HDD = " + computer2.getHDD()
                            + ", RAM = " + computer2.getRAM()
                            + ", Graphics card enabled = " + computer2.isGraphicsCardEnabled()
                            + ", Bluetooth enabled = " + computer2.isBluetoothEnabled());
    }
}
