#pragma config(StandardModel, "teddy")
//*!!Code automatically generated by 'ROBOTC' configuration wizard               !!*//

#include "../library/sensors/drivers/hitechnic-protoboard.h"
#include "../library/limitSwitch.h"

task main()
{
    limitSwitchInit(5);

    motor[leftElevator] = -20;
    motor[rightElevator] = 20;

    while (!isLimitSwitchClosed())
    {
        nxtDisplayTextLine(2, "Left %d", nMotorEncoder[leftElevator]);
        nxtDisplayTextLine(3, "Right %d", nMotorEncoder[rightElevator]);
    }

    motor[leftElevator] = 0;
    motor[rightElevator] = 0;

}
