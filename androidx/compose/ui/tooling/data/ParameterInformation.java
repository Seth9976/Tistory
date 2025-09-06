package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@UiToolingDataApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001A\u00020\u0005\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0012\u0010\u000F\u001A\u0004\u0018\u00010\u0001H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u000EJ\u0010\u0010\u0016\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0012JZ\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001A\u00020\u0005H\u00C6\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u000EJ\u0010\u0010\u001B\u001A\u00020\u001AH\u00D6\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001A\u0010\u001E\u001A\u00020\u00052\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u000ER\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00018\u0006\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0010R\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0012R\u0017\u0010\u0007\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b)\u0010\'\u001A\u0004\b*\u0010\u0012R\u0017\u0010\b\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b+\u0010\'\u001A\u0004\b,\u0010\u0012R\u0019\u0010\t\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b-\u0010!\u001A\u0004\b.\u0010\u000ER\u0017\u0010\n\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b/\u0010\'\u001A\u0004\b0\u0010\u0012\u00A8\u00061"}, d2 = {"Landroidx/compose/ui/tooling/data/ParameterInformation;", "", "", "name", "value", "", "fromDefault", "static", "compared", "inlineClass", "stable", "<init>", "(Ljava/lang/String;Ljava/lang/Object;ZZZLjava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Z", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Object;ZZZLjava/lang/String;Z)Landroidx/compose/ui/tooling/data/ParameterInformation;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Ljava/lang/Object;", "getValue", "c", "Z", "getFromDefault", "d", "getStatic", "e", "getCompared", "f", "getInlineClass", "g", "getStable", "ui-tooling-data_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ParameterInformation {
    public static final int $stable = 8;
    public final String a;
    public final Object b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;

    public ParameterInformation(@NotNull String s, @Nullable Object object0, boolean z, boolean z1, boolean z2, @Nullable String s1, boolean z3) {
        this.a = s;
        this.b = object0;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = s1;
        this.g = z3;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @Nullable
    public final Object component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    @Nullable
    public final String component6() {
        return this.f;
    }

    public final boolean component7() {
        return this.g;
    }

    @NotNull
    public final ParameterInformation copy(@NotNull String s, @Nullable Object object0, boolean z, boolean z1, boolean z2, @Nullable String s1, boolean z3) {
        return new ParameterInformation(s, object0, z, z1, z2, s1, z3);
    }

    public static ParameterInformation copy$default(ParameterInformation parameterInformation0, String s, Object object0, boolean z, boolean z1, boolean z2, String s1, boolean z3, int v, Object object1) {
        if((v & 1) != 0) {
            s = parameterInformation0.a;
        }
        if((v & 2) != 0) {
            object0 = parameterInformation0.b;
        }
        if((v & 4) != 0) {
            z = parameterInformation0.c;
        }
        if((v & 8) != 0) {
            z1 = parameterInformation0.d;
        }
        if((v & 16) != 0) {
            z2 = parameterInformation0.e;
        }
        if((v & 0x20) != 0) {
            s1 = parameterInformation0.f;
        }
        if((v & 0x40) != 0) {
            z3 = parameterInformation0.g;
        }
        return parameterInformation0.copy(s, object0, z, z1, z2, s1, z3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ParameterInformation)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((ParameterInformation)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((ParameterInformation)object0).b)) {
            return false;
        }
        if(this.c != ((ParameterInformation)object0).c) {
            return false;
        }
        if(this.d != ((ParameterInformation)object0).d) {
            return false;
        }
        if(this.e != ((ParameterInformation)object0).e) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((ParameterInformation)object0).f) ? this.g == ((ParameterInformation)object0).g : false;
    }

    public final boolean getCompared() {
        return this.e;
    }

    public final boolean getFromDefault() {
        return this.c;
    }

    @Nullable
    public final String getInlineClass() {
        return this.f;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    public final boolean getStable() {
        return this.g;
    }

    public final boolean getStatic() {
        return this.d;
    }

    @Nullable
    public final Object getValue() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = a.e(a.e(a.e((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F, 0x1F, this.c), 0x1F, this.d), 0x1F, this.e);
        String s = this.f;
        if(s != null) {
            v = s.hashCode();
        }
        return Boolean.hashCode(this.g) + (v1 + v) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ParameterInformation(name=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", value=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", fromDefault=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", static=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", compared=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", inlineClass=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", stable=");
        return a.p(stringBuilder0, this.g, ')');
    }
}

