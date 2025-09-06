package com.kakao.tistory.data.model.viewtype;

import androidx.annotation.StringRes;
import com.kakao.android.base.BaseKt;
import com.kakao.tistory.data.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0017\u0010\u0011\u001A\u00020\u00032\n\b\u0001\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0012R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\u0004\u001A\u00020\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/data/model/viewtype/HomeViewType;", "", "key", "", "viewType", "", "titleStringId", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;)V", "getKey", "()Ljava/lang/String;", "getTitleStringId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getViewType", "()I", "setViewType", "(I)V", "getItemTitle", "(Ljava/lang/Integer;)Ljava/lang/String;", "TOP_MESSAGE", "STATISTICS", "RECENT_POST", "TOP_POST", "BLOG_FOLLOWER", "COPYRIGHT", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum HomeViewType {
    TOP_MESSAGE("top_message", 0, null, 4, null),
    STATISTICS("statistics", 1, null, 4, null),
    RECENT_POST("recent_post", 2, string.label_home_recent_post),
    TOP_POST("top_post", 3, string.label_home_top_post),
    BLOG_FOLLOWER("blog_follower", 4, string.label_home_blog_follower),
    COPYRIGHT("copy_right", 5, null, 4, null);

    private static final EnumEntries $ENTRIES;
    private static final HomeViewType[] $VALUES;
    @NotNull
    private final String key;
    @Nullable
    private final Integer titleStringId;
    private int viewType;

    private static final HomeViewType[] $values() [...] // Inlined contents

    static {
        HomeViewType.$VALUES = arr_homeViewType;
        Intrinsics.checkNotNullParameter(arr_homeViewType, "entries");
        HomeViewType.$ENTRIES = new a(arr_homeViewType);
    }

    private HomeViewType(String s1, int v1, @StringRes Integer integer0) {
        this.key = s1;
        this.viewType = v1;
        this.titleStringId = integer0;
    }

    public HomeViewType(String s1, int v1, Integer integer0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 4) != 0) {
            integer0 = null;
        }
        this(s1, v1, integer0);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return HomeViewType.$ENTRIES;
    }

    @NotNull
    public final String getItemTitle(@StringRes @Nullable Integer integer0) {
        String s = integer0 == null ? null : BaseKt.getAppContext().getString(integer0.intValue());
        return s == null ? "" : s;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Integer getTitleStringId() {
        return this.titleStringId;
    }

    public final int getViewType() {
        return this.viewType;
    }

    public final void setViewType(int v) {
        this.viewType = v;
    }
}

