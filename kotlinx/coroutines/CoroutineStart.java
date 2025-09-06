package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001JE\u0010\t\u001A\u00020\b\"\u0004\b\u0000\u0010\u00022\u001C\u0010\u0006\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ^\u0010\t\u001A\u00020\b\"\u0004\b\u0000\u0010\u000B\"\u0004\b\u0001\u0010\u00022\'\u0010\u0006\u001A#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0002\b\r2\u0006\u0010\u000E\u001A\u00028\u00002\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000FR\u001A\u0010\u0011\u001A\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0011\u0010\u0012j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "completion", "", "invoke", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public enum CoroutineStart {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[CoroutineStart.values().length];
            try {
                arr_v[CoroutineStart.DEFAULT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[CoroutineStart.ATOMIC.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[CoroutineStart.LAZY.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    DEFAULT,
    LAZY,
    @ExperimentalCoroutinesApi
    ATOMIC,
    UNDISPATCHED;

    @InternalCoroutinesApi
    public final void invoke(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        switch(WhenMappings.$EnumSwitchMapping$0[this.ordinal()]) {
            case 1: {
                CancellableKt.startCoroutineCancellable(function10, continuation0);
                break;
            }
            case 2: {
                ContinuationKt.startCoroutine(function10, continuation0);
                return;
            }
            case 3: {
                UndispatchedKt.startCoroutineUndispatched(function10, continuation0);
                return;
            }
            case 4: {
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @InternalCoroutinesApi
    public final void invoke(@NotNull Function2 function20, Object object0, @NotNull Continuation continuation0) {
        switch(WhenMappings.$EnumSwitchMapping$0[this.ordinal()]) {
            case 1: {
                CancellableKt.startCoroutineCancellable$default(function20, object0, continuation0, null, 4, null);
                break;
            }
            case 2: {
                ContinuationKt.startCoroutine(function20, object0, continuation0);
                return;
            }
            case 3: {
                UndispatchedKt.startCoroutineUndispatched(function20, object0, continuation0);
                return;
            }
            case 4: {
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final boolean isLazy() {
        return this == CoroutineStart.LAZY;
    }

    @InternalCoroutinesApi
    public static void isLazy$annotations() {
    }
}

