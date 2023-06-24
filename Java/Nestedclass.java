import java.util.Scanner;

class CPU 
{
    double price;

    CPU(double price) 
    {
        this.price = price;
    }

    static class Processor 
    {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) 
        {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        void displayProcessorInfo() 
        {
            System.out.println("Processor Information:");
            System.out.println("Cores: " + cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    static class RAM 
    {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) 
        {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void displayRAMInfo() 
        {
            System.out.println("RAM Information:");
            System.out.println("Memory: " + memory);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    void displayPrice() 
    {
        System.out.println("Price: " + price);
    }
}

class Main 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CPU price: ");
        double cpuPrice = scanner.nextDouble();
        CPU cpu = new CPU(cpuPrice);

        System.out.print("Enter number of cores in the processor: ");
        int cores = scanner.nextInt();
        System.out.print("Enter manufacturer of the processor: ");
        String processorManufacturer = scanner.next();
        CPU.Processor processor = new CPU.Processor(cores, processorManufacturer);

        System.out.print("Enter RAM memory: ");
        int memory = scanner.nextInt();
        System.out.print("Enter manufacturer of the RAM: ");
        String ramManufacturer = scanner.next();
        CPU.RAM ram = new CPU.RAM(memory, ramManufacturer);

        processor.displayProcessorInfo();
        ram.displayRAMInfo();
        cpu.displayPrice();
    }
}
