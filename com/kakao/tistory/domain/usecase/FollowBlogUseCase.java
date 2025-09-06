package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.ErrorStatus;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001E\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0086B¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/domain/usecase/FollowBlogUseCase;", "", "Lcom/kakao/tistory/domain/repository/OldBlogRepository;", "blogRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/OldBlogRepository;)V", "", "blogName", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FollowBlogUseCase {
    public final OldBlogRepository a;

    @Inject
    public FollowBlogUseCase(@NotNull OldBlogRepository oldBlogRepository0) {
        Intrinsics.checkNotNullParameter(oldBlogRepository0, "blogRepository");
        super();
        this.a = oldBlogRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull String s, @NotNull Continuation continuation0) {
        e e0;
        if(continuation0 instanceof e) {
            e0 = (e)continuation0;
            int v = e0.c;
            if((v & 0x80000000) == 0) {
                e0 = new e(this, continuation0);
            }
            else {
                e0.c = v ^ 0x80000000;
            }
        }
        else {
            e0 = new e(this, continuation0);
        }
        Object object0 = e0.a;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(e0.c) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                e0.c = 1;
                object0 = this.a.postFollowBlog(s, e0);
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
        return ((Result)object0) instanceof Fail && ((Fail)(((Result)object0))).getErrorModel().getCode() == ErrorStatus.ALREADY_FOLLOW_OR_UNFOLLOW.getCode() ? new Success(Unit.INSTANCE) : ((Result)object0);
    }
}

