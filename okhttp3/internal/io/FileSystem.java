package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0010\u0010\u0006\u001A\u00020\u00072\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0010\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0005H&J\u0010\u0010\n\u001A\u00020\u000B2\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0018\u0010\f\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u0005H&J\u0010\u0010\u000F\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0010\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0010\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0004\u001A\u00020\u0005H&¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/io/FileSystem;", "", "appendingSink", "Lokio/Sink;", "file", "Ljava/io/File;", "delete", "", "deleteContents", "directory", "exists", "", "rename", "from", "to", "sink", "size", "", "source", "Lokio/Source;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface FileSystem {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", "", "Lokhttp3/internal/io/FileSystem;", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "okhttp3/internal/io/a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final FileSystem SYSTEM;

    static {
        FileSystem.Companion = Companion.a;
        FileSystem.SYSTEM = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    Sink appendingSink(@NotNull File arg1) throws FileNotFoundException;

    void delete(@NotNull File arg1) throws IOException;

    void deleteContents(@NotNull File arg1) throws IOException;

    boolean exists(@NotNull File arg1);

    void rename(@NotNull File arg1, @NotNull File arg2) throws IOException;

    @NotNull
    Sink sink(@NotNull File arg1) throws FileNotFoundException;

    long size(@NotNull File arg1);

    @NotNull
    Source source(@NotNull File arg1) throws FileNotFoundException;
}

