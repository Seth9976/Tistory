package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import u0.g;
import u0.k;
import u0.m;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nH\u0086@¢\u0006\u0004\b\u000B\u0010\fJ\r\u0010\r\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000EJ\u001C\u0010\u0014\u001A\u00020\n*\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/ripple/RippleAnimation;", "", "Landroidx/compose/ui/geometry/Offset;", "origin", "", "radius", "", "bounded", "<init>", "(Landroidx/compose/ui/geometry/Offset;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "animate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finish", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "color", "draw-4WTKRHQ", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V", "draw", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,184:1\n81#2:185\n107#2,2:186\n81#2:188\n107#2,2:189\n215#3,8:191\n262#3,11:199\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n*L\n73#1:185\n73#1:186,2\n74#1:188\n74#1:189,2\n148#1:191,8\n148#1:199,11\n*E\n"})
public final class RippleAnimation {
    public static final int $stable = 8;
    public Offset a;
    public final float b;
    public final boolean c;
    public Float d;
    public Offset e;
    public final Animatable f;
    public final Animatable g;
    public final Animatable h;
    public final CompletableDeferred i;
    public final MutableState j;
    public final MutableState k;

    public RippleAnimation(Offset offset0, float f, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = offset0;
        this.b = f;
        this.c = z;
        this.f = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.g = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.h = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.i = CompletableDeferredKt.CompletableDeferred(null);
        this.j = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.k = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public static final Object access$fadeIn(RippleAnimation rippleAnimation0, Continuation continuation0) {
        rippleAnimation0.getClass();
        Unit unit0 = CoroutineScopeKt.coroutineScope(new k(rippleAnimation0, null), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public static final Object access$fadeOut(RippleAnimation rippleAnimation0, Continuation continuation0) {
        rippleAnimation0.getClass();
        Unit unit0 = CoroutineScopeKt.coroutineScope(new m(rippleAnimation0, null), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object animate(@NotNull Continuation continuation0) {
        RippleAnimation rippleAnimation0;
        g g0;
        if(continuation0 instanceof g) {
            g0 = (g)continuation0;
            int v = g0.r;
            if((v & 0x80000000) == 0) {
                g0 = new g(this, continuation0);
            }
            else {
                g0.r = v ^ 0x80000000;
            }
        }
        else {
            g0 = new g(this, continuation0);
        }
        Object object0 = g0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                g0.o = this;
                g0.r = 1;
                Unit unit0 = CoroutineScopeKt.coroutineScope(new k(this, null), g0);
                if(unit0 != a.getCOROUTINE_SUSPENDED()) {
                    unit0 = Unit.INSTANCE;
                }
                if(unit0 == object1) {
                    return object1;
                }
                rippleAnimation0 = this;
                goto label_27;
            }
            case 1: {
                rippleAnimation0 = g0.o;
                ResultKt.throwOnFailure(object0);
            label_27:
                rippleAnimation0.j.setValue(Boolean.TRUE);
                g0.o = rippleAnimation0;
                g0.r = 2;
                if(rippleAnimation0.i.await(g0) == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                rippleAnimation0 = g0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 3: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        g0.o = null;
        g0.r = 3;
        rippleAnimation0.getClass();
        Unit unit1 = CoroutineScopeKt.coroutineScope(new m(rippleAnimation0, null), g0);
        if(unit1 != a.getCOROUTINE_SUSPENDED()) {
            unit1 = Unit.INSTANCE;
        }
        return unit1 == object1 ? object1 : Unit.INSTANCE;
    }

    public final void draw-4WTKRHQ(@NotNull DrawScope drawScope0, long v) {
        if(this.d == null) {
            this.d = RippleAnimationKt.getRippleStartRadius-uvyYCjk(drawScope0.getSize-NH-jbRc());
        }
        if(this.a == null) {
            this.a = Offset.box-impl(drawScope0.getCenter-F1C5BW0());
        }
        if(this.e == null) {
            this.e = Offset.box-impl(OffsetKt.Offset(Size.getWidth-impl(drawScope0.getSize-NH-jbRc()) / 2.0f, Size.getHeight-impl(drawScope0.getSize-NH-jbRc()) / 2.0f));
        }
        float f = !((Boolean)this.k.getValue()).booleanValue() || ((Boolean)this.j.getValue()).booleanValue() ? ((Number)this.f.getValue()).floatValue() : 1.0f;
        Float float0 = this.d;
        Intrinsics.checkNotNull(float0);
        float f1 = ((Number)this.g.getValue()).floatValue();
        float f2 = MathHelpersKt.lerp(((float)float0), this.b, f1);
        Offset offset0 = this.a;
        Intrinsics.checkNotNull(offset0);
        Offset offset1 = this.e;
        Intrinsics.checkNotNull(offset1);
        float f3 = MathHelpersKt.lerp(Offset.getX-impl(offset0.unbox-impl()), Offset.getX-impl(offset1.unbox-impl()), ((Number)this.h.getValue()).floatValue());
        Offset offset2 = this.a;
        Intrinsics.checkNotNull(offset2);
        Offset offset3 = this.e;
        Intrinsics.checkNotNull(offset3);
        long v1 = OffsetKt.Offset(f3, MathHelpersKt.lerp(Offset.getY-impl(offset2.unbox-impl()), Offset.getY-impl(offset3.unbox-impl()), ((Number)this.h.getValue()).floatValue()));
        long v2 = Color.copy-wmQWz5c$default(v, Color.getAlpha-impl(v) * f, 0.0f, 0.0f, 0.0f, 14, null);
        if(this.c) {
            float f4 = Size.getWidth-impl(drawScope0.getSize-NH-jbRc());
            float f5 = Size.getHeight-impl(drawScope0.getSize-NH-jbRc());
            DrawContext drawContext0 = drawScope0.getDrawContext();
            long v3 = drawContext0.getSize-NH-jbRc();
            drawContext0.getCanvas().save();
            drawContext0.getTransform().clipRect-N_I0leg(0.0f, 0.0f, f4, f5, 1);
            DrawScope.drawCircle-VaOC9Bg$default(drawScope0, v2, f2, v1, 0.0f, null, null, 0, 120, null);
            r0.a.y(drawContext0, v3);
            return;
        }
        DrawScope.drawCircle-VaOC9Bg$default(drawScope0, v2, f2, v1, 0.0f, null, null, 0, 120, null);
    }

    public final void finish() {
        this.k.setValue(Boolean.TRUE);
        this.i.complete(Unit.INSTANCE);
    }
}

