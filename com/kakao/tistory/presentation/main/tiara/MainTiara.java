package com.kakao.tistory.presentation.main.tiara;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import com.kakao.tistory.presentation.main.navigation.MainDestination;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\r\u0010\f\u001A\u00020\u0005¢\u0006\u0004\b\f\u0010\rR$\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\u00028\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R$\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\u00028\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001A\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/presentation/main/tiara/MainTiara;", "", "", "section", "page", "", "update", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/kakao/tistory/presentation/main/navigation/MainDestination;", "it", "trackClickBottom", "(Lcom/kakao/tistory/presentation/main/navigation/MainDestination;)V", "trackLongClickBottomMy", "()V", "<set-?>", "a", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "b", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MainTiara {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[MainDestination.values().length];
            try {
                arr_v[MainDestination.HOME.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MainDestination.FEED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MainDestination.EDITOR.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MainDestination.NOTIFICATION.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MainDestination.MY.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    @NotNull
    public static final MainTiara INSTANCE = null;
    public static String a = "";
    public static String b = "";

    static {
        MainTiara.INSTANCE = new MainTiara();
    }

    // 去混淆评级： 低(20)
    @NotNull
    public final String getPage() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    @NotNull
    public final String getSection() [...] // 潜在的解密器

    public final void trackClickBottom(@NotNull MainDestination mainDestination0) {
        Pair pair0;
        Intrinsics.checkNotNullParameter(mainDestination0, "it");
        switch(WhenMappings.$EnumSwitchMapping$0[mainDestination0.ordinal()]) {
            case 1: {
                pair0 = TuplesKt.to("GNB홈메뉴", TistoryTiaraActionType.CLICK_BOTTOM_NAVIGATION_HOME);
                break;
            }
            case 2: {
                pair0 = TuplesKt.to("GNB피드메뉴", TistoryTiaraActionType.CLICK_BOTTOM_NAVIGATION_FEED);
                break;
            }
            case 3: {
                pair0 = TuplesKt.to("GNB에디터", TistoryTiaraActionType.CLICK_BOTTOM_NAVIGATION_EDITOR);
                break;
            }
            case 4: {
                pair0 = TuplesKt.to("GNB알림메뉴", TistoryTiaraActionType.CLICK_BOTTOM_NAVIGATION_NOTIFICATION);
                break;
            }
            case 5: {
                pair0 = TuplesKt.to("GNB블로그메뉴", TistoryTiaraActionType.CLICK_BOTTOM_NAVIGATION_BLOG_TOP);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "GNB", ((String)pair0.component1()), null, null, null, null, null, null, null, null, 1020, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "", "", ((TistoryTiaraActionType)pair0.component2()), null, click0, null, null, null, 0xE8, null);
    }

    // 去混淆评级： 低(26)
    public final void trackLongClickBottomMy() {
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "GNB", "GNB블로그롱프레스", null, null, null, null, null, null, null, null, 1020, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "", "", TistoryTiaraActionType.LONG_CLICK_BOTTOM_NAVIGATION_BLOG_TOP, null, click0, null, null, null, 0xE8, null);
    }

    public final void update(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "section");
        Intrinsics.checkNotNullParameter(s1, "page");
        MainTiara.a = s;
        MainTiara.b = s1;
    }
}

