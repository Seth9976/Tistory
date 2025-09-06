package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import androidx.annotation.DoNotInline;

public abstract class d {
    @DoNotInline
    public static ColorFilter a(int v, Object object0) {
        return new BlendModeColorFilter(v, ((BlendMode)object0));
    }
}

