package androidx.window.layout;

import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001R\u001D\u0010\u0007\u001A\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/window/layout/SafeWindowLayoutComponentProvider;", "", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "a", "Lkotlin/Lazy;", "getWindowLayoutComponent", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "windowLayoutComponent", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SafeWindowLayoutComponentProvider {
    @NotNull
    public static final SafeWindowLayoutComponentProvider INSTANCE;
    public static final Lazy a;

    static {
        SafeWindowLayoutComponentProvider.INSTANCE = new SafeWindowLayoutComponentProvider();  // 初始化器: Ljava/lang/Object;-><init>()V
        SafeWindowLayoutComponentProvider.a = c.lazy(d.w);
    }

    public static boolean a(Function0 function00) {
        try {
            return ((Boolean)function00.invoke()).booleanValue();
        }
        catch(ClassNotFoundException | NoSuchMethodException unused_ex) {
            return false;
        }
    }

    // 去混淆评级： 低(20)
    public static final boolean access$canUseWindowLayoutComponent(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider0, ClassLoader classLoader0) {
        safeWindowLayoutComponentProvider0.getClass();
        return SafeWindowLayoutComponentProvider.a(new androidx.window.layout.c(classLoader0, 3)) && SafeWindowLayoutComponentProvider.a(new androidx.window.layout.c(classLoader0, 1)) && SafeWindowLayoutComponentProvider.a(new androidx.window.layout.c(classLoader0, 2)) && SafeWindowLayoutComponentProvider.a(new androidx.window.layout.c(classLoader0, 0));
    }

    public static final boolean access$doesReturn(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider0, Method method0, Class class0) {
        safeWindowLayoutComponentProvider0.getClass();
        return method0.getReturnType().equals(class0);
    }

    public static final boolean access$doesReturn(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider0, Method method0, KClass kClass0) {
        safeWindowLayoutComponentProvider0.getClass();
        Class class0 = JvmClassMappingKt.getJavaClass(kClass0);
        return method0.getReturnType().equals(class0);
    }

    public static final Class access$foldingFeatureClass(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider0, ClassLoader classLoader0) {
        safeWindowLayoutComponentProvider0.getClass();
        return classLoader0.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    public static final boolean access$isPublic(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider0, Method method0) {
        safeWindowLayoutComponentProvider0.getClass();
        return Modifier.isPublic(method0.getModifiers());
    }

    public static final Class access$windowExtensionsClass(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider0, ClassLoader classLoader0) {
        safeWindowLayoutComponentProvider0.getClass();
        return classLoader0.loadClass("androidx.window.extensions.WindowExtensions");
    }

    public static final Class access$windowExtensionsProviderClass(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider0, ClassLoader classLoader0) {
        safeWindowLayoutComponentProvider0.getClass();
        return classLoader0.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    public static final Class access$windowLayoutComponentClass(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider0, ClassLoader classLoader0) {
        safeWindowLayoutComponentProvider0.getClass();
        return classLoader0.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    @Nullable
    public final WindowLayoutComponent getWindowLayoutComponent() {
        return (WindowLayoutComponent)SafeWindowLayoutComponentProvider.a.getValue();
    }
}

