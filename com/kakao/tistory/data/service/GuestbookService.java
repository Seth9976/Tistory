package com.kakao.tistory.data.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\n\b\u0003\u0010\b\u001A\u0004\u0018\u00010\u0005H\u00A7@\u00A2\u0006\u0002\u0010\tJ \u0010\n\u001A\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000B2\b\b\u0001\u0010\u0004\u001A\u00020\u0005H\u00A7@\u00A2\u0006\u0002\u0010\rJB\u0010\u000E\u001A\u00020\u000F2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0010\u001A\u00020\u00052\n\b\u0003\u0010\u0006\u001A\u0004\u0018\u00010\u00072\b\b\u0003\u0010\u0011\u001A\u00020\u00122\b\b\u0003\u0010\u0013\u001A\u00020\u0014H\u00A7@\u00A2\u0006\u0002\u0010\u0015J \u0010\u0016\u001A\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000B2\b\b\u0001\u0010\u0004\u001A\u00020\u0005H\u00A7@\u00A2\u0006\u0002\u0010\rJ\"\u0010\u0017\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u0007H\u00A7@\u00A2\u0006\u0002\u0010\u0018JN\u0010\u0019\u001A\u00020\u001A2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u001B\u001A\u00020\u00052\n\b\u0001\u0010\u001C\u001A\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u001D\u001A\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u001E\u001A\u00020\u00142\b\b\u0003\u0010\u0013\u001A\u00020\u0014H\u00A7@\u00A2\u0006\u0002\u0010\u001FJL\u0010 \u001A\u00020\u001A2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\b\b\u0001\u0010\u001B\u001A\u00020\u00052\n\b\u0001\u0010\u001D\u001A\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u001E\u001A\u00020\u00142\b\b\u0003\u0010\u0013\u001A\u00020\u0014H\u00A7@\u00A2\u0006\u0002\u0010!J8\u0010\"\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010#\u001A\u00020\u00052\n\b\u0001\u0010$\u001A\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u0007H\u00A7@\u00A2\u0006\u0002\u0010%J\"\u0010&\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u0007H\u00A7@\u00A2\u0006\u0002\u0010\u0018\u00A8\u0006\'"}, d2 = {"Lcom/kakao/tistory/data/service/GuestbookService;", "", "deleteGuestbook", "", "blogName", "", "commentId", "", "guestPassword", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGuestBookPinComment", "Lcom/kakao/tistory/domain/entity/common/ItemModel;", "Lcom/kakao/tistory/domain/entity/PinComment;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGuestbookList", "Lcom/kakao/tistory/domain/entity/common/CommentItemListModel;", "listMode", "resultSize", "", "useApproval", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPinGuestbook", "pinGuestBookComment", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postGuestbook", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "content", "parentCommentId", "mentionId", "secret", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putGuestbook", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Long;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportGuestbook", "reasonCode", "reasonMention", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unpinGuestBookComment", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface GuestbookService {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object deleteGuestbook$default(GuestbookService guestbookService0, String s, long v, String s1, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteGuestbook");
            }
            if((v1 & 4) != 0) {
                s1 = null;
            }
            return guestbookService0.deleteGuestbook(s, v, s1, continuation0);
        }

        public static Object getGuestbookList$default(GuestbookService guestbookService0, String s, String s1, Long long0, int v, boolean z, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGuestbookList");
            }
            if((v1 & 4) != 0) {
                long0 = null;
            }
            if((v1 & 8) != 0) {
                v = 20;
            }
            if((v1 & 16) != 0) {
                z = false;
            }
            return guestbookService0.getGuestbookList(s, s1, long0, v, z, continuation0);
        }

        public static Object postGuestbook$default(GuestbookService guestbookService0, String s, String s1, Long long0, Long long1, boolean z, boolean z1, Continuation continuation0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postGuestbook");
            }
            return (v & 0x20) == 0 ? guestbookService0.postGuestbook(s, s1, long0, long1, z, z1, continuation0) : guestbookService0.postGuestbook(s, s1, long0, long1, z, false, continuation0);
        }

        public static Object putGuestbook$default(GuestbookService guestbookService0, String s, long v, String s1, Long long0, boolean z, boolean z1, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putGuestbook");
            }
            return (v1 & 0x20) == 0 ? guestbookService0.putGuestbook(s, v, s1, long0, z, z1, continuation0) : guestbookService0.putGuestbook(s, v, s1, long0, z, false, continuation0);
        }
    }

    @Nullable
    @FormUrlEncoded
    @HTTP(hasBody = true, method = "DELETE", path = "/app/v2/blog/{blogName}/guestbook/comments/{commentId}")
    Object deleteGuestbook(@NotNull @Path("blogName") String arg1, @Path("commentId") long arg2, @Nullable @Field("GUEST_PASSWORD") String arg3, @NotNull Continuation arg4);

    @Nullable
    @GET("app/v2/blog/{blogName}/guestbook/comments/pin")
    Object getGuestBookPinComment(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v2/blog/{blogName}/guestbook/comments")
    Object getGuestbookList(@NotNull @Path("blogName") String arg1, @NotNull @Query("listMode") String arg2, @Nullable @Query("commentId") Long arg3, @Query("resultSize") int arg4, @Query("USE_APPROVAL") boolean arg5, @NotNull Continuation arg6);

    @Nullable
    @GET("/app/v2/blog/{blogName}/guestbook/comments/pin")
    Object getPinGuestbook(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @PUT("app/v2/blog/{blogName}/guestbook/comments/pin/{commentId}")
    Object pinGuestBookComment(@NotNull @Path("blogName") String arg1, @Path("commentId") long arg2, @NotNull Continuation arg3);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/blog/{blogName}/guestbook/comments")
    Object postGuestbook(@NotNull @Path("blogName") String arg1, @NotNull @Field("content") String arg2, @Nullable @Field("parent") Long arg3, @Nullable @Field("mentionId") Long arg4, @Field("secret") boolean arg5, @Query("USE_APPROVAL") boolean arg6, @NotNull Continuation arg7);

    @Nullable
    @FormUrlEncoded
    @PUT("/app/v2/blog/{blogName}/guestbook/comments/{commentId}")
    Object putGuestbook(@NotNull @Path("blogName") String arg1, @Path("commentId") long arg2, @NotNull @Field("content") String arg3, @Nullable @Field("mentionId") Long arg4, @Field("secret") boolean arg5, @Query("USE_APPROVAL") boolean arg6, @NotNull Continuation arg7);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/clean/report/guestbookComment")
    Object reportGuestbook(@NotNull @Field("blogName") String arg1, @NotNull @Field("reasonCode") String arg2, @Nullable @Field("reasonMention") String arg3, @Field("commentId") long arg4, @NotNull Continuation arg5);

    @Nullable
    @PUT("app/v2/blog/{blogName}/guestbook/comments/unpin/{commentId}")
    Object unpinGuestBookComment(@NotNull @Path("blogName") String arg1, @Path("commentId") long arg2, @NotNull Continuation arg3);
}

