package com.kakao.tistory.presentation.view.webview;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zd.c;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001:\u0001=B2\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012!\u0010\n\u001A\u001D\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004\u00A2\u0006\u0004\b\u000B\u0010\fJA\u0010\u0015\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\r2\u0006\u0010\u0011\u001A\u00020\r2\b\u0010\u0013\u001A\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u0015\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\r2\u0006\u0010\u0011\u001A\u00020\r2\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001D\u001A\u00020\t2\u0006\u0010\u001A\u001A\u00020\r2\u0006\u0010\u001B\u001A\u00020\r2\b\u0010\u001C\u001A\u0004\u0018\u00010\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJ3\u0010\u001D\u001A\u00020\t2\u0006\u0010\u001A\u001A\u00020\r2\u0006\u0010\u001B\u001A\u00020\r2\b\u0010\u001C\u001A\u0004\u0018\u00010\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001FJ\u0017\u0010!\u001A\u00020 2\u0006\u0010\u0014\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b!\u0010\"J\u000F\u0010!\u001A\u00020 H\u0016\u00A2\u0006\u0004\b!\u0010#J\u0017\u0010$\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b$\u0010%J\u000F\u0010$\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b$\u0010\u0019J\u001F\u0010)\u001A\u00020\t2\u0006\u0010\'\u001A\u00020&2\u0006\u0010(\u001A\u00020&H\u0016\u00A2\u0006\u0004\b)\u0010*J\u0017\u0010,\u001A\u00020 2\u0006\u0010+\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b,\u0010-J\'\u0010.\u001A\u00020\t2\u0006\u0010\'\u001A\u00020&2\u0006\u0010(\u001A\u00020&2\u0006\u0010\u001C\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b.\u0010/J\u001F\u00101\u001A\u00020\t2\u0006\u00100\u001A\u00020\r2\u0006\u0010\u0014\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b1\u00102J\u0017\u00101\u001A\u00020\t2\u0006\u00100\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b1\u0010%J\u0015\u00103\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0005\u00A2\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00108R2\u0010\n\u001A\u001D\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00048\u0006\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<\u00A8\u0006>"}, d2 = {"Lcom/kakao/tistory/presentation/view/webview/WebViewNestedScrollingHelper;", "Landroidx/core/view/NestedScrollingChild2;", "Landroid/webkit/WebView;", "webView", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lkotlin/ParameterName;", "name", "event", "", "touchEvent", "<init>", "(Landroid/webkit/WebView;Lkotlin/jvm/functions/Function1;)V", "", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "", "offsetInWindow", "type", "dispatchNestedScroll", "(IIII[II)Z", "(IIII[I)Z", "isNestedScrollingEnabled", "()Z", "dx", "dy", "consumed", "dispatchNestedPreScroll", "(II[I[II)Z", "(II[I[I)Z", "", "stopNestedScroll", "(I)V", "()V", "hasNestedScrollingParent", "(I)Z", "", "velocityX", "velocityY", "dispatchNestedPreFling", "(FF)Z", "enabled", "setNestedScrollingEnabled", "(Z)V", "dispatchNestedFling", "(FFZ)Z", "axes", "startNestedScroll", "(II)Z", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "a", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "b", "Lkotlin/jvm/functions/Function1;", "getTouchEvent", "()Lkotlin/jvm/functions/Function1;", "com/kakao/tistory/presentation/view/webview/e0", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class WebViewNestedScrollingHelper implements NestedScrollingChild2 {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[e0.values().length];
            try {
                arr_v[0] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[2] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[1] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final WebView a;
    public final Function1 b;
    public final NestedScrollingChildHelper c;
    public final int d;
    public final int[] e;
    public final int[] f;
    public final PointF g;
    public e0 h;
    public int i;

    public WebViewNestedScrollingHelper(@NotNull WebView webView0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(webView0, "webView");
        Intrinsics.checkNotNullParameter(function10, "touchEvent");
        super();
        this.a = webView0;
        this.b = function10;
        this.c = new NestedScrollingChildHelper(webView0);
        this.d = ViewConfiguration.get(webView0.getContext()).getScaledTouchSlop();
        this.e = new int[2];
        this.f = new int[2];
        this.g = new PointF();
        this.h = e0.a;
    }

    @Override  // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f1, boolean z) {
        return this.c.dispatchNestedFling(f, f1, z);
    }

    @Override  // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f1) {
        return this.c.dispatchNestedPreFling(f, f1);
    }

    @Override  // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int v, int v1, @Nullable int[] arr_v, @Nullable int[] arr_v1) {
        return this.c.dispatchNestedPreScroll(v, v1, arr_v, arr_v1);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int v, int v1, @Nullable int[] arr_v, @Nullable int[] arr_v1, int v2) {
        return this.c.dispatchNestedPreScroll(v, v1, arr_v, arr_v1, v2);
    }

    @Override  // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, @Nullable int[] arr_v) {
        return this.c.dispatchNestedScroll(v, v1, v2, v3, arr_v);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, @Nullable int[] arr_v, int v4) {
        return this.c.dispatchNestedScroll(v, v1, v2, v3, arr_v, v4);
    }

    @NotNull
    public final Function1 getTouchEvent() {
        return this.b;
    }

    @NotNull
    public final WebView getWebView() {
        return this.a;
    }

    @Override  // androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.c.hasNestedScrollingParent();
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int v) {
        return this.c.hasNestedScrollingParent(v);
    }

    @Override  // androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.c.isNestedScrollingEnabled();
    }

    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent0) {
        boolean z1;
        Intrinsics.checkNotNullParameter(motionEvent0, "event");
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        boolean z = true;
    alab1:
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                this.g.x = motionEvent0.getX();
                this.g.y = motionEvent0.getY();
                ViewCompat.setNestedScrollingEnabled(this.a, true);
                this.h = e0.a;
                z1 = false;
                break;
            }
            case 1: {
                ViewCompat.stopNestedScroll(this.a, 0);
                this.h = e0.a;
                z1 = false;
                break;
            }
            case 2: {
                float f = motionEvent1.getX();
                float f1 = motionEvent1.getY();
                float f2 = this.g.x - f;
                float f3 = this.g.y - f1;
                switch(this.h.ordinal()) {
                    case 0: {
                        if(Math.abs(f2) > ((float)this.d) || Math.abs(f3) > ((float)this.d)) {
                            double f4 = Math.abs(Math.toDegrees(Math.atan2(-((double)f3), -((double)f2))));
                            this.h = 45.0 > f4 || f4 > 135.0 ? e0.c : e0.b;
                        }
                        e0 e00 = this.h;
                        if(e00 != e0.a) {
                            this.g.x = f;
                            this.g.y = f1;
                            if(e00 == e0.b) {
                                ViewCompat.startNestedScroll(this.a, 2, 0);
                                ViewParent viewParent0 = this.a.getParent();
                                if(viewParent0 != null) {
                                    viewParent0.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                        z1 = false;
                        break alab1;
                    }
                    case 1: {
                        int v = c.roundToInt(f3);
                        this.i = v;
                        this.g.x = f;
                        this.g.y = f1;
                        if(ViewCompat.dispatchNestedPreScroll(this.a, 0, v, this.e, this.f, 0)) {
                            this.i -= this.e[1];
                            float f5 = this.g.y;
                            float f6 = (float)this.f[1];
                            this.g.y = f5 - f6;
                            motionEvent1.offsetLocation(0.0f, -f6);
                            z1 = true;
                        }
                        else {
                            z1 = false;
                        }
                        ViewParent viewParent1 = this.a.getParent();
                        NestedScrollView nestedScrollView0 = viewParent1 instanceof NestedScrollView ? ((NestedScrollView)viewParent1) : null;
                        int v1 = nestedScrollView0 == null ? 0 : nestedScrollView0.getHeight();
                        int v2 = this.i;
                        if(v2 < 0 && this.a.getScrollY() + v2 > 0) {
                            this.i = 0;
                        }
                        else {
                            int v3 = this.i;
                            if(v3 > 0 && this.a.getScrollY() + v3 > this.a.getHeight() - v1) {
                                this.i = 0;
                            }
                        }
                        if(ViewCompat.dispatchNestedScroll(this.a, 0, 0, 0, this.i, this.f, 0)) {
                            int[] arr_v = this.f;
                            if(arr_v[0] != 0 || arr_v[1] != 0) {
                                this.g.y -= (float)arr_v[1];
                                motionEvent1.offsetLocation(0.0f, -((float)arr_v[1]));
                                z1 = true;
                            }
                        }
                        break alab1;
                    }
                    case 2: {
                        if(Math.abs(f2) > ((float)this.d) || Math.abs(f3) > ((float)this.d)) {
                            double f7 = Math.abs(Math.toDegrees(Math.atan2(-((double)f3), -((double)f2))));
                            this.g.x = f;
                            this.g.y = f1;
                            if(45.0 <= f7 && f7 <= 135.0) {
                                this.h = e0.b;
                                ViewCompat.startNestedScroll(this.a, 2, 0);
                                ViewParent viewParent2 = this.a.getParent();
                                if(viewParent2 != null) {
                                    viewParent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                        z1 = false;
                        break alab1;
                    }
                    default: {
                        z1 = false;
                        break alab1;
                    }
                }
            }
            case 3: {
                ViewCompat.stopNestedScroll(this.a, 0);
                this.h = e0.a;
                z1 = false;
                break;
            }
            case 6: {
                if(motionEvent1.getPointerCount() > 1 && motionEvent1.getActionIndex() == 0) {
                    this.g.x = motionEvent1.getX(1);
                    this.g.y = motionEvent1.getY(1);
                }
                z1 = false;
                break;
            }
            default: {
                z1 = false;
            }
        }
        if(!z1) {
            Intrinsics.checkNotNull(motionEvent1);
            if(!((Boolean)this.b.invoke(motionEvent1)).booleanValue()) {
                z = false;
            }
        }
        motionEvent1.recycle();
        return z;
    }

    @Override  // androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.c.setNestedScrollingEnabled(z);
    }

    @Override  // androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int v) {
        return this.c.startNestedScroll(v);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int v, int v1) {
        return this.c.startNestedScroll(v, v1);
    }

    @Override  // androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.c.stopNestedScroll();
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int v) {
        this.c.stopNestedScroll(v);
    }
}

