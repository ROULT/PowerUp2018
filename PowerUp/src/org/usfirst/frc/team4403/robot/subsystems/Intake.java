package org.usfirst.frc.team4403.robot.subsystems;

import org.usfirst.frc.team4403.robot.OI;
import org.usfirst.frc.team4403.robot.RobotMap;
import org.usfirst.frc.team4403.robot.commands.StartIntake;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	
	private Talon mIntakeWheels = new Talon(RobotMap.IntakeWheels.kLeftInnerWheel);
	
	private double kInVel = 0.6;
	private double kOutVel = -0.6;
	
	
	public void initDefaultCommand() {
		setDefaultCommand(new StartIntake());
	}
	
	public void executeIntake() {
		
		double velDer = OI.xboxCoD.getRawAxis(3);
		double velIzq = OI.xboxCoD.getRawAxis(2);
		
		double vel = 0;
		
		if(OI.xboxCoD.getRawButton(4)){
			mIntakeWheels.set(0.45);
		}else {
			
			if(velDer > 0) {
				vel = velDer;
			}else if(velIzq > 0) {
				vel = -velIzq;
			}
		
			mIntakeWheels.set(vel);
		}
		
	}
	
}