package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@ExperimentalMaterial3Api
@Immutable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000B\b\u0007\u0018\u00002\u00020\u0001B\u001D\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001A"}, d2 = {"Landroidx/compose/material3/RippleConfiguration;", "", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(JLandroidx/compose/material/ripple/RippleAlpha;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "getColor-0d7_KjU", "()J", "b", "Landroidx/compose/material/ripple/RippleAlpha;", "getRippleAlpha", "()Landroidx/compose/material/ripple/RippleAlpha;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RippleConfiguration {
    public static final int $stable;
    public final long a;
    public final RippleAlpha b;

    public RippleConfiguration(long v, RippleAlpha rippleAlpha0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = Color.Companion.getUnspecified-0d7_KjU();
        }
        if((v1 & 2) != 0) {
            rippleAlpha0 = null;
        }
        this(v, rippleAlpha0, null);
    }

    public RippleConfiguration(long v, RippleAlpha rippleAlpha0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = rippleAlpha0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RippleConfiguration)) {
            return false;
        }
        return Color.equals-impl0(this.a, ((RippleConfiguration)object0).a) ? Intrinsics.areEqual(this.b, ((RippleConfiguration)object0).b) : false;
    }

    public final long getColor-0d7_KjU() {
        return this.a;
    }

    @Nullable
    public final RippleAlpha getRippleAlpha() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = Color.hashCode-impl(this.a);
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("RippleConfiguration(color=");
        a.x(this.a, ", rippleAlpha=", stringBuilder0);
        stringBuilder0.append(this.b);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

