package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.GuestbookRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\b\u0010\n\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001A\u00020\u000BH\u0086B¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/domain/usecase/GetGuestbookListUseCase;", "", "Lcom/kakao/tistory/domain/repository/GuestbookRepository;", "guestbookRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/GuestbookRepository;)V", "", "blogName", "listMode", "", "commentId", "", "resultSize", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/common/CommentItemListModel;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetGuestbookListUseCase {
    public final GuestbookRepository a;

    @Inject
    public GetGuestbookListUseCase(@NotNull GuestbookRepository guestbookRepository0) {
        Intrinsics.checkNotNullParameter(guestbookRepository0, "guestbookRepository");
        super();
        this.a = guestbookRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull String s, @NotNull String s1, @Nullable Long long0, int v, @NotNull Continuation continuation0) {
        return this.a.getGuestbookList(s, s1, long0, v, continuation0);
    }

    public static Object invoke$default(GetGuestbookListUseCase getGuestbookListUseCase0, String s, String s1, Long long0, int v, Continuation continuation0, int v1, Object object0) {
        if((v1 & 8) != 0) {
            v = 20;
        }
        return getGuestbookListUseCase0.invoke(s, s1, long0, v, continuation0);
    }
}

