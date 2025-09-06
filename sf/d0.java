package sf;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.SelectInstance;

public final class d0 extends FunctionReferenceImpl implements Function3 {
    public static final d0 a;

    static {
        d0.a = new d0(3, JobSupport.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        JobSupport.access$onAwaitInternalRegFunc(((JobSupport)object0), ((SelectInstance)object1), object2);
        return Unit.INSTANCE;
    }
}

