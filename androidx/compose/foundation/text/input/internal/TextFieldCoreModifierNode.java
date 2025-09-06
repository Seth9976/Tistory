package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.selection.AndroidTextFieldMagnifier_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import m0.f0;
import m0.g0;
import m0.j0;
import m0.k0;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006BO\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0007\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\u0006\u0010\u0012\u001A\u00020\u0007\u0012\u0006\u0010\u0014\u001A\u00020\u0013\u0012\u0006\u0010\u0016\u001A\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u001A\u001A\u00020\u0019H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJU\u0010\u001C\u001A\u00020\u00192\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0012\u001A\u00020\u00072\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u0015¢\u0006\u0004\b\u001C\u0010\u0018J&\u0010%\u001A\u00020\"*\u00020\u001D2\u0006\u0010\u001F\u001A\u00020\u001E2\u0006\u0010!\u001A\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0013\u0010\'\u001A\u00020\u0019*\u00020&H\u0016¢\u0006\u0004\b\'\u0010(J\u0017\u0010+\u001A\u00020\u00192\u0006\u0010*\u001A\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001A\u00020\u0019*\u00020-H\u0016¢\u0006\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u00060"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "", "isFocused", "isDragHovered", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "writeable", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "<init>", "(ZZLandroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;)V", "", "onAttach", "()V", "updateNode", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,627:1\n1#2:628\n708#3:629\n696#3:630\n256#4:631\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode\n*L\n491#1:629\n491#1:630\n508#1:631\n*E\n"})
public final class TextFieldCoreModifierNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, DrawModifierNode, GlobalPositionAwareModifierNode, LayoutModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    public TextRange A;
    public Rect B;
    public int C;
    public final TextFieldMagnifierNode D;
    public boolean p;
    public boolean q;
    public TextLayoutState r;
    public TransformedTextFieldState s;
    public TextFieldSelectionState t;
    public Brush u;
    public boolean v;
    public ScrollState w;
    public Orientation x;
    public final CursorAnimationState y;
    public Job z;

    public TextFieldCoreModifierNode(boolean z, boolean z1, @NotNull TextLayoutState textLayoutState0, @NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextFieldSelectionState textFieldSelectionState0, @NotNull Brush brush0, boolean z2, @NotNull ScrollState scrollState0, @NotNull Orientation orientation0) {
        this.p = z;
        this.q = z1;
        this.r = textLayoutState0;
        this.s = transformedTextFieldState0;
        this.t = textFieldSelectionState0;
        this.u = brush0;
        this.v = z2;
        this.w = scrollState0;
        this.x = orientation0;
        this.y = new CursorAnimationState();
        this.B = new Rect(-1.0f, -1.0f, -1.0f, -1.0f);
        this.D = (TextFieldMagnifierNode)this.delegate(AndroidTextFieldMagnifier_androidKt.textFieldMagnifierNode(this.s, this.t, this.r, this.p || this.q));
    }

    public static final void access$updateScrollState-tIlFzwE(TextFieldCoreModifierNode textFieldCoreModifierNode0, Density density0, int v, int v1, long v2, LayoutDirection layoutDirection0) {
        float f3;
        float f;
        int v3;
        textFieldCoreModifierNode0.w.setMaxValue$foundation_release(v1 - v);
        if(textFieldCoreModifierNode0.A == null || TextRange.getEnd-impl(v2) != TextRange.getEnd-impl(textFieldCoreModifierNode0.A.unbox-impl())) {
            v3 = TextRange.getEnd-impl(v2);
        }
        else if(textFieldCoreModifierNode0.A == null || TextRange.getStart-impl(v2) != TextRange.getStart-impl(textFieldCoreModifierNode0.A.unbox-impl())) {
            v3 = TextRange.getStart-impl(v2);
        }
        else if(v1 != textFieldCoreModifierNode0.C) {
            v3 = TextRange.getStart-impl(v2);
        }
        else {
            v3 = -1;
        }
        if(v3 >= 0 && textFieldCoreModifierNode0.c()) {
            TextLayoutResult textLayoutResult0 = textFieldCoreModifierNode0.r.getLayoutResult();
            if(textLayoutResult0 != null) {
                boolean z = false;
                Rect rect0 = textLayoutResult0.getCursorRect(c.coerceIn(v3, new IntRange(0, textLayoutResult0.getLayoutInput().getText().length())));
                Rect rect1 = TextFieldCoreModifierKt.access$getCursorRectInScroller(density0, rect0, layoutDirection0 == LayoutDirection.Rtl, v1);
                if(rect1.getLeft() != textFieldCoreModifierNode0.B.getLeft() || rect1.getTop() != textFieldCoreModifierNode0.B.getTop() || v1 != textFieldCoreModifierNode0.C) {
                    if(textFieldCoreModifierNode0.x == Orientation.Vertical) {
                        z = true;
                        f = rect1.getTop();
                    }
                    else {
                        f = rect1.getLeft();
                    }
                    float f1 = z ? rect1.getBottom() : rect1.getRight();
                    int v4 = textFieldCoreModifierNode0.w.getValue();
                    float f2 = (float)(v4 + v);
                    if(f1 <= f2) {
                        int v5 = Float.compare(f, v4);
                        if(v5 < 0 && f1 - f > ((float)v)) {
                            f3 = f1 - f2;
                        }
                        else {
                            f3 = v5 >= 0 || f1 - f > ((float)v) ? 0.0f : f - ((float)v4);
                        }
                    }
                    else {
                        f3 = f1 - f2;
                    }
                    textFieldCoreModifierNode0.A = TextRange.box-impl(v2);
                    textFieldCoreModifierNode0.B = rect1;
                    textFieldCoreModifierNode0.C = v1;
                    CoroutineScope coroutineScope0 = textFieldCoreModifierNode0.getCoroutineScope();
                    k0 k00 = new k0(textFieldCoreModifierNode0, f3, rect0, null);
                    BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, k00, 1, null);
                }
            }
        }
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        this.D.applySemantics(semanticsPropertyReceiver0);
    }

    // 去混淆评级： 低(40)
    public final boolean c() {
        return this.v && (this.p || this.q) && TextFieldCoreModifierKt.access$isSpecified(this.u);
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope0) {
        contentDrawScope0.drawContent();
        TextFieldCharSequence textFieldCharSequence0 = this.s.getVisualText();
        TextLayoutResult textLayoutResult0 = this.r.getLayoutResult();
        if(textLayoutResult0 == null) {
            return;
        }
        Pair pair0 = textFieldCharSequence0.getHighlight();
        if(pair0 != null) {
            int v = ((TextHighlightType)pair0.component1()).unbox-impl();
            long v1 = ((TextRange)pair0.component2()).unbox-impl();
            if(!TextRange.getCollapsed-impl(v1)) {
                Path path0 = textLayoutResult0.getPathForRange(TextRange.getMin-impl(v1), TextRange.getMax-impl(v1));
                if(TextHighlightType.equals-impl0(v, 1)) {
                    Brush brush0 = textLayoutResult0.getLayoutInput().getStyle().getBrush();
                    if(brush0 == null) {
                        long v2 = textLayoutResult0.getLayoutInput().getStyle().getColor-0d7_KjU();
                        if(v2 == 16L) {
                            v2 = 0xFF00000000000000L;
                        }
                        DrawScope.drawPath-LG529CI$default(contentDrawScope0, path0, Color.copy-wmQWz5c$default(v2, Color.getAlpha-impl(v2) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, null, 0, 60, null);
                    }
                    else {
                        DrawScope.drawPath-GBMwjPU$default(contentDrawScope0, path0, brush0, 0.2f, null, null, 0, 56, null);
                    }
                }
                else {
                    DrawScope.drawPath-LG529CI$default(contentDrawScope0, path0, ((TextSelectionColors)CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor-0d7_KjU(), 0.0f, null, null, 0, 60, null);
                }
            }
        }
        if(TextRange.getCollapsed-impl(textFieldCharSequence0.getSelection-d9O1mEE())) {
            Canvas canvas0 = contentDrawScope0.getDrawContext().getCanvas();
            TextPainter.INSTANCE.paint(canvas0, textLayoutResult0);
            if(textFieldCharSequence0.shouldShowSelection()) {
                float f = this.y.getCursorAlpha();
                if(f != 0.0f && this.c()) {
                    Rect rect0 = this.t.getCursorRect();
                    DrawScope.drawLine-1RTmtNc$default(contentDrawScope0, this.u, rect0.getTopCenter-F1C5BW0(), rect0.getBottomCenter-F1C5BW0(), rect0.getWidth(), 0, null, f, null, 0, 0x1B0, null);
                }
            }
        }
        else {
            if(textFieldCharSequence0.shouldShowSelection()) {
                long v3 = textFieldCharSequence0.getSelection-d9O1mEE();
                int v4 = TextRange.getMin-impl(v3);
                int v5 = TextRange.getMax-impl(v3);
                if(v4 != v5) {
                    long v6 = ((TextSelectionColors)CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor-0d7_KjU();
                    DrawScope.drawPath-LG529CI$default(contentDrawScope0, textLayoutResult0.getPathForRange(v4, v5), v6, 0.0f, null, null, 0, 60, null);
                }
            }
            Canvas canvas1 = contentDrawScope0.getDrawContext().getCanvas();
            TextPainter.INSTANCE.paint(canvas1, textLayoutResult0);
        }
        this.D.draw(contentDrawScope0);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        if(this.x == Orientation.Vertical) {
            Placeable placeable0 = measurable0.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0x7FFFFFFF, 7, null));
            int v1 = Math.min(placeable0.getHeight(), Constraints.getMaxHeight-impl(v));
            return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), v1, null, new g0(this, measureScope0, v1, placeable0), 4, null);
        }
        Placeable placeable1 = measurable0.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, 0, 0x7FFFFFFF, 0, 0, 13, null));
        int v2 = Math.min(placeable1.getWidth(), Constraints.getMaxWidth-impl(v));
        return MeasureScope.layout$default(measureScope0, v2, placeable1.getHeight(), null, new f0(this, measureScope0, v2, placeable1), 4, null);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onAttach() {
        if(this.p && this.c()) {
            this.z = BuildersKt.launch$default(this.getCoroutineScope(), null, null, new j0(this, null), 3, null);
        }
    }

    @Override  // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates0) {
        this.r.setCoreNodeCoordinates(layoutCoordinates0);
        this.D.onGloballyPositioned(layoutCoordinates0);
    }

    public final void updateNode(boolean z, boolean z1, @NotNull TextLayoutState textLayoutState0, @NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextFieldSelectionState textFieldSelectionState0, @NotNull Brush brush0, boolean z2, @NotNull ScrollState scrollState0, @NotNull Orientation orientation0) {
        boolean z3 = this.c();
        boolean z4 = this.p;
        TransformedTextFieldState transformedTextFieldState1 = this.s;
        TextLayoutState textLayoutState1 = this.r;
        TextFieldSelectionState textFieldSelectionState1 = this.t;
        ScrollState scrollState1 = this.w;
        this.p = z;
        this.q = z1;
        this.r = textLayoutState0;
        this.s = transformedTextFieldState0;
        this.t = textFieldSelectionState0;
        this.u = brush0;
        this.v = z2;
        this.w = scrollState0;
        this.x = orientation0;
        this.D.update(transformedTextFieldState0, textFieldSelectionState0, textLayoutState0, z || z1);
        if(!this.c()) {
            Job job0 = this.z;
            if(job0 != null) {
                DefaultImpls.cancel$default(job0, null, 1, null);
            }
            this.z = null;
            this.y.cancelAndHide();
        }
        else if(!z4 || !Intrinsics.areEqual(transformedTextFieldState1, transformedTextFieldState0) || !z3) {
            this.z = BuildersKt.launch$default(this.getCoroutineScope(), null, null, new j0(this, null), 3, null);
        }
        if(!Intrinsics.areEqual(transformedTextFieldState1, transformedTextFieldState0) || !Intrinsics.areEqual(textLayoutState1, textLayoutState0) || !Intrinsics.areEqual(textFieldSelectionState1, textFieldSelectionState0) || !Intrinsics.areEqual(scrollState1, scrollState0)) {
            LayoutModifierNodeKt.invalidateMeasurement(this);
        }
    }
}

