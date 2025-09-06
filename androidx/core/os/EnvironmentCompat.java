package androidx.core.os;

import androidx.annotation.NonNull;
import java.io.File;

public final class EnvironmentCompat {
    @Deprecated
    public static final String MEDIA_UNKNOWN = "unknown";

    @NonNull
    public static String getStorageState(@NonNull File file0) {
        return f.a(file0);
    }
}

