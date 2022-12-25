// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;

public final class Constants {
    public static final class DriveConstants {
        //motor and encoder CAN IDs
        public static final int frontRightTurnMotor = 1;
        public static final int frontRightDriveMotor = 2;
        public static final int frontRightEncoder = 3;

        public static final int frontLeftTurnMotor = 10;
        public static final int frontLeftDriveMotor = 11;
        public static final int frontLeftEncoder = 12;
        
        public static final int backRightTurnMotor = 4;
        public static final int backRightDriveMotor = 5;
        public static final int backRightEncoder = 6;

        public static final int backLeftTurnMotor = 7;
        public static final int backLeftDriveMotor = 8;
        public static final int backLeftEncoder = 9;

        //angle offsets
        public static final double frontRightOffset = 133.24;
        public static final double frontLeftOffset = 34.36;
        public static final double backRightOffset = 348.04;
        public static final double backLeftOfset = 119.53;

        //encoder inversion

        public static final boolean frontRightTurnInvert = false;
        public static final boolean frontLeftTurnInvert = false;
        public static final boolean backRightTurnInvert = false;
        public static final boolean backLeftTurnInvert = false;

        public static final boolean frontRightDriveInvert = false;
        public static final boolean frontLeftDriveInvert = false;
        public static final boolean backRightDriveInvert = false;
        public static final boolean backLeftDriveInvert = false;

        //distance between the centers of the right and left wheels
        public static final double trackWidth = Units.inchesToMeters(24.875);
        //distance between the centers of the front and back wheels.
        public static final double wheelBase = Units.inchesToMeters(24.875);
        public static final SwerveDriveKinematics driveKinematics =
            new SwerveDriveKinematics(
                new Translation2d(wheelBase / 2, trackWidth / 2),
                new Translation2d(wheelBase / 2, -trackWidth / 2),
                new Translation2d(-wheelBase / 2, trackWidth / 2),
                new Translation2d(-wheelBase / 2, - trackWidth / 2));
        public static final boolean EncoderReversed = true;

        //values to scale joystick inputs to desired states
        public static final double maxSpeedMPS = 4.5;
        public static final double maxRotationSPeed = 3 * Math.PI;

        //Drive MotorPID values
        public static final double driveKS = 0.064686; 
        public static final double driveKV = 2.4071;
        public static final double driveKA = 0.066756;
    }
}
