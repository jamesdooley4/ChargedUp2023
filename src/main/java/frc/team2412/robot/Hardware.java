package frc.team2412.robot;

import edu.wpi.first.cscore.UsbCamera;

public class Hardware {
	public static final int CAN_TIMEOUT_MS = 20;

	public static final int PDP_ID = 1;

	// Drive devices are from range 1-19
	public static final int DRIVEBASE_FRONT_LEFT_DRIVE_MOTOR = 1,
			DRIVEBASE_FRONT_RIGHT_DRIVE_MOTOR = 4,
			DRIVEBASE_BACK_LEFT_DRIVE_MOTOR = 7,
			DRIVEBASE_BACK_RIGHT_DRIVE_MOTOR = 10;
	public static final int DRIVEBASE_FRONT_LEFT_ANGLE_MOTOR = 2,
			DRIVEBASE_FRONT_RIGHT_ANGLE_MOTOR = 5,
			DRIVEBASE_BACK_LEFT_ANGLE_MOTOR = 8,
			DRIVEBASE_BACK_RIGHT_ANGLE_MOTOR = 11;
	public static final int DRIVEBASE_FRONT_LEFT_ENCODER_PORT = 3,
			DRIVEBASE_FRONT_RIGHT_ENCODER_PORT = 6,
			DRIVEBASE_BACK_LEFT_ENCODER_PORT = 9,
			DRIVEBASE_BACK_RIGHT_ENCODER_PORT = 12;

	public static final int GYRO_PORT = 13;

	// Cameras
	public static final String DRIVER_VISION_PATH;

	static {
		String path = null;
		System.out.println("Searching for driver vision camera...");
		for (var camInfo : UsbCamera.enumerateUsbCameras()) {
			System.out.println("Found camera with name " + camInfo.name);
			// On bonk "0c" at the end was removed, don't know why
			if (camInfo.name.contains(" C93")) {
				path = camInfo.path;
			}
		}
		System.out.println("Done searching for driver vision camera");
		DRIVER_VISION_PATH = path;
	}

	public static final String PHOTON_CAM = "OV5647";
	public static final double cameraYawDegrees = -12;

	// Arm devices are from range 20 - 29
	public static final int ARM_MOTOR = 20, WRIST_MOTOR = 21;
	public static final int SHOULDER_ENCODER_PORT_A = 0,
			SHOULDER_ENCODER_PORT_B = 1,
			ELBOW_ENCODER_PORT_A = 2,
			ELBOW_ENCODER_PORT_B = 3,
			WRIST_ENCODER_PORT_A = 4,
			WRIST_ENCODER_PORT_B = 5;

	// Intake devices are ports 30-39
	public static final int INTAKE_MOTOR_1 = 30;

	public static final int INTAKE_DISTANCE_SENSOR = 6, INTAKE_COLOR_SENSOR = 7;
}
