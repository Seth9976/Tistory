package v9;

import com.kakao.kandinsky.core.filter.FilterEngine;
import com.kakao.kandinsky.core.filter.filter.FilterChain;
import com.kakao.kandinsky.core.kdphoto.Filter;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class d extends SuspendLambda implements Function2 {
    public final FilterEngine o;
    public final Filter p;

    public d(FilterEngine filterEngine0, Filter filter0, Continuation continuation0) {
        this.o = filterEngine0;
        this.p = filter0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d(this.o, this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        List list0 = this.o.c.createFilterList(this.p);
        return new FilterChain(this.o.getGlResourcesProvider$filter_release(), list0);
    }
}

