package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.autosave.EditEntryEntity;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.usecase.GetLatestEditEntryUseCase.EditType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import qd.a;

public final class a1 extends SuspendLambda implements Function2 {
    public int a;
    public final EditorViewModel b;
    public final boolean c;

    public a1(EditorViewModel editorViewModel0, boolean z, Continuation continuation0) {
        this.b = editorViewModel0;
        this.c = z;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a1(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new a1(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.b.isShowProgress().postValue(Boxing.boxBoolean(true));
                this.a = 1;
                object0 = this.b.m.invoke(this.b.getBlogName(), (this.c ? EditType.NEW : EditType.ALL), this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_10;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
            label_10:
                EditorViewModel editorViewModel0 = this.b;
                if(((Result)object0) instanceof Success) {
                    EditEntryEntity editEntryEntity0 = (EditEntryEntity)((Success)(((Result)object0))).getData();
                    if(editEntryEntity0 != null) {
                        editorViewModel0.a(editEntryEntity0);
                    }
                }
                this.a = 2;
                if(DelayKt.delay(100L, this) == object1) {
                    return object1;
                }
                this.b.isShowProgress().postValue(Boxing.boxBoolean(false));
                this.b.isCompleteLoad().postValue(Boxing.boxBoolean(true));
                this.b.D0 = false;
                return Unit.INSTANCE;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ResultKt.throwOnFailure(object0);
        this.b.isShowProgress().postValue(Boxing.boxBoolean(false));
        this.b.isCompleteLoad().postValue(Boxing.boxBoolean(true));
        this.b.D0 = false;
        return Unit.INSTANCE;
    }
}

