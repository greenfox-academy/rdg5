public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing tej = new Thing("Get milk");
    Thing obstacle = new Thing("Remove the obstacles");
    Thing action1 = new Thing("Stand up");
    Thing action2 = new Thing("Eat lunch");

    fleet.add(tej);
    fleet.add(obstacle);
    fleet.add(action1);
    fleet.add(action2);
    action1.complete();
    action2.complete();

    System.out.println(fleet);
  }
}