package androidx.datastore.preferences.protobuf;

public enum NullValue implements EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE;
    public final int a;
    public static final r2 b;

    static {
        NullValue.b = new r2();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public NullValue(int v1) {
        this.a = v1;
    }

    public static NullValue forNumber(int v) {
        return v == 0 ? NullValue.NULL_VALUE : null;
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        if(this == NullValue.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }

    public static EnumLiteMap internalGetValueMap() {
        return NullValue.b;
    }

    public static EnumVerifier internalGetVerifier() {
        return s2.a;
    }

    @Deprecated
    public static NullValue valueOf(int v) {
        return NullValue.forNumber(v);
    }
}

