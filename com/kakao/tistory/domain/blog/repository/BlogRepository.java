package com.kakao.tistory.domain.blog.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\u00A6@\u00A2\u0006\u0002\u0010\u0007J\u001C\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001A\u00020\u000BH\u00A6@\u00A2\u0006\u0002\u0010\fJ\"\u0010\r\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\u000E0\u00032\u0006\u0010\n\u001A\u00020\u000BH\u00A6@\u00A2\u0006\u0002\u0010\fJ\"\u0010\u0010\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000E0\u00032\u0006\u0010\n\u001A\u00020\u000BH\u00A6@\u00A2\u0006\u0002\u0010\fJ,\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\n\u001A\u00020\u000B2\b\u0010\u0016\u001A\u0004\u0018\u00010\u0014H\u00A6@\u00A2\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u001A0\u0019H\u00A6@\u00A2\u0006\u0002\u0010\u001BJ\"\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001D0\u00132\u0006\u0010\n\u001A\u00020\u000BH\u00A6@\u00A2\u0006\u0002\u0010\fJ\"\u0010\u001E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001D0\u001F0\u00032\u0006\u0010\n\u001A\u00020\u000BH\u00A6@\u00A2\u0006\u0002\u0010\fJ\"\u0010 \u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u000E0\u00032\u0006\u0010\n\u001A\u00020\u000BH\u00A6@\u00A2\u0006\u0002\u0010\fJ\"\u0010\"\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000E0\u00032\u0006\u0010\n\u001A\u00020\u000BH\u00A6@\u00A2\u0006\u0002\u0010\fJ\u001E\u0010$\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00192\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010%\u001A\u00020\u000BH&J\"\u0010&\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\u000E0\u00032\u0006\u0010\n\u001A\u00020\u000BH\u00A6@\u00A2\u0006\u0002\u0010\fJ\u001C\u0010(\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\u00A6@\u00A2\u0006\u0002\u0010\u0007J\u0014\u0010)\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00A6@\u00A2\u0006\u0002\u0010\u001BJ$\u0010*\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010%\u001A\u00020\u000BH\u00A6@\u00A2\u0006\u0002\u0010+\u00A8\u0006,"}, d2 = {"Lcom/kakao/tistory/domain/blog/repository/BlogRepository;", "", "deleteBlockUser", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "targetUserId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlogInfo", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "blogName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "", "Lcom/kakao/tistory/domain/blog/entity/Category;", "getChallenge", "Lcom/kakao/tistory/domain/blog/entity/Challenge;", "getEntryList", "Landroidx/paging/Pager;", "", "Lcom/kakao/tistory/domain/blog/entity/Entry;", "category", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFirstOpen", "Lkotlinx/coroutines/flow/Flow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoticeList", "Lcom/kakao/tistory/domain/blog/entity/Notice;", "getRecentNoticeList", "Lcom/kakao/tistory/domain/common/PagingModel;", "getRefererKeywords", "Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;", "getRefererLog", "Lcom/kakao/tistory/domain/blog/entity/RefererLog;", "getShowChallengeAuth", "challengeCode", "getTrend", "Lcom/kakao/tistory/domain/blog/entity/Trend;", "postBlockUser", "setFirstOpened", "setShowChallengeAuth", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BlogRepository {
    @Nullable
    Object deleteBlockUser(long arg1, @NotNull Continuation arg2);

    @Nullable
    Object getBlogInfo(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getCategories(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getChallenge(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getEntryList(@NotNull String arg1, @Nullable Integer arg2, @NotNull Continuation arg3);

    @Nullable
    Object getFirstOpen(@NotNull Continuation arg1);

    @Nullable
    Object getNoticeList(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getRecentNoticeList(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getRefererKeywords(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getRefererLog(@NotNull String arg1, @NotNull Continuation arg2);

    @NotNull
    Flow getShowChallengeAuth(@NotNull String arg1, @NotNull String arg2);

    @Nullable
    Object getTrend(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object postBlockUser(long arg1, @NotNull Continuation arg2);

    @Nullable
    Object setFirstOpened(@NotNull Continuation arg1);

    @Nullable
    Object setShowChallengeAuth(@NotNull String arg1, @NotNull String arg2, @NotNull Continuation arg3);
}

