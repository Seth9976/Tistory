package com.kakao.tistory.domain.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J$\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u0006H¦@¢\u0006\u0002\u0010\u000BJ\u0014\u0010\f\u001A\b\u0012\u0004\u0012\u00020\r0\u0003H¦@¢\u0006\u0002\u0010\u000EJ\u0014\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u000EJ,\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/domain/repository/MemberRepository;", "", "checkDuplicateEmail", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkVerifyBlogName", "blogName", "prevRecommendations", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInitRecommendedBlogName", "Lcom/kakao/tistory/domain/entity/common/RecommendedBlogNameInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinTalkChannel", "postMemberJoin", "agreeTalkChannel", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface MemberRepository {
    @Nullable
    Object checkDuplicateEmail(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object checkVerifyBlogName(@NotNull String arg1, @NotNull String arg2, @NotNull Continuation arg3);

    @Nullable
    Object getInitRecommendedBlogName(@NotNull Continuation arg1);

    @Nullable
    Object joinTalkChannel(@NotNull Continuation arg1);

    @Nullable
    Object postMemberJoin(@NotNull String arg1, @NotNull String arg2, boolean arg3, @NotNull Continuation arg4);
}

