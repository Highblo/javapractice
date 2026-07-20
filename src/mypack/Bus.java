package mypack;

public class Bus extends Vehicle implements Stopable {
    public Bus(int crewNum) {
        this.crewNum = crewNum;
    }

    public void showCrewNum() {
        System.out.println("バスの乗客は" + crewNum + "人です。");
    }
    
    public void stop() {
        System.out.println("次で止まります");
    }

}
