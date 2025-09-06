package bg;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.selects.OnTimeout.register..inlined.Runnable.1;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;

public final class a extends FunctionReferenceImpl implements Function3 {
    public static final a a;

    static {
        a.a = new a(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        long v = ((b)object0).a;
        if(v <= 0L) {
            ((SelectInstance)object1).selectInRegistrationPhase(Unit.INSTANCE);
            return Unit.INSTANCE;
        }
        OnTimeout.register..inlined.Runnable.1 onTimeout$register$$inlined$Runnable$10 = new OnTimeout.register..inlined.Runnable.1(((SelectInstance)object1), ((b)object0));
        Intrinsics.checkNotNull(((SelectInstance)object1), "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        SelectImplementation selectImplementation0 = (SelectImplementation)(((SelectInstance)object1));
        CoroutineContext coroutineContext0 = ((SelectInstance)object1).getContext();
        ((SelectInstance)object1).disposeOnCompletion(DelayKt.getDelay(coroutineContext0).invokeOnTimeout(v, onTimeout$register$$inlined$Runnable$10, coroutineContext0));
        return Unit.INSTANCE;
    }
}

