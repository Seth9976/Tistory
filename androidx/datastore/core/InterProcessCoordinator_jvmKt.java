package androidx.datastore.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u000E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003¨\u0006\u0004"}, d2 = {"createSingleProcessCoordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "file", "Ljava/io/File;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class InterProcessCoordinator_jvmKt {
    @NotNull
    public static final InterProcessCoordinator createSingleProcessCoordinator(@NotNull File file0) {
        Intrinsics.checkNotNullParameter(file0, "file");
        String s = file0.getCanonicalFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(s, "file.canonicalFile.absolutePath");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(s);
    }
}

