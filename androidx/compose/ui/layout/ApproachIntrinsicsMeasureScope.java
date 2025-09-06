package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u008C\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\f\u001A\u00020\t*\u00020\bH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\f\u001A\u00020\t*\u00020\rH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0012\u001A\u00020\b*\u00020\rH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0012\u001A\u00020\b*\u00020\u0013H\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0012\u001A\u00020\b*\u00020\tH\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0016J\u0017\u0010\u001B\u001A\u00020\u0018*\u00020\u0017H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001D\u001A\u00020\u0013*\u00020\bH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u0015J\u0017\u0010\u001D\u001A\u00020\u0013*\u00020\rH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u0011J\u0014\u0010!\u001A\u00020 *\u00020\u001FH\u0097\u0001\u00A2\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001A\u00020\u0017*\u00020\u0018H\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010\u001AJ\u0017\u0010\'\u001A\u00020\r*\u00020\bH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&J\u001A\u0010\'\u001A\u00020\r*\u00020\u0013H\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010&J\u001A\u0010\'\u001A\u00020\r*\u00020\tH\u0097\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010)Jg\u00107\u001A\u0002062\u0006\u0010*\u001A\u00020\t2\u0006\u0010+\u001A\u00020\t2\u0012\u0010.\u001A\u000E\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\t0,2\u0019\u00103\u001A\u0015\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000201\u0018\u00010/\u00A2\u0006\u0002\b22\u0017\u00105\u001A\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002010/\u00A2\u0006\u0002\b2H\u0016\u00A2\u0006\u0004\b7\u00108R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<R\u0014\u0010?\u001A\u00020\u00138\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b=\u0010>R\u0014\u0010A\u001A\u00020\u00138\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b@\u0010>R\u0014\u0010C\u001A\u00020B8VX\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bC\u0010DR\u001A\u0010H\u001A\u00020E8\u0016X\u0096\u0005\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bF\u0010GR\u001A\u0010K\u001A\u00020I8\u0016X\u0096\u0005\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bJ\u0010G\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006L"}, d2 = {"Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;", "intrinsicMeasureScope", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "a", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getDensity", "()F", "density", "getFontScale", "fontScale", "", "isLookingAhead", "()Z", "Landroidx/compose/ui/unit/Constraints;", "getLookaheadConstraints-msEJaDk", "()J", "lookaheadConstraints", "Landroidx/compose/ui/unit/IntSize;", "getLookaheadSize-YbymL2g", "lookaheadSize", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,426:1\n341#2:427\n342#2:433\n345#2:435\n42#3,5:428\n48#3:434\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope\n*L\n409#1:427\n409#1:433\n409#1:435\n409#1:428,5\n409#1:434\n*E\n"})
public final class ApproachIntrinsicsMeasureScope implements ApproachIntrinsicMeasureScope, ApproachMeasureScope {
    public static final int $stable;
    public final LayoutDirection a;
    public final ApproachIntrinsicMeasureScope b;

    public ApproachIntrinsicsMeasureScope(@NotNull ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope0, @NotNull LayoutDirection layoutDirection0) {
        this.a = layoutDirection0;
        this.b = approachIntrinsicMeasureScope0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.b.getDensity();
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.b.getFontScale();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    public long getLookaheadConstraints-msEJaDk() {
        return this.b.getLookaheadConstraints-msEJaDk();
    }

    @Override  // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    public long getLookaheadSize-YbymL2g() {
        return this.b.getLookaheadSize-YbymL2g();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.b.isLookingAhead();
    }

    @Override  // androidx.compose.ui.layout.MeasureScope
    @NotNull
    public MeasureResult layout(int v, int v1, @NotNull Map map0, @Nullable Function1 function10, @NotNull Function1 function11) {
        int v2 = c.coerceAtLeast(v, 0);
        int v3 = c.coerceAtLeast(v1, 0);
        if((v2 & 0xFF000000) != 0 || (0xFF000000 & v3) != 0) {
            InlineClassHelperKt.throwIllegalStateException(("Size(" + v2 + " x " + v3 + ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new MeasureResult() {
            public final int a;
            public final int b;
            public final Map c;
            public final Function1 d;

            {
                int v = v3;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                int v1 = map0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Map map0 = function10;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
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
            }
        };
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int roundToPx--R2X_6o(long v) {
        return this.b.roundToPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int roundToPx-0680j_4(float f) {
        return this.b.roundToPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    @Stable
    public float toDp-GaN1DYA(long v) {
        return this.b.toDp-GaN1DYA(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toDp-u2uoSUM(float f) {
        return this.b.toDp-u2uoSUM(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toDp-u2uoSUM(int v) {
        return this.b.toDp-u2uoSUM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toDpSize-k-rfVVM(long v) {
        return this.b.toDpSize-k-rfVVM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toPx--R2X_6o(long v) {
        return this.b.toPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float toPx-0680j_4(float f) {
        return this.b.toPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect0) {
        return this.b.toRect(dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toSize-XkaWNTQ(long v) {
        return this.b.toSize-XkaWNTQ(v);
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    @Stable
    public long toSp-0xMU5do(float f) {
        return this.b.toSp-0xMU5do(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toSp-kPz2Gy4(float f) {
        return this.b.toSp-kPz2Gy4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long toSp-kPz2Gy4(int v) {
        return this.b.toSp-kPz2Gy4(v);
    }
}

