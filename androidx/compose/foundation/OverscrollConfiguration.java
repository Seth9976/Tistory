package androidx.compose.foundation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@ExperimentalFoundationApi
@Stable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000B\b\u0007\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001A"}, d2 = {"Landroidx/compose/foundation/OverscrollConfiguration;", "", "Landroidx/compose/ui/graphics/Color;", "glowColor", "Landroidx/compose/foundation/layout/PaddingValues;", "drawPadding", "<init>", "(JLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "getGlowColor-0d7_KjU", "()J", "b", "Landroidx/compose/foundation/layout/PaddingValues;", "getDrawPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class OverscrollConfiguration {
    public static final int $stable;
    public final long a;
    public final PaddingValues b;

    public OverscrollConfiguration(long v, PaddingValues paddingValues0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = ColorKt.Color(0xFF666666L);
        }
        if((v1 & 2) != 0) {
            paddingValues0 = PaddingKt.PaddingValues-YgX7TsA$default(0.0f, 0.0f, 3, null);
        }
        this(v, paddingValues0, null);
    }

    public OverscrollConfiguration(long v, PaddingValues paddingValues0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = paddingValues0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!Intrinsics.areEqual(OverscrollConfiguration.class, class0)) {
            return false;
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        return Color.equals-impl0(this.a, ((OverscrollConfiguration)object0).a) ? Intrinsics.areEqual(this.b, ((OverscrollConfiguration)object0).b) : false;
    }

    @NotNull
    public final PaddingValues getDrawPadding() {
        return this.b;
    }

    public final long getGlowColor-0d7_KjU() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + Color.hashCode-impl(this.a) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OverscrollConfiguration(glowColor=");
        a.x(this.a, ", drawPadding=", stringBuilder0);
        stringBuilder0.append(this.b);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

