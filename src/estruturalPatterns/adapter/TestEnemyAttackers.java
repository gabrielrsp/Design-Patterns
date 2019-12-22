package estruturalPatterns.adapter;

public class TestEnemyAttackers {

    public static void main(String[] args){

        EnemyTank panzerTank = new EnemyTank();

        EnemyRobot fredTheRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);

        System.out.println("The Robot");

        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();

        System.out.println("The Robot");
        panzerTank.assignDriver("Frank");
        panzerTank.driveForward();
        panzerTank.fireWeapon();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

    }

}
