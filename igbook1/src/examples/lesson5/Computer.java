package Exercises.lesson5;

public class Computer {
    Powerstate state;


    public enum Powerstate {
        OFF("power is off"),
        ON("power is high"),
        SUSPEND("power usage is low");
        private String description;

        private Powerstate(String d) {
            description = d;

        }

        public String getDescription() {
            return description;
        }


    }

    public Powerstate getState() {
        return state;
    }

    public void setState(Powerstate state) {
        this.state = state;
    }
}

