package androidx.navigation;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"&\u0010\u0007\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\".\u0010\u0010\u001A\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000B0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"", "Ljava/lang/Class;", "Landroid/os/Bundle;", "a", "[Ljava/lang/Class;", "getMethodSignature", "()[Ljava/lang/Class;", "methodSignature", "Landroidx/collection/ArrayMap;", "Lkotlin/reflect/KClass;", "Landroidx/navigation/NavArgs;", "Ljava/lang/reflect/Method;", "b", "Landroidx/collection/ArrayMap;", "getMethodMap", "()Landroidx/collection/ArrayMap;", "methodMap", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class NavArgsLazyKt {
    public static final Class[] a;
    public static final ArrayMap b;

    static {
        NavArgsLazyKt.a = new Class[]{Bundle.class};
        NavArgsLazyKt.b = new ArrayMap();
    }

    @NotNull
    public static final ArrayMap getMethodMap() {
        return NavArgsLazyKt.b;
    }

    @NotNull
    public static final Class[] getMethodSignature() {
        return NavArgsLazyKt.a;
    }
}

