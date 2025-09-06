package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class q6 extends SuspendLambda implements Function2 {
    public StatisticsViewModel a;
    public int b;
    public final StatisticsViewModel c;
    public final String d;

    public q6(StatisticsViewModel statisticsViewModel0, String s, Continuation continuation0) {
        this.c = statisticsViewModel0;
        this.d = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new q6(this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new q6(this.c, this.d, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        StatisticsViewModel statisticsViewModel1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.b) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Object object2 = this.c.o.getValue();
                if(((String)object2) == null) {
                    return Unit.INSTANCE;
                }
                EntryItem entryItem0 = (EntryItem)this.c.getEntryItem().getValue();
                if(entryItem0 != null) {
                    Long long0 = entryItem0.getId();
                    if(long0 != null) {
                        StatisticsViewModel statisticsViewModel0 = this.c;
                        this.a = statisticsViewModel0;
                        this.b = 1;
                        object0 = statisticsViewModel0.j.getKeywordInfo(((String)object2), long0.longValue(), this.d, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        statisticsViewModel1 = statisticsViewModel0;
                        goto label_21;
                    }
                }
                break;
            }
            case 1: {
                statisticsViewModel1 = this.a;
                ResultKt.throwOnFailure(object0);
            label_21:
                if(((Result)object0) instanceof Success) {
                    statisticsViewModel1.G.setValue(((Success)(((Result)object0))).getData());
                    return Unit.INSTANCE;
                }
                if(((Result)object0) instanceof Fail) {
                    statisticsViewModel1.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

