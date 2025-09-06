package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@ExperimentalMaterial3Api
@Stable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000F\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJB\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\rH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001C\u0010\u0019\u001A\u0004\b\u001D\u0010\u001BR\u001D\u0010\u0005\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001E\u0010\u0019\u001A\u0004\b\u001F\u0010\u001BR\u001D\u0010\u0006\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u0019\u001A\u0004\b!\u0010\u001BR\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u0019\u001A\u0004\b#\u0010\u001B\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/material3/TopAppBarColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-t635Npw", "(JJJJJ)Landroidx/compose/material3/TopAppBarColors;", "copy", "", "colorTransitionFraction", "containerColor-vNxB06k$material3_release", "(F)J", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getContainerColor-0d7_KjU", "()J", "b", "getScrolledContainerColor-0d7_KjU", "c", "getNavigationIconContentColor-0d7_KjU", "d", "getTitleContentColor-0d7_KjU", "e", "getActionIconContentColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2543:1\n708#2:2544\n696#2:2545\n708#2:2546\n696#2:2547\n708#2:2548\n696#2:2549\n708#2:2550\n696#2:2551\n708#2:2552\n696#2:2553\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarColors\n*L\n1436#1:2544\n1436#1:2545\n1437#1:2546\n1437#1:2547\n1438#1:2548\n1438#1:2549\n1439#1:2550\n1439#1:2551\n1440#1:2552\n1440#1:2553\n*E\n"})
public final class TopAppBarColors {
    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public TopAppBarColors(long v, long v1, long v2, long v3, long v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    @Stable
    public final long containerColor-vNxB06k$material3_release(float f) {
        float f1 = EasingKt.getFastOutLinearInEasing().transform(f);
        return ColorKt.lerp-jxsXWHM(this.a, this.b, f1);
    }

    @NotNull
    public final TopAppBarColors copy-t635Npw(long v, long v1, long v2, long v3, long v4) {
        long v5 = v == 16L ? this.a : v;
        long v6 = v1 == 16L ? this.b : v1;
        long v7 = v2 == 16L ? this.c : v2;
        long v8 = v3 == 16L ? this.d : v3;
        return v4 == 16L ? new TopAppBarColors(v5, v6, v7, v8, this.e, null) : new TopAppBarColors(v5, v6, v7, v8, v4, null);
    }

    public static TopAppBarColors copy-t635Npw$default(TopAppBarColors topAppBarColors0, long v, long v1, long v2, long v3, long v4, int v5, Object object0) {
        long v6 = (v5 & 1) == 0 ? v : topAppBarColors0.a;
        long v7 = (v5 & 2) == 0 ? v1 : topAppBarColors0.b;
        long v8 = (v5 & 4) == 0 ? v2 : topAppBarColors0.c;
        long v9 = (v5 & 8) == 0 ? v3 : topAppBarColors0.d;
        return (v5 & 16) == 0 ? topAppBarColors0.copy-t635Npw(v6, v7, v8, v9, v4) : topAppBarColors0.copy-t635Npw(v6, v7, v8, v9, topAppBarColors0.e);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof TopAppBarColors) || !Color.equals-impl0(this.a, ((TopAppBarColors)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((TopAppBarColors)object0).b)) {
            return false;
        }
        if(!Color.equals-impl0(this.c, ((TopAppBarColors)object0).c)) {
            return false;
        }
        return Color.equals-impl0(this.d, ((TopAppBarColors)object0).d) ? Color.equals-impl0(this.e, ((TopAppBarColors)object0).e) : false;
    }

    public final long getActionIconContentColor-0d7_KjU() {
        return this.e;
    }

    public final long getContainerColor-0d7_KjU() {
        return this.a;
    }

    public final long getNavigationIconContentColor-0d7_KjU() {
        return this.c;
    }

    public final long getScrolledContainerColor-0d7_KjU() {
        return this.b;
    }

    public final long getTitleContentColor-0d7_KjU() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.e) + a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F);
    }
}

