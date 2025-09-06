package com.kakao.tistory.data.repository;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\r\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000F0\u000E2\u0006\u0010\u0011\u001A\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J\u001C\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00150\u000E2\u0006\u0010\u0011\u001A\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J(\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00040\u000E2\u0006\u0010\u0011\u001A\u00020\u00122\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u0012H¦@¢\u0006\u0002\u0010\u0018J\u001C\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u001A0\u000E2\u0006\u0010\u0011\u001A\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J&\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u000E2\u0006\u0010\u0011\u001A\u00020\u00122\b\u0010\u0017\u001A\u0004\u0018\u00010\u0012H¦@¢\u0006\u0002\u0010\u0018J\u001C\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u000E2\u0006\u0010\u0011\u001A\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J\u001C\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\u000E2\u0006\u0010\u0011\u001A\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J\u001C\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u000B0\u000E2\u0006\u0010\u0011\u001A\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J\u001C\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u001D0\u000E2\u0006\u0010\u0011\u001A\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u001A\u0010\u0007\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u000B0\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\u0006¨\u0006\u001E"}, d2 = {"Lcom/kakao/tistory/data/repository/DashboardRepository;", "", "refererLog", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererLog;", "getRefererLog", "()Landroidx/lifecycle/MutableLiveData;", "topMessage", "Lcom/kakao/tistory/data/model/HomeItem$TopMessage;", "getTopMessage", "topPost", "Lcom/kakao/tistory/data/model/HomeItem$TopPost;", "getTopPost", "getBlogFollowers", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "Lcom/kakao/tistory/domain/entity/User;", "blogName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecentPosts", "Lcom/kakao/tistory/data/model/HomeItem$RecentPost;", "getRefLog", "sortItem", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRefererKeywords", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeyword;", "getTopPosts", "getTrend", "Lcom/kakao/tistory/data/model/StatisticsItem$Trend;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface DashboardRepository {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object getRefLog$default(DashboardRepository dashboardRepository0, String s, String s1, Continuation continuation0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRefLog");
            }
            if((v & 2) != 0) {
                s1 = null;
            }
            return dashboardRepository0.getRefLog(s, s1, continuation0);
        }
    }

    @Nullable
    Object getBlogFollowers(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getRecentPosts(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getRefLog(@NotNull String arg1, @Nullable String arg2, @NotNull Continuation arg3);

    @Nullable
    Object getRefererKeywords(@NotNull String arg1, @NotNull Continuation arg2);

    @NotNull
    MutableLiveData getRefererLog();

    @Nullable
    Object getRefererLog(@NotNull String arg1, @Nullable String arg2, @NotNull Continuation arg3);

    @NotNull
    MutableLiveData getTopMessage();

    @Nullable
    Object getTopMessage(@NotNull String arg1, @NotNull Continuation arg2);

    @NotNull
    MutableLiveData getTopPost();

    @Nullable
    Object getTopPost(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getTopPosts(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getTrend(@NotNull String arg1, @NotNull Continuation arg2);
}

