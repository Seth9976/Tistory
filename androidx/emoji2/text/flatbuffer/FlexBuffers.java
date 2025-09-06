package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class FlexBuffers {
    public static class Blob extends b {
        public static final Blob d;

        static {
            Blob.d = new Blob(FlexBuffers.a, 1, 1);  // 初始化器: Landroidx/emoji2/text/flatbuffer/b;-><init>(Landroidx/emoji2/text/flatbuffer/ReadBuf;II)V
        }

        public ByteBuffer data() {
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.a.data());
            byteBuffer0.position(this.b);
            byteBuffer0.limit(this.size() + this.b);
            return byteBuffer0.asReadOnlyBuffer().slice();
        }

        public static Blob empty() {
            return Blob.d;
        }

        public byte get(int v) {
            return this.a.get(this.b + v);
        }

        public byte[] getBytes() {
            int v = this.size();
            byte[] arr_b = new byte[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_b[v1] = this.a.get(this.b + v1);
            }
            return arr_b;
        }

        public int size() {
            return this.size;
        }

        @Override  // androidx.emoji2.text.flatbuffer.a
        public String toString() {
            return this.a.getString(this.b, this.size());
        }

        @Override  // androidx.emoji2.text.flatbuffer.a
        public StringBuilder toString(StringBuilder stringBuilder0) {
            stringBuilder0.append('\"');
            stringBuilder0.append(this.a.getString(this.b, this.size()));
            stringBuilder0.append('\"');
            return stringBuilder0;
        }
    }

    public static class FlexBufferException extends RuntimeException {
    }

    public static class Key extends a {
        public static final Key d;

        static {
            Key.d = new Key(FlexBuffers.a, 0, 0);  // 初始化器: Landroidx/emoji2/text/flatbuffer/a;-><init>(Landroidx/emoji2/text/flatbuffer/ReadBuf;II)V
        }

        public static Key empty() {
            return Key.d;
        }

        @Override
        public boolean equals(Object object0) {
            return object0 instanceof Key ? ((Key)object0).b == this.b && ((Key)object0).c == this.c : false;
        }

        @Override
        public int hashCode() {
            return this.b ^ this.c;
        }

        @Override  // androidx.emoji2.text.flatbuffer.a
        public String toString() {
            ReadBuf readBuf0;
            int v = this.b;
            int v1;
            for(v1 = v; true; ++v1) {
                readBuf0 = this.a;
                if(readBuf0.get(v1) == 0) {
                    break;
                }
            }
            return readBuf0.getString(v, v1 - v);
        }

        @Override  // androidx.emoji2.text.flatbuffer.a
        public StringBuilder toString(StringBuilder stringBuilder0) {
            stringBuilder0.append(this.toString());
            return stringBuilder0;
        }
    }

    public static class KeyVector {
        public final TypedVector a;

        public KeyVector(TypedVector flexBuffers$TypedVector0) {
            this.a = flexBuffers$TypedVector0;
        }

        public Key get(int v) {
            if(v >= this.size()) {
                return Key.d;
            }
            int v1 = FlexBuffers.a(this.a.a, v * this.a.c + this.a.b, this.a.c);
            return new Key(this.a.a, v1, 1);  // 初始化器: Landroidx/emoji2/text/flatbuffer/a;-><init>(Landroidx/emoji2/text/flatbuffer/ReadBuf;II)V
        }

        public int size() {
            return this.a.size();
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append('[');
            for(int v = 0; true; ++v) {
                TypedVector flexBuffers$TypedVector0 = this.a;
                if(v >= flexBuffers$TypedVector0.size()) {
                    break;
                }
                flexBuffers$TypedVector0.get(v).a(stringBuilder0);
                if(v != flexBuffers$TypedVector0.size() - 1) {
                    stringBuilder0.append(", ");
                }
            }
            stringBuilder0.append("]");
            return stringBuilder0.toString();
        }
    }

    public static class Map extends Vector {
        public static final Map e;

        static {
            Map.e = new Map(FlexBuffers.a, 1, 1);  // 初始化器: Landroidx/emoji2/text/flatbuffer/b;-><init>(Landroidx/emoji2/text/flatbuffer/ReadBuf;II)V
        }

        public static Map empty() {
            return Map.e;
        }

        public Reference get(String s) {
            return this.get(s.getBytes(StandardCharsets.UTF_8));
        }

        public Reference get(byte[] arr_b) {
            int v7;
            int v6;
            int v3;
            KeyVector flexBuffers$KeyVector0 = this.keys();
            int v = flexBuffers$KeyVector0.size();
            int v1 = flexBuffers$KeyVector0.size() - 1;
            int v2 = 0;
            while(true) {
                if(v2 > v1) {
                    v3 = -(v2 + 1);
                    break;
                }
                v3 = v2 + v1 >>> 1;
                Key flexBuffers$Key0 = flexBuffers$KeyVector0.get(v3);
                int v4 = flexBuffers$Key0.b;
                for(int v5 = 0; true; ++v5) {
                    v6 = flexBuffers$Key0.a.get(v4);
                    v7 = arr_b[v5];
                    if(v6 == 0) {
                        break;
                    }
                    ++v4;
                    if(v5 + 1 == arr_b.length || v6 != v7) {
                        break;
                    }
                }
                int v8 = v6 - v7;
                if(v8 < 0) {
                    v2 = v3 + 1;
                }
                else {
                    if(v8 <= 0) {
                        break;
                    }
                    v1 = v3 - 1;
                }
            }
            return v3 < 0 || v3 >= v ? Reference.f : this.get(v3);
        }

        public KeyVector keys() {
            int v = this.b - this.c * 3;
            int v1 = FlexBuffers.a(this.a, v, this.c);
            int v2 = (int)FlexBuffers.c(this.a, v + this.c, this.c);
            return new KeyVector(new TypedVector(this.a, v1, v2, 4));
        }

        @Override  // androidx.emoji2.text.flatbuffer.FlexBuffers$Vector
        public StringBuilder toString(StringBuilder stringBuilder0) {
            stringBuilder0.append("{ ");
            KeyVector flexBuffers$KeyVector0 = this.keys();
            int v = this.size();
            Vector flexBuffers$Vector0 = this.values();
            for(int v1 = 0; v1 < v; ++v1) {
                stringBuilder0.append('\"');
                stringBuilder0.append(flexBuffers$KeyVector0.get(v1).toString());
                stringBuilder0.append("\" : ");
                stringBuilder0.append(flexBuffers$Vector0.get(v1).toString());
                if(v1 != v - 1) {
                    stringBuilder0.append(", ");
                }
            }
            stringBuilder0.append(" }");
            return stringBuilder0;
        }

        public Vector values() {
            return new Vector(this.a, this.b, this.c);  // 初始化器: Landroidx/emoji2/text/flatbuffer/b;-><init>(Landroidx/emoji2/text/flatbuffer/ReadBuf;II)V
        }
    }

    public static class Reference {
        public final ReadBuf a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public static final Reference f;

        static {
            Reference.f = new Reference(FlexBuffers.a, 0, 1, 0);
        }

        public Reference(ReadBuf readBuf0, int v, int v1, int v2) {
            this(readBuf0, v, v1, 1 << (v2 & 3), v2 >> 2);
        }

        public Reference(ReadBuf readBuf0, int v, int v1, int v2, int v3) {
            this.a = readBuf0;
            this.b = v;
            this.c = v1;
            this.d = v2;
            this.e = v3;
        }

        public final StringBuilder a(StringBuilder stringBuilder0) {
            int v = this.e;
            if(v != 36) {
                switch(v) {
                    case 0: {
                        stringBuilder0.append("null");
                        return stringBuilder0;
                    }
                    case 4: {
                        Key flexBuffers$Key0 = this.asKey();
                        stringBuilder0.append('\"');
                        StringBuilder stringBuilder1 = flexBuffers$Key0.toString(stringBuilder0);
                        stringBuilder1.append('\"');
                        return stringBuilder1;
                    }
                    case 5: {
                        stringBuilder0.append('\"');
                        stringBuilder0.append(this.asString());
                        stringBuilder0.append('\"');
                        return stringBuilder0;
                    }
                    case 1: 
                    case 6: {
                        stringBuilder0.append(this.asLong());
                        return stringBuilder0;
                    }
                    case 2: 
                    case 7: {
                        stringBuilder0.append(this.asUInt());
                        return stringBuilder0;
                    }
                    case 3: 
                    case 8: {
                        stringBuilder0.append(this.asFloat());
                        return stringBuilder0;
                    }
                    case 9: {
                        return this.asMap().toString(stringBuilder0);
                    }
                    case 10: {
                        return this.asVector().toString(stringBuilder0);
                    }
                    case 11: 
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: {
                        break;
                    }
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                    case 24: {
                        throw new FlexBufferException("not_implemented:" + v);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    }
                    case 25: {
                        return this.asBlob().toString(stringBuilder0);
                    }
                    case 26: {
                        stringBuilder0.append(this.asBoolean());
                        return stringBuilder0;
                    }
                    default: {
                        return stringBuilder0;
                    }
                }
            }
            stringBuilder0.append(this.asVector());
            return stringBuilder0;
        }

        public Blob asBlob() {
            if(!this.isBlob() && !this.isString()) {
                return Blob.empty();
            }
            int v = FlexBuffers.a(this.a, this.b, this.c);
            return new Blob(this.a, v, this.d);  // 初始化器: Landroidx/emoji2/text/flatbuffer/b;-><init>(Landroidx/emoji2/text/flatbuffer/ReadBuf;II)V
        }

        // 去混淆评级： 低(20)
        public boolean asBoolean() {
            return this.isBoolean() ? this.a.get(this.b) != 0 : this.asUInt() != 0L;
        }

        public double asFloat() {
            int v = this.c;
            int v1 = this.b;
            ReadBuf readBuf0 = this.a;
            int v2 = this.e;
            if(v2 == 3) {
                return FlexBuffers.b(readBuf0, v1, v);
            }
        alab1:
            switch(v2) {
                case 1: {
                    return (double)(((int)FlexBuffers.c(readBuf0, v1, v)));
                }
                case 2: {
                    break;
                }
                case 5: {
                    return Double.parseDouble(this.asString());
                label_10:
                    int v3 = this.d;
                    switch(v2) {
                        case 6: {
                            return (double)(((int)FlexBuffers.c(readBuf0, FlexBuffers.a(readBuf0, v1, v), v3)));
                        }
                        case 7: {
                            return (double)FlexBuffers.d(readBuf0, FlexBuffers.a(readBuf0, v1, v), v3);
                        }
                        case 8: {
                            return FlexBuffers.b(readBuf0, FlexBuffers.a(readBuf0, v1, v), v3);
                        }
                        case 10: {
                            return (double)this.asVector().size();
                        }
                        case 26: {
                            break alab1;
                        }
                        default: {
                            return 0.0;
                        }
                    }
                }
                default: {
                    goto label_10;
                }
            }
            return (double)FlexBuffers.d(readBuf0, v1, v);
        }

        public int asInt() {
            int v = this.b;
            ReadBuf readBuf0 = this.a;
            int v1 = this.c;
            int v2 = this.e;
            if(v2 == 1) {
                return (int)FlexBuffers.c(readBuf0, v, v1);
            }
            switch(v2) {
                case 2: {
                    return (int)FlexBuffers.d(readBuf0, v, v1);
                }
                case 3: {
                    return (int)FlexBuffers.b(readBuf0, v, v1);
                }
                case 5: {
                    return Integer.parseInt(this.asString());
                }
                default: {
                    int v3 = this.d;
                    switch(v2) {
                        case 6: {
                            return (int)FlexBuffers.c(readBuf0, FlexBuffers.a(readBuf0, v, v1), v3);
                        }
                        case 7: {
                            return (int)FlexBuffers.d(readBuf0, FlexBuffers.a(readBuf0, v, v1), v1);
                        }
                        case 8: {
                            return (int)FlexBuffers.b(readBuf0, FlexBuffers.a(readBuf0, v, v1), v3);
                        }
                        case 10: {
                            return this.asVector().size();
                        }
                        case 26: {
                            return (int)FlexBuffers.c(readBuf0, v, v1);
                        }
                        default: {
                            return 0;
                        }
                    }
                }
            }
        }

        public Key asKey() {
            if(this.isKey()) {
                int v = FlexBuffers.a(this.a, this.b, this.c);
                return new Key(this.a, v, this.d);  // 初始化器: Landroidx/emoji2/text/flatbuffer/a;-><init>(Landroidx/emoji2/text/flatbuffer/ReadBuf;II)V
            }
            return Key.empty();
        }

        public long asLong() {
            int v = this.b;
            ReadBuf readBuf0 = this.a;
            int v1 = this.c;
            int v2 = this.e;
            if(v2 == 1) {
                return FlexBuffers.c(readBuf0, v, v1);
            }
            switch(v2) {
                case 2: {
                    return FlexBuffers.d(readBuf0, v, v1);
                }
                case 3: {
                    return (long)FlexBuffers.b(readBuf0, v, v1);
                }
                case 5: {
                    try {
                        return Long.parseLong(this.asString());
                    }
                    catch(NumberFormatException unused_ex) {
                        return 0L;
                    }
                }
                default: {
                    int v3 = this.d;
                    switch(v2) {
                        case 6: {
                            return FlexBuffers.c(readBuf0, FlexBuffers.a(readBuf0, v, v1), v3);
                        }
                        case 7: {
                            return FlexBuffers.d(readBuf0, FlexBuffers.a(readBuf0, v, v1), v1);
                        }
                        case 8: {
                            return (long)FlexBuffers.b(readBuf0, FlexBuffers.a(readBuf0, v, v1), v3);
                        }
                        case 10: {
                            return (long)this.asVector().size();
                        }
                        case 26: {
                            return (long)(((int)FlexBuffers.c(readBuf0, v, v1)));
                        }
                        default: {
                            return 0L;
                        }
                    }
                }
            }
        }

        public Map asMap() {
            if(this.isMap()) {
                int v = FlexBuffers.a(this.a, this.b, this.c);
                return new Map(this.a, v, this.d);  // 初始化器: Landroidx/emoji2/text/flatbuffer/b;-><init>(Landroidx/emoji2/text/flatbuffer/ReadBuf;II)V
            }
            return Map.empty();
        }

        public String asString() {
            int v = this.d;
            int v1 = this.b;
            ReadBuf readBuf0 = this.a;
            if(this.isString()) {
                int v2 = FlexBuffers.a(readBuf0, v1, this.c);
                return readBuf0.getString(v2, ((int)FlexBuffers.d(readBuf0, v2 - v, v)));
            }
            if(this.isKey()) {
                int v3 = FlexBuffers.a(readBuf0, v1, v);
                int v4;
                for(v4 = v3; readBuf0.get(v4) != 0; ++v4) {
                }
                return readBuf0.getString(v3, v4 - v3);
            }
            return "";
        }

        public long asUInt() {
            int v = this.b;
            ReadBuf readBuf0 = this.a;
            int v1 = this.c;
            int v2 = this.e;
            switch(v2) {
                case 1: {
                    return FlexBuffers.c(readBuf0, v, v1);
                }
                case 2: {
                    return FlexBuffers.d(readBuf0, v, v1);
                }
                case 3: {
                    return (long)FlexBuffers.b(readBuf0, v, v1);
                }
                case 5: {
                    return Long.parseLong(this.asString());
                }
                case 10: {
                    return (long)this.asVector().size();
                }
                case 26: {
                    return (long)(((int)FlexBuffers.c(readBuf0, v, v1)));
                }
                default: {
                    int v3 = this.d;
                    switch(v2) {
                        case 6: {
                            return FlexBuffers.c(readBuf0, FlexBuffers.a(readBuf0, v, v1), v3);
                        }
                        case 7: {
                            return FlexBuffers.d(readBuf0, FlexBuffers.a(readBuf0, v, v1), v3);
                        }
                        case 8: {
                            return (long)FlexBuffers.b(readBuf0, FlexBuffers.a(readBuf0, v, v1), v1);
                        }
                        default: {
                            return 0L;
                        }
                    }
                }
            }
        }

        public Vector asVector() {
            int v = this.d;
            int v1 = this.c;
            int v2 = this.b;
            ReadBuf readBuf0 = this.a;
            if(this.isVector()) {
                return new Vector(readBuf0, FlexBuffers.a(readBuf0, v2, v1), v);  // 初始化器: Landroidx/emoji2/text/flatbuffer/b;-><init>(Landroidx/emoji2/text/flatbuffer/ReadBuf;II)V
            }
            int v3 = this.e;
            if(v3 == 15) {
                return new TypedVector(readBuf0, FlexBuffers.a(readBuf0, v2, v1), v, 4);
            }
            return v3 >= 11 && v3 <= 15 || v3 == 36 ? new TypedVector(readBuf0, FlexBuffers.a(readBuf0, v2, v1), v, v3 - 10) : Vector.empty();
        }

        public int getType() {
            return this.e;
        }

        public boolean isBlob() {
            return this.e == 25;
        }

        public boolean isBoolean() {
            return this.e == 26;
        }

        public boolean isFloat() {
            return this.e == 3 || this.e == 8;
        }

        public boolean isInt() {
            return this.e == 1 || this.e == 6;
        }

        // 去混淆评级： 低(20)
        public boolean isIntOrUInt() {
            return this.isInt() || this.isUInt();
        }

        public boolean isKey() {
            return this.e == 4;
        }

        public boolean isMap() {
            return this.e == 9;
        }

        public boolean isNull() {
            return this.e == 0;
        }

        // 去混淆评级： 低(20)
        public boolean isNumeric() {
            return this.isIntOrUInt() || this.isFloat();
        }

        public boolean isString() {
            return this.e == 5;
        }

        // 去混淆评级： 低(20)
        public boolean isTypedVector() {
            return this.e >= 11 && this.e <= 15 || this.e == 36;
        }

        public boolean isUInt() {
            return this.e == 2 || this.e == 7;
        }

        public boolean isVector() {
            return this.e == 9 || this.e == 10;
        }

        @Override
        public String toString() {
            return this.a(new StringBuilder(0x80)).toString();
        }
    }

    public static class TypedVector extends Vector {
        public final int e;
        public static final TypedVector f;

        static {
            TypedVector.f = new TypedVector(FlexBuffers.a, 1, 1, 1);
        }

        public TypedVector(ReadBuf readBuf0, int v, int v1, int v2) {
            super(readBuf0, v, v1);
            this.e = v2;
        }

        public static TypedVector empty() {
            return TypedVector.f;
        }

        @Override  // androidx.emoji2.text.flatbuffer.FlexBuffers$Vector
        public Reference get(int v) {
            return v < this.size() ? new Reference(this.a, v * this.c + this.b, this.c, 1, this.e) : Reference.f;
        }

        public int getElemType() {
            return this.e;
        }

        public boolean isEmptyVector() {
            return this == TypedVector.f;
        }
    }

    public static class Vector extends b {
        public static final Vector d;

        static {
            Vector.d = new Vector(FlexBuffers.a, 1, 1);  // 初始化器: Landroidx/emoji2/text/flatbuffer/b;-><init>(Landroidx/emoji2/text/flatbuffer/ReadBuf;II)V
        }

        public static Vector empty() {
            return Vector.d;
        }

        public Reference get(int v) {
            long v1 = (long)this.size();
            if(((long)v) >= v1) {
                return Reference.f;
            }
            int v2 = this.a.get(((int)(v1 * ((long)this.c) + ((long)this.b) + ((long)v))));
            return new Reference(this.a, v * this.c + this.b, this.c, v2 & 0xFF);
        }

        public boolean isEmpty() {
            return this == Vector.d;
        }

        public int size() {
            return this.size;
        }

        @Override  // androidx.emoji2.text.flatbuffer.a
        public String toString() {
            return super.toString();
        }

        @Override  // androidx.emoji2.text.flatbuffer.a
        public StringBuilder toString(StringBuilder stringBuilder0) {
            stringBuilder0.append("[ ");
            int v = this.size();
            for(int v1 = 0; v1 < v; ++v1) {
                this.get(v1).a(stringBuilder0);
                if(v1 != v - 1) {
                    stringBuilder0.append(", ");
                }
            }
            stringBuilder0.append(" ]");
            return stringBuilder0;
        }
    }

    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;
    public static final ArrayReadWriteBuf a;

    static {
        FlexBuffers.a = new ArrayReadWriteBuf(new byte[]{0}, 1);
    }

    public static int a(ReadBuf readBuf0, int v, int v1) {
        return (int)(((long)v) - FlexBuffers.d(readBuf0, v, v1));
    }

    public static double b(ReadBuf readBuf0, int v, int v1) {
        switch(v1) {
            case 4: {
                return (double)readBuf0.getFloat(v);
            }
            case 8: {
                return readBuf0.getDouble(v);
            }
            default: {
                return -1.0;
            }
        }
    }

    public static long c(ReadBuf readBuf0, int v, int v1) {
        switch(v1) {
            case 1: {
                return (long)readBuf0.get(v);
            }
            case 2: {
                return (long)readBuf0.getShort(v);
            }
            case 4: {
                return (long)readBuf0.getInt(v);
            }
            case 8: {
                return readBuf0.getLong(v);
            }
            default: {
                return -1L;
            }
        }
    }

    public static long d(ReadBuf readBuf0, int v, int v1) {
        switch(v1) {
            case 1: {
                return (long)(readBuf0.get(v) & 0xFF);
            }
            case 2: {
                return (long)(readBuf0.getShort(v) & 0xFFFF);
            }
            case 4: {
                return ((long)readBuf0.getInt(v)) & 0xFFFFFFFFL;
            }
            case 8: {
                return readBuf0.getLong(v);
            }
            default: {
                return -1L;
            }
        }
    }

    public static int e(int v, int v1) [...] // Inlined contents

    public static Reference getRoot(ReadBuf readBuf0) {
        int v = readBuf0.limit();
        int v1 = readBuf0.get(v - 1);
        return new Reference(readBuf0, v - 2 - v1, v1, readBuf0.get(v - 2) & 0xFF);
    }

    // 去混淆评级： 低(20)
    @Deprecated
    public static Reference getRoot(ByteBuffer byteBuffer0) {
        return byteBuffer0.hasArray() ? FlexBuffers.getRoot(new ArrayReadWriteBuf(byteBuffer0.array(), byteBuffer0.limit())) : FlexBuffers.getRoot(new ByteBufferReadWriteBuf(byteBuffer0));
    }
}

