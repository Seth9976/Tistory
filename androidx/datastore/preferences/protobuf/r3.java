package androidx.datastore.preferences.protobuf;

public final class r3 implements EnumVerifier {
    public static final r3 a;

    static {
        r3.a = new r3();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$EnumVerifier
    public final boolean isInRange(int v) {
        return Syntax.forNumber(v) != null;
    }
}

