package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateRegistry.Entry;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u000F\u001A\u0004\u0018\u00010\b2\u0006\u0010\u000E\u001A\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000F\u0010\u0010J$\u0010\u0013\u001A\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00120\u0011H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u000E\u001A\u00020\r2\u000E\u0010\u0015\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001A\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "saveableStateRegistry", "Lkotlin/Function0;", "", "onDispose", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Lkotlin/jvm/functions/Function0;)V", "", "value", "", "canBeSaved", "(Ljava/lang/Object;)Z", "", "key", "consumeRestored", "(Ljava/lang/String;)Ljava/lang/Object;", "", "", "performSave", "()Ljava/util/Map;", "valueProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "registerProvider", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "dispose", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {
    public static final int $stable = 8;
    public final Function0 a;
    public final SaveableStateRegistry b;

    public DisposableSaveableStateRegistry(@NotNull SaveableStateRegistry saveableStateRegistry0, @NotNull Function0 function00) {
        this.a = function00;
        this.b = saveableStateRegistry0;
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(@NotNull Object object0) {
        return this.b.canBeSaved(object0);
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    @Nullable
    public Object consumeRestored(@NotNull String s) {
        return this.b.consumeRestored(s);
    }

    public final void dispose() {
        this.a.invoke();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    @NotNull
    public Map performSave() {
        return this.b.performSave();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    @NotNull
    public Entry registerProvider(@NotNull String s, @NotNull Function0 function00) {
        return this.b.registerProvider(s, function00);
    }
}

