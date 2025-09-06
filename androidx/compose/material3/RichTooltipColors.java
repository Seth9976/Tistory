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
@Stable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\u000E\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001A\u0004\b\u0018\u0010\u0016R\u001D\u0010\u0005\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001A\u0004\b\u001A\u0010\u0016R\u001D\u0010\u0006\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001B\u0010\u0014\u001A\u0004\b\u001C\u0010\u0016\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001D"}, d2 = {"Landroidx/compose/material3/RichTooltipColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "titleContentColor", "actionContentColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-jRlVdoo", "(JJJJ)Landroidx/compose/material3/RichTooltipColors;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getContainerColor-0d7_KjU", "()J", "b", "getContentColor-0d7_KjU", "c", "getTitleContentColor-0d7_KjU", "d", "getActionContentColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/RichTooltipColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,645:1\n708#2:646\n696#2:647\n708#2:648\n696#2:649\n708#2:650\n696#2:651\n708#2:652\n696#2:653\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/RichTooltipColors\n*L\n391#1:646\n391#1:647\n392#1:648\n392#1:649\n393#1:650\n393#1:651\n394#1:652\n394#1:653\n*E\n"})
public final class RichTooltipColors {
    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public RichTooltipColors(long v, long v1, long v2, long v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @NotNull
    public final RichTooltipColors copy-jRlVdoo(long v, long v1, long v2, long v3) {
        long v4 = v == 16L ? this.a : v;
        long v5 = v1 == 16L ? this.b : v1;
        long v6 = v2 == 16L ? this.c : v2;
        return v3 == 16L ? new RichTooltipColors(v4, v5, v6, this.d, null) : new RichTooltipColors(v4, v5, v6, v3, null);
    }

    public static RichTooltipColors copy-jRlVdoo$default(RichTooltipColors richTooltipColors0, long v, long v1, long v2, long v3, int v4, Object object0) {
        long v5 = (v4 & 1) == 0 ? v : richTooltipColors0.a;
        long v6 = (v4 & 2) == 0 ? v1 : richTooltipColors0.b;
        long v7 = (v4 & 4) == 0 ? v2 : richTooltipColors0.c;
        return (v4 & 8) == 0 ? richTooltipColors0.copy-jRlVdoo(v5, v6, v7, v3) : richTooltipColors0.copy-jRlVdoo(v5, v6, v7, richTooltipColors0.d);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RichTooltipColors)) {
            return false;
        }
        if(!Color.equals-impl0(this.a, ((RichTooltipColors)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((RichTooltipColors)object0).b)) {
            return false;
        }
        return Color.equals-impl0(this.c, ((RichTooltipColors)object0).c) ? Color.equals-impl0(this.d, ((RichTooltipColors)object0).d) : false;
    }

    public final long getActionContentColor-0d7_KjU() {
        return this.d;
    }

    public final long getContainerColor-0d7_KjU() {
        return this.a;
    }

    public final long getContentColor-0d7_KjU() {
        return this.b;
    }

    public final long getTitleContentColor-0d7_KjU() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.d) + a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F);
    }
}

