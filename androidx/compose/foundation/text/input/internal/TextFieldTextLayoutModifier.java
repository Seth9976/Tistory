package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B_\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u00126\u0010\u0014\u001A2\u0012\u0004\u0012\u00020\f\u0012\u001B\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\r¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000B¢\u0006\u0002\b\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001A\u001A\u00020\u00122\u0006\u0010\u0019\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\u0013\u0010\u001D\u001A\u00020\u0012*\u00020\u001CH\u0016¢\u0006\u0004\b\u001D\u0010\u001EJr\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t28\b\u0002\u0010\u0014\u001A2\u0012\u0004\u0012\u00020\f\u0012\u001B\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\r¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000B¢\u0006\u0002\b\u0013HÆ\u0001¢\u0006\u0004\b\u001F\u0010 J\u0010\u0010\"\u001A\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001A\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001A\u0010)\u001A\u00020\t2\b\u0010(\u001A\u0004\u0018\u00010\'HÖ\u0003¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "singleLine", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "", "Lkotlin/ExtensionFunctionType;", "onTextLayout", "<init>", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;)V", "create", "()Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;", "node", "update", "(Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;)Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifier;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldTextLayoutModifier extends ModifierNodeElement {
    public static final int $stable;
    public final TextLayoutState b;
    public final TransformedTextFieldState c;
    public final TextStyle d;
    public final boolean e;
    public final Function2 f;

    public TextFieldTextLayoutModifier(@NotNull TextLayoutState textLayoutState0, @NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextStyle textStyle0, boolean z, @Nullable Function2 function20) {
        this.b = textLayoutState0;
        this.c = transformedTextFieldState0;
        this.d = textStyle0;
        this.e = z;
        this.f = function20;
    }

    @NotNull
    public final TextFieldTextLayoutModifier copy(@NotNull TextLayoutState textLayoutState0, @NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextStyle textStyle0, boolean z, @Nullable Function2 function20) {
        return new TextFieldTextLayoutModifier(textLayoutState0, transformedTextFieldState0, textStyle0, z, function20);
    }

    public static TextFieldTextLayoutModifier copy$default(TextFieldTextLayoutModifier textFieldTextLayoutModifier0, TextLayoutState textLayoutState0, TransformedTextFieldState transformedTextFieldState0, TextStyle textStyle0, boolean z, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            textLayoutState0 = textFieldTextLayoutModifier0.b;
        }
        if((v & 2) != 0) {
            transformedTextFieldState0 = textFieldTextLayoutModifier0.c;
        }
        if((v & 4) != 0) {
            textStyle0 = textFieldTextLayoutModifier0.d;
        }
        if((v & 8) != 0) {
            z = textFieldTextLayoutModifier0.e;
        }
        if((v & 16) != 0) {
            function20 = textFieldTextLayoutModifier0.f;
        }
        return textFieldTextLayoutModifier0.copy(textLayoutState0, transformedTextFieldState0, textStyle0, z, function20);
    }

    @NotNull
    public TextFieldTextLayoutModifierNode create() {
        return new TextFieldTextLayoutModifierNode(this.b, this.c, this.d, this.e, this.f);
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
        if(!(object0 instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((TextFieldTextLayoutModifier)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((TextFieldTextLayoutModifier)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((TextFieldTextLayoutModifier)object0).d)) {
            return false;
        }
        return this.e == ((TextFieldTextLayoutModifier)object0).e ? Intrinsics.areEqual(this.f, ((TextFieldTextLayoutModifier)object0).f) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int v = a.e(q.b((this.c.hashCode() + this.b.hashCode() * 0x1F) * 0x1F, 0x1F, this.d), 0x1F, this.e);
        return this.f == null ? v : v + this.f.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
    }

    @Override
    @NotNull
    public String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.b + ", textFieldState=" + this.c + ", textStyle=" + this.d + ", singleLine=" + this.e + ", onTextLayout=" + this.f + ')';
    }

    public void update(@NotNull TextFieldTextLayoutModifierNode textFieldTextLayoutModifierNode0) {
        textFieldTextLayoutModifierNode0.updateNode(this.b, this.c, this.d, this.e, this.f);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((TextFieldTextLayoutModifierNode)modifier$Node0));
    }
}

