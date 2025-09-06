package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001A\u00028\u00002\u0006\u0010\u0004\u001A\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u001C\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/ValueHolder;", "T", "", "readValue", "map", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "toProvided", "Landroidx/compose/runtime/ProvidedValue;", "local", "Landroidx/compose/runtime/CompositionLocal;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ValueHolder {
    Object readValue(@NotNull PersistentCompositionLocalMap arg1);

    @NotNull
    ProvidedValue toProvided(@NotNull CompositionLocal arg1);
}

