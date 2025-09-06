package com.kakao.tistory.data.service;

import com.kakao.tistory.data.model.IllegalFilmReportContentList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u0007H§@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/data/service/IllegalFilmReportService;", "", "getIllegalFilmReportUrl", "Lcom/kakao/tistory/domain/entity/IllegalFilmReportUrl;", "url", "", "contents", "Lcom/kakao/tistory/data/model/IllegalFilmReportContentList;", "(Ljava/lang/String;Lcom/kakao/tistory/data/model/IllegalFilmReportContentList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface IllegalFilmReportService {
    @Nullable
    @POST
    Object getIllegalFilmReportUrl(@NotNull @Url String arg1, @NotNull @Body IllegalFilmReportContentList arg2, @NotNull Continuation arg3);
}

