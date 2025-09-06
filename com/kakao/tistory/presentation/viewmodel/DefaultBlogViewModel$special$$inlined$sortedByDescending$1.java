package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.Blog;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pd.c;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000E\u0010\u0003\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000E\u0010\u0005\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 DefaultBlogViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/DefaultBlogViewModel\n*L\n1#1,328:1\n59#2:329\n*E\n"})
public final class DefaultBlogViewModel.special..inlined.sortedByDescending.1 implements Comparator {
    public final String a;

    public DefaultBlogViewModel.special..inlined.sortedByDescending.1(String s) {
        this.a = s;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return c.compareValues(Boolean.valueOf(Intrinsics.areEqual(((Blog)object1).getName(), this.a)), Boolean.valueOf(Intrinsics.areEqual(((Blog)object0).getName(), this.a)));
    }
}

