package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.text.q;

public final class TransformationUtils {
    interface DrawRoundedCornerFn {
        void drawRoundedCorners(Canvas arg1, Paint arg2, RectF arg3);
    }

    public static final int PAINT_FLAGS = 6;
    public static final Paint a;
    public static final Paint b;
    public static final Paint c;
    public static final Lock d;

    static {
        TransformationUtils.a = new Paint(6);
        TransformationUtils.b = new Paint(7);
        ReentrantLock reentrantLock0 = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"})).contains(Build.MODEL) ? new ReentrantLock() : new p();  // 初始化器: Ljava/lang/Object;-><init>()V
        TransformationUtils.d = reentrantLock0;
        Paint paint0 = new Paint(7);
        TransformationUtils.c = paint0;
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(Bitmap bitmap0, Bitmap bitmap1, Matrix matrix0) {
        TransformationUtils.d.lock();
        try {
            Canvas canvas0 = new Canvas(bitmap1);
            canvas0.drawBitmap(bitmap0, matrix0, TransformationUtils.a);
            canvas0.setBitmap(null);
        }
        finally {
            TransformationUtils.d.unlock();
        }
    }

    public static Bitmap b(BitmapPool bitmapPool0, Bitmap bitmap0) {
        Bitmap.Config bitmap$Config0 = Bitmap.Config.RGBA_F16.equals(bitmap0.getConfig()) ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        if(bitmap$Config0.equals(bitmap0.getConfig())) {
            return bitmap0;
        }
        Bitmap bitmap1 = bitmapPool0.get(bitmap0.getWidth(), bitmap0.getHeight(), bitmap$Config0);
        new Canvas(bitmap1).drawBitmap(bitmap0, 0.0f, 0.0f, null);
        return bitmap1;
    }

    public static Bitmap c(BitmapPool bitmapPool0, Bitmap bitmap0, DrawRoundedCornerFn transformationUtils$DrawRoundedCornerFn0) {
        Bitmap.Config bitmap$Config0 = Bitmap.Config.RGBA_F16.equals(bitmap0.getConfig()) ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        Bitmap bitmap1 = TransformationUtils.b(bitmapPool0, bitmap0);
        Bitmap bitmap2 = bitmapPool0.get(bitmap1.getWidth(), bitmap1.getHeight(), bitmap$Config0);
        bitmap2.setHasAlpha(true);
        BitmapShader bitmapShader0 = new BitmapShader(bitmap1, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint0 = new Paint();
        paint0.setAntiAlias(true);
        paint0.setShader(bitmapShader0);
        RectF rectF0 = new RectF(0.0f, 0.0f, ((float)bitmap2.getWidth()), ((float)bitmap2.getHeight()));
        TransformationUtils.d.lock();
        try {
            Canvas canvas0 = new Canvas(bitmap2);
            canvas0.drawColor(0, PorterDuff.Mode.CLEAR);
            transformationUtils$DrawRoundedCornerFn0.drawRoundedCorners(canvas0, paint0, rectF0);
            canvas0.setBitmap(null);
        }
        finally {
            TransformationUtils.d.unlock();
        }
        if(!bitmap1.equals(bitmap0)) {
            bitmapPool0.put(bitmap1);
        }
        return bitmap2;
    }

    public static Bitmap centerCrop(@NonNull BitmapPool bitmapPool0, @NonNull Bitmap bitmap0, int v, int v1) {
        float f2;
        float f1;
        if(bitmap0.getWidth() == v && bitmap0.getHeight() == v1) {
            return bitmap0;
        }
        Matrix matrix0 = new Matrix();
        float f = 0.0f;
        if(bitmap0.getWidth() * v1 > bitmap0.getHeight() * v) {
            f1 = ((float)v1) / ((float)bitmap0.getHeight());
            f = q.z(bitmap0.getWidth(), f1, v, 0.5f);
            f2 = 0.0f;
        }
        else {
            f1 = ((float)v) / ((float)bitmap0.getWidth());
            f2 = q.z(bitmap0.getHeight(), f1, v1, 0.5f);
        }
        matrix0.setScale(f1, f1);
        matrix0.postTranslate(((float)(((int)(f + 0.5f)))), ((float)(((int)(f2 + 0.5f)))));
        Bitmap bitmap1 = bitmapPool0.get(v, v1, (bitmap0.getConfig() == null ? Bitmap.Config.ARGB_8888 : bitmap0.getConfig()));
        TransformationUtils.setAlpha(bitmap0, bitmap1);
        TransformationUtils.a(bitmap0, bitmap1, matrix0);
        return bitmap1;
    }

    public static Bitmap centerInside(@NonNull BitmapPool bitmapPool0, @NonNull Bitmap bitmap0, int v, int v1) {
        if(bitmap0.getWidth() <= v && bitmap0.getHeight() <= v1) {
            if(Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            }
            return bitmap0;
        }
        if(Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return TransformationUtils.fitCenter(bitmapPool0, bitmap0, v, v1);
    }

    public static Bitmap circleCrop(@NonNull BitmapPool bitmapPool0, @NonNull Bitmap bitmap0, int v, int v1) {
        int v2 = Math.min(v, v1);
        float f = ((float)v2) / 2.0f;
        int v3 = bitmap0.getWidth();
        int v4 = bitmap0.getHeight();
        float f1 = Math.max(((float)v2) / ((float)v3), ((float)v2) / ((float)v4));
        float f2 = ((float)v3) * f1;
        float f3 = f1 * ((float)v4);
        float f4 = (((float)v2) - f2) / 2.0f;
        float f5 = (((float)v2) - f3) / 2.0f;
        RectF rectF0 = new RectF(f4, f5, f2 + f4, f3 + f5);
        Bitmap bitmap1 = TransformationUtils.b(bitmapPool0, bitmap0);
        Bitmap bitmap2 = bitmapPool0.get(v2, v2, (Bitmap.Config.RGBA_F16.equals(bitmap0.getConfig()) ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888));
        bitmap2.setHasAlpha(true);
        TransformationUtils.d.lock();
        try {
            Canvas canvas0 = new Canvas(bitmap2);
            canvas0.drawCircle(f, f, f, TransformationUtils.b);
            canvas0.drawBitmap(bitmap1, null, rectF0, TransformationUtils.c);
            canvas0.setBitmap(null);
        }
        finally {
            TransformationUtils.d.unlock();
        }
        if(!bitmap1.equals(bitmap0)) {
            bitmapPool0.put(bitmap1);
        }
        return bitmap2;
    }

    public static Bitmap fitCenter(@NonNull BitmapPool bitmapPool0, @NonNull Bitmap bitmap0, int v, int v1) {
        if(bitmap0.getWidth() == v && bitmap0.getHeight() == v1) {
            if(Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap0;
        }
        float f = Math.min(((float)v) / ((float)bitmap0.getWidth()), ((float)v1) / ((float)bitmap0.getHeight()));
        int v2 = Math.round(((float)bitmap0.getWidth()) * f);
        int v3 = Math.round(((float)bitmap0.getHeight()) * f);
        if(bitmap0.getWidth() == v2 && bitmap0.getHeight() == v3) {
            if(Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap0;
        }
        Bitmap bitmap1 = bitmapPool0.get(((int)(((float)bitmap0.getWidth()) * f)), ((int)(((float)bitmap0.getHeight()) * f)), (bitmap0.getConfig() == null ? Bitmap.Config.ARGB_8888 : bitmap0.getConfig()));
        TransformationUtils.setAlpha(bitmap0, bitmap1);
        if(Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + v + "x" + v1);
            Log.v("TransformationUtils", "toFit:   " + bitmap0.getWidth() + "x" + bitmap0.getHeight());
            Log.v("TransformationUtils", "toReuse: " + bitmap1.getWidth() + "x" + bitmap1.getHeight());
            Log.v("TransformationUtils", "minPct:   " + f);
        }
        Matrix matrix0 = new Matrix();
        matrix0.setScale(f, f);
        TransformationUtils.a(bitmap0, bitmap1, matrix0);
        return bitmap1;
    }

    public static Lock getBitmapDrawableLock() {
        return TransformationUtils.d;
    }

    public static int getExifOrientationDegrees(int v) {
        switch(v) {
            case 3: 
            case 4: {
                return 180;
            }
            case 5: 
            case 6: {
                return 90;
            }
            case 7: 
            case 8: {
                return 270;
            }
            default: {
                return 0;
            }
        }
    }

    public static boolean isExifOrientationRequired(int v) {
        switch(v) {
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static Bitmap rotateImage(@NonNull Bitmap bitmap0, int v) {
        if(v != 0) {
            try {
                Matrix matrix0 = new Matrix();
                matrix0.setRotate(((float)v));
                return Bitmap.createBitmap(bitmap0, 0, 0, bitmap0.getWidth(), bitmap0.getHeight(), matrix0, true);
            }
            catch(Exception exception0) {
                if(Log.isLoggable("TransformationUtils", 6)) {
                    Log.e("TransformationUtils", "Exception when trying to orient image", exception0);
                }
            }
        }
        return bitmap0;
    }

    public static Bitmap rotateImageExif(@NonNull BitmapPool bitmapPool0, @NonNull Bitmap bitmap0, int v) {
        if(!TransformationUtils.isExifOrientationRequired(v)) {
            return bitmap0;
        }
        Matrix matrix0 = new Matrix();
        switch(v) {
            case 2: {
                matrix0.setScale(-1.0f, 1.0f);
                break;
            }
            case 3: {
                matrix0.setRotate(180.0f);
                break;
            }
            case 4: {
                matrix0.setRotate(180.0f);
                matrix0.postScale(-1.0f, 1.0f);
                break;
            }
            case 5: {
                matrix0.setRotate(90.0f);
                matrix0.postScale(-1.0f, 1.0f);
                break;
            }
            case 6: {
                matrix0.setRotate(90.0f);
                break;
            }
            case 7: {
                matrix0.setRotate(-90.0f);
                matrix0.postScale(-1.0f, 1.0f);
                break;
            }
            case 8: {
                matrix0.setRotate(-90.0f);
            }
        }
        RectF rectF0 = new RectF(0.0f, 0.0f, ((float)bitmap0.getWidth()), ((float)bitmap0.getHeight()));
        matrix0.mapRect(rectF0);
        Bitmap bitmap1 = bitmapPool0.get(Math.round(rectF0.width()), Math.round(rectF0.height()), (bitmap0.getConfig() == null ? Bitmap.Config.ARGB_8888 : bitmap0.getConfig()));
        matrix0.postTranslate(-rectF0.left, -rectF0.top);
        bitmap1.setHasAlpha(bitmap0.hasAlpha());
        TransformationUtils.a(bitmap0, bitmap1, matrix0);
        return bitmap1;
    }

    public static Bitmap roundedCorners(@NonNull BitmapPool bitmapPool0, @NonNull Bitmap bitmap0, float f, float f1, float f2, float f3) {
        return TransformationUtils.c(bitmapPool0, bitmap0, new o(f, f1, f2, f3));
    }

    public static Bitmap roundedCorners(@NonNull BitmapPool bitmapPool0, @NonNull Bitmap bitmap0, int v) {
        Preconditions.checkArgument(v > 0, "roundingRadius must be greater than 0.");
        return TransformationUtils.c(bitmapPool0, bitmap0, new n(v));
    }

    @Deprecated
    public static Bitmap roundedCorners(@NonNull BitmapPool bitmapPool0, @NonNull Bitmap bitmap0, int v, int v1, int v2) {
        return TransformationUtils.roundedCorners(bitmapPool0, bitmap0, v2);
    }

    public static void setAlpha(Bitmap bitmap0, Bitmap bitmap1) {
        bitmap1.setHasAlpha(bitmap0.hasAlpha());
    }
}

