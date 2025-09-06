package c3;

import android.content.res.Resources;
import androidx.annotation.DimenRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

public abstract class e {
    @DoNotInline
    public static float a(@NonNull Resources resources0, @DimenRes int v) {
        return resources0.getFloat(v);
    }
}

