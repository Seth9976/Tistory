package com.google.android.material.internal;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Collection;

@RestrictTo({Scope.LIBRARY_GROUP})
public class MultiViewUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    interface Listener {
        void onAnimationUpdate(@NonNull ValueAnimator arg1, @NonNull View arg2);
    }

    public final Listener a;
    public final View[] b;

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@NonNull Listener multiViewUpdateListener$Listener0, @NonNull Collection collection0) {
        this.a = multiViewUpdateListener$Listener0;
        this.b = (View[])collection0.toArray(new View[0]);
    }

    @SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@NonNull Listener multiViewUpdateListener$Listener0, @NonNull View[] arr_view) {
        this.a = multiViewUpdateListener$Listener0;
        this.b = arr_view;
    }

    @NonNull
    public static MultiViewUpdateListener alphaListener(@NonNull Collection collection0) {
        return new MultiViewUpdateListener(new g(3), collection0);
    }

    @NonNull
    public static MultiViewUpdateListener alphaListener(@NonNull View[] arr_view) {
        return new MultiViewUpdateListener(new g(3), arr_view);
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
        View[] arr_view = this.b;
        for(int v = 0; v < arr_view.length; ++v) {
            this.a.onAnimationUpdate(valueAnimator0, arr_view[v]);
        }
    }

    @NonNull
    public static MultiViewUpdateListener scaleListener(@NonNull Collection collection0) {
        return new MultiViewUpdateListener(new g(1), collection0);
    }

    @NonNull
    public static MultiViewUpdateListener scaleListener(@NonNull View[] arr_view) {
        return new MultiViewUpdateListener(new g(1), arr_view);
    }

    @NonNull
    public static MultiViewUpdateListener translationXListener(@NonNull Collection collection0) {
        return new MultiViewUpdateListener(new g(0), collection0);
    }

    @NonNull
    public static MultiViewUpdateListener translationXListener(@NonNull View[] arr_view) {
        return new MultiViewUpdateListener(new g(0), arr_view);
    }

    @NonNull
    public static MultiViewUpdateListener translationYListener(@NonNull Collection collection0) {
        return new MultiViewUpdateListener(new g(2), collection0);
    }

    @NonNull
    public static MultiViewUpdateListener translationYListener(@NonNull View[] arr_view) {
        return new MultiViewUpdateListener(new g(2), arr_view);
    }
}

