public class SequenceManager {
    private static int sequence = 1;

    public static int getNextSequence(){
        return sequence++;
    }
}
