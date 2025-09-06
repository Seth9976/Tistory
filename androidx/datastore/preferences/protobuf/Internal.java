package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

public final class Internal {
    public interface BooleanList extends ProtobufList {
        void addBoolean(boolean arg1);

        boolean getBoolean(int arg1);

        BooleanList mutableCopyWithCapacity(int arg1);

        @Override  // androidx.datastore.preferences.protobuf.Internal$ProtobufList
        default ProtobufList mutableCopyWithCapacity(int v) {
            return this.mutableCopyWithCapacity(v);
        }

        @CanIgnoreReturnValue
        boolean setBoolean(int arg1, boolean arg2);
    }

    public interface DoubleList extends ProtobufList {
        void addDouble(double arg1);

        double getDouble(int arg1);

        DoubleList mutableCopyWithCapacity(int arg1);

        @Override  // androidx.datastore.preferences.protobuf.Internal$ProtobufList
        default ProtobufList mutableCopyWithCapacity(int v) {
            return this.mutableCopyWithCapacity(v);
        }

        @CanIgnoreReturnValue
        double setDouble(int arg1, double arg2);
    }

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap {
        EnumLite findValueByNumber(int arg1);
    }

    public interface EnumVerifier {
        boolean isInRange(int arg1);
    }

    public interface FloatList extends ProtobufList {
        void addFloat(float arg1);

        float getFloat(int arg1);

        FloatList mutableCopyWithCapacity(int arg1);

        @Override  // androidx.datastore.preferences.protobuf.Internal$ProtobufList
        default ProtobufList mutableCopyWithCapacity(int v) {
            return this.mutableCopyWithCapacity(v);
        }

        @CanIgnoreReturnValue
        float setFloat(int arg1, float arg2);
    }

    public interface IntList extends ProtobufList {
        void addInt(int arg1);

        int getInt(int arg1);

        IntList mutableCopyWithCapacity(int arg1);

        @Override  // androidx.datastore.preferences.protobuf.Internal$ProtobufList
        default ProtobufList mutableCopyWithCapacity(int v) {
            return this.mutableCopyWithCapacity(v);
        }

        @CanIgnoreReturnValue
        int setInt(int arg1, int arg2);
    }

    public static class ListAdapter extends AbstractList {
        public interface Converter {
            Object convert(Object arg1);
        }

        public final List a;
        public final Converter b;

        public ListAdapter(List list0, Converter internal$ListAdapter$Converter0) {
            this.a = list0;
            this.b = internal$ListAdapter$Converter0;
        }

        @Override
        public Object get(int v) {
            Object object0 = this.a.get(v);
            return this.b.convert(object0);
        }

        @Override
        public int size() {
            return this.a.size();
        }
    }

    public interface LongList extends ProtobufList {
        void addLong(long arg1);

        long getLong(int arg1);

        LongList mutableCopyWithCapacity(int arg1);

        @Override  // androidx.datastore.preferences.protobuf.Internal$ProtobufList
        default ProtobufList mutableCopyWithCapacity(int v) {
            return this.mutableCopyWithCapacity(v);
        }

        @CanIgnoreReturnValue
        long setLong(int arg1, long arg2);
    }

    public static class MapAdapter extends AbstractMap {
        public interface androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter {
            Object doBackward(Object arg1);

            Object doForward(Object arg1);
        }

        public final Map a;
        public final androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter b;

        public MapAdapter(Map map0, androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter internal$MapAdapter$Converter0) {
            this.a = map0;
            this.b = internal$MapAdapter$Converter0;
        }

        @Override
        public Set entrySet() {
            return new q1(this, this.a.entrySet());
        }

        @Override
        public Object get(Object object0) {
            Object object1 = this.a.get(object0);
            return object1 == null ? null : this.b.doForward(object1);
        }

        public static androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter newEnumConverter(EnumLiteMap internal$EnumLiteMap0, EnumLite internal$EnumLite0) {
            return new n1(internal$EnumLiteMap0, internal$EnumLite0);
        }

        @Override
        public Object put(Object object0, Object object1) {
            Object object2 = this.b.doBackward(object1);
            Object object3 = this.a.put(object0, object2);
            return object3 == null ? null : this.b.doForward(object3);
        }
    }

    public interface ProtobufList extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList mutableCopyWithCapacity(int arg1);
    }

    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM;
    public static final Charset a;
    public static final Charset b;

    static {
        Charset.forName("US-ASCII");
        Internal.a = Charset.forName("UTF-8");
        Internal.b = Charset.forName("ISO-8859-1");
        byte[] arr_b = new byte[0];
        Internal.EMPTY_BYTE_ARRAY = arr_b;
        Internal.EMPTY_BYTE_BUFFER = ByteBuffer.wrap(arr_b);
        Internal.EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(arr_b);
    }

    public static void a(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
    }

    public static int b(int v, byte[] arr_b, int v1, int v2) {
        for(int v3 = v1; v3 < v1 + v2; ++v3) {
            v = v * 0x1F + arr_b[v3];
        }
        return v;
    }

    public static byte[] byteArrayDefaultValue(String s) {
        return s.getBytes(Internal.b);
    }

    public static ByteBuffer byteBufferDefaultValue(String s) {
        return ByteBuffer.wrap(Internal.byteArrayDefaultValue(s));
    }

    public static ByteString bytesDefaultValue(String s) {
        return ByteString.copyFrom(s.getBytes(Internal.b));
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer0) {
        ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
        byteBuffer1.clear();
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(byteBuffer1.capacity());
        byteBuffer2.put(byteBuffer1);
        byteBuffer2.clear();
        return byteBuffer2;
    }

    public static boolean equals(List list0, List list1) {
        if(list0.size() != list1.size()) {
            return false;
        }
        for(int v = 0; v < list0.size(); ++v) {
            if(!Arrays.equals(((byte[])list0.get(v)), ((byte[])list1.get(v)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer0, ByteBuffer byteBuffer1) {
        if(byteBuffer0.capacity() != byteBuffer1.capacity()) {
            return false;
        }
        ByteBuffer byteBuffer2 = byteBuffer0.duplicate();
        byteBuffer2.clear();
        ByteBuffer byteBuffer3 = byteBuffer1.duplicate();
        byteBuffer3.clear();
        return byteBuffer2.equals(byteBuffer3);
    }

    public static boolean equalsByteBuffer(List list0, List list1) {
        if(list0.size() != list1.size()) {
            return false;
        }
        for(int v = 0; v < list0.size(); ++v) {
            if(!Internal.equalsByteBuffer(((ByteBuffer)list0.get(v)), ((ByteBuffer)list1.get(v)))) {
                return false;
            }
        }
        return true;
    }

    public static MessageLite getDefaultInstance(Class class0) {
        try {
            Method method0 = class0.getMethod("getDefaultInstance", null);
            return (MessageLite)method0.invoke(method0, null);
        }
        catch(Exception exception0) {
            throw new RuntimeException("Failed to get default instance for " + class0, exception0);
        }
    }

    // 去混淆评级： 低(20)
    public static int hashBoolean(boolean z) {
        return z ? 0x4CF : 0x4D5;
    }

    public static int hashCode(List list0) {
        int v = 1;
        for(Object object0: list0) {
            v = v * 0x1F + Internal.hashCode(((byte[])object0));
        }
        return v;
    }

    public static int hashCode(byte[] arr_b) {
        int v = Internal.b(arr_b.length, arr_b, 0, arr_b.length);
        return v == 0 ? 1 : v;
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer0) {
        int v = 0x1000;
        if(byteBuffer0.hasArray()) {
            int v1 = Internal.b(byteBuffer0.capacity(), byteBuffer0.array(), byteBuffer0.arrayOffset(), byteBuffer0.capacity());
            return v1 == 0 ? 1 : v1;
        }
        if(byteBuffer0.capacity() <= 0x1000) {
            v = byteBuffer0.capacity();
        }
        byte[] arr_b = new byte[v];
        ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
        byteBuffer1.clear();
        int v2;
        for(v2 = byteBuffer0.capacity(); byteBuffer1.remaining() > 0; v2 = Internal.b(v2, arr_b, 0, v3)) {
            int v3 = byteBuffer1.remaining() > v ? v : byteBuffer1.remaining();
            byteBuffer1.get(arr_b, 0, v3);
        }
        return v2 == 0 ? 1 : v2;
    }

    public static int hashCodeByteBuffer(List list0) {
        int v = 1;
        for(Object object0: list0) {
            v = v * 0x1F + Internal.hashCodeByteBuffer(((ByteBuffer)object0));
        }
        return v;
    }

    public static int hashEnum(EnumLite internal$EnumLite0) {
        return internal$EnumLite0.getNumber();
    }

    public static int hashEnumList(List list0) {
        int v = 1;
        for(Object object0: list0) {
            v = v * 0x1F + Internal.hashEnum(((EnumLite)object0));
        }
        return v;
    }

    public static int hashLong(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static boolean isValidUtf8(ByteString byteString0) {
        return byteString0.isValidUtf8();
    }

    public static boolean isValidUtf8(byte[] arr_b) {
        return g4.a.l(0, arr_b, 0, arr_b.length) == 0;
    }

    public static String stringDefaultValue(String s) {
        return new String(s.getBytes(Internal.b), Internal.a);
    }

    public static byte[] toByteArray(String s) {
        return s.getBytes(Internal.a);
    }

    public static String toStringUtf8(byte[] arr_b) {
        return new String(arr_b, Internal.a);
    }
}

