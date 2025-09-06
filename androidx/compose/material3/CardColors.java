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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\u0003\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0004\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\f2\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001B\u0010\u0018\u001A\u0004\b\u001C\u0010\u001AR\u001D\u0010\u0005\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001D\u0010\u0018\u001A\u0004\b\u001E\u0010\u001AR\u001D\u0010\u0006\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001F\u0010\u0018\u001A\u0004\b \u0010\u001A\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/material3/CardColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-jRlVdoo", "(JJJJ)Landroidx/compose/material3/CardColors;", "copy", "", "enabled", "containerColor-vNxB06k$material3_release", "(Z)J", "contentColor-vNxB06k$material3_release", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getContainerColor-0d7_KjU", "()J", "b", "getContentColor-0d7_KjU", "c", "getDisabledContainerColor-0d7_KjU", "d", "getDisabledContentColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,851:1\n708#2:852\n696#2:853\n708#2:854\n696#2:855\n708#2:856\n696#2:857\n708#2:858\n696#2:859\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardColors\n*L\n807#1:852\n807#1:853\n808#1:854\n808#1:855\n809#1:856\n809#1:857\n810#1:858\n810#1:859\n*E\n"})
public final class CardColors {
    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public CardColors(long v, long v1, long v2, long v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long containerColor-vNxB06k$material3_release(boolean z) {
        return z ? this.a : this.c;
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long contentColor-vNxB06k$material3_release(boolean z) {
        return z ? this.b : this.d;
    }

    @NotNull
    public final CardColors copy-jRlVdoo(long v, long v1, long v2, long v3) {
        long v4 = v == 16L ? this.a : v;
        long v5 = v1 == 16L ? this.b : v1;
        long v6 = v2 == 16L ? this.c : v2;
        return v3 == 16L ? new CardColors(v4, v5, v6, this.d, null) : new CardColors(v4, v5, v6, v3, null);
    }

    public static CardColors copy-jRlVdoo$default(CardColors cardColors0, long v, long v1, long v2, long v3, int v4, Object object0) {
        long v5 = (v4 & 1) == 0 ? v : cardColors0.a;
        long v6 = (v4 & 2) == 0 ? v1 : cardColors0.b;
        long v7 = (v4 & 4) == 0 ? v2 : cardColors0.c;
        return (v4 & 8) == 0 ? cardColors0.copy-jRlVdoo(v5, v6, v7, v3) : cardColors0.copy-jRlVdoo(v5, v6, v7, cardColors0.d);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof CardColors) || !Color.equals-impl0(this.a, ((CardColors)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((CardColors)object0).b)) {
            return false;
        }
        return Color.equals-impl0(this.c, ((CardColors)object0).c) ? Color.equals-impl0(this.d, ((CardColors)object0).d) : false;
    }

    public final long getContainerColor-0d7_KjU() {
        return this.a;
    }

    public final long getContentColor-0d7_KjU() {
        return this.b;
    }

    public final long getDisabledContainerColor-0d7_KjU() {
        return this.c;
    }

    public final long getDisabledContentColor-0d7_KjU() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.d) + a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F);
    }
}

