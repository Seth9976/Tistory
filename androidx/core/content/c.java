package androidx.core.content;

import android.content.Context;
import androidx.annotation.DoNotInline;
import java.io.File;

public abstract class c {
    @DoNotInline
    public static Context a(Context context0) {
        return context0.createDeviceProtectedStorageContext();
    }

    @DoNotInline
    public static File b(Context context0) {
        return context0.getDataDir();
    }

    @DoNotInline
    public static boolean c(Context context0) {
        return context0.isDeviceProtectedStorage();
    }
}

