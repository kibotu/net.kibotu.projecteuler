package net.kibotu.projecteuler.solved;

public class Date {
    int years;
    int months;
    int days;

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Date date = (Date) o;

        if (days != date.days) return false;
        if (months != date.months) return false;
        if (years != date.years) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = years;
        result = 31 * result + months;
        result = 31 * result + days;
        return result;
    }
}
