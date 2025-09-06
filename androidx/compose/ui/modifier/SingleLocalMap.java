package androidx.compose.ui.modifier;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u000B\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000F\u001A\u00020\b\"\u0004\b\u0000\u0010\f2\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001A\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\r\u0010\u000EJ&\u0010\u0012\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001C\u0010\u0016\u001A\u00020\u00132\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0090\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/modifier/SingleLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "<init>", "(Landroidx/compose/ui/modifier/ModifierLocal;)V", "", "value", "", "forceValue$ui_release", "(Ljava/lang/Object;)V", "forceValue", "T", "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "set", "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "get", "", "contains$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "contains", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,253:1\n81#2:254\n107#2,2:255\n53#3,7:257\n53#3,7:264\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n*L\n44#1:254\n44#1:255,2\n51#1:257,7\n57#1:264,7\n*E\n"})
public final class SingleLocalMap extends ModifierLocalMap {
    public static final int $stable;
    public final ModifierLocal a;
    public final MutableState b;

    public SingleLocalMap(@NotNull ModifierLocal modifierLocal0) {
        super(null);
        this.a = modifierLocal0;
        this.b = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@NotNull ModifierLocal modifierLocal0) {
        return modifierLocal0 == this.a;
    }

    public final void forceValue$ui_release(@Nullable Object object0) {
        this.b.setValue(object0);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    @Nullable
    public Object get$ui_release(@NotNull ModifierLocal modifierLocal0) {
        if(modifierLocal0 != this.a) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        Object object0 = this.b.getValue();
        return object0 == null ? null : object0;
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public void set$ui_release(@NotNull ModifierLocal modifierLocal0, Object object0) {
        if(modifierLocal0 != this.a) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        this.b.setValue(object0);
    }
}

