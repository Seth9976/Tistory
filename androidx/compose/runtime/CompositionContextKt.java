package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class CompositionContextKt {
    public static final PersistentCompositionLocalHashMap a;

    static {
        CompositionContextKt.a = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
    }

    public static final PersistentCompositionLocalMap access$getEmptyPersistentCompositionLocalMap$p() {
        return CompositionContextKt.a;
    }
}

