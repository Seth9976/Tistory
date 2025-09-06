package com.kakao.tistory.presentation.main.navigation;

import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0017\u0010\u000F\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER\u0017\u0010\u0012\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001A\u0004\b\u0011\u0010\u000Ej\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/main/navigation/MainDestination;", "", "", "a", "Ljava/lang/Integer;", "getSelectedIcon", "()Ljava/lang/Integer;", "selectedIcon", "b", "getUnselectedIcon", "unselectedIcon", "c", "I", "getContentDescription", "()I", "contentDescription", "d", "getIconContentDescription", "iconContentDescription", "HOME", "FEED", "EDITOR", "NOTIFICATION", "MY", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum MainDestination {
    HOME(drawable.ic_tab_home_on, drawable.ic_tab_home, string.content_desc_main_tab_home, string.content_desc_main_tab_home_icon),
    FEED(drawable.ic_tab_feed_on, drawable.ic_tab_feed, string.content_desc_main_tab_feed, string.content_desc_main_tab_feed_icon),
    EDITOR(drawable.ic_tab_editor_on, drawable.ic_tab_editor, string.content_desc_main_tab_editor, string.content_desc_main_tab_editor_icon),
    NOTIFICATION(drawable.ic_tab_alarm_on, drawable.ic_tab_alarm, string.content_desc_main_tab_notification, string.content_desc_main_tab_notification_icon),
    MY(null, null, string.content_desc_main_tab_blog, string.content_desc_main_tab_blog_icon);

    public final Integer a;
    public final Integer b;
    public final int c;
    public final int d;
    public static final MainDestination[] e;
    public static final EnumEntries f;

    static {
        MainDestination.e = arr_mainDestination;
        Intrinsics.checkNotNullParameter(arr_mainDestination, "entries");
        MainDestination.f = new a(arr_mainDestination);
    }

    public MainDestination(Integer integer0, Integer integer1, int v1, int v2) {
        this.a = integer0;
        this.b = integer1;
        this.c = v1;
        this.d = v2;
    }

    public final int getContentDescription() {
        return this.c;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return MainDestination.f;
    }

    public final int getIconContentDescription() {
        return this.d;
    }

    @Nullable
    public final Integer getSelectedIcon() {
        return this.a;
    }

    @Nullable
    public final Integer getUnselectedIcon() {
        return this.b;
    }
}

