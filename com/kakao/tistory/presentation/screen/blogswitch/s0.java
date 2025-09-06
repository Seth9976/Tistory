package com.kakao.tistory.presentation.screen.blogswitch;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchIntent.SwitchBlog;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchIntent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class s0 extends SuspendLambda implements Function2 {
    public final BlogSwitchViewModel a;
    public final BlogSwitchIntent b;

    public s0(BlogSwitchViewModel blogSwitchViewModel0, BlogSwitchIntent blogSwitchIntent0, Continuation continuation0) {
        this.a = blogSwitchViewModel0;
        this.b = blogSwitchIntent0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new s0(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new s0(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Blog blog0 = ((SwitchBlog)this.b).getBlog();
        this.a.f.switchCurrentBlog(blog0);
        return Unit.INSTANCE;
    }
}

