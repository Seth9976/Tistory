package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001R\"\u0010\t\u001A\u00020\u00028\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/debug/internal/AgentInstallationType;", "", "", "a", "Z", "isInstalledStatically$kotlinx_coroutines_core", "()Z", "setInstalledStatically$kotlinx_coroutines_core", "(Z)V", "isInstalledStatically", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AgentInstallationType {
    @NotNull
    public static final AgentInstallationType INSTANCE;
    public static boolean a;

    static {
        AgentInstallationType.INSTANCE = new AgentInstallationType();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final boolean isInstalledStatically$kotlinx_coroutines_core() [...] // 潜在的解密器

    public final void setInstalledStatically$kotlinx_coroutines_core(boolean z) {
        AgentInstallationType.a = z;
    }
}

