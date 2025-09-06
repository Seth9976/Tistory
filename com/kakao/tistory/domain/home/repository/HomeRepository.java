package com.kakao.tistory.domain.home.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\u001A\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0003H¦@¢\u0006\u0002\u0010\u000BJ\u0016\u0010\f\u001A\u00020\r2\u0006\u0010\u0005\u001A\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/domain/home/repository/HomeRepository;", "", "getCategorySlotList", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Category;", "categoryGroupId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHomeSlotList", "", "Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCategoryPreference", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface HomeRepository {
    @Nullable
    Object getCategorySlotList(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getHomeSlotList(@NotNull Continuation arg1);

    @Nullable
    Object setCategoryPreference(@NotNull String arg1, @NotNull Continuation arg2);
}

