import java.util.Set;

import javax.xml.validation.Validator;

// TODO: this

public class Time {
    int hours;
    int minutes;
    int seconds;


    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int input) {
        if (input < 59) {
            this.hours = 0;
            this.minutes = 0;
            this.seconds = input;
        } else {
            if (input < 3419) { // if less than 59 minutes 59 seconds
                this.hours = 0;
                this.minutes = (input - (input % 60)) / 60;
                this.seconds = input % 60;
            } else { // Has more than 1 hour of time
                this.hours = (input - (input % 60)) / 60;
                var input2 = input % 60;
                this.minutes = (input2 - (input2 % 60)) / 60;
                this.seconds = input2 % 60;

                if (this.hours > 24) {
                    throw new IllegalArgumentException("Hours cannot be more than 24.");
                }
            }
        }
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
