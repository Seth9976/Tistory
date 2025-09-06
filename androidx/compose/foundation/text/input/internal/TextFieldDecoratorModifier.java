package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B[\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\r\u001A\u00020\u000B\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001A\u00020\u000B\u0012\u0006\u0010\u0014\u001A\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u0019\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u0013\u0010\u001E\u001A\u00020\u001A*\u00020\u001DH\u0016¢\u0006\u0004\b\u001E\u0010\u001FJx\u0010 \u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001A\u00020\u000B2\b\b\u0002\u0010\u0014\u001A\u00020\u0013HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001A\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001A\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010\'J\u001A\u0010*\u001A\u00020\u000B2\b\u0010)\u001A\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/InputTransformation;", "filter", "", "enabled", "readOnly", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "keyboardActionHandler", "singleLine", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)V", "create", "()Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "node", "", "update", "(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldDecoratorModifier extends ModifierNodeElement {
    public static final int $stable;
    public final TransformedTextFieldState b;
    public final TextLayoutState c;
    public final TextFieldSelectionState d;
    public final InputTransformation e;
    public final boolean f;
    public final boolean g;
    public final KeyboardOptions h;
    public final KeyboardActionHandler i;
    public final boolean j;
    public final MutableInteractionSource k;

    public TextFieldDecoratorModifier(@NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextLayoutState textLayoutState0, @NotNull TextFieldSelectionState textFieldSelectionState0, @Nullable InputTransformation inputTransformation0, boolean z, boolean z1, @NotNull KeyboardOptions keyboardOptions0, @Nullable KeyboardActionHandler keyboardActionHandler0, boolean z2, @NotNull MutableInteractionSource mutableInteractionSource0) {
        this.b = transformedTextFieldState0;
        this.c = textLayoutState0;
        this.d = textFieldSelectionState0;
        this.e = inputTransformation0;
        this.f = z;
        this.g = z1;
        this.h = keyboardOptions0;
        this.i = keyboardActionHandler0;
        this.j = z2;
        this.k = mutableInteractionSource0;
    }

    @NotNull
    public final TextFieldDecoratorModifier copy(@NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextLayoutState textLayoutState0, @NotNull TextFieldSelectionState textFieldSelectionState0, @Nullable InputTransformation inputTransformation0, boolean z, boolean z1, @NotNull KeyboardOptions keyboardOptions0, @Nullable KeyboardActionHandler keyboardActionHandler0, boolean z2, @NotNull MutableInteractionSource mutableInteractionSource0) {
        return new TextFieldDecoratorModifier(transformedTextFieldState0, textLayoutState0, textFieldSelectionState0, inputTransformation0, z, z1, keyboardOptions0, keyboardActionHandler0, z2, mutableInteractionSource0);
    }

    public static TextFieldDecoratorModifier copy$default(TextFieldDecoratorModifier textFieldDecoratorModifier0, TransformedTextFieldState transformedTextFieldState0, TextLayoutState textLayoutState0, TextFieldSelectionState textFieldSelectionState0, InputTransformation inputTransformation0, boolean z, boolean z1, KeyboardOptions keyboardOptions0, KeyboardActionHandler keyboardActionHandler0, boolean z2, MutableInteractionSource mutableInteractionSource0, int v, Object object0) {
        TransformedTextFieldState transformedTextFieldState1 = (v & 1) == 0 ? transformedTextFieldState0 : textFieldDecoratorModifier0.b;
        TextLayoutState textLayoutState1 = (v & 2) == 0 ? textLayoutState0 : textFieldDecoratorModifier0.c;
        TextFieldSelectionState textFieldSelectionState1 = (v & 4) == 0 ? textFieldSelectionState0 : textFieldDecoratorModifier0.d;
        InputTransformation inputTransformation1 = (v & 8) == 0 ? inputTransformation0 : textFieldDecoratorModifier0.e;
        boolean z3 = (v & 16) == 0 ? z : textFieldDecoratorModifier0.f;
        boolean z4 = (v & 0x20) == 0 ? z1 : textFieldDecoratorModifier0.g;
        KeyboardOptions keyboardOptions1 = (v & 0x40) == 0 ? keyboardOptions0 : textFieldDecoratorModifier0.h;
        KeyboardActionHandler keyboardActionHandler1 = (v & 0x80) == 0 ? keyboardActionHandler0 : textFieldDecoratorModifier0.i;
        boolean z5 = (v & 0x100) == 0 ? z2 : textFieldDecoratorModifier0.j;
        return (v & 0x200) == 0 ? textFieldDecoratorModifier0.copy(transformedTextFieldState1, textLayoutState1, textFieldSelectionState1, inputTransformation1, z3, z4, keyboardOptions1, keyboardActionHandler1, z5, mutableInteractionSource0) : textFieldDecoratorModifier0.copy(transformedTextFieldState1, textLayoutState1, textFieldSelectionState1, inputTransformation1, z3, z4, keyboardOptions1, keyboardActionHandler1, z5, textFieldDecoratorModifier0.k);
    }

    @NotNull
    public TextFieldDecoratorModifierNode create() {
        return new TextFieldDecoratorModifierNode(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
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
        if(!(object0 instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((TextFieldDecoratorModifier)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((TextFieldDecoratorModifier)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((TextFieldDecoratorModifier)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((TextFieldDecoratorModifier)object0).e)) {
            return false;
        }
        if(this.f != ((TextFieldDecoratorModifier)object0).f) {
            return false;
        }
        if(this.g != ((TextFieldDecoratorModifier)object0).g) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, ((TextFieldDecoratorModifier)object0).h)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, ((TextFieldDecoratorModifier)object0).i)) {
            return false;
        }
        return this.j == ((TextFieldDecoratorModifier)object0).j ? Intrinsics.areEqual(this.k, ((TextFieldDecoratorModifier)object0).k) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int v = 0;
        int v1 = a.e(a.e(((this.d.hashCode() + (this.c.hashCode() + this.b.hashCode() * 0x1F) * 0x1F) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F, 0x1F, this.f), 0x1F, this.g);
        int v2 = this.h.hashCode();
        KeyboardActionHandler keyboardActionHandler0 = this.i;
        if(keyboardActionHandler0 != null) {
            v = keyboardActionHandler0.hashCode();
        }
        return this.k.hashCode() + a.e(((v2 + v1) * 0x1F + v) * 0x1F, 0x1F, this.j);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
    }

    @Override
    @NotNull
    public String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.b + ", textLayoutState=" + this.c + ", textFieldSelectionState=" + this.d + ", filter=" + this.e + ", enabled=" + this.f + ", readOnly=" + this.g + ", keyboardOptions=" + this.h + ", keyboardActionHandler=" + this.i + ", singleLine=" + this.j + ", interactionSource=" + this.k + ')';
    }

    public void update(@NotNull TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0) {
        textFieldDecoratorModifierNode0.updateNode(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((TextFieldDecoratorModifierNode)modifier$Node0));
    }
}

