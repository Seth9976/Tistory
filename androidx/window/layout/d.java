package androidx.window.layout;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function0 {
    public static final d w;

    static {
        d.w = new d(0);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    public static WindowLayoutComponent b() {
        ClassLoader classLoader0 = SafeWindowLayoutComponentProvider.class.getClassLoader();
        if(classLoader0 != null && SafeWindowLayoutComponentProvider.access$canUseWindowLayoutComponent(SafeWindowLayoutComponentProvider.INSTANCE, classLoader0)) {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            }
            catch(UnsupportedOperationException unused_ex) {
            }
        }
        return null;
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d.b();
    }
}

