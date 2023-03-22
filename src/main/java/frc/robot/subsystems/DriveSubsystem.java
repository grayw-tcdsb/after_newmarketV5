// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import frc.robot.commands.DriveCommand;

public class DriveSubsystem extends SubsystemBase {

  // right side drive 
  PWMSparkMax frontRight = new PWMSparkMax(RobotMap.frontRightChannle);
  PWMSparkMax middleRight = new PWMSparkMax(RobotMap.middleRightChannle);
  PWMSparkMax backRight = new PWMSparkMax(RobotMap.backRightChannle);
  MotorControllerGroup rightControllerGroup = new MotorControllerGroup(frontRight, middleRight, backRight);

  // left side drive 
  PWMSparkMax frontLeft = new PWMSparkMax(RobotMap.frontLeftChannle);
  PWMSparkMax middleLeft = new PWMSparkMax(RobotMap.middleLeftChannle);
  PWMSparkMax backLeft = new PWMSparkMax(RobotMap.backLeftChannle);
  PWMTalonSRX leftTalon = new PWMTalonSRX(RobotMap.leftTalonChannle);
  MotorControllerGroup leftControllerGroup = new MotorControllerGroup(frontLeft, middleLeft, backLeft, leftTalon);

  // victor talon (for encoders)

  
  DifferentialDrive drive;
  

  


  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {
    leftControllerGroup.setInverted(true);
    rightControllerGroup.setInverted(false);
    drive = new DifferentialDrive(rightControllerGroup, leftControllerGroup);
  }

  public void drive(double straight, double turn) {
    drive.arcadeDrive(straight, turn);
  }

  public void stop() {
    drive.stopMotor();
  }

  @Override
  public void periodic() {
    setDefaultCommand(new DriveCommand());
  }
}
