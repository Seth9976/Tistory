package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import g.b;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nReflectJavaRecordComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaRecordComponent.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaRecordComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class ReflectJavaRecordComponent extends ReflectJavaMember implements JavaRecordComponent {
    public final Object a;

    public ReflectJavaRecordComponent(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "recordComponent");
        super();
        this.a = object0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    @NotNull
    public Member getMember() {
        Object object0 = this.a;
        Intrinsics.checkNotNullParameter(object0, "recordComponent");
        Java16RecordComponentsLoader.Cache java16RecordComponentsLoader$Cache0 = b.a;
        Member member0 = null;
        if(java16RecordComponentsLoader$Cache0 == null) {
            Class class0 = object0.getClass();
            try {
                java16RecordComponentsLoader$Cache0 = new Java16RecordComponentsLoader.Cache(class0.getMethod("getType", null), class0.getMethod("getAccessor", null));
            }
            catch(NoSuchMethodException unused_ex) {
                java16RecordComponentsLoader$Cache0 = new Java16RecordComponentsLoader.Cache(null, null);
            }
            b.a = java16RecordComponentsLoader$Cache0;
        }
        Method method0 = java16RecordComponentsLoader$Cache0.getGetAccessor();
        if(method0 != null) {
            Object object1 = method0.invoke(object0, null);
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type java.lang.reflect.Method");
            member0 = (Method)object1;
        }
        if(member0 == null) {
            throw new NoSuchMethodError("Can\'t find `getAccessor` method");
        }
        return member0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    @NotNull
    public JavaType getType() {
        Object object0 = this.a;
        Intrinsics.checkNotNullParameter(object0, "recordComponent");
        Java16RecordComponentsLoader.Cache java16RecordComponentsLoader$Cache0 = b.a;
        Class class0 = null;
        if(java16RecordComponentsLoader$Cache0 == null) {
            Class class1 = object0.getClass();
            try {
                java16RecordComponentsLoader$Cache0 = new Java16RecordComponentsLoader.Cache(class1.getMethod("getType", null), class1.getMethod("getAccessor", null));
            }
            catch(NoSuchMethodException unused_ex) {
                java16RecordComponentsLoader$Cache0 = new Java16RecordComponentsLoader.Cache(null, null);
            }
            b.a = java16RecordComponentsLoader$Cache0;
        }
        Method method0 = java16RecordComponentsLoader$Cache0.getGetType();
        if(method0 != null) {
            Object object1 = method0.invoke(object0, null);
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type java.lang.Class<*>");
            class0 = (Class)object1;
        }
        if(class0 == null) {
            throw new NoSuchMethodError("Can\'t find `getType` method");
        }
        return new ReflectJavaClassifierType(class0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    public boolean isVararg() {
        return false;
    }
}

