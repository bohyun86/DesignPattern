package statePattern;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("매진되었습니다. 다음 기회에 이용해주세요.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("매진되었습니다. 반환할 동전이 없습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진되었습니다. 손잡이를 돌릴 수 없습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("매진되었습니다.");
    }

    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
