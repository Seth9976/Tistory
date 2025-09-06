package com.kakao.tistory.data.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u00062\b\b\u0003\u0010\u0007\u001A\u00020\b2\b\b\u0001\u0010\t\u001A\u00020\b2\b\b\u0003\u0010\n\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\u000BJF\u0010\f\u001A\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001A\u00020\u00062\b\b\u0003\u0010\u0007\u001A\u00020\b2\b\b\u0001\u0010\t\u001A\u00020\b2\b\b\u0001\u0010\u000E\u001A\u00020\u00062\b\b\u0003\u0010\n\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\u000FJ\\\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0011\u001A\u00020\u00062\b\b\u0001\u0010\u0005\u001A\u00020\u00062\b\b\u0003\u0010\u0007\u001A\u00020\b2\b\b\u0001\u0010\t\u001A\u00020\b2\b\b\u0001\u0010\u000E\u001A\u00020\u00062\n\b\u0003\u0010\u0012\u001A\u0004\u0018\u00010\u00062\b\b\u0003\u0010\n\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\u0013J,\u0010\u0014\u001A\u00020\u00152\b\b\u0001\u0010\u0005\u001A\u00020\u00062\b\b\u0003\u0010\u0016\u001A\u00020\b2\b\b\u0003\u0010\n\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/data/service/SearchService;", "", "getBlog", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "Lcom/kakao/tistory/domain/entity/Blog;", "query", "", "perPage", "", "page", "highlight", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPosts", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "sort", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPostsInBlog", "blogName", "target", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSuggestKeyword", "Lcom/kakao/tistory/domain/entity/SearchKeywordList;", "limit", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface SearchService {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object getBlog$default(SearchService searchService0, String s, int v, int v1, String s1, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBlog");
            }
            if((v2 & 2) != 0) {
                v = 30;
            }
            if((v2 & 8) != 0) {
                s1 = "off";
            }
            return searchService0.getBlog(s, v, v1, s1, continuation0);
        }

        public static Object getPosts$default(SearchService searchService0, String s, int v, int v1, String s1, String s2, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPosts");
            }
            if((v2 & 2) != 0) {
                v = 30;
            }
            if((v2 & 16) != 0) {
                s2 = "off";
            }
            return searchService0.getPosts(s, v, v1, s1, s2, continuation0);
        }

        public static Object getPostsInBlog$default(SearchService searchService0, String s, String s1, int v, int v1, String s2, String s3, String s4, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPostsInBlog");
            }
            int v3 = (v2 & 4) == 0 ? v : 30;
            String s5 = (v2 & 0x20) == 0 ? s3 : null;
            return (v2 & 0x40) == 0 ? searchService0.getPostsInBlog(s, s1, v3, v1, s2, s5, s4, continuation0) : searchService0.getPostsInBlog(s, s1, v3, v1, s2, s5, "off", continuation0);
        }

        public static Object getSuggestKeyword$default(SearchService searchService0, String s, int v, String s1, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSuggestKeyword");
            }
            if((v1 & 2) != 0) {
                v = 10;
            }
            if((v1 & 4) != 0) {
                s1 = "off";
            }
            return searchService0.getSuggestKeyword(s, v, s1, continuation0);
        }
    }

    @Nullable
    @GET("/app/v2/search/blog")
    Object getBlog(@NotNull @Query("query") String arg1, @Query("per_page") int arg2, @Query("page") int arg3, @NotNull @Query("highlight") String arg4, @NotNull Continuation arg5);

    @Nullable
    @GET("/app/v2/search/post")
    Object getPosts(@NotNull @Query("query") String arg1, @Query("per_page") int arg2, @Query("page") int arg3, @NotNull @Query("sort") String arg4, @NotNull @Query("highlight") String arg5, @NotNull Continuation arg6);

    @Nullable
    @GET("/app/v2/blog/{blogName}/search/post")
    Object getPostsInBlog(@NotNull @Path("blogName") String arg1, @NotNull @Query("query") String arg2, @Query("per_page") int arg3, @Query("page") int arg4, @NotNull @Query("sort") String arg5, @Nullable @Query("target") String arg6, @NotNull @Query("highlight") String arg7, @NotNull Continuation arg8);

    @Nullable
    @GET("/app/v2/search/suggest")
    Object getSuggestKeyword(@NotNull @Query("query") String arg1, @Query("limit") int arg2, @NotNull @Query("highlight") String arg3, @NotNull Continuation arg4);
}

