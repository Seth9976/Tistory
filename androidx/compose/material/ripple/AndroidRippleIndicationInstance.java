package androidx.compose.material.ripple;

import android.view.ViewGroup;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import o0.e;
import org.jetbrains.annotations.NotNull;
import zd.c;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Replaced by the new RippleNode implementation")
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B;\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\b\u0012\u0006\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u000F\u0010\u0010J\u0013\u0010\u0013\u001A\u00020\u0012*\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001F\u0010\u0019\u001A\u00020\u00122\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001B\u001A\u00020\u00122\u0006\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001D\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010\u001F\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u001F\u0010\u001EJ\u000F\u0010 \u001A\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u001EJ\u000F\u0010!\u001A\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\u001E¨\u0006\""}, d2 = {"Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/material/ripple/RippleHostKey;", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroid/view/ViewGroup;", "view", "<init>", "(ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroid/view/ViewGroup;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "drawIndication", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Lkotlinx/coroutines/CoroutineScope;", "scope", "addRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;Lkotlinx/coroutines/CoroutineScope;)V", "removeRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "onRemembered", "()V", "onForgotten", "onAbandoned", "onResetRippleHostView", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,381:1\n81#2:382\n107#2,2:383\n81#2:385\n107#2,2:386\n137#3:388\n246#4:389\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n*L\n219#1:382\n219#1:383,2\n227#1:385\n227#1:386,2\n252#1:388\n266#1:389\n*E\n"})
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RippleHostKey, RememberObserver {
    public static final int $stable = 8;
    public final boolean c;
    public final float d;
    public final State e;
    public final State f;
    public final ViewGroup g;
    public RippleContainer h;
    public final MutableState i;
    public final MutableState j;
    public long k;
    public int l;
    public final e m;

    public AndroidRippleIndicationInstance(boolean z, float f, State state0, State state1, ViewGroup viewGroup0, DefaultConstructorMarker defaultConstructorMarker0) {
        super(z, state1);
        this.c = z;
        this.d = f;
        this.e = state0;
        this.f = state1;
        this.g = viewGroup0;
        this.i = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.j = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.k = 0L;
        this.l = -1;
        this.m = new e(this, 26);
    }

    public static final boolean access$getInvalidateTick(AndroidRippleIndicationInstance androidRippleIndicationInstance0) {
        return ((Boolean)androidRippleIndicationInstance0.j.getValue()).booleanValue();
    }

    public static final void access$setInvalidateTick(AndroidRippleIndicationInstance androidRippleIndicationInstance0, boolean z) {
        androidRippleIndicationInstance0.j.setValue(Boolean.valueOf(z));
    }

    @Override  // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(@NotNull Press pressInteraction$Press0, @NotNull CoroutineScope coroutineScope0) {
        RippleContainer rippleContainer0 = this.h;
        if(rippleContainer0 == null) {
            rippleContainer0 = Ripple_androidKt.access$createAndAttachRippleContainerIfNeeded(this.g);
            this.h = rippleContainer0;
        }
        Intrinsics.checkNotNull(rippleContainer0);
        RippleHostView rippleHostView0 = rippleContainer0.getRippleHostView(this);
        long v = this.k;
        int v1 = this.l;
        long v2 = ((Color)this.e.getValue()).unbox-impl();
        float f = ((RippleAlpha)this.f.getValue()).getPressedAlpha();
        rippleHostView0.addRipple-KOepWvA(pressInteraction$Press0, this.c, v, v1, v2, f, this.m);
        this.i.setValue(rippleHostView0);
    }

    @Override  // androidx.compose.foundation.IndicationInstance
    public void drawIndication(@NotNull ContentDrawScope contentDrawScope0) {
        int v1;
        this.k = contentDrawScope0.getSize-NH-jbRc();
        float f = this.d;
        if(Float.isNaN(f)) {
            long v = contentDrawScope0.getSize-NH-jbRc();
            v1 = c.roundToInt(RippleAnimationKt.getRippleEndRadius-cSwnlzA(contentDrawScope0, this.c, v));
        }
        else {
            v1 = contentDrawScope0.roundToPx-0680j_4(f);
        }
        this.l = v1;
        long v2 = ((Color)this.e.getValue()).unbox-impl();
        float f1 = ((RippleAlpha)this.f.getValue()).getPressedAlpha();
        contentDrawScope0.drawContent();
        this.drawStateLayer-H2RKhps(contentDrawScope0, f, v2);
        Canvas canvas0 = contentDrawScope0.getDrawContext().getCanvas();
        ((Boolean)this.j.getValue()).booleanValue();
        RippleHostView rippleHostView0 = (RippleHostView)this.i.getValue();
        if(rippleHostView0 != null) {
            rippleHostView0.setRippleProperties-07v42R4(contentDrawScope0.getSize-NH-jbRc(), v2, f1);
            rippleHostView0.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas0));
        }
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        RippleContainer rippleContainer0 = this.h;
        if(rippleContainer0 != null) {
            rippleContainer0.disposeRippleIfNeeded(this);
        }
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        RippleContainer rippleContainer0 = this.h;
        if(rippleContainer0 != null) {
            rippleContainer0.disposeRippleIfNeeded(this);
        }
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    @Override  // androidx.compose.material.ripple.RippleHostKey
    public void onResetRippleHostView() {
        this.i.setValue(null);
    }

    @Override  // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(@NotNull Press pressInteraction$Press0) {
        RippleHostView rippleHostView0 = (RippleHostView)this.i.getValue();
        if(rippleHostView0 != null) {
            rippleHostView0.removeRipple();
        }
    }
}

