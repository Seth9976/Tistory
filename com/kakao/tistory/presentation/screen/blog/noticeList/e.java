package com.kakao.tistory.presentation.screen.blog.noticeList;

import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import com.kakao.tistory.presentation.screen.item.ViewState.Error;
import com.kakao.tistory.presentation.screen.item.ViewState.Success;
import com.kakao.tistory.presentation.screen.item.ViewState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class e extends SuspendLambda implements Function2 {
    public final ViewState a;
    public final NavActions b;
    public final State c;

    public e(ViewState viewState0, NavActions navActions0, State state0, Continuation continuation0) {
        this.a = viewState0;
        this.b = navActions0;
        this.c = state0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new e(this.a, this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        ViewState viewState0 = this.a;
        if(viewState0 instanceof Error) {
            this.b.getFinish().invoke();
            return Unit.INSTANCE;
        }
        if(viewState0 instanceof Success) {
            BlogNoticeListScreenKt.access$BlogNoticeScreen$lambda$1(this.c).getChangeBlogInfo().invoke(((Success)this.a).getItem());
        }
        return Unit.INSTANCE;
    }
}

