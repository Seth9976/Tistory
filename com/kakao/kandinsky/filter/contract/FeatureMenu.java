package com.kakao.kandinsky.filter.contract;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/kandinsky/filter/contract/FeatureMenu;", "", "Filter", "Effect", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum FeatureMenu {
    Filter,
    Effect;

    public static final FeatureMenu[] a;
    public static final EnumEntries b;

    static {
        FeatureMenu.a = arr_featureMenu;
        Intrinsics.checkNotNullParameter(arr_featureMenu, "entries");
        FeatureMenu.b = new a(arr_featureMenu);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return FeatureMenu.b;
    }
}

