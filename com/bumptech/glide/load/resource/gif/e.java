package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;

public final class e {
    public final GifDecoder a;
    public final Handler b;
    public final ArrayList c;
    public final RequestManager d;
    public final BitmapPool e;
    public boolean f;
    public boolean g;
    public boolean h;
    public RequestBuilder i;
    public c j;
    public boolean k;
    public c l;
    public Bitmap m;
    public Transformation n;
    public c o;
    public int p;
    public int q;
    public int r;

    public e(Glide glide0, GifDecoder gifDecoder0, int v, int v1, Transformation transformation0, Bitmap bitmap0) {
        RequestManager requestManager0 = Glide.with(glide0.getContext());
        RequestBuilder requestBuilder0 = Glide.with(glide0.getContext()).asBitmap().apply(((RequestOptions)((RequestOptions)RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE).useAnimationPool(true)).skipMemoryCache(true)).override(v, v1));
        super();
        this.c = new ArrayList();
        this.d = requestManager0;
        Handler handler0 = new Handler(Looper.getMainLooper(), new d(this, 0));
        this.e = glide0.getBitmapPool();
        this.b = handler0;
        this.i = requestBuilder0;
        this.a = gifDecoder0;
        this.c(transformation0, bitmap0);
    }

    public final void a() {
        if(this.f && !this.g) {
            GifDecoder gifDecoder0 = this.a;
            if(this.h) {
                Preconditions.checkArgument(this.o == null, "Pending target must be null when starting from the first frame");
                gifDecoder0.resetFrameIndex();
                this.h = false;
            }
            c c0 = this.o;
            if(c0 != null) {
                this.o = null;
                this.b(c0);
                return;
            }
            this.g = true;
            int v = gifDecoder0.getNextDelay();
            long v1 = SystemClock.uptimeMillis();
            gifDecoder0.advance();
            int v2 = gifDecoder0.getCurrentFrameIndex();
            this.l = new c(this.b, v2, v1 + ((long)v));
            this.i.apply(RequestOptions.signatureOf(new ObjectKey(Math.random()))).load(gifDecoder0).into(this.l);
        }
    }

    public final void b(c c0) {
        this.g = false;
        Handler handler0 = this.b;
        if(this.k) {
            handler0.obtainMessage(2, c0).sendToTarget();
            return;
        }
        if(!this.f) {
            if(this.h) {
                handler0.obtainMessage(2, c0).sendToTarget();
                return;
            }
            this.o = c0;
            return;
        }
        if(c0.g != null) {
            Bitmap bitmap0 = this.m;
            if(bitmap0 != null) {
                this.e.put(bitmap0);
                this.m = null;
            }
            c c1 = this.j;
            this.j = c0;
            ArrayList arrayList0 = this.c;
            for(int v = arrayList0.size() - 1; v >= 0; --v) {
                ((GifFrameLoader.FrameCallback)arrayList0.get(v)).onFrameReady();
            }
            if(c1 != null) {
                handler0.obtainMessage(2, c1).sendToTarget();
            }
        }
        this.a();
    }

    public final void c(Transformation transformation0, Bitmap bitmap0) {
        this.n = (Transformation)Preconditions.checkNotNull(transformation0);
        this.m = (Bitmap)Preconditions.checkNotNull(bitmap0);
        this.i = this.i.apply(new RequestOptions().transform(transformation0));
        this.p = Util.getBitmapByteSize(bitmap0);
        this.q = bitmap0.getWidth();
        this.r = bitmap0.getHeight();
    }
}

