import java.util.List;

public class CoffeLover {
    private List<CoffeMachine> coffeMachines ;

    public CoffeLover(List<CoffeMachine> coffeMachines) {
        this.coffeMachines = coffeMachines;
    }

    public void makeCoffe(){
        for(CoffeMachine i : coffeMachines){
            i.start();
        }
    }
}
