package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.model.Model;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

public final class Util {
    public static final char[] a;
    public static final char[] b;
    public static volatile Handler c;

    static {
        Util.a = "0123456789abcdef".toCharArray();
        Util.b = new char[0x40];
    }

    public static Handler a() {
        if(Util.c == null) {
            Class class0 = Util.class;
            synchronized(class0) {
                if(Util.c == null) {
                    Util.c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return Util.c;
    }

    public static void assertBackgroundThread() {
        if(!Util.isOnBackgroundThread()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void assertMainThread() {
        if(!Util.isOnMainThread()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean bothModelsNullEquivalentOrEquals(@Nullable Object object0, @Nullable Object object1) {
        if(object0 == null) {
            return object1 == null;
        }
        return object0 instanceof Model ? ((Model)object0).isEquivalentTo(object1) : object0.equals(object1);
    }

    public static boolean bothNullOrEqual(@Nullable Object object0, @Nullable Object object1) {
        return object0 == null ? object1 == null : object0.equals(object1);
    }

    @NonNull
    public static Queue createQueue(int v) {
        return new ArrayDeque(v);
    }

    public static int getBitmapByteSize(int v, int v1, @Nullable Bitmap.Config bitmap$Config0) {
        return Util.getBytesPerPixel(bitmap$Config0) * (v * v1);
    }

    @TargetApi(19)
    public static int getBitmapByteSize(@NonNull Bitmap bitmap0) {
        if(!bitmap0.isRecycled()) {
            try {
                return bitmap0.getAllocationByteCount();
            }
            catch(NullPointerException unused_ex) {
                int v = bitmap0.getHeight();
                return bitmap0.getRowBytes() * v;
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap0 + "[" + bitmap0.getWidth() + "x" + bitmap0.getHeight() + "] " + bitmap0.getConfig());
    }

    public static int getBytesPerPixel(@Nullable Bitmap.Config bitmap$Config0) [...] // 潜在的解密器

    @Deprecated
    public static int getSize(@NonNull Bitmap bitmap0) {
        return Util.getBitmapByteSize(bitmap0);
    }

    @NonNull
    public static List getSnapshot(@NonNull Collection collection0) {
        List list0 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            if(object0 != null) {
                ((ArrayList)list0).add(object0);
            }
        }
        return list0;
    }

    public static int hashCode(float f) {
        return Util.hashCode(f, 17);
    }

    public static int hashCode(float f, int v) {
        return v * 0x1F + Float.floatToIntBits(f);
    }

    public static int hashCode(int v) {
        return v + 0x20F;
    }

    public static int hashCode(int v, int v1) [...] // Inlined contents

    public static int hashCode(@Nullable Object object0, int v) {
        return object0 == null ? v * 0x1F : v * 0x1F + object0.hashCode();
    }

    public static int hashCode(boolean z) {
        return Util.hashCode(z, 17);
    }

    public static int hashCode(boolean z, int v) {
        return Util.hashCode(((int)z), v);
    }

    public static boolean isOnBackgroundThread() {
        return !Util.isOnMainThread();
    }

    public static boolean isOnMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean isValidDimension(int v) {
        return v > 0 || v == 0x80000000;
    }

    // 去混淆评级： 低(20)
    public static boolean isValidDimensions(int v, int v1) {
        return Util.isValidDimension(v) && Util.isValidDimension(v1);
    }

    public static void postOnUiThread(Runnable runnable0) {
        Util.a().post(runnable0);
    }

    public static void removeCallbacksOnUiThread(Runnable runnable0) {
        Util.a().removeCallbacks(runnable0);
    }

    @NonNull
    public static String sha256BytesToHex(@NonNull byte[] arr_b) {
        char[] arr_c = Util.b;
        synchronized(arr_c) {
            for(int v1 = 0; v1 < arr_b.length; ++v1) {
                int v2 = arr_b[v1];
                arr_c[v1 * 2] = Util.a[(v2 & 0xFF) >>> 4];
                arr_c[v1 * 2 + 1] = Util.a[v2 & 15];
            }
        }
        return new String(arr_c);
    }
}

