package relicopmodes;

/**
 * Created by Lizzie on 10/28/2017.
 */

public class HisaishiCalibration {
    public static final int TICKS_PER_DEGREE = 17;
    public static final int TICKS_PER_INCH = 79;
    public static final double TURN_SPEED = 0.2;
    public static final double MOVE_SPEED = 0.75;

    // glyph mechanisms
    public static final double GLYPH_LIFT_ELEVATOR_POWER = 0.6;
    public static final double GLYPH_DROP_ELEVATOR_POWER = 0.1;
    public static final double GLYPH_OPEN_LEFT_POSITION = 254.0/256.0;
    public static final double GLYPH_OPEN_RIGHT_POSITION = 22.0/256.0;
    public static final double GLYPH_CLOSE_LEFT_POSITION = 150.0/256.0;
    public static final double GLYPH_CLOSE_RIGHT_POSITION = 136.0/256.0;
    public static final double GLYPH_HALF_OPEN_LEFT_POSITION = 215.0/256.0;
    public static final double GLYPH_HALF_OPEN_RIGHT_POSITION = 87.0/256.0;
    public static final double GLYPH_QUARTER_OPEN_LEFT_POSITION = 161.0/256.0;
    public static final double GLYPH_QUARTER_OPEN_RIGHT_POSITION = 113.0/256.0;
    public static final double GLYPH_LEFT_SLIDE_POWER = -1.0;
    public static final double GLYPH_RIGHT_SLIDE_POWER = 1.0;
    public static final double GLYPH_STOP_SLIDE_POWER = 0.0;

    // jewel
    public static final double JEWEL_Y_AXIS_DEPLOYED = 20.0/256.0;
    public static final double JEWEL_Y_AXIS_STOWED = 152.0/256.0;
    public static final double JEWEL_X_AXIS_NEUTRAL = 112.0/256.0;
    public static final double JEWEL_X_AXIS_FORWARD = 80.0/256.0;
    public static final double JEWEL_X_AXIS_BACK = 130.0/256.0;
    public static final double JEWEL_X_AXIS_STOW = 256.0/256.0;

    // Vuforia constants
    public static final int BLUE_BLUE_LOWER = 0x00;
    public static final int BLUE_RED_UPPER = 0xff;
    public static final int RED_RED_LOWER = 0x00;
    public static final int RED_BLUE_UPPER = 0xff;

    // relic mechanisms
    // take heed of integer and double values young grasshopper
    public static final double RELIC_GRABBER_OPEN_POSITION = 130.0/256.0;
    public static final double RELIC_GRABBER_CLOSE_POSITION = 100.0/256.0;

    public static final double RELIC_EXTENDER_POWER = 0.5;
    public static final double RELIC_CASTER_POWER = 0.55;
}
