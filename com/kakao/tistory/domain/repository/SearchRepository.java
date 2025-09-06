package com.kakao.tistory.domain.repository;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001A\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u0010H&J\b\u0010\u0011\u001A\u00020\fH&J\u000E\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00140\u0013H&J6\u0010\u0015\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u0006\u0010\u0019\u001A\u00020\u000E2\b\b\u0002\u0010\u001A\u001A\u00020\u00102\b\b\u0002\u0010\u001B\u001A\u00020\u0010H¦@¢\u0006\u0002\u0010\u001CJJ\u0010\u001D\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001E0\u00170\u00162\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0019\u001A\u00020\u000E2\b\b\u0002\u0010\u001A\u001A\u00020\u00102\b\b\u0002\u0010\u001B\u001A\u00020\u00102\u0006\u0010 \u001A\u00020\u000EH¦@¢\u0006\u0002\u0010!JF\u0010\"\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001E0\u00170\u00162\u0006\u0010\u001F\u001A\u00020\u000E2\u0006\u0010\u0019\u001A\u00020\u000E2\b\b\u0002\u0010\u001A\u001A\u00020\u00102\b\b\u0002\u0010\u001B\u001A\u00020\u00102\u0006\u0010 \u001A\u00020\u000EH¦@¢\u0006\u0002\u0010!J\u001E\u0010#\u001A\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010$\u001A\u00020\u0010H&J&\u0010%\u001A\b\u0012\u0004\u0012\u00020&0\u00162\u0006\u0010\u0019\u001A\u00020\u000E2\b\b\u0002\u0010$\u001A\u00020\u0010H¦@¢\u0006\u0002\u0010\'J\u0010\u0010(\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH&R\u0018\u0010\u0002\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006)"}, d2 = {"Lcom/kakao/tistory/domain/repository/SearchRepository;", "", "recentKeywordEnabled", "", "getRecentKeywordEnabled", "()Z", "setRecentKeywordEnabled", "(Z)V", "recommendKeywordEnabled", "getRecommendKeywordEnabled", "setRecommendKeywordEnabled", "addRecentSearch", "", "keyword", "", "maxSavingCount", "", "clearRecentSearch", "getAllRecentSearch", "", "Lcom/kakao/tistory/domain/entity/SearchKeywordItem;", "getBlog", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "Lcom/kakao/tistory/domain/entity/Blog;", "query", "perPage", "page", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPosts", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "blogName", "sort", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPostsFromTags", "getRecentSearch", "limit", "getSuggestKeyword", "Lcom/kakao/tistory/domain/entity/SearchKeywordList;", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeRecentSearch", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface SearchRepository {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void addRecentSearch$default(SearchRepository searchRepository0, String s, int v, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRecentSearch");
            }
            if((v1 & 2) != 0) {
                v = 30;
            }
            searchRepository0.addRecentSearch(s, v);
        }

        public static Object getBlog$default(SearchRepository searchRepository0, String s, int v, int v1, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBlog");
            }
            if((v2 & 2) != 0) {
                v = 30;
            }
            if((v2 & 4) != 0) {
                v1 = 1;
            }
            return searchRepository0.getBlog(s, v, v1, continuation0);
        }

        public static Object getPosts$default(SearchRepository searchRepository0, String s, String s1, int v, int v1, String s2, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPosts");
            }
            if((v2 & 1) != 0) {
                s = null;
            }
            if((v2 & 4) != 0) {
                v = 30;
            }
            if((v2 & 8) != 0) {
                v1 = 1;
            }
            return searchRepository0.getPosts(s, s1, v, v1, s2, continuation0);
        }

        public static Object getPostsFromTags$default(SearchRepository searchRepository0, String s, String s1, int v, int v1, String s2, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPostsFromTags");
            }
            if((v2 & 4) != 0) {
                v = 30;
            }
            if((v2 & 8) != 0) {
                v1 = 1;
            }
            return searchRepository0.getPostsFromTags(s, s1, v, v1, s2, continuation0);
        }

        public static Object getSuggestKeyword$default(SearchRepository searchRepository0, String s, int v, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSuggestKeyword");
            }
            if((v1 & 2) != 0) {
                v = 10;
            }
            return searchRepository0.getSuggestKeyword(s, v, continuation0);
        }
    }

    void addRecentSearch(@NotNull String arg1, int arg2);

    void clearRecentSearch();

    @NotNull
    List getAllRecentSearch();

    @Nullable
    Object getBlog(@NotNull String arg1, int arg2, int arg3, @NotNull Continuation arg4);

    @Nullable
    Object getPosts(@Nullable String arg1, @NotNull String arg2, int arg3, int arg4, @NotNull String arg5, @NotNull Continuation arg6);

    @Nullable
    Object getPostsFromTags(@NotNull String arg1, @NotNull String arg2, int arg3, int arg4, @NotNull String arg5, @NotNull Continuation arg6);

    boolean getRecentKeywordEnabled();

    @NotNull
    List getRecentSearch(@NotNull String arg1, int arg2);

    boolean getRecommendKeywordEnabled();

    @Nullable
    Object getSuggestKeyword(@NotNull String arg1, int arg2, @NotNull Continuation arg3);

    void removeRecentSearch(@NotNull String arg1);

    void setRecentKeywordEnabled(boolean arg1);

    void setRecommendKeywordEnabled(boolean arg1);
}

