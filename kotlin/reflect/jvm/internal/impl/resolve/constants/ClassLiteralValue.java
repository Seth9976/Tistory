package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nClassLiteralValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassLiteralValue.kt\norg/jetbrains/kotlin/resolve/constants/ClassLiteralValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
public final class ClassLiteralValue {
    public final ClassId a;
    public final int b;

    public ClassLiteralValue(@NotNull ClassId classId0, int v) {
        Intrinsics.checkNotNullParameter(classId0, "classId");
        super();
        this.a = classId0;
        this.b = v;
    }

    @NotNull
    public final ClassId component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ClassLiteralValue)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((ClassLiteralValue)object0).a) ? this.b == ((ClassLiteralValue)object0).b : false;
    }

    public final int getArrayNestedness() {
        return this.b;
    }

    @NotNull
    public final ClassId getClassId() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.b + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v1 = 0; true; ++v1) {
            int v2 = this.b;
            if(v1 >= v2) {
                break;
            }
            stringBuilder0.append("kotlin/Array<");
        }
        stringBuilder0.append(this.a);
        for(int v = 0; v < v2; ++v) {
            stringBuilder0.append(">");
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

