package tictactoe.detector;

import backtracking.detector.Detector;
import sequence.Sequence;

public enum NoDuplicatesAndAllElementsAreGridPositionsDetectorImpl_Skeleton implements Detector {
    SINGLETON;

    public Detector getIsDetectedPrecondition() {
        throw new RuntimeException("NOT IMPLEMENTED!");
    }

    public boolean isDetected(Sequence<Integer> sequence) {
        assert getIsDetectedPrecondition().isDetected(sequence) :
                String.format("sequence fails precondition!: sequence = %s", sequence);

        throw new RuntimeException("NOT IMPLEMENTED!");
    }
}