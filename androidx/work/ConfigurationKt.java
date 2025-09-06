package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0005\"\u001A\u0010\u0001\u001A\u00020\u00008\u0000X\u0080D¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "DEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT", "I", "getDEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT", "()I", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ConfigurationKt {
    public static final Executor access$createDefaultExecutor(boolean z) {
        Executor executor0 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ConfigurationKt.createDefaultExecutor.factory.1(z));
        Intrinsics.checkNotNullExpressionValue(executor0, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executor0;
    }

    public static final int getDEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT() [...] // Inlined contents
}

