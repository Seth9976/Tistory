package v9;

import com.kakao.kandinsky.core.filter.FilterEngine;
import com.kakao.kandinsky.core.filter.filter.EffectFilter;
import com.kakao.kandinsky.core.kdphoto.Effect;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

public final class i extends SuspendLambda implements Function2 {
    public final Effect o;
    public final FilterEngine p;

    public i(Effect effect0, FilterEngine filterEngine0, Continuation continuation0) {
        this.o = effect0;
        this.p = filterEngine0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new i(this.o, this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Effect effect0 = this.o;
        FilterEngine filterEngine0 = this.p;
        if(effect0 != null && !Intrinsics.areEqual(effect0, Effect.Companion.getDefault())) {
            EffectFilter effectFilter0 = filterEngine0.getEffectFilter$filter_release();
            if(effectFilter0 == null) {
                effectFilter0 = new EffectFilter(filterEngine0.getGlResourcesProvider$filter_release());
            }
            filterEngine0.setEffectFilter$filter_release(effectFilter0);
            EffectFilter effectFilter1 = filterEngine0.getEffectFilter$filter_release();
            if(effectFilter1 != null) {
                effectFilter1.updateEffect(effect0);
                return Unit.INSTANCE;
            }
            return null;
        }
        EffectFilter effectFilter2 = filterEngine0.getEffectFilter$filter_release();
        if(effectFilter2 != null) {
            effectFilter2.release();
        }
        filterEngine0.setEffectFilter$filter_release(null);
        return Unit.INSTANCE;
    }
}

