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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u001D\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\u0002\u0012\u0006\u0010\r\u001A\u00020\u0002\u0012\u0006\u0010\u000E\u001A\u00020\u0002\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0088\u0001\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0019\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0014H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001C\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u001A\u001A\u00020\u0014H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u0018J%\u0010\u001E\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0014H\u0001\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u0018J\u001A\u0010 \u001A\u00020\u00142\b\u0010\u001F\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b \u0010!J\u000F\u0010#\u001A\u00020\"H\u0016\u00A2\u0006\u0004\b#\u0010$R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(R\u001D\u0010\u0004\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b)\u0010&\u001A\u0004\b*\u0010(R\u001D\u0010\u0005\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b+\u0010&\u001A\u0004\b,\u0010(R\u001D\u0010\u0006\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b-\u0010&\u001A\u0004\b.\u0010(R\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b/\u0010&\u001A\u0004\b0\u0010(R\u001D\u0010\b\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b1\u0010&\u001A\u0004\b2\u0010(R\u001D\u0010\t\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b3\u0010&\u001A\u0004\b4\u0010(R\u001D\u0010\n\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b5\u0010&\u001A\u0004\b6\u0010(R\u001D\u0010\u000B\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b7\u0010&\u001A\u0004\b8\u0010(R\u001D\u0010\f\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b9\u0010&\u001A\u0004\b:\u0010(R\u001D\u0010\r\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b;\u0010&\u001A\u0004\b<\u0010(R\u001D\u0010\u000E\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b=\u0010&\u001A\u0004\b>\u0010(\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006?"}, d2 = {"Landroidx/compose/material3/SegmentedButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "activeContainerColor", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material3/SegmentedButtonColors;", "copy", "", "enabled", "active", "borderColor-WaAFU9c$material3_release", "(ZZ)J", "borderColor", "checked", "contentColor-WaAFU9c$material3_release", "contentColor", "containerColor-WaAFU9c$material3_release", "containerColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getActiveContainerColor-0d7_KjU", "()J", "b", "getActiveContentColor-0d7_KjU", "c", "getActiveBorderColor-0d7_KjU", "d", "getInactiveContainerColor-0d7_KjU", "e", "getInactiveContentColor-0d7_KjU", "f", "getInactiveBorderColor-0d7_KjU", "g", "getDisabledActiveContainerColor-0d7_KjU", "h", "getDisabledActiveContentColor-0d7_KjU", "i", "getDisabledActiveBorderColor-0d7_KjU", "j", "getDisabledInactiveContainerColor-0d7_KjU", "k", "getDisabledInactiveContentColor-0d7_KjU", "l", "getDisabledInactiveBorderColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,774:1\n708#2:775\n696#2:776\n708#2:777\n696#2:778\n708#2:779\n696#2:780\n708#2:781\n696#2:782\n708#2:783\n696#2:784\n708#2:785\n696#2:786\n708#2:787\n696#2:788\n708#2:789\n696#2:790\n708#2:791\n696#2:792\n708#2:793\n696#2:794\n708#2:795\n696#2:796\n708#2:797\n696#2:798\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonColors\n*L\n654#1:775\n654#1:776\n655#1:777\n655#1:778\n656#1:779\n656#1:780\n657#1:781\n657#1:782\n658#1:783\n658#1:784\n659#1:785\n659#1:786\n660#1:787\n660#1:788\n661#1:789\n661#1:790\n662#1:791\n662#1:792\n663#1:793\n663#1:794\n664#1:795\n664#1:796\n665#1:797\n665#1:798\n*E\n"})
public final class SegmentedButtonColors {
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

    public SegmentedButtonColors(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, DefaultConstructorMarker defaultConstructorMarker0) {
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
    }

    @Stable
    public final long borderColor-WaAFU9c$material3_release(boolean z, boolean z1) {
        if(z && z1) {
            return this.c;
        }
        if(z && !z1) {
            return this.f;
        }
        return z || !z1 ? this.l : this.i;
    }

    @Stable
    public final long containerColor-WaAFU9c$material3_release(boolean z, boolean z1) {
        if(z && z1) {
            return this.a;
        }
        if(z && !z1) {
            return this.d;
        }
        return z || !z1 ? this.j : this.g;
    }

    @Stable
    public final long contentColor-WaAFU9c$material3_release(boolean z, boolean z1) {
        if(z && z1) {
            return this.b;
        }
        if(z && !z1) {
            return this.e;
        }
        return z || !z1 ? this.k : this.h;
    }

    @NotNull
    public final SegmentedButtonColors copy-2qZNXz8(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11) {
        long v12 = v == 16L ? this.a : v;
        long v13 = v1 == 16L ? this.b : v1;
        long v14 = v2 == 16L ? this.c : v2;
        long v15 = v3 == 16L ? this.d : v3;
        long v16 = v4 == 16L ? this.e : v4;
        long v17 = v5 == 16L ? this.f : v5;
        long v18 = v6 == 16L ? this.g : v6;
        long v19 = v7 == 16L ? this.h : v7;
        long v20 = v8 == 16L ? this.i : v8;
        long v21 = v9 == 16L ? this.j : v9;
        long v22 = v10 == 16L ? this.k : v10;
        return v11 == 16L ? new SegmentedButtonColors(v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, this.l, null) : new SegmentedButtonColors(v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v11, null);
    }

    public static SegmentedButtonColors copy-2qZNXz8$default(SegmentedButtonColors segmentedButtonColors0, long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, int v12, Object object0) {
        long v13 = (v12 & 1) == 0 ? v : segmentedButtonColors0.a;
        long v14 = (v12 & 2) == 0 ? v1 : segmentedButtonColors0.b;
        long v15 = (v12 & 4) == 0 ? v2 : segmentedButtonColors0.c;
        long v16 = (v12 & 8) == 0 ? v3 : segmentedButtonColors0.d;
        long v17 = (v12 & 16) == 0 ? v4 : segmentedButtonColors0.e;
        long v18 = (v12 & 0x20) == 0 ? v5 : segmentedButtonColors0.f;
        long v19 = (v12 & 0x40) == 0 ? v6 : segmentedButtonColors0.g;
        long v20 = (v12 & 0x80) == 0 ? v7 : segmentedButtonColors0.h;
        long v21 = (v12 & 0x100) == 0 ? v8 : segmentedButtonColors0.i;
        long v22 = (v12 & 0x200) == 0 ? v9 : segmentedButtonColors0.j;
        long v23 = (v12 & 0x400) == 0 ? v10 : segmentedButtonColors0.k;
        return (v12 & 0x800) == 0 ? segmentedButtonColors0.copy-2qZNXz8(v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v11) : segmentedButtonColors0.copy-2qZNXz8(v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, segmentedButtonColors0.l);
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
        if(SegmentedButtonColors.class != class0) {
            return false;
        }
        if(!Color.equals-impl0(this.c, ((SegmentedButtonColors)object0).c)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((SegmentedButtonColors)object0).b)) {
            return false;
        }
        if(!Color.equals-impl0(this.a, ((SegmentedButtonColors)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.f, ((SegmentedButtonColors)object0).f)) {
            return false;
        }
        if(!Color.equals-impl0(this.e, ((SegmentedButtonColors)object0).e)) {
            return false;
        }
        if(!Color.equals-impl0(this.d, ((SegmentedButtonColors)object0).d)) {
            return false;
        }
        if(!Color.equals-impl0(this.i, ((SegmentedButtonColors)object0).i)) {
            return false;
        }
        if(!Color.equals-impl0(this.h, ((SegmentedButtonColors)object0).h)) {
            return false;
        }
        if(!Color.equals-impl0(this.g, ((SegmentedButtonColors)object0).g)) {
            return false;
        }
        if(!Color.equals-impl0(this.l, ((SegmentedButtonColors)object0).l)) {
            return false;
        }
        return Color.equals-impl0(this.k, ((SegmentedButtonColors)object0).k) ? Color.equals-impl0(this.j, ((SegmentedButtonColors)object0).j) : false;
    }

    public final long getActiveBorderColor-0d7_KjU() {
        return this.c;
    }

    public final long getActiveContainerColor-0d7_KjU() {
        return this.a;
    }

    public final long getActiveContentColor-0d7_KjU() {
        return this.b;
    }

    public final long getDisabledActiveBorderColor-0d7_KjU() {
        return this.i;
    }

    public final long getDisabledActiveContainerColor-0d7_KjU() {
        return this.g;
    }

    public final long getDisabledActiveContentColor-0d7_KjU() {
        return this.h;
    }

    public final long getDisabledInactiveBorderColor-0d7_KjU() {
        return this.l;
    }

    public final long getDisabledInactiveContainerColor-0d7_KjU() {
        return this.j;
    }

    public final long getDisabledInactiveContentColor-0d7_KjU() {
        return this.k;
    }

    public final long getInactiveBorderColor-0d7_KjU() {
        return this.f;
    }

    public final long getInactiveContainerColor-0d7_KjU() {
        return this.d;
    }

    public final long getInactiveContentColor-0d7_KjU() {
        return this.e;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.j) + a.a(this.k, a.a(this.l, a.a(this.g, a.a(this.h, a.a(this.i, a.a(this.d, a.a(this.e, a.a(this.f, a.a(this.a, a.a(this.b, Color.hashCode-impl(this.c) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }
}

