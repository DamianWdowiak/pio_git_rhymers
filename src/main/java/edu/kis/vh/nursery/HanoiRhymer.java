package edu.kis.vh.nursery;

import edu.kis.vh.nursery.structures.IntStructure;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public HanoiRhymer(IntStructure intStructure) {
        super(intStructure);
    }

    public HanoiRhymer() {
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
// alt + ← and alt + →
// switching between opened files
