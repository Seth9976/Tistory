package kotlin.concurrent;

import java.util.Timer;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A!\u0010\u0005\u001A\u00020\u00042\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "name", "", "daemon", "Ljava/util/Timer;", "timer", "(Ljava/lang/String;Z)Ljava/util/Timer;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "TimersKt")
public final class TimersKt {
    @PublishedApi
    @NotNull
    public static final Timer timer(@Nullable String s, boolean z) {
        return s == null ? new Timer(z) : new Timer(s, z);
    }
}

