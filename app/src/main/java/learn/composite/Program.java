package learn.composite;

public class Program {

  public static void main(String[] args) {
    Housing building = new Housing("123 street");
    Housing floor1 = new Housing("123 street - First floor");
    int firstFloor = building.addStructure(floor1);

    Room washroom1m = new Room("1F Men's Washroom");
    Room common1 = new Room("1F Common Area");

    int firstMens = floor1.addStructure(washroom1m);
    int firstCommon = floor1.addStructure(common1);

    building.enter();
    Housing currentFloor = (Housing) building.getStructure(firstFloor);

    currentFloor.enter();
    Room currentRoom = (Room) currentFloor.getStructure(firstMens);
    currentRoom.enter();

    currentRoom = (Room) currentFloor.getStructure(firstCommon);
    currentRoom.enter();

    currentRoom.exit();
    currentFloor.exit();
    building.exit();

  }

}
