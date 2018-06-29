package org.usfirst.frc.team4403.robot.subsystems;

import org.usfirst.frc.team4403.robot.OI;
import org.usfirst.frc.team4403.robot.Robot;
import org.usfirst.frc.team4403.robot.RobotMap;
import org.usfirst.frc.team4403.robot.commands.StartDrive;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Drive extends Subsystem {


	private double mLeftVelocity;
	private double mRightVelocity;
	
	

	
	public DifferentialDrive mDrive = new 
			DifferentialDrive(new Spark(RobotMap.GearBoxes.kLeftGearBox), new Spark(RobotMap.GearBoxes.kRightGearBox));
	
	public Drive() {
		
		mDrive.setSafetyEnabled(true);
		
	}

    public void initDefaultCommand() {
    	
        setDefaultCommand(new StartDrive());
        
        
    }

    protected void usePIDOutput(double output) {
    	setDriveVelocity(-output, 0);
    	SmartDashboard.putNumber("Output", output);
    }
    
    public void driveSystem() {
    	
    	double xSpeed = OI.xboxNav.getRawAxis(1);
    	double zRotation = OI.xboxNav.getRawAxis(4);
    	
    	setDriveVelocity(xSpeed,zRotation);
    	
    }
    
    public void setDriveVelocity(double x, double rotation) {
    	mDrive.arcadeDrive(x, rotation);
    }
    
    /**
     * This function change the functions of the Gear Boxes
     */
    
    
}

