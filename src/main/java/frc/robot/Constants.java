// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.pathplanner.lib.util.HolonomicPathFollowerConfig;
import com.pathplanner.lib.util.PIDConstants;
import com.pathplanner.lib.util.ReplanningConfig;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

// Controls
    public static final int DRIVER_XBOX_PORT = 0;

// Turbotake
    //Motors
    public static final int SHOOTER_MOTOR_ID1 = 10;
    public static final int SHOOTER_MOTOR_ID2 = 11;
    public static final int INDEXER_MOTOR_ID = 32;
    //Beam Break Sensor
    public static final int BEAM_BREAK_SENSOR_PORT = 1;
    //Constants
    public static final double INDEXER_SPEED = 0.1;
    public static final double SHOOTER_SPEED = 0.1;

    public static final double SPEAKER_SPEED = 1;
    public static final double AMP_SPEED = 1;
// Drivetrain
    public static final boolean FIELD_RELATIVE_DRIVE = true;
    public static final double LINEAR_SLOW_MODE_MODIFIER = 0.5;
    public static final double ANGULAR_SLOW_MODE_MODIFIER = 0.2;

    public static final double DRIVETRAIN_WIDTH = 0.5271; // Distance between center of left and right swerve wheels in meters
    public static final double DRIVETRAIN_LENGTH = 0.5271; // Distance between center of front and back swerve wheels in meters

    public static final int FRONT_LEFT_DRIVE_MOTOR_ID = 16;
    public static final int FRONT_LEFT_STEER_MOTOR_ID = 17;
    public static final int FRONT_LEFT_STEER_ENCODER_ID = 23;
    public static final double FRONT_LEFT_STEER_OFFSET = -Math.toRadians(24.697);

    public static final int FRONT_RIGHT_DRIVE_MOTOR_ID = 12;
    public static final int FRONT_RIGHT_STEER_MOTOR_ID = 13;
    public static final int FRONT_RIGHT_STEER_ENCODER_ID = 21;
    public static final double FRONT_RIGHT_STEER_OFFSET = -Math.toRadians(-72.510);

    public static final int BACK_LEFT_DRIVE_MOTOR_ID = 14;
    public static final int BACK_LEFT_STEER_MOTOR_ID = 15;
    public static final int BACK_LEFT_STEER_ENCODER_ID = 22;
    public static final double BACK_LEFT_STEER_OFFSET = -Math.toRadians(174.841);

    public static final int BACK_RIGHT_DRIVE_MOTOR_ID = 10;
    public static final int BACK_RIGHT_STEER_MOTOR_ID = 11;
    public static final int BACK_RIGHT_STEER_ENCODER_ID = 20;
    public static final double BACK_RIGHT_STEER_OFFSET = -Math.toRadians(57.920);

    public static final double WHEEL_DIAMETER = 0.1016;

    public static final double DRIVE_REDUCTION = (14.0 / 50.0) * (25.0 / 19.0) * (15.0 / 45.0); // reduction * motor rpm = wheel rpm
    public static final double STEER_REDUCTION = (14.0 / 50.0) * (10.0 / 60.0);

    public static final double MAX_ATTAINABLE_VELOCITY = 3.8;

    public static final double LINEAR_VELOCITY_CONSTRAINT = MAX_ATTAINABLE_VELOCITY;
    public static final double LINEAR_ACCEL_CONSTRAINT = 12.0;

    public static final double ANGULAR_VELOCITY_CONSTRAINT = (LINEAR_VELOCITY_CONSTRAINT * Math.PI) / (DRIVETRAIN_WIDTH * DRIVETRAIN_WIDTH + DRIVETRAIN_LENGTH * DRIVETRAIN_LENGTH);
    public static final double ANGULAR_ACCEL_CONSTRAINT = (LINEAR_ACCEL_CONSTRAINT * Math.PI) / (DRIVETRAIN_WIDTH * DRIVETRAIN_WIDTH + DRIVETRAIN_LENGTH * DRIVETRAIN_LENGTH);

    public static final HolonomicPathFollowerConfig HOLONOMIC_PATH_FOLLOWER_CONFIG = new HolonomicPathFollowerConfig(
        new PIDConstants(1.0, 0, 0),
        new PIDConstants(0, 0, 0),
        MAX_ATTAINABLE_VELOCITY,
        Math.sqrt(DRIVETRAIN_LENGTH*DRIVETRAIN_LENGTH + DRIVETRAIN_WIDTH*DRIVETRAIN_WIDTH)/2,
        new ReplanningConfig()
    );

    // FRC Field
    public static final double FIELD_WIDTH = 821; //cm approxiamation Field Length is 26ft. 11 1/8 in wide
    public static final double FIELD_LENGTH = 1654;

// Joint/Elevator
    public static final int JOINT_MOTOR_ID = 31;
    public static final int JOINT_MIDDLE_ZERO_SWITCH_CHANNEL = 0;
    public static final int JOINT_BOTTOM_ZERO_SWITCH_CHANNEL = 0;

    public static final double JOINT_MIN_POSITION = -10; // Code stop
    public static final double JOINT_MAX_POSITION = 60; // Code stop
    
    public static final double JOINT_STOW_POSITION = 0;
    public static final double JOINT_AMP_POSITION = 15;
    public static final double JOINT_SPEAKER_POSITION = 30;
    public static final double JOINT_TRAP_POSITION = 45;
    public static final double JOINT_INTAKE_POSITION = 70;

    public static final double[] JOINT_POSITIONS_ORDERED = { // Order in array corresponds to selector position
        JOINT_STOW_POSITION,
        JOINT_AMP_POSITION,
        JOINT_SPEAKER_POSITION,
        JOINT_TRAP_POSITION,
        JOINT_INTAKE_POSITION
    };

    public static double JOINT_POSITION_FROM_ROBOT_FRONT = 22.0; // Change later
    public static double JOINT_POSITION_FROM_ROBOT_BACK = 4.0;
    public static double JOINT_POSITION_FROM_ROBOT_LEFT = 11.0;
    public static double JOINT_POSITION_FROM_ROBOT_RIGHT = 11.0;
    public static double JOINT_POSITION_FROM_FLOOR = 5.0;

    public static double JOINT_RADIAN_PER_REVOLUTION = 0; // Change later
    public static double JOINT_VERTICAL_ANGLE = Math.PI/2; // Radians

    public static double VERTICAL_EXTENSION_LIMIT = 1.2192; // Meters
    public static double HORIZONTAL_EXTENSION_LIMIT = 0.3048;

    public static double ELEVATOR_MAX_EXTENSION = 35.0;

    public static final int ELEVATOR_MOTOR_ID = 0;
    public static final int ELEVATOR_ZERO_SWITCH_CHANNEL = 0;
    public static final double ELEVATOR_SLOW_MODE_MULTIPLIER = 0.5;

    // Position in rotations of the motor shaft before gearbox
    public static final double ELEVATOR_MIN_POSITION = 0; // Code stop
    public static final double ELEVATOR_MAX_POSITION = 0; // Code stop

    public static final double ELEVATOR_STOW_POSITION = 0;
    public static final double ELEVATOR_AMP_POSITION = 0;
    public static final double ELEVATOR_SPEAKER_POSITION = 0;
    public static final double ELEVATOR_TRAP_POSITION = 0;
    public static final double ELEVATOR_INTAKE_POSITION = 0;
    public static final double ELEVATOR_BUFFER_DISTANCE = 0;

    public static final double[] ELEVATOR_POSITIONS_ORDERED = { // Order in array corresponds to selector position
        ELEVATOR_STOW_POSITION,
        ELEVATOR_AMP_POSITION,
        ELEVATOR_SPEAKER_POSITION,
        ELEVATOR_TRAP_POSITION,
        ELEVATOR_INTAKE_POSITION
    };
}
