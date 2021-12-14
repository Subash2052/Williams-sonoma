package org.example.zipcode.comparator;

import org.example.zipcode.model.PairZipCode;

import java.util.Comparator;

public class PairZipCodeComparator implements Comparator<PairZipCode> {

    @Override
    public int compare(PairZipCode p1, PairZipCode p2) {
        return p1.getStart().compareTo(p2.getStart());
    }
}
