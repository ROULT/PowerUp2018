package org.usfirst.frc.team4403.robot.subsystems;

import org.usfirst.frc.team4403.robot.OI;
import org.usfirst.frc.team4403.robot.Robot;
import org.usfirst.frc.team4403.robot.commands.StartPneumatics;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {
	
	private DoubleSolenoid mIntake = new DoubleSolenoid(0, 1);
	
    public void initDefaultCommand() {
    	setDefaultCommand(new StartPneumatics());
    }
    
    public void executePneumatics() {
    	
    	
    	if(OI.xboxCoD.getRawButton(0)) {
    		extendIntake();
    		
    	}else if(OI.xboxCoD.getRawButton(0)) {
    		saveIntake();
    		
    	}
    }

    public void saveIntake() {
    	mIntake.set(DoubleSolenoid.Value.kForward);
    }
    public void extendIntake() {
    	mIntake.set(DoubleSolenoid.Value.kReverse);
    	
    }
}

