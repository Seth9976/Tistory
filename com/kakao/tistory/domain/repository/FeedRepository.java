package com.kakao.tistory.domain.repository;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001C\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\u0006\u0010\f\u001A\u00020\rH¦@¢\u0006\u0002\u0010\u000EJ\u0014\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH¦@¢\u0006\u0002\u0010\u0010J>\u0010\u0011\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\n2\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0017H¦@¢\u0006\u0002\u0010\u0018R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/domain/repository/FeedRepository;", "", "followerCount", "Landroidx/lifecycle/MutableLiveData;", "", "getFollowerCount", "()Landroidx/lifecycle/MutableLiveData;", "followingCount", "getFollowingCount", "getBlogFollowerCount", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/common/Count;", "blogName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlogFollowingCount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeed", "Lcom/kakao/tistory/domain/entity/common/EntryItemListModel;", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "fromDateTime", "toDateTime", "pivot", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface FeedRepository {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object getFeed$default(FeedRepository feedRepository0, String s, String s1, Integer integer0, Continuation continuation0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeed");
            }
            if((v & 1) != 0) {
                s = null;
            }
            if((v & 2) != 0) {
                s1 = null;
            }
            if((v & 4) != 0) {
                integer0 = null;
            }
            return feedRepository0.getFeed(s, s1, integer0, continuation0);
        }
    }

    @Nullable
    Object getBlogFollowerCount(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getBlogFollowingCount(@NotNull Continuation arg1);

    @Nullable
    Object getFeed(@Nullable String arg1, @Nullable String arg2, @Nullable Integer arg3, @NotNull Continuation arg4);

    @NotNull
    MutableLiveData getFollowerCount();

    @NotNull
    MutableLiveData getFollowingCount();
}

