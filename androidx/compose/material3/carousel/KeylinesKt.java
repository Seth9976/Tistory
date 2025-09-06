package androidx.compose.material3.carousel;

import a5.b;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import v0.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001AK\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u000B\u0010\f\u001A7\u0010\u0011\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u000FH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001A/\u0010\u0014\u001A\u00020\n2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/unit/Density;", "density", "", "carouselMainAxisSize", "preferredItemSize", "itemSpacing", "", "itemCount", "minSmallItemSize", "maxSmallItemSize", "Landroidx/compose/material3/carousel/KeylineList;", "multiBrowseKeylineList", "(Landroidx/compose/ui/unit/Density;FFFIFF)Landroidx/compose/material3/carousel/KeylineList;", "leftAnchorSize", "rightAnchorSize", "Landroidx/compose/material3/carousel/Arrangement;", "arrangement", "createLeftAlignedKeylineList", "(FFFFLandroidx/compose/material3/carousel/Arrangement;)Landroidx/compose/material3/carousel/KeylineList;", "itemSize", "uncontainedKeylineList", "(Landroidx/compose/ui/unit/Density;FFF)Landroidx/compose/material3/carousel/KeylineList;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeylines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keylines.kt\nandroidx/compose/material3/carousel/KeylinesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n1#2:249\n*E\n"})
public final class KeylinesKt {
    // 去混淆评级： 低(20)
    @NotNull
    public static final KeylineList createLeftAlignedKeylineList(float f, float f1, float f2, float f3, @NotNull Arrangement arrangement0) {
        return KeylineListKt.keylineListOf-WNYm7Xg(f, f1, -1, new p(f2, arrangement0, f3));
    }

    @NotNull
    public static final KeylineList multiBrowseKeylineList(@NotNull Density density0, float f, float f1, float f2, int v, float f3, float f4) {
        if(f == 0.0f || f1 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        int[] arr_v = {1, 0};
        float f5 = Math.min(f1, f);
        float f6 = c.coerceIn(f5 / 3.0f, f3, f4);
        float f7 = (f5 + f6) / 2.0f;
        int[] arr_v1 = f < 2.0f * f3 ? new int[]{0} : new int[]{1};
        float f8 = f - ((float)ArraysKt___ArraysKt.maxOrThrow(arr_v)) * f7;
        int v2 = Math.max(1, ((int)(((float)Math.floor(b.a(f4, ArraysKt___ArraysKt.maxOrThrow(arr_v1), f8, f5))))));
        int v3 = (int)(((float)Math.ceil(f / f5)));
        int v4 = v3 - v2 + 1;
        int[] arr_v2 = new int[v4];
        for(int v1 = 0; v1 < v4; ++v1) {
            arr_v2[v1] = v3 - v1;
        }
        float f9 = density0.toPx-0680j_4(10.0f);
        Arrangement arrangement0 = Arrangement.Companion.findLowestCostArrangement(f, f2, f6, f3, f4, arr_v1, f7, arr_v, f5, arr_v2);
        if(arrangement0 != null && arrangement0.itemCount() > v) {
            int v5 = arrangement0.itemCount() - v;
            int v6 = arrangement0.getSmallCount();
            int v7 = arrangement0.getMediumCount();
            while(v5 > 0) {
                if(v6 > 0) {
                    --v6;
                }
                else if(v7 > 1) {
                    --v7;
                }
                --v5;
            }
            arrangement0 = Arrangement.Companion.findLowestCostArrangement(f, f2, f6, f3, f4, new int[]{v6}, f7, new int[]{v7}, f5, arr_v2);
        }
        return arrangement0 == null ? KeylineListKt.emptyKeylineList() : KeylinesKt.createLeftAlignedKeylineList(f, f2, f9, f9, arrangement0);
    }

    public static KeylineList multiBrowseKeylineList$default(Density density0, float f, float f1, float f2, int v, float f3, float f4, int v1, Object object0) {
        if((v1 & 0x20) != 0) {
            f3 = density0.toPx-0680j_4(40.0f);
        }
        if((v1 & 0x40) != 0) {
            f4 = density0.toPx-0680j_4(56.0f);
        }
        return KeylinesKt.multiBrowseKeylineList(density0, f, f1, f2, v, f3, f4);
    }

    @NotNull
    public static final KeylineList uncontainedKeylineList(@NotNull Density density0, float f, float f1, float f2) {
        if(f == 0.0f || f1 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        float f3 = Math.min(f1 + f2, f);
        int v = Math.max(1, ((int)(((float)Math.floor(f / f3)))));
        float f4 = f - ((float)v) * f3;
        float f5 = density0.toPx-0680j_4(10.0f);
        float f6 = Math.max(1.5f * f4, f5) > 0.85f * f3 ? Math.max(0.85f * f3, f4 * 1.2f) : Math.max(1.5f * f4, f5);
        return KeylinesKt.createLeftAlignedKeylineList(f, f2, Math.max(Math.min(f5, f1), f6 * 0.5f), f5, new Arrangement(0, 0.0f, 0, f6, (f4 > 0.0f ? 1 : 0), f3, v));
    }
}

