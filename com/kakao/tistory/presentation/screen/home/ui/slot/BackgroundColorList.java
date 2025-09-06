package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u001B\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/ui/slot/BackgroundColorList;", "", "", "index", "Landroidx/compose/ui/graphics/Color;", "getSequential-vNxB06k", "(I)J", "getSequential", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BackgroundColorList {
    public static final int $stable;
    @NotNull
    public static final BackgroundColorList INSTANCE;
    public static final List a;
    public static final int b;

    // 去混淆评级： 低(33)
    static {
        BackgroundColorList.INSTANCE = new BackgroundColorList();
        List list0 = CollectionsKt__CollectionsKt.listOf(new Color[]{Color.box-impl(0xFFF4D4E400000000L), Color.box-impl(0xFFF2BBAE00000000L), Color.box-impl(0xFFEFDBBC00000000L), Color.box-impl(0xFFD0DBF700000000L), Color.box-impl(0xFFB6C8B500000000L), Color.box-impl(0xFFC8C1E000000000L), Color.box-impl(0xFFC5CDC300000000L), Color.box-impl(0xFFE0CDC500000000L), Color.box-impl(0xFFCECECE00000000L), Color.box-impl(0xFFC2C9D500000000L)});
        BackgroundColorList.a = list0;
        BackgroundColorList.b = c.coerceAtLeast(list0.size(), 1);
        BackgroundColorList.$stable = 8;
    }

    public final long getSequential-vNxB06k(int v) {
        Color color0 = (Color)CollectionsKt___CollectionsKt.getOrNull(BackgroundColorList.a, v % BackgroundColorList.b);
        return color0 == null ? ((Color)CollectionsKt___CollectionsKt.first(BackgroundColorList.a)).unbox-impl() : color0.unbox-impl();
    }
}

