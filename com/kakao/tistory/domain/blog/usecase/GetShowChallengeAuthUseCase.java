package com.kakao.tistory.domain.blog.usecase;

import com.kakao.tistory.domain.blog.repository.BlogRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/domain/blog/usecase/GetShowChallengeAuthUseCase;", "", "Lcom/kakao/tistory/domain/blog/repository/BlogRepository;", "blogRepository", "<init>", "(Lcom/kakao/tistory/domain/blog/repository/BlogRepository;)V", "", "blogName", "challengeCode", "Lkotlinx/coroutines/flow/Flow;", "", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetShowChallengeAuthUseCase {
    public final BlogRepository a;

    @Inject
    public GetShowChallengeAuthUseCase(@NotNull BlogRepository blogRepository0) {
        Intrinsics.checkNotNullParameter(blogRepository0, "blogRepository");
        super();
        this.a = blogRepository0;
    }

    @NotNull
    public final Flow invoke(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "challengeCode");
        return this.a.getShowChallengeAuth(s, s1);
    }
}

