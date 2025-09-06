package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

public final class WireFormat {
    public static enum FieldType {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        public final class j4 extends FieldType {
            @Override  // androidx.datastore.preferences.protobuf.WireFormat$FieldType
            public final boolean isPackable() {
                return false;
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        public final class k4 extends FieldType {
            @Override  // androidx.datastore.preferences.protobuf.WireFormat$FieldType
            public final boolean isPackable() {
                return false;
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        public final class l4 extends FieldType {
            @Override  // androidx.datastore.preferences.protobuf.WireFormat$FieldType
            public final boolean isPackable() {
                return false;
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        public final class m4 extends FieldType {
            @Override  // androidx.datastore.preferences.protobuf.WireFormat$FieldType
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
        STRING(JavaType.STRING, 2) /* 警告！未生成枚举子类：androidx.datastore.preferences.protobuf.j4 */,
        GROUP(JavaType.MESSAGE, 3) /* 警告！未生成枚举子类：androidx.datastore.preferences.protobuf.k4 */,
        MESSAGE(JavaType.MESSAGE, 2) /* 警告！未生成枚举子类：androidx.datastore.preferences.protobuf.l4 */,
        BYTES(JavaType.BYTE_STRING, 2) /* 警告！未生成枚举子类：androidx.datastore.preferences.protobuf.m4 */,
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

        public final Serializable a;

        public JavaType(Serializable serializable0) {
            this.a = serializable0;
        }
    }

    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT;

    public static Object a(CodedInputStream codedInputStream0, FieldType wireFormat$FieldType0, int v) {
        switch(i4.a[wireFormat$FieldType0.ordinal()]) {
            case 1: {
                return codedInputStream0.readDouble();
            }
            case 2: {
                return codedInputStream0.readFloat();
            }
            case 3: {
                return codedInputStream0.readInt64();
            }
            case 4: {
                return codedInputStream0.readUInt64();
            }
            case 5: {
                return codedInputStream0.readInt32();
            }
            case 6: {
                return codedInputStream0.readFixed64();
            }
            case 7: {
                return codedInputStream0.readFixed32();
            }
            case 8: {
                return Boolean.valueOf(codedInputStream0.readBool());
            }
            case 9: {
                return codedInputStream0.readBytes();
            }
            case 10: {
                return codedInputStream0.readUInt32();
            }
            case 11: {
                return codedInputStream0.readSFixed32();
            }
            case 12: {
                return codedInputStream0.readSFixed64();
            }
            case 13: {
                return codedInputStream0.readSInt32();
            }
            case 14: {
                return codedInputStream0.readSInt64();
            }
            case 15: {
                switch(v) {
                    case 1: {
                        return codedInputStream0.readString();
                    }
                    case 2: {
                        return codedInputStream0.readStringRequireUtf8();
                    }
                    default: {
                        return codedInputStream0.readBytes();
                    }
                }
            }
            case 16: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            }
            case 17: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            }
            case 18: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    public static int getTagFieldNumber(int v) [...] // Inlined contents

    public static int getTagWireType(int v) [...] // Inlined contents
}

