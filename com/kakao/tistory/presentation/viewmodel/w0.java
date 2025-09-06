package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.ChallengeRequirements;
import com.kakao.tistory.presentation.editor.contract.EditorChallenge;
import com.kakao.tistory.presentation.editor.contract.EditorChallengeKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import qd.a;

public final class w0 extends SuspendLambda implements Function2 {
    public int a;
    public final EditorViewModel b;
    public final String c;
    public final long d;

    public w0(EditorViewModel editorViewModel0, String s, long v, Continuation continuation0) {
        this.b = editorViewModel0;
        this.c = s;
        this.d = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new w0(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((w0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.o.invoke(this.c, Boxing.boxLong(this.d), this);
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
        EditorChallenge editorChallenge0 = null;
        if(((Result)object0) instanceof Success) {
            MutableStateFlow mutableStateFlow0 = editorViewModel0.y0;
            ChallengeRequirements challengeRequirements0 = (ChallengeRequirements)((Success)(((Result)object0))).getData();
            if(challengeRequirements0 != null) {
                editorChallenge0 = EditorChallengeKt.toEditorChallenge(challengeRequirements0);
            }
            mutableStateFlow0.setValue(editorChallenge0);
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            editorViewModel0.y0.setValue(null);
        }
        return Unit.INSTANCE;
    }
}

