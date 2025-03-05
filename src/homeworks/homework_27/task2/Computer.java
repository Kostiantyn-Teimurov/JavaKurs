package homeworks.homework_27.task2;

public class Computer {

    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Storage storage) {
        this.storage = storage;
        this.processor = new Processor("Intel", "v24545", 4);
        this.memory = new Memory("AMD", "qweuo23413", 1000);
    }

    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(processor.toString()).append(memory.toString()).append(storage.toString());
//        return sb.toString();
        return String.join("; ", processor.toString(), memory.toString(), storage.toString());

    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }
}
