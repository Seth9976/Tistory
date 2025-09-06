package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.kakao.tistory.domain.entity.Account;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class w extends SuspendLambda implements Function2 {
    public int a;
    public final DefaultBlogViewModel b;

    public w(DefaultBlogViewModel defaultBlogViewModel0, Continuation continuation0) {
        this.b = defaultBlogViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new w(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new w(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.g.syncUserProfile(this);
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
        DefaultBlogViewModel defaultBlogViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            User user0 = ((Account)((Success)(((Result)object0))).getData()).getUser();
            if(user0 != null) {
                defaultBlogViewModel0.getOwnerBlogs().clear();
                SnapshotStateList snapshotStateList0 = defaultBlogViewModel0.getOwnerBlogs();
                List list0 = DefaultBlogViewModel.access$getSortedOwnerBlogList(defaultBlogViewModel0, user0);
                if(list0 == null) {
                    list0 = CollectionsKt__CollectionsKt.emptyList();
                }
                snapshotStateList0.addAll(list0);
                defaultBlogViewModel0.getJoinedBlogs().clear();
                SnapshotStateList snapshotStateList1 = defaultBlogViewModel0.getJoinedBlogs();
                List list1 = user0.getJoinedBlogs();
                if(list1 == null) {
                    list1 = CollectionsKt__CollectionsKt.emptyList();
                }
                snapshotStateList1.addAll(list1);
            }
        }
        return Unit.INSTANCE;
    }
}

