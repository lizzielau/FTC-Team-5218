#pragma config(StandardModel, "teddy")
//*!!Code automatically generated by 'ROBOTC' configuration wizard               !!*//

#define ENCPERINCH 108

#include "../library/sensors/drivers/hitechnic-irseeker-v2.h"
#include "../library/sensors/drivers/hitechnic-compass.h"
#include "../library/sensors/drivers/hitechnic-protoboard.h"
#include "../library/DrivetrainSquare.c"
#include "../library/dead_reckon.h"

segment_t dead_reckon_from_b3[1];

void initSegment(segment_t *seg, int idx, int turn, int inches, int speed)
{
    seg[idx].turn = turn;
    seg[idx].inches = inches;
    seg[idx].speed = speed;
}

task main()
{
    initSegment(dead_reckon_from_b3, 0, -90, 0, 100);

    deadReckon(dead_reckon_from_b3);

    while (1) {}
}
