package androidx.datastore.core;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\u001A\u0010\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"createSingleProcessCoordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "filePath", "", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class InterProcessCoordinatorKt {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final InterProcessCoordinator createSingleProcessCoordinator(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "filePath");
        return new SingleProcessCoordinator(s);
    }
}

