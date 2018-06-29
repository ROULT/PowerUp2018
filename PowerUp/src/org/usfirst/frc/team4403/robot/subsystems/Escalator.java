package org.usfirst.frc.team4403.robot.subsystems;

import org.usfirst.frc.team4403.robot.OI;
import org.usfirst.frc.team4403.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;



/**
 *
 */
public class Escalator extends Subsystem {

  
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void executeEscalator() {
    	
    	double escaleVelocity = OI.xboxCoD.getRawAxis(1);
    	
    	
    		Robot.drive.setDriveVelocity(0, escaleVelocity);
    	
    }
}

