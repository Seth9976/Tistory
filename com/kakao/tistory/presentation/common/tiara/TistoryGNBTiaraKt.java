package com.kakao.tistory.presentation.common.tiara;

import com.kakao.tiara.data.Click;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001A\u00020\u0004\u001A\u0014\u0010\u0005\u001A\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u001A\n\u0010\u0007\u001A\u00020\u0001*\u00020\u0002¨\u0006\b"}, d2 = {"trackClickAppBarBlogImage", "", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "myProfile", "", "trackClickAppBarSearch", "wholeSearch", "trackClickLogo", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class TistoryGNBTiaraKt {
    public static final void trackClickAppBarBlogImage(@NotNull TiaraPage tiaraPage0, boolean z) {
        Intrinsics.checkNotNullParameter(tiaraPage0, "<this>");
        String s = tiaraPage0.getSection();
        String s1 = tiaraPage0.getPage();
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "GNB", "GNB프로필", null, null, null, null, null, null, null, null, 1020, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, s, s1, TistoryTiaraActionType.CLICK_APP_BAR_PROFILE_IMAGE, null, click0, null, w.mapOf(TuplesKt.to("type", (z ? "myProfile" : "othersProfile"))), null, 0xA8, null);
    }

    public static void trackClickAppBarBlogImage$default(TiaraPage tiaraPage0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        TistoryGNBTiaraKt.trackClickAppBarBlogImage(tiaraPage0, z);
    }

    public static final void trackClickAppBarSearch(@NotNull TiaraPage tiaraPage0, boolean z) {
        Intrinsics.checkNotNullParameter(tiaraPage0, "<this>");
        String s = tiaraPage0.getSection();
        String s1 = tiaraPage0.getPage();
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "GNB", "GNB검색", null, null, null, null, null, null, null, null, 1020, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, s, s1, TistoryTiaraActionType.CLICK_APP_BAR_SEARCH, null, click0, null, w.mapOf(TuplesKt.to("type", (z ? "wholeSearch" : "eachSearch"))), null, 0xA8, null);
    }

    public static void trackClickAppBarSearch$default(TiaraPage tiaraPage0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        TistoryGNBTiaraKt.trackClickAppBarSearch(tiaraPage0, z);
    }

    public static final void trackClickLogo(@NotNull TiaraPage tiaraPage0) {
        Intrinsics.checkNotNullParameter(tiaraPage0, "<this>");
        String s = tiaraPage0.getSection();
        String s1 = tiaraPage0.getPage();
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "GNB", "GNB로고", null, null, null, null, null, null, null, null, 1020, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, s, s1, TistoryTiaraActionType.CLICK_APP_BAR_TISTORY_LOGO, null, click0, null, null, null, 0xE8, null);
    }
}

