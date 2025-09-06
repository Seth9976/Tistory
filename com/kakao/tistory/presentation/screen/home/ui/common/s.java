package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Blog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function2 {
    public final Blog a;
    public final PaddingValues b;
    public final int c;
    public final int d;

    public s(Blog entryListUiState$Blog0, PaddingValues paddingValues0, int v, int v1) {
        this.a = entryListUiState$Blog0;
        this.b = paddingValues0;
        this.c = v;
        this.d = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SlotBlogInfoKt.SlotBlogInfoOnImage(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)), this.d);
        return Unit.INSTANCE;
    }
}

