package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.repository.AccountRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/domain/usecase/GetCurrentBlogTitleUseCase;", "", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;)V", "", "invoke", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetCurrentBlogTitleUseCase {
    public final AccountRepository a;

    @Inject
    public GetCurrentBlogTitleUseCase(@NotNull AccountRepository accountRepository0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        super();
        this.a = accountRepository0;
    }

    @Nullable
    public final String invoke() {
        Blog blog0 = (Blog)this.a.getOldCurrentBlog().getValue();
        return blog0 == null ? null : blog0.getTitle();
    }
}

