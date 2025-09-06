package com.kakao.tistory.presentation.view.comment.entry;

import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.RefreshCommentList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class k extends SuspendLambda implements Function2 {
    public PostCommentViewModel a;
    public long b;
    public int c;
    public final PostCommentViewModel d;
    public final boolean e;
    public final long f;

    public k(PostCommentViewModel postCommentViewModel0, boolean z, long v, Continuation continuation0) {
        this.d = postCommentViewModel0;
        this.e = z;
        this.f = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k(this.d, this.e, this.f, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        long v2;
        PostCommentViewModel postCommentViewModel1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.c) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = this.d.getBlogName();
                if(s != null) {
                    PostCommentViewModel postCommentViewModel0 = this.d;
                    boolean z = this.e;
                    long v = this.f;
                    Long long0 = postCommentViewModel0.getEntryId();
                    if(long0 != null) {
                        long v1 = long0.longValue();
                        if(z) {
                            this.a = postCommentViewModel0;
                            this.b = v;
                            this.c = 1;
                            Object object2 = postCommentViewModel0.J.invoke(s, v1, v, this);
                            if(object2 == object1) {
                                return object1;
                            }
                            postCommentViewModel1 = postCommentViewModel0;
                            object0 = object2;
                        }
                        else {
                            this.a = postCommentViewModel0;
                            this.b = v;
                            this.c = 2;
                            Object object3 = postCommentViewModel0.K.invoke(s, v1, v, this);
                            if(object3 == object1) {
                                return object1;
                            }
                            postCommentViewModel1 = postCommentViewModel0;
                            object0 = object3;
                        }
                        v2 = v;
                        goto label_40;
                    }
                }
                break;
            }
            case 1: {
                v2 = this.b;
                postCommentViewModel1 = this.a;
                ResultKt.throwOnFailure(object0);
                goto label_40;
            }
            case 2: {
                v2 = this.b;
                postCommentViewModel1 = this.a;
                ResultKt.throwOnFailure(object0);
            label_40:
                if(((Result)object0) instanceof Success) {
                    postCommentViewModel1.sendIntent(new RefreshCommentList(Boxing.boxLong(v2), false, 2, null));
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

