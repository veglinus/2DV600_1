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

        validate();
    }

    public Time(int input) {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    
        int inputMinutes = (input - (input % 60)) / 60; // All seconds in minutes
        this.seconds = input % 60; // The rest of above is seconds leftover

        // Convert the minutes into hrs
        this.hours = (inputMinutes - (inputMinutes % 60)) / 60;
        this.minutes = inputMinutes % 60; // The rest is minutes that is not dividable by 60
    }
    
    public void validate() { // Validates so seconds or minutes are never higher than 60
        if (this.seconds > 60) { // If there are more than 60 seconds, convert to minutes
            this.minutes += (this.seconds - (this.seconds % 60)) / 60;
            this.seconds = this.seconds % 60;
        }

        if (this.minutes > 60) { // And if there are more than 60 minutes, convert to hours
            this.hours += (this.minutes - (this.minutes % 60)) / 60;
            this.minutes = this.minutes % 60;
        }
    }
}