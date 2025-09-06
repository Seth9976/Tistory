package com.kakao.tistory.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0006H\u00A6@\u00A2\u0006\u0002\u0010\nJ:\u0010\u000B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0006H\u00A6@\u00A2\u0006\u0002\u0010\nJ:\u0010\u000E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\f0\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0006H\u00A6@\u00A2\u0006\u0002\u0010\nJ:\u0010\u0010\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0006H\u00A6@\u00A2\u0006\u0002\u0010\nJ2\u0010\u0012\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u00A6@\u00A2\u0006\u0002\u0010\u0014J4\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0006H\u00A6@\u00A2\u0006\u0002\u0010\nJ4\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u00192\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u00A6@\u00A2\u0006\u0002\u0010\u001AJ:\u0010\u001B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u00192\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u00A6@\u00A2\u0006\u0002\u0010\u001AJ:\u0010\u001C\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\f0\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u00192\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u00A6@\u00A2\u0006\u0002\u0010\u001AJ:\u0010\u001D\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u00192\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u00A6@\u00A2\u0006\u0002\u0010\u001AJ4\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u00192\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u00A6@\u00A2\u0006\u0002\u0010\u001AJ,\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u000F0\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u00192\u0006\u0010 \u001A\u00020\u0006H\u00A6@\u00A2\u0006\u0002\u0010!\u00A8\u0006\""}, d2 = {"Lcom/kakao/tistory/data/repository/OldStatisticsRepository;", "", "getBlogRefererChannels", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererChannel;", "blogName", "", "date", "granularity", "metric", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlogRefererEtc", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "Lcom/kakao/tistory/data/model/RefererEtcItem;", "getBlogRefererKeywords", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;", "getBlogRefererRanks", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererRankItem;", "getBlogTopPosts", "Lcom/kakao/tistory/data/model/StatisticsItem$TopPostItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlogTrendMore", "Lcom/kakao/tistory/data/model/StatisticsItem$Trend;", "getEntryRefererChannels", "entryId", "", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEntryRefererEtc", "getEntryRefererKeywords", "getEntryRefererRanks", "getEntryTrendMore", "getKeywordInfo", "keyword", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface OldStatisticsRepository {
    @Nullable
    Object getBlogRefererChannels(@NotNull String arg1, @NotNull String arg2, @NotNull String arg3, @NotNull String arg4, @NotNull Continuation arg5);

    @Nullable
    Object getBlogRefererEtc(@NotNull String arg1, @NotNull String arg2, @NotNull String arg3, @NotNull String arg4, @NotNull Continuation arg5);

    @Nullable
    Object getBlogRefererKeywords(@NotNull String arg1, @NotNull String arg2, @NotNull String arg3, @NotNull String arg4, @NotNull Continuation arg5);

    @Nullable
    Object getBlogRefererRanks(@NotNull String arg1, @NotNull String arg2, @NotNull String arg3, @NotNull String arg4, @NotNull Continuation arg5);

    @Nullable
    Object getBlogTopPosts(@NotNull String arg1, @NotNull String arg2, @NotNull String arg3, @NotNull Continuation arg4);

    @Nullable
    Object getBlogTrendMore(@NotNull String arg1, @NotNull String arg2, @NotNull String arg3, @NotNull String arg4, @NotNull Continuation arg5);

    @Nullable
    Object getEntryRefererChannels(@NotNull String arg1, long arg2, @NotNull String arg3, @NotNull String arg4, @NotNull Continuation arg5);

    @Nullable
    Object getEntryRefererEtc(@NotNull String arg1, long arg2, @NotNull String arg3, @NotNull String arg4, @NotNull Continuation arg5);

    @Nullable
    Object getEntryRefererKeywords(@NotNull String arg1, long arg2, @NotNull String arg3, @NotNull String arg4, @NotNull Continuation arg5);

    @Nullable
    Object getEntryRefererRanks(@NotNull String arg1, long arg2, @NotNull String arg3, @NotNull String arg4, @NotNull Continuation arg5);

    @Nullable
    Object getEntryTrendMore(@NotNull String arg1, long arg2, @NotNull String arg3, @NotNull String arg4, @NotNull Continuation arg5);

    @Nullable
    Object getKeywordInfo(@NotNull String arg1, long arg2, @NotNull String arg3, @NotNull Continuation arg4);
}

