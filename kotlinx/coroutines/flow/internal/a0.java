package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;

public final class a0 extends Lambda implements Function2 {
    public final SafeCollector w;

    public a0(SafeCollector safeCollector0) {
        this.w = safeCollector0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object0).intValue();
        Key coroutineContext$Key0 = ((Element)object1).getKey();
        Element coroutineContext$Element0 = this.w.collectContext.get(coroutineContext$Key0);
        if(coroutineContext$Key0 != Job.Key) {
            return ((Element)object1) == coroutineContext$Element0 ? ((int)(v + 1)) : 0x80000000;
        }
        Intrinsics.checkNotNull(((Element)object1), "null cannot be cast to non-null type kotlinx.coroutines.Job");
        Job job0 = SafeCollector_commonKt.transitiveCoroutineParent(((Job)(((Element)object1))), ((Job)coroutineContext$Element0));
        if(job0 != ((Job)coroutineContext$Element0)) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + job0 + ", expected child of " + ((Job)coroutineContext$Element0) + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'").toString());
        }
        if(((Job)coroutineContext$Element0) != null) {
            ++v;
        }
        return v;
    }
}

