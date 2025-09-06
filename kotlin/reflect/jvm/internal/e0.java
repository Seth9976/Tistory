package kotlin.reflect.jvm.internal;

import aa.m;
import fe.h;
import fe.i;
import fe.j;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

public final class e0 extends Data {
    public final LazySoftVal c;
    public final LazySoftVal d;
    public final LazyVal e;
    public final LazyVal f;
    public final LazySoftVal g;
    public static final KProperty[] h;

    static {
        e0.h = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(e0.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(e0.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(e0.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(e0.class), "metadata", "getMetadata()Lkotlin/Triple;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(e0.class), "members", "getMembers()Ljava/util/Collection;"))};
    }

    public e0(KPackageImpl kPackageImpl0) {
        super();
        this.c = ReflectProperties.lazySoft(new h(kPackageImpl0));
        this.d = ReflectProperties.lazySoft(new j(this));
        this.e = ReflectProperties.lazy(new m(20, this, kPackageImpl0));
        this.f = ReflectProperties.lazy(new i(this));
        this.g = ReflectProperties.lazySoft(new d0(kPackageImpl0, this));
    }
}

