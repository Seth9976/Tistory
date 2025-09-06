package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g.b;

public final class PaintCompat {
    static {
        new ThreadLocal();
    }

    public static boolean hasGlyph(@NonNull Paint paint0, @NonNull String s) {
        return i.a(paint0, s);
    }

    public static boolean setBlendMode(@NonNull Paint paint0, @Nullable BlendModeCompat blendModeCompat0) {
        PorterDuffXfermode porterDuffXfermode0 = null;
        if(Build.VERSION.SDK_INT >= 29) {
            if(blendModeCompat0 != null) {
                porterDuffXfermode0 = f.a(blendModeCompat0);
            }
            j.a(paint0, porterDuffXfermode0);
            return true;
        }
        if(blendModeCompat0 != null) {
            PorterDuff.Mode porterDuff$Mode0 = b.u(blendModeCompat0);
            if(porterDuff$Mode0 != null) {
                porterDuffXfermode0 = new PorterDuffXfermode(porterDuff$Mode0);
            }
            paint0.setXfermode(porterDuffXfermode0);
            return porterDuff$Mode0 != null;
        }
        paint0.setXfermode(null);
        return true;
    }
}

