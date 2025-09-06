package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class BitmapCompat {
    public static int a(int v, int v1, int v2, int v3) {
        if(v2 == 0) {
            return v1;
        }
        return v2 <= 0 ? v1 << -v2 - 1 : v * (1 << v3 - v2);
    }

    @NonNull
    public static Bitmap createScaledBitmap(@NonNull Bitmap bitmap0, int v, int v1, @Nullable Rect rect0, boolean z) {
        Bitmap bitmap5;
        Rect rect3;
        Bitmap bitmap4;
        int v7;
        Paint paint2;
        double f2;
        Paint paint1;
        if(v <= 0 || v1 <= 0) {
            throw new IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if(rect0 != null && (rect0.isEmpty() || rect0.left < 0 || rect0.right > bitmap0.getWidth() || rect0.top < 0 || rect0.bottom > bitmap0.getHeight())) {
            throw new IllegalArgumentException("srcRect must be contained by srcBm!");
        }
        int v2 = Build.VERSION.SDK_INT;
        Bitmap bitmap1 = v2 < 27 ? bitmap0 : a.a(bitmap0);
        int v3 = rect0 == null ? bitmap0.getWidth() : rect0.width();
        int v4 = rect0 == null ? bitmap0.getHeight() : rect0.height();
        float f = ((float)v) / ((float)v3);
        float f1 = ((float)v1) / ((float)v4);
        int v5 = rect0 == null ? 0 : rect0.left;
        int v6 = rect0 == null ? 0 : rect0.top;
        if(v5 == 0 && v6 == 0 && v == bitmap0.getWidth() && v1 == bitmap0.getHeight()) {
            return !bitmap0.isMutable() || bitmap0 != bitmap1 ? bitmap1 : bitmap0.copy(bitmap0.getConfig(), true);
        }
        Paint paint0 = new Paint(1);
        paint0.setFilterBitmap(true);
        if(v2 >= 29) {
            b.a(paint0);
        }
        else {
            paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
        if(v3 == v && v4 == v1) {
            Bitmap bitmap2 = Bitmap.createBitmap(v, v1, bitmap1.getConfig());
            new Canvas(bitmap2).drawBitmap(bitmap1, ((float)(-v5)), ((float)(-v6)), paint0);
            return bitmap2;
        }
        if(f > 1.0f) {
            paint1 = paint0;
            f2 = Math.ceil(Math.log(f) / 0.693147);
        }
        else {
            paint1 = paint0;
            f2 = Math.floor(Math.log(f) / 0.693147);
        }
        double f3 = f1 > 1.0f ? Math.ceil(Math.log(f1) / 0.693147) : Math.floor(Math.log(f1) / 0.693147);
        if(!z || v2 < 27 || a.c(bitmap0)) {
            paint2 = paint1;
            bitmap4 = null;
            v7 = 0;
        }
        else {
            Bitmap bitmap3 = a.b((((int)f2) <= 0 ? v3 : BitmapCompat.a(v3, v, 1, ((int)f2))), (((int)f3) <= 0 ? v4 : BitmapCompat.a(v4, v1, 1, ((int)f3))), bitmap0, true);
            paint2 = paint1;
            new Canvas(bitmap3).drawBitmap(bitmap1, ((float)(-v5)), ((float)(-v6)), paint2);
            v7 = 1;
            v6 = 0;
            v5 = 0;
            bitmap4 = bitmap1;
            bitmap1 = bitmap3;
        }
        Rect rect1 = new Rect(v5, v6, v3, v4);
        Rect rect2 = new Rect();
        int v8 = (int)f2;
        int v9 = (int)f3;
        while(v8 != 0 || v9 != 0) {
            if(v8 < 0) {
                ++v8;
            }
            else if(v8 > 0) {
                --v8;
            }
            if(v9 < 0) {
                ++v9;
            }
            else if(v9 > 0) {
                --v9;
            }
            rect2.set(0, 0, BitmapCompat.a(v3, v, v8, ((int)f2)), BitmapCompat.a(v4, v1, v9, ((int)f3)));
            boolean z1 = v8 == 0 && v9 == 0;
            boolean z2 = bitmap4 != null && bitmap4.getWidth() == v && bitmap4.getHeight() == v1;
            if(bitmap4 == null || bitmap4 == bitmap0) {
                rect3 = rect2;
            }
            else if(z) {
                rect3 = rect2;
                if(Build.VERSION.SDK_INT < 27 || a.c(bitmap4)) {
                    goto label_67;
                }
            }
            else {
                rect3 = rect2;
            label_67:
                if(!z1 || z2 && v7 == 0) {
                    bitmap5 = bitmap4;
                    goto label_76;
                }
            }
            if(bitmap4 != bitmap0 && bitmap4 != null) {
                bitmap4.recycle();
            }
            int v10 = BitmapCompat.a(v3, v, (v8 <= 0 ? v8 : v7), ((int)f2));
            int v11 = BitmapCompat.a(v4, v1, (v9 <= 0 ? v9 : v7), ((int)f3));
            bitmap5 = Build.VERSION.SDK_INT < 27 ? Bitmap.createBitmap(v10, v11, bitmap1.getConfig()) : a.b(v10, v11, bitmap0, z && !z1);
        label_76:
            new Canvas(bitmap5).drawBitmap(bitmap1, rect1, rect3, paint2);
            rect1.set(rect3);
            Bitmap bitmap6 = bitmap1;
            bitmap1 = bitmap5;
            rect2 = rect3;
            bitmap4 = bitmap6;
        }
        if(bitmap4 != bitmap0 && bitmap4 != null) {
            bitmap4.recycle();
        }
        return bitmap1;
    }

    public static int getAllocationByteCount(@NonNull Bitmap bitmap0) {
        return bitmap0.getAllocationByteCount();
    }

    public static boolean hasMipMap(@NonNull Bitmap bitmap0) {
        return bitmap0.hasMipMap();
    }

    public static void setHasMipMap(@NonNull Bitmap bitmap0, boolean z) {
        bitmap0.setHasMipMap(z);
    }
}

