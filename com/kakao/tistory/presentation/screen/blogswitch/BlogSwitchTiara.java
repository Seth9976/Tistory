package com.kakao.tistory.presentation.screen.blogswitch;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchType;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\bÇ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\u000E\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000FR$\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u00028\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R$\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u00028\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001A\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blogswitch/BlogSwitchTiara;", "", "", "section", "page", "", "update", "(Ljava/lang/String;Ljava/lang/String;)V", "trackClickSetting", "()V", "", "position", "Lcom/kakao/tistory/presentation/screen/blogswitch/navigation/BlogSwitchType;", "type", "trackClickBlogSwitch", "(ILcom/kakao/tistory/presentation/screen/blogswitch/navigation/BlogSwitchType;)V", "<set-?>", "a", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "b", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogSwitchTiara {
    public static final int $stable = 8;
    @NotNull
    public static final BlogSwitchTiara INSTANCE = null;
    public static String a = "";
    public static String b = "";

    static {
        BlogSwitchTiara.INSTANCE = new BlogSwitchTiara();
    }

    // 去混淆评级： 低(20)
    @NotNull
    public final String getPage() {
        return "";
    }

    // 去混淆评级： 低(20)
    @NotNull
    public final String getSection() {
        return "";
    }

    public final void trackClickBlogSwitch(int v, @NotNull BlogSwitchType blogSwitchType0) {
        Intrinsics.checkNotNullParameter(blogSwitchType0, "type");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "GNB", "GNB블로그전환", "블로그전환", null, null, String.valueOf(v), null, null, null, null, 984, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "", "", TistoryTiaraActionType.CLICK_BLOG_SWITCH, null, click0, null, w.mapOf(TuplesKt.to("type", (blogSwitchType0 == BlogSwitchType.QUICK ? "onQuickChange" : "onGlobalSetting"))), null, 0xA8, null);
    }

    // 去混淆评级： 低(26)
    public final void trackClickSetting() {
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "GNB", "GNB블로그전환", "설정", null, null, null, null, null, null, null, 0x3F8, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "", "", TistoryTiaraActionType.CLICK_GLOBAL_SETTING, null, click0, null, null, null, 0xE8, null);
    }

    public final void update(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "section");
        Intrinsics.checkNotNullParameter(s1, "page");
        BlogSwitchTiara.a = s;
        BlogSwitchTiara.b = s1;
    }
}

