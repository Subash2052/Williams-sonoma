import org.example.zipcode.model.PairZipCode;
import org.example.zipcode.service.ZipCodeService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ZipCodeServiceTest {

    @Test
    public void should_pass_doOptimisation_case_1() {
        ZipCodeService zipCodeService = new ZipCodeService();
        List<PairZipCode> pairZipCodes = new ArrayList<>();
        PairZipCode p1 = new PairZipCode(94133, 94133);
        PairZipCode p2 = new PairZipCode(94200, 94299);
        PairZipCode p3 = new PairZipCode(94600, 94699);
        pairZipCodes.add(p1);
        pairZipCodes.add(p2);
        pairZipCodes.add(p3);
        List<PairZipCode> optimized = zipCodeService.doOptimisation(pairZipCodes);
        assertEquals(optimized.size(), 3);
        assertEquals(optimized.get(0), p1);
        assertEquals(optimized.get(1), p2);
        assertEquals(optimized.get(2), p3);
    }

    @Test
    public void should_pass_doOptimisation_case_2() {
        ZipCodeService zipCodeService = new ZipCodeService();
        List<PairZipCode> pairZipCodes = new ArrayList<>();
        PairZipCode p1 = new PairZipCode(94133, 94133);
        PairZipCode p2 = new PairZipCode(94200, 94299);
        PairZipCode p3 = new PairZipCode(94226, 94399);
        pairZipCodes.add(p1);
        pairZipCodes.add(p2);
        pairZipCodes.add(p3);
        List<PairZipCode> optimized = zipCodeService.doOptimisation(pairZipCodes);
        assertEquals(optimized.size(), 2);
        assertEquals(optimized.get(0), p1);
        assertEquals(optimized.get(1), new PairZipCode(94200, 94399));
    }

    @Test
    public void should_pass_doOptimisation_case_3() {
        ZipCodeService zipCodeService = new ZipCodeService();
        List<PairZipCode> pairZipCodes = new ArrayList<>();
        PairZipCode p1 = new PairZipCode(94133, 94133);
        PairZipCode p2 = new PairZipCode(94200, 94299);
        PairZipCode p3 = new PairZipCode(94226, 94226);
        pairZipCodes.add(p1);
        pairZipCodes.add(p2);
        pairZipCodes.add(p3);
        List<PairZipCode> optimized = zipCodeService.doOptimisation(pairZipCodes);
        assertEquals(optimized.size(), 2);
        assertEquals(optimized.get(0), p1);
        assertEquals(optimized.get(1), p2);
    }


}
