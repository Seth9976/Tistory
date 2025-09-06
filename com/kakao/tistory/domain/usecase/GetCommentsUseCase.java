package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.CommentRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JJ\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\b\u0010\n\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000B\u001A\u00020\u00062\b\u0010\f\u001A\u0004\u0018\u00010\b2\u0006\u0010\u000E\u001A\u00020\rH\u0086B¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/domain/usecase/GetCommentsUseCase;", "", "Lcom/kakao/tistory/domain/repository/CommentRepository;", "commentRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/CommentRepository;)V", "", "blogName", "", "entryId", "password", "listMode", "commentId", "", "resultSize", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/common/CommentItemListModel;", "invoke", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetCommentsUseCase {
    public final CommentRepository a;

    @Inject
    public GetCommentsUseCase(@NotNull CommentRepository commentRepository0) {
        Intrinsics.checkNotNullParameter(commentRepository0, "commentRepository");
        super();
        this.a = commentRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull String s, long v, @Nullable String s1, @NotNull String s2, @Nullable Long long0, int v1, @NotNull Continuation continuation0) {
        return this.a.getComments(s, v, s1, s2, long0, v1, continuation0);
    }
}

