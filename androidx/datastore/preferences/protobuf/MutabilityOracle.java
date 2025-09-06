package androidx.datastore.preferences.protobuf;

interface MutabilityOracle {
    public static final MutabilityOracle IMMUTABLE;

    static {
        MutabilityOracle.IMMUTABLE = new m2();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    void ensureMutable();
}

