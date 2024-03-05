import java.util.Scanner;
class CPU
{
    int price;
    class Processor
    {
        int cores;
        String manufacturer;
        static class RAM
        {
            int memory;
            String manufacturer;
        }
    }
}
class cpuInfo
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        CPU cpu = new CPU();
        System.out.println("Enter the price of the cpu:");
        cpu.price=Integer.parseInt(input.nextLine());
        CPU.Processor processor=cpu.new Processor();
        System.out.println("Enter the number of cores:");
        processor.cores=Integer.parseInt(input.nextLine());
        System.out.println("Enter processor manufactures:");
        processor.manufacturer=input.nextLine();
        CPU.Processor.RAM ram=new CPU.Processor.RAM();
        System.out.println("Enter RAM manufacturer:");
        ram.manufacturer=input.nextLine();
        System.out.println("Enter size of RAM(in GB):");
        ram.memory=Integer.parseInt(input.nextLine());
        System.out.println("\nCPU Price: "+cpu.price+"\nProcessor cores: "+ processor.cores+"\nProcessor manufacturer: "+ processor.manufacturer+"\nRAM manufacturer: "
        + ram.manufacturer+"\nRAM size: "+ram.memory+"GB");
    } 
}

