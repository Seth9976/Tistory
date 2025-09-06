package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IncompatibleVersionErrorData {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final String e;
    public final ClassId f;

    public IncompatibleVersionErrorData(Object object0, Object object1, Object object2, Object object3, @NotNull String s, @NotNull ClassId classId0) {
        Intrinsics.checkNotNullParameter(s, "filePath");
        Intrinsics.checkNotNullParameter(classId0, "classId");
        super();
        this.a = object0;
        this.b = object1;
        this.c = object2;
        this.d = object3;
        this.e = s;
        this.f = classId0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((IncompatibleVersionErrorData)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((IncompatibleVersionErrorData)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((IncompatibleVersionErrorData)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((IncompatibleVersionErrorData)object0).d)) {
            return false;
        }
        return Intrinsics.areEqual(this.e, ((IncompatibleVersionErrorData)object0).e) ? Intrinsics.areEqual(this.f, ((IncompatibleVersionErrorData)object0).f) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        Object object0 = this.d;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return this.f.hashCode() + q.c((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v) * 0x1F, 0x1F, this.e);
    }

    @Override
    @NotNull
    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.a + ", compilerVersion=" + this.b + ", languageVersion=" + this.c + ", expectedVersion=" + this.d + ", filePath=" + this.e + ", classId=" + this.f + ')';
    }
}

