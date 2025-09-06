package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.InterProcessCoordinatorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u000E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003¨\u0006\u0004"}, d2 = {"createSingleProcessCoordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "path", "Lokio/Path;", "datastore-core-okio"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class OkioStorageKt {
    @NotNull
    public static final InterProcessCoordinator createSingleProcessCoordinator(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "path");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(path0.normalized().toString());
    }
}

