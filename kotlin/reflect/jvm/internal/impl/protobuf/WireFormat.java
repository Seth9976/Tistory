package kotlin.reflect.jvm.internal.impl.protobuf;

public final class WireFormat {
    public static enum FieldType {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        public final class r extends FieldType {
            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
            public final boolean isPackable() {
                return false;
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        public final class s extends FieldType {
            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
            public final boolean isPackable() {
                return false;
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        public final class t extends FieldType {
            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
            public final boolean isPackable() {
                return false;
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        public final class u extends FieldType {
            @Override  // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
            public final boolean isPackable() {
                return false;
            }
        }

        DOUBLE(JavaType.DOUBLE, 1),
        FLOAT(JavaType.FLOAT, 5),
        INT64(JavaType.LONG, 0),
        UINT64(JavaType.LONG, 0),
        INT32(JavaType.INT, 0),
        FIXED64(JavaType.LONG, 1),
        FIXED32(JavaType.INT, 5),
        BOOL(JavaType.BOOLEAN, 0),
        STRING(JavaType.STRING, 2) /* 警告！未生成枚举子类：kotlin.reflect.jvm.internal.impl.protobuf.r */,
        GROUP(JavaType.MESSAGE, 3) /* 警告！未生成枚举子类：kotlin.reflect.jvm.internal.impl.protobuf.s */,
        MESSAGE(JavaType.MESSAGE, 2) /* 警告！未生成枚举子类：kotlin.reflect.jvm.internal.impl.protobuf.t */,
        BYTES(JavaType.BYTE_STRING, 2) /* 警告！未生成枚举子类：kotlin.reflect.jvm.internal.impl.protobuf.u */,
        UINT32(JavaType.INT, 0),
        ENUM(JavaType.ENUM, 0),
        SFIXED32(JavaType.INT, 5),
        SFIXED64(JavaType.LONG, 1),
        SINT32(JavaType.INT, 0),
        SINT64(JavaType.LONG, 0);

        public final JavaType a;
        public final int b;

        public FieldType(JavaType wireFormat$JavaType0, int v1) {
            this.a = wireFormat$JavaType0;
            this.b = v1;
        }

        public JavaType getJavaType() {
            return this.a;
        }

        public int getWireType() {
            return this.b;
        }

        public boolean isPackable() {
            return true;
        }
    }

    public static enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(0.0f),
        DOUBLE(0.0),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.EMPTY),
        ENUM(null),
        MESSAGE(null);

        public final Object a;

        public JavaType(Object object0) {
            this.a = object0;
        }
    }

    public static int getTagFieldNumber(int v) [...] // Inlined contents
}

