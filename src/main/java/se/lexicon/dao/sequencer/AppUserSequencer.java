package se.lexicon.dao.sequencer;

public class AppUserSequencer {

    private static int appSequencer;

    public static int nextAppUserId() {
        return ++appSequencer;
    }

    public static int getAppUserIdSequencer() {
        return appSequencer;
    }

}
