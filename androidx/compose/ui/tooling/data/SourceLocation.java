package androidx.compose.ui.tooling.data;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@UiToolingDataApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u000F\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\fJ\u0012\u0010\u000F\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJD\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\fR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001B\u001A\u0004\b\u001E\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u001B\u001A\u0004\b \u0010\fR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\u0010R\u0017\u0010\b\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001B\u001A\u0004\b%\u0010\f¨\u0006&"}, d2 = {"Landroidx/compose/ui/tooling/data/SourceLocation;", "", "", "lineNumber", "offset", "length", "", "sourceFile", "packageHash", "<init>", "(IIILjava/lang/String;I)V", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "copy", "(IIILjava/lang/String;I)Landroidx/compose/ui/tooling/data/SourceLocation;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getLineNumber", "b", "getOffset", "c", "getLength", "d", "Ljava/lang/String;", "getSourceFile", "e", "getPackageHash", "ui-tooling-data_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SourceLocation {
    public static final int $stable;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;

    public SourceLocation(int v, int v1, int v2, @Nullable String s, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = s;
        this.e = v3;
    }

    public final int component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    @Nullable
    public final String component4() {
        return this.d;
    }

    public final int component5() {
        return this.e;
    }

    @NotNull
    public final SourceLocation copy(int v, int v1, int v2, @Nullable String s, int v3) {
        return new SourceLocation(v, v1, v2, s, v3);
    }

    public static SourceLocation copy$default(SourceLocation sourceLocation0, int v, int v1, int v2, String s, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = sourceLocation0.a;
        }
        if((v4 & 2) != 0) {
            v1 = sourceLocation0.b;
        }
        if((v4 & 4) != 0) {
            v2 = sourceLocation0.c;
        }
        if((v4 & 8) != 0) {
            s = sourceLocation0.d;
        }
        if((v4 & 16) != 0) {
            v3 = sourceLocation0.e;
        }
        return sourceLocation0.copy(v, v1, v2, s, v3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SourceLocation)) {
            return false;
        }
        if(this.a != ((SourceLocation)object0).a) {
            return false;
        }
        if(this.b != ((SourceLocation)object0).b) {
            return false;
        }
        if(this.c != ((SourceLocation)object0).c) {
            return false;
        }
        return Intrinsics.areEqual(this.d, ((SourceLocation)object0).d) ? this.e == ((SourceLocation)object0).e : false;
    }

    public final int getLength() {
        return this.c;
    }

    public final int getLineNumber() {
        return this.a;
    }

    public final int getOffset() {
        return this.b;
    }

    public final int getPackageHash() {
        return this.e;
    }

    @Nullable
    public final String getSourceFile() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = a.c(this.c, a.c(this.b, this.a * 0x1F, 0x1F), 0x1F);
        return this.d == null ? this.e + v * 0x1F : this.e + (v + this.d.hashCode()) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SourceLocation(lineNumber=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", offset=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", length=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", sourceFile=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", packageHash=");
        return b.p(stringBuilder0, this.e, ')');
    }
}

