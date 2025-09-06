package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.OldBlogRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\b\u0010\t\u001A\u0004\u0018\u00010\u0006H\u0086B¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/domain/usecase/ReportBlogUseCase;", "", "Lcom/kakao/tistory/domain/repository/OldBlogRepository;", "oldBlogRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/OldBlogRepository;)V", "", "blogName", "reportCode", "reportMessage", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ReportBlogUseCase {
    public final OldBlogRepository a;

    @Inject
    public ReportBlogUseCase(@NotNull OldBlogRepository oldBlogRepository0) {
        Intrinsics.checkNotNullParameter(oldBlogRepository0, "oldBlogRepository");
        super();
        this.a = oldBlogRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull String s, @NotNull String s1, @Nullable String s2, @NotNull Continuation continuation0) {
        return this.a.reportBlog(s, s1, s2, continuation0);
    }
}

