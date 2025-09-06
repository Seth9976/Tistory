package androidx.datastore.core;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\b\u0010\u0000\u001A\u00020\u0001H\u0000*\n\u0010\u0002\"\u00020\u00032\u00020\u0003¨\u0006\u0004"}, d2 = {"ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "IOException", "Ljava/io/IOException;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class Actual_jvmKt {
    @NotNull
    public static final CoroutineDispatcher ioDispatcher() {
        return Dispatchers.getIO();
    }
}

