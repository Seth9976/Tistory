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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\b\b\u0001\u0010\b\u001A\u00020\u00072\n\b\u0003\u0010\t\u001A\u0004\u0018\u00010\u0005H\u00A7@\u00A2\u0006\u0002\u0010\nJ,\u0010\u000B\u001A\u00020\f2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\b\b\u0001\u0010\b\u001A\u00020\u0007H\u00A7@\u00A2\u0006\u0002\u0010\rJX\u0010\u000E\u001A\u00020\u000F2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\n\b\u0001\u0010\u0010\u001A\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0011\u001A\u00020\u00052\n\b\u0003\u0010\b\u001A\u0004\u0018\u00010\u00072\b\b\u0003\u0010\u0012\u001A\u00020\u00132\b\b\u0003\u0010\u0014\u001A\u00020\u0015H\u00A7@\u00A2\u0006\u0002\u0010\u0016J*\u0010\u0017\u001A\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u0007H\u00A7@\u00A2\u0006\u0002\u0010\u0019J,\u0010\u001A\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\b\b\u0001\u0010\b\u001A\u00020\u0007H\u00A7@\u00A2\u0006\u0002\u0010\rJp\u0010\u001B\u001A\u00020\u001C2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\n\b\u0001\u0010\u0010\u001A\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u001D\u001A\u00020\u00052\n\b\u0001\u0010\u001E\u001A\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u001F\u001A\u0004\u0018\u00010\u00072\b\b\u0001\u0010 \u001A\u00020\u00152\n\b\u0003\u0010\t\u001A\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0014\u001A\u00020\u0015H\u00A7@\u00A2\u0006\u0002\u0010!Jb\u0010\"\u001A\u00020\u001C2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\b\b\u0001\u0010\b\u001A\u00020\u00072\b\b\u0001\u0010\u001D\u001A\u00020\u00052\n\b\u0001\u0010\u001F\u001A\u0004\u0018\u00010\u00072\b\b\u0001\u0010 \u001A\u00020\u00152\n\b\u0003\u0010\t\u001A\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0014\u001A\u00020\u0015H\u00A7@\u00A2\u0006\u0002\u0010#JB\u0010$\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\b\b\u0001\u0010\b\u001A\u00020\u00072\b\b\u0001\u0010%\u001A\u00020\u00052\n\b\u0003\u0010&\u001A\u0004\u0018\u00010\u0005H\u00A7@\u00A2\u0006\u0002\u0010\'J,\u0010(\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\b\b\u0001\u0010\b\u001A\u00020\u0007H\u00A7@\u00A2\u0006\u0002\u0010\r\u00A8\u0006)"}, d2 = {"Lcom/kakao/tistory/data/service/CommentService;", "", "deleteComment", "", "blogName", "", "entryId", "", "commentId", "guestPassword", "(Ljava/lang/String;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getComment", "Lcom/kakao/tistory/domain/entity/PinComment;", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getComments", "Lcom/kakao/tistory/domain/entity/common/CommentItemListModel;", "password", "listMode", "resultSize", "", "useApproval", "", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPinComment", "Lcom/kakao/tistory/domain/entity/common/ItemModel;", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pinComment", "postComment", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "content", "parentCommentId", "mentionId", "secret", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZLjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putComment", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/Long;ZLjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportComment", "reportCode", "reportMessage", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unpinComment", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface CommentService {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object deleteComment$default(CommentService commentService0, String s, long v, long v1, String s1, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteComment");
            }
            return (v2 & 8) == 0 ? commentService0.deleteComment(s, v, v1, s1, continuation0) : commentService0.deleteComment(s, v, v1, null, continuation0);
        }

        public static Object getComments$default(CommentService commentService0, String s, long v, String s1, String s2, Long long0, int v1, boolean z, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getComments");
            }
            Long long1 = (v2 & 16) == 0 ? long0 : null;
            int v3 = (v2 & 0x20) == 0 ? v1 : 20;
            return (v2 & 0x40) == 0 ? commentService0.getComments(s, v, s1, s2, long1, v3, z, continuation0) : commentService0.getComments(s, v, s1, s2, long1, v3, false, continuation0);
        }

        public static Object postComment$default(CommentService commentService0, String s, long v, String s1, String s2, Long long0, Long long1, boolean z, String s3, boolean z1, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postComment");
            }
            String s4 = (v1 & 0x80) == 0 ? s3 : null;
            return (v1 & 0x100) == 0 ? commentService0.postComment(s, v, s1, s2, long0, long1, z, s4, z1, continuation0) : commentService0.postComment(s, v, s1, s2, long0, long1, z, s4, false, continuation0);
        }

        public static Object putComment$default(CommentService commentService0, String s, long v, long v1, String s1, Long long0, boolean z, String s2, boolean z1, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putComment");
            }
            String s3 = (v2 & 0x40) == 0 ? s2 : null;
            return (v2 & 0x80) == 0 ? commentService0.putComment(s, v, v1, s1, long0, z, s3, z1, continuation0) : commentService0.putComment(s, v, v1, s1, long0, z, s3, false, continuation0);
        }

        public static Object reportComment$default(CommentService commentService0, String s, long v, long v1, String s1, String s2, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportComment");
            }
            return (v2 & 16) == 0 ? commentService0.reportComment(s, v, v1, s1, s2, continuation0) : commentService0.reportComment(s, v, v1, s1, null, continuation0);
        }
    }

    @Nullable
    @FormUrlEncoded
    @HTTP(hasBody = true, method = "DELETE", path = "/app/v2/blog/{blogName}/entry/{entryId}/comments/{commentId}")
    Object deleteComment(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @Path("commentId") long arg3, @Nullable @Field("GUEST_PASSWORD") String arg4, @NotNull Continuation arg5);

    @Nullable
    @GET("/app/v2/blog/{blogName}/entry/{entryId}/comment/{commentId}")
    Object getComment(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @Path("commentId") long arg3, @NotNull Continuation arg4);

    @Nullable
    @GET("/app/v2/blog/{blogName}/entry/{entryId}/comments")
    Object getComments(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @Nullable @Query("GUEST_PASSWORD") String arg3, @NotNull @Query("listMode") String arg4, @Nullable @Query("commentId") Long arg5, @Query("resultSize") int arg6, @Query("USE_APPROVAL") boolean arg7, @NotNull Continuation arg8);

    @Nullable
    @GET("app/v2/blog/{blogName}/entry/{entryId}/comments/pin")
    Object getPinComment(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @NotNull Continuation arg3);

    @Nullable
    @PUT("app/v2/blog/{blogName}/entry/{entryId}/comments/pin/{commentId}")
    Object pinComment(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @Path("commentId") long arg3, @NotNull Continuation arg4);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/blog/{blogName}/entry/{entryId}/comments")
    Object postComment(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @Nullable @Query("GUEST_PASSWORD") String arg3, @NotNull @Field("content") String arg4, @Nullable @Field("parent") Long arg5, @Nullable @Field("mentionId") Long arg6, @Field("secret") boolean arg7, @Nullable @Field("GUEST_PASSWORD") String arg8, @Query("USE_APPROVAL") boolean arg9, @NotNull Continuation arg10);

    @Nullable
    @FormUrlEncoded
    @PUT("/app/v2/blog/{blogName}/entry/{entryId}/comments/{commentId}")
    Object putComment(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @Path("commentId") long arg3, @NotNull @Field("content") String arg4, @Nullable @Field("mentionId") Long arg5, @Field("secret") boolean arg6, @Nullable @Field("GUEST_PASSWORD") String arg7, @Query("USE_APPROVAL") boolean arg8, @NotNull Continuation arg9);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/clean/report/comment")
    Object reportComment(@NotNull @Field("blogName") String arg1, @Field("entryId") long arg2, @Field("commentId") long arg3, @NotNull @Field("reasonCode") String arg4, @Nullable @Field("reasonMention") String arg5, @NotNull Continuation arg6);

    @Nullable
    @PUT("app/v2/blog/{blogName}/entry/{entryId}/comments/unpin/{commentId}")
    Object unpinComment(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @Path("commentId") long arg3, @NotNull Continuation arg4);
}

