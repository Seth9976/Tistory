package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.LikeState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class w1 extends SuspendLambda implements Function2 {
    public int a;
    public final boolean b;
    public final EntryViewModel c;
    public final String d;
    public final Long e;

    public w1(boolean z, EntryViewModel entryViewModel0, String s, Long long0, Continuation continuation0) {
        this.b = z;
        this.c = entryViewModel0;
        this.d = s;
        this.e = long0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new w1(this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((w1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                u1 u10 = this.b ? new u1(this.c.i) : new v1(this.c.i);
                this.a = 1;
                object0 = u10.invoke(this.d, this.e, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        EntryViewModel entryViewModel0 = this.c;
        boolean z = this.b;
        if(((Result)object0) instanceof Success) {
            entryViewModel0.getLikeCount().setValue(Boxing.boxLong(((LikeState)((Success)(((Result)object0))).getData()).getLikeCount()));
            entryViewModel0.getLikeSelected().setValue(Boxing.boxBoolean(!z));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            entryViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
        }
        return Unit.INSTANCE;
    }
}

