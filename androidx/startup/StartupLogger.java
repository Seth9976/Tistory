package androidx.startup;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY})
public final class StartupLogger {
    public static void e(@NonNull String s, @Nullable Throwable throwable0) {
        Log.e("StartupLogger", s, throwable0);
    }

    public static void i(@NonNull String s) {
        Log.i("StartupLogger", s);
    }

    public static void w(@NonNull String s) {
        Log.w("StartupLogger", s);
    }
}

