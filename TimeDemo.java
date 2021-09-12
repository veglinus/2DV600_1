
public class TimeDemo {
    public static void main(String[] args) { // TODO
        /**
         * instantiate a Time object timeA using an integer value obtained from the keyboard. The
        integer value represents seconds passed since midnight.
        • tick the clock ten times by applying its tick() method and print out the time after each tick.
        • Extend your code by appending to it instructions instantiating a Time object timeB by using
        three integers (hours, minutes, seconds) read from the keyboard.
        • Then tick the clock ten times, printing the time after each tick.
        • Add the timeB time in timeA by calling method addTime method and print sum of the time
        returned by the addTime method.
        • Create a reference timeC that should reference to object of difference of timeA and timeB
        by calling the method subtracTime (), print the time represented by the reference timeC.
         */

        var test = new Time(3, 61, 61);
        System.out.println(test.hours + ":" + test.minutes + ":" + test.seconds);
        
    }
}
