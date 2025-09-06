package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.model.StatisticsItem.RefererKeywordItem;
import com.kakao.tistory.data.model.StatisticsItem;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class k6 extends SuspendLambda implements Function2 {
    public int a;
    public Object b;
    public final StatisticsViewModel c;
    public final String d;
    public final String e;
    public final String f;

    public k6(StatisticsViewModel statisticsViewModel0, String s, String s1, String s2, Continuation continuation0) {
        this.c = statisticsViewModel0;
        this.d = s;
        this.e = s1;
        this.f = s2;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new k6(this.c, this.d, this.e, this.f, continuation0);
        continuation1.b = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k6)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Pair pair0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Object object2 = null;
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.b;
                EntryItem entryItem0 = (EntryItem)this.c.getEntryItem().getValue();
                if(entryItem0 == null) {
                    goto label_19;
                }
                else {
                    Long long0 = entryItem0.getId();
                    if(long0 == null) {
                        goto label_19;
                    }
                    else {
                        this.b = coroutineScope0;
                        this.a = 1;
                        object0 = StatisticsViewModel.access$getEntryStatistics(this.c, this.d, long0.longValue(), this.e, this.f, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        goto label_17;
                    }
                }
                break;
            }
            case 1: {
                CoroutineScope coroutineScope1 = (CoroutineScope)this.b;
                ResultKt.throwOnFailure(object0);
            label_17:
                pair0 = (Pair)object0;
                if(pair0 == null) {
                label_19:
                    StatisticsViewModel statisticsViewModel0 = this.c;
                    String s = this.d;
                    String s1 = this.e;
                    String s2 = this.f;
                    String s3 = (String)statisticsViewModel0.getMetric().getValue();
                    if(s3 == null) {
                        s3 = "uv";
                    }
                    this.b = null;
                    this.a = 2;
                    object0 = StatisticsViewModel.access$getBlogStatistics(statisticsViewModel0, s, s1, s2, s3, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    pair0 = (Pair)object0;
                }
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                pair0 = (Pair)object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        List list0 = (List)pair0.component1();
        this.c.getStatisticsItems().setValue(list0);
        for(Object object3: CollectionsKt___CollectionsKt.asSequence(list0)) {
            if(((StatisticsItem)object3) instanceof RefererKeywordItem) {
                object2 = object3;
                break;
            }
            if(false) {
                break;
            }
        }
        if(((StatisticsItem)object2) != null) {
            StatisticsViewModel.access$updateRefererKeywordInfo(this.c, "");
        }
        this.c.isShowProgress().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}

