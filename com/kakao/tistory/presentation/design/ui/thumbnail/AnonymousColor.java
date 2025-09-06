package com.kakao.tistory.presentation.design.ui.thumbnail;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001A\u00020\u00028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\b\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/presentation/design/ui/thumbnail/AnonymousColor;", "", "Landroidx/compose/ui/graphics/Color;", "c", "J", "getDefaultColor-0d7_KjU", "()J", "defaultColor", "getColor-0d7_KjU", "color", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogThumbnail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogThumbnail.kt\ncom/kakao/tistory/presentation/design/ui/thumbnail/AnonymousColor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
public final class AnonymousColor {
    public static final int $stable;
    @NotNull
    public static final AnonymousColor INSTANCE;
    public static int a;
    public static final List b;
    public static final long c;

    // 去混淆评级： 低(33)
    static {
        AnonymousColor.INSTANCE = new AnonymousColor();
        List list0 = CollectionsKt__CollectionsKt.listOf(new Color[]{Color.box-impl(0xFFCECECE00000000L), Color.box-impl(0xFFFBD5C800000000L), Color.box-impl(0xFFF4E0C200000000L), Color.box-impl(0xFFD0DBF700000000L), Color.box-impl(0xFFF4D4E700000000L), Color.box-impl(0xFFC8C1E000000000L), Color.box-impl(0xFFB6C8B500000000L), Color.box-impl(0xFFC3DDDC00000000L), Color.box-impl(0xFFE0CDC500000000L), Color.box-impl(0xFFC2C9D500000000L)});
        AnonymousColor.b = list0;
        AnonymousColor.c = ((Color)CollectionsKt___CollectionsKt.first(list0)).unbox-impl();
        AnonymousColor.$stable = 8;
    }

    public final long getColor-0d7_KjU() {
        int v = (AnonymousColor.a + 1) % AnonymousColor.b.size();
        AnonymousColor.a = v;
        return v < 0 || v > CollectionsKt__CollectionsKt.getLastIndex(AnonymousColor.b) ? Color.box-impl(((Color)CollectionsKt___CollectionsKt.first(AnonymousColor.b)).unbox-impl()).unbox-impl() : AnonymousColor.b.get(v).unbox-impl();
    }

    public final long getDefaultColor-0d7_KjU() [...] // 潜在的解密器
}

