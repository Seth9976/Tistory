package kotlin.reflect.jvm.internal.impl.builtins;

import he.e;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import md.c;
import org.jetbrains.annotations.NotNull;

public enum PrimitiveType {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final Set NUMBER_TYPES;
    public final Name a;
    public final Name b;
    public final Lazy c;
    public final Lazy d;

    static {
        PrimitiveType.Companion = new Companion(null);
        Object[] arr_object = {PrimitiveType.CHAR, PrimitiveType.BYTE, PrimitiveType.SHORT, PrimitiveType.INT, PrimitiveType.FLOAT, PrimitiveType.LONG, PrimitiveType.DOUBLE};
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        PrimitiveType.NUMBER_TYPES = ArraysKt___ArraysKt.toSet(arr_object);
    }

    public PrimitiveType(String s1) {
        Name name0 = Name.identifier(s1);
        Intrinsics.checkNotNullExpressionValue(name0, "identifier(typeName)");
        this.a = name0;
        Name name1 = Name.identifier((s1 + "Array"));
        Intrinsics.checkNotNullExpressionValue(name1, "identifier(\"${typeName}Array\")");
        this.b = name1;
        e e0 = new e(this, 1);
        this.c = c.lazy(LazyThreadSafetyMode.PUBLICATION, e0);
        e e1 = new e(this, 0);
        this.d = c.lazy(LazyThreadSafetyMode.PUBLICATION, e1);
    }

    @NotNull
    public final FqName getArrayTypeFqName() {
        return (FqName)this.d.getValue();
    }

    @NotNull
    public final Name getArrayTypeName() {
        return this.b;
    }

    @NotNull
    public final FqName getTypeFqName() {
        return (FqName)this.c.getValue();
    }

    @NotNull
    public final Name getTypeName() {
        return this.a;
    }
}

