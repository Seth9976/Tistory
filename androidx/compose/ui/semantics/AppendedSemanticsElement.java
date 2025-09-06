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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B(\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001A\u00020\b*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0019\b\u0002\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001C\u001A\u00020\u001BHÖ\u0001¢\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001F\u001A\u00020\u001EHÖ\u0001¢\u0006\u0004\b\u001F\u0010 J\u001A\u0010#\u001A\u00020\u00042\b\u0010\"\u001A\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0016R(\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\u0018R\u0014\u0010.\u001A\u00020+8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "", "mergeDescendants", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "Lkotlin/ExtensionFunctionType;", "properties", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "create", "()Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "node", "update", "(Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Z", "component2", "()Lkotlin/jvm/functions/Function1;", "copy", "(ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "getMergeDescendants", "c", "Lkotlin/jvm/functions/Function1;", "getProperties", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AppendedSemanticsElement extends ModifierNodeElement implements SemanticsModifier {
    public static final int $stable;
    public final boolean b;
    public final Function1 c;

    public AppendedSemanticsElement(boolean z, @NotNull Function1 function10) {
        this.b = z;
        this.c = function10;
    }

    public final boolean component1() {
        return this.b;
    }

    @NotNull
    public final Function1 component2() {
        return this.c;
    }

    @NotNull
    public final AppendedSemanticsElement copy(boolean z, @NotNull Function1 function10) {
        return new AppendedSemanticsElement(z, function10);
    }

    public static AppendedSemanticsElement copy$default(AppendedSemanticsElement appendedSemanticsElement0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            z = appendedSemanticsElement0.b;
        }
        if((v & 2) != 0) {
            function10 = appendedSemanticsElement0.c;
        }
        return appendedSemanticsElement0.copy(z, function10);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    @NotNull
    public CoreSemanticsModifierNode create() {
        return new CoreSemanticsModifierNode(this.b, false, this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AppendedSemanticsElement)) {
            return false;
        }
        return this.b == ((AppendedSemanticsElement)object0).b ? Intrinsics.areEqual(this.c, ((AppendedSemanticsElement)object0).c) : false;
    }

    public final boolean getMergeDescendants() {
        return this.b;
    }

    @NotNull
    public final Function1 getProperties() {
        return this.c;
    }

    @Override  // androidx.compose.ui.semantics.SemanticsModifier
    @NotNull
    public SemanticsConfiguration getSemanticsConfiguration() {
        SemanticsConfiguration semanticsConfiguration0 = new SemanticsConfiguration();
        semanticsConfiguration0.setMergingSemanticsOfDescendants(this.b);
        this.c.invoke(semanticsConfiguration0);
        return semanticsConfiguration0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.c.hashCode() + Boolean.hashCode(this.b) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("semantics");
        inspectorInfo0.getProperties().set("mergeDescendants", Boolean.valueOf(this.b));
        SemanticsModifierKt.access$addSemanticsPropertiesFrom(inspectorInfo0, this.getSemanticsConfiguration());
    }

    @Override
    @NotNull
    public String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.b + ", properties=" + this.c + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((CoreSemanticsModifierNode)modifier$Node0));
    }

    public void update(@NotNull CoreSemanticsModifierNode coreSemanticsModifierNode0) {
        coreSemanticsModifierNode0.setMergeDescendants(this.b);
        coreSemanticsModifierNode0.setProperties(this.c);
    }
}

