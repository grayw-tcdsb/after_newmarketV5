// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

// package frc.robot.subsystems;

// import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
// import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import frc.robot.Constants;
// import frc.robot.RobotMap;

// public class ArmDownSubsystem extends SubsystemBase {
//   // move arm 
//   PWMSparkMax armMotor = new PWMSparkMax(RobotMap.armMotorChannle);

  
//   /** Creates a new ArmDownSubsystem. */
//   public ArmDownSubsystem() {
//     armMotor.setInverted(true);
//   }

//   public void moveArmDown() {
//     armMotor.set(Constants.slowRobotSpeed);
//   }

//   public void stop() {
//     armMotor.stopMotor();
//   }

//   @Override
//   public void periodic() {
//     // This method will be called once per scheduler run
//   }
// }
