package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class JavaType extends Enum {
    public static final enum JavaType BOOLEAN;
    public static final enum JavaType BYTE_STRING;
    public static final enum JavaType DOUBLE;
    public static final enum JavaType ENUM;
    public static final enum JavaType FLOAT;
    public static final enum JavaType INT;
    public static final enum JavaType LONG;
    public static final enum JavaType MESSAGE;
    public static final enum JavaType STRING;
    public static final enum JavaType VOID;
    public final Class a;
    public final Class b;
    public final Serializable c;
    public static final JavaType[] d;

    static {
        JavaType.VOID = new JavaType("VOID", 0, Void.class, Void.class, null);
        Class class0 = Integer.TYPE;
        JavaType.INT = new JavaType("INT", 1, class0, Integer.class, 0);
        JavaType.LONG = new JavaType("LONG", 2, Long.TYPE, Long.class, 0L);
        JavaType.FLOAT = new JavaType("FLOAT", 3, Float.TYPE, Float.class, 0.0f);
        JavaType.DOUBLE = new JavaType("DOUBLE", 4, Double.TYPE, Double.class, 0.0);
        JavaType.BOOLEAN = new JavaType("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        JavaType.STRING = new JavaType("STRING", 6, String.class, String.class, "");
        JavaType.BYTE_STRING = new JavaType("BYTE_STRING", 7, ByteString.class, ByteString.class, ByteString.EMPTY);
        JavaType.ENUM = new JavaType("ENUM", 8, class0, Integer.class, null);
        JavaType.MESSAGE = new JavaType("MESSAGE", 9, Object.class, Object.class, null);
        JavaType.d = new JavaType[]{JavaType.VOID, JavaType.INT, JavaType.LONG, JavaType.FLOAT, JavaType.DOUBLE, JavaType.BOOLEAN, JavaType.STRING, JavaType.BYTE_STRING, JavaType.ENUM, JavaType.MESSAGE};
    }

    public JavaType(String s, int v, Class class0, Class class1, Serializable serializable0) {
        super(s, v);
        this.a = class0;
        this.b = class1;
        this.c = serializable0;
    }

    public Class getBoxedType() {
        return this.b;
    }

    public Object getDefaultDefault() {
        return this.c;
    }

    public Class getType() {
        return this.a;
    }

    public boolean isValidType(Class class0) {
        return this.a.isAssignableFrom(class0);
    }

    public static JavaType valueOf(String s) {
        return (JavaType)Enum.valueOf(JavaType.class, s);
    }

    public static JavaType[] values() {
        return (JavaType[])JavaType.d.clone();
    }
}

