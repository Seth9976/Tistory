package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
public final class GestureDetectorCompat {
    public final GestureDetector a;

    public GestureDetectorCompat(@NonNull Context context0, @NonNull GestureDetector.OnGestureListener gestureDetector$OnGestureListener0) {
        this(context0, gestureDetector$OnGestureListener0, null);
    }

    public GestureDetectorCompat(@NonNull Context context0, @NonNull GestureDetector.OnGestureListener gestureDetector$OnGestureListener0, @Nullable Handler handler0) {
        this.a = new GestureDetector(context0, gestureDetector$OnGestureListener0, handler0);
    }

    public boolean isLongpressEnabled() {
        return this.a.isLongpressEnabled();
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent0) {
        return this.a.onTouchEvent(motionEvent0);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setIsLongpressEnabled(boolean z) {
        this.a.setIsLongpressEnabled(z);
    }

    public void setOnDoubleTapListener(@Nullable GestureDetector.OnDoubleTapListener gestureDetector$OnDoubleTapListener0) {
        this.a.setOnDoubleTapListener(gestureDetector$OnDoubleTapListener0);
    }
}

