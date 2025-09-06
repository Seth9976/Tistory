package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B \u0012\u0017\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000E\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0013\u0010\u0011\u001A\u00020\u0006*\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001A\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0015\u001A\u00020\u00002\u0019\b\u0002\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\u001AHÖ\u0001¢\u0006\u0004\b\u001B\u0010\u001CJ\u001A\u0010 \u001A\u00020\u001F2\b\u0010\u001E\u001A\u0004\u0018\u00010\u001DHÖ\u0003¢\u0006\u0004\b \u0010!R(\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0014R\u0014\u0010(\u001A\u00020%8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b&\u0010\'¨\u0006)"}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "Lkotlin/ExtensionFunctionType;", "properties", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "create", "()Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "node", "update", "(Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "copy", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkotlin/jvm/functions/Function1;", "getProperties", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ClearAndSetSemanticsElement extends ModifierNodeElement implements SemanticsModifier {
    public static final int $stable;
    public final Function1 b;

    public ClearAndSetSemanticsElement(@NotNull Function1 function10) {
        this.b = function10;
    }

    @NotNull
    public final Function1 component1() {
        return this.b;
    }

    @NotNull
    public final ClearAndSetSemanticsElement copy(@NotNull Function1 function10) {
        return new ClearAndSetSemanticsElement(function10);
    }

    public static ClearAndSetSemanticsElement copy$default(ClearAndSetSemanticsElement clearAndSetSemanticsElement0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = clearAndSetSemanticsElement0.b;
        }
        return clearAndSetSemanticsElement0.copy(function10);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    @NotNull
    public CoreSemanticsModifierNode create() {
        return new CoreSemanticsModifierNode(false, true, this.b);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ClearAndSetSemanticsElement ? Intrinsics.areEqual(this.b, ((ClearAndSetSemanticsElement)object0).b) : false;
    }

    @NotNull
    public final Function1 getProperties() {
        return this.b;
    }

    @Override  // androidx.compose.ui.semantics.SemanticsModifier
    @NotNull
    public SemanticsConfiguration getSemanticsConfiguration() {
        SemanticsConfiguration semanticsConfiguration0 = new SemanticsConfiguration();
        semanticsConfiguration0.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration0.setClearingSemantics(true);
        this.b.invoke(semanticsConfiguration0);
        return semanticsConfiguration0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("clearAndSetSemantics");
        SemanticsModifierKt.access$addSemanticsPropertiesFrom(inspectorInfo0, this.getSemanticsConfiguration());
    }

    @Override
    @NotNull
    public String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.b + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((CoreSemanticsModifierNode)modifier$Node0));
    }

    public void update(@NotNull CoreSemanticsModifierNode coreSemanticsModifierNode0) {
        coreSemanticsModifierNode0.setProperties(this.b);
    }
}

