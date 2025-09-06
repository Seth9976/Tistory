package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.f0;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.transition.Transition;

public final class PreloadTarget extends CustomTarget {
    public final RequestManager d;
    public static final Handler e;

    static {
        PreloadTarget.e = new Handler(Looper.getMainLooper(), new f0(1));
    }

    public PreloadTarget(RequestManager requestManager0, int v, int v1) {
        super(v, v1);
        this.d = requestManager0;
    }

    public static PreloadTarget obtain(RequestManager requestManager0, int v, int v1) {
        return new PreloadTarget(requestManager0, v, v1);
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@Nullable Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void onResourceReady(@NonNull Object object0, @Nullable Transition transition0) {
        Request request0 = this.getRequest();
        if(request0 != null && request0.isComplete()) {
            PreloadTarget.e.obtainMessage(1, this).sendToTarget();
        }
    }
}

