package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001A\u00020\n\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001A\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u000B\u0010\fJ&\u0010\u0010\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0090\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u001C\u0010\u0014\u001A\u00020\u00112\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\u0007H\u0090\u0002¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0005¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "element", "<init>", "(Landroidx/compose/ui/modifier/ModifierLocalProvider;)V", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "value", "", "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "set", "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "get", "", "contains$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "contains", "a", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "getElement", "()Landroidx/compose/ui/modifier/ModifierLocalProvider;", "setElement", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/BackwardsCompatLocalMap\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,253:1\n53#2,7:254\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/BackwardsCompatLocalMap\n*L\n73#1:254,7\n*E\n"})
public final class BackwardsCompatLocalMap extends ModifierLocalMap {
    public static final int $stable = 8;
    public ModifierLocalProvider a;

    public BackwardsCompatLocalMap(@NotNull ModifierLocalProvider modifierLocalProvider0) {
        super(null);
        this.a = modifierLocalProvider0;
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@NotNull ModifierLocal modifierLocal0) {
        return modifierLocal0 == this.a.getKey();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    @Nullable
    public Object get$ui_release(@NotNull ModifierLocal modifierLocal0) {
        if(modifierLocal0 != this.a.getKey()) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        return this.a.getValue();
    }

    @NotNull
    public final ModifierLocalProvider getElement() {
        return this.a;
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public void set$ui_release(@NotNull ModifierLocal modifierLocal0, Object object0) {
        throw new IllegalStateException("Set is not allowed on a backwards compat provider");
    }

    public final void setElement(@NotNull ModifierLocalProvider modifierLocalProvider0) {
        this.a = modifierLocalProvider0;
    }
}

