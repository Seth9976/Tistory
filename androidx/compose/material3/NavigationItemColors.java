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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u00A2\u0006\u0004\b\n\u0010\u000BJV\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\u000FH\u0007\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\u000FH\u0007\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0013J\u001A\u0010\u0018\u001A\u00020\u000F2\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CR\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u001D\u0010\u0004\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b!\u0010\u001E\u001A\u0004\b\"\u0010 R\u001D\u0010\u0005\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b#\u0010\u001E\u001A\u0004\b$\u0010 R\u001D\u0010\u0006\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b%\u0010\u001E\u001A\u0004\b&\u0010 R\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\'\u0010\u001E\u001A\u0004\b(\u0010 R\u001D\u0010\b\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b)\u0010\u001E\u001A\u0004\b*\u0010 R\u001D\u0010\t\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b+\u0010\u001E\u001A\u0004\b,\u0010 \u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006-"}, d2 = {"Landroidx/compose/material3/NavigationItemColors;", "", "Landroidx/compose/ui/graphics/Color;", "selectedIconColor", "selectedTextColor", "selectedIndicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "<init>", "(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-4JmcsL4", "(JJJJJJJ)Landroidx/compose/material3/NavigationItemColors;", "copy", "", "selected", "enabled", "iconColor-WaAFU9c", "(ZZ)J", "iconColor", "textColor-WaAFU9c", "textColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getSelectedIconColor-0d7_KjU", "()J", "b", "getSelectedTextColor-0d7_KjU", "c", "getSelectedIndicatorColor-0d7_KjU", "d", "getUnselectedIconColor-0d7_KjU", "e", "getUnselectedTextColor-0d7_KjU", "f", "getDisabledIconColor-0d7_KjU", "g", "getDisabledTextColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,731:1\n708#2:732\n696#2:733\n708#2:734\n696#2:735\n708#2:736\n696#2:737\n708#2:738\n696#2:739\n708#2:740\n696#2:741\n708#2:742\n696#2:743\n708#2:744\n696#2:745\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemColors\n*L\n135#1:732\n135#1:733\n136#1:734\n136#1:735\n137#1:736\n137#1:737\n138#1:738\n138#1:739\n139#1:740\n139#1:741\n140#1:742\n140#1:743\n141#1:744\n141#1:745\n*E\n"})
public final class NavigationItemColors {
    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public NavigationItemColors(long v, long v1, long v2, long v3, long v4, long v5, long v6, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
    }

    @NotNull
    public final NavigationItemColors copy-4JmcsL4(long v, long v1, long v2, long v3, long v4, long v5, long v6) {
        long v7 = v == 16L ? this.a : v;
        long v8 = v1 == 16L ? this.b : v1;
        long v9 = v2 == 16L ? this.c : v2;
        long v10 = v3 == 16L ? this.d : v3;
        long v11 = v4 == 16L ? this.e : v4;
        long v12 = v5 == 16L ? this.f : v5;
        return v6 == 16L ? new NavigationItemColors(v7, v8, v9, v10, v11, v12, this.g, null) : new NavigationItemColors(v7, v8, v9, v10, v11, v12, v6, null);
    }

    public static NavigationItemColors copy-4JmcsL4$default(NavigationItemColors navigationItemColors0, long v, long v1, long v2, long v3, long v4, long v5, long v6, int v7, Object object0) {
        long v8 = (v7 & 1) == 0 ? v : navigationItemColors0.a;
        long v9 = (v7 & 2) == 0 ? v1 : navigationItemColors0.b;
        long v10 = (v7 & 4) == 0 ? v2 : navigationItemColors0.c;
        long v11 = (v7 & 8) == 0 ? v3 : navigationItemColors0.d;
        long v12 = (v7 & 16) == 0 ? v4 : navigationItemColors0.e;
        long v13 = (v7 & 0x20) == 0 ? v5 : navigationItemColors0.f;
        return (v7 & 0x40) == 0 ? navigationItemColors0.copy-4JmcsL4(v8, v9, v10, v11, v12, v13, v6) : navigationItemColors0.copy-4JmcsL4(v8, v9, v10, v11, v12, v13, navigationItemColors0.g);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof NavigationItemColors) || !Color.equals-impl0(this.a, ((NavigationItemColors)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.d, ((NavigationItemColors)object0).d)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((NavigationItemColors)object0).b)) {
            return false;
        }
        if(!Color.equals-impl0(this.e, ((NavigationItemColors)object0).e)) {
            return false;
        }
        if(!Color.equals-impl0(this.c, ((NavigationItemColors)object0).c)) {
            return false;
        }
        return Color.equals-impl0(this.f, ((NavigationItemColors)object0).f) ? Color.equals-impl0(this.g, ((NavigationItemColors)object0).g) : false;
    }

    public final long getDisabledIconColor-0d7_KjU() {
        return this.f;
    }

    public final long getDisabledTextColor-0d7_KjU() {
        return this.g;
    }

    public final long getSelectedIconColor-0d7_KjU() {
        return this.a;
    }

    public final long getSelectedIndicatorColor-0d7_KjU() {
        return this.c;
    }

    public final long getSelectedTextColor-0d7_KjU() {
        return this.b;
    }

    public final long getUnselectedIconColor-0d7_KjU() {
        return this.d;
    }

    public final long getUnselectedTextColor-0d7_KjU() {
        return this.e;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.g) + a.a(this.f, a.a(this.c, a.a(this.e, a.a(this.b, a.a(this.d, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Stable
    public final long iconColor-WaAFU9c(boolean z, boolean z1) {
        if(!z1) {
            return this.f;
        }
        return z ? this.a : this.d;
    }

    @Stable
    public final long textColor-WaAFU9c(boolean z, boolean z1) {
        if(!z1) {
            return this.g;
        }
        return z ? this.b : this.e;
    }
}

