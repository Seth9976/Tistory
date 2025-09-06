package kotlinx.coroutines.flow;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xf.o2;
import xf.t2;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001C\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/flow/SharingStarted;", "", "command", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharingCommand;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "Companion", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface SharingStarted {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0086\u0003\u0018\u00002\u00020\u0001J!\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\f\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0017\u0010\u000F\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001A\u0004\b\u000E\u0010\u000B¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/flow/SharingStarted$Companion;", "", "", "stopTimeoutMillis", "replayExpirationMillis", "Lkotlinx/coroutines/flow/SharingStarted;", "WhileSubscribed", "(JJ)Lkotlinx/coroutines/flow/SharingStarted;", "b", "Lkotlinx/coroutines/flow/SharingStarted;", "getEagerly", "()Lkotlinx/coroutines/flow/SharingStarted;", "Eagerly", "c", "getLazily", "Lazily", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final o2 b;
        public static final o2 c;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new o2(0);
            Companion.c = new o2(1);
        }

        @NotNull
        public final SharingStarted WhileSubscribed(long v, long v1) {
            return new t2(v, v1);
        }

        public static SharingStarted WhileSubscribed$default(Companion sharingStarted$Companion0, long v, long v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = 0L;
            }
            if((v2 & 2) != 0) {
                v1 = 0x7FFFFFFFFFFFFFFFL;
            }
            return sharingStarted$Companion0.WhileSubscribed(v, v1);
        }

        @NotNull
        public final SharingStarted getEagerly() {
            return Companion.b;
        }

        @NotNull
        public final SharingStarted getLazily() {
            return Companion.c;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        SharingStarted.Companion = Companion.a;
    }

    @NotNull
    Flow command(@NotNull StateFlow arg1);
}

