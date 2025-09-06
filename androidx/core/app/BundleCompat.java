package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
public final class BundleCompat {
    @Nullable
    public static IBinder getBinder(@NonNull Bundle bundle0, @Nullable String s) {
        return bundle0.getBinder(s);
    }

    public static void putBinder(@NonNull Bundle bundle0, @Nullable String s, @Nullable IBinder iBinder0) {
        bundle0.putBinder(s, iBinder0);
    }
}

