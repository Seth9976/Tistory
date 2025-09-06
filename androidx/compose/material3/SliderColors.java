package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\u0002\u00A2\u0006\u0004\b\r\u0010\u000EJt\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001D\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0013\u001A\u00020\u0012H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001A\u00020\u00022\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0016\u001A\u00020\u0012H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001B\u001A\u00020\u00022\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0016\u001A\u00020\u0012H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u0018J\u001A\u0010\u001D\u001A\u00020\u00122\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010 \u001A\u00020\u001FH\u0016\u00A2\u0006\u0004\b \u0010!R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u001D\u0010\u0004\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b&\u0010#\u001A\u0004\b\'\u0010%R\u001D\u0010\u0005\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b(\u0010#\u001A\u0004\b)\u0010%R\u001D\u0010\u0006\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b*\u0010#\u001A\u0004\b+\u0010%R\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b,\u0010#\u001A\u0004\b-\u0010%R\u001D\u0010\b\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b.\u0010#\u001A\u0004\b/\u0010%R\u001D\u0010\t\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b0\u0010#\u001A\u0004\b1\u0010%R\u001D\u0010\n\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b2\u0010#\u001A\u0004\b3\u0010%R\u001D\u0010\u000B\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b4\u0010#\u001A\u0004\b5\u0010%R\u001D\u0010\f\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b6\u0010#\u001A\u0004\b7\u0010%\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u00068"}, d2 = {"Landroidx/compose/material3/SliderColors;", "", "Landroidx/compose/ui/graphics/Color;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "<init>", "(JJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy--K518z4", "(JJJJJJJJJJ)Landroidx/compose/material3/SliderColors;", "copy", "", "enabled", "thumbColor-vNxB06k$material3_release", "(Z)J", "active", "trackColor-WaAFU9c$material3_release", "(ZZ)J", "trackColor", "tickColor-WaAFU9c$material3_release", "tickColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getThumbColor-0d7_KjU", "()J", "b", "getActiveTrackColor-0d7_KjU", "c", "getActiveTickColor-0d7_KjU", "d", "getInactiveTrackColor-0d7_KjU", "e", "getInactiveTickColor-0d7_KjU", "f", "getDisabledThumbColor-0d7_KjU", "g", "getDisabledActiveTrackColor-0d7_KjU", "h", "getDisabledActiveTickColor-0d7_KjU", "i", "getDisabledInactiveTrackColor-0d7_KjU", "j", "getDisabledInactiveTickColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2263:1\n708#2:2264\n696#2:2265\n708#2:2266\n696#2:2267\n708#2:2268\n696#2:2269\n708#2:2270\n696#2:2271\n708#2:2272\n696#2:2273\n708#2:2274\n696#2:2275\n708#2:2276\n696#2:2277\n708#2:2278\n696#2:2279\n708#2:2280\n696#2:2281\n708#2:2282\n696#2:2283\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderColors\n*L\n1798#1:2264\n1798#1:2265\n1799#1:2266\n1799#1:2267\n1800#1:2268\n1800#1:2269\n1801#1:2270\n1801#1:2271\n1802#1:2272\n1802#1:2273\n1803#1:2274\n1803#1:2275\n1804#1:2276\n1804#1:2277\n1805#1:2278\n1805#1:2279\n1806#1:2280\n1806#1:2281\n1807#1:2282\n1807#1:2283\n*E\n"})
public final class SliderColors {
    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public SliderColors(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
        this.i = v8;
        this.j = v9;
    }

    @NotNull
    public final SliderColors copy--K518z4(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9) {
        long v10 = v == 16L ? this.a : v;
        long v11 = v1 == 16L ? this.b : v1;
        long v12 = v2 == 16L ? this.c : v2;
        long v13 = v3 == 16L ? this.d : v3;
        long v14 = v4 == 16L ? this.e : v4;
        long v15 = v5 == 16L ? this.f : v5;
        long v16 = v6 == 16L ? this.g : v6;
        long v17 = v7 == 16L ? this.h : v7;
        long v18 = v8 == 16L ? this.i : v8;
        return v9 == 16L ? new SliderColors(v10, v11, v12, v13, v14, v15, v16, v17, v18, this.j, null) : new SliderColors(v10, v11, v12, v13, v14, v15, v16, v17, v18, v9, null);
    }

    public static SliderColors copy--K518z4$default(SliderColors sliderColors0, long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, int v10, Object object0) {
        long v11 = (v10 & 1) == 0 ? v : sliderColors0.a;
        long v12 = (v10 & 2) == 0 ? v1 : sliderColors0.b;
        long v13 = (v10 & 4) == 0 ? v2 : sliderColors0.c;
        long v14 = (v10 & 8) == 0 ? v3 : sliderColors0.d;
        long v15 = (v10 & 16) == 0 ? v4 : sliderColors0.e;
        long v16 = (v10 & 0x20) == 0 ? v5 : sliderColors0.f;
        long v17 = (v10 & 0x40) == 0 ? v6 : sliderColors0.g;
        long v18 = (v10 & 0x80) == 0 ? v7 : sliderColors0.h;
        long v19 = (v10 & 0x100) == 0 ? v8 : sliderColors0.i;
        return (v10 & 0x200) == 0 ? sliderColors0.copy--K518z4(v11, v12, v13, v14, v15, v16, v17, v18, v19, v9) : sliderColors0.copy--K518z4(v11, v12, v13, v14, v15, v16, v17, v18, v19, sliderColors0.j);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof SliderColors) || !Color.equals-impl0(this.a, ((SliderColors)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((SliderColors)object0).b)) {
            return false;
        }
        if(!Color.equals-impl0(this.c, ((SliderColors)object0).c)) {
            return false;
        }
        if(!Color.equals-impl0(this.d, ((SliderColors)object0).d)) {
            return false;
        }
        if(!Color.equals-impl0(this.e, ((SliderColors)object0).e)) {
            return false;
        }
        if(!Color.equals-impl0(this.f, ((SliderColors)object0).f)) {
            return false;
        }
        if(!Color.equals-impl0(this.g, ((SliderColors)object0).g)) {
            return false;
        }
        if(!Color.equals-impl0(this.h, ((SliderColors)object0).h)) {
            return false;
        }
        return Color.equals-impl0(this.i, ((SliderColors)object0).i) ? Color.equals-impl0(this.j, ((SliderColors)object0).j) : false;
    }

    public final long getActiveTickColor-0d7_KjU() {
        return this.c;
    }

    public final long getActiveTrackColor-0d7_KjU() {
        return this.b;
    }

    public final long getDisabledActiveTickColor-0d7_KjU() {
        return this.h;
    }

    public final long getDisabledActiveTrackColor-0d7_KjU() {
        return this.g;
    }

    public final long getDisabledInactiveTickColor-0d7_KjU() {
        return this.j;
    }

    public final long getDisabledInactiveTrackColor-0d7_KjU() {
        return this.i;
    }

    public final long getDisabledThumbColor-0d7_KjU() {
        return this.f;
    }

    public final long getInactiveTickColor-0d7_KjU() {
        return this.e;
    }

    public final long getInactiveTrackColor-0d7_KjU() {
        return this.d;
    }

    public final long getThumbColor-0d7_KjU() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.j) + a.a(this.i, a.a(this.h, a.a(this.g, a.a(this.f, a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long thumbColor-vNxB06k$material3_release(boolean z) {
        return z ? this.a : this.f;
    }

    @Stable
    public final long tickColor-WaAFU9c$material3_release(boolean z, boolean z1) {
        if(z) {
            return z1 ? this.c : this.e;
        }
        return z1 ? this.h : this.j;
    }

    @Stable
    public final long trackColor-WaAFU9c$material3_release(boolean z, boolean z1) {
        if(z) {
            return z1 ? this.b : this.d;
        }
        return z1 ? this.g : this.i;
    }
}

