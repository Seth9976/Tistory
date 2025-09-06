package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import o0.a;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000F\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000EJ\u0015\u0010\u0013\u001A\u00020\f2\u0006\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001A\u00020\f2\u0006\u0010\u0016\u001A\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001B\u001A\u00020\f2\u0006\u0010\u001A\u001A\u00020\u0019¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\"\u001A\u00020\u001D8\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/runtime/RememberObserver;", "", "selectableId", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectionRegistrar", "Landroidx/compose/ui/graphics/Color;", "backgroundSelectionColor", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "params", "<init>", "(JLandroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "onRemembered", "()V", "onForgotten", "onAbandoned", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "updateTextLayout", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "updateGlobalPosition", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/ui/Modifier;", "f", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSelectionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,350:1\n225#2,8:351\n272#2,14:359\n*S KotlinDebug\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n*L\n158#1:351,8\n158#1:359,14\n*E\n"})
public final class SelectionController implements RememberObserver {
    public static final int $stable = 8;
    public final long a;
    public final SelectionRegistrar b;
    public final long c;
    public StaticTextSelectionParams d;
    public Selectable e;
    public final Modifier f;

    public SelectionController(long v, SelectionRegistrar selectionRegistrar0, long v1, StaticTextSelectionParams staticTextSelectionParams0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, selectionRegistrar0, v1, ((v2 & 8) == 0 ? staticTextSelectionParams0 : StaticTextSelectionParams.Companion.getEmpty()), null);
    }

    public SelectionController(long v, SelectionRegistrar selectionRegistrar0, long v1, StaticTextSelectionParams staticTextSelectionParams0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = selectionRegistrar0;
        this.c = v1;
        this.d = staticTextSelectionParams0;
        this.f = PointerIconKt.pointerHoverIcon$default(SelectionControllerKt.access$makeSelectionModifier(selectionRegistrar0, v, new a(this, 0)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
    }

    public final void draw(@NotNull DrawScope drawScope0) {
        Selection selection0 = (Selection)this.b.getSubselections().get(this.a);
        if(selection0 == null) {
            return;
        }
        int v = selection0.getHandlesCrossed() ? selection0.getEnd().getOffset() : selection0.getStart().getOffset();
        int v1 = selection0.getHandlesCrossed() ? selection0.getStart().getOffset() : selection0.getEnd().getOffset();
        if(v == v1) {
            return;
        }
        int v2 = this.e == null ? 0 : this.e.getLastVisibleOffset();
        Path path0 = this.d.getPathForRange(c.coerceAtMost(v, v2), c.coerceAtMost(v1, v2));
        if(path0 == null) {
            return;
        }
        if(this.d.getShouldClip()) {
            float f = Size.getWidth-impl(drawScope0.getSize-NH-jbRc());
            float f1 = Size.getHeight-impl(drawScope0.getSize-NH-jbRc());
            DrawContext drawContext0 = drawScope0.getDrawContext();
            long v3 = drawContext0.getSize-NH-jbRc();
            drawContext0.getCanvas().save();
            try {
                drawContext0.getTransform().clipRect-N_I0leg(0.0f, 0.0f, f, f1, 1);
                DrawScope.drawPath-LG529CI$default(drawScope0, path0, this.c, 0.0f, null, null, 0, 60, null);
            }
            finally {
                r0.a.y(drawContext0, v3);
            }
            return;
        }
        DrawScope.drawPath-LG529CI$default(drawScope0, path0, this.c, 0.0f, null, null, 0, 60, null);
    }

    @NotNull
    public final Modifier getModifier() {
        return this.f;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Selectable selectable0 = this.e;
        if(selectable0 != null) {
            this.b.unsubscribe(selectable0);
            this.e = null;
        }
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Selectable selectable0 = this.e;
        if(selectable0 != null) {
            this.b.unsubscribe(selectable0);
            this.e = null;
        }
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        a a0 = new a(this, 1);
        a a1 = new a(this, 2);
        MultiWidgetSelectionDelegate multiWidgetSelectionDelegate0 = new MultiWidgetSelectionDelegate(this.a, a0, a1);
        this.e = this.b.subscribe(multiWidgetSelectionDelegate0);
    }

    public final void updateGlobalPosition(@NotNull LayoutCoordinates layoutCoordinates0) {
        this.d = StaticTextSelectionParams.copy$default(this.d, layoutCoordinates0, null, 2, null);
        this.b.notifyPositionChange(this.a);
    }

    public final void updateTextLayout(@NotNull TextLayoutResult textLayoutResult0) {
        TextLayoutResult textLayoutResult1 = this.d.getTextLayoutResult();
        if(textLayoutResult1 != null && !Intrinsics.areEqual(textLayoutResult1.getLayoutInput().getText(), textLayoutResult0.getLayoutInput().getText())) {
            this.b.notifySelectableChange(this.a);
        }
        this.d = StaticTextSelectionParams.copy$default(this.d, null, textLayoutResult0, 1, null);
    }
}

