package androidx.compose.foundation;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.EdgeEffect;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import u.j;
import u.l;
import u.m1;
import u.n1;
import u.o1;
import zd.c;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0010\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ?\u0010\u001A\u001A\u00020\u00172\u0006\u0010\u0012\u001A\u00020\u00112\"\u0010\u0016\u001A\u001E\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001F\u001A\u00020\u00172\u0006\u0010\u001C\u001A\u00020\u001BH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001D\u0010\u001EJ\u0015\u0010\"\u001A\u00020\bH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u000F\u0010%\u001A\u00020\u0017H\u0000¢\u0006\u0004\b#\u0010$R \u0010+\u001A\b\u0012\u0004\u0012\u00020\u00170&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*R(\u00104\u001A\u00020,8\u0000@\u0000X\u0081\u000E¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u0010$\u001A\u0004\b/\u00100\"\u0004\b1\u00102R\u001A\u0010:\u001A\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R\u0014\u0010;\u001A\u00020,8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b;\u00100\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "Landroid/content/Context;", "context", "Landroidx/compose/foundation/OverscrollConfiguration;", "overscrollConfig", "<init>", "(Landroid/content/Context;Landroidx/compose/foundation/OverscrollConfiguration;)V", "Landroidx/compose/ui/geometry/Offset;", "delta", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "Lkotlin/Function1;", "performScroll", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "applyToScroll", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "performFling", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToFling", "Landroidx/compose/ui/geometry/Size;", "size", "updateSize-uvyYCjk$foundation_release", "(J)V", "updateSize", "displacement-F1C5BW0$foundation_release", "()J", "displacement", "invalidateOverscroll$foundation_release", "()V", "invalidateOverscroll", "Landroidx/compose/runtime/MutableState;", "c", "Landroidx/compose/runtime/MutableState;", "getRedrawSignal$foundation_release", "()Landroidx/compose/runtime/MutableState;", "redrawSignal", "", "d", "Z", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "invalidationEnabled", "Landroidx/compose/ui/Modifier;", "h", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "effectModifier", "isInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n*L\n1#1,875:1\n135#2:876\n135#2:877\n806#3,5:878\n806#3,5:883\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n664#1:876\n674#1:877\n585#1:878,5\n691#1:883,5\n*E\n"})
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    public static final int $stable;
    public Offset a;
    public final o1 b;
    public final MutableState c;
    public boolean d;
    public boolean e;
    public long f;
    public PointerId g;
    public final Modifier h;

    public AndroidEdgeEffectOverscrollEffect(@NotNull Context context0, @NotNull OverscrollConfiguration overscrollConfiguration0) {
        o1 o10 = new o1(context0, ColorKt.toArgb-8_81llA(overscrollConfiguration0.getGlowColor-0d7_KjU()));
        this.b = o10;
        SnapshotMutationPolicy snapshotMutationPolicy0 = SnapshotStateKt.neverEqualPolicy();
        this.c = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, snapshotMutationPolicy0);
        this.d = true;
        this.f = 0L;
        l l0 = new l(this, null);
        Modifier modifier0 = SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, Unit.INSTANCE, l0);
        n1 n10 = Build.VERSION.SDK_INT >= 0x1F ? new n1(this, o10, InspectableValueKt.getNoInspectorInfo()) : new m1(this, o10, overscrollConfiguration0, InspectableValueKt.getNoInspectorInfo());
        this.h = modifier0.then(n10);

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n1#1,178:1\n665#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.special..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final AndroidEdgeEffectOverscrollEffect w;

            public androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.special..inlined.debugInspectorInfo.1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect0) {
                this.w = androidEdgeEffectOverscrollEffect0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("overscroll");
                inspectorInfo0.setValue(this.w);
            }
        }


        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n1#1,178:1\n675#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.special..inlined.debugInspectorInfo.2 extends Lambda implements Function1 {
            public final AndroidEdgeEffectOverscrollEffect w;

            public androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.special..inlined.debugInspectorInfo.2(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect0) {
                this.w = androidEdgeEffectOverscrollEffect0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("overscroll");
                inspectorInfo0.setValue(this.w);
            }
        }

    }

    public final void a() {
        boolean z1;
        o1 o10 = this.b;
        EdgeEffect edgeEffect0 = o10.d;
        boolean z = false;
        if(edgeEffect0 == null) {
            z1 = false;
        }
        else {
            edgeEffect0.onRelease();
            z1 = edgeEffect0.isFinished();
        }
        EdgeEffect edgeEffect1 = o10.e;
        if(edgeEffect1 != null) {
            edgeEffect1.onRelease();
            z1 = edgeEffect1.isFinished() || z1;
        }
        EdgeEffect edgeEffect2 = o10.f;
        if(edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z1 = edgeEffect2.isFinished() || z1;
        }
        EdgeEffect edgeEffect3 = o10.g;
        if(edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if(edgeEffect3.isFinished() || z1) {
                z = true;
            }
            z1 = z;
        }
        if(z1) {
            this.invalidateOverscroll$foundation_release();
        }
    }

    @Override  // androidx.compose.foundation.OverscrollEffect
    @Nullable
    public Object applyToFling-BMRW4eQ(long v, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect0;
        long v7;
        float f1;
        float f;
        j j0;
        if(continuation0 instanceof j) {
            j0 = (j)continuation0;
            int v1 = j0.s;
            if((v1 & 0x80000000) == 0) {
                j0 = new j(this, continuation0);
            }
            else {
                j0.s = v1 ^ 0x80000000;
            }
        }
        else {
            j0 = new j(this, continuation0);
        }
        Object object0 = j0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(j0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(Size.isEmpty-impl(this.f)) {
                    Velocity velocity0 = Velocity.box-impl(v);
                    j0.s = 1;
                    return function20.invoke(velocity0, j0) == object1 ? object1 : Unit.INSTANCE;
                }
                o1 o10 = this.b;
                if(Float.compare(Velocity.getX-impl(v), 0.0f) > 0 && o1.g(o10.f)) {
                    EdgeEffect edgeEffect0 = o10.c();
                    int v2 = c.roundToInt(Velocity.getX-impl(v));
                    EdgeEffectCompat.INSTANCE.onAbsorbCompat(edgeEffect0, v2);
                    f = Velocity.getX-impl(v);
                }
                else if(Velocity.getX-impl(v) >= 0.0f || !o1.g(o10.g)) {
                    f = 0.0f;
                }
                else {
                    EdgeEffect edgeEffect1 = o10.d();
                    int v3 = c.roundToInt(Velocity.getX-impl(v));
                    EdgeEffectCompat.INSTANCE.onAbsorbCompat(edgeEffect1, -v3);
                    f = Velocity.getX-impl(v);
                }
                if(Velocity.getY-impl(v) > 0.0f && o1.g(o10.d)) {
                    EdgeEffect edgeEffect2 = o10.e();
                    int v4 = c.roundToInt(Velocity.getY-impl(v));
                    EdgeEffectCompat.INSTANCE.onAbsorbCompat(edgeEffect2, v4);
                    f1 = Velocity.getY-impl(v);
                }
                else if(Velocity.getY-impl(v) >= 0.0f || !o1.g(o10.e)) {
                    f1 = 0.0f;
                }
                else {
                    EdgeEffect edgeEffect3 = o10.b();
                    int v5 = c.roundToInt(Velocity.getY-impl(v));
                    EdgeEffectCompat.INSTANCE.onAbsorbCompat(edgeEffect3, -v5);
                    f1 = Velocity.getY-impl(v);
                }
                long v6 = VelocityKt.Velocity(f, f1);
                if(!Velocity.equals-impl0(v6, 0L)) {
                    this.invalidateOverscroll$foundation_release();
                }
                v7 = Velocity.minus-AH228Gc(v, v6);
                Velocity velocity1 = Velocity.box-impl(v7);
                j0.o = this;
                j0.p = v7;
                j0.s = 2;
                object0 = function20.invoke(velocity1, j0);
                if(object0 == object1) {
                    return object1;
                }
                androidEdgeEffectOverscrollEffect0 = this;
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            case 2: {
                v7 = j0.p;
                androidEdgeEffectOverscrollEffect0 = j0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        long v8 = Velocity.minus-AH228Gc(v7, ((Velocity)object0).unbox-impl());
        androidEdgeEffectOverscrollEffect0.e = false;
        o1 o11 = androidEdgeEffectOverscrollEffect0.b;
        if(Float.compare(Velocity.getX-impl(v8), 0.0f) > 0) {
            EdgeEffect edgeEffect4 = o11.c();
            int v9 = c.roundToInt(Velocity.getX-impl(v8));
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(edgeEffect4, v9);
        }
        else if(Velocity.getX-impl(v8) < 0.0f) {
            EdgeEffect edgeEffect5 = o11.d();
            int v10 = c.roundToInt(Velocity.getX-impl(v8));
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(edgeEffect5, -v10);
        }
        if(Velocity.getY-impl(v8) > 0.0f) {
            EdgeEffect edgeEffect6 = o11.e();
            int v11 = c.roundToInt(Velocity.getY-impl(v8));
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(edgeEffect6, v11);
        }
        else if(Velocity.getY-impl(v8) < 0.0f) {
            EdgeEffect edgeEffect7 = o11.b();
            int v12 = c.roundToInt(Velocity.getY-impl(v8));
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(edgeEffect7, -v12);
        }
        if(!Velocity.equals-impl0(v8, 0L)) {
            androidEdgeEffectOverscrollEffect0.invalidateOverscroll$foundation_release();
        }
        androidEdgeEffectOverscrollEffect0.a();
        return Unit.INSTANCE;
    }

    @Override  // androidx.compose.foundation.OverscrollEffect
    public long applyToScroll-Rhakbz0(long v, int v1, @NotNull Function1 function10) {
        int v6;
        boolean z2;
        boolean z1;
        boolean z;
        float f1;
        float f;
        if(Size.isEmpty-impl(this.f)) {
            return ((Offset)function10.invoke(Offset.box-impl(v))).unbox-impl();
        }
        o1 o10 = this.b;
        if(!this.e) {
            if(o1.g(o10.f)) {
                this.c(0L);
            }
            if(o1.g(o10.g)) {
                this.d(0L);
            }
            if(o1.g(o10.d)) {
                this.e(0L);
            }
            if(o1.g(o10.e)) {
                this.b(0L);
            }
            this.e = true;
        }
        if(Offset.getY-impl(v) == 0.0f) {
            f = 0.0f;
        }
        else if(o1.g(o10.d)) {
            f = this.e(v);
            if(!o1.g(o10.d)) {
                o10.e().onRelease();
            }
        }
        else if(o1.g(o10.e)) {
            f = this.b(v);
            if(!o1.g(o10.e)) {
                o10.b().onRelease();
            }
        }
        else {
            f = 0.0f;
        }
        if(Offset.getX-impl(v) == 0.0f) {
            f1 = 0.0f;
        }
        else if(o1.g(o10.f)) {
            f1 = this.c(v);
            if(!o1.g(o10.f)) {
                o10.c().onRelease();
            }
        }
        else if(o1.g(o10.g)) {
            f1 = this.d(v);
            if(!o1.g(o10.g)) {
                o10.d().onRelease();
            }
        }
        else {
            f1 = 0.0f;
        }
        long v2 = OffsetKt.Offset(f1, f);
        if(!Offset.equals-impl0(v2, 0L)) {
            this.invalidateOverscroll$foundation_release();
        }
        long v3 = Offset.minus-MK-Hz9U(v, v2);
        long v4 = ((Offset)function10.invoke(Offset.box-impl(v3))).unbox-impl();
        long v5 = Offset.minus-MK-Hz9U(v3, v4);
        if(NestedScrollSource.equals-impl0(v1, 1)) {
            if(Float.compare(Offset.getX-impl(v5), 0.5f) > 0) {
                this.c(v5);
                z = true;
            }
            else if(Offset.getX-impl(v5) < -0.5f) {
                this.d(v5);
                z = true;
            }
            else {
                z = false;
            }
            if(Offset.getY-impl(v5) > 0.5f) {
                this.e(v5);
                z1 = true;
            }
            else if(Offset.getY-impl(v5) < -0.5f) {
                this.b(v5);
                z1 = true;
            }
            else {
                z1 = false;
            }
            z2 = !z && !z1 ? false : true;
        }
        else {
            z2 = false;
        }
        if(!o1.f(o10.f) || Offset.getX-impl(v) >= 0.0f) {
            v6 = 0;
        }
        else {
            EdgeEffect edgeEffect0 = o10.c();
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(edgeEffect0, Offset.getX-impl(v));
            v6 = !o1.f(o10.f);
        }
        if(o1.f(o10.g) && Offset.getX-impl(v) > 0.0f) {
            EdgeEffect edgeEffect1 = o10.d();
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(edgeEffect1, Offset.getX-impl(v));
            v6 = v6 != 0 || !o1.f(o10.g) ? 1 : 0;
        }
        if(o1.f(o10.d) && Offset.getY-impl(v) < 0.0f) {
            EdgeEffect edgeEffect2 = o10.e();
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(edgeEffect2, Offset.getY-impl(v));
            v6 = v6 != 0 || !o1.f(o10.d) ? 1 : 0;
        }
        if(o1.f(o10.e) && Offset.getY-impl(v) > 0.0f) {
            EdgeEffect edgeEffect3 = o10.b();
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(edgeEffect3, Offset.getY-impl(v));
            v6 = v6 != 0 || !o1.f(o10.e) ? 1 : 0;
        }
        if(v6 != 0 || z2) {
            this.invalidateOverscroll$foundation_release();
        }
        return Offset.plus-MK-Hz9U(v2, v4);
    }

    public final float b(long v) {
        float f = Offset.getX-impl(this.displacement-F1C5BW0$foundation_release());
        float f1 = Size.getHeight-impl(this.f);
        EdgeEffect edgeEffect0 = this.b.b();
        float f2 = EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffect0, -(Offset.getY-impl(v) / f1), 1.0f - f);
        float f3 = Size.getHeight-impl(this.f) * -f2;
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect0) == 0.0f ? f3 : Offset.getY-impl(v);
    }

    public final float c(long v) {
        float f = Offset.getY-impl(this.displacement-F1C5BW0$foundation_release());
        float f1 = Size.getWidth-impl(this.f);
        EdgeEffect edgeEffect0 = this.b.c();
        float f2 = EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffect0, Offset.getX-impl(v) / f1, 1.0f - f);
        float f3 = Size.getWidth-impl(this.f) * f2;
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect0) == 0.0f ? f3 : Offset.getX-impl(v);
    }

    public final float d(long v) {
        float f = Offset.getY-impl(this.displacement-F1C5BW0$foundation_release());
        float f1 = Size.getWidth-impl(this.f);
        EdgeEffect edgeEffect0 = this.b.d();
        float f2 = EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffect0, -(Offset.getX-impl(v) / f1), f);
        float f3 = Size.getWidth-impl(this.f) * -f2;
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect0) == 0.0f ? f3 : Offset.getX-impl(v);
    }

    public final long displacement-F1C5BW0$foundation_release() {
        long v;
        Offset offset0 = this.a;
        if(offset0 != null) {
            v = offset0.unbox-impl();
            return OffsetKt.Offset(Offset.getX-impl(v) / Size.getWidth-impl(this.f), Offset.getY-impl(v) / Size.getHeight-impl(this.f));
        }
        v = SizeKt.getCenter-uvyYCjk(this.f);
        return OffsetKt.Offset(Offset.getX-impl(v) / Size.getWidth-impl(this.f), Offset.getY-impl(v) / Size.getHeight-impl(this.f));
    }

    public final float e(long v) {
        float f = Offset.getX-impl(this.displacement-F1C5BW0$foundation_release());
        float f1 = Size.getHeight-impl(this.f);
        EdgeEffect edgeEffect0 = this.b.e();
        float f2 = EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffect0, Offset.getY-impl(v) / f1, f);
        float f3 = Size.getHeight-impl(this.f) * f2;
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect0) == 0.0f ? f3 : Offset.getY-impl(v);
    }

    @Override  // androidx.compose.foundation.OverscrollEffect
    @NotNull
    public Modifier getEffectModifier() {
        return this.h;
    }

    public final boolean getInvalidationEnabled$foundation_release() {
        return this.d;
    }

    @VisibleForTesting
    public static void getInvalidationEnabled$foundation_release$annotations() {
    }

    @NotNull
    public final MutableState getRedrawSignal$foundation_release() {
        return this.c;
    }

    public final void invalidateOverscroll$foundation_release() {
        if(this.d) {
            this.c.setValue(Unit.INSTANCE);
        }
    }

    @Override  // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        o1 o10 = this.b;
        if(o10.d != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(o10.d) != 0.0f) {
            return true;
        }
        if(o10.e != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(o10.e) != 0.0f) {
            return true;
        }
        return o10.f == null || EdgeEffectCompat.INSTANCE.getDistanceCompat(o10.f) == 0.0f ? o10.g != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(o10.g) != 0.0f : true;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z) {
        this.d = z;
    }

    public final void updateSize-uvyYCjk$foundation_release(long v) {
        boolean z = Size.equals-impl0(this.f, 0L);
        boolean z1 = Size.equals-impl0(v, this.f);
        this.f = v;
        if(!z1) {
            long v1 = IntSizeKt.IntSize(c.roundToInt(Size.getWidth-impl(v)), c.roundToInt(Size.getHeight-impl(v)));
            o1 o10 = this.b;
            o10.c = v1;
            EdgeEffect edgeEffect0 = o10.d;
            if(edgeEffect0 != null) {
                edgeEffect0.setSize(IntSize.getWidth-impl(v1), IntSize.getHeight-impl(v1));
            }
            EdgeEffect edgeEffect1 = o10.e;
            if(edgeEffect1 != null) {
                edgeEffect1.setSize(IntSize.getWidth-impl(v1), IntSize.getHeight-impl(v1));
            }
            EdgeEffect edgeEffect2 = o10.f;
            if(edgeEffect2 != null) {
                edgeEffect2.setSize(IntSize.getHeight-impl(v1), IntSize.getWidth-impl(v1));
            }
            EdgeEffect edgeEffect3 = o10.g;
            if(edgeEffect3 != null) {
                edgeEffect3.setSize(IntSize.getHeight-impl(v1), IntSize.getWidth-impl(v1));
            }
            EdgeEffect edgeEffect4 = o10.h;
            if(edgeEffect4 != null) {
                edgeEffect4.setSize(IntSize.getWidth-impl(v1), IntSize.getHeight-impl(v1));
            }
            EdgeEffect edgeEffect5 = o10.i;
            if(edgeEffect5 != null) {
                edgeEffect5.setSize(IntSize.getWidth-impl(v1), IntSize.getHeight-impl(v1));
            }
            EdgeEffect edgeEffect6 = o10.j;
            if(edgeEffect6 != null) {
                edgeEffect6.setSize(IntSize.getHeight-impl(v1), IntSize.getWidth-impl(v1));
            }
            EdgeEffect edgeEffect7 = o10.k;
            if(edgeEffect7 != null) {
                edgeEffect7.setSize(IntSize.getHeight-impl(v1), IntSize.getWidth-impl(v1));
            }
        }
        if(!z && !z1) {
            this.invalidateOverscroll$foundation_release();
            this.a();
        }
    }
}

