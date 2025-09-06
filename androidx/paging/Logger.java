package androidx.paging;

import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "Logger interface is no longer supported.")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0003\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J$\u0010\u0006\u001A\u00020\u00072\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000BH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/paging/Logger;", "", "isLoggable", "", "level", "", "log", "", "message", "", "tr", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface Logger {
    boolean isLoggable(int arg1);

    void log(int arg1, @NotNull String arg2, @Nullable Throwable arg3);

    static void log$default(Logger logger0, int v, String s, Throwable throwable0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if((v1 & 4) != 0) {
            throwable0 = null;
        }
        logger0.log(v, s, throwable0);
    }
}

