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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u00A2\u0006\u0004\b\u000B\u0010\fJ`\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\r\u0010\u000EJ\u001D\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0010H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u001D\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0010H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0013J\u001D\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0010H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0013J\u001D\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0010H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0013J\u001A\u0010\u0018\u001A\u00020\u00102\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CR\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u001D\u0010\u0004\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b!\u0010\u001E\u001A\u0004\b\"\u0010 R\u001D\u0010\u0005\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b#\u0010\u001E\u001A\u0004\b$\u0010 R\u001D\u0010\u0006\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b%\u0010\u001E\u001A\u0004\b&\u0010 R\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\'\u0010\u001E\u001A\u0004\b(\u0010 R\u001D\u0010\b\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b)\u0010\u001E\u001A\u0004\b*\u0010 R\u001D\u0010\t\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b+\u0010\u001E\u001A\u0004\b,\u0010 R\u001D\u0010\n\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b-\u0010\u001E\u001A\u0004\b.\u0010 \u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006/"}, d2 = {"Landroidx/compose/material3/ChipColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-FD3wquc", "(JJJJJJJJ)Landroidx/compose/material3/ChipColors;", "copy", "", "enabled", "containerColor-vNxB06k$material3_release", "(Z)J", "labelColor-vNxB06k$material3_release", "leadingIconContentColor-vNxB06k$material3_release", "trailingIconContentColor-vNxB06k$material3_release", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getContainerColor-0d7_KjU", "()J", "b", "getLabelColor-0d7_KjU", "c", "getLeadingIconContentColor-0d7_KjU", "d", "getTrailingIconContentColor-0d7_KjU", "e", "getDisabledContainerColor-0d7_KjU", "f", "getDisabledLabelColor-0d7_KjU", "g", "getDisabledLeadingIconContentColor-0d7_KjU", "h", "getDisabledTrailingIconContentColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2787:1\n708#2:2788\n696#2:2789\n708#2:2790\n696#2:2791\n708#2:2792\n696#2:2793\n708#2:2794\n696#2:2795\n708#2:2796\n696#2:2797\n708#2:2798\n696#2:2799\n708#2:2800\n696#2:2801\n708#2:2802\n696#2:2803\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipColors\n*L\n2461#1:2788\n2461#1:2789\n2462#1:2790\n2462#1:2791\n2463#1:2792\n2463#1:2793\n2464#1:2794\n2464#1:2795\n2465#1:2796\n2465#1:2797\n2466#1:2798\n2466#1:2799\n2467#1:2800\n2467#1:2801\n2468#1:2802\n2468#1:2803\n*E\n"})
public final class ChipColors {
    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public ChipColors(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long containerColor-vNxB06k$material3_release(boolean z) {
        return z ? this.a : this.e;
    }

    @NotNull
    public final ChipColors copy-FD3wquc(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7) {
        long v8 = v == 16L ? this.a : v;
        long v9 = v1 == 16L ? this.b : v1;
        long v10 = v2 == 16L ? this.c : v2;
        long v11 = v3 == 16L ? this.d : v3;
        long v12 = v4 == 16L ? this.e : v4;
        long v13 = v5 == 16L ? this.f : v5;
        long v14 = v6 == 16L ? this.g : v6;
        return v7 == 16L ? new ChipColors(v8, v9, v10, v11, v12, v13, v14, this.h, null) : new ChipColors(v8, v9, v10, v11, v12, v13, v14, v7, null);
    }

    public static ChipColors copy-FD3wquc$default(ChipColors chipColors0, long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, int v8, Object object0) {
        long v9 = (v8 & 1) == 0 ? v : chipColors0.a;
        long v10 = (v8 & 2) == 0 ? v1 : chipColors0.b;
        long v11 = (v8 & 4) == 0 ? v2 : chipColors0.c;
        long v12 = (v8 & 8) == 0 ? v3 : chipColors0.d;
        long v13 = (v8 & 16) == 0 ? v4 : chipColors0.e;
        long v14 = (v8 & 0x20) == 0 ? v5 : chipColors0.f;
        long v15 = (v8 & 0x40) == 0 ? v6 : chipColors0.g;
        return (v8 & 0x80) == 0 ? chipColors0.copy-FD3wquc(v9, v10, v11, v12, v13, v14, v15, v7) : chipColors0.copy-FD3wquc(v9, v10, v11, v12, v13, v14, v15, chipColors0.h);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof ChipColors) || !Color.equals-impl0(this.a, ((ChipColors)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((ChipColors)object0).b)) {
            return false;
        }
        if(!Color.equals-impl0(this.c, ((ChipColors)object0).c)) {
            return false;
        }
        if(!Color.equals-impl0(this.d, ((ChipColors)object0).d)) {
            return false;
        }
        if(!Color.equals-impl0(this.e, ((ChipColors)object0).e)) {
            return false;
        }
        if(!Color.equals-impl0(this.f, ((ChipColors)object0).f)) {
            return false;
        }
        return Color.equals-impl0(this.g, ((ChipColors)object0).g) ? Color.equals-impl0(this.h, ((ChipColors)object0).h) : false;
    }

    public final long getContainerColor-0d7_KjU() {
        return this.a;
    }

    public final long getDisabledContainerColor-0d7_KjU() {
        return this.e;
    }

    public final long getDisabledLabelColor-0d7_KjU() {
        return this.f;
    }

    public final long getDisabledLeadingIconContentColor-0d7_KjU() {
        return this.g;
    }

    public final long getDisabledTrailingIconContentColor-0d7_KjU() {
        return this.h;
    }

    public final long getLabelColor-0d7_KjU() {
        return this.b;
    }

    public final long getLeadingIconContentColor-0d7_KjU() {
        return this.c;
    }

    public final long getTrailingIconContentColor-0d7_KjU() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.h) + a.a(this.g, a.a(this.f, a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long labelColor-vNxB06k$material3_release(boolean z) {
        return z ? this.b : this.f;
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long leadingIconContentColor-vNxB06k$material3_release(boolean z) {
        return z ? this.c : this.g;
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long trailingIconContentColor-vNxB06k$material3_release(boolean z) {
        return z ? this.d : this.h;
    }
}

