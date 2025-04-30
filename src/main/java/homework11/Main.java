package homework11;

public class Main {
    public static void main (String[] args) {

        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();

        processor.showType();
        ram.showType();

        Motherboard motherboard = new Motherboard();
        Motherboard.USB usb = new Motherboard.USB();

        usb.showType();
    }
}