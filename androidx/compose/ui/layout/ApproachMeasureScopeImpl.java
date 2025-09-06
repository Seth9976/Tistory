package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u00AA\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJO\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n2\u0014\b\u0002\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\n0\r2\u0017\u0010\u0014\u001A\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u00A2\u0006\u0002\b\u0013H\u0096\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001B\u001A\u00020\n*\u00020\u0018H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001B\u001A\u00020\n*\u00020\u001CH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010!\u001A\u00020\u0018*\u00020\u001CH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 J\u001A\u0010!\u001A\u00020\u0018*\u00020\"H\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$J\u001A\u0010!\u001A\u00020\u0018*\u00020\nH\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010%J\u0017\u0010*\u001A\u00020\'*\u00020&H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010)J\u0017\u0010,\u001A\u00020\"*\u00020\u0018H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b+\u0010$J\u0017\u0010,\u001A\u00020\"*\u00020\u001CH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b-\u0010 J\u0014\u00100\u001A\u00020/*\u00020.H\u0097\u0001\u00A2\u0006\u0004\b0\u00101J\u0017\u00103\u001A\u00020&*\u00020\'H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b2\u0010)J\u0017\u00106\u001A\u00020\u001C*\u00020\u0018H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b4\u00105J\u001A\u00106\u001A\u00020\u001C*\u00020\"H\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b7\u00105J\u001A\u00106\u001A\u00020\u001C*\u00020\nH\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b7\u00108J\u0013\u0010:\u001A\u000209*\u000209H\u0016\u00A2\u0006\u0004\b:\u0010;Jg\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n2\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\n0\r2\u0019\u0010=\u001A\u0015\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u00A2\u0006\u0002\b\u00132\u0017\u0010\u0014\u001A\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u00A2\u0006\u0002\b\u0013H\u0016\u00A2\u0006\u0004\b\u0016\u0010>R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010BR\"\u0010\u0007\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bC\u0010D\u001A\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010P\u001A\u00020I8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0014\u0010S\u001A\u00020\"8\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\bQ\u0010RR\u0014\u0010U\u001A\u00020\"8\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\bT\u0010RR\u0014\u0010Y\u001A\u00020V8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bW\u0010XR\u001A\u0010]\u001A\u00020Z8VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b[\u0010\\R\u001A\u0010`\u001A\u00020^8VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b_\u0010\\R\u0018\u0010c\u001A\u000209*\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\ba\u0010bR\u0014\u0010d\u001A\u00020I8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bd\u0010M\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006e"}, d2 = {"Landroidx/compose/ui/layout/ApproachMeasureScopeImpl;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "coordinator", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "approachNode", "<init>", "(Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;Landroidx/compose/ui/layout/ApproachLayoutModifierNode;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/layout/LayoutCoordinates;", "toLookaheadCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/layout/RulerScope;", "rulers", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "a", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "b", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "getApproachNode", "()Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "setApproachNode", "(Landroidx/compose/ui/layout/ApproachLayoutModifierNode;)V", "", "c", "Z", "getApproachMeasureRequired$ui_release", "()Z", "setApproachMeasureRequired$ui_release", "(Z)V", "approachMeasureRequired", "getDensity", "()F", "density", "getFontScale", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Constraints;", "getLookaheadConstraints-msEJaDk", "()J", "lookaheadConstraints", "Landroidx/compose/ui/unit/IntSize;", "getLookaheadSize-YbymL2g", "lookaheadSize", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadScopeCoordinates", "isLookingAhead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nApproachMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApproachMeasureScope.kt\nandroidx/compose/ui/layout/ApproachMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,120:1\n1#2:121\n341#3:122\n342#3:128\n345#3:130\n42#4,5:123\n48#4:129\n*S KotlinDebug\n*F\n+ 1 ApproachMeasureScope.kt\nandroidx/compose/ui/layout/ApproachMeasureScopeImpl\n*L\n102#1:122\n102#1:128\n102#1:130\n102#1:123,5\n102#1:129\n*E\n"})
public final class ApproachMeasureScopeImpl implements ApproachMeasureScope, LookaheadScope, MeasureScope {
    public static final int $stable;
    public final LayoutModifierNodeCoordinator a;
    public ApproachLayoutModifierNode b;
    public boolean c;

    public ApproachMeasureScopeImpl(@NotNull LayoutModifierNodeCoordinator layoutModifierNodeCoordinator0, @NotNull ApproachLayoutModifierNode approachLayoutModifierNode0) {
        this.a = layoutModifierNodeCoordinator0;
        this.b = approachLayoutModifierNode0;
    }

    public final boolean getApproachMeasureRequired$ui_release() {
        return this.c;
    }

    @NotNull
    public final ApproachLayoutModifierNode getApproachNode() {
        return this.b;
    }

    @NotNull
    public final LayoutModifierNodeCoordinator getCoordinator() {
        return this.a;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.a.getDensity();
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.a.getFontScale();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.a.getLayoutDirection();
    }

    @Override  // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    public long getLookaheadConstraints-msEJaDk() {
        Constraints constraints0 = this.a.getLookaheadConstraints-DWUhwKw$ui_release();
        if(constraints0 == null) {
            throw new IllegalArgumentException("Error: Lookahead constraints requested before lookahead measure.");
        }
        return constraints0.unbox-impl();
    }

    @Override  // androidx.compose.ui.layout.LookaheadScope
    @NotNull
    public LayoutCoordinates getLookaheadScopeCoordinates(@NotNull PlacementScope placeable$PlacementScope0) {
        LayoutNode layoutNode0 = this.a.getLayoutNode().getLookaheadRoot$ui_release();
        if(layoutNode0 == null) {
            throw new IllegalArgumentException("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
        }
        if(layoutNode0.isVirtualLookaheadRoot$ui_release()) {
            LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
            if(layoutNode1 != null) {
                LayoutCoordinates layoutCoordinates0 = layoutNode1.getInnerCoordinator$ui_release();
                if(layoutCoordinates0 != null) {
                    return layoutCoordinates0;
                }
            }
            return ((LayoutNode)layoutNode0.getChildren$ui_release().get(0)).getOuterCoordinator$ui_release();
        }
        return layoutNode0.getOuterCoordinator$ui_release();
    }

    @Override  // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    public long getLookaheadSize-YbymL2g() {
        LookaheadDelegate lookaheadDelegate0 = this.a.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate0);
        MeasureResult measureResult0 = lookaheadDelegate0.getMeasureResult$ui_release();
        return IntSizeKt.IntSize(measureResult0.getWidth(), measureResult0.getHeight());
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    @Override  // androidx.compose.ui.layout.MeasureScope
    @NotNull
    public MeasureResult layout(int v, int v1, @NotNull Map map0, @NotNull Function1 function10) {
        return this.a.layout(v, v1, map0, function10);
    }

    @Override  // androidx.compose.ui.layout.MeasureScope
    @NotNull
    public MeasureResult layout(int v, int v1, @NotNull Map map0, @Nullable Function1 function10, @NotNull Function1 function11) {
        if((v & 0xFF000000) != 0 || (0xFF000000 & v1) != 0) {
            InlineClassHelperKt.throwIllegalStateException(("Size(" + v + " x " + v1 + ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new MeasureResult() {
            public final int a;
            public final int b;
            public final Map c;
            public final Function1 d;
            public final Function1 e;
            public final ApproachMeasureScopeImpl f;

            {
                int v = v1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                int v1 = map0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Map map0 = function10;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function10 = function11;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function11 = this;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.e = function11;
                this.f = approachMeasureScopeImpl0;
                this.a = v;
                this.b = v1;
                this.c = map0;
                this.d = function10;
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            @NotNull
            public Map getAlignmentLines() {
                return this.c;
            }

            public static void getAlignmentLines$annotations() {
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.b;
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            @Nullable
            public Function1 getRulers() {
                return this.d;
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.a;
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                PlacementScope placeable$PlacementScope0 = this.f.getCoordinator().getPlacementScope();
                this.e.invoke(placeable$PlacementScope0);
            }
        };
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int roundToPx--R2X_6o(long v) {
        return this.a.roundToPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int roundToPx-0680j_4(float f) {
        return this.a.roundToPx-0680j_4(f);
    }

    public final void setApproachMeasureRequired$ui_release(boolean z) {
        this.c = z;
    }

    public final void setApproachNode(@NotNull ApproachLayoutModifierNode approachLayoutModifierNode0) {
        this.b = approachLayoutModifierNode0;
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    @Stable
    public float toDp-GaN1DYA(long v) {
        return this.a.toDp-GaN1DYA(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toDp-u2uoSUM(float f) {
        return this.a.toDp-u2uoSUM(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toDp-u2uoSUM(int v) {
        return this.a.toDp-u2uoSUM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toDpSize-k-rfVVM(long v) {
        return this.a.toDpSize-k-rfVVM(v);
    }

    @Override  // androidx.compose.ui.layout.LookaheadScope
    @NotNull
    public LayoutCoordinates toLookaheadCoordinates(@NotNull LayoutCoordinates layoutCoordinates0) {
        if(layoutCoordinates0 instanceof LookaheadLayoutCoordinates) {
            return layoutCoordinates0;
        }
        if(!(layoutCoordinates0 instanceof NodeCoordinator)) {
            throw new IllegalArgumentException("Unsupported LayoutCoordinates: " + layoutCoordinates0);
        }
        LookaheadDelegate lookaheadDelegate0 = ((NodeCoordinator)layoutCoordinates0).getLookaheadDelegate();
        if(lookaheadDelegate0 != null) {
            LookaheadLayoutCoordinates lookaheadLayoutCoordinates0 = lookaheadDelegate0.getLookaheadLayoutCoordinates();
            if(lookaheadLayoutCoordinates0 != null) {
                return lookaheadLayoutCoordinates0;
            }
        }
        return layoutCoordinates0;
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toPx--R2X_6o(long v) {
        return this.a.toPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toPx-0680j_4(float f) {
        return this.a.toPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect0) {
        return this.a.toRect(dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toSize-XkaWNTQ(long v) {
        return this.a.toSize-XkaWNTQ(v);
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    @Stable
    public long toSp-0xMU5do(float f) {
        return this.a.toSp-0xMU5do(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toSp-kPz2Gy4(float f) {
        return this.a.toSp-kPz2Gy4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toSp-kPz2Gy4(int v) {
        return this.a.toSp-kPz2Gy4(v);
    }
}

