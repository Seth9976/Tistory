package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLogHandler;", "Ljava/util/logging/Handler;", "Ljava/util/logging/LogRecord;", "record", "", "publish", "(Ljava/util/logging/LogRecord;)V", "flush", "()V", "close", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidLogHandler extends Handler {
    @NotNull
    public static final AndroidLogHandler INSTANCE;

    static {
        AndroidLogHandler.INSTANCE = new AndroidLogHandler();  // 初始化器: Ljava/util/logging/Handler;-><init>()V
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void publish(@NotNull LogRecord logRecord0) {
        Intrinsics.checkNotNullParameter(logRecord0, "record");
        String s = logRecord0.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(s, "record.loggerName");
        int v = AndroidLogKt.access$getAndroidLevel(logRecord0);
        String s1 = logRecord0.getMessage();
        Intrinsics.checkNotNullExpressionValue(s1, "record.message");
        Throwable throwable0 = logRecord0.getThrown();
        AndroidLog.INSTANCE.androidLog$okhttp(s, v, s1, throwable0);
    }
}

