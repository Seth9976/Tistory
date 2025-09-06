package androidx.compose.foundation.text;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import j0.l1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J,\u0010\u000B\u001A\u00020\b*\u00020\u00022\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001A\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001A\u00020\u000E*\u00020\f2\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"androidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1$2", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "maxIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1$2\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1252:1\n602#2,8:1253\n26#3:1261\n26#3:1262\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1$2\n*L\n729#1:1253,8\n761#1:1261\n762#1:1262\n*E\n"})
public final class CoreTextFieldKt.CoreTextField.5.1.1.2 implements MeasurePolicy {
    public final LegacyTextFieldState a;
    public final Function1 b;
    public final TextFieldValue c;
    public final OffsetMapping d;
    public final Density e;
    public final int f;

    public CoreTextFieldKt.CoreTextField.5.1.1.2(LegacyTextFieldState legacyTextFieldState0, Function1 function10, TextFieldValue textFieldValue0, OffsetMapping offsetMapping0, Density density0, int v) {
        this.a = legacyTextFieldState0;
        this.b = function10;
        this.c = textFieldValue0;
        this.d = offsetMapping0;
        this.e = density0;
        this.f = v;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        this.a.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope0.getLayoutDirection());
        return this.a.getTextDelegate().getMaxIntrinsicWidth();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull List list0, long v) {
        TextLayoutResultProxy textLayoutResultProxy0;
        LegacyTextFieldState legacyTextFieldState0 = this.a;
        Snapshot snapshot0 = Snapshot.Companion.getCurrentThreadSnapshot();
        LayoutCoordinates layoutCoordinates0 = null;
        Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
        Snapshot snapshot1 = Snapshot.Companion.makeCurrentNonObservable(snapshot0);
        try {
            textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
        }
        finally {
            Snapshot.Companion.restoreNonObservable(snapshot0, snapshot1, function10);
        }
        TextLayoutResult textLayoutResult0 = textLayoutResultProxy0 == null ? null : textLayoutResultProxy0.getValue();
        LayoutDirection layoutDirection0 = measureScope0.getLayoutDirection();
        Triple triple0 = TextFieldDelegate.Companion.layout-_EkL_-Y$foundation_release(legacyTextFieldState0.getTextDelegate(), v, layoutDirection0, textLayoutResult0);
        int v2 = ((Number)triple0.component1()).intValue();
        int v3 = ((Number)triple0.component2()).intValue();
        TextLayoutResult textLayoutResult1 = (TextLayoutResult)triple0.component3();
        if(!Intrinsics.areEqual(textLayoutResult0, textLayoutResult1)) {
            if(textLayoutResultProxy0 != null) {
                layoutCoordinates0 = textLayoutResultProxy0.getDecorationBoxCoordinates();
            }
            legacyTextFieldState0.setLayoutResult(new TextLayoutResultProxy(textLayoutResult1, null, layoutCoordinates0, 2, null));
            this.b.invoke(textLayoutResult1);
            CoreTextFieldKt.b(legacyTextFieldState0, this.c, this.d);
        }
        int v4 = this.f == 1 ? TextDelegateKt.ceilToIntPx(textLayoutResult1.getLineBottom(0)) : 0;
        legacyTextFieldState0.setMinHeightForSingleLineField-0680j_4(this.e.toDp-u2uoSUM(v4));
        return measureScope0.layout(v2, v3, x.mapOf(new Pair[]{TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Math.round(textLayoutResult1.getFirstBaseline())), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Math.round(textLayoutResult1.getLastBaseline()))}), l1.w);
    }
}

