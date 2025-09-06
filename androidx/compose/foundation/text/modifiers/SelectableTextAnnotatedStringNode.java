package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00A4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u00C7\u0001\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0016\b\u0002\u0010\u000E\u001A\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000B\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u000F\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001A\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001A\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001E\b\u0002\u0010\u001B\u001A\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001A0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000B\u0012\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u0012\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E\u0012\u0016\b\u0002\u0010!\u001A\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000B\u00A2\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001A\u00020\r2\u0006\u0010%\u001A\u00020$H\u0016\u00A2\u0006\u0004\b&\u0010\'J\u0013\u0010)\u001A\u00020\r*\u00020(H\u0016\u00A2\u0006\u0004\b)\u0010*J&\u00103\u001A\u000200*\u00020+2\u0006\u0010-\u001A\u00020,2\u0006\u0010/\u001A\u00020.H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b1\u00102J#\u00107\u001A\u00020\u0013*\u0002042\u0006\u0010-\u001A\u0002052\u0006\u00106\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b7\u00108J#\u0010:\u001A\u00020\u0013*\u0002042\u0006\u0010-\u001A\u0002052\u0006\u00109\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b:\u00108J#\u0010;\u001A\u00020\u0013*\u0002042\u0006\u0010-\u001A\u0002052\u0006\u00106\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b;\u00108J#\u0010<\u001A\u00020\u0013*\u0002042\u0006\u0010-\u001A\u0002052\u0006\u00109\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b<\u00108J\u00A6\u0001\u0010@\u001A\u00020\r2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0014\u0010\u0019\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0010\u001A\u00020\u000F2\u0014\u0010\u000E\u001A\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000B2\u001C\u0010\u001B\u001A\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001A0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000B2\b\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\b\u0010=\u001A\u0004\u0018\u00010\u001E\u00F8\u0001\u0000\u00A2\u0006\u0004\b>\u0010?\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006A"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "Landroidx/compose/ui/graphics/ColorProducer;", "overrideColor", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "onShowTranslation", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "color", "update-L09Iy8E", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;)V", "update", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SelectableTextAnnotatedStringNode extends DelegatingNode implements DrawModifierNode, GlobalPositionAwareModifierNode, LayoutModifierNode {
    public static final int $stable = 8;
    public SelectionController p;
    public final Function1 q;
    public final TextAnnotatedStringNode r;

    public SelectableTextAnnotatedStringNode(AnnotatedString annotatedString0, TextStyle textStyle0, Resolver fontFamily$Resolver0, Function1 function10, int v, boolean z, int v1, int v2, List list0, Function1 function11, SelectionController selectionController0, ColorProducer colorProducer0, Function1 function12, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(annotatedString0, textStyle0, fontFamily$Resolver0, ((v3 & 8) == 0 ? function10 : null), ((v3 & 16) == 0 ? v : 1), ((v3 & 0x20) == 0 ? z : true), ((v3 & 0x40) == 0 ? v1 : 0x7FFFFFFF), ((v3 & 0x80) == 0 ? v2 : 1), ((v3 & 0x100) == 0 ? list0 : null), ((v3 & 0x200) == 0 ? function11 : null), ((v3 & 0x400) == 0 ? selectionController0 : null), ((v3 & 0x800) == 0 ? colorProducer0 : null), ((v3 & 0x1000) == 0 ? function12 : null), null);
    }

    public SelectableTextAnnotatedStringNode(AnnotatedString annotatedString0, TextStyle textStyle0, Resolver fontFamily$Resolver0, Function1 function10, int v, boolean z, int v1, int v2, List list0, Function1 function11, SelectionController selectionController0, ColorProducer colorProducer0, Function1 function12, DefaultConstructorMarker defaultConstructorMarker0) {
        this.p = selectionController0;
        this.q = function12;
        this.r = (TextAnnotatedStringNode)this.delegate(new TextAnnotatedStringNode(annotatedString0, textStyle0, fontFamily$Resolver0, function10, v, z, v1, v2, list0, function11, selectionController0, colorProducer0, function12, null));
        if(this.p == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope0) {
        this.r.drawNonExtension(contentDrawScope0);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.r.maxIntrinsicHeightNonExtension(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.r.maxIntrinsicWidthNonExtension(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        return this.r.measureNonExtension-3p2s80s(measureScope0, measurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.r.minIntrinsicHeightNonExtension(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.r.minIntrinsicWidthNonExtension(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates0) {
        SelectionController selectionController0 = this.p;
        if(selectionController0 != null) {
            selectionController0.updateGlobalPosition(layoutCoordinates0);
        }
    }

    public final void update-L09Iy8E(@NotNull AnnotatedString annotatedString0, @NotNull TextStyle textStyle0, @Nullable List list0, int v, int v1, boolean z, @NotNull Resolver fontFamily$Resolver0, int v2, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable SelectionController selectionController0, @Nullable ColorProducer colorProducer0) {
        boolean z1 = this.r.updateDraw(colorProducer0, textStyle0);
        boolean z2 = this.r.updateText$foundation_release(annotatedString0);
        boolean z3 = this.r.updateLayoutRelatedArgs-MPT68mk(textStyle0, list0, v, v1, z, fontFamily$Resolver0, v2);
        boolean z4 = this.r.updateCallbacks(function10, function11, selectionController0, this.q);
        this.r.doInvalidations(z1, z2, z3, z4);
        this.p = selectionController0;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }
}

