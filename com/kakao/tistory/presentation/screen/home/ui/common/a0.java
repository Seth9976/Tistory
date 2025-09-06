package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Entry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function2 {
    public final Entry a;
    public final Function3 b;
    public final boolean c;
    public final int d;
    public final int e;

    public a0(Entry entryListUiState$Entry0, Function3 function30, boolean z, int v, int v1) {
        this.a = entryListUiState$Entry0;
        this.b = function30;
        this.c = z;
        this.d = v;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SlotEntryListItemKt.SlotEntryListItemWithBlog(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)), this.e);
        return Unit.INSTANCE;
    }
}

