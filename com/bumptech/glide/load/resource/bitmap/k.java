package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.util.concurrent.locks.Lock;

public abstract class k {
    public static final j a;

    static {
        k.a = new j();  // 初始化器: Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPoolAdapter;-><init>()V
    }

    public static BitmapResource a(BitmapPool bitmapPool0, Drawable drawable0, int v, int v1) {
        Bitmap bitmap0;
        Drawable drawable1 = drawable0.getCurrent();
        boolean z = false;
        if(drawable1 instanceof BitmapDrawable) {
            bitmap0 = ((BitmapDrawable)drawable1).getBitmap();
        }
        else if(drawable1 instanceof Animatable) {
            bitmap0 = null;
        }
        else {
            if(v == 0x80000000 && drawable1.getIntrinsicWidth() <= 0) {
                if(Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + drawable1 + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                }
                bitmap0 = null;
            }
            else if(v1 != 0x80000000 || drawable1.getIntrinsicHeight() > 0) {
                if(drawable1.getIntrinsicWidth() > 0) {
                    v = drawable1.getIntrinsicWidth();
                }
                if(drawable1.getIntrinsicHeight() > 0) {
                    v1 = drawable1.getIntrinsicHeight();
                }
                Lock lock0 = TransformationUtils.getBitmapDrawableLock();
                lock0.lock();
                Bitmap bitmap1 = bitmapPool0.get(v, v1, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas0 = new Canvas(bitmap1);
                    drawable1.setBounds(0, 0, v, v1);
                    drawable1.draw(canvas0);
                    canvas0.setBitmap(null);
                }
                finally {
                    lock0.unlock();
                }
                bitmap0 = bitmap1;
            }
            else {
                if(Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + drawable1 + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
                bitmap0 = null;
            }
            z = true;
        }
        if(!z) {
            bitmapPool0 = k.a;
        }
        return BitmapResource.obtain(bitmap0, bitmapPool0);
    }
}

