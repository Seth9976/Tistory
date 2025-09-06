package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@VisibleForTesting
@Stable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000F\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001A\u0004\b\u0019\u0010\u0017R\u001D\u0010\u0005\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001A\u0010\u0015\u001A\u0004\b\u001B\u0010\u0017R\u001D\u0010\u0006\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001C\u0010\u0015\u001A\u0004\b\u001D\u0010\u0017R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001E\u0010\u0015\u001A\u0004\b\u001F\u0010\u0017\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "textColor", "iconColor", "disabledTextColor", "disabledIconColor", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "getBackgroundColor-0d7_KjU", "()J", "b", "getTextColor-0d7_KjU", "c", "getIconColor-0d7_KjU", "d", "getDisabledTextColor-0d7_KjU", "e", "getDisabledIconColor-0d7_KjU", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ContextMenuColors {
    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public ContextMenuColors(long v, long v1, long v2, long v3, long v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof ContextMenuColors) || !Color.equals-impl0(this.a, ((ContextMenuColors)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((ContextMenuColors)object0).b)) {
            return false;
        }
        if(!Color.equals-impl0(this.c, ((ContextMenuColors)object0).c)) {
            return false;
        }
        return Color.equals-impl0(this.d, ((ContextMenuColors)object0).d) ? Color.equals-impl0(this.e, ((ContextMenuColors)object0).e) : false;
    }

    public final long getBackgroundColor-0d7_KjU() {
        return this.a;
    }

    public final long getDisabledIconColor-0d7_KjU() {
        return this.e;
    }

    public final long getDisabledTextColor-0d7_KjU() {
        return this.d;
    }

    public final long getIconColor-0d7_KjU() {
        return this.c;
    }

    public final long getTextColor-0d7_KjU() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.e) + a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ContextMenuColors(backgroundColor=");
        r0.a.x(this.a, ", textColor=", stringBuilder0);
        r0.a.x(this.b, ", iconColor=", stringBuilder0);
        r0.a.x(this.c, ", disabledTextColor=", stringBuilder0);
        r0.a.x(this.d, ", disabledIconColor=", stringBuilder0);
        stringBuilder0.append(Color.toString-impl(this.e));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

