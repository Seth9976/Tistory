package androidx.core.graphics;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.annotation.DoNotInline;

public abstract class c {
    @DoNotInline
    public static Bitmap.Config a(Bitmap bitmap0) {
        return bitmap0.getHardwareBuffer().getFormat() == 22 ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
    }
}

