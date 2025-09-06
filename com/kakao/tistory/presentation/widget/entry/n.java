package com.kakao.tistory.presentation.widget.entry;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.ThumbnailType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function2 {
    public final Modifier a;
    public final EntryItem b;
    public final ThumbnailType c;
    public final int d;
    public final int e;

    public n(Modifier modifier0, EntryItem entryItem0, ThumbnailType thumbnailType0, int v, int v1) {
        this.a = modifier0;
        this.b = entryItem0;
        this.c = thumbnailType0;
        this.d = v;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryThumbnailImageViewKt.EntryThumbnailImageView(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)), this.e);
        return Unit.INSTANCE;
    }
}

