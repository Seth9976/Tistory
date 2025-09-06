package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.blog.usecase.GetShowChallengeAuthUseCase;
import com.kakao.tistory.domain.blog.usecase.SetShowChallengeAuthUseCase;
import com.kakao.tistory.domain.entity.entry.ChallengeResult;
import com.kakao.tistory.presentation.view.entry.EntryTiara;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class y1 extends SuspendLambda implements Function2 {
    public int a;
    public final ChallengeResult b;
    public final EntryViewModel c;

    public y1(ChallengeResult challengeResult0, EntryViewModel entryViewModel0, Continuation continuation0) {
        this.b = challengeResult0;
        this.c = entryViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new y1(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new y1(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        String s = "";
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(!this.b.getDisplayAgeAuth()) {
                    this.c.showChallengeSuccessDialog(this.b);
                    return Unit.INSTANCE;
                }
                GetShowChallengeAuthUseCase getShowChallengeAuthUseCase0 = this.c.k;
                String s1 = this.c.getBlogName();
                if(s1 == null) {
                    s1 = "";
                }
                Flow flow0 = getShowChallengeAuthUseCase0.invoke(s1, this.b.getChallengeCode());
                this.a = 1;
                object0 = FlowKt.first(flow0, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_16;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
            label_16:
                if(((Boolean)object0).booleanValue()) {
                    this.c.showChallengeSuccessDialog(this.b);
                    return Unit.INSTANCE;
                }
                EntryTiara.INSTANCE.trackPageChallengeAuth();
                SetShowChallengeAuthUseCase setShowChallengeAuthUseCase0 = this.c.l;
                String s2 = this.c.getBlogName();
                if(s2 != null) {
                    s = s2;
                }
                this.a = 2;
                if(setShowChallengeAuthUseCase0.invoke(s, this.b.getChallengeCode(), this) == object1) {
                    return object1;
                }
                this.c.x.sendDialogEvent(new ShowChallengeAuthDialog(this.b));
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
        this.c.x.sendDialogEvent(new ShowChallengeAuthDialog(this.b));
        return Unit.INSTANCE;
    }
}

