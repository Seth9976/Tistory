package androidx.core.graphics;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g.b;

public class BlendModeColorFilterCompat {
    @Nullable
    public static ColorFilter createBlendModeColorFilterCompat(int v, @NonNull BlendModeCompat blendModeCompat0) {
        if(Build.VERSION.SDK_INT >= 29) {
            Object object0 = f.a(blendModeCompat0);
            return object0 == null ? null : d.a(v, object0);
        }
        PorterDuff.Mode porterDuff$Mode0 = b.u(blendModeCompat0);
        return porterDuff$Mode0 != null ? new PorterDuffColorFilter(v, porterDuff$Mode0) : null;
    }
}

