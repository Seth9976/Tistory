package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.DoNotInline;

public abstract class y2 {
    @DoNotInline
    public static void a(Object object0, Intent intent0, Bundle bundle0) {
        RemoteInput.addResultsToIntent(((RemoteInput[])object0), intent0, bundle0);
    }

    @DoNotInline
    public static Bundle b(Intent intent0) {
        return RemoteInput.getResultsFromIntent(intent0);
    }
}

