package kotlinx.serialization.json.internal;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\'\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\r\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lkotlinx/serialization/json/internal/JavaStreamSerialReader;", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "Ljava/io/InputStream;", "stream", "<init>", "(Ljava/io/InputStream;)V", "", "buffer", "", "bufferOffset", "count", "read", "([CII)I", "", "release", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class JavaStreamSerialReader implements InternalJsonReader {
    public final CharsetReader a;

    public JavaStreamSerialReader(@NotNull InputStream inputStream0) {
        Intrinsics.checkNotNullParameter(inputStream0, "stream");
        super();
        this.a = new CharsetReader(inputStream0, Charsets.UTF_8);
    }

    @Override  // kotlinx.serialization.json.internal.InternalJsonReader
    public int read(@NotNull char[] arr_c, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_c, "buffer");
        return this.a.read(arr_c, v, v1);
    }

    public final void release() {
        this.a.release();
    }
}

