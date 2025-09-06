package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.CommentRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0006H\u0086B¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/domain/usecase/DeleteCommentUseCase;", "", "Lcom/kakao/tistory/domain/repository/CommentRepository;", "commentRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/CommentRepository;)V", "", "blogName", "", "entryId", "commentId", "guestPassword", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "invoke", "(Ljava/lang/String;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DeleteCommentUseCase {
    public final CommentRepository a;

    @Inject
    public DeleteCommentUseCase(@NotNull CommentRepository commentRepository0) {
        Intrinsics.checkNotNullParameter(commentRepository0, "commentRepository");
        super();
        this.a = commentRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull String s, long v, long v1, @Nullable String s1, @NotNull Continuation continuation0) {
        return this.a.deleteComment(s, v, v1, s1, continuation0);
    }
}

