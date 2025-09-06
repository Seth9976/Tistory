package kotlin.reflect.jvm.internal.impl.protobuf;

public abstract class c {
    public static final int[] a;
    public static final int[] b;

    static {
        int[] arr_v = new int[FieldType.values().length];
        c.b = arr_v;
        try {
            arr_v[FieldType.DOUBLE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.FLOAT.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.INT64.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.UINT64.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.INT32.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.FIXED64.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.FIXED32.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.BOOL.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.STRING.ordinal()] = 9;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.BYTES.ordinal()] = 10;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.UINT32.ordinal()] = 11;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.SFIXED32.ordinal()] = 12;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.SFIXED64.ordinal()] = 13;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.SINT32.ordinal()] = 14;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.SINT64.ordinal()] = 15;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.GROUP.ordinal()] = 16;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.MESSAGE.ordinal()] = 17;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.b[FieldType.ENUM.ordinal()] = 18;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v1 = new int[JavaType.values().length];
        c.a = arr_v1;
        try {
            arr_v1[JavaType.INT.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[JavaType.LONG.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[JavaType.FLOAT.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[JavaType.DOUBLE.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[JavaType.BOOLEAN.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[JavaType.STRING.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[JavaType.BYTE_STRING.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[JavaType.ENUM.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[JavaType.MESSAGE.ordinal()] = 9;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

