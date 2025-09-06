package androidx.window.core;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/window/core/AndroidLogger;", "Landroidx/window/core/Logger;", "", "tag", "message", "", "debug", "(Ljava/lang/String;Ljava/lang/String;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class AndroidLogger implements Logger {
    @NotNull
    public static final AndroidLogger INSTANCE;

    static {
        AndroidLogger.INSTANCE = new AndroidLogger();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.window.core.Logger
    public void debug(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "tag");
        Intrinsics.checkNotNullParameter(s1, "message");
        Log.d(s, s1);
    }
}

