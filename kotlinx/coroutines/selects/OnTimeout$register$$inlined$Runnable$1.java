package kotlinx.coroutines.selects;

import bg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "kotlinx/coroutines/RunnableKt$Runnable$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n1#1,18:1\n57#2,2:19\n*E\n"})
public final class OnTimeout.register..inlined.Runnable.1 implements Runnable {
    public final SelectInstance a;
    public final b b;

    public OnTimeout.register..inlined.Runnable.1(SelectInstance selectInstance0, b b0) {
        this.a = selectInstance0;
        this.b = b0;
        super();
    }

    @Override
    public final void run() {
        this.a.trySelect(this.b, Unit.INSTANCE);
    }
}

