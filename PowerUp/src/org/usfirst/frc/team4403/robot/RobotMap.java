/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4403.robot;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public interface GearBoxes {
		final int kLeftGearBox = 0;
		final int kRightGearBox = 1;
		final int kElevatorGearBox = 2;
		
	}
	
	public interface IntakeWheels {
		final int kLeftInnerWheel = 3;
		final int kRightInnerWheel = 4;
		final int kLeftOuterWheels = 5;
		final int kRightOuterWheels = 6;
	}
	
	
}
