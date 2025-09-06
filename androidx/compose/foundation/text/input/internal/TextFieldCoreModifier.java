package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\u0003\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0017\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u0013\u0010\u001C\u001A\u00020\u0018*\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJj\u0010\u001E\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\u00032\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0012\u001A\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010!\u001A\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001A\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001A\u0010(\u001A\u00020\u00032\b\u0010\'\u001A\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;", "", "isFocused", "isDragHovered", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "writeable", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "<init>", "(ZZLandroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;)V", "create", "()Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;", "node", "", "update", "(Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy", "(ZZLandroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifier;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldCoreModifier extends ModifierNodeElement {
    public static final int $stable;
    public final boolean b;
    public final boolean c;
    public final TextLayoutState d;
    public final TransformedTextFieldState e;
    public final TextFieldSelectionState f;
    public final Brush g;
    public final boolean h;
    public final ScrollState i;
    public final Orientation j;

    public TextFieldCoreModifier(boolean z, boolean z1, @NotNull TextLayoutState textLayoutState0, @NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextFieldSelectionState textFieldSelectionState0, @NotNull Brush brush0, boolean z2, @NotNull ScrollState scrollState0, @NotNull Orientation orientation0) {
        this.b = z;
        this.c = z1;
        this.d = textLayoutState0;
        this.e = transformedTextFieldState0;
        this.f = textFieldSelectionState0;
        this.g = brush0;
        this.h = z2;
        this.i = scrollState0;
        this.j = orientation0;
    }

    @NotNull
    public final TextFieldCoreModifier copy(boolean z, boolean z1, @NotNull TextLayoutState textLayoutState0, @NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextFieldSelectionState textFieldSelectionState0, @NotNull Brush brush0, boolean z2, @NotNull ScrollState scrollState0, @NotNull Orientation orientation0) {
        return new TextFieldCoreModifier(z, z1, textLayoutState0, transformedTextFieldState0, textFieldSelectionState0, brush0, z2, scrollState0, orientation0);
    }

    public static TextFieldCoreModifier copy$default(TextFieldCoreModifier textFieldCoreModifier0, boolean z, boolean z1, TextLayoutState textLayoutState0, TransformedTextFieldState transformedTextFieldState0, TextFieldSelectionState textFieldSelectionState0, Brush brush0, boolean z2, ScrollState scrollState0, Orientation orientation0, int v, Object object0) {
        boolean z3 = (v & 1) == 0 ? z : textFieldCoreModifier0.b;
        boolean z4 = (v & 2) == 0 ? z1 : textFieldCoreModifier0.c;
        TextLayoutState textLayoutState1 = (v & 4) == 0 ? textLayoutState0 : textFieldCoreModifier0.d;
        TransformedTextFieldState transformedTextFieldState1 = (v & 8) == 0 ? transformedTextFieldState0 : textFieldCoreModifier0.e;
        TextFieldSelectionState textFieldSelectionState1 = (v & 16) == 0 ? textFieldSelectionState0 : textFieldCoreModifier0.f;
        Brush brush1 = (v & 0x20) == 0 ? brush0 : textFieldCoreModifier0.g;
        boolean z5 = (v & 0x40) == 0 ? z2 : textFieldCoreModifier0.h;
        ScrollState scrollState1 = (v & 0x80) == 0 ? scrollState0 : textFieldCoreModifier0.i;
        return (v & 0x100) == 0 ? textFieldCoreModifier0.copy(z3, z4, textLayoutState1, transformedTextFieldState1, textFieldSelectionState1, brush1, z5, scrollState1, orientation0) : textFieldCoreModifier0.copy(z3, z4, textLayoutState1, transformedTextFieldState1, textFieldSelectionState1, brush1, z5, scrollState1, textFieldCoreModifier0.j);
    }

    @NotNull
    public TextFieldCoreModifierNode create() {
        return new TextFieldCoreModifierNode(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextFieldCoreModifier)) {
            return false;
        }
        if(this.b != ((TextFieldCoreModifier)object0).b) {
            return false;
        }
        if(this.c != ((TextFieldCoreModifier)object0).c) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((TextFieldCoreModifier)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((TextFieldCoreModifier)object0).e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((TextFieldCoreModifier)object0).f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((TextFieldCoreModifier)object0).g)) {
            return false;
        }
        if(this.h != ((TextFieldCoreModifier)object0).h) {
            return false;
        }
        return Intrinsics.areEqual(this.i, ((TextFieldCoreModifier)object0).i) ? this.j == ((TextFieldCoreModifier)object0).j : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.j.hashCode() + (this.i.hashCode() + a.e((this.g.hashCode() + (this.f.hashCode() + (this.e.hashCode() + (this.d.hashCode() + a.e(Boolean.hashCode(this.b) * 0x1F, 0x1F, this.c)) * 0x1F) * 0x1F) * 0x1F) * 0x1F, 0x1F, this.h)) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
    }

    @Override
    @NotNull
    public String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.b + ", isDragHovered=" + this.c + ", textLayoutState=" + this.d + ", textFieldState=" + this.e + ", textFieldSelectionState=" + this.f + ", cursorBrush=" + this.g + ", writeable=" + this.h + ", scrollState=" + this.i + ", orientation=" + this.j + ')';
    }

    public void update(@NotNull TextFieldCoreModifierNode textFieldCoreModifierNode0) {
        textFieldCoreModifierNode0.updateNode(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((TextFieldCoreModifierNode)modifier$Node0));
    }
}

