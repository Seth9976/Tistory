package io.github.aakira.napier;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001A\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0016J,\u0010\t\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\b2\b\u0010\u000B\u001A\u0004\u0018\u00010\f2\b\u0010\r\u001A\u0004\u0018\u00010\bJ.\u0010\u000E\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\b2\b\u0010\u000B\u001A\u0004\u0018\u00010\f2\b\u0010\r\u001A\u0004\u0018\u00010\bH$J3\u0010\u000F\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\b2\b\u0010\u000B\u001A\u0004\u0018\u00010\f2\b\u0010\r\u001A\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lio/github/aakira/napier/Antilog;", "", "()V", "isEnable", "", "priority", "Lio/github/aakira/napier/Napier$Level;", "tag", "", "log", "", "throwable", "", "message", "performLog", "rawLog", "rawLog$napier_release", "napier_release"}, k = 1, mv = {1, 4, 2})
public abstract class Antilog {
    public boolean isEnable(@NotNull Level napier$Level0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(napier$Level0, "priority");
        return true;
    }

    public final void log(@NotNull Level napier$Level0, @Nullable String s, @Nullable Throwable throwable0, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(napier$Level0, "priority");
        if(this.isEnable(napier$Level0, s)) {
            this.performLog(napier$Level0, s, throwable0, s1);
        }
    }

    public abstract void performLog(@NotNull Level arg1, @Nullable String arg2, @Nullable Throwable arg3, @Nullable String arg4);

    public final void rawLog$napier_release(@NotNull Level napier$Level0, @Nullable String s, @Nullable Throwable throwable0, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(napier$Level0, "priority");
        this.performLog(napier$Level0, s, throwable0, s1);
    }
}

