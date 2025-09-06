package com.kakao.tistory.data.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000E\u0010\u0002\u001A\u00020\u0003H§@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/data/service/AppInfoService;", "", "getAppInfo", "Lcom/kakao/tistory/domain/entity/appinfo/AppInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface AppInfoService {
    @Nullable
    @GET("/app/v2/info")
    Object getAppInfo(@NotNull Continuation arg1);
}

