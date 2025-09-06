package androidx.datastore.preferences.protobuf;

public final class s2 implements EnumVerifier {
    public static final s2 a;

    static {
        s2.a = new s2();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$EnumVerifier
    public final boolean isInRange(int v) {
        return NullValue.forNumber(v) != null;
    }
}

