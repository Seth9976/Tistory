package androidx.compose.ui.modifier;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BY\u0012\u0018\u0010\u0005\u001A\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u00126\u0010\u0007\u001A\u001C\u0012\u0018\b\u0001\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0006\"\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0010\u001A\u00020\r\"\u0004\b\u0000\u0010\n2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001A\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ&\u0010\u0013\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001C\u0010\u0017\u001A\u00020\u00142\n\u0010\u000B\u001A\u0006\u0012\u0002\b\u00030\u0003H\u0090\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/modifier/MultiLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "Lkotlin/Pair;", "Landroidx/compose/ui/modifier/ModifierLocal;", "", "entry1", "", "entries", "<init>", "(Lkotlin/Pair;[Lkotlin/Pair;)V", "T", "key", "value", "", "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "set", "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "get", "", "contains$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "contains", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MultiLocalMap extends ModifierLocalMap {
    public static final int $stable;
    public final SnapshotStateMap a;

    public MultiLocalMap(@NotNull Pair pair0, @NotNull Pair[] arr_pair) {
        super(null);
        SnapshotStateMap snapshotStateMap0 = SnapshotStateKt.mutableStateMapOf();
        this.a = snapshotStateMap0;
        snapshotStateMap0.put(pair0.getFirst(), pair0.getSecond());
        snapshotStateMap0.putAll(x.toMap(arr_pair));
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@NotNull ModifierLocal modifierLocal0) {
        return this.a.containsKey(modifierLocal0);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    @Nullable
    public Object get$ui_release(@NotNull ModifierLocal modifierLocal0) {
        Object object0 = this.a.get(modifierLocal0);
        return object0 == null ? null : object0;
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public void set$ui_release(@NotNull ModifierLocal modifierLocal0, Object object0) {
        this.a.put(modifierLocal0, object0);
    }
}

