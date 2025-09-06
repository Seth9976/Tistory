package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001J,\u0010\t\u001A\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001A\u00028\u0000H \u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\f\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H \u0002¢\u0006\u0004\b\n\u0010\u000BJ\u001C\u0010\u0010\u001A\u00020\r2\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0003H \u0002¢\u0006\u0004\b\u000E\u0010\u000F\u0082\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalMap;", "", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "value", "", "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "set", "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "get", "", "contains$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "contains", "Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "Landroidx/compose/ui/modifier/EmptyMap;", "Landroidx/compose/ui/modifier/MultiLocalMap;", "Landroidx/compose/ui/modifier/SingleLocalMap;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class ModifierLocalMap {
    public static final int $stable;

    public ModifierLocalMap(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public abstract boolean contains$ui_release(@NotNull ModifierLocal arg1);

    @Nullable
    public abstract Object get$ui_release(@NotNull ModifierLocal arg1);

    public abstract void set$ui_release(@NotNull ModifierLocal arg1, Object arg2);
}

