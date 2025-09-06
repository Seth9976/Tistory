package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "R", "", "owner", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "invoke", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,620:1\n1#2:621\n*E\n"})
public final class DebugProbesImpl.dumpCoroutinesInfoImpl.3 extends Lambda implements Function1 {
    public final Function2 w;

    public DebugProbesImpl.dumpCoroutinesInfoImpl.3(Function2 function20) {
        this.w = function20;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(((CoroutineOwner)object0));
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineOwner debugProbesImpl$CoroutineOwner0) {
        if(!DebugProbesImpl.access$isFinished(DebugProbesImpl.INSTANCE, debugProbesImpl$CoroutineOwner0)) {
            CoroutineContext coroutineContext0 = debugProbesImpl$CoroutineOwner0.info.getContext();
            return coroutineContext0 == null ? null : this.w.invoke(debugProbesImpl$CoroutineOwner0, coroutineContext0);
        }
        return null;
    }
}

