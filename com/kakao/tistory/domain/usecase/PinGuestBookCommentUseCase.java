package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.GuestbookRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0086B¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/domain/usecase/PinGuestBookCommentUseCase;", "", "Lcom/kakao/tistory/domain/repository/GuestbookRepository;", "guestbookRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/GuestbookRepository;)V", "", "blogName", "", "commentId", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "invoke", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PinGuestBookCommentUseCase {
    public final GuestbookRepository a;

    @Inject
    public PinGuestBookCommentUseCase(@NotNull GuestbookRepository guestbookRepository0) {
        Intrinsics.checkNotNullParameter(guestbookRepository0, "guestbookRepository");
        super();
        this.a = guestbookRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull String s, long v, @NotNull Continuation continuation0) {
        return this.a.pinGuestBookComment(s, v, continuation0);
    }
}

