package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.presentation.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/presentation/view/search/ResultViewType;", "", "", "a", "I", "getTabTitle", "()I", "tabTitle", "", "b", "Ljava/lang/String;", "getTiaraCode", "()Ljava/lang/String;", "tiaraCode", "POST", "TAG", "BLOG", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum ResultViewType {
    POST(string.label_search_tab_post, "entry"),
    TAG(string.label_search_tab_tag, "tag"),
    BLOG(string.label_search_tab_blog, "blog");

    public final int a;
    public final String b;
    public static final ResultViewType[] c;
    public static final EnumEntries d;

    static {
        ResultViewType.c = arr_resultViewType;
        Intrinsics.checkNotNullParameter(arr_resultViewType, "entries");
        ResultViewType.d = new a(arr_resultViewType);
    }

    public ResultViewType(int v1, String s1) {
        this.a = v1;
        this.b = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return ResultViewType.d;
    }

    public final int getTabTitle() {
        return this.a;
    }

    @NotNull
    public final String getTiaraCode() {
        return this.b;
    }
}

