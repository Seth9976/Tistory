package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class UnsignedArrayType extends Enum {
    public static final enum UnsignedArrayType UBYTEARRAY;
    public static final enum UnsignedArrayType UINTARRAY;
    public static final enum UnsignedArrayType ULONGARRAY;
    public static final enum UnsignedArrayType USHORTARRAY;
    public final Name a;
    public static final UnsignedArrayType[] b;

    static {
        ClassId classId0 = ClassId.fromString("kotlin/UByteArray", false);
        if(classId0 == null) {
            NullPointerException nullPointerException0 = new NullPointerException("fromString(\"kotlin/UByteArray\") must not be null");
            Intrinsics.b(nullPointerException0, "kotlin.jvm.internal.Intrinsics");
            throw nullPointerException0;
        }
        UnsignedArrayType.UBYTEARRAY = new UnsignedArrayType("UBYTEARRAY", 0, classId0);
        ClassId classId1 = ClassId.fromString("kotlin/UShortArray", false);
        if(classId1 == null) {
            NullPointerException nullPointerException1 = new NullPointerException("fromString(\"kotlin/UShortArray\") must not be null");
            Intrinsics.b(nullPointerException1, "kotlin.jvm.internal.Intrinsics");
            throw nullPointerException1;
        }
        UnsignedArrayType.USHORTARRAY = new UnsignedArrayType("USHORTARRAY", 1, classId1);
        ClassId classId2 = ClassId.fromString("kotlin/UIntArray", false);
        if(classId2 == null) {
            NullPointerException nullPointerException2 = new NullPointerException("fromString(\"kotlin/UIntArray\") must not be null");
            Intrinsics.b(nullPointerException2, "kotlin.jvm.internal.Intrinsics");
            throw nullPointerException2;
        }
        UnsignedArrayType.UINTARRAY = new UnsignedArrayType("UINTARRAY", 2, classId2);
        ClassId classId3 = ClassId.fromString("kotlin/ULongArray", false);
        if(classId3 == null) {
            NullPointerException nullPointerException3 = new NullPointerException("fromString(\"kotlin/ULongArray\") must not be null");
            Intrinsics.b(nullPointerException3, "kotlin.jvm.internal.Intrinsics");
            throw nullPointerException3;
        }
        UnsignedArrayType.ULONGARRAY = new UnsignedArrayType("ULONGARRAY", 3, classId3);
        UnsignedArrayType.b = new UnsignedArrayType[]{UnsignedArrayType.UBYTEARRAY, UnsignedArrayType.USHORTARRAY, UnsignedArrayType.UINTARRAY, UnsignedArrayType.ULONGARRAY};
    }

    public UnsignedArrayType(String s, int v, ClassId classId0) {
        super(s, v);
        Name name0 = classId0.getShortClassName();
        Intrinsics.checkNotNullExpressionValue(name0, "classId.shortClassName");
        this.a = name0;
    }

    @NotNull
    public final Name getTypeName() {
        return this.a;
    }

    public static UnsignedArrayType valueOf(String s) {
        return (UnsignedArrayType)Enum.valueOf(UnsignedArrayType.class, s);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[])UnsignedArrayType.b.clone();
    }
}

