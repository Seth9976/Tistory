package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.ItemListModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class i3 extends SuspendLambda implements Function2 {
    public int a;
    public Object b;
    public final RefererEtcViewModel c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public i3(RefererEtcViewModel refererEtcViewModel0, String s, String s1, String s2, String s3, Continuation continuation0) {
        this.c = refererEtcViewModel0;
        this.d = s;
        this.e = s1;
        this.f = s2;
        this.g = s3;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new i3(this.c, this.d, this.e, this.f, this.g, continuation0);
        continuation1.b = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i3)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Result result0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.b;
                Long long0 = (Long)this.c.i.getValue();
                if(long0 == null) {
                    goto label_19;
                }
                else {
                    if(((long)long0) <= -1L) {
                        long0 = null;
                    }
                    if(long0 == null) {
                        goto label_19;
                    }
                    else {
                        this.b = coroutineScope0;
                        this.a = 1;
                        object0 = this.c.g.getEntryRefererEtc(this.d, ((long)long0), this.e, this.f, this);
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
                    this.b = null;
                    this.a = 2;
                    object0 = this.c.g.getBlogRefererEtc(this.d, this.e, this.f, this.g, this);
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
        RefererEtcViewModel refererEtcViewModel0 = this.c;
        if(result0 instanceof Success) {
            refererEtcViewModel0.getRefererEtcItems().setValue(((ItemListModel)((Success)result0).getData()).getItems());
            return Unit.INSTANCE;
        }
        if(result0 instanceof Fail) {
            refererEtcViewModel0.showErrorDialog(((Fail)result0).getErrorModel());
        }
        return Unit.INSTANCE;
    }
}

