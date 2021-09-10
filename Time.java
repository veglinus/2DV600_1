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
            }
        }
    }
}
