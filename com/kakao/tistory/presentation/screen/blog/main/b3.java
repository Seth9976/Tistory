package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.eventbus.BlogFollowEvent;
import com.kakao.tistory.presentation.common.eventbus.ChannelBus;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.ShowToast;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.ChangeFollow;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.ShowErrorDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class b3 extends SuspendLambda implements Function2 {
    public int a;
    public final BlogMainViewModel b;
    public final String c;

    public b3(BlogMainViewModel blogMainViewModel0, String s, Continuation continuation0) {
        this.b = blogMainViewModel0;
        this.c = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b3(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new b3(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.k.invoke(this.c, this);
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
        String s = this.c;
        BlogMainViewModel blogMainViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            BlogFollowEvent blogFollowEvent0 = new BlogFollowEvent(s, false);
            ChannelBus.INSTANCE.send(blogFollowEvent0);
            blogMainViewModel0.sendEvent(new ShowToast(null, Boxing.boxInt(string.blog_unfollow_toast), 1, null));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            blogMainViewModel0.sendIntent(new ShowErrorDialog(((Fail)(((Result)object0))).getErrorModel()));
            blogMainViewModel0.sendIntent(new ChangeFollow(true));
        }
        return Unit.INSTANCE;
    }
}

