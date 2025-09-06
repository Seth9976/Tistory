package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.ErrorStatus;
import com.kakao.tistory.domain.entity.autosave.EditEntryEntity;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class z0 extends SuspendLambda implements Function2 {
    public int a;
    public final EditorViewModel b;
    public final String c;
    public final long d;

    public z0(EditorViewModel editorViewModel0, String s, long v, Continuation continuation0) {
        this.b = editorViewModel0;
        this.c = s;
        this.d = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new z0(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((z0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.b.isShowProgress().postValue(Boxing.boxBoolean(true));
                this.a = 1;
                object0 = this.b.l.invoke(this.c, this.d, this);
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
        EditorViewModel editorViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            editorViewModel0.a(((EditEntryEntity)((Success)(((Result)object0))).getData()));
        }
        else if(((Result)object0) instanceof Fail) {
            if(((Fail)(((Result)object0))).getErrorModel().getCode() == ErrorStatus.CAN_NOT_EDIT_ENTRY.getCode()) {
                editorViewModel0.z.setValue(new Event(((Fail)(((Result)object0))).getErrorModel().getTitle()));
            }
            else {
                editorViewModel0.y.setValue(new Event(Unit.INSTANCE));
            }
        }
        this.b.isShowProgress().postValue(Boxing.boxBoolean(false));
        this.b.isCompleteLoad().postValue(Boxing.boxBoolean(true));
        this.b.D0 = false;
        return Unit.INSTANCE;
    }
}

