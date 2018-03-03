package org.ligerbots.powerup.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import java.util.Arrays;
import org.ligerbots.powerup.FieldMap;
import org.ligerbots.powerup.FieldPosition;
import org.ligerbots.powerup.Robot;

/**
 *
 */
public class SimpleSwitchAuto extends CommandGroup {

    public SimpleSwitchAuto() {
      
      System.out.println("Starting Simple Switch");
      
     // addSequential(new ElevatorAuto(0.6, 0.1));
      
      addParallel(new HoldBoxCommand());
      
      addParallel(new ElevatorAuto(30.0, 1));
      
      addSequential(new AlternativeDrivePathCommand(/*FieldMap.generateCatmullRomSpline*/(Arrays.asList(/*new FieldPosition(0, 0),*/ new FieldPosition(0, 36), new FieldPosition(24, 36), new FieldPosition(24, 66)/*, new FieldPosition(0, 48)*/))));
            
      //addSequential(new ElevatorAuto(1.0, 0.2));
      
      addSequential(new IntakeAuto(true, 0.65, 1.0));

      
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
