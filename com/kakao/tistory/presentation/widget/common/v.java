package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import com.kakao.tistory.data.model.common.EmojiErrorModel.Emoji;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function2 {
    public final ColumnScope a;
    public final Emoji b;
    public final int c;

    public v(ColumnScope columnScope0, Emoji emojiErrorModel$Emoji0, int v) {
        this.a = columnScope0;
        this.b = emojiErrorModel$Emoji0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CommonExceptionViewKt.a(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

