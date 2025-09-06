package androidx.core.app;

import android.app.RemoteInput.Builder;
import android.app.RemoteInput;
import androidx.annotation.DoNotInline;

public abstract class b3 {
    @DoNotInline
    public static int a(Object object0) {
        return ((RemoteInput)object0).getEditChoicesBeforeSending();
    }

    @DoNotInline
    public static RemoteInput.Builder b(RemoteInput.Builder remoteInput$Builder0, int v) {
        return remoteInput$Builder0.setEditChoicesBeforeSending(v);
    }
}

