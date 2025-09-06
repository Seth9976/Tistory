package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class t1 extends SuspendLambda implements Function2 {
    public int a;
    public final EntryViewModel b;
    public final String c;
    public final String d;
    public final String e;

    public t1(EntryViewModel entryViewModel0, String s, String s1, String s2, Continuation continuation0) {
        this.b = entryViewModel0;
        this.c = s;
        this.d = s1;
        this.e = s2;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new t1(this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((t1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.i.getEntry(this.c, this.d, this.e, this);
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
        EntryViewModel entryViewModel0 = this.b;
        String s = this.e;
        String s1 = this.d;
        if(((Result)object0) instanceof Success) {
            entryViewModel0.R = s;
            EntryViewModel.access$onSuccessEntry(entryViewModel0, ((EntryItem)((Success)(((Result)object0))).getData()), s);
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            if(Intrinsics.areEqual("EXCEPTION_UNKNOWN_STATUS", "PROTECTED_ENTRY_PASSWORD_REQUIRED")) {
                entryViewModel0.v.setValue(new Event(s1));
                return Unit.INSTANCE;
            }
            entryViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
        }
        return Unit.INSTANCE;
    }
}

