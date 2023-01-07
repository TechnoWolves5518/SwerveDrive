// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.kinematics.SwerveDriveOdometry;
import edu.wpi.first.wpilibj.ADIS16448_IMU;
import edu.wpi.first.wpilibj.ADIS16470_IMU;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;
import frc.robot.commands.DriveCommand;

public class DriveSubsystem extends SubsystemBase {
  //define the gyro
  private static ADIS16470_IMU gyro = new ADIS16470_IMU();

  private int gyroOffset = 0;

  //odemitry class for tracking robot pose
  public SwerveDriveOdometry m_odemetry = 
    new SwerveDriveOdometry(DriveConstants.driveKinematics, gyro.getAngle());
  private final ShuffleboardTab moduleTab = Shuffleboard.getTab("Module Info");
  
  public DriveSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
