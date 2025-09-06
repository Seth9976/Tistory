package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00072\b\u0010\u0006\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/Trace;", "", "", "name", "beginSection", "(Ljava/lang/String;)Ljava/lang/Object;", "token", "", "endSection", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Trace {
    public static final int $stable;
    @NotNull
    public static final Trace INSTANCE;

    static {
        Trace.INSTANCE = new Trace();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Nullable
    public final Object beginSection(@NotNull String s) {
        android.os.Trace.beginSection(s);
        return null;
    }

    public final void endSection(@Nullable Object object0) {
        android.os.Trace.endSection();
    }
}

