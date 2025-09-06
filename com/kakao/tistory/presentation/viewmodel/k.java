package com.kakao.tistory.presentation.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.view.blog.FollowingTiara;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class k extends SuspendLambda implements Function2 {
    public long a;
    public int b;
    public final Blog c;
    public final BlogFollowViewModel d;

    public k(Blog blog0, BlogFollowViewModel blogFollowViewModel0, Continuation continuation0) {
        this.c = blog0;
        this.d = blogFollowViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k(this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new k(this.c, this.d, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        long v3;
        long v2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        long v = 0L;
        switch(this.b) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = this.c.getName();
                if(s == null) {
                    return Unit.INSTANCE;
                }
                Long long0 = (Long)this.d.getUpdatedTotalCount().getValue();
                if(long0 == null) {
                    long0 = (Long)this.d.getBlogFollowingTotalCount().getValue();
                    if(long0 == null) {
                        long0 = Boxing.boxLong(0L);
                    }
                }
                long v1 = long0.longValue();
                if(this.c.isSubscriber()) {
                    FollowingTiara.INSTANCE.trackClickUnFollow();
                    this.a = v1;
                    this.b = 1;
                    object0 = this.d.h.deleteFollowBlog(s, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    v2 = v1;
                    goto label_33;
                }
                else {
                    FollowingTiara.INSTANCE.trackClickFollow();
                    this.a = v1;
                    this.b = 2;
                    object0 = this.d.h.postFollowBlog(s, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    v3 = v1;
                    goto label_49;
                }
                break;
            }
            case 1: {
                v2 = this.a;
                ResultKt.throwOnFailure(object0);
            label_33:
                BlogFollowViewModel blogFollowViewModel0 = this.d;
                Blog blog0 = this.c;
                if(((Result)object0) instanceof Success) {
                    MutableLiveData mutableLiveData0 = blogFollowViewModel0.getUpdatedBlog();
                    Long long1 = blog0.getId();
                    if(long1 != null) {
                        v = (long)long1;
                    }
                    mutableLiveData0.postValue(new Pair(Boxing.boxLong(v), Boxing.boxBoolean(false)));
                    blogFollowViewModel0.getUpdatedTotalCount().setValue(Boxing.boxLong(v2 - 1L));
                    blogFollowViewModel0.k.setValue(new Event(Boxing.boxInt(string.blog_unfollow_toast)));
                    return Unit.INSTANCE;
                }
                if(((Result)object0) instanceof Fail) {
                    blogFollowViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
                    return Unit.INSTANCE;
                }
                break;
            }
            case 2: {
                v3 = this.a;
                ResultKt.throwOnFailure(object0);
            label_49:
                BlogFollowViewModel blogFollowViewModel1 = this.d;
                Blog blog1 = this.c;
                if(((Result)object0) instanceof Success) {
                    MutableLiveData mutableLiveData1 = blogFollowViewModel1.getUpdatedBlog();
                    Long long2 = blog1.getId();
                    if(long2 != null) {
                        v = (long)long2;
                    }
                    mutableLiveData1.postValue(new Pair(Boxing.boxLong(v), Boxing.boxBoolean(true)));
                    blogFollowViewModel1.getUpdatedTotalCount().setValue(Boxing.boxLong(v3 + 1L));
                    blogFollowViewModel1.k.setValue(new Event(Boxing.boxInt(string.blog_follow_toast)));
                    return Unit.INSTANCE;
                }
                if(((Result)object0) instanceof Fail) {
                    blogFollowViewModel1.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
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

