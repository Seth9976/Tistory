package com.kakao.tistory.presentation.screen.blog.common.ui;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final BlogEntry a;
    public final int b;

    public a(BlogEntry blogEntry0, int v) {
        this.a = blogEntry0;
        this.b = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogEntryListItemKt.BlogEntryListItem(this.a, ((Composer)object0), (this.b | 1) & -920350135 | ((0x24924924 & (this.b | 1)) >> 1 | 306783378 & (this.b | 1)) | (306783378 & (this.b | 1)) << 1 & (0x24924924 & (this.b | 1)));
        return Unit.INSTANCE;
    }
}

