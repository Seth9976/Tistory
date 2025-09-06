package com.kakao.tistory.presentation.view.blog;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.common.tiara.TiaraPage;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001A\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000B\u001A\u00020\u00042\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u000B\u0010\u0006J\u001F\u0010\r\u001A\u00020\u00042\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u0002¢\u0006\u0004\b\r\u0010\u000ER\u001A\u0010\u000F\u001A\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001A\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/presentation/view/blog/FollowingTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "", "page", "", "trackPage", "(Ljava/lang/String;)V", "trackClickBlog", "trackClickUnFollow", "()V", "trackClickFollow", "trackClickSort", "copy", "trackClickSortItem", "(Ljava/lang/String;Ljava/lang/String;)V", "section", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FollowingTiara implements TiaraPage {
    public static final int $stable;
    @NotNull
    public static final FollowingTiara INSTANCE;

    static {
        FollowingTiara.INSTANCE = new FollowingTiara();
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() [...] // Inlined contents

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() [...] // Inlined contents

    public final void trackClickBlog(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "page");
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "피드", s, TistoryTiaraActionType.CLICK_BLOG, null, null, null, null, null, 0xF8, null);
    }

    public static void trackClickBlog$default(FollowingTiara followingTiara0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = "구독중";
        }
        followingTiara0.trackClickBlog(s);
    }

    public final void trackClickFollow() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "피드", "구독중", TistoryTiaraActionType.CLICK_FOLLOW, ActionKind.Follow, null, null, null, null, 0xF0, null);
    }

    public final void trackClickSort(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "page");
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "피드", s, TistoryTiaraActionType.CLICK_SORT, null, null, null, null, null, 0xF8, null);
    }

    public static void trackClickSort$default(FollowingTiara followingTiara0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = "구독중";
        }
        followingTiara0.trackClickSort(s);
    }

    public final void trackClickSortItem(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "page");
        Intrinsics.checkNotNullParameter(s1, "copy");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, null, s1, null, null, null, 0x3BF, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "피드", s, TistoryTiaraActionType.CLICK_SORT_ITEM, null, click0, null, null, null, 0xE8, null);
    }

    public static void trackClickSortItem$default(FollowingTiara followingTiara0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = "구독중";
        }
        followingTiara0.trackClickSortItem(s, s1);
    }

    public final void trackClickUnFollow() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "피드", "구독중", TistoryTiaraActionType.CLICK_FOLLOW_CANCEL, null, null, null, null, null, 0xF8, null);
    }

    public final void trackPage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "page");
        TistoryTiara.trackPage$default(TistoryTiara.INSTANCE, "피드", s, null, null, null, null, null, 0x7C, null);
    }

    public static void trackPage$default(FollowingTiara followingTiara0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = "구독중";
        }
        followingTiara0.trackPage(s);
    }
}

