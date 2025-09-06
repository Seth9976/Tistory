package androidx.window.layout;

import kotlin.jvm.internal.Intrinsics;

public final class a implements WindowInfoTrackerDecorator {
    public static final a a;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.window.layout.WindowInfoTrackerDecorator
    public final WindowInfoTracker decorate(WindowInfoTracker windowInfoTracker0) {
        Intrinsics.checkNotNullParameter(windowInfoTracker0, "tracker");
        return windowInfoTracker0;
    }
}

