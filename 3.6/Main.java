import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CoffeMachine> listofMachines = new ArrayList<CoffeMachine>();
        listofMachines.add(new ComplexCoffeMachine());
        listofMachines.add(new SimpleCoffeMachine());
        listofMachines.add(new ComplexCoffeMachine());
        listofMachines.add(new SimpleCoffeMachine());

        CoffeLover coffeLover = new CoffeLover(listofMachines);

        coffeLover.makeCoffe();
    }
}
