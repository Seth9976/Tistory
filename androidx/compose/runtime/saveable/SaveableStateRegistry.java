package androidx.compose.runtime.saveable;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000FJ\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0001H&J\u0012\u0010\u0005\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001A\u00020\u0007H&J\u001C\u0010\b\u001A\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n0\tH&J \u0010\u000B\u001A\u00020\f2\u0006\u0010\u0006\u001A\u00020\u00072\u000E\u0010\r\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000EH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "", "canBeSaved", "", "value", "consumeRestored", "key", "", "performSave", "", "", "registerProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "valueProvider", "Lkotlin/Function0;", "Entry", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface SaveableStateRegistry {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "", "unregister", "", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Entry {
        void unregister();
    }

    boolean canBeSaved(@NotNull Object arg1);

    @Nullable
    Object consumeRestored(@NotNull String arg1);

    @NotNull
    Map performSave();

    @NotNull
    Entry registerProvider(@NotNull String arg1, @NotNull Function0 arg2);
}

