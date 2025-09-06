package androidx.datastore.preferences.protobuf;

public abstract class r0 {
    public static final int[] a;

    static {
        int[] arr_v = new int[FieldType.values().length];
        r0.a = arr_v;
        try {
            arr_v[FieldType.DOUBLE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.FLOAT.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.INT64.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.UINT64.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.INT32.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.FIXED64.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.FIXED32.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.BOOL.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.UINT32.ordinal()] = 9;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.SFIXED32.ordinal()] = 10;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.SFIXED64.ordinal()] = 11;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.SINT32.ordinal()] = 12;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.SINT64.ordinal()] = 13;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.ENUM.ordinal()] = 14;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.BYTES.ordinal()] = 15;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.STRING.ordinal()] = 16;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.GROUP.ordinal()] = 17;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            r0.a[FieldType.MESSAGE.ordinal()] = 18;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

