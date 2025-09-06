package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class v {
    @DoNotInline
    public static int a(@Nullable AppOpsManager appOpsManager0, @NonNull String s, int v, @NonNull String s1) {
        return appOpsManager0 == null ? 1 : appOpsManager0.checkOpNoThrow(s, v, s1);
    }

    @DoNotInline
    @NonNull
    public static String b(@NonNull Context context0) {
        return context0.getOpPackageName();
    }

    @DoNotInline
    @Nullable
    public static AppOpsManager c(@NonNull Context context0) {
        return (AppOpsManager)context0.getSystemService(AppOpsManager.class);
    }
}

