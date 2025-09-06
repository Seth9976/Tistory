package androidx.core.app;

import android.app.RemoteAction;
import androidx.annotation.DoNotInline;

public abstract class x2 {
    @DoNotInline
    public static void a(RemoteAction remoteAction0, boolean z) {
        remoteAction0.setShouldShowIcon(z);
    }

    @DoNotInline
    public static boolean b(RemoteAction remoteAction0) {
        return remoteAction0.shouldShowIcon();
    }
}

