package okhttp3.logging;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.Platform;

public final class a implements Logger {
    @Override  // okhttp3.logging.HttpLoggingInterceptor$Logger
    public final void log(String s) {
        Intrinsics.checkNotNullParameter(s, "message");
        Platform.log$default(Platform.Companion.get(), s, 0, null, 6, null);
    }
}

