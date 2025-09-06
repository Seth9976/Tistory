package androidx.core.content.res;

import android.content.res.Resources;
import androidx.annotation.NonNull;

public final class ConfigurationHelper {
    public static int getDensityDpi(@NonNull Resources resources0) {
        return resources0.getConfiguration().densityDpi;
    }
}

