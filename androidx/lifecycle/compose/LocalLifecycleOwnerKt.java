package androidx.lifecycle.compose;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.lifecycle.LifecycleOwner;
import i4.o;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\"#\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001A\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/lifecycle/LifecycleOwner;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalLifecycleOwner", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "LocalLifecycleOwnerKt")
@SourceDebugExtension({"SMAP\nLocalLifecycleOwner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalLifecycleOwner.android.kt\nandroidx/lifecycle/compose/LocalLifecycleOwnerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n18987#2,2:67\n*S KotlinDebug\n*F\n+ 1 LocalLifecycleOwner.android.kt\nandroidx/lifecycle/compose/LocalLifecycleOwnerKt\n*L\n49#1:67,2\n*E\n"})
public final class LocalLifecycleOwnerKt {
    public static final ProvidableCompositionLocal a;

    static {
        ProvidableCompositionLocal providableCompositionLocal2;
        ProvidableCompositionLocal providableCompositionLocal1;
        ProvidableCompositionLocal providableCompositionLocal0 = null;
        try {
            ClassLoader classLoader0 = LifecycleOwner.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader0);
            Method method0 = classLoader0.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] arr_annotation = method0.getAnnotations();
            int v = 0;
            while(v < arr_annotation.length) {
                if(!(arr_annotation[v] instanceof Deprecated)) {
                    ++v;
                    continue;
                }
                providableCompositionLocal1 = null;
                goto label_14;
            }
            Object object0 = method0.invoke(null, null);
            providableCompositionLocal1 = object0 instanceof ProvidableCompositionLocal ? ((ProvidableCompositionLocal)object0) : null;
        label_14:
            providableCompositionLocal2 = providableCompositionLocal1;
        }
        catch(Throwable throwable0) {
            providableCompositionLocal2 = Result.constructor-impl(ResultKt.createFailure(throwable0));
        }
        if(!Result.isFailure-impl(providableCompositionLocal2)) {
            providableCompositionLocal0 = providableCompositionLocal2;
        }
        LocalLifecycleOwnerKt.a = providableCompositionLocal0 == null ? CompositionLocalKt.staticCompositionLocalOf(o.w) : providableCompositionLocal0;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalLifecycleOwner() {
        return LocalLifecycleOwnerKt.a;
    }

    public static void getLocalLifecycleOwner$annotations() {
    }
}

