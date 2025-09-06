package androidx.compose.material.ripple;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import m5.a;
import org.jetbrains.annotations.NotNull;
import u0.s;
import u0.t;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0000\u0018\u0000 12\u00020\u0001:\u00011B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001F\u0010\u000E\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000BH\u0014¢\u0006\u0004\b\u000E\u0010\u000FJ7\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u000B2\u0006\u0010\u0012\u001A\u00020\u000B2\u0006\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u0014\u001A\u00020\u000BH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001B\u001A\u00020\b2\u0006\u0010\u001A\u001A\u00020\u0019H\u0016¢\u0006\u0004\b\u001B\u0010\u001CJN\u0010+\u001A\u00020\b2\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u001F\u001A\u00020\u00062\u0006\u0010!\u001A\u00020 2\u0006\u0010\"\u001A\u00020\u000B2\u0006\u0010$\u001A\u00020#2\u0006\u0010&\u001A\u00020%2\f\u0010(\u001A\b\u0012\u0004\u0012\u00020\b0\'ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\r\u0010,\u001A\u00020\b¢\u0006\u0004\b,\u0010\u0018J(\u0010/\u001A\u00020\b2\u0006\u0010!\u001A\u00020 2\u0006\u0010$\u001A\u00020#2\u0006\u0010&\u001A\u00020%ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\r\u00100\u001A\u00020\b¢\u0006\u0004\b0\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u00062"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "pressed", "", "setRippleState", "(Z)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "refreshDrawableState", "()V", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "bounded", "Landroidx/compose/ui/geometry/Size;", "size", "radius", "Landroidx/compose/ui/graphics/Color;", "color", "", "alpha", "Lkotlin/Function0;", "onInvalidateRipple", "addRipple-KOepWvA", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;ZJIJFLkotlin/jvm/functions/Function0;)V", "addRipple", "removeRipple", "setRippleProperties-07v42R4", "(JJF)V", "setRippleProperties", "disposeRipple", "Companion", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RippleHostView extends View {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView$Companion;", "", "", "MinimumRippleStateChangeTime", "J", "", "PressedState", "[I", "ResetRippleDelayDuration", "RestingState", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public t a;
    public Boolean b;
    public Long c;
    public a d;
    public Function0 e;
    public static final int[] f;
    public static final int[] g;

    static {
        RippleHostView.Companion = new Companion(null);
        RippleHostView.$stable = 8;
        RippleHostView.f = new int[]{0x10100A7, 0x101009E};
        RippleHostView.g = new int[0];
    }

    public RippleHostView(@NotNull Context context0) {
        super(context0);
    }

    public final void addRipple-KOepWvA(@NotNull Press pressInteraction$Press0, boolean z, long v, int v1, long v2, float f, @NotNull Function0 function00) {
        if(this.a == null || !Intrinsics.areEqual(Boolean.valueOf(z), this.b)) {
            t t0 = new t(z);
            this.setBackground(t0);
            this.a = t0;
            this.b = Boolean.valueOf(z);
        }
        t t1 = this.a;
        Intrinsics.checkNotNull(t1);
        this.e = function00;
        if(t1.c == null || ((int)t1.c) != v1) {
            t1.c = v1;
            s.a.a(t1, v1);
        }
        this.setRippleProperties-07v42R4(v, v2, f);
        if(z) {
            t1.setHotspot(Offset.getX-impl(pressInteraction$Press0.getPressPosition-F1C5BW0()), Offset.getY-impl(pressInteraction$Press0.getPressPosition-F1C5BW0()));
        }
        else {
            t1.setHotspot(((float)t1.getBounds().centerX()), ((float)t1.getBounds().centerY()));
        }
        this.setRippleState(true);
    }

    public final void disposeRipple() {
        this.e = null;
        a a0 = this.d;
        if(a0 == null) {
            t t0 = this.a;
            if(t0 != null) {
                t0.setState(RippleHostView.g);
            }
        }
        else {
            this.removeCallbacks(a0);
            a a1 = this.d;
            Intrinsics.checkNotNull(a1);
            a1.run();
        }
        t t1 = this.a;
        if(t1 == null) {
            return;
        }
        t1.setVisible(false, false);
        this.unscheduleDrawable(t1);
    }

    @Override  // android.view.View
    public void invalidateDrawable(@NotNull Drawable drawable0) {
        Function0 function00 = this.e;
        if(function00 != null) {
            function00.invoke();
        }
    }

    @Override  // android.view.View
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    @Override  // android.view.View
    public void refreshDrawableState() {
    }

    public final void removeRipple() {
        this.setRippleState(false);
    }

    public final void setRippleProperties-07v42R4(long v, long v1, float f) {
        t t0 = this.a;
        if(t0 == null) {
            return;
        }
        if(Build.VERSION.SDK_INT < 28) {
            f *= 2.0f;
        }
        long v2 = Color.copy-wmQWz5c$default(v1, c.coerceAtMost(f, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
        if(!(t0.b == null ? false : Color.equals-impl0(t0.b.unbox-impl(), v2))) {
            t0.b = Color.box-impl(v2);
            t0.setColor(ColorStateList.valueOf(ColorKt.toArgb-8_81llA(v2)));
        }
        Rect rect0 = new Rect(0, 0, zd.c.roundToInt(Size.getWidth-impl(v)), zd.c.roundToInt(Size.getHeight-impl(v)));
        this.setLeft(rect0.left);
        this.setTop(rect0.top);
        this.setRight(rect0.right);
        this.setBottom(rect0.bottom);
        t0.setBounds(rect0);
    }

    private final void setRippleState(boolean z) {
        long v = AnimationUtils.currentAnimationTimeMillis();
        a a0 = this.d;
        if(a0 != null) {
            this.removeCallbacks(a0);
            a0.run();
        }
        if(z || v - (this.c == null ? 0L : ((long)this.c)) >= 5L) {
            int[] arr_v = z ? RippleHostView.f : RippleHostView.g;
            t t0 = this.a;
            if(t0 != null) {
                t0.setState(arr_v);
            }
        }
        else {
            a a1 = new a(this, 2);
            this.d = a1;
            this.postDelayed(a1, 50L);
        }
        this.c = v;
    }

    private static final void setRippleState$lambda$2(RippleHostView rippleHostView0) {
        t t0 = rippleHostView0.a;
        if(t0 != null) {
            t0.setState(RippleHostView.g);
        }
        rippleHostView0.d = null;
    }
}

