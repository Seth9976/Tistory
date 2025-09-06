package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J,\u0010\t\u001A\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001A\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u001C\u0010\u0010\u001A\u00020\r2\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0003H\u0090\u0002¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/modifier/EmptyMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "value", "", "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)Ljava/lang/Void;", "set", "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "get", "", "contains$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "contains", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class EmptyMap extends ModifierLocalMap {
    public static final int $stable;
    @NotNull
    public static final EmptyMap INSTANCE;

    static {
        EmptyMap.INSTANCE = new EmptyMap(null);  // 初始化器: Landroidx/compose/ui/modifier/ModifierLocalMap;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@NotNull ModifierLocal modifierLocal0) {
        return false;
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public Object get$ui_release(@NotNull ModifierLocal modifierLocal0) {
        throw new IllegalStateException("");
    }

    @NotNull
    public Void set$ui_release(@NotNull ModifierLocal modifierLocal0, Object object0) {
        throw new IllegalStateException("");
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public void set$ui_release(ModifierLocal modifierLocal0, Object object0) {
        this.set$ui_release(modifierLocal0, object0);
    }
}

