package com.kakao.tistory.data.home.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001E\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J&\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00032\n\b\u0001\u0010\u0005\u001A\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/data/home/api/HomeService;", "", "getCategorySlotList", "Lcom/kakao/tistory/domain/entity/common/ItemModel;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Category;", "categoryGroupId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHomeSlotList", "", "Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface HomeService {
    @Nullable
    @GET("/app/v3/home/category")
    Object getCategorySlotList(@NotNull @Query("categoryGroup") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v3/home")
    Object getHomeSlotList(@Nullable @Query("categoryGroup") String arg1, @NotNull Continuation arg2);
}

