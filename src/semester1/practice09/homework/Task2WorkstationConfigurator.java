package semester1.practice09.homework;

import java.util.Arrays;
import java.util.Locale;

public class Task2WorkstationConfigurator {

    public static void main(String[] args) {
        System.out.println("================ КОНФІГУРАТОР РОБОЧОЇ СТАНЦІЇ (КОМПОЗИЦІЯ) ================");

        Motherboard board = new Motherboard("ASUS ROG B650", "AM5", 4);
        PowerSupplyUnit psu = new PowerSupplyUnit("Seasonics 750W Gold", 750, 0.90);
        WorkstationPC pc = new WorkstationPC("DeepLearning-Rig", board, psu);

        ProcessorUnit wrongCpu = new ProcessorUnit("Intel Core i9", 25000, "LGA1700", 24, 5.8, 253);
        ProcessorUnit cpu = new ProcessorUnit("AMD Ryzen 9 7950X", 21900, "AM5", 16, 5.7, 170);
        GraphicsAccelerator gpu = new GraphicsAccelerator("NVIDIA RTX 4080 Super", 47000, 16, 552, 320);
        int[] samples = {7400, 7450, 7460};
        NvmeSsdDrive ssd = new NvmeSsdDrive("Samsung 990 Pro 2TB", 10000, 2000, 7450, samples);
        GraphicsAccelerator hugeGpu = new GraphicsAccelerator("Monster GPU X", 90000, 48, 900, 450);

        System.out.println("[ПЕРЕВІРКА СУМІСНОСТІ]:");
        pc.installComponent(wrongCpu);
        pc.installComponent(cpu);
        pc.installComponent(gpu);
        pc.installComponent(ssd);
        pc.installComponent(hugeGpu);

        System.out.println();
        System.out.println(pc);

        // Захисне копіювання масиву в NvmeSsdDrive
        samples[0] = 0;
        int[] fromGetter = ssd.getSpeedSamples();
        fromGetter[1] = 0;
        System.out.println();
        System.out.println("[ЗАХИСНЕ КОПІЮВАННЯ] Зовнішній масив змінено, а в накопичувачі: "
                + Arrays.toString(ssd.getSpeedSamples()));
        System.out.println("===========================================================================");
    }
}

class Motherboard {
    private final String model;
    private final String socketType;
    private final int maxExpansionSlots;

    public Motherboard(String model, String socketType, int maxExpansionSlots) {
        this.model = model;
        this.socketType = socketType;
        this.maxExpansionSlots = Math.max(1, Math.min(8, maxExpansionSlots));
    }

    public String getModel() {
        return model;
    }

    public String getSocketType() {
        return socketType;
    }

    public int getMaxExpansionSlots() {
        return maxExpansionSlots;
    }

    public boolean isSocketCompatible(String cpuSocket) {
        return socketType.equalsIgnoreCase(cpuSocket);
    }
}

class PowerSupplyUnit {
    private final String model;
    private final int maxOutputWatts;
    private final double efficiencyCoefficient;

    public PowerSupplyUnit(String model, int maxOutputWatts, double efficiencyCoefficient) {
        this.model = model;
        this.maxOutputWatts = maxOutputWatts;
        this.efficiencyCoefficient = Math.max(0.80, Math.min(0.96, efficiencyCoefficient));
    }

    public String getModel() {
        return model;
    }

    public double getEfficiencyCoefficient() {
        return efficiencyCoefficient;
    }

    public int getSafeContinuousWatts() {
        return (int) (maxOutputWatts * 0.85);
    }

    public double calculateWallPowerDraw(int internalLoadWatts) {
        return internalLoadWatts / efficiencyCoefficient;
    }
}

abstract class AbstractHardwareComponent {
    private final String modelName;
    private final double priceUah;

    public AbstractHardwareComponent(String modelName, double priceUah) {
        this.modelName = modelName;
        this.priceUah = (priceUah >= 0) ? priceUah : 0.0;
    }

    public String getModelName() {
        return modelName;
    }

    public double getPriceUah() {
        return priceUah;
    }

    public abstract int getPowerWatts();

    public abstract double getBenchmarkScore();

    public abstract String getCategory();

    @Override
    public String toString() {
        return String.format(Locale.US, "[%s] %s (%d Вт | Score: %.1f)",
                getCategory(), modelName, getPowerWatts(), getBenchmarkScore());
    }
}

class ProcessorUnit extends AbstractHardwareComponent {
    private final String socket;
    private final int cores;
    private final double boostClockGhz;
    private final int tdpWatts;

    public ProcessorUnit(String modelName, double priceUah, String socket, int cores,
                         double boostClockGhz, int tdpWatts) {
        super(modelName, priceUah);
        this.socket = socket;
        this.cores = cores;
        this.boostClockGhz = boostClockGhz;
        this.tdpWatts = tdpWatts;
    }

    public String getSocket() {
        return socket;
    }

    @Override
    public int getPowerWatts() {
        return tdpWatts;
    }

    @Override
    public double getBenchmarkScore() {
        return cores * boostClockGhz * 120.0;
    }

    @Override
    public String getCategory() {
        return "CPU";
    }
}

class GraphicsAccelerator extends AbstractHardwareComponent {
    private final int vramGb;
    private final int tensorCores;
    private final int boardPowerWatts;

    public GraphicsAccelerator(String modelName, double priceUah, int vramGb, int tensorCores, int boardPowerWatts) {
        super(modelName, priceUah);
        this.vramGb = vramGb;
        this.tensorCores = tensorCores;
        this.boardPowerWatts = boardPowerWatts;
    }

    @Override
    public int getPowerWatts() {
        return boardPowerWatts;
    }

    @Override
    public double getBenchmarkScore() {
        return vramGb * 250.0 + tensorCores * 1.5;
    }

    @Override
    public String getCategory() {
        return "GPU";
    }
}

class NvmeSsdDrive extends AbstractHardwareComponent {
    private final int capacityGb;
    private final int readSpeedMbSec;
    private final int[] speedSamples;

    public NvmeSsdDrive(String modelName, double priceUah, int capacityGb, int readSpeedMbSec, int[] speedSamples) {
        super(modelName, priceUah);
        this.capacityGb = capacityGb;
        this.readSpeedMbSec = readSpeedMbSec;
        this.speedSamples = new int[speedSamples.length];
        for (int i = 0; i < speedSamples.length; i++) {
            this.speedSamples[i] = speedSamples[i];
        }
    }

    public int[] getSpeedSamples() {
        int[] copy = new int[speedSamples.length];
        for (int i = 0; i < speedSamples.length; i++) {
            copy[i] = speedSamples[i];
        }
        return copy;
    }

    @Override
    public int getPowerWatts() {
        return 12;
    }

    @Override
    public double getBenchmarkScore() {
        return readSpeedMbSec * 0.25;
    }

    @Override
    public String getCategory() {
        return "NVMe SSD";
    }
}

class WorkstationPC {
    private final String buildName;
    private final Motherboard motherboard;
    private final PowerSupplyUnit psu;
    private final AbstractHardwareComponent[] components;
    private int componentCount;

    public WorkstationPC(String buildName, Motherboard motherboard, PowerSupplyUnit psu) {
        this.buildName = buildName;
        this.motherboard = motherboard;
        this.psu = psu;
        this.components = new AbstractHardwareComponent[motherboard.getMaxExpansionSlots()];
    }

    public boolean installComponent(AbstractHardwareComponent comp) {
        if (comp == null) {
            return false;
        }
        if (componentCount >= motherboard.getMaxExpansionSlots()) {
            System.out.println("❌ Відмова: немає вільних слотів на платі " + motherboard.getModel() + "!");
            return false;
        }
        if (comp instanceof ProcessorUnit) {
            ProcessorUnit cpu = (ProcessorUnit) comp;
            if (!motherboard.isSocketCompatible(cpu.getSocket())) {
                System.out.println("❌ Відмова: Процесор " + cpu.getModelName() + " (" + cpu.getSocket()
                        + ") несумісний із платою " + motherboard.getModel() + " (Сокет "
                        + motherboard.getSocketType() + ")!");
                return false;
            }
        }
        if (getTotalPowerWatts() + comp.getPowerWatts() > psu.getSafeContinuousWatts()) {
            System.out.println("❌ Відмова: " + comp.getModelName() + " (" + comp.getPowerWatts()
                    + " Вт) перевантажить блок живлення! Безпечний ліміт: " + psu.getSafeContinuousWatts() + " Вт");
            return false;
        }
        components[componentCount] = comp;
        componentCount++;
        System.out.println("✅ Встановлено: " + comp);
        return true;
    }

    public int getTotalPowerWatts() {
        int total = 0;
        for (int i = 0; i < componentCount; i++) {
            total += components[i].getPowerWatts();
        }
        return total;
    }

    public double getTotalSystemScore() {
        double total = 0;
        for (int i = 0; i < componentCount; i++) {
            total += components[i].getBenchmarkScore();
        }
        return total;
    }

    public double getTotalBuildPrice() {
        double total = 0;
        for (int i = 0; i < componentCount; i++) {
            total += components[i].getPriceUah();
        }
        return total;
    }

    @Override
    public String toString() {
        int power = getTotalPowerWatts();
        String status = (power <= psu.getSafeContinuousWatts()) ? "СТАБІЛЬНО!" : "ПЕРЕВАНТАЖЕННЯ!";
        return "[ПАСПОРТ ЗБІРКИ '" + buildName + "']:\n"
                + "  Материнська плата: " + motherboard.getModel() + " (Socket: " + motherboard.getSocketType()
                + ", Слотів: " + componentCount + "/" + motherboard.getMaxExpansionSlots() + ")\n"
                + "  Блок живлення:     " + psu.getModel() + " (Безпечний ліміт 85%: " + psu.getSafeContinuousWatts()
                + " Вт, ККД: " + Math.round(psu.getEfficiencyCoefficient() * 100) + "%)\n"
                + "  Внутрішнє споживання: " + power + " Вт (З розетки з урахуванням ККД: "
                + String.format(Locale.US, "%.2f", psu.calculateWallPowerDraw(power)) + " Вт) -> " + status + "\n"
                + "  Сумарний індекс продуктивності: " + String.format(Locale.US, "%.2f", getTotalSystemScore()) + " балів\n"
                + "  Загальна вартість конфігурації: " + String.format(Locale.US, "%.2f", getTotalBuildPrice()) + " грн";
    }
}