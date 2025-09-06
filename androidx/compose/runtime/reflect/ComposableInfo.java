package androidx.compose.runtime.reflect;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000F\u0010\rJ8\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001A\u0010\u0017\u001A\u00020\u00022\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u0003\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\rR\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001C\u001A\u0004\b\u001F\u0010\rR\u0017\u0010\u0007\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001C\u001A\u0004\b!\u0010\r¨\u0006\""}, d2 = {"Landroidx/compose/runtime/reflect/ComposableInfo;", "", "", "isComposable", "", "realParamsCount", "changedParams", "defaultParams", "<init>", "(ZIII)V", "component1", "()Z", "component2", "()I", "component3", "component4", "copy", "(ZIII)Landroidx/compose/runtime/reflect/ComposableInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "I", "getRealParamsCount", "c", "getChangedParams", "d", "getDefaultParams", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableInfo {
    public static final int $stable;
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    public ComposableInfo(boolean z, int v, int v1, int v2) {
        this.a = z;
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    public final boolean component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    @NotNull
    public final ComposableInfo copy(boolean z, int v, int v1, int v2) {
        return new ComposableInfo(z, v, v1, v2);
    }

    public static ComposableInfo copy$default(ComposableInfo composableInfo0, boolean z, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            z = composableInfo0.a;
        }
        if((v3 & 2) != 0) {
            v = composableInfo0.b;
        }
        if((v3 & 4) != 0) {
            v1 = composableInfo0.c;
        }
        if((v3 & 8) != 0) {
            v2 = composableInfo0.d;
        }
        return composableInfo0.copy(z, v, v1, v2);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ComposableInfo)) {
            return false;
        }
        if(this.a != ((ComposableInfo)object0).a) {
            return false;
        }
        if(this.b != ((ComposableInfo)object0).b) {
            return false;
        }
        return this.c == ((ComposableInfo)object0).c ? this.d == ((ComposableInfo)object0).d : false;
    }

    public final int getChangedParams() {
        return this.c;
    }

    public final int getDefaultParams() {
        return this.d;
    }

    public final int getRealParamsCount() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.d + a.c(this.c, a.c(this.b, Boolean.hashCode(this.a) * 0x1F, 0x1F), 0x1F);
    }

    public final boolean isComposable() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ComposableInfo(isComposable=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", realParamsCount=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", changedParams=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", defaultParams=");
        return b.p(stringBuilder0, this.d, ')');
    }
}

