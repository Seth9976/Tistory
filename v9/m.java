package v9;

import android.util.Size;
import com.kakao.kandinsky.core.filter.FilterEngine;
import com.kakao.kandinsky.core.filter.filter.MosaicChain;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class m extends SuspendLambda implements Function2 {
    public FilterEngine o;
    public int p;
    public final FilterEngine q;
    public final List r;
    public final Size s;

    public m(FilterEngine filterEngine0, List list0, Size size0, Continuation continuation0) {
        this.q = filterEngine0;
        this.r = list0;
        this.s = size0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new m(this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        MosaicChain mosaicChain1;
        FilterEngine filterEngine0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                filterEngine0 = this.q;
                MosaicChain mosaicChain0 = filterEngine0.getMosaicChain$filter_release();
                if(mosaicChain0 != null) {
                    mosaicChain0.delete();
                }
                mosaicChain1 = null;
                List list0 = this.r;
                if(list0 != null && (list0.isEmpty() ? null : list0) != null) {
                    this.o = filterEngine0;
                    this.p = 1;
                    Object object2 = FilterEngine.access$createMosaicChain(filterEngine0, list0, this.s, this);
                    if(object2 == object1) {
                        return object1;
                    }
                    mosaicChain1 = (MosaicChain)object2;
                }
                break;
            }
            case 1: {
                FilterEngine filterEngine1 = this.o;
                ResultKt.throwOnFailure(object0);
                mosaicChain1 = (MosaicChain)object0;
                filterEngine0 = filterEngine1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        filterEngine0.setMosaicChain$filter_release(mosaicChain1);
        return Unit.INSTANCE;
    }
}

