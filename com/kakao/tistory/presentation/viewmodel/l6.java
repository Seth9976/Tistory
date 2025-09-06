package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.model.StatisticsItem.Trend;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class l6 extends SuspendLambda implements Function2 {
    public int a;
    public Object b;
    public final StatisticsViewModel c;
    public final String d;
    public final String e;
    public final String f;

    public l6(StatisticsViewModel statisticsViewModel0, String s, String s1, String s2, Continuation continuation0) {
        this.c = statisticsViewModel0;
        this.d = s;
        this.e = s1;
        this.f = s2;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new l6(this.c, this.d, this.e, this.f, continuation0);
        continuation1.b = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((l6)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Result result0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.b;
                this.c.isShowFooter().setValue(Boxing.boxBoolean(true));
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
                        object0 = this.c.j.getEntryTrendMore(this.d, long0.longValue(), this.e, this.f, this);
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
                result0 = (Result)object0;
                if(result0 == null) {
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
                    object0 = statisticsViewModel0.j.getBlogTrendMore(s, s1, s2, s3, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    result0 = (Result)object0;
                }
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                result0 = (Result)object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        StatisticsViewModel statisticsViewModel1 = this.c;
        if(result0 instanceof Success) {
            List list0 = ((Trend)((Success)result0).getData()).getItems();
            ArrayList arrayList0 = new ArrayList();
            List list1 = (List)statisticsViewModel1.getTrendItems().getValue();
            if(list1 == null) {
                list1 = CollectionsKt__CollectionsKt.emptyList();
            }
            else {
                Intrinsics.checkNotNull(list1);
            }
            arrayList0.addAll(list1);
            arrayList0.addAll(list0);
            statisticsViewModel1.getTrendItems().setValue(arrayList0);
            if(list0 != null && !list0.isEmpty()) {
                statisticsViewModel1.F.setValue("");
            }
            statisticsViewModel1.isShowFooter().postValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
        if(result0 instanceof Fail) {
            statisticsViewModel1.isShowFooter().postValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}

