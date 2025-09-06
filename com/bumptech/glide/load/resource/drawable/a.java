package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Util;

public final class a implements Resource {
    public final int a;
    public final Object b;

    public a(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    private final void a() {
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        switch(this.a) {
            case 0: {
                return (AnimatedImageDrawable)this.b;
            }
            case 1: {
                return (AnimatedImageDrawable)this.b;
            }
            default: {
                return (Bitmap)this.b;
            }
        }
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public final Class getResourceClass() {
        switch(this.a) {
            case 0: {
                return Drawable.class;
            }
            case 1: {
                return Drawable.class;
            }
            default: {
                return Bitmap.class;
            }
        }
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        switch(this.a) {
            case 0: {
                int v = ((AnimatedImageDrawable)this.b).getIntrinsicWidth();
                return 4 * (((AnimatedImageDrawable)this.b).getIntrinsicHeight() * v) * 2;
            }
            case 1: {
                int v1 = ((AnimatedImageDrawable)this.b).getIntrinsicWidth();
                return 4 * (((AnimatedImageDrawable)this.b).getIntrinsicHeight() * v1) * 2;
            }
            default: {
                return Util.getBitmapByteSize(((Bitmap)this.b));
            }
        }
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
        switch(this.a) {
            case 0: {
                ((AnimatedImageDrawable)this.b).stop();
                ((AnimatedImageDrawable)this.b).clearAnimationCallbacks();
                return;
            }
            case 1: {
                ((AnimatedImageDrawable)this.b).stop();
                ((AnimatedImageDrawable)this.b).clearAnimationCallbacks();
            }
        }
    }
}

