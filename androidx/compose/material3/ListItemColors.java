package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u001C\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u00A2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0003\u001A\u00020\u0002H\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0010H\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u001D\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0010H\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0006\u001A\u00020\u0002H\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0015\u0010\u000FJ\u0015\u0010\u0017\u001A\u00020\u0002H\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0016\u0010\u000FJ\u001D\u0010\b\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0010H\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0013R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u000FR\u001D\u0010\u0004\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b\u001C\u0010\u001A\u001A\u0004\b\u001D\u0010\u000FR\u001D\u0010\u0005\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b\u001E\u0010\u001A\u001A\u0004\b\u001F\u0010\u000FR\u001D\u0010\u0006\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b \u0010\u001A\u001A\u0004\b!\u0010\u000FR\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b\"\u0010\u001A\u001A\u0004\b#\u0010\u000FR\u001D\u0010\b\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b$\u0010\u001A\u001A\u0004\b%\u0010\u000FR\u001D\u0010\t\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b&\u0010\u001A\u001A\u0004\b\'\u0010\u000FR\u001D\u0010\n\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b(\u0010\u001A\u001A\u0004\b)\u0010\u000FR\u001D\u0010\u000B\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b*\u0010\u001A\u001A\u0004\b+\u0010\u000F\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006,"}, d2 = {"Landroidx/compose/material3/ListItemColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "headlineColor", "leadingIconColor", "overlineColor", "supportingTextColor", "trailingIconColor", "disabledHeadlineColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "<init>", "(JJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "containerColor-0d7_KjU$material3_release", "()J", "", "enabled", "headlineColor-vNxB06k$material3_release", "(Z)J", "leadingIconColor-vNxB06k$material3_release", "overlineColor-0d7_KjU$material3_release", "supportingColor-0d7_KjU$material3_release", "supportingColor", "trailingIconColor-vNxB06k$material3_release", "a", "J", "getContainerColor-0d7_KjU", "b", "getHeadlineColor-0d7_KjU", "c", "getLeadingIconColor-0d7_KjU", "d", "getOverlineColor-0d7_KjU", "e", "getSupportingTextColor-0d7_KjU", "f", "getTrailingIconColor-0d7_KjU", "g", "getDisabledHeadlineColor-0d7_KjU", "h", "getDisabledLeadingIconColor-0d7_KjU", "i", "getDisabledTrailingIconColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ListItemColors {
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

    public ListItemColors(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
        this.i = v8;
    }

    public final long containerColor-0d7_KjU$material3_release() {
        return this.a;
    }

    public final long getContainerColor-0d7_KjU() {
        return this.a;
    }

    public final long getDisabledHeadlineColor-0d7_KjU() {
        return this.g;
    }

    public final long getDisabledLeadingIconColor-0d7_KjU() {
        return this.h;
    }

    public final long getDisabledTrailingIconColor-0d7_KjU() {
        return this.i;
    }

    public final long getHeadlineColor-0d7_KjU() {
        return this.b;
    }

    public final long getLeadingIconColor-0d7_KjU() {
        return this.c;
    }

    public final long getOverlineColor-0d7_KjU() {
        return this.d;
    }

    public final long getSupportingTextColor-0d7_KjU() {
        return this.e;
    }

    public final long getTrailingIconColor-0d7_KjU() {
        return this.f;
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long headlineColor-vNxB06k$material3_release(boolean z) {
        return z ? this.b : this.g;
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long leadingIconColor-vNxB06k$material3_release(boolean z) {
        return z ? this.c : this.h;
    }

    @Stable
    public final long overlineColor-0d7_KjU$material3_release() {
        return this.d;
    }

    @Stable
    public final long supportingColor-0d7_KjU$material3_release() {
        return this.e;
    }

    // 去混淆评级： 低(20)
    @Stable
    public final long trailingIconColor-vNxB06k$material3_release(boolean z) {
        return z ? this.f : this.i;
    }
}

