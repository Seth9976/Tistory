package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000B\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u0004\u001A\u0004\b\b\u0010\tR \u0010\u000F\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u0012\u0004\b\u000E\u0010\u0004\u001A\u0004\b\r\u0010\tR \u0010\u0013\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0007\u0012\u0004\b\u0012\u0010\u0004\u001A\u0004\b\u0011\u0010\tR\u001A\u0010\u0018\u001A\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0004\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/Dispatchers;", "", "", "shutdown", "()V", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault$annotations", "Default", "b", "getUnconfined", "getUnconfined$annotations", "Unconfined", "c", "getIO", "getIO$annotations", "IO", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "getMain", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "getMain$annotations", "Main", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Dispatchers {
    @NotNull
    public static final Dispatchers INSTANCE;
    public static final DefaultScheduler a;
    public static final Unconfined b;
    public static final DefaultIoScheduler c;

    static {
        Dispatchers.INSTANCE = new Dispatchers();  // 初始化器: Ljava/lang/Object;-><init>()V
        Dispatchers.a = DefaultScheduler.INSTANCE;
        Dispatchers.b = Unconfined.INSTANCE;
        Dispatchers.c = DefaultIoScheduler.INSTANCE;
    }

    @NotNull
    public static final CoroutineDispatcher getDefault() {
        return Dispatchers.a;
    }

    @JvmStatic
    public static void getDefault$annotations() {
    }

    @NotNull
    public static final CoroutineDispatcher getIO() {
        return Dispatchers.c;
    }

    @JvmStatic
    public static void getIO$annotations() {
    }

    @NotNull
    public static final MainCoroutineDispatcher getMain() {
        return MainDispatcherLoader.dispatcher;
    }

    @JvmStatic
    public static void getMain$annotations() {
    }

    @NotNull
    public static final CoroutineDispatcher getUnconfined() {
        return Dispatchers.b;
    }

    @JvmStatic
    public static void getUnconfined$annotations() {
    }

    @DelicateCoroutinesApi
    public final void shutdown() {
        DefaultExecutor.INSTANCE.shutdown();
        DefaultScheduler.INSTANCE.shutdown$kotlinx_coroutines_core();
    }
}

