package androidx.compose.material3.carousel;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0011\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\u0006\u0012\u0006\u0010\n\u001A\u00020\u0002\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u000EJV\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0018H\u00D6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001C\u001A\u00020\u001BH\u00D6\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001A\u0010\u001F\u001A\u00020\u00062\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\u001F\u0010 R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b$\u0010\"\u001A\u0004\b%\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b&\u0010\"\u001A\u0004\b\'\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b\u0007\u0010\u0012R\u0017\u0010\b\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b*\u0010)\u001A\u0004\b\b\u0010\u0012R\u0017\u0010\t\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b+\u0010)\u001A\u0004\b\t\u0010\u0012R\u0017\u0010\n\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b,\u0010\"\u001A\u0004\b-\u0010\u000E\u00A8\u0006."}, d2 = {"Landroidx/compose/material3/carousel/Keyline;", "", "", "size", "offset", "unadjustedOffset", "", "isFocal", "isAnchor", "isPivot", "cutoff", "<init>", "(FFFZZZF)V", "component1", "()F", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "copy", "(FFFZZZF)Landroidx/compose/material3/carousel/Keyline;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getSize", "b", "getOffset", "c", "getUnadjustedOffset", "d", "Z", "e", "f", "g", "getCutoff", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Keyline {
    public static final int $stable;
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final float g;

    public Keyline(float f, float f1, float f2, boolean z, boolean z1, boolean z2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = z;
        this.e = z1;
        this.f = z2;
        this.g = f3;
    }

    public final float component1() {
        return this.a;
    }

    public final float component2() {
        return this.b;
    }

    public final float component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final boolean component6() {
        return this.f;
    }

    public final float component7() {
        return this.g;
    }

    @NotNull
    public final Keyline copy(float f, float f1, float f2, boolean z, boolean z1, boolean z2, float f3) {
        return new Keyline(f, f1, f2, z, z1, z2, f3);
    }

    public static Keyline copy$default(Keyline keyline0, float f, float f1, float f2, boolean z, boolean z1, boolean z2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = keyline0.a;
        }
        if((v & 2) != 0) {
            f1 = keyline0.b;
        }
        if((v & 4) != 0) {
            f2 = keyline0.c;
        }
        if((v & 8) != 0) {
            z = keyline0.d;
        }
        if((v & 16) != 0) {
            z1 = keyline0.e;
        }
        if((v & 0x20) != 0) {
            z2 = keyline0.f;
        }
        if((v & 0x40) != 0) {
            f3 = keyline0.g;
        }
        return keyline0.copy(f, f1, f2, z, z1, z2, f3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Keyline)) {
            return false;
        }
        if(Float.compare(this.a, ((Keyline)object0).a) != 0) {
            return false;
        }
        if(Float.compare(this.b, ((Keyline)object0).b) != 0) {
            return false;
        }
        if(Float.compare(this.c, ((Keyline)object0).c) != 0) {
            return false;
        }
        if(this.d != ((Keyline)object0).d) {
            return false;
        }
        if(this.e != ((Keyline)object0).e) {
            return false;
        }
        return this.f == ((Keyline)object0).f ? Float.compare(this.g, ((Keyline)object0).g) == 0 : false;
    }

    public final float getCutoff() {
        return this.g;
    }

    public final float getOffset() {
        return this.b;
    }

    public final float getSize() {
        return this.a;
    }

    public final float getUnadjustedOffset() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.g) + a.e(a.e(a.e(a.b(this.c, a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F), 0x1F), 0x1F, this.d), 0x1F, this.e), 0x1F, this.f);
    }

    public final boolean isAnchor() {
        return this.e;
    }

    public final boolean isFocal() {
        return this.d;
    }

    public final boolean isPivot() {
        return this.f;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Keyline(size=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", offset=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", unadjustedOffset=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", isFocal=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", isAnchor=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", isPivot=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", cutoff=");
        return a.n(stringBuilder0, this.g, ')');
    }
}

