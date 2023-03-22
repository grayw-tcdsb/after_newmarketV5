// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


// import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
// import edu.wpi.first.wpilibj2.command.Commands;
// import edu.wpi.first.wpilibj2.command.button.JoystickButton;
// import frc.robot.commands.ArmCommandUp;
import frc.robot.commands.Autonomous;
// import frc.robot.commands.ArmCommandDown;
// import frc.robot.subsystems.ArmDownSubsystem;
// import frc.robot.subsystems.ArmUpSubsystem;
import frc.robot.subsystems.DriveSubsystem;

public class RobotContainer {
  public DriveSubsystem driveSubsystem = new DriveSubsystem();
  // public ArmUpSubsystem armUpSubsystem = new ArmUpSubsystem();
  // public ArmDownSubsystem armDownSubsystem = new ArmDownSubsystem();
  Joystick driveJoystick = new Joystick(RobotMap.driveJoystickPort);
  // JoystickButton moveArmUp = new JoystickButton(driveJoystick, RobotMap.armUpButton);
  // JoystickButton moveArmDown = new JoystickButton(driveJoystick, RobotMap.armDownButton);

  Autonomous autonomous = new Autonomous();
  SendableChooser<Command> m_Chooser = new SendableChooser<>();


  // channelA output pin 7
  // channelB output pin 5
  // Must add reverseDirection to false and encodingtype to k4X since the Talon SRX and 
  // CANifier always uses 4x decoding and therefore always decodes a total of 4096
  // CPR (counts per revolution). We are using talon SRX
  // Encoder encoder = new Encoder(7,5, false, Encoder.EncodingType.k4X);
  
  // public void configureEncoder() {
  //   encoder.setDistancePerPulse(4.0/256.0);
    
  // }
  // we must assign the encoder its own measurment 
  // configures the encoder to return a distance of 4 for every 256 pulses 
  // therefor distance = 64 for full rotation since 4x decoding decodes a total of 4096 CPR

  public Joystick getDriveJoystick() {
    return driveJoystick;
  }

  public RobotContainer() {
    configureBindings();

    m_Chooser.setDefaultOption("Autonomous Command", autonomous);

    SmartDashboard.putData(m_Chooser);

  }


  private void configureBindings() {
    // moveArmUp.whileTrue(new ArmCommandUp());
    // moveArmDown.whileTrue(new ArmCommandDown());
  }

  public Command getAutonomousCommand() {
    return m_Chooser.getSelected();
  }
}
