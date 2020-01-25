package test;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import opmodes.calibration.HisaishiCalibration;
import team25core.DeadmanMotorTask;
import team25core.GamepadTask;
import team25core.MechanumGearedDrivetrain;
import team25core.Robot;
import team25core.RobotEvent;
import team25core.StandardFourMotorRobot;
import team25core.TankMechanumControlScheme;
import team25core.TeleopDriveTask;

@TeleOp(name = "Motor Test")
@Disabled
public class MotorTest extends StandardFourMotorRobot {
    // teleop with the mecanum drivetrain and linear lift
    // active wheel intake

    /* GAMEPAD 2
    // linear lift up (right bumper) down (right trigger)
    // active wheel intake in (A) out (B)
     */

    /* GAMEPAD 1
    // drivetrain
    // slow mode!
     */
    private MechanumGearedDrivetrain drivetrain;
    private TeleopDriveTask driveTask;
    private DcMotor lift;
    private Servo claw;
    private Servo susan;
    private Servo leftArm;
    private Servo rightArm;

    public void handleEvent (RobotEvent e) {

    }

    public void init()
    {
        leftArm = hardwareMap.servo.get("leftArm");
        rightArm = hardwareMap.servo.get("rightArm");

        drivetrain = new MechanumGearedDrivetrain(motorMap);
        drivetrain.setNoncanonicalMotorDirection();

        TankMechanumControlScheme scheme = new TankMechanumControlScheme(gamepad1, TankMechanumControlScheme.MotorDirection.NONCANONICAL);

        driveTask = new TeleopDriveTask(this, scheme, frontLeft, frontRight, backLeft, backRight);
        lift = hardwareMap.dcMotor.get("lift");
        claw = hardwareMap.servo.get("claw");
        susan = hardwareMap.servo.get("susan");
    }

    @Override
    public void start()
    {
        this.addTask(driveTask);

        // GAMEPAD 2
        DeadmanMotorTask liftUp = new DeadmanMotorTask(this, lift, HisaishiCalibration.LIFT_UP, GamepadTask.GamepadNumber.GAMEPAD_2, DeadmanMotorTask.DeadmanButton.RIGHT_BUMPER);
        addTask(liftUp);
        DeadmanMotorTask liftDown = new DeadmanMotorTask(this, lift, HisaishiCalibration.LIFT_DOWN, GamepadTask.GamepadNumber.GAMEPAD_2, DeadmanMotorTask.DeadmanButton.RIGHT_TRIGGER);
        addTask(liftDown);
    }

    @Override
    public void loop()
    {
        super.loop();
        if (gamepad1.a) {
            backLeft.setPower(0.3);
        }
        if (gamepad1.b) {
            frontLeft.setPower(0.3);
        }
    }
}
