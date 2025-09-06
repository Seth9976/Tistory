package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.MemberRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0086B¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/domain/usecase/PostMemberJoinUseCase;", "", "Lcom/kakao/tistory/domain/repository/MemberRepository;", "memberRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/MemberRepository;)V", "", "token", "blogName", "", "agreeTalkChannel", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "invoke", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PostMemberJoinUseCase {
    public final MemberRepository a;

    @Inject
    public PostMemberJoinUseCase(@NotNull MemberRepository memberRepository0) {
        Intrinsics.checkNotNullParameter(memberRepository0, "memberRepository");
        super();
        this.a = memberRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull String s, @NotNull String s1, boolean z, @NotNull Continuation continuation0) {
        return this.a.postMemberJoin(s, s1, z, continuation0);
    }
}

