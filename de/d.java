package de;

import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.full.KClasses;

public final class d extends PropertyReference1 {
    public static final d b;

    static {
        d.b = new d();  // 初始化器: Lkotlin/jvm/internal/PropertyReference1;-><init>()V
    }

    @Override  // kotlin.reflect.KProperty1
    public final Object get(Object object0) {
        return KClasses.getSuperclasses(((KClass)object0));
    }

    @Override  // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "superclasses";
    }

    @Override  // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinPackage(KClasses.class, "kotlin-reflection");
    }

    @Override  // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
    }
}

