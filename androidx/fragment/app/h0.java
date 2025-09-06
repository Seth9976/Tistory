package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.OneShotPreDrawListener;

public final class h0 extends AnimationSet implements Runnable {
    public final ViewGroup a;
    public final View b;
    public boolean c;
    public boolean d;
    public boolean e;

    public h0(Animation animation0, ViewGroup viewGroup0, View view0) {
        super(false);
        this.e = true;
        this.a = viewGroup0;
        this.b = view0;
        this.addAnimation(animation0);
        viewGroup0.post(this);
    }

    @Override  // android.view.animation.AnimationSet
    public final boolean getTransformation(long v, Transformation transformation0) {
        this.e = true;
        if(this.c) {
            return !this.d;
        }
        if(!super.getTransformation(v, transformation0)) {
            this.c = true;
            OneShotPreDrawListener.add(this.a, this);
        }
        return true;
    }

    @Override  // android.view.animation.Animation
    public final boolean getTransformation(long v, Transformation transformation0, float f) {
        this.e = true;
        if(this.c) {
            return !this.d;
        }
        if(!super.getTransformation(v, transformation0, f)) {
            this.c = true;
            OneShotPreDrawListener.add(this.a, this);
        }
        return true;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup0 = this.a;
        if(!this.c && this.e) {
            this.e = false;
            viewGroup0.post(this);
            return;
        }
        viewGroup0.endViewTransition(this.b);
        this.d = true;
    }
}

