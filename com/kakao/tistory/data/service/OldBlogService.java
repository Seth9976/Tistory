package com.kakao.tistory.data.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u0005H\u00A7@\u00A2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001A\u00020\b2\b\b\u0001\u0010\t\u001A\u00020\nH\u00A7@\u00A2\u0006\u0002\u0010\u000BJ\u0018\u0010\f\u001A\u00020\u00032\b\b\u0001\u0010\t\u001A\u00020\nH\u00A7@\u00A2\u0006\u0002\u0010\u000BJ\u0018\u0010\r\u001A\u00020\b2\b\b\u0001\u0010\t\u001A\u00020\nH\u00A7@\u00A2\u0006\u0002\u0010\u000BJ>\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2\b\b\u0001\u0010\t\u001A\u00020\n2\b\b\u0003\u0010\u0011\u001A\u00020\u00122\n\b\u0003\u0010\u0013\u001A\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0014\u001A\u00020\u0012H\u00A7@\u00A2\u0006\u0002\u0010\u0015J4\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\b0\u000F2\b\b\u0003\u0010\u0011\u001A\u00020\u00122\n\b\u0001\u0010\u0013\u001A\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0014\u001A\u00020\u0012H\u00A7@\u00A2\u0006\u0002\u0010\u0017J\u001E\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00190\u000F2\b\b\u0001\u0010\t\u001A\u00020\nH\u00A7@\u00A2\u0006\u0002\u0010\u000BJ2\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u001C0\u001B2\b\b\u0001\u0010\t\u001A\u00020\n2\b\b\u0001\u0010\u0011\u001A\u00020\u00122\b\b\u0003\u0010\u0014\u001A\u00020\u0012H\u00A7@\u00A2\u0006\u0002\u0010\u001DJ<\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u001C0\u001B2\b\b\u0001\u0010\t\u001A\u00020\n2\b\b\u0003\u0010\u001F\u001A\u00020\u00122\b\b\u0003\u0010 \u001A\u00020\u00122\b\b\u0003\u0010\u0014\u001A\u00020\u0012H\u00A7@\u00A2\u0006\u0002\u0010!J\u0018\u0010\"\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u0005H\u00A7@\u00A2\u0006\u0002\u0010\u0006J8\u0010#\u001A\u00020\b2\b\b\u0001\u0010\t\u001A\u00020\n2\b\b\u0001\u0010$\u001A\u00020\n2\n\b\u0001\u0010%\u001A\u0004\u0018\u00010\n2\b\b\u0001\u0010&\u001A\u00020\nH\u00A7@\u00A2\u0006\u0002\u0010\'JD\u0010#\u001A\u00020\b2\b\b\u0001\u0010\t\u001A\u00020\n2\b\b\u0001\u0010$\u001A\u00020\n2\n\b\u0001\u0010%\u001A\u0004\u0018\u00010\n2\b\b\u0001\u0010&\u001A\u00020\n2\n\b\u0001\u0010(\u001A\u0004\u0018\u00010)H\u00A7@\u00A2\u0006\u0002\u0010*J.\u0010+\u001A\u00020\u00032\b\b\u0001\u0010\t\u001A\u00020\n2\b\b\u0001\u0010,\u001A\u00020\n2\n\b\u0001\u0010-\u001A\u0004\u0018\u00010\nH\u00A7@\u00A2\u0006\u0002\u0010.J\u0018\u0010/\u001A\u00020\u00032\b\b\u0001\u0010\t\u001A\u00020\nH\u00A7@\u00A2\u0006\u0002\u0010\u000B\u00A8\u00060"}, d2 = {"Lcom/kakao/tistory/data/service/OldBlogService;", "", "deleteBlockUser", "", "targetUserId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBlogLogoImage", "Lcom/kakao/tistory/domain/entity/Blog;", "blogName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFollowBlog", "getBlog", "getBlogFollowers", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "Lcom/kakao/tistory/domain/entity/User;", "nextPage", "", "sortType", "resultSize", "(Ljava/lang/String;ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlogFollowings", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "Lcom/kakao/tistory/domain/entity/CategoryItem;", "getNotices", "Lcom/kakao/tistory/domain/entity/common/EntryItemListModel;", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPosts", "category", "currentPage", "(Ljava/lang/String;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postBlockUser", "postBlog", "title", "description", "nickName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logo", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postBlogReport", "reportCode", "reportMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postFollowBlog", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface OldBlogService {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object getBlogFollowers$default(OldBlogService oldBlogService0, String s, int v, String s1, int v1, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBlogFollowers");
            }
            if((v2 & 2) != 0) {
                v = 1;
            }
            if((v2 & 4) != 0) {
                s1 = null;
            }
            if((v2 & 8) != 0) {
                v1 = 20;
            }
            return oldBlogService0.getBlogFollowers(s, v, s1, v1, continuation0);
        }

        public static Object getBlogFollowings$default(OldBlogService oldBlogService0, int v, String s, int v1, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBlogFollowings");
            }
            if((v2 & 1) != 0) {
                v = 1;
            }
            if((v2 & 4) != 0) {
                v1 = 20;
            }
            return oldBlogService0.getBlogFollowings(v, s, v1, continuation0);
        }

        public static Object getNotices$default(OldBlogService oldBlogService0, String s, int v, int v1, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNotices");
            }
            if((v2 & 4) != 0) {
                v1 = 20;
            }
            return oldBlogService0.getNotices(s, v, v1, continuation0);
        }

        public static Object getPosts$default(OldBlogService oldBlogService0, String s, int v, int v1, int v2, Continuation continuation0, int v3, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPosts");
            }
            if((v3 & 2) != 0) {
                v = -3;
            }
            if((v3 & 4) != 0) {
                v1 = 1;
            }
            if((v3 & 8) != 0) {
                v2 = 20;
            }
            return oldBlogService0.getPosts(s, v, v1, v2, continuation0);
        }
    }

    @Nullable
    @DELETE("/app/v2/unblock/{targetUserId}")
    Object deleteBlockUser(@Path("targetUserId") long arg1, @NotNull Continuation arg2);

    @Nullable
    @DELETE("/app/v2/blog/{blogName}/logo")
    Object deleteBlogLogoImage(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @FormUrlEncoded
    @HTTP(hasBody = true, method = "DELETE", path = "/app/v2/feed/blog")
    Object deleteFollowBlog(@NotNull @Field("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v2/blog/{blogName}/info")
    Object getBlog(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v2/feed/blog/{blogName}/blogFollowers")
    Object getBlogFollowers(@NotNull @Path("blogName") String arg1, @Query("page") int arg2, @Nullable @Query("sortType") String arg3, @Query("resultSize") int arg4, @NotNull Continuation arg5);

    @Nullable
    @GET("/app/v2/feed/followings")
    Object getBlogFollowings(@Query("page") int arg1, @Nullable @Query("sortType") String arg2, @Query("resultSize") int arg3, @NotNull Continuation arg4);

    @Nullable
    @GET("/app/v2/blog/{blogName}/categories/selection")
    Object getCategories(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v2/blog/{blogName}/notices")
    Object getNotices(@NotNull @Path("blogName") String arg1, @Query("page") int arg2, @Query("resultSize") int arg3, @NotNull Continuation arg4);

    @Nullable
    @GET("/app/v2/blog/{blogName}/posts")
    Object getPosts(@NotNull @Path("blogName") String arg1, @Query("category") int arg2, @Query("page") int arg3, @Query("resultSize") int arg4, @NotNull Continuation arg5);

    @Nullable
    @POST("/app/v2/block/{targetUserId}")
    Object postBlockUser(@Path("targetUserId") long arg1, @NotNull Continuation arg2);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/blog/{blogName}/info")
    Object postBlog(@NotNull @Path("blogName") String arg1, @NotNull @Field("title") String arg2, @Nullable @Field("description") String arg3, @NotNull @Field("nickname") String arg4, @NotNull Continuation arg5);

    @Nullable
    @Multipart
    @POST("/app/v2/blog/{blogName}/info")
    Object postBlog(@NotNull @Path("blogName") String arg1, @NotNull @Query("title") String arg2, @Nullable @Query("description") String arg3, @NotNull @Query("nickname") String arg4, @Nullable @Part okhttp3.MultipartBody.Part arg5, @NotNull Continuation arg6);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/blog/{blogName}/report/user")
    Object postBlogReport(@NotNull @Path("blogName") String arg1, @NotNull @Field("reasonCode") String arg2, @Nullable @Field("reasonMention") String arg3, @NotNull Continuation arg4);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/feed/blog")
    Object postFollowBlog(@NotNull @Field("blogName") String arg1, @NotNull Continuation arg2);
}

