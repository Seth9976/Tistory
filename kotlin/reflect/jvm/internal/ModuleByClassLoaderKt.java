package kotlin.reflect.jvm.internal;

import fe.q;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0002\u001A\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u000F\u0010\u0005\u001A\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "getOrCreateModule", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "", "clearModuleByClassLoaderCache", "()V", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nmoduleByClassLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 moduleByClassLoader.kt\nkotlin/reflect/jvm/internal/ModuleByClassLoaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
public final class ModuleByClassLoaderKt {
    public static final ConcurrentHashMap a;

    static {
        ModuleByClassLoaderKt.a = new ConcurrentHashMap();
    }

    public static final void clearModuleByClassLoaderCache() {
        ModuleByClassLoaderKt.a.clear();
    }

    @NotNull
    public static final RuntimeModuleData getOrCreateModule(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "<this>");
        ClassLoader classLoader0 = ReflectClassUtilKt.getSafeClassLoader(class0);
        q q0 = new q(classLoader0);
        ConcurrentHashMap concurrentHashMap0 = ModuleByClassLoaderKt.a;
        WeakReference weakReference0 = (WeakReference)concurrentHashMap0.get(q0);
        if(weakReference0 != null) {
            RuntimeModuleData runtimeModuleData0 = (RuntimeModuleData)weakReference0.get();
            if(runtimeModuleData0 != null) {
                return runtimeModuleData0;
            }
            concurrentHashMap0.remove(q0, weakReference0);
        }
        RuntimeModuleData runtimeModuleData1 = RuntimeModuleData.Companion.create(classLoader0);
        while(true) {
            WeakReference weakReference1 = (WeakReference)concurrentHashMap0.putIfAbsent(q0, new WeakReference(runtimeModuleData1));
            if(weakReference1 == null) {
                return runtimeModuleData1;
            }
            RuntimeModuleData runtimeModuleData2 = (RuntimeModuleData)weakReference1.get();
            if(runtimeModuleData2 != null) {
                return runtimeModuleData2;
            }
            concurrentHashMap0.remove(q0, weakReference1);
        }
    }
}

