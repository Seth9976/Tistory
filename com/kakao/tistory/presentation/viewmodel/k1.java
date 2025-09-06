package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.autosave.EditEntryEntity;
import com.kakao.tistory.domain.entity.autosave.EntryKeyEntity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class k1 extends SuspendLambda implements Function2 {
    public int a;
    public final EditorViewModel b;

    public k1(EditorViewModel editorViewModel0, Continuation continuation0) {
        this.b = editorViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k1(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new k1(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(this.b.a() || this.b.b()) {
                    EditEntryEntity editEntryEntity0 = new EditEntryEntity(new EntryKeyEntity(this.b.getBlogName(), this.b.getEntryId(), this.b.X), EditorViewModel.access$makePostEntity(this.b), EditorViewModel.access$makeSettingEntity(this.b), false, 8, null);
                    this.a = 1;
                    if(this.b.j.insertAutoSave(editEntryEntity0, this) == object1) {
                        return object1;
                    }
                }
                return Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

