package androidx.core.graphics;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.ColorSpace.Named;
import android.graphics.ColorSpace;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;

public abstract class a {
    @DoNotInline
    public static Bitmap a(Bitmap bitmap0) {
        return bitmap0.getConfig() == Bitmap.Config.HARDWARE ? bitmap0.copy((Build.VERSION.SDK_INT < 0x1F ? Bitmap.Config.ARGB_8888 : c.a(bitmap0)), true) : bitmap0;
    }

    @DoNotInline
    public static Bitmap b(int v, int v1, Bitmap bitmap0, boolean z) {
        Bitmap.Config bitmap$Config0 = bitmap0.getConfig();
        ColorSpace colorSpace0 = bitmap0.getColorSpace();
        ColorSpace colorSpace1 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        if(z && !bitmap0.getColorSpace().equals(colorSpace1)) {
            return Bitmap.createBitmap(v, v1, Bitmap.Config.RGBA_F16, bitmap0.hasAlpha(), colorSpace1);
        }
        if(bitmap0.getConfig() == Bitmap.Config.HARDWARE) {
            bitmap$Config0 = Bitmap.Config.ARGB_8888;
            if(Build.VERSION.SDK_INT >= 0x1F) {
                bitmap$Config0 = c.a(bitmap0);
            }
        }
        return Bitmap.createBitmap(v, v1, bitmap$Config0, bitmap0.hasAlpha(), colorSpace0);
    }

    @DoNotInline
    public static boolean c(Bitmap bitmap0) {
        ColorSpace colorSpace0 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        return bitmap0.getConfig() == Bitmap.Config.RGBA_F16 && bitmap0.getColorSpace().equals(colorSpace0);
    }
}

