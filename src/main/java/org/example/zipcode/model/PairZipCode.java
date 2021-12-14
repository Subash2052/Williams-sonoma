package org.example.zipcode.model;

import java.util.Objects;

public class PairZipCode {

    private Integer start;
    private Integer end;


    public PairZipCode(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public Integer getStart() {
        return start;
    }

    public Integer getEnd() {
        return end;
    }

    public void updateEnd(Integer end) {
        this.end = end;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PairZipCode{");
        sb.append("start=").append(start);
        sb.append(", end=").append(end);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PairZipCode that = (PairZipCode) o;
        if (!Objects.equals(start, that.start)) return false;
        return Objects.equals(end, that.end);
    }

    @Override
    public int hashCode() {
        int result = start != null ? start.hashCode() : 0;
        result = 31 * result + (end != null ? end.hashCode() : 0);
        return result;
    }
}
