package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;

public final class c extends CustomTarget {
    public final Handler d;
    public final int e;
    public final long f;
    public Bitmap g;

    public c(Handler handler0, int v, long v1) {
        this.d = handler0;
        this.e = v;
        this.f = v1;
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void onLoadCleared(Drawable drawable0) {
        this.g = null;
    }

    @Override  // com.bumptech.glide.request.target.Target
    public final void onResourceReady(Object object0, Transition transition0) {
        this.g = (Bitmap)object0;
        Message message0 = this.d.obtainMessage(1, this);
        this.d.sendMessageAtTime(message0, this.f);
    }
}

