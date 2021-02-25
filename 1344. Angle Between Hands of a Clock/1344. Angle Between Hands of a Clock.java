package 1344. Angle Between Hands of a Clock;

public class 1344. Angle Between Hands of a Clock {
	public static double angleClock(int hour, int minutes) {
        double res = (double )minutes/2;
        if( Math.abs(hour*30 + res - minutes*6) > 180)
            return 180 - ( Math.abs(hour*30 + res - minutes*6) %360 - 180);
        return Math.abs(hour*30 + res - minutes*6) %360;
    }
}
