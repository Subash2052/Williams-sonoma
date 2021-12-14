package org.example.zipcode.service;

import org.example.zipcode.comparator.PairZipCodeComparator;
import org.example.zipcode.model.PairZipCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZipCodeService {


    /**
     * optimize and remove overlapping zipcode pairs
     * <p>
     * greedy solution
     * greedy function is designed in a way that we are trying to compare
     * with the the pair sorted in the order of the start
     *
     * @param zipCodes List<PairZipCode>
     * @return List<PairZipCode>
     */
    public List<PairZipCode> doOptimisation(List<PairZipCode> zipCodes) {
        //sort based on start value of zip-code
        Collections.sort(zipCodes, new PairZipCodeComparator());

        //construct output in to this and use it to peek the latest element
        List<PairZipCode> optimised = new ArrayList<>();
        //add the first ele at the starting
        optimised.add(zipCodes.get(0));

        for (int index = 1; index < zipCodes.size(); index++) {
            PairZipCode prev = optimised.get(optimised.size() - 1);
            PairZipCode curr = zipCodes.get(index);

            //if the start of next is less than end of first its the case of overlapping
            if (prev.getEnd() >= curr.getStart()) {
                //update end, if the end of the pair with lower start is more
                if (prev.getEnd() < curr.getEnd()) {
                    prev.updateEnd(curr.getEnd());
                }
            } else {
                optimised.add(curr);
            }
        }

        return optimised;
    }

}
