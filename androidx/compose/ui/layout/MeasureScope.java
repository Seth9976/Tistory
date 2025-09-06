package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MeasureScopeMarker
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001Jd\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\u0014\b\u0002\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u001B\b\u0002\u0010\n\u001A\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000B¢\u0006\u0002\b\u000E2\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000B¢\u0006\u0002\b\u000EH\u0016JG\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\u0014\b\u0002\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000B¢\u0006\u0002\b\u000EH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "rulers", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,134:1\n341#2:135\n342#2:141\n345#2:143\n42#3,5:136\n48#3:142\n*S KotlinDebug\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope\n*L\n79#1:135\n79#1:141\n79#1:143\n79#1:136,5\n79#1:142\n*E\n"})
public interface MeasureScope extends IntrinsicMeasureScope {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isLookingAhead(@NotNull MeasureScope measureScope0) {
            return measureScope0.super.isLookingAhead();
        }

        @Deprecated
        @NotNull
        public static MeasureResult layout(@NotNull MeasureScope measureScope0, int v, int v1, @NotNull Map map0, @NotNull Function1 function10) {
            return measureScope0.super.layout(v, v1, map0, function10);
        }

        @Deprecated
        @NotNull
        public static MeasureResult layout(@NotNull MeasureScope measureScope0, int v, int v1, @NotNull Map map0, @Nullable Function1 function10, @NotNull Function1 function11) {
            return measureScope0.super.layout(v, v1, map0, function10, function11);
        }

        public static MeasureResult layout$default(MeasureScope measureScope0, int v, int v1, Map map0, Function1 function10, Function1 function11, int v2, Object object0) {
            return MeasureScope.layout$default(measureScope0, v, v1, map0, function10, function11, v2, object0);
        }

        @Stable
        @Deprecated
        public static int roundToPx--R2X_6o(@NotNull MeasureScope measureScope0, long v) {
            return measureScope0.super.roundToPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static int roundToPx-0680j_4(@NotNull MeasureScope measureScope0, float f) {
            return measureScope0.super.roundToPx-0680j_4(f);
        }

        @Stable
        @Deprecated
        public static float toDp-GaN1DYA(@NotNull MeasureScope measureScope0, long v) {
            return measureScope0.super.toDp-GaN1DYA(v);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull MeasureScope measureScope0, float f) {
            return measureScope0.super.toDp-u2uoSUM(f);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull MeasureScope measureScope0, int v) {
            return measureScope0.super.toDp-u2uoSUM(v);
        }

        @Stable
        @Deprecated
        public static long toDpSize-k-rfVVM(@NotNull MeasureScope measureScope0, long v) {
            return measureScope0.super.toDpSize-k-rfVVM(v);
        }

        @Stable
        @Deprecated
        public static float toPx--R2X_6o(@NotNull MeasureScope measureScope0, long v) {
            return measureScope0.super.toPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static float toPx-0680j_4(@NotNull MeasureScope measureScope0, float f) {
            return measureScope0.super.toPx-0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull MeasureScope measureScope0, @NotNull DpRect dpRect0) {
            return measureScope0.super.toRect(dpRect0);
        }

        @Stable
        @Deprecated
        public static long toSize-XkaWNTQ(@NotNull MeasureScope measureScope0, long v) {
            return measureScope0.super.toSize-XkaWNTQ(v);
        }

        @Stable
        @Deprecated
        public static long toSp-0xMU5do(@NotNull MeasureScope measureScope0, float f) {
            return measureScope0.super.toSp-0xMU5do(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull MeasureScope measureScope0, float f) {
            return measureScope0.super.toSp-kPz2Gy4(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull MeasureScope measureScope0, int v) {
            return measureScope0.super.toSp-kPz2Gy4(v);
        }
    }

    @NotNull
    default MeasureResult layout(int v, int v1, @NotNull Map map0, @NotNull Function1 function10) {
        return this.layout(v, v1, map0, null, function10);
    }

    @NotNull
    default MeasureResult layout(int v, int v1, @NotNull Map map0, @Nullable Function1 function10, @NotNull Function1 function11) {
        if((v & 0xFF000000) != 0 || (0xFF000000 & v1) != 0) {
            InlineClassHelperKt.throwIllegalStateException(("Size(" + v + " x " + v1 + ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new MeasureResult() {
            public final int a;
            public final int b;
            public final Map c;
            public final Function1 d;
            public final int e;
            public final MeasureScope f;
            public final Function1 g;

            {
                MeasureScope measureScope0 = v;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                int v = v1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                int v1 = map0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Map map0 = function10;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function10 = function11;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.e = v;
                this.f = measureScope0;
                this.g = function11;
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
                MeasureScope measureScope0 = this.f;
                Function1 function10 = this.g;
                if(measureScope0 instanceof LookaheadCapablePlaceable) {
                    function10.invoke(((LookaheadCapablePlaceable)measureScope0).getPlacementScope());
                    return;
                }
                LayoutDirection layoutDirection0 = measureScope0.getLayoutDirection();
                function10.invoke(new n(this.e, layoutDirection0));
            }
        };
    }

    static MeasureResult layout$default(MeasureScope measureScope0, int v, int v1, Map map0, Function1 function10, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if((v2 & 4) != 0) {
            map0 = x.emptyMap();
        }
        return measureScope0.layout(v, v1, map0, function10);
    }

    static MeasureResult layout$default(MeasureScope measureScope0, int v, int v1, Map map0, Function1 function10, Function1 function11, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if((v2 & 4) != 0) {
            map0 = x.emptyMap();
        }
        if((v2 & 8) != 0) {
            function10 = null;
        }
        return measureScope0.layout(v, v1, map0, function10, function11);
    }
}

