package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.AttachedData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class l1 extends SuspendLambda implements Function2 {
    public int a;
    public final EditorViewModel b;
    public final String c;
    public final Function1 d;

    public l1(EditorViewModel editorViewModel0, String s, Function1 function10, Continuation continuation0) {
        this.b = editorViewModel0;
        this.c = s;
        this.d = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new l1(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((l1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.b.isShowProgress().postValue(Boxing.boxBoolean(true));
                this.a = 1;
                object0 = this.b.h.postBlogAttachImage(this.b.getBlogName(), this.c, this);
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
        Function1 function10 = this.d;
        if(((Result)object0) instanceof Success) {
            function10.invoke(((AttachedData)((Success)(((Result)object0))).getData()).getUrl());
        }
        this.b.isShowProgress().postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}

