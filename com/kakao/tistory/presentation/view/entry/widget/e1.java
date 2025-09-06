package com.kakao.tistory.presentation.view.entry.widget;

import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.view.comment.BaseCommentTiara;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class e1 extends SuspendLambda implements Function2 {
    public final BaseCommentTiara a;

    public e1(BaseCommentTiara baseCommentTiara0, Continuation continuation0) {
        this.a = baseCommentTiara0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new e1(this.a, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new e1(this.a, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        String s = this.a.getSection();
        String s1 = this.a.getPage();
        TistoryTiara.trackPage$default(TistoryTiara.INSTANCE, s, s1, "댓글수정_보기", null, null, null, null, 120, null);
        return Unit.INSTANCE;
    }
}

