package com.kakao.tistory.presentation.view.entry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.data.Click;
import com.kakao.tiara.data.Meta.Builder;
import com.kakao.tistory.presentation.common.tiara.TiaraPage;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001F\bÇ\u0002\u0018\u00002\u00020\u0001J%\u0010\b\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000BJ!\u0010\r\u001A\u00020\u00072\b\u0010\f\u001A\u0004\u0018\u00010\u00022\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u000F\u001A\u00020\u0007¢\u0006\u0004\b\u000F\u0010\u000BJ\r\u0010\u0010\u001A\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000BJ-\u0010\u0013\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001A\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000BJ\r\u0010\u0016\u001A\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u000BJ\r\u0010\u0017\u001A\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u000BJ\r\u0010\u0018\u001A\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u000BJ\r\u0010\u0019\u001A\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u000BJ\r\u0010\u001A\u001A\u00020\u0007¢\u0006\u0004\b\u001A\u0010\u000BJ\r\u0010\u001B\u001A\u00020\u0007¢\u0006\u0004\b\u001B\u0010\u000BJ\u0015\u0010\u001D\u001A\u00020\u00072\u0006\u0010\u001C\u001A\u00020\u0002¢\u0006\u0004\b\u001D\u0010\u001EJ\u0015\u0010\u001F\u001A\u00020\u00072\u0006\u0010\u001C\u001A\u00020\u0002¢\u0006\u0004\b\u001F\u0010\u001ER\u001A\u0010 \u001A\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#R\u001A\u0010$\u001A\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010!\u001A\u0004\b%\u0010#¨\u0006&"}, d2 = {"Lcom/kakao/tistory/presentation/view/entry/EntryTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "", "entryId", "blogName", "", "isLiked", "", "trackClickLike", "(Ljava/lang/String;Ljava/lang/String;Z)V", "trackClickComment", "()V", "id", "trackClickShare", "(Ljava/lang/String;Ljava/lang/String;)V", "trackClickMore", "trackClickReport", "reportCode", "reportType", "trackClickReportComplete", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "trackClickModify", "trackClickStatistics", "trackClickDelete", "trackPageChallengeAuth", "trackClickChallengeAuth", "trackClickChallengeAuthLater", "trackPageChallengeSuccess", "message", "trackClickChallengeSuccess", "(Ljava/lang/String;)V", "trackClickChallengeSuccessClose", "section", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "page", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryTiara.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryTiara.kt\ncom/kakao/tistory/presentation/view/entry/EntryTiara\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
public final class EntryTiara implements TiaraPage {
    public static final int $stable;
    @NotNull
    public static final EntryTiara INSTANCE;

    static {
        EntryTiara.INSTANCE = new EntryTiara();
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() [...] // Inlined contents

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() [...] // Inlined contents

    public final void trackClickChallengeAuth() {
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "카카오계정 본인인증 레이어", "본인인증 하기", null, null, null, null, null, null, null, null, 1020, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "글뷰", "글뷰", TistoryTiaraActionType.CLICK_CHALLENGE_AUTH, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickChallengeAuthLater() {
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "카카오계정 본인인증 레이어", "다음에 하기", null, null, null, null, null, null, null, null, 1020, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "글뷰", "글뷰", TistoryTiaraActionType.CLICK_LATER, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickChallengeSuccess(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "message");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "챌린지 참여 성공 안내 레이어", "참여현황 보기", null, null, null, null, s, null, null, null, 956, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "글뷰", "글뷰", TistoryTiaraActionType.CLICK_CHALLENGE_SUCCESS, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickChallengeSuccessClose(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "message");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "챌린지 참여 성공 안내 레이어", "닫기", null, null, null, null, s, null, null, null, 956, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "글뷰", "글뷰", TistoryTiaraActionType.CLICK_CLOSE_BUTTON, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickComment() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "글뷰", "글뷰", TistoryTiaraActionType.CLICK_COMMENT, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickDelete() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "글뷰", "글뷰", TistoryTiaraActionType.CLICK_DELETE, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickLike(@NotNull String s, @NotNull String s1, boolean z) {
        Intrinsics.checkNotNullParameter(s, "entryId");
        Intrinsics.checkNotNullParameter(s1, "blogName");
        Builder meta$Builder0 = new Builder();
        meta$Builder0.id(s);
        meta$Builder0.provider(s1);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "글뷰", "글뷰", TistoryTiaraActionType.CLICK_LIKE, ActionKind.Like, null, null, w.mapOf(TuplesKt.to("liketype", (z ? "공감 취소" : "공감"))), meta$Builder0.build(), 0x30, null);
    }

    public final void trackClickModify() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "글뷰", "글뷰", TistoryTiaraActionType.CLICK_MODIFY, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickMore() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "글뷰", "글뷰", TistoryTiaraActionType.CLICK_MORE, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickReport() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "글뷰", "글뷰", TistoryTiaraActionType.CLICK_REPORT, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickReportComplete(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "entryId");
        Intrinsics.checkNotNullParameter(s1, "blogName");
        Intrinsics.checkNotNullParameter(s2, "reportCode");
        Intrinsics.checkNotNullParameter(s3, "reportType");
        Builder meta$Builder0 = new Builder();
        meta$Builder0.id(s);
        meta$Builder0.provider(s1);
        com.kakao.tiara.data.Click.Builder click$Builder0 = new com.kakao.tiara.data.Click.Builder();
        click$Builder0.copy(s3);
        Map map0 = w.mapOf(TuplesKt.to("name", s2));
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "글뷰", "글뷰", TistoryTiaraActionType.CLICK_REPORT_COMPLETE, null, click$Builder0.build(), meta$Builder0.build(), map0, null, 0x88, null);
    }

    public final void trackClickShare(@Nullable String s, @Nullable String s1) {
        TistoryTiara tistoryTiara0 = TistoryTiara.INSTANCE;
        TistoryTiaraActionType tistoryTiaraActionType0 = TistoryTiaraActionType.CLICK_SHARE;
        ActionKind actionKind0 = ActionKind.Share;
        Builder meta$Builder0 = new Builder();
        if(s != null) {
            meta$Builder0.id(s);
        }
        if(s1 != null) {
            meta$Builder0.provider(s1);
        }
        TistoryTiara.trackClick$default(tistoryTiara0, "글뷰", "글뷰", tistoryTiaraActionType0, actionKind0, null, null, null, meta$Builder0.build(), 0x70, null);
    }

    public final void trackClickStatistics() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "글뷰", "글뷰", TistoryTiaraActionType.CLICK_STATISTICS, null, null, null, null, null, 0xF8, null);
    }

    // 去混淆评级： 低(20)
    public final void trackPageChallengeAuth() {
        TistoryTiara.trackPage$default(TistoryTiara.INSTANCE, "글뷰", "글뷰", "카카오계정 본인인증 안내_보기", null, null, null, null, 120, null);
    }

    // 去混淆评级： 低(20)
    public final void trackPageChallengeSuccess() {
        TistoryTiara.trackPage$default(TistoryTiara.INSTANCE, "글뷰", "글뷰", "참여 성공 안내_보기", null, null, null, null, 120, null);
    }
}

