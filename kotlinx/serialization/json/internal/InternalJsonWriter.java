package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&J\u0010\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H&J\u0010\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\tH&J\u0010\u0010\n\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\fH&J\u0010\u0010\r\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H&¨\u0006\u000E"}, d2 = {"Lkotlinx/serialization/json/internal/InternalJsonWriter;", "", "release", "", "write", "text", "", "writeChar", "char", "", "writeLong", "value", "", "writeQuoted", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@JsonFriendModuleApi
public interface InternalJsonWriter {
    void release();

    void write(@NotNull String arg1);

    void writeChar(char arg1);

    void writeLong(long arg1);

    void writeQuoted(@NotNull String arg1);
}

