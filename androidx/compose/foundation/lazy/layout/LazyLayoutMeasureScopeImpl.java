package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u009E\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJl\u0010\u0017\u001A\u00020\u00162\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\u0014\b\u0002\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u001B\b\u0002\u0010\u0013\u001A\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000F\u00A2\u0006\u0002\b\u00122\u0017\u0010\u0015\u001A\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u000F\u00A2\u0006\u0002\b\u0012H\u0096\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018JO\u0010\u0017\u001A\u00020\u00162\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\u0014\b\u0002\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u0017\u0010\u0015\u001A\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u000F\u00A2\u0006\u0002\b\u0012H\u0096\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001D\u001A\u00020\t*\u00020\u001AH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0017\u0010\u001D\u001A\u00020\t*\u00020\u001EH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 J\u0017\u0010$\u001A\u00020!*\u00020\u001AH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001A\u00020!*\u00020\u001EH\u0097\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&J\u0014\u0010)\u001A\u00020(*\u00020\'H\u0097\u0001\u00A2\u0006\u0004\b)\u0010*J(\u00102\u001A\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010+\u001A\u00020\t2\u0006\u0010-\u001A\u00020,H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u00101J\u0016\u00104\u001A\u00020\u001A*\u00020\u001EH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u0010&J\u0019\u00104\u001A\u00020\u001A*\u00020\tH\u0016\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b5\u00106J\u0019\u00104\u001A\u00020\u001A*\u00020!H\u0016\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b5\u0010#J\u0019\u00109\u001A\u00020\u001E*\u00020!H\u0016\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b7\u00108J\u0019\u00109\u001A\u00020\u001E*\u00020\tH\u0016\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b7\u0010:J\u0016\u00109\u001A\u00020\u001E*\u00020\u001AH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b;\u00108J\u0016\u0010@\u001A\u00020=*\u00020<H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b>\u0010?J\u0016\u0010B\u001A\u00020<*\u00020=H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bA\u0010?R\u0014\u0010E\u001A\u00020!8\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\bC\u0010DR\u0014\u0010G\u001A\u00020!8\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\bF\u0010DR\u0014\u0010I\u001A\u00020H8VX\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bI\u0010JR\u0014\u0010N\u001A\u00020K8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bL\u0010M\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006O"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "subcomposeMeasureScope", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeMeasureScope;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "", "toPx-0680j_4", "(F)F", "toPx", "toPx--R2X_6o", "(J)F", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "index", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "Landroidx/compose/ui/layout/Placeable;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "measure", "toDp-GaN1DYA", "toDp", "toDp-u2uoSUM", "(I)F", "toSp-kPz2Gy4", "(F)J", "toSp", "(I)J", "toSp-0xMU5do", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toSize-XkaWNTQ", "(J)J", "toSize", "toDpSize-k-rfVVM", "toDpSize", "getDensity", "()F", "density", "getFontScale", "fontScale", "", "isLookingAhead", "()Z", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {
    public static final int $stable;
    public final LazyLayoutItemContentFactory a;
    public final SubcomposeMeasureScope b;
    public final LazyLayoutItemProvider c;
    public final HashMap d;

    public LazyLayoutMeasureScopeImpl(@NotNull LazyLayoutItemContentFactory lazyLayoutItemContentFactory0, @NotNull SubcomposeMeasureScope subcomposeMeasureScope0) {
        this.a = lazyLayoutItemContentFactory0;
        this.b = subcomposeMeasureScope0;
        this.c = (LazyLayoutItemProvider)lazyLayoutItemContentFactory0.getItemProvider().invoke();
        this.d = new HashMap();
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
        return this.b.getLayoutDirection();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.b.isLookingAhead();
    }

    @Override  // androidx.compose.ui.layout.MeasureScope
    @NotNull
    public MeasureResult layout(int v, int v1, @NotNull Map map0, @NotNull Function1 function10) {
        return this.b.layout(v, v1, map0, function10);
    }

    @Override  // androidx.compose.ui.layout.MeasureScope
    @NotNull
    public MeasureResult layout(int v, int v1, @NotNull Map map0, @Nullable Function1 function10, @NotNull Function1 function11) {
        return this.b.layout(v, v1, map0, function10, function11);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    @NotNull
    public List measure-0kLqBqw(int v, long v1) {
        HashMap hashMap0 = this.d;
        List list0 = (List)hashMap0.get(v);
        if(list0 == null) {
            Object object0 = this.c.getKey(v);
            Function2 function20 = this.a.getContent(v, object0, this.c.getContentType(v));
            List list1 = this.b.subcompose(object0, function20);
            int v2 = list1.size();
            ArrayList arrayList0 = new ArrayList(v2);
            for(int v3 = 0; v3 < v2; v3 = a.f(((Measurable)list1.get(v3)), v1, arrayList0, v3, 1)) {
            }
            hashMap0.put(v, arrayList0);
            return arrayList0;
        }
        return list0;
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

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    public float toDp-GaN1DYA(long v) {
        return this.b.toDp-GaN1DYA(v);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(float f) {
        return this.b.toDp-u2uoSUM(f);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(int v) {
        return this.b.toDp-u2uoSUM(v);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
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

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public long toSize-XkaWNTQ(long v) {
        return this.b.toSize-XkaWNTQ(v);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    public long toSp-0xMU5do(float f) {
        return this.b.toSp-0xMU5do(f);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(float f) {
        return this.b.toSp-kPz2Gy4(f);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(int v) {
        return this.b.toSp-kPz2Gy4(v);
    }
}

