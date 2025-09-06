package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class GifDrawable extends Drawable implements Animatable, Animatable2Compat, GifFrameLoader.FrameCallback {
    public static final int LOOP_FOREVER = -1;
    public static final int LOOP_INTRINSIC;
    public final b a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public boolean h;
    public Paint i;
    public Rect j;
    public ArrayList k;

    public GifDrawable(Context context0, GifDecoder gifDecoder0, Transformation transformation0, int v, int v1, Bitmap bitmap0) {
        this(new b(new e(Glide.get(context0), gifDecoder0, v, v1, transformation0, bitmap0)));
    }

    @Deprecated
    public GifDrawable(Context context0, GifDecoder gifDecoder0, BitmapPool bitmapPool0, Transformation transformation0, int v, int v1, Bitmap bitmap0) {
        this(context0, gifDecoder0, transformation0, v, v1, bitmap0);
    }

    public GifDrawable(b b0) {
        this.e = true;
        this.g = -1;
        this.a = (b)Preconditions.checkNotNull(b0);
    }

    public final void a() {
        Preconditions.checkArgument(!this.d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        b b0 = this.a;
        if(b0.a.a.getFrameCount() == 1) {
            this.invalidateSelf();
            return;
        }
        if(!this.b) {
            this.b = true;
            e e0 = b0.a;
            if(e0.k) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            }
            ArrayList arrayList0 = e0.c;
            if(arrayList0.contains(this)) {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            arrayList0.add(this);
            if(arrayList0.isEmpty() && !e0.f) {
                e0.f = true;
                e0.k = false;
                e0.a();
            }
            this.invalidateSelf();
        }
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        ArrayList arrayList0 = this.k;
        if(arrayList0 != null) {
            arrayList0.clear();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        if(this.d) {
            return;
        }
        if(this.h) {
            int v = this.getIntrinsicWidth();
            int v1 = this.getIntrinsicHeight();
            Rect rect0 = this.getBounds();
            if(this.j == null) {
                this.j = new Rect();
            }
            Gravity.apply(0x77, v, v1, rect0, this.j);
            this.h = false;
        }
        c c0 = this.a.a.j;
        Bitmap bitmap0 = c0 == null ? this.a.a.m : c0.g;
        if(this.j == null) {
            this.j = new Rect();
        }
        Rect rect1 = this.j;
        if(this.i == null) {
            this.i = new Paint(2);
        }
        canvas0.drawBitmap(bitmap0, null, rect1, this.i);
    }

    public ByteBuffer getBuffer() {
        return this.a.a.a.getData().asReadOnlyBuffer();
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    public Bitmap getFirstFrame() {
        return this.a.a.m;
    }

    public int getFrameCount() {
        return this.a.a.a.getFrameCount();
    }

    public int getFrameIndex() {
        c c0 = this.a.a.j;
        return c0 == null ? -1 : c0.e;
    }

    public Transformation getFrameTransformation() {
        return this.a.a.n;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.a.r;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.a.q;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int getSize() {
        return this.a.a.a.getByteSize() + this.a.a.p;
    }

    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.b;
    }

    @Override  // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        this.h = true;
    }

    @Override  // com.bumptech.glide.load.resource.gif.GifFrameLoader$FrameCallback
    public void onFrameReady() {
        Drawable.Callback drawable$Callback0;
        for(drawable$Callback0 = this.getCallback(); drawable$Callback0 instanceof Drawable; drawable$Callback0 = ((Drawable)drawable$Callback0).getCallback()) {
        }
        if(drawable$Callback0 == null) {
            this.stop();
            this.invalidateSelf();
            return;
        }
        this.invalidateSelf();
        if(this.getFrameIndex() == this.getFrameCount() - 1) {
            ++this.f;
        }
        if(this.g != -1 && this.f >= this.g) {
            ArrayList arrayList0 = this.k;
            if(arrayList0 != null) {
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((AnimationCallback)this.k.get(v1)).onAnimationEnd(this);
                }
            }
            this.stop();
        }
    }

    public void recycle() {
        this.d = true;
        e e0 = this.a.a;
        e0.c.clear();
        Bitmap bitmap0 = e0.m;
        if(bitmap0 != null) {
            e0.e.put(bitmap0);
            e0.m = null;
        }
        e0.f = false;
        c c0 = e0.j;
        RequestManager requestManager0 = e0.d;
        if(c0 != null) {
            requestManager0.clear(c0);
            e0.j = null;
        }
        c c1 = e0.l;
        if(c1 != null) {
            requestManager0.clear(c1);
            e0.l = null;
        }
        c c2 = e0.o;
        if(c2 != null) {
            requestManager0.clear(c2);
            e0.o = null;
        }
        e0.a.clear();
        e0.k = true;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        if(animatable2Compat$AnimationCallback0 == null) {
            return;
        }
        if(this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(animatable2Compat$AnimationCallback0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        if(this.i == null) {
            this.i = new Paint(2);
        }
        this.i.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        if(this.i == null) {
            this.i = new Paint(2);
        }
        this.i.setColorFilter(colorFilter0);
    }

    public void setFrameTransformation(Transformation transformation0, Bitmap bitmap0) {
        this.a.a.c(transformation0, bitmap0);
    }

    public void setLoopCount(int v) {
        int v1 = -1;
        if(v <= 0 && (v != -1 && v != 0)) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if(v == 0) {
            int v2 = this.a.a.a.getTotalIterationCount();
            if(v2 != 0) {
                v1 = v2;
            }
            this.g = v1;
            return;
        }
        this.g = v;
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        Preconditions.checkArgument(!this.d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View\'s visibility.");
        this.e = z;
        if(!z) {
            this.b = false;
            e e0 = this.a.a;
            e0.c.remove(this);
            if(e0.c.isEmpty()) {
                e0.f = false;
                return super.setVisible(false, z1);
            }
        }
        else if(this.c) {
            this.a();
        }
        return super.setVisible(z, z1);
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        this.c = true;
        this.f = 0;
        if(this.e) {
            this.a();
        }
    }

    public void startFromFirstFrame() {
        Preconditions.checkArgument(!this.b, "You cannot restart a currently running animation.");
        e e0 = this.a.a;
        Preconditions.checkArgument(!e0.f, "Can\'t restart a running animation");
        e0.h = true;
        c c0 = e0.o;
        if(c0 != null) {
            e0.d.clear(c0);
            e0.o = null;
        }
        this.start();
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        this.c = false;
        this.b = false;
        e e0 = this.a.a;
        e0.c.remove(this);
        if(e0.c.isEmpty()) {
            e0.f = false;
        }
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        return this.k == null || animatable2Compat$AnimationCallback0 == null ? false : this.k.remove(animatable2Compat$AnimationCallback0);
    }
}

