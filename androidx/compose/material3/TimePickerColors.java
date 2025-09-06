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

@ExperimentalMaterial3Api
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\b\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\u0002\u0012\u0006\u0010\r\u001A\u00020\u0002\u0012\u0006\u0010\u000E\u001A\u00020\u0002\u0012\u0006\u0010\u000F\u001A\u00020\u0002\u0012\u0006\u0010\u0010\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u009C\u0001\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\u00022\b\b\u0002\u0010\u000F\u001A\u00020\u00022\b\b\u0002\u0010\u0010\u001A\u00020\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u001D\u0010\u001A\u001A\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u0016H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001D\u0010\u001C\u001A\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u0016H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u0019J\u001D\u0010\u001E\u001A\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u0016H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u0019J\u001D\u0010 \u001A\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u0016H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010\u0019J\u001D\u0010\"\u001A\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u0016H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\u0019J\u001A\u0010$\u001A\u00020\u00162\b\u0010#\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b$\u0010%J\u000F\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b\'\u0010(R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R\u001D\u0010\u0004\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b-\u0010*\u001A\u0004\b.\u0010,R\u001D\u0010\u0005\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b/\u0010*\u001A\u0004\b0\u0010,R\u001D\u0010\u0006\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b1\u0010*\u001A\u0004\b2\u0010,R\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b3\u0010*\u001A\u0004\b4\u0010,R\u001D\u0010\b\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b5\u0010*\u001A\u0004\b6\u0010,R\u001D\u0010\t\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b7\u0010*\u001A\u0004\b8\u0010,R\u001D\u0010\n\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b9\u0010*\u001A\u0004\b:\u0010,R\u001D\u0010\u000B\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b;\u0010*\u001A\u0004\b<\u0010,R\u001D\u0010\f\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b=\u0010*\u001A\u0004\b>\u0010,R\u001D\u0010\r\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b?\u0010*\u001A\u0004\b@\u0010,R\u001D\u0010\u000E\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bA\u0010*\u001A\u0004\bB\u0010,R\u001D\u0010\u000F\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bC\u0010*\u001A\u0004\bD\u0010,R\u001D\u0010\u0010\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bE\u0010*\u001A\u0004\bF\u0010,\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006G"}, d2 = {"Landroidx/compose/material3/TimePickerColors;", "", "Landroidx/compose/ui/graphics/Color;", "clockDialColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "<init>", "(JJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-dVHXu7A", "(JJJJJJJJJJJJJJ)Landroidx/compose/material3/TimePickerColors;", "copy", "", "selected", "periodSelectorContainerColor-vNxB06k$material3_release", "(Z)J", "periodSelectorContainerColor", "periodSelectorContentColor-vNxB06k$material3_release", "periodSelectorContentColor", "timeSelectorContainerColor-vNxB06k$material3_release", "timeSelectorContainerColor", "timeSelectorContentColor-vNxB06k$material3_release", "timeSelectorContentColor", "clockDialContentColor-vNxB06k$material3_release", "clockDialContentColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getClockDialColor-0d7_KjU", "()J", "b", "getSelectorColor-0d7_KjU", "c", "getContainerColor-0d7_KjU", "d", "getPeriodSelectorBorderColor-0d7_KjU", "e", "getClockDialSelectedContentColor-0d7_KjU", "f", "getClockDialUnselectedContentColor-0d7_KjU", "g", "getPeriodSelectorSelectedContainerColor-0d7_KjU", "h", "getPeriodSelectorUnselectedContainerColor-0d7_KjU", "i", "getPeriodSelectorSelectedContentColor-0d7_KjU", "j", "getPeriodSelectorUnselectedContentColor-0d7_KjU", "k", "getTimeSelectorSelectedContainerColor-0d7_KjU", "l", "getTimeSelectorUnselectedContainerColor-0d7_KjU", "m", "getTimeSelectorSelectedContentColor-0d7_KjU", "n", "getTimeSelectorUnselectedContentColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2008:1\n708#2:2009\n696#2:2010\n708#2:2011\n696#2:2012\n708#2:2013\n696#2:2014\n708#2:2015\n696#2:2016\n708#2:2017\n696#2:2018\n708#2:2019\n696#2:2020\n708#2:2021\n696#2:2022\n708#2:2023\n696#2:2024\n708#2:2025\n696#2:2026\n708#2:2027\n696#2:2028\n708#2:2029\n696#2:2030\n708#2:2031\n696#2:2032\n708#2:2033\n696#2:2034\n708#2:2035\n696#2:2036\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerColors\n*L\n440#1:2009\n440#1:2010\n441#1:2011\n441#1:2012\n442#1:2013\n442#1:2014\n443#1:2015\n443#1:2016\n444#1:2017\n444#1:2018\n445#1:2019\n445#1:2020\n446#1:2021\n446#1:2022\n449#1:2023\n449#1:2024\n452#1:2025\n452#1:2026\n455#1:2027\n455#1:2028\n458#1:2029\n458#1:2030\n461#1:2031\n461#1:2032\n464#1:2033\n464#1:2034\n465#1:2035\n465#1:2036\n*E\n"})
public final class TimePickerColors {
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

    public TimePickerColors(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, DefaultConstructorMarker defaultConstructorMarker0) {
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
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long clockDialContentColor-vNxB06k$material3_release(boolean z) {
        return z ? this.e : this.f;
    }

    @NotNull
    public final TimePickerColors copy-dVHXu7A(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13) {
        long v14 = v == 16L ? this.a : v;
        long v15 = v1 == 16L ? this.b : v1;
        long v16 = v2 == 16L ? this.c : v2;
        long v17 = v3 == 16L ? this.d : v3;
        long v18 = v4 == 16L ? this.e : v4;
        long v19 = v5 == 16L ? this.f : v5;
        long v20 = v6 == 16L ? this.g : v6;
        long v21 = v7 == 16L ? this.h : v7;
        long v22 = v8 == 16L ? this.i : v8;
        long v23 = v9 == 16L ? this.j : v9;
        long v24 = v10 == 16L ? this.k : v10;
        long v25 = v11 == 16L ? this.l : v11;
        long v26 = v12 == 16L ? this.m : v12;
        return v13 == 16L ? new TimePickerColors(v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, this.n, null) : new TimePickerColors(v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v13, null);
    }

    public static TimePickerColors copy-dVHXu7A$default(TimePickerColors timePickerColors0, long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, int v14, Object object0) {
        long v15 = (v14 & 1) == 0 ? v : timePickerColors0.c;
        long v16 = (v14 & 2) == 0 ? v1 : timePickerColors0.b;
        long v17 = (v14 & 4) == 0 ? v2 : timePickerColors0.c;
        long v18 = (v14 & 8) == 0 ? v3 : timePickerColors0.d;
        long v19 = (v14 & 16) == 0 ? v4 : timePickerColors0.e;
        long v20 = (v14 & 0x20) == 0 ? v5 : timePickerColors0.f;
        long v21 = (v14 & 0x40) == 0 ? v6 : timePickerColors0.g;
        long v22 = (v14 & 0x80) == 0 ? v7 : timePickerColors0.h;
        long v23 = (v14 & 0x100) == 0 ? v8 : timePickerColors0.i;
        long v24 = (v14 & 0x200) == 0 ? v9 : timePickerColors0.j;
        long v25 = (v14 & 0x400) == 0 ? v10 : timePickerColors0.k;
        long v26 = (v14 & 0x800) == 0 ? v11 : timePickerColors0.l;
        long v27 = (v14 & 0x1000) == 0 ? v12 : timePickerColors0.m;
        return (v14 & 0x2000) == 0 ? timePickerColors0.copy-dVHXu7A(v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v13) : timePickerColors0.copy-dVHXu7A(v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, timePickerColors0.n);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        Class class0 = object0.getClass();
        if(TimePickerColors.class != class0) {
            return false;
        }
        if(!Color.equals-impl0(this.a, ((TimePickerColors)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((TimePickerColors)object0).b)) {
            return false;
        }
        if(!Color.equals-impl0(this.c, ((TimePickerColors)object0).c)) {
            return false;
        }
        if(!Color.equals-impl0(this.d, ((TimePickerColors)object0).d)) {
            return false;
        }
        if(!Color.equals-impl0(this.g, ((TimePickerColors)object0).g)) {
            return false;
        }
        if(!Color.equals-impl0(this.h, ((TimePickerColors)object0).h)) {
            return false;
        }
        if(!Color.equals-impl0(this.i, ((TimePickerColors)object0).i)) {
            return false;
        }
        if(!Color.equals-impl0(this.j, ((TimePickerColors)object0).j)) {
            return false;
        }
        if(!Color.equals-impl0(this.k, ((TimePickerColors)object0).k)) {
            return false;
        }
        if(!Color.equals-impl0(this.l, ((TimePickerColors)object0).l)) {
            return false;
        }
        return Color.equals-impl0(this.m, ((TimePickerColors)object0).m) ? Color.equals-impl0(this.n, ((TimePickerColors)object0).n) : false;
    }

    public final long getClockDialColor-0d7_KjU() {
        return this.a;
    }

    public final long getClockDialSelectedContentColor-0d7_KjU() {
        return this.e;
    }

    public final long getClockDialUnselectedContentColor-0d7_KjU() {
        return this.f;
    }

    public final long getContainerColor-0d7_KjU() {
        return this.c;
    }

    public final long getPeriodSelectorBorderColor-0d7_KjU() {
        return this.d;
    }

    public final long getPeriodSelectorSelectedContainerColor-0d7_KjU() {
        return this.g;
    }

    public final long getPeriodSelectorSelectedContentColor-0d7_KjU() {
        return this.i;
    }

    public final long getPeriodSelectorUnselectedContainerColor-0d7_KjU() {
        return this.h;
    }

    public final long getPeriodSelectorUnselectedContentColor-0d7_KjU() {
        return this.j;
    }

    public final long getSelectorColor-0d7_KjU() {
        return this.b;
    }

    public final long getTimeSelectorSelectedContainerColor-0d7_KjU() {
        return this.k;
    }

    public final long getTimeSelectorSelectedContentColor-0d7_KjU() {
        return this.m;
    }

    public final long getTimeSelectorUnselectedContainerColor-0d7_KjU() {
        return this.l;
    }

    public final long getTimeSelectorUnselectedContentColor-0d7_KjU() {
        return this.n;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.n) + a.a(this.m, a.a(this.l, a.a(this.k, a.a(this.j, a.a(this.i, a.a(this.h, a.a(this.g, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long periodSelectorContainerColor-vNxB06k$material3_release(boolean z) {
        return z ? this.g : this.h;
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long periodSelectorContentColor-vNxB06k$material3_release(boolean z) {
        return z ? this.i : this.j;
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long timeSelectorContainerColor-vNxB06k$material3_release(boolean z) {
        return z ? this.k : this.l;
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long timeSelectorContentColor-vNxB06k$material3_release(boolean z) {
        return z ? this.m : this.n;
    }
}

