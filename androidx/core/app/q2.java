package androidx.core.app;

import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent.OnFinished;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class q2 {
    @DoNotInline
    public static void a(@NonNull PendingIntent pendingIntent0, @NonNull Context context0, int v, @NonNull Intent intent0, @Nullable PendingIntent.OnFinished pendingIntent$OnFinished0, @Nullable Handler handler0, @Nullable String s, @Nullable Bundle bundle0) throws PendingIntent.CanceledException {
        pendingIntent0.send(context0, v, intent0, pendingIntent$OnFinished0, handler0, s, bundle0);
    }
}

