package com.kakao.tistory.domain.home.usecase;

import com.kakao.tistory.domain.home.repository.HomeRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001C\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086B¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/domain/home/usecase/GetHomeSlotListUseCase;", "", "Lcom/kakao/tistory/domain/home/repository/HomeRepository;", "homeRepository", "<init>", "(Lcom/kakao/tistory/domain/home/repository/HomeRepository;)V", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetHomeSlotListUseCase {
    public final HomeRepository a;

    @Inject
    public GetHomeSlotListUseCase(@NotNull HomeRepository homeRepository0) {
        Intrinsics.checkNotNullParameter(homeRepository0, "homeRepository");
        super();
        this.a = homeRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull Continuation continuation0) {
        return this.a.getHomeSlotList(continuation0);
    }
}

