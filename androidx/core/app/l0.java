package androidx.core.app;

import android.app.Notification.Action;
import android.app.RemoteInput;
import android.os.Bundle;
import androidx.annotation.DoNotInline;

public abstract class l0 {
    @DoNotInline
    public static Bundle a(Notification.Action notification$Action0) {
        return notification$Action0.getExtras();
    }

    @DoNotInline
    public static RemoteInput[] b(Notification.Action notification$Action0) {
        return notification$Action0.getRemoteInputs();
    }
}

