package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {"atomicMoveTo", "", "Ljava/io/File;", "toFile", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FileMoves_androidKt {
    public static final boolean atomicMoveTo(@NotNull File file0, @NotNull File file1) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(file1, "toFile");
        Intrinsics.checkNotNullParameter(file0, "srcFile");
        Intrinsics.checkNotNullParameter(file1, "dstFile");
        try {
            Files.move(file0.toPath(), file1.toPath(), new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
            return true;
        }
        catch(IOException unused_ex) {
            return false;
        }
    }
}

