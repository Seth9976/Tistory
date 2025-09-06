package v9;

import com.kakao.kandinsky.core.filter.FilterEngine;
import com.kakao.kandinsky.core.filter.filter.FilterChain;
import com.kakao.kandinsky.core.kdphoto.Filter;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class j extends SuspendLambda implements Function2 {
    public FilterEngine o;
    public int p;
    public final FilterEngine q;
    public final Filter r;

    public j(FilterEngine filterEngine0, Filter filter0, Continuation continuation0) {
        this.q = filterEngine0;
        this.r = filter0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j(this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FilterChain filterChain1;
        FilterEngine filterEngine0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                filterEngine0 = this.q;
                FilterChain filterChain0 = filterEngine0.getFilterChain$filter_release();
                if(filterChain0 != null) {
                    filterChain0.delete();
                }
                Filter filter0 = this.r;
                if(filter0 == null) {
                    filterChain1 = null;
                }
                else {
                    this.o = filterEngine0;
                    this.p = 1;
                    Object object2 = FilterEngine.access$createFilterChain(filterEngine0, filter0, this);
                    if(object2 == object1) {
                        return object1;
                    }
                    filterChain1 = (FilterChain)object2;
                }
                break;
            }
            case 1: {
                FilterEngine filterEngine1 = this.o;
                ResultKt.throwOnFailure(object0);
                filterChain1 = (FilterChain)object0;
                filterEngine0 = filterEngine1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        filterEngine0.setFilterChain$filter_release(filterChain1);
        return Unit.INSTANCE;
    }
}

