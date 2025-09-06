package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zf.d;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0005\u001A\u00020\u00042\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001A\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006\u000B"}, d2 = {"Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcherFactory;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "allFactories", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "createDispatcher", "(Ljava/util/List;)Lkotlinx/coroutines/MainCoroutineDispatcher;", "", "getLoadPriority", "()I", "loadPriority", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@InternalCoroutinesApi
public final class MissingMainCoroutineDispatcherFactory implements MainDispatcherFactory {
    @NotNull
    public static final MissingMainCoroutineDispatcherFactory INSTANCE;

    static {
        MissingMainCoroutineDispatcherFactory.INSTANCE = new MissingMainCoroutineDispatcherFactory();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlinx.coroutines.internal.MainDispatcherFactory
    @NotNull
    public MainCoroutineDispatcher createDispatcher(@NotNull List list0) {
        return new d();  // 初始化器: Lkotlinx/coroutines/MainCoroutineDispatcher;-><init>()V
    }

    @Override  // kotlinx.coroutines.internal.MainDispatcherFactory
    public int getLoadPriority() {
        return -1;
    }

    @Override  // kotlinx.coroutines.internal.MainDispatcherFactory
    @Nullable
    public String hintOnError() {
        return null;
    }
}

