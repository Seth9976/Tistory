package okhttp3.internal.platform.android;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidLogKt {
    public static final int access$getAndroidLevel(LogRecord logRecord0) {
        int v = logRecord0.getLevel().intValue();
        Level level0 = Level.INFO;
        if(v > level0.intValue()) {
            return 5;
        }
        return logRecord0.getLevel().intValue() == level0.intValue() ? 4 : 3;
    }
}

