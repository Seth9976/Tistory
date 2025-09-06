package androidx.paging;

import android.util.Log;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u00072\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/paging/PagingLogger;", "", "", "level", "", "isLoggable", "(I)Z", "", "message", "", "tr", "", "log", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PagingLogger {
    @NotNull
    public static final PagingLogger INSTANCE;

    static {
        PagingLogger.INSTANCE = new PagingLogger();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final boolean isLoggable(int v) {
        return Log.isLoggable("Paging", v);
    }

    public final void log(int v, @NotNull String s, @Nullable Throwable throwable0) {
        Intrinsics.checkNotNullParameter(s, "message");
        switch(v) {
            case 2: {
                Log.v("Paging", s, throwable0);
                return;
            }
            case 3: {
                Log.d("Paging", s, throwable0);
                return;
            }
            default: {
                throw new IllegalArgumentException("debug level " + v + " is requested but Paging only supports default logging for level 2 (VERBOSE) or level 3 (DEBUG)");
            }
        }
    }

    public static void log$default(PagingLogger pagingLogger0, int v, String s, Throwable throwable0, int v1, Object object0) {
        if((v1 & 4) != 0) {
            throwable0 = null;
        }
        pagingLogger0.log(v, s, throwable0);
    }
}

