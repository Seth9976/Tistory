package io.reactivex.observers;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class a extends TestWaitStrategy {
    public a() {
        super("SPIN", 0);
    }

    @Override  // io.reactivex.observers.BaseTestConsumer$TestWaitStrategy
    public final void run() {
    }
}

