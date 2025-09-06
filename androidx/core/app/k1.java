package androidx.core.app;

import android.app.RemoteInput;
import androidx.annotation.DoNotInline;

public abstract class k1 {
    @DoNotInline
    public static int a(RemoteInput remoteInput0) {
        return remoteInput0.getEditChoicesBeforeSending();
    }
}

