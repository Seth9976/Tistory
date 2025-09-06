package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A.\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\n\u0010\u0002\u001A\u00060\u0003j\u0002`\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0087\b¢\u0006\u0002\u0010\u0007*\u0010\b\u0007\u0010\b\"\u00020\u00032\u00020\u0003B\u0002\b\t¨\u0006\n"}, d2 = {"synchronizedImpl", "T", "lock", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "block", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "SynchronizedObject", "Lkotlinx/coroutines/InternalCoroutinesApi;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SynchronizedKt {
    @InternalCoroutinesApi
    public static void SynchronizedObject$annotations() {
    }

    @InternalCoroutinesApi
    public static final Object synchronizedImpl(@NotNull Object object0, @NotNull Function0 function00) {
        synchronized(object0) {
            return function00.invoke();
        }
    }
}

