package retrofit2;

public final class l0 implements SkipCallbackExecutor {
    public static final l0 a;

    static {
        l0.a = new l0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    // 检测为 Lambda 实现
    @Override
    public final Class annotationType() [...]

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof SkipCallbackExecutor;
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    // 去混淆评级： 中等(60)
    @Override
    public final String toString() {
        return "@retrofit2.SkipCallbackExecutor()";
    }
}

