package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.CommentRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J^\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\b\u0010\n\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000B\u001A\u00020\u00062\b\u0010\f\u001A\u0004\u0018\u00010\b2\b\u0010\r\u001A\u0004\u0018\u00010\b2\u0006\u0010\u000F\u001A\u00020\u000E2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0006H\u0086B¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/domain/usecase/PostCommentUseCase;", "", "Lcom/kakao/tistory/domain/repository/CommentRepository;", "commentRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/CommentRepository;)V", "", "blogName", "", "entryId", "password", "content", "parentCommentId", "mentionId", "", "secret", "guestPassword", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "invoke", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PostCommentUseCase {
    public final CommentRepository a;

    @Inject
    public PostCommentUseCase(@NotNull CommentRepository commentRepository0) {
        Intrinsics.checkNotNullParameter(commentRepository0, "commentRepository");
        super();
        this.a = commentRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull String s, long v, @Nullable String s1, @NotNull String s2, @Nullable Long long0, @Nullable Long long1, boolean z, @Nullable String s3, @NotNull Continuation continuation0) {
        return this.a.postComment(s, v, s1, s2, long0, long1, z, s3, continuation0);
    }
}

