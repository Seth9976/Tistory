package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public final class b implements Runnable {
    public final Uri a;
    public final Bitmap b;
    public final CountDownLatch c;
    public final ImageManager d;

    public b(ImageManager imageManager0, Uri uri0, Bitmap bitmap0, CountDownLatch countDownLatch0) {
        this.d = imageManager0;
        this.a = uri0;
        this.b = bitmap0;
        this.c = countDownLatch0;
    }

    @Override
    public final void run() {
        Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap0 = this.b;
        ImageReceiver imageManager$ImageReceiver0 = (ImageReceiver)this.d.e.remove(this.a);
        if(imageManager$ImageReceiver0 != null) {
            ArrayList arrayList0 = imageManager$ImageReceiver0.b;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                zag zag0 = (zag)arrayList0.get(v1);
                Bitmap bitmap1 = this.b;
                if(bitmap1 == null || bitmap0 == null) {
                    Long long0 = SystemClock.elapsedRealtime();
                    this.d.f.put(this.a, long0);
                    zag0.a(this.d.a, false);
                }
                else {
                    zag0.getClass();
                    Asserts.checkNotNull(bitmap1);
                    zag0.zaa(new BitmapDrawable(this.d.a.getResources(), bitmap1), false, false, true);
                }
                if(!(zag0 instanceof zaf)) {
                    this.d.d.remove(zag0);
                }
            }
        }
        this.c.countDown();
        synchronized(ImageManager.g) {
            ImageManager.h.remove(this.a);
        }
    }
}

