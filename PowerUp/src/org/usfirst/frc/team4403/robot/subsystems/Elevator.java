package org.usfirst.frc.team4403.robot.subsystems;

import org.usfirst.frc.team4403.robot.OI;
import org.usfirst.frc.team4403.robot.RobotMap;
import org.usfirst.frc.team4403.robot.commands.StartElevator;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Elevator extends PIDSubsystem {
	
	private boolean kLastStatus;
	
	private static final double kP = 0f;
	private static final double kI = 0f;
	private static final double kD = 0f;
	private static final double kF = 0f;
	
	private static final double kTolerance = 0f;
	
	public static Spark elevatorGearbox = new Spark(RobotMap.GearBoxes.kElevatorGearBox);
	
	
    // Initialize your subsystem here
    public Elevator() {
    	super("ArmGear", kP, kI, kD, kF);
		setAbsoluteTolerance(kTolerance);
		setOutputRange(-0.60, 0.60);
		setInputRange(-90, 90);
		getPIDController().setContinuous(false);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new StartElevator());
    }

    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
        return 0.0;
    }

    protected void usePIDOutput(double output) {
        elevatorGearbox.set(output);
    }
    
    public void setSwitchHeight() {
    	
    	setSetpoint(1);
    	enable();
    	
    }
    public void setScaleHeight() {
    	
    }
    public void setStatusAction () {
    	
    	if(kLastStatus == false) {
    		kLastStatus = true;
    	}else {
    		kLastStatus = false;
    	}
    	
    }
    public void inOutIntake() {
    	if(kLastStatus == false) {
    		
    	}else {
    		
    	}
    }
    public void setSaveIntakeHeight() {
    	setSetpoint(1);
    	enable();
    }
    public void executeElevator() {
    	double velElv = OI.xboxCoD.getRawAxis(5);
    	
    	SmartDashboard.putNumber("Velocidad escalador", velElv);
    	elevatorGearbox.set(-OI.xboxCoD.getRawAxis(5));
    }
    public void disablePIDElevator() {
    	disable();
    }
}