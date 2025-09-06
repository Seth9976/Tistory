package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class x extends SuspendLambda implements Function2 {
    public DefaultBlogViewModel a;
    public Blog b;
    public int c;
    public final Blog d;
    public final DefaultBlogViewModel e;

    public x(Blog blog0, DefaultBlogViewModel defaultBlogViewModel0, Continuation continuation0) {
        this.d = blog0;
        this.e = defaultBlogViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new x(this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new x(this.d, this.e, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Blog blog1;
        DefaultBlogViewModel defaultBlogViewModel0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.c) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Long long0 = this.d.getId();
                if(long0 != null) {
                    defaultBlogViewModel0 = this.e;
                    Blog blog0 = this.d;
                    this.a = defaultBlogViewModel0;
                    this.b = blog0;
                    this.c = 1;
                    object0 = defaultBlogViewModel0.g.changeDefaultBlog(long0.longValue(), this);
                    if(object0 == object1) {
                        return object1;
                    }
                    blog1 = blog0;
                    goto label_19;
                }
                break;
            }
            case 1: {
                blog1 = this.b;
                defaultBlogViewModel0 = this.a;
                ResultKt.throwOnFailure(object0);
            label_19:
                if(((Result)object0) instanceof Success) {
                    if(defaultBlogViewModel0.getOwnerBlogs().remove(blog1)) {
                        defaultBlogViewModel0.getOwnerBlogs().add(0, blog1);
                        return Unit.INSTANCE;
                    }
                }
                else if(((Result)object0) instanceof Fail) {
                    defaultBlogViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

