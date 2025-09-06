package androidx.datastore.preferences.protobuf;

public abstract class c1 {
    public static final int[] a;
    public static final int[] b;

    static {
        int[] arr_v = new int[FieldType.values().length];
        c1.b = arr_v;
        try {
            arr_v[FieldType.DOUBLE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.FLOAT.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.INT64.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.UINT64.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.INT32.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.FIXED64.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.FIXED32.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.BOOL.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.GROUP.ordinal()] = 9;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.MESSAGE.ordinal()] = 10;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.STRING.ordinal()] = 11;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.BYTES.ordinal()] = 12;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.UINT32.ordinal()] = 13;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.SFIXED32.ordinal()] = 14;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.SFIXED64.ordinal()] = 15;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.SINT32.ordinal()] = 16;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.SINT64.ordinal()] = 17;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.b[FieldType.ENUM.ordinal()] = 18;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v1 = new int[JavaType.values().length];
        c1.a = arr_v1;
        try {
            arr_v1[JavaType.INT.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.a[JavaType.LONG.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.a[JavaType.FLOAT.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.a[JavaType.DOUBLE.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.a[JavaType.BOOLEAN.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.a[JavaType.STRING.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.a[JavaType.BYTE_STRING.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.a[JavaType.ENUM.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c1.a[JavaType.MESSAGE.ordinal()] = 9;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

