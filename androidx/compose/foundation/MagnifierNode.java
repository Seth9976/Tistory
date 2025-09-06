package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.j2;
import u.k2;
import u.l2;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b0\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u009B\u0001\u0012\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00A2\u0006\u0002\b\t\u0012\u001B\b\u0002\u0010\u000B\u001A\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u00A2\u0006\u0002\b\t\u0012\u0016\b\u0002\u0010\u000E\u001A\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u000F\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001A\u00020\f\u0012\b\b\u0002\u0010\u0015\u001A\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001A\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001A\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001A\u00020\u0018\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0092\u0001\u0010\u001E\u001A\u00020\r2\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00A2\u0006\u0002\b\t2\u0019\u0010\u000B\u001A\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u00A2\u0006\u0002\b\t2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\f2\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u00112\u0014\u0010\u000E\u001A\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u0006\u0010\u0019\u001A\u00020\u0018\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001F\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u000F\u0010!\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b!\u0010 J\u000F\u0010\"\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\"\u0010 J\u0013\u0010$\u001A\u00020\r*\u00020#H\u0016\u00A2\u0006\u0004\b$\u0010%J\u0017\u0010(\u001A\u00020\r2\u0006\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b(\u0010)J\u0013\u0010+\u001A\u00020\r*\u00020*H\u0016\u00A2\u0006\u0004\b+\u0010,R3\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00A2\u0006\u0002\b\t8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b-\u0010.\u001A\u0004\b/\u00100\"\u0004\b1\u00102R5\u0010\u000B\u001A\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u00A2\u0006\u0002\b\t8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b3\u0010.\u001A\u0004\b4\u00100\"\u0004\b5\u00102R0\u0010\u000E\u001A\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00068\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b6\u0010.\u001A\u0004\b7\u00100\"\u0004\b8\u00102R\"\u0010\u0010\u001A\u00020\u000F8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0012\u001A\u00020\u00118\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b?\u0010@\u001A\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010\u0013\u001A\u00020\f8\u0006@\u0006X\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bE\u0010F\u001A\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010\u0015\u001A\u00020\u00148\u0006@\u0006X\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bK\u0010:\u001A\u0004\bL\u0010<\"\u0004\bM\u0010>R(\u0010\u0016\u001A\u00020\u00148\u0006@\u0006X\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bN\u0010:\u001A\u0004\bO\u0010<\"\u0004\bP\u0010>R\"\u0010\u0017\u001A\u00020\u00118\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bQ\u0010@\u001A\u0004\bR\u0010B\"\u0004\bS\u0010DR\"\u0010\u0019\u001A\u00020\u00188\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bT\u0010U\u001A\u0004\bV\u0010W\"\u0004\bX\u0010Y\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006Z"}, d2 = {"Landroidx/compose/foundation/MagnifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/DpSize;", "", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "update-5F03MCQ", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "update", "onAttach", "()V", "onDetach", "onObservedReadsChanged", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "n", "Lkotlin/jvm/functions/Function1;", "getSourceCenter", "()Lkotlin/jvm/functions/Function1;", "setSourceCenter", "(Lkotlin/jvm/functions/Function1;)V", "o", "getMagnifierCenter", "setMagnifierCenter", "p", "getOnSizeChanged", "setOnSizeChanged", "q", "F", "getZoom", "()F", "setZoom", "(F)V", "r", "Z", "getUseTextDefault", "()Z", "setUseTextDefault", "(Z)V", "s", "J", "getSize-MYxV2XQ", "()J", "setSize-EaSLcWc", "(J)V", "t", "getCornerRadius-D9Ej5fM", "setCornerRadius-0680j_4", "u", "getElevation-D9Ej5fM", "setElevation-0680j_4", "v", "getClippingEnabled", "setClippingEnabled", "w", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "getPlatformMagnifierFactory", "()Landroidx/compose/foundation/PlatformMagnifierFactory;", "setPlatformMagnifierFactory", "(Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n81#2:495\n107#2,2:496\n1#3:498\n*S KotlinDebug\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n*L\n284#1:495\n284#1:496,2\n*E\n"})
public final class MagnifierNode extends Node implements DrawModifierNode, GlobalPositionAwareModifierNode, ObserverModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    public final MutableState A;
    public State B;
    public long C;
    public IntSize D;
    public Channel E;
    public Function1 n;
    public Function1 o;
    public Function1 p;
    public float q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public boolean v;
    public PlatformMagnifierFactory w;
    public View x;
    public Density y;
    public PlatformMagnifier z;

    // 去混淆评级： 低(30)
    public MagnifierNode(Function1 function10, Function1 function11, Function1 function12, float f, boolean z, long v, float f1, float f2, boolean z1, PlatformMagnifierFactory platformMagnifierFactory0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(function10, ((v1 & 2) == 0 ? function11 : null), ((v1 & 4) == 0 ? function12 : null), ((v1 & 8) == 0 ? f : NaNf), ((v1 & 16) == 0 ? z : false), ((v1 & 0x20) == 0 ? v : 0x7FC000007FC00000L), ((v1 & 0x40) == 0 ? f1 : NaNf), ((v1 & 0x80) == 0 ? f2 : NaNf), ((v1 & 0x100) == 0 ? z1 : true), ((v1 & 0x200) == 0 ? platformMagnifierFactory0 : PlatformMagnifierFactory.Companion.getForCurrentPlatform()), null);
    }

    public MagnifierNode(Function1 function10, Function1 function11, Function1 function12, float f, boolean z, long v, float f1, float f2, boolean z1, PlatformMagnifierFactory platformMagnifierFactory0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.n = function10;
        this.o = function11;
        this.p = function12;
        this.q = f;
        this.r = z;
        this.s = v;
        this.t = f1;
        this.u = f2;
        this.v = z1;
        this.w = platformMagnifierFactory0;
        this.A = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.C = 0x7FC000007FC00000L;
    }

    public static final LayoutCoordinates access$getLayoutCoordinates(MagnifierNode magnifierNode0) {
        return (LayoutCoordinates)magnifierNode0.A.getValue();
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        semanticsPropertyReceiver0.set(Magnifier_androidKt.getMagnifierPositionInRoot(), new k2(this, 0));
    }

    public final long b() {
        if(this.B == null) {
            this.B = SnapshotStateKt.derivedStateOf(new j2(this));
        }
        return this.B == null ? 0x7FC000007FC00000L : ((Offset)this.B.getValue()).unbox-impl();
    }

    public final void c() {
        PlatformMagnifier platformMagnifier0 = this.z;
        if(platformMagnifier0 != null) {
            platformMagnifier0.dismiss();
        }
        View view0 = this.x == null ? DelegatableNode_androidKt.requireView(this) : this.x;
        this.x = view0;
        Density density0 = this.y == null ? DelegatableNodeKt.requireDensity(this) : this.y;
        this.y = density0;
        this.z = this.w.create-nHHXs2Y(view0, this.r, this.s, this.t, this.u, this.v, density0, this.q);
        this.e();
    }

    public final void d() {
        long v1;
        Density density0 = this.y;
        if(density0 == null) {
            density0 = DelegatableNodeKt.requireDensity(this);
            this.y = density0;
        }
        long v = ((Offset)this.n.invoke(density0)).unbox-impl();
        if(OffsetKt.isSpecified-k-4lQ0M(v) && OffsetKt.isSpecified-k-4lQ0M(this.b())) {
            this.C = Offset.plus-MK-Hz9U(this.b(), v);
            Function1 function10 = this.o;
            if(function10 == null) {
                v1 = 0x7FC000007FC00000L;
            }
            else {
                Offset offset0 = Offset.box-impl(((Offset)function10.invoke(density0)).unbox-impl());
                if(!OffsetKt.isSpecified-k-4lQ0M(offset0.unbox-impl())) {
                    offset0 = null;
                }
                v1 = offset0 == null ? 0x7FC000007FC00000L : Offset.plus-MK-Hz9U(this.b(), offset0.unbox-impl());
            }
            if(this.z == null) {
                this.c();
            }
            PlatformMagnifier platformMagnifier0 = this.z;
            if(platformMagnifier0 != null) {
                platformMagnifier0.update-Wko1d7g(this.C, v1, this.q);
            }
            this.e();
            return;
        }
        this.C = 0x7FC000007FC00000L;
        PlatformMagnifier platformMagnifier1 = this.z;
        if(platformMagnifier1 != null) {
            platformMagnifier1.dismiss();
        }
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope0) {
        contentDrawScope0.drawContent();
        Channel channel0 = this.E;
        if(channel0 != null) {
            ChannelResult.box-impl(channel0.trySend-JP2dKIU(Unit.INSTANCE));
        }
    }

    public final void e() {
        PlatformMagnifier platformMagnifier0 = this.z;
        if(platformMagnifier0 == null) {
            return;
        }
        Density density0 = this.y;
        if(density0 == null) {
            return;
        }
        if(!IntSize.equals-impl(platformMagnifier0.getSize-YbymL2g(), this.D)) {
            Function1 function10 = this.p;
            if(function10 != null) {
                function10.invoke(DpSize.box-impl(density0.toDpSize-k-rfVVM(IntSizeKt.toSize-ozmzZPI(platformMagnifier0.getSize-YbymL2g()))));
            }
            this.D = IntSize.box-impl(platformMagnifier0.getSize-YbymL2g());
        }
    }

    public final boolean getClippingEnabled() {
        return this.v;
    }

    public final float getCornerRadius-D9Ej5fM() {
        return this.t;
    }

    public final float getElevation-D9Ej5fM() {
        return this.u;
    }

    @Nullable
    public final Function1 getMagnifierCenter() {
        return this.o;
    }

    @Nullable
    public final Function1 getOnSizeChanged() {
        return this.p;
    }

    @NotNull
    public final PlatformMagnifierFactory getPlatformMagnifierFactory() {
        return this.w;
    }

    public final long getSize-MYxV2XQ() {
        return this.s;
    }

    @NotNull
    public final Function1 getSourceCenter() {
        return this.n;
    }

    public final boolean getUseTextDefault() {
        return this.r;
    }

    public final float getZoom() {
        return this.q;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onAttach() {
        this.onObservedReadsChanged();
        this.E = ChannelKt.Channel$default(0, null, null, 7, null);
        BuildersKt.launch$default(this.getCoroutineScope(), null, null, new l2(this, null), 3, null);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        PlatformMagnifier platformMagnifier0 = this.z;
        if(platformMagnifier0 != null) {
            platformMagnifier0.dismiss();
        }
        this.z = null;
    }

    @Override  // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates0) {
        this.A.setValue(layoutCoordinates0);
    }

    @Override  // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new k2(this, 1));
    }

    public final void setClippingEnabled(boolean z) {
        this.v = z;
    }

    public final void setCornerRadius-0680j_4(float f) {
        this.t = f;
    }

    public final void setElevation-0680j_4(float f) {
        this.u = f;
    }

    public final void setMagnifierCenter(@Nullable Function1 function10) {
        this.o = function10;
    }

    public final void setOnSizeChanged(@Nullable Function1 function10) {
        this.p = function10;
    }

    public final void setPlatformMagnifierFactory(@NotNull PlatformMagnifierFactory platformMagnifierFactory0) {
        this.w = platformMagnifierFactory0;
    }

    public final void setSize-EaSLcWc(long v) {
        this.s = v;
    }

    public final void setSourceCenter(@NotNull Function1 function10) {
        this.n = function10;
    }

    public final void setUseTextDefault(boolean z) {
        this.r = z;
    }

    public final void setZoom(float f) {
        this.q = f;
    }

    public final void update-5F03MCQ(@NotNull Function1 function10, @Nullable Function1 function11, float f, boolean z, long v, float f1, float f2, boolean z1, @Nullable Function1 function12, @NotNull PlatformMagnifierFactory platformMagnifierFactory0) {
        float f3 = this.q;
        long v1 = this.s;
        float f4 = this.t;
        boolean z2 = this.r;
        float f5 = this.u;
        boolean z3 = this.v;
        PlatformMagnifierFactory platformMagnifierFactory1 = this.w;
        View view0 = this.x;
        Density density0 = this.y;
        this.n = function10;
        this.o = function11;
        this.q = f;
        this.r = z;
        this.s = v;
        this.t = f1;
        this.u = f2;
        this.v = z1;
        this.p = function12;
        this.w = platformMagnifierFactory0;
        View view1 = DelegatableNode_androidKt.requireView(this);
        Density density1 = DelegatableNodeKt.requireDensity(this);
        if(this.z != null && (!Magnifier_androidKt.equalsIncludingNaN(f, f3) && !platformMagnifierFactory0.getCanUpdateZoom() || !DpSize.equals-impl0(v, v1) || !Dp.equals-impl0(f1, f4) || !Dp.equals-impl0(f2, f5) || z != z2 || z1 != z3 || !Intrinsics.areEqual(platformMagnifierFactory0, platformMagnifierFactory1) || !Intrinsics.areEqual(view1, view0) || !Intrinsics.areEqual(density1, density0))) {
            this.c();
        }
        this.d();
    }
}

