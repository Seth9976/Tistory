package com.kakao.tistory.domain.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b2\b\u0010\n\u001A\u0004\u0018\u00010\u0006H\u00A6@\u00A2\u0006\u0002\u0010\u000BJ,\u0010\f\u001A\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u00A6@\u00A2\u0006\u0002\u0010\u000EJL\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001A\u00020\u0014H\u00A6@\u00A2\u0006\u0002\u0010\u0015J&\u0010\u0016\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u00A6@\u00A2\u0006\u0002\u0010\u0017J,\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u00A6@\u00A2\u0006\u0002\u0010\u000EJ\\\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u001B\u001A\u00020\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\b2\b\u0010\u001D\u001A\u0004\u0018\u00010\b2\u0006\u0010\u001E\u001A\u00020\u001F2\b\u0010\n\u001A\u0004\u0018\u00010\u0006H\u00A6@\u00A2\u0006\u0002\u0010 J>\u0010!\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\"\u001A\u00020\u00062\b\u0010#\u001A\u0004\u0018\u00010\u0006H\u00A6@\u00A2\u0006\u0002\u0010$JP\u0010%\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u001B\u001A\u00020\u00062\b\u0010\u001D\u001A\u0004\u0018\u00010\b2\u0006\u0010\u001E\u001A\u00020\u001F2\b\u0010\n\u001A\u0004\u0018\u00010\u0006H\u00A6@\u00A2\u0006\u0002\u0010&J,\u0010\'\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u00A6@\u00A2\u0006\u0002\u0010\u000E\u00A8\u0006("}, d2 = {"Lcom/kakao/tistory/domain/repository/CommentRepository;", "", "deleteComment", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "blogName", "", "entryId", "", "commentId", "guestPassword", "(Ljava/lang/String;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getComment", "Lcom/kakao/tistory/domain/entity/PinComment;", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getComments", "Lcom/kakao/tistory/domain/entity/common/CommentItemListModel;", "password", "listMode", "resultSize", "", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPinComment", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pinComment", "postComment", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "content", "parentCommentId", "mentionId", "secret", "", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postReportComment", "reportCode", "reportMessage", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putComment", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unpinComment", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface CommentRepository {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object getComments$default(CommentRepository commentRepository0, String s, long v, String s1, String s2, Long long0, int v1, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getComments");
            }
            Long long1 = (v2 & 16) == 0 ? long0 : null;
            return (v2 & 0x20) == 0 ? commentRepository0.getComments(s, v, s1, s2, long1, v1, continuation0) : commentRepository0.getComments(s, v, s1, s2, long1, 20, continuation0);
        }
    }

    @Nullable
    Object deleteComment(@NotNull String arg1, long arg2, long arg3, @Nullable String arg4, @NotNull Continuation arg5);

    @Nullable
    Object getComment(@NotNull String arg1, long arg2, long arg3, @NotNull Continuation arg4);

    @Nullable
    Object getComments(@NotNull String arg1, long arg2, @Nullable String arg3, @NotNull String arg4, @Nullable Long arg5, int arg6, @NotNull Continuation arg7);

    @Nullable
    Object getPinComment(@NotNull String arg1, long arg2, @NotNull Continuation arg3);

    @Nullable
    Object pinComment(@NotNull String arg1, long arg2, long arg3, @NotNull Continuation arg4);

    @Nullable
    Object postComment(@NotNull String arg1, long arg2, @Nullable String arg3, @NotNull String arg4, @Nullable Long arg5, @Nullable Long arg6, boolean arg7, @Nullable String arg8, @NotNull Continuation arg9);

    @Nullable
    Object postReportComment(@NotNull String arg1, long arg2, long arg3, @NotNull String arg4, @Nullable String arg5, @NotNull Continuation arg6);

    @Nullable
    Object putComment(@NotNull String arg1, long arg2, long arg3, @NotNull String arg4, @Nullable Long arg5, boolean arg6, @Nullable String arg7, @NotNull Continuation arg8);

    @Nullable
    Object unpinComment(@NotNull String arg1, long arg2, long arg3, @NotNull Continuation arg4);
}

