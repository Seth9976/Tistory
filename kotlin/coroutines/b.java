package kotlin.coroutines;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public static final b w;

    static {
        b.w = new b(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((CoroutineContext)object0), "acc");
        Intrinsics.checkNotNullParameter(((Element)object1), "element");
        CoroutineContext coroutineContext0 = ((CoroutineContext)object0).minusKey(((Element)object1).getKey());
        EmptyCoroutineContext emptyCoroutineContext0 = EmptyCoroutineContext.INSTANCE;
        if(coroutineContext0 != emptyCoroutineContext0) {
            Key continuationInterceptor$Key0 = ContinuationInterceptor.Key;
            ContinuationInterceptor continuationInterceptor0 = (ContinuationInterceptor)coroutineContext0.get(continuationInterceptor$Key0);
            if(continuationInterceptor0 == null) {
                return new CombinedContext(coroutineContext0, ((Element)object1));
            }
            CoroutineContext coroutineContext1 = coroutineContext0.minusKey(continuationInterceptor$Key0);
            return coroutineContext1 == emptyCoroutineContext0 ? new CombinedContext(((Element)object1), continuationInterceptor0) : new CombinedContext(new CombinedContext(coroutineContext1, ((Element)object1)), continuationInterceptor0);
        }
        return (Element)object1;
    }
}

