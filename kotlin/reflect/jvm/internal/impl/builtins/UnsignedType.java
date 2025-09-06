package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class UnsignedType extends Enum {
    public static final enum UnsignedType UBYTE;
    public static final enum UnsignedType UINT;
    public static final enum UnsignedType ULONG;
    public static final enum UnsignedType USHORT;
    public final ClassId a;
    public final Name b;
    public final ClassId c;
    public static final UnsignedType[] d;

    static {
        ClassId classId0 = ClassId.fromString("kotlin/UByte", false);
        if(classId0 == null) {
            NullPointerException nullPointerException0 = new NullPointerException("fromString(\"kotlin/UByte\") must not be null");
            Intrinsics.b(nullPointerException0, "kotlin.jvm.internal.Intrinsics");
            throw nullPointerException0;
        }
        UnsignedType.UBYTE = new UnsignedType("UBYTE", 0, classId0);
        ClassId classId1 = ClassId.fromString("kotlin/UShort", false);
        if(classId1 == null) {
            NullPointerException nullPointerException1 = new NullPointerException("fromString(\"kotlin/UShort\") must not be null");
            Intrinsics.b(nullPointerException1, "kotlin.jvm.internal.Intrinsics");
            throw nullPointerException1;
        }
        UnsignedType.USHORT = new UnsignedType("USHORT", 1, classId1);
        ClassId classId2 = ClassId.fromString("kotlin/UInt", false);
        if(classId2 == null) {
            NullPointerException nullPointerException2 = new NullPointerException("fromString(\"kotlin/UInt\") must not be null");
            Intrinsics.b(nullPointerException2, "kotlin.jvm.internal.Intrinsics");
            throw nullPointerException2;
        }
        UnsignedType.UINT = new UnsignedType("UINT", 2, classId2);
        ClassId classId3 = ClassId.fromString("kotlin/ULong", false);
        if(classId3 == null) {
            NullPointerException nullPointerException3 = new NullPointerException("fromString(\"kotlin/ULong\") must not be null");
            Intrinsics.b(nullPointerException3, "kotlin.jvm.internal.Intrinsics");
            throw nullPointerException3;
        }
        UnsignedType.ULONG = new UnsignedType("ULONG", 3, classId3);
        UnsignedType.d = new UnsignedType[]{UnsignedType.UBYTE, UnsignedType.USHORT, UnsignedType.UINT, UnsignedType.ULONG};
    }

    public UnsignedType(String s, int v, ClassId classId0) {
        super(s, v);
        this.a = classId0;
        Name name0 = classId0.getShortClassName();
        Intrinsics.checkNotNullExpressionValue(name0, "classId.shortClassName");
        this.b = name0;
        this.c = new ClassId(classId0.getPackageFqName(), Name.identifier((name0.asString() + "Array")));
    }

    @NotNull
    public final ClassId getArrayClassId() {
        return this.c;
    }

    @NotNull
    public final ClassId getClassId() {
        return this.a;
    }

    @NotNull
    public final Name getTypeName() {
        return this.b;
    }

    public static UnsignedType valueOf(String s) {
        return (UnsignedType)Enum.valueOf(UnsignedType.class, s);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[])UnsignedType.d.clone();
    }
}

