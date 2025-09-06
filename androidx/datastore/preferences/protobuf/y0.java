package androidx.datastore.preferences.protobuf;

public final class y0 implements EnumVerifier {
    public static final y0 a;

    static {
        y0.a = new y0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$EnumVerifier
    public final boolean isInRange(int v) {
        return Kind.forNumber(v) != null;
    }
}

