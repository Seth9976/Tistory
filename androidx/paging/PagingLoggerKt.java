package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A0\u0010\u0005\u001A\u00020\u00062\b\b\u0001\u0010\u0007\u001A\u00020\u00012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u000BH\u0086\bø\u0001\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0004\u001A\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"DEBUG", "", "LOG_TAG", "", "VERBOSE", "log", "", "level", "tr", "", "block", "Lkotlin/Function0;", "paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PagingLoggerKt {
    public static final int DEBUG = 3;
    @NotNull
    public static final String LOG_TAG = "Paging";
    public static final int VERBOSE = 2;

    public static final void log(@IntRange(from = 2L, to = 3L) int v, @Nullable Throwable throwable0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        PagingLogger pagingLogger0 = PagingLogger.INSTANCE;
        if(pagingLogger0.isLoggable(v)) {
            pagingLogger0.log(v, ((String)function00.invoke()), throwable0);
        }
    }

    public static void log$default(int v, Throwable throwable0, Function0 function00, int v1, Object object0) {
        if((v1 & 2) != 0) {
            throwable0 = null;
        }
        Intrinsics.checkNotNullParameter(function00, "block");
        PagingLogger pagingLogger0 = PagingLogger.INSTANCE;
        if(pagingLogger0.isLoggable(v)) {
            pagingLogger0.log(v, ((String)function00.invoke()), throwable0);
        }
    }
}

