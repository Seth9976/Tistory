package com.kakao.tistory.presentation.screen.blogswitch.navigation;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blogswitch/navigation/BlogSwitchType;", "", "NORMAL", "QUICK", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum BlogSwitchType {
    NORMAL,
    QUICK;

    public static final BlogSwitchType[] a;
    public static final EnumEntries b;

    static {
        BlogSwitchType.a = arr_blogSwitchType;
        Intrinsics.checkNotNullParameter(arr_blogSwitchType, "entries");
        BlogSwitchType.b = new a(arr_blogSwitchType);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return BlogSwitchType.b;
    }
}

