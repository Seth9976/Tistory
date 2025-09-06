package fa;

import com.kakao.kandinsky.core.kdphoto.Filter;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

public final class a extends SuspendLambda implements Function4 {
    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        String s = (String)object0;
        Filter filter0 = (Filter)object1;
        ((Number)object2).intValue();
        new a(4, ((Continuation)object3)).invokeSuspend(Unit.INSTANCE);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
        return null;
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        return null;
    }
}

