package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
public final class ScrollerCompat {
    public OverScroller a;

    @Deprecated
    public void abortAnimation() {
        this.a.abortAnimation();
    }

    @Deprecated
    public boolean computeScrollOffset() {
        return this.a.computeScrollOffset();
    }

    @Deprecated
    public static ScrollerCompat create(Context context0) {
        return ScrollerCompat.create(context0, null);
    }

    @Deprecated
    public static ScrollerCompat create(Context context0, Interpolator interpolator0) {
        ScrollerCompat scrollerCompat0 = new ScrollerCompat();  // 初始化器: Ljava/lang/Object;-><init>()V
        scrollerCompat0.a = interpolator0 == null ? new OverScroller(context0) : new OverScroller(context0, interpolator0);
        return scrollerCompat0;
    }

    @Deprecated
    public void fling(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        this.a.fling(v, v1, v2, v3, v4, v5, v6, v7);
    }

    @Deprecated
    public void fling(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9) {
        this.a.fling(v, v1, v2, v3, v4, v5, v6, v7, v8, v9);
    }

    @Deprecated
    public float getCurrVelocity() {
        return this.a.getCurrVelocity();
    }

    @Deprecated
    public int getCurrX() {
        return this.a.getCurrX();
    }

    @Deprecated
    public int getCurrY() {
        return this.a.getCurrY();
    }

    @Deprecated
    public int getFinalX() {
        return this.a.getFinalX();
    }

    @Deprecated
    public int getFinalY() {
        return this.a.getFinalY();
    }

    @Deprecated
    public boolean isFinished() {
        return this.a.isFinished();
    }

    @Deprecated
    public boolean isOverScrolled() {
        return this.a.isOverScrolled();
    }

    @Deprecated
    public void notifyHorizontalEdgeReached(int v, int v1, int v2) {
        this.a.notifyHorizontalEdgeReached(v, v1, v2);
    }

    @Deprecated
    public void notifyVerticalEdgeReached(int v, int v1, int v2) {
        this.a.notifyVerticalEdgeReached(v, v1, v2);
    }

    @Deprecated
    public boolean springBack(int v, int v1, int v2, int v3, int v4, int v5) {
        return this.a.springBack(v, v1, v2, v3, v4, v5);
    }

    @Deprecated
    public void startScroll(int v, int v1, int v2, int v3) {
        this.a.startScroll(v, v1, v2, v3);
    }

    @Deprecated
    public void startScroll(int v, int v1, int v2, int v3, int v4) {
        this.a.startScroll(v, v1, v2, v3, v4);
    }
}

