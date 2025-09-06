package coil.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0000\u001A\u0014\u0010\u0005\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0004H\u0000¨\u0006\u0007"}, d2 = {"createFile", "", "Lokio/FileSystem;", "file", "Lokio/Path;", "deleteContents", "directory", "coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-FileSystems")
public final class -FileSystems {
    public static final void createFile(@NotNull FileSystem fileSystem0, @NotNull Path path0) {
        if(!fileSystem0.exists(path0)) {
            -Utils.closeQuietly(fileSystem0.sink(path0));
        }
    }

    public static final void deleteContents(@NotNull FileSystem fileSystem0, @NotNull Path path0) {
        try {
            List list0 = fileSystem0.list(path0);
        }
        catch(FileNotFoundException unused_ex) {
            return;
        }
        Throwable throwable0 = null;
        for(Object object0: list0) {
            Path path1 = (Path)object0;
            try {
                if(fileSystem0.metadata(path1).isDirectory()) {
                    -FileSystems.deleteContents(fileSystem0, path1);
                }
                fileSystem0.delete(path1);
                continue;
            label_13:
                if(throwable0 == null) {
                    goto label_14;
                }
                continue;
            }
            catch(IOException iOException0) {
                goto label_13;
            }
        label_14:
            throwable0 = iOException0;
        }
        if(throwable0 != null) {
            throw throwable0;
        }
    }
}

