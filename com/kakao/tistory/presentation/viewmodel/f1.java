package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.presentation.editor.contract.EditorChallenge;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

public final class f1 extends SuspendLambda implements Function3 {
    public EditorChallenge a;
    public List b;

    public f1(Continuation continuation0) {
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        f1 f10 = new f1(((Continuation)object2));
        f10.a = (EditorChallenge)object0;
        f10.b = (List)object1;
        return f10.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        return this.a == null || !this.b.containsAll(this.a.getTagList()) ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
    }
}

