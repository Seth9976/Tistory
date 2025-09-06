package d6;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.prefill.PreFillType;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public final class b implements Runnable {
    public final BitmapPool a;
    public final MemoryCache b;
    public final c c;
    public final a7.c d;
    public final HashSet e;
    public final Handler f;
    public long g;
    public boolean h;
    public static final a7.c i;
    public static final long j;

    static {
        b.i = new a7.c(23);
        b.j = TimeUnit.SECONDS.toMillis(1L);
    }

    public b(BitmapPool bitmapPool0, MemoryCache memoryCache0, c c0) {
        Handler handler0 = new Handler(Looper.getMainLooper());
        super();
        this.e = new HashSet();
        this.g = 40L;
        this.a = bitmapPool0;
        this.b = memoryCache0;
        this.c = c0;
        this.d = b.i;
        this.f = handler0;
    }

    @Override
    public final void run() {
        Bitmap bitmap0;
        this.d.getClass();
        long v = SystemClock.currentThreadTimeMillis();
        while(true) {
            c c0 = this.c;
            if(c0.a == 0 || SystemClock.currentThreadTimeMillis() - v >= 0x20L) {
                break;
            }
            ArrayList arrayList0 = c0.c;
            PreFillType preFillType0 = (PreFillType)arrayList0.get(c0.b);
            HashMap hashMap0 = (HashMap)c0.d;
            Integer integer0 = (Integer)hashMap0.get(preFillType0);
            if(((int)integer0) == 1) {
                hashMap0.remove(preFillType0);
                arrayList0.remove(c0.b);
            }
            else {
                hashMap0.put(preFillType0, ((int)(((int)integer0) - 1)));
            }
            --c0.a;
            c0.b = arrayList0.isEmpty() ? 0 : (c0.b + 1) % arrayList0.size();
            HashSet hashSet0 = this.e;
            boolean z = hashSet0.contains(preFillType0);
            BitmapPool bitmapPool0 = this.a;
            if(z) {
                bitmap0 = Bitmap.createBitmap(preFillType0.a, preFillType0.b, preFillType0.c);
            }
            else {
                hashSet0.add(preFillType0);
                bitmap0 = bitmapPool0.getDirty(preFillType0.a, preFillType0.b, preFillType0.c);
            }
            int v1 = Util.getBitmapByteSize(bitmap0);
            MemoryCache memoryCache0 = this.b;
            if(memoryCache0.getMaxSize() - memoryCache0.getCurrentSize() >= ((long)v1)) {
                memoryCache0.put(new a(), BitmapResource.obtain(bitmap0, bitmapPool0));  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            else {
                bitmapPool0.put(bitmap0);
            }
            if(Log.isLoggable("PreFillRunner", 3)) {
                Log.d("PreFillRunner", "allocated [" + preFillType0.a + "x" + preFillType0.b + "] " + preFillType0.c + " size: " + v1);
            }
        }
        if(!this.h && c0.a != 0) {
            long v2 = this.g;
            this.g = Math.min(4L * v2, b.j);
            this.f.postDelayed(this, v2);
        }
    }
}

