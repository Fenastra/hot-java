package RealTimeTest;

public class Data {
        // A Minecraft tick in milliseconds
    final int tick = 50;
    // Sets the amount of time elapsed to zero ticks initially
    final int originalTimeMilli = 0;
    int originalTimeTick = originalTimeMilli / tick;
    // The amount of time a "24 hour cycle" takes in Minecraft measured in ticks, which is in reality, 20 minutes.
    final int originalDayMilli = 1200000;
    final int originalDayTick = originalDayMilli / tick;
    int newTimeTick = 0;
    final int newDayMilli = 86400000;
    final int newDayTick = newDayMilli / tick;
}
