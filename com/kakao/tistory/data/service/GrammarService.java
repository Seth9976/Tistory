package com.kakao.tistory.data.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/tistory/data/service/GrammarService;", "", "postGrammarErrors", "Lcom/kakao/tistory/domain/entity/GrammarCheck;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface GrammarService {
    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/grammer-check")
    Object postGrammarErrors(@NotNull @Field("text") String arg1, @NotNull Continuation arg2);
}

