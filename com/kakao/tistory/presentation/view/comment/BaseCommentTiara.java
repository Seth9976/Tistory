package com.kakao.tistory.presentation.view.comment;

import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.data.Click.Builder;
import com.kakao.tistory.presentation.common.tiara.TiaraPage;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u000B\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016J\b\u0010\u0004\u001A\u00020\u0003H\u0016J\b\u0010\u0005\u001A\u00020\u0003H\u0016J\u0010\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\bH\u0016J\b\u0010\t\u001A\u00020\u0003H\u0016J\b\u0010\n\u001A\u00020\u0003H\u0016J\b\u0010\u000B\u001A\u00020\u0003H\u0016J\b\u0010\f\u001A\u00020\u0003H\u0016J(\u0010\r\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u000FH\u0016J\b\u0010\u0013\u001A\u00020\u0003H\u0016J\b\u0010\u0014\u001A\u00020\u0003H\u0016JQ\u0010\u0015\u001A\u00020\u00032\u0006\u0010\u0016\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0017\u001A\u00020\u000F2\u0006\u0010\u0018\u001A\u00020\u000F2\b\u0010\u0019\u001A\u0004\u0018\u00010\u000F2\b\u0010\u001A\u001A\u0004\u0018\u00010\u001B2\u0006\u0010\u0007\u001A\u00020\bH\u0016¢\u0006\u0002\u0010\u001CJ\b\u0010\u001D\u001A\u00020\u0003H\u0016¨\u0006\u001E"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "trackCLickDelete", "", "trackCLickModify", "trackClickLoadMore", "trackClickModifyComplete", "isSecret", "", "trackClickPin", "trackClickProfile", "trackClickReply", "trackClickReport", "trackClickReportComplete", "entryId", "", "blogName", "reportCode", "reportType", "trackClickUnPin", "trackClickUserName", "trackClickWriteComplete", "entryTitle", "authorName", "authorId", "role", "parentCommentId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Z)V", "trackPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BaseCommentTiara extends TiaraPage {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void trackCLickDelete(@NotNull BaseCommentTiara baseCommentTiara0) {
            String s = baseCommentTiara0.getSection();
            String s1 = baseCommentTiara0.getPage();
            TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, s, s1, TistoryTiaraActionType.CLICK_DELETE, null, null, null, null, null, 0xF8, null);
        }

        public static void trackCLickModify(@NotNull BaseCommentTiara baseCommentTiara0) {
            String s = baseCommentTiara0.getSection();
            String s1 = baseCommentTiara0.getPage();
            TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, s, s1, TistoryTiaraActionType.CLICK_MODIFY, null, null, null, null, null, 0xF8, null);
        }

        public static void trackClickLoadMore(@NotNull BaseCommentTiara baseCommentTiara0) {
            String s = baseCommentTiara0.getSection();
            String s1 = baseCommentTiara0.getPage();
            TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, s, s1, TistoryTiaraActionType.CLICK_REPLY_SEE_ALL, null, null, null, null, null, 0xF8, null);
        }

        public static void trackClickModifyComplete(@NotNull BaseCommentTiara baseCommentTiara0, boolean z) {
            String s = baseCommentTiara0.getSection();
            Builder click$Builder0 = new Builder();
            click$Builder0.copy((z ? "비밀" : "공개"));
            TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, s, "수정하기", TistoryTiaraActionType.CLICK_COMMENT_MODIFY_UPLOAD, null, click$Builder0.build(), null, null, null, 0xE8, null);
        }

        public static void trackClickPin(@NotNull BaseCommentTiara baseCommentTiara0) {
            String s = baseCommentTiara0.getSection();
            String s1 = baseCommentTiara0.getPage();
            TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, s, s1, TistoryTiaraActionType.CLICK_PIN, null, null, null, null, null, 0xF8, null);
        }

        public static void trackClickProfile(@NotNull BaseCommentTiara baseCommentTiara0) {
            String s = baseCommentTiara0.getSection();
            String s1 = baseCommentTiara0.getPage();
            TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, s, s1, TistoryTiaraActionType.CLICK_PROFILE_IMAGE, null, null, null, null, null, 0xF8, null);
        }

        public static void trackClickReply(@NotNull BaseCommentTiara baseCommentTiara0) {
            String s = baseCommentTiara0.getSection();
            String s1 = baseCommentTiara0.getPage();
            TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, s, s1, TistoryTiaraActionType.CLICK_COMMENT_REPLY, null, null, null, null, null, 0xF8, null);
        }

        public static void trackClickReport(@NotNull BaseCommentTiara baseCommentTiara0) {
            String s = baseCommentTiara0.getSection();
            String s1 = baseCommentTiara0.getPage();
            TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, s, s1, TistoryTiaraActionType.CLICK_REPORT, null, null, null, null, null, 0xF8, null);
        }

        public static void trackClickReportComplete(@NotNull BaseCommentTiara baseCommentTiara0, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
            Intrinsics.checkNotNullParameter(s, "entryId");
            Intrinsics.checkNotNullParameter(s1, "blogName");
            Intrinsics.checkNotNullParameter(s2, "reportCode");
            Intrinsics.checkNotNullParameter(s3, "reportType");
            String s4 = baseCommentTiara0.getSection();
            String s5 = baseCommentTiara0.getPage();
            com.kakao.tiara.data.Meta.Builder meta$Builder0 = new com.kakao.tiara.data.Meta.Builder();
            meta$Builder0.id(s);
            meta$Builder0.provider(s1);
            Builder click$Builder0 = new Builder();
            click$Builder0.copy(s3);
            TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, s4, s5, TistoryTiaraActionType.CLICK_REPORT_COMPLETE, null, click$Builder0.build(), meta$Builder0.build(), null, null, 200, null);
        }

        public static void trackClickUnPin(@NotNull BaseCommentTiara baseCommentTiara0) {
            String s = baseCommentTiara0.getSection();
            String s1 = baseCommentTiara0.getPage();
            TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, s, s1, TistoryTiaraActionType.CLICK_UNPIN, null, null, null, null, null, 0xF8, null);
        }

        public static void trackClickUserName(@NotNull BaseCommentTiara baseCommentTiara0) {
            String s = baseCommentTiara0.getSection();
            String s1 = baseCommentTiara0.getPage();
            TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, s, s1, TistoryTiaraActionType.CLICK_NICKNAME, null, null, null, null, null, 0xF8, null);
        }

        public static void trackClickWriteComplete(@NotNull BaseCommentTiara baseCommentTiara0, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull String s4, @Nullable String s5, @Nullable Long long0, boolean z) {
            Intrinsics.checkNotNullParameter(s, "entryTitle");
            Intrinsics.checkNotNullParameter(s1, "entryId");
            Intrinsics.checkNotNullParameter(s2, "blogName");
            Intrinsics.checkNotNullParameter(s3, "authorName");
            Intrinsics.checkNotNullParameter(s4, "authorId");
            String s6 = baseCommentTiara0.getSection();
            String s7 = baseCommentTiara0.getPage();
            Map map0 = x.mapOf(new Pair[]{TuplesKt.to("type", (long0 == null ? "parentComment" : "childComment")), TuplesKt.to("secret", (z ? "true" : "false")), TuplesKt.to("role", (Intrinsics.areEqual(s5, "owner") ? "owner" : "user"))});
            com.kakao.tiara.data.Meta.Builder meta$Builder0 = new com.kakao.tiara.data.Meta.Builder();
            meta$Builder0.name(s);
            meta$Builder0.id(s1);
            meta$Builder0.provider(s2);
            meta$Builder0.author(s3);
            meta$Builder0.authorId(s4);
            TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, s6, s7, TistoryTiaraActionType.CLICK_COMMENT_COMPLETE, ActionKind.WriteComment, null, null, map0, meta$Builder0.build(), 0x30, null);
        }

        public static void trackPage(@NotNull BaseCommentTiara baseCommentTiara0) {
            String s = baseCommentTiara0.getSection();
            String s1 = baseCommentTiara0.getPage();
            TistoryTiara.trackPage$default(TistoryTiara.INSTANCE, s, s1, null, null, null, null, null, 0x7C, null);
        }
    }

    void trackCLickDelete();

    void trackCLickModify();

    void trackClickLoadMore();

    void trackClickModifyComplete(boolean arg1);

    void trackClickPin();

    void trackClickProfile();

    void trackClickReply();

    void trackClickReport();

    void trackClickReportComplete(@NotNull String arg1, @NotNull String arg2, @NotNull String arg3, @NotNull String arg4);

    void trackClickUnPin();

    void trackClickUserName();

    void trackClickWriteComplete(@NotNull String arg1, @NotNull String arg2, @NotNull String arg3, @NotNull String arg4, @NotNull String arg5, @Nullable String arg6, @Nullable Long arg7, boolean arg8);

    void trackPage();
}

