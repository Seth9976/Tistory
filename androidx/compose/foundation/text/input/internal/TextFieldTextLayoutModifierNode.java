package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.d1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B_\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u00126\u0010\u0016\u001A2\u0012\u0004\u0012\u00020\u000E\u0012\u001B\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000F¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\r¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0017\u0010\u0018Je\u0010\u0019\u001A\u00020\u00142\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B26\u0010\u0016\u001A2\u0012\u0004\u0012\u00020\u000E\u0012\u001B\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000F¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\r¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001C\u001A\u00020\u00142\u0006\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ&\u0010&\u001A\u00020#*\u00020\u001E2\u0006\u0010 \u001A\u00020\u001F2\u0006\u0010\"\u001A\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\'"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "singleLine", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "", "Lkotlin/ExtensionFunctionType;", "onTextLayout", "<init>", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;)V", "updateNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldTextLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,174:1\n148#2:175\n26#3:176\n26#3:177\n*S KotlinDebug\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode\n*L\n156#1:175\n161#1:176\n162#1:177\n*E\n"})
public final class TextFieldTextLayoutModifierNode extends Node implements CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, LayoutModifierNode {
    public static final int $stable = 8;
    public TextLayoutState n;
    public boolean o;
    public Map p;

    public TextFieldTextLayoutModifierNode(@NotNull TextLayoutState textLayoutState0, @NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextStyle textStyle0, boolean z, @Nullable Function2 function20) {
        this.n = textLayoutState0;
        this.o = z;
        textLayoutState0.setOnTextLayout(function20);
        this.n.updateNonMeasureInputs(transformedTextFieldState0, textStyle0, this.o, !this.o);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        TextLayoutResult textLayoutResult0 = this.n.layoutWithNewMeasureInputs--hBUhpc(measureScope0, measureScope0.getLayoutDirection(), ((Resolver)CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver())), v);
        Placeable placeable0 = measurable0.measure-BRTryo0(Constraints.Companion.fitPrioritizingWidth-Zbe2FdA(IntSize.getWidth-impl(textLayoutResult0.getSize-YbymL2g()), IntSize.getWidth-impl(textLayoutResult0.getSize-YbymL2g()), IntSize.getHeight-impl(textLayoutResult0.getSize-YbymL2g()), IntSize.getHeight-impl(textLayoutResult0.getSize-YbymL2g())));
        this.n.setMinHeightForSingleLineField-0680j_4((this.o ? measureScope0.toDp-u2uoSUM(TextDelegateKt.ceilToIntPx(textLayoutResult0.getLineBottom(0))) : 0.0f));
        Map map0 = this.p;
        if(map0 == null) {
            map0 = new LinkedHashMap(2);
        }
        map0.put(AlignmentLineKt.getFirstBaseline(), Math.round(textLayoutResult0.getFirstBaseline()));
        map0.put(AlignmentLineKt.getLastBaseline(), Math.round(textLayoutResult0.getLastBaseline()));
        this.p = map0;
        Map map1 = this.p;
        Intrinsics.checkNotNull(map1);
        return measureScope0.layout(IntSize.getWidth-impl(textLayoutResult0.getSize-YbymL2g()), IntSize.getHeight-impl(textLayoutResult0.getSize-YbymL2g()), map1, new d1(placeable0));
    }

    @Override  // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates0) {
        this.n.setTextLayoutNodeCoordinates(layoutCoordinates0);
    }

    public final void updateNode(@NotNull TextLayoutState textLayoutState0, @NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextStyle textStyle0, boolean z, @Nullable Function2 function20) {
        this.n = textLayoutState0;
        textLayoutState0.setOnTextLayout(function20);
        this.o = z;
        this.n.updateNonMeasureInputs(transformedTextFieldState0, textStyle0, z, !z);
    }
}

