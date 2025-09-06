package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p3.e;
import p3.f;

public final class EdgeEffectCompat {
    public final EdgeEffect a;

    @Deprecated
    public EdgeEffectCompat(Context context0) {
        this.a = new EdgeEffect(context0);
    }

    @NonNull
    public static EdgeEffect create(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        return Build.VERSION.SDK_INT < 0x1F ? new EdgeEffect(context0) : f.a(context0, attributeSet0);
    }

    @Deprecated
    public boolean draw(Canvas canvas0) {
        return this.a.draw(canvas0);
    }

    @Deprecated
    public void finish() {
        this.a.finish();
    }

    public static float getDistance(@NonNull EdgeEffect edgeEffect0) {
        return Build.VERSION.SDK_INT < 0x1F ? 0.0f : f.b(edgeEffect0);
    }

    @Deprecated
    public boolean isFinished() {
        return this.a.isFinished();
    }

    @Deprecated
    public boolean onAbsorb(int v) {
        this.a.onAbsorb(v);
        return true;
    }

    public static void onPull(@NonNull EdgeEffect edgeEffect0, float f, float f1) {
        e.a(edgeEffect0, f, f1);
    }

    @Deprecated
    public boolean onPull(float f) {
        this.a.onPull(f);
        return true;
    }

    @Deprecated
    public boolean onPull(float f, float f1) {
        EdgeEffectCompat.onPull(this.a, f, f1);
        return true;
    }

    public static float onPullDistance(@NonNull EdgeEffect edgeEffect0, float f, float f1) {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            return f.c(edgeEffect0, f, f1);
        }
        EdgeEffectCompat.onPull(edgeEffect0, f, f1);
        return f;
    }

    @Deprecated
    public boolean onRelease() {
        this.a.onRelease();
        return this.a.isFinished();
    }

    @Deprecated
    public void setSize(int v, int v1) {
        this.a.setSize(v, v1);
    }
}

