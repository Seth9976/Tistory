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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000B\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b%\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\u0002\u0012\u0006\u0010\r\u001A\u00020\u0002\u0012\u0006\u0010\u000E\u001A\u00020\u0002\u0012\u0006\u0010\u000F\u001A\u00020\u0002\u0012\u0006\u0010\u0010\u001A\u00020\u0002\u0012\u0006\u0010\u0011\u001A\u00020\u0002\u0012\u0006\u0010\u0012\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u00B0\u0001\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\u00022\b\b\u0002\u0010\u000F\u001A\u00020\u00022\b\b\u0002\u0010\u0010\u001A\u00020\u00022\b\b\u0002\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0012\u001A\u00020\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001D\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001A\u001A\u00020\u0018H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ%\u0010\u001F\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001A\u001A\u00020\u0018H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001CJ%\u0010!\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001A\u001A\u00020\u0018H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010\u001CJ%\u0010#\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001A\u001A\u00020\u0018H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010\u001CJ\u001A\u0010%\u001A\u00020\u00182\b\u0010$\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010(\u001A\u00020\'H\u0016\u00A2\u0006\u0004\b(\u0010)R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R\u001D\u0010\u0004\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b.\u0010+\u001A\u0004\b/\u0010-R\u001D\u0010\u0005\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b0\u0010+\u001A\u0004\b1\u0010-R\u001D\u0010\u0006\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b2\u0010+\u001A\u0004\b3\u0010-R\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b4\u0010+\u001A\u0004\b5\u0010-R\u001D\u0010\b\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b6\u0010+\u001A\u0004\b7\u0010-R\u001D\u0010\t\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b8\u0010+\u001A\u0004\b9\u0010-R\u001D\u0010\n\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b:\u0010+\u001A\u0004\b;\u0010-R\u001D\u0010\u000B\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b<\u0010+\u001A\u0004\b=\u0010-R\u001D\u0010\f\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b>\u0010+\u001A\u0004\b?\u0010-R\u001D\u0010\r\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b@\u0010+\u001A\u0004\bA\u0010-R\u001D\u0010\u000E\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bB\u0010+\u001A\u0004\bC\u0010-R\u001D\u0010\u000F\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bD\u0010+\u001A\u0004\bE\u0010-R\u001D\u0010\u0010\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bF\u0010+\u001A\u0004\bG\u0010-R\u001D\u0010\u0011\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bH\u0010+\u001A\u0004\bI\u0010-R\u001D\u0010\u0012\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bJ\u0010+\u001A\u0004\bK\u0010-\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006L"}, d2 = {"Landroidx/compose/material3/SwitchColors;", "", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "<init>", "(JJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-Q_H9qLU", "(JJJJJJJJJJJJJJJJ)Landroidx/compose/material3/SwitchColors;", "copy", "", "enabled", "checked", "thumbColor-WaAFU9c$material3_release", "(ZZ)J", "thumbColor", "trackColor-WaAFU9c$material3_release", "trackColor", "borderColor-WaAFU9c$material3_release", "borderColor", "iconColor-WaAFU9c$material3_release", "iconColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getCheckedThumbColor-0d7_KjU", "()J", "b", "getCheckedTrackColor-0d7_KjU", "c", "getCheckedBorderColor-0d7_KjU", "d", "getCheckedIconColor-0d7_KjU", "e", "getUncheckedThumbColor-0d7_KjU", "f", "getUncheckedTrackColor-0d7_KjU", "g", "getUncheckedBorderColor-0d7_KjU", "h", "getUncheckedIconColor-0d7_KjU", "i", "getDisabledCheckedThumbColor-0d7_KjU", "j", "getDisabledCheckedTrackColor-0d7_KjU", "k", "getDisabledCheckedBorderColor-0d7_KjU", "l", "getDisabledCheckedIconColor-0d7_KjU", "m", "getDisabledUncheckedThumbColor-0d7_KjU", "n", "getDisabledUncheckedTrackColor-0d7_KjU", "o", "getDisabledUncheckedBorderColor-0d7_KjU", "p", "getDisabledUncheckedIconColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,625:1\n708#2:626\n696#2:627\n708#2:628\n696#2:629\n708#2:630\n696#2:631\n708#2:632\n696#2:633\n708#2:634\n696#2:635\n708#2:636\n696#2:637\n708#2:638\n696#2:639\n708#2:640\n696#2:641\n708#2:642\n696#2:643\n708#2:644\n696#2:645\n708#2:646\n696#2:647\n708#2:648\n696#2:649\n708#2:650\n696#2:651\n708#2:652\n696#2:653\n708#2:654\n696#2:655\n708#2:656\n696#2:657\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchColors\n*L\n497#1:626\n497#1:627\n498#1:628\n498#1:629\n499#1:630\n499#1:631\n500#1:632\n500#1:633\n501#1:634\n501#1:635\n502#1:636\n502#1:637\n503#1:638\n503#1:639\n504#1:640\n504#1:641\n505#1:642\n505#1:643\n506#1:644\n506#1:645\n507#1:646\n507#1:647\n508#1:648\n508#1:649\n509#1:650\n509#1:651\n510#1:652\n510#1:653\n511#1:654\n511#1:655\n512#1:656\n512#1:657\n*E\n"})
public final class SwitchColors {
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
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;

    public SwitchColors(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, DefaultConstructorMarker defaultConstructorMarker0) {
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
        this.k = v10;
        this.l = v11;
        this.m = v12;
        this.n = v13;
        this.o = v14;
        this.p = v15;
    }

    @Stable
    public final long borderColor-WaAFU9c$material3_release(boolean z, boolean z1) {
        if(z) {
            return z1 ? this.c : this.g;
        }
        return z1 ? this.k : this.o;
    }

    @NotNull
    public final SwitchColors copy-Q_H9qLU(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15) {
        long v16 = v == 16L ? this.a : v;
        long v17 = v1 == 16L ? this.b : v1;
        long v18 = v2 == 16L ? this.c : v2;
        long v19 = v3 == 16L ? this.d : v3;
        long v20 = v4 == 16L ? this.e : v4;
        long v21 = v5 == 16L ? this.f : v5;
        long v22 = v6 == 16L ? this.g : v6;
        long v23 = v7 == 16L ? this.h : v7;
        long v24 = v8 == 16L ? this.i : v8;
        long v25 = v9 == 16L ? this.j : v9;
        long v26 = v10 == 16L ? this.k : v10;
        long v27 = v11 == 16L ? this.l : v11;
        long v28 = v12 == 16L ? this.m : v12;
        long v29 = v13 == 16L ? this.n : v13;
        long v30 = v14 == 16L ? this.o : v14;
        return v15 == 16L ? new SwitchColors(v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, v30, this.p, null) : new SwitchColors(v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, v30, v15, null);
    }

    public static SwitchColors copy-Q_H9qLU$default(SwitchColors switchColors0, long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, int v16, Object object0) {
        long v17 = (v16 & 1) == 0 ? v : switchColors0.a;
        long v18 = (v16 & 2) == 0 ? v1 : switchColors0.b;
        long v19 = (v16 & 4) == 0 ? v2 : switchColors0.c;
        long v20 = (v16 & 8) == 0 ? v3 : switchColors0.d;
        long v21 = (v16 & 16) == 0 ? v4 : switchColors0.e;
        long v22 = (v16 & 0x20) == 0 ? v5 : switchColors0.f;
        long v23 = (v16 & 0x40) == 0 ? v6 : switchColors0.g;
        long v24 = (v16 & 0x80) == 0 ? v7 : switchColors0.h;
        long v25 = (v16 & 0x100) == 0 ? v8 : switchColors0.i;
        long v26 = (v16 & 0x200) == 0 ? v9 : switchColors0.j;
        long v27 = (v16 & 0x400) == 0 ? v10 : switchColors0.k;
        long v28 = (v16 & 0x800) == 0 ? v11 : switchColors0.l;
        long v29 = (v16 & 0x1000) == 0 ? v12 : switchColors0.m;
        long v30 = (v16 & 0x2000) == 0 ? v13 : switchColors0.n;
        long v31 = (v16 & 0x4000) == 0 ? v14 : switchColors0.o;
        return (v16 & 0x8000) == 0 ? switchColors0.copy-Q_H9qLU(v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, v30, v31, v15) : switchColors0.copy-Q_H9qLU(v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, v30, v31, switchColors0.p);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof SwitchColors) || !Color.equals-impl0(this.a, ((SwitchColors)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((SwitchColors)object0).b)) {
            return false;
        }
        if(!Color.equals-impl0(this.c, ((SwitchColors)object0).c)) {
            return false;
        }
        if(!Color.equals-impl0(this.d, ((SwitchColors)object0).d)) {
            return false;
        }
        if(!Color.equals-impl0(this.e, ((SwitchColors)object0).e)) {
            return false;
        }
        if(!Color.equals-impl0(this.f, ((SwitchColors)object0).f)) {
            return false;
        }
        if(!Color.equals-impl0(this.g, ((SwitchColors)object0).g)) {
            return false;
        }
        if(!Color.equals-impl0(this.h, ((SwitchColors)object0).h)) {
            return false;
        }
        if(!Color.equals-impl0(this.i, ((SwitchColors)object0).i)) {
            return false;
        }
        if(!Color.equals-impl0(this.j, ((SwitchColors)object0).j)) {
            return false;
        }
        if(!Color.equals-impl0(this.k, ((SwitchColors)object0).k)) {
            return false;
        }
        if(!Color.equals-impl0(this.l, ((SwitchColors)object0).l)) {
            return false;
        }
        if(!Color.equals-impl0(this.m, ((SwitchColors)object0).m)) {
            return false;
        }
        if(!Color.equals-impl0(this.n, ((SwitchColors)object0).n)) {
            return false;
        }
        return Color.equals-impl0(this.o, ((SwitchColors)object0).o) ? Color.equals-impl0(this.p, ((SwitchColors)object0).p) : false;
    }

    public final long getCheckedBorderColor-0d7_KjU() {
        return this.c;
    }

    public final long getCheckedIconColor-0d7_KjU() {
        return this.d;
    }

    public final long getCheckedThumbColor-0d7_KjU() {
        return this.a;
    }

    public final long getCheckedTrackColor-0d7_KjU() {
        return this.b;
    }

    public final long getDisabledCheckedBorderColor-0d7_KjU() {
        return this.k;
    }

    public final long getDisabledCheckedIconColor-0d7_KjU() {
        return this.l;
    }

    public final long getDisabledCheckedThumbColor-0d7_KjU() {
        return this.i;
    }

    public final long getDisabledCheckedTrackColor-0d7_KjU() {
        return this.j;
    }

    public final long getDisabledUncheckedBorderColor-0d7_KjU() {
        return this.o;
    }

    public final long getDisabledUncheckedIconColor-0d7_KjU() {
        return this.p;
    }

    public final long getDisabledUncheckedThumbColor-0d7_KjU() {
        return this.m;
    }

    public final long getDisabledUncheckedTrackColor-0d7_KjU() {
        return this.n;
    }

    public final long getUncheckedBorderColor-0d7_KjU() {
        return this.g;
    }

    public final long getUncheckedIconColor-0d7_KjU() {
        return this.h;
    }

    public final long getUncheckedThumbColor-0d7_KjU() {
        return this.e;
    }

    public final long getUncheckedTrackColor-0d7_KjU() {
        return this.f;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.p) + a.a(this.o, a.a(this.n, a.a(this.m, a.a(this.l, a.a(this.k, a.a(this.j, a.a(this.i, a.a(this.h, a.a(this.g, a.a(this.f, a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Stable
    public final long iconColor-WaAFU9c$material3_release(boolean z, boolean z1) {
        if(z) {
            return z1 ? this.d : this.h;
        }
        return z1 ? this.l : this.p;
    }

    @Stable
    public final long thumbColor-WaAFU9c$material3_release(boolean z, boolean z1) {
        if(z) {
            return z1 ? this.a : this.e;
        }
        return z1 ? this.i : this.m;
    }

    @Stable
    public final long trackColor-WaAFU9c$material3_release(boolean z, boolean z1) {
        if(z) {
            return z1 ? this.b : this.f;
        }
        return z1 ? this.j : this.n;
    }
}

