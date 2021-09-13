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

        if (this.minutes < 0) { // Handles negative minutes, convert an hour to 60 mins
            this.hours--;
            this.minutes += 60;
        }

        if (this.hours < 0) {
            throw new IllegalArgumentException("Hours cannot exceed minus zero.");
        }

        if (this.hours > 23) {
            throw new IllegalArgumentException("Hours cannot exceed 24 hours.");
        }
        if (this.seconds < 0) {
            throw new IllegalArgumentException("Seconds cannot exceed less than 0.");
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

    public void tick() {
        this.seconds++;
        validate();
    }

    public void tickDown() {
        this.seconds--;
        validate();
    }

    public Time addTime(Time time) {

        int oldHours = this.hours + time.hours;
        int oldMinutes = this.minutes + time.minutes;
        int oldSeconds = this.seconds + time.seconds;

        return new Time(oldHours, oldMinutes, oldSeconds);
    }

    public Time subtractTime(Time time) {

        int oldHours = this.hours - time.hours;
        int oldMinutes = this.minutes - time.minutes;
        int oldSeconds = this.seconds - time.seconds;

        return new Time(oldHours, oldMinutes, oldSeconds);
    }

    public String toString() {

        String timeString = "";

        if (this.hours < 10) { // If less than 10, we need a leading zero for correct formatting
            timeString += "0" + this.hours;
        } else {
            timeString += this.hours;
        }

        timeString += ":";

        if (this.minutes < 10) {
            timeString += "0" + this.minutes;
        } else {
            timeString += this.minutes;
        }

        timeString += ":";

        if (this.seconds < 10) {
            timeString += "0" + this.seconds;
        } else {
            timeString += this.seconds;
        }

        return timeString;
    }
}
