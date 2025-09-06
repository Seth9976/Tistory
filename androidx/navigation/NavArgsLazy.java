package androidx.navigation;

import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001A\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Landroidx/navigation/NavArgsLazy;", "Landroidx/navigation/NavArgs;", "Args", "Lkotlin/Lazy;", "Lkotlin/reflect/KClass;", "navArgsClass", "Lkotlin/Function0;", "Landroid/os/Bundle;", "argumentProducer", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)V", "", "isInitialized", "()Z", "getValue", "()Landroidx/navigation/NavArgs;", "value", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NavArgsLazy implements Lazy {
    public final KClass a;
    public final Function0 b;
    public NavArgs c;

    public NavArgsLazy(@NotNull KClass kClass0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(kClass0, "navArgsClass");
        Intrinsics.checkNotNullParameter(function00, "argumentProducer");
        super();
        this.a = kClass0;
        this.b = function00;
    }

    @NotNull
    public NavArgs getValue() {
        NavArgs navArgs0 = this.c;
        if(navArgs0 == null) {
            Bundle bundle0 = (Bundle)this.b.invoke();
            KClass kClass0 = this.a;
            Method method0 = (Method)NavArgsLazyKt.getMethodMap().get(kClass0);
            if(method0 == null) {
                Class class0 = JvmClassMappingKt.getJavaClass(kClass0);
                Class[] arr_class = NavArgsLazyKt.getMethodSignature();
                method0 = class0.getMethod("fromBundle", ((Class[])Arrays.copyOf(arr_class, arr_class.length)));
                NavArgsLazyKt.getMethodMap().put(kClass0, method0);
                Intrinsics.checkNotNullExpressionValue(method0, "navArgsClass.java.getMet…                        }");
            }
            Object object0 = method0.invoke(null, bundle0);
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
            navArgs0 = (NavArgs)object0;
            this.c = navArgs0;
        }
        return navArgs0;
    }

    @Override  // kotlin.Lazy
    public Object getValue() {
        return this.getValue();
    }

    @Override  // kotlin.Lazy
    public boolean isInitialized() {
        return this.c != null;
    }
}

