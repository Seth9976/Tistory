package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import zf.d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001A!\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001A\u0013\u0010\u0007\u001A\u00020\u0006*\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001A\u000F\u0010\n\u001A\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "factories", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "tryCreateDispatcher", "(Lkotlinx/coroutines/internal/MainDispatcherFactory;Ljava/util/List;)Lkotlinx/coroutines/MainCoroutineDispatcher;", "", "isMissing", "(Lkotlinx/coroutines/MainCoroutineDispatcher;)Z", "", "throwMissingMainDispatcherException", "()Ljava/lang/Void;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatchersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
public final class MainDispatchersKt {
    @InternalCoroutinesApi
    public static final boolean isMissing(@NotNull MainCoroutineDispatcher mainCoroutineDispatcher0) {
        return mainCoroutineDispatcher0.getImmediate() instanceof d;
    }

    @NotNull
    public static final Void throwMissingMainDispatcherException() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. \'kotlinx-coroutines-android\' and ensure it has the same version as \'kotlinx-coroutines-core\'");
    }

    @InternalCoroutinesApi
    @NotNull
    public static final MainCoroutineDispatcher tryCreateDispatcher(@NotNull MainDispatcherFactory mainDispatcherFactory0, @NotNull List list0) {
        try {
            return mainDispatcherFactory0.createDispatcher(list0);
        }
        catch(Throwable throwable0) {
            mainDispatcherFactory0.hintOnError();
            throw throwable0;
        }
    }
}

