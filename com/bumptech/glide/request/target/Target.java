package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.transition.Transition;

public interface Target extends LifecycleListener {
    public static final int SIZE_ORIGINAL = 0x80000000;

    @Nullable
    Request getRequest();

    void getSize(@NonNull SizeReadyCallback arg1);

    void onLoadCleared(@Nullable Drawable arg1);

    void onLoadFailed(@Nullable Drawable arg1);

    void onLoadStarted(@Nullable Drawable arg1);

    void onResourceReady(@NonNull Object arg1, @Nullable Transition arg2);

    void removeCallback(@NonNull SizeReadyCallback arg1);

    void setRequest(@Nullable Request arg1);
}

