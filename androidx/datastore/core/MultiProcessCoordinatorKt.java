package androidx.datastore.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0016\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005¨\u0006\u0006"}, d2 = {"createMultiProcessCoordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "context", "Lkotlin/coroutines/CoroutineContext;", "file", "Ljava/io/File;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "MultiProcessCoordinatorKt")
public final class MultiProcessCoordinatorKt {
    @NotNull
    public static final InterProcessCoordinator createMultiProcessCoordinator(@NotNull CoroutineContext coroutineContext0, @NotNull File file0) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "context");
        Intrinsics.checkNotNullParameter(file0, "file");
        return new MultiProcessCoordinator(coroutineContext0, file0);
    }
}

