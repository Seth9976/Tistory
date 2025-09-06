package com.kakao.kandinsky.sticker.ui;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J", "androidx/compose/foundation/lazy/grid/LazyGridDslKt$items$3"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$3\n*L\n1#1,569:1\n*E\n"})
public final class StickerListKt.StickerList.4.1.invoke..inlined.items.default.3 extends Lambda implements Function2 {
    public final Function2 w;
    public final List x;

    public StickerListKt.StickerList.4.1.invoke..inlined.items.default.3(Function2 function20, List list0) {
        this.w = function20;
        this.x = list0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return GridItemSpan.box-impl(this.invoke-_-orMbw(((LazyGridItemSpanScope)object0), ((Number)object1).intValue()));
    }

    public final long invoke-_-orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope0, int v) {
        Object object0 = this.x.get(v);
        return ((GridItemSpan)this.w.invoke(lazyGridItemSpanScope0, object0)).unbox-impl();
    }
}

