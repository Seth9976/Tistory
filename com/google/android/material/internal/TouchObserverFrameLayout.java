package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public class TouchObserverFrameLayout extends FrameLayout {
    public View.OnTouchListener a;

    public TouchObserverFrameLayout(@NonNull Context context0) {
        super(context0);
    }

    public TouchObserverFrameLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public TouchObserverFrameLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        View.OnTouchListener view$OnTouchListener0 = this.a;
        if(view$OnTouchListener0 != null) {
            view$OnTouchListener0.onTouch(this, motionEvent0);
        }
        return super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.view.View
    public void setOnTouchListener(@Nullable View.OnTouchListener view$OnTouchListener0) {
        this.a = view$OnTouchListener0;
    }
}

