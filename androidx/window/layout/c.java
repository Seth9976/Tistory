package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

public final class c extends Lambda implements Function0 {
    public final int w;
    public final ClassLoader x;

    public c(ClassLoader classLoader0, int v) {
        this.w = v;
        this.x = classLoader0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider0 = SafeWindowLayoutComponentProvider.INSTANCE;
                Class class1 = SafeWindowLayoutComponentProvider.access$foldingFeatureClass(safeWindowLayoutComponentProvider0, this.x);
                Method method1 = class1.getMethod("getBounds", null);
                Method method2 = class1.getMethod("getType", null);
                Method method3 = class1.getMethod("getState", null);
                Intrinsics.checkNotNullExpressionValue(method1, "getBoundsMethod");
                if(SafeWindowLayoutComponentProvider.access$doesReturn(safeWindowLayoutComponentProvider0, method1, Reflection.getOrCreateKotlinClass(Rect.class)) && SafeWindowLayoutComponentProvider.access$isPublic(safeWindowLayoutComponentProvider0, method1)) {
                    Intrinsics.checkNotNullExpressionValue(method2, "getTypeMethod");
                    Class class2 = Integer.TYPE;
                    if(SafeWindowLayoutComponentProvider.access$doesReturn(safeWindowLayoutComponentProvider0, method2, Reflection.getOrCreateKotlinClass(class2)) && SafeWindowLayoutComponentProvider.access$isPublic(safeWindowLayoutComponentProvider0, method2)) {
                        Intrinsics.checkNotNullExpressionValue(method3, "getStateMethod");
                        return !SafeWindowLayoutComponentProvider.access$doesReturn(safeWindowLayoutComponentProvider0, method3, Reflection.getOrCreateKotlinClass(class2)) || !SafeWindowLayoutComponentProvider.access$isPublic(safeWindowLayoutComponentProvider0, method3) ? false : true;
                    }
                }
                return false;
            }
            case 1: {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider1 = SafeWindowLayoutComponentProvider.INSTANCE;
                Method method4 = SafeWindowLayoutComponentProvider.access$windowExtensionsClass(safeWindowLayoutComponentProvider1, this.x).getMethod("getWindowLayoutComponent", null);
                Class class3 = SafeWindowLayoutComponentProvider.access$windowLayoutComponentClass(safeWindowLayoutComponentProvider1, this.x);
                Intrinsics.checkNotNullExpressionValue(method4, "getWindowLayoutComponentMethod");
                if(SafeWindowLayoutComponentProvider.access$isPublic(safeWindowLayoutComponentProvider1, method4)) {
                    Intrinsics.checkNotNullExpressionValue(class3, "windowLayoutComponentClass");
                    return SafeWindowLayoutComponentProvider.access$doesReturn(safeWindowLayoutComponentProvider1, method4, class3);
                }
                return false;
            }
            case 2: {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider2 = SafeWindowLayoutComponentProvider.INSTANCE;
                Class class4 = SafeWindowLayoutComponentProvider.access$windowLayoutComponentClass(safeWindowLayoutComponentProvider2, this.x);
                Method method5 = class4.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
                Method method6 = class4.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                Intrinsics.checkNotNullExpressionValue(method5, "addListenerMethod");
                if(SafeWindowLayoutComponentProvider.access$isPublic(safeWindowLayoutComponentProvider2, method5)) {
                    Intrinsics.checkNotNullExpressionValue(method6, "removeListenerMethod");
                    return SafeWindowLayoutComponentProvider.access$isPublic(safeWindowLayoutComponentProvider2, method6);
                }
                return false;
            }
            default: {
                Method method0 = SafeWindowLayoutComponentProvider.access$windowExtensionsProviderClass(SafeWindowLayoutComponentProvider.INSTANCE, this.x).getDeclaredMethod("getWindowExtensions", null);
                Class class0 = SafeWindowLayoutComponentProvider.access$windowExtensionsClass(SafeWindowLayoutComponentProvider.INSTANCE, this.x);
                Intrinsics.checkNotNullExpressionValue(method0, "getWindowExtensionsMethod");
                Intrinsics.checkNotNullExpressionValue(class0, "windowExtensionsClass");
                return !SafeWindowLayoutComponentProvider.access$doesReturn(SafeWindowLayoutComponentProvider.INSTANCE, method0, class0) || !SafeWindowLayoutComponentProvider.access$isPublic(SafeWindowLayoutComponentProvider.INSTANCE, method0) ? false : true;
            }
        }
    }
}

