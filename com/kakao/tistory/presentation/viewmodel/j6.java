package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.model.StatisticsItem.RefererKeywordItem;
import com.kakao.tistory.data.model.StatisticsItem.Trend;
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

public final class j6 extends SuspendLambda implements Function2 {
    public int a;
    public Object b;
    public final StatisticsViewModel c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public j6(StatisticsViewModel statisticsViewModel0, String s, String s1, String s2, String s3, Continuation continuation0) {
        this.c = statisticsViewModel0;
        this.d = s;
        this.e = s1;
        this.f = s2;
        this.g = s3;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new j6(this.c, this.d, this.e, this.f, this.g, continuation0);
        continuation1.b = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j6)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Pair pair0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.b;
                EntryItem entryItem0 = (EntryItem)this.c.getEntryItem().getValue();
                if(entryItem0 == null) {
                    goto label_18;
                }
                else {
                    Long long0 = entryItem0.getId();
                    if(long0 == null) {
                        goto label_18;
                    }
                    else {
                        this.b = coroutineScope0;
                        this.a = 1;
                        object0 = StatisticsViewModel.access$getEntryStatistics(this.c, this.d, long0.longValue(), this.e, this.f, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        goto label_16;
                    }
                }
                goto label_27;
            }
            case 1: {
                CoroutineScope coroutineScope1 = (CoroutineScope)this.b;
                ResultKt.throwOnFailure(object0);
            label_16:
                pair0 = (Pair)object0;
                if(pair0 == null) {
                label_18:
                    this.b = null;
                    this.a = 2;
                    object0 = StatisticsViewModel.access$getBlogStatistics(this.c, this.d, this.e, this.f, this.g, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    pair0 = (Pair)object0;
                }
                goto label_27;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                pair0 = (Pair)object0;
            label_27:
                Object object2 = null;
                List list0 = (List)pair0.component1();
                Trend statisticsItem$Trend0 = (Trend)pair0.component2();
                this.c.getStatisticsItems().setValue(list0);
                this.c.getTotalCount().setValue(Boxing.boxLong(statisticsItem$Trend0.getTotal()));
                this.c.getLastUpdateTime().setValue((statisticsItem$Trend0.getLastUpdateTime() == null ? "" : statisticsItem$Trend0.getLastUpdateTime()));
                this.c.getTrendItems().setValue(statisticsItem$Trend0.getItems());
                statisticsItem$Trend0.getItems().isEmpty();
                this.c.F.setValue("");
                StatisticsViewModel.access$updateTrendInfo(this.c, 0, statisticsItem$Trend0.getException());
                for(Object object3: CollectionsKt___CollectionsKt.asSequence(list0)) {
                    if(((StatisticsItem)object3) instanceof RefererKeywordItem) {
                        object2 = object3;
                        break;
                    }
                }
                if(((StatisticsItem)object2) != null) {
                    StatisticsViewModel.access$updateRefererKeywordInfo(this.c, "");
                }
                this.c.getSelectedGraphPosition().setValue(Boxing.boxInt(0));
                this.b = null;
                this.a = 3;
                if(this.c.B.emit(Boxing.boxInt(0), this) == object1) {
                    return object1;
                }
                this.c.isShowProgress().setValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ResultKt.throwOnFailure(object0);
        this.c.isShowProgress().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}

