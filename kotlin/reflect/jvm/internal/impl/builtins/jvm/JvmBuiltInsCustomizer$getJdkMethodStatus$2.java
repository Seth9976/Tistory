package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import je.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler;
import org.jetbrains.annotations.NotNull;

public final class JvmBuiltInsCustomizer.getJdkMethodStatus.2 extends AbstractNodeHandler {
    public final String a;
    public final ObjectRef b;

    public JvmBuiltInsCustomizer.getJdkMethodStatus.2(String s, ObjectRef ref$ObjectRef0) {
        this.a = s;
        this.b = ref$ObjectRef0;
        super();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.utils.DFS$AbstractNodeHandler
    public boolean beforeChildren(Object object0) {
        return this.beforeChildren(((ClassDescriptor)object0));
    }

    public boolean beforeChildren(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "javaClassDescriptor");
        String s = MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, classDescriptor0, this.a);
        JvmBuiltInsSignatures jvmBuiltInsSignatures0 = JvmBuiltInsSignatures.INSTANCE;
        boolean z = jvmBuiltInsSignatures0.getHIDDEN_METHOD_SIGNATURES().contains(s);
        ObjectRef ref$ObjectRef0 = this.b;
        if(z) {
            ref$ObjectRef0.element = d.a;
            return ref$ObjectRef0.element == null;
        }
        if(jvmBuiltInsSignatures0.getVISIBLE_METHOD_SIGNATURES().contains(s)) {
            ref$ObjectRef0.element = d.b;
            return ref$ObjectRef0.element == null;
        }
        if(jvmBuiltInsSignatures0.getDROP_LIST_METHOD_SIGNATURES().contains(s)) {
            ref$ObjectRef0.element = d.d;
        }
        return ref$ObjectRef0.element == null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.utils.DFS$NodeHandler
    public Object result() {
        return this.result();
    }

    @NotNull
    public d result() {
        d d0 = (d)this.b.element;
        return d0 == null ? d.c : d0;
    }
}

