package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.DoNotInline;

public abstract class r2 {
    @DoNotInline
    public static PendingIntent a(Context context0, int v, Intent intent0, int v1) {
        return PendingIntent.getForegroundService(context0, v, intent0, v1);
    }
}

