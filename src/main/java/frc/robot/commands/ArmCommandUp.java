// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

// package frc.robot.commands;

// import edu.wpi.first.wpilibj2.command.CommandBase;
// import frc.robot.Robot;


// public class ArmCommandUp extends CommandBase {
//   /** Creates a new ArmCommandUp. */
//   public ArmCommandUp() {
//     // Use addRequirements() here to declare subsystem dependencies.
//     addRequirements(Robot.m_robotContainer.armUpSubsystem);
//   }

//   // Called when the command is initially scheduled.
//   @Override
//   public void initialize() {
//     Robot.m_robotContainer.armUpSubsystem.stop();
//   }

//   // Called every time the scheduler runs while the command is scheduled.
//   @Override
//   public void execute() {
//     Robot.m_robotContainer.armUpSubsystem.moveArmUp();
//   }

//   // Called once the command ends or is interrupted.
//   @Override
//   public void end(boolean interrupted) {
//     Robot.m_robotContainer.armUpSubsystem.stop();
//   }

//   // Returns true when the command should end.
//   @Override
//   public boolean isFinished() {
//     return false;
//   }
// }
