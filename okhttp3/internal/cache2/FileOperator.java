package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u0006¢\u0006\u0004\b\u000F\u0010\r¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(Ljava/nio/channels/FileChannel;)V", "", "pos", "Lokio/Buffer;", "source", "byteCount", "", "write", "(JLokio/Buffer;J)V", "sink", "read", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FileOperator {
    public final FileChannel a;

    public FileOperator(@NotNull FileChannel fileChannel0) {
        Intrinsics.checkNotNullParameter(fileChannel0, "fileChannel");
        super();
        this.a = fileChannel0;
    }

    public final void read(long v, @NotNull Buffer buffer0, long v1) {
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        if(v1 < 0L) {
            throw new IndexOutOfBoundsException();
        }
        while(v1 > 0L) {
            long v2 = this.a.transferTo(v, v1, buffer0);
            v += v2;
            v1 -= v2;
        }
    }

    public final void write(long v, @NotNull Buffer buffer0, long v1) throws IOException {
        Intrinsics.checkNotNullParameter(buffer0, "source");
        if(v1 < 0L || v1 > buffer0.size()) {
            throw new IndexOutOfBoundsException();
        }
        while(v1 > 0L) {
            long v2 = this.a.transferFrom(buffer0, v, v1);
            v += v2;
            v1 -= v2;
        }
    }
}

