package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CallableId {
    public final FqName a;
    public final FqName b;
    public final Name c;
    public final FqName d;

    static {
        Intrinsics.checkNotNullExpressionValue(FqName.topLevel(SpecialNames.LOCAL), "topLevel(LOCAL_NAME)");
    }

    public CallableId(@NotNull FqName fqName0, @Nullable FqName fqName1, @NotNull Name name0, @Nullable FqName fqName2) {
        Intrinsics.checkNotNullParameter(fqName0, "packageName");
        Intrinsics.checkNotNullParameter(name0, "callableName");
        super();
        this.a = fqName0;
        this.b = fqName1;
        this.c = name0;
        this.d = fqName2;
    }

    public CallableId(FqName fqName0, FqName fqName1, Name name0, FqName fqName2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 8) != 0) {
            fqName2 = null;
        }
        this(fqName0, fqName1, name0, fqName2);
    }

    public CallableId(@NotNull FqName fqName0, @NotNull Name name0) {
        Intrinsics.checkNotNullParameter(fqName0, "packageName");
        Intrinsics.checkNotNullParameter(name0, "callableName");
        this(fqName0, null, name0, null, 8, null);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CallableId)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((CallableId)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((CallableId)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((CallableId)object0).c) ? Intrinsics.areEqual(this.d, ((CallableId)object0).d) : false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c.hashCode();
        FqName fqName0 = this.d;
        if(fqName0 != null) {
            v1 = fqName0.hashCode();
        }
        return (v3 + (v * 0x1F + v2) * 0x1F) * 0x1F + v1;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        String s = this.a.asString();
        Intrinsics.checkNotNullExpressionValue(s, "packageName.asString()");
        stringBuilder0.append(p.replace$default(s, '.', '/', false, 4, null));
        stringBuilder0.append("/");
        FqName fqName0 = this.b;
        if(fqName0 != null) {
            stringBuilder0.append(fqName0);
            stringBuilder0.append(".");
        }
        stringBuilder0.append(this.c);
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
        return s1;
    }
}

