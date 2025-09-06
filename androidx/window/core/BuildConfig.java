package androidx.window.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/window/core/BuildConfig;", "", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "a", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "getVerificationMode", "()Landroidx/window/core/SpecificationComputer$VerificationMode;", "verificationMode", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class BuildConfig {
    @NotNull
    public static final BuildConfig INSTANCE;
    public static final VerificationMode a;

    static {
        BuildConfig.INSTANCE = new BuildConfig();  // 初始化器: Ljava/lang/Object;-><init>()V
        BuildConfig.a = VerificationMode.QUIET;
    }

    @NotNull
    public final VerificationMode getVerificationMode() {
        return BuildConfig.a;
    }
}

