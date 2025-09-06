package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import androidx.annotation.DoNotInline;

public abstract class a3 {
    @DoNotInline
    public static int a(Intent intent0) {
        return RemoteInput.getResultsSource(intent0);
    }

    @DoNotInline
    public static void b(Intent intent0, int v) {
        RemoteInput.setResultsSource(intent0, v);
    }
}

