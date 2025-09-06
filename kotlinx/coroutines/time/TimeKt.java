package kotlinx.coroutines.time;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.selects.OnTimeoutKt;
import kotlinx.coroutines.selects.SelectBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u001B\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A-\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001A-\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\n\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u000B\u0010\t\u001AF\u0010\u0012\u001A\u00020\u0002\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0001\u001A\u00020\u00002\u001C\u0010\u0011\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000F\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000Eø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001AW\u0010\u0017\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0001\u001A\u00020\u00002\'\u0010\u0011\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000F\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014¢\u0006\u0002\b\u0016H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001AL\u0010\u0019\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0001\u001A\u00020\u00002\'\u0010\u0011\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000F\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014¢\u0006\u0002\b\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001A"}, d2 = {"Ljava/time/Duration;", "duration", "", "delay", "(Ljava/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lkotlinx/coroutines/flow/Flow;", "timeout", "debounce", "(Lkotlinx/coroutines/flow/Flow;Ljava/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "period", "sample", "R", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "onTimeout", "(Lkotlinx/coroutines/selects/SelectBuilder;Ljava/time/Duration;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ExtensionFunctionType;", "withTimeout", "(Ljava/time/Duration;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeoutOrNull", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TimeKt {
    public static final long a(Duration duration0) {
        if(duration0.compareTo(Duration.ZERO) <= 0) {
            return 0L;
        }
        if(duration0.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0) {
            return 1L;
        }
        return duration0.getSeconds() < 0x20C49BA5E353F7L || duration0.getSeconds() == 0x20C49BA5E353F7L && duration0.getNano() < 807000000 ? duration0.toMillis() : 0x7FFFFFFFFFFFFFFFL;
    }

    @FlowPreview
    @NotNull
    public static final Flow debounce(@NotNull Flow flow0, @NotNull Duration duration0) {
        return FlowKt.debounce(flow0, TimeKt.a(duration0));
    }

    @Nullable
    public static final Object delay(@NotNull Duration duration0, @NotNull Continuation continuation0) {
        Object object0 = DelayKt.delay(TimeKt.a(duration0), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static final void onTimeout(@NotNull SelectBuilder selectBuilder0, @NotNull Duration duration0, @NotNull Function1 function10) {
        OnTimeoutKt.onTimeout(selectBuilder0, TimeKt.a(duration0), function10);
    }

    @FlowPreview
    @NotNull
    public static final Flow sample(@NotNull Flow flow0, @NotNull Duration duration0) {
        return FlowKt.sample(flow0, TimeKt.a(duration0));
    }

    @Nullable
    public static final Object withTimeout(@NotNull Duration duration0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return TimeoutKt.withTimeout(TimeKt.a(duration0), function20, continuation0);
    }

    @Nullable
    public static final Object withTimeoutOrNull(@NotNull Duration duration0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return TimeoutKt.withTimeoutOrNull(TimeKt.a(duration0), function20, continuation0);
    }
}

