package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.repository.AccountRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\t\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/domain/usecase/GetMyBlogUseCase;", "", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;)V", "", "blogName", "Lcom/kakao/tistory/domain/entity/Blog;", "invoke", "(Ljava/lang/String;)Lcom/kakao/tistory/domain/entity/Blog;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetMyBlogUseCase {
    public final AccountRepository a;

    @Inject
    public GetMyBlogUseCase(@NotNull AccountRepository accountRepository0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        super();
        this.a = accountRepository0;
    }

    @Nullable
    public final Blog invoke(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        return this.a.getMyBlog(s);
    }
}

