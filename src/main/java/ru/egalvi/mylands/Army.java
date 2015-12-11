package ru.egalvi.mylands;

/**
 */
public class Army {
    Unit carrier = new Unit(0, 0L);
    Unit infantry = new Unit(0, 0L);
    Unit horseman = new Unit(0, 0L);
    Unit flying = new Unit(0, 0L);
    Unit archer = new Unit(0, 0L);
    Unit healer = new Unit(0, 0L);
    Unit assassin = new Unit(0, 0L);
    Unit magician = new Unit(0, 0L);

    private Army() {
    }

    public Army(Unit carrier, Unit infantry, Unit horseman, Unit flying, Unit archer, Unit healer, Unit assassin, Unit magician) {
        this.carrier = carrier;
        this.infantry = infantry;
        this.horseman = horseman;
        this.flying = flying;
        this.archer = archer;
        this.healer = healer;
        this.assassin = assassin;
        this.magician = magician;
    }

    public boolean isEmpty() {
        return carrier.count == 0 && infantry.count == 0 && horseman.count == 0 && flying.count == 0 && archer.count == 0
                && healer.count == 0 && assassin.count == 0 && magician.count == 0;
    }

    public static class Builder {
        private Army army;

        public Builder() {
            army = new Army();
        }

        public Builder withCarrier(int level, long count) {
            army.carrier = new Unit(level, count);
            return this;
        }

        public Builder withInfantry(int level, long count) {
            army.infantry = new Unit(level, count);
            return this;
        }

        public Builder withHorseman(int level, long count) {
            army.horseman = new Unit(level, count);
            return this;
        }

        public Builder withFlying(int level, long count) {
            army.flying = new Unit(level, count);
            return this;
        }

        public Builder withArcher(int level, long count) {
            army.archer = new Unit(level, count);
            return this;
        }

        public Builder withHealer(int level, long count) {
            army.healer = new Unit(level, count);
            return this;
        }

        public Builder withAssassin(int level, long count) {
            army.assassin = new Unit(level, count);
            return this;
        }

        public Builder withMagician(int level, long count) {
            army.magician = new Unit(level, count);
            return this;
        }

        public Army build() {
            return army;
        }
    }
}
