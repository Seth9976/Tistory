package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m1 extends Lambda implements Function2 {
    public final int a;
    public final EntryItem b;
    public final String c;
    public final boolean d;
    public final SearchResultViewModel e;
    public final int f;

    public m1(int v, EntryItem entryItem0, String s, boolean z, SearchResultViewModel searchResultViewModel0, int v1) {
        this.a = v;
        this.b = entryItem0;
        this.c = s;
        this.d = z;
        this.e = searchResultViewModel0;
        this.f = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SearchResultListFragmentKt.access$SearchPostResult(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
        return Unit.INSTANCE;
    }
}

