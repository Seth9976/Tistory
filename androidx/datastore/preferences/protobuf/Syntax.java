package androidx.datastore.preferences.protobuf;

public enum Syntax implements EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    public final int a;
    public static final q3 b;

    static {
        Syntax.b = new q3();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public Syntax(int v1) {
        this.a = v1;
    }

    public static Syntax forNumber(int v) {
        switch(v) {
            case 0: {
                return Syntax.SYNTAX_PROTO2;
            }
            case 1: {
                return Syntax.SYNTAX_PROTO3;
            }
            default: {
                return null;
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        if(this == Syntax.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }

    public static EnumLiteMap internalGetValueMap() {
        return Syntax.b;
    }

    public static EnumVerifier internalGetVerifier() {
        return r3.a;
    }

    @Deprecated
    public static Syntax valueOf(int v) {
        return Syntax.forNumber(v);
    }
}

