package edu.kis.vh.nursery;

import edu.kis.vh.nursery.structures.IntArrayStack;
import edu.kis.vh.nursery.structures.IntStructure;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer(new IntArrayStack());

    public FIFORhymer(IntStructure intStructure) {
        super(intStructure);
    }

    public FIFORhymer() {
    }

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
