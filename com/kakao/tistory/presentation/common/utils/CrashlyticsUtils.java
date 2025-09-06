package com.kakao.tistory.presentation.common.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.kakao.tistory.presentation.common.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0002¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/common/utils/CrashlyticsUtils;", "", "", "userId", "", "setUserId", "(Ljava/lang/String;)V", "", "throwable", "logException", "(Ljava/lang/Throwable;)V", "message", "logMessage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CrashlyticsUtils {
    public static final int $stable;
    @NotNull
    public static final CrashlyticsUtils INSTANCE;

    static {
        CrashlyticsUtils.INSTANCE = new CrashlyticsUtils();
    }

    public final void logException(@NotNull Throwable throwable0) {
        FirebaseCrashlytics firebaseCrashlytics0;
        Intrinsics.checkNotNullParameter(throwable0, "throwable");
        Logger.INSTANCE.log("logException() : " + throwable0);
        try {
            firebaseCrashlytics0 = FirebaseCrashlytics.getInstance();
        }
        catch(Exception exception0) {
            this.logException(exception0);
            firebaseCrashlytics0 = null;
        }
        if(firebaseCrashlytics0 != null) {
            firebaseCrashlytics0.recordException(throwable0);
        }
    }

    public final void logMessage(@NotNull String s) {
        FirebaseCrashlytics firebaseCrashlytics0;
        Intrinsics.checkNotNullParameter(s, "message");
        Logger.INSTANCE.log("logMessage() : " + s);
        try {
            firebaseCrashlytics0 = FirebaseCrashlytics.getInstance();
        }
        catch(Exception exception0) {
            this.logException(exception0);
            firebaseCrashlytics0 = null;
        }
        if(firebaseCrashlytics0 != null) {
            firebaseCrashlytics0.log(s);
        }
    }

    public final void setUserId(@NotNull String s) {
        FirebaseCrashlytics firebaseCrashlytics0;
        Intrinsics.checkNotNullParameter(s, "userId");
        Logger.INSTANCE.log("setUserId() : " + s);
        try {
            firebaseCrashlytics0 = FirebaseCrashlytics.getInstance();
        }
        catch(Exception exception0) {
            this.logException(exception0);
            firebaseCrashlytics0 = null;
        }
        if(firebaseCrashlytics0 != null) {
            firebaseCrashlytics0.setUserId(s);
        }
    }
}

