package androidx.compose.material3.carousel;

import androidx.compose.ui.util.MathHelpersKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\b\u0010\u0000\u001A\u00020\u0001H\u0000\u001AC\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00072\u0017\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000E\u001AA\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00042\u0017\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\fH\u0000\u001A \u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0015\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u0004H\u0000\u001A \u0010\u0012\u001A\u00020\u00012\u0006\u0010\u0017\u001A\u00020\u00012\u0006\u0010\u0018\u001A\u00020\u00012\u0006\u0010\u0016\u001A\u00020\u0004H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0019"}, d2 = {"emptyKeylineList", "Landroidx/compose/material3/carousel/KeylineList;", "keylineListOf", "carouselMainAxisSize", "", "itemSpacing", "carouselAlignment", "Landroidx/compose/material3/carousel/CarouselAlignment;", "keylines", "Lkotlin/Function1;", "Landroidx/compose/material3/carousel/KeylineListScope;", "", "Lkotlin/ExtensionFunctionType;", "keylineListOf-WNYm7Xg", "(FFILkotlin/jvm/functions/Function1;)Landroidx/compose/material3/carousel/KeylineList;", "pivotIndex", "", "pivotOffset", "lerp", "Landroidx/compose/material3/carousel/Keyline;", "start", "end", "fraction", "from", "to", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeylineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineListKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,566:1\n277#2,3:567\n69#2,4:570\n280#2,2:574\n74#2:576\n282#2:577\n*S KotlinDebug\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineListKt\n*L\n563#1:567,3\n563#1:570,4\n563#1:574,2\n563#1:576\n563#1:577\n*E\n"})
public final class KeylineListKt {
    @NotNull
    public static final KeylineList emptyKeylineList() {
        return KeylineList.Companion.getEmpty();
    }

    @NotNull
    public static final KeylineList keylineListOf(float f, float f1, int v, float f2, @NotNull Function1 function10) {
        a a0 = new a();
        function10.invoke(a0);
        return new KeylineList(a.a(v, f2, a0.a, a0.b(), a0.b, f, f1, a0.d));
    }

    @NotNull
    public static final KeylineList keylineListOf-WNYm7Xg(float f, float f1, int v, @NotNull Function1 function10) {
        float f2 = 0.0f;
        a a0 = new a();
        function10.invoke(a0);
        int v1 = a0.b();
        int v2 = v1 - a0.a;
        a0.c = a0.a;
        if(CarouselAlignment.equals-impl0(v, 0)) {
            if(f1 != 0.0f && v2 % 2 + (((v2 % 2 ^ 2) & (-(v2 % 2) | v2 % 2)) >> 0x1F & 2) != 0) {
                f2 = f1 / 2.0f;
            }
            return new KeylineList(a.a(a0.c, f / 2.0f - a0.b / 2.0f * ((float)v2) - f2, a0.a, v1, a0.b, f, f1, a0.d));
        }
        return CarouselAlignment.equals-impl0(v, 1) ? new KeylineList(a.a(a0.c, f - a0.b / 2.0f, a0.a, v1, a0.b, f, f1, a0.d)) : new KeylineList(a.a(a0.c, a0.b / 2.0f, a0.a, v1, a0.b, f, f1, a0.d));
    }

    @NotNull
    public static final Keyline lerp(@NotNull Keyline keyline0, @NotNull Keyline keyline1, float f) {
        float f1 = MathHelpersKt.lerp(keyline0.getSize(), keyline1.getSize(), f);
        float f2 = f * keyline1.getOffset() + (1.0f - f) * keyline0.getOffset();
        float f3 = f * keyline1.getUnadjustedOffset() + (1.0f - f) * keyline0.getUnadjustedOffset();
        int v = Float.compare(f, 0.5f);
        boolean z = v >= 0 ? keyline1.isFocal() : keyline0.isFocal();
        boolean z1 = v >= 0 ? keyline1.isAnchor() : keyline0.isAnchor();
        return v >= 0 ? new Keyline(f1, f2, f3, z, z1, keyline1.isPivot(), f * keyline1.getCutoff() + (1.0f - f) * keyline0.getCutoff()) : new Keyline(f1, f2, f3, z, z1, keyline0.isPivot(), f * keyline1.getCutoff() + (1.0f - f) * keyline0.getCutoff());
    }

    @NotNull
    public static final KeylineList lerp(@NotNull KeylineList keylineList0, @NotNull KeylineList keylineList1, float f) {
        ArrayList arrayList0 = new ArrayList(keylineList0.size());
        int v = keylineList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(KeylineListKt.lerp(((Keyline)keylineList0.get(v1)), keylineList1.get(v1), f));
        }
        return new KeylineList(arrayList0);
    }
}

