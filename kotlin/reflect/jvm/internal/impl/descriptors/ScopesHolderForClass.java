package kotlin.reflect.jvm.internal.impl.descriptors;

import j0.t1;
import j2.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public final class ScopesHolderForClass {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ScopesHolderForClass create(@NotNull ClassDescriptor classDescriptor0, @NotNull StorageManager storageManager0, @NotNull KotlinTypeRefiner kotlinTypeRefiner0, @NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
            Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefinerForOwnerModule");
            Intrinsics.checkNotNullParameter(function10, "scopeFactory");
            return new ScopesHolderForClass(classDescriptor0, storageManager0, function10, kotlinTypeRefiner0, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final ClassDescriptor a;
    public final Function1 b;
    public final KotlinTypeRefiner c;
    public final NotNullLazyValue d;
    public static final KProperty[] e;

    static {
        ScopesHolderForClass.e = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ScopesHolderForClass.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
        ScopesHolderForClass.Companion = new Companion(null);
    }

    public ScopesHolderForClass(ClassDescriptor classDescriptor0, StorageManager storageManager0, Function1 function10, KotlinTypeRefiner kotlinTypeRefiner0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = classDescriptor0;
        this.b = function10;
        this.c = kotlinTypeRefiner0;
        this.d = storageManager0.createLazyValue(new j(this, 5));
    }

    public static final KotlinTypeRefiner access$getKotlinTypeRefinerForOwnerModule$p(ScopesHolderForClass scopesHolderForClass0) {
        return scopesHolderForClass0.c;
    }

    public static final Function1 access$getScopeFactory$p(ScopesHolderForClass scopesHolderForClass0) {
        return scopesHolderForClass0.b;
    }

    @NotNull
    public final MemberScope getScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        ClassDescriptor classDescriptor0 = this.a;
        boolean z = kotlinTypeRefiner0.isRefinementNeededForModule(DescriptorUtilsKt.getModule(classDescriptor0));
        NotNullLazyValue notNullLazyValue0 = this.d;
        KProperty[] arr_kProperty = ScopesHolderForClass.e;
        if(!z) {
            return (MemberScope)StorageKt.getValue(notNullLazyValue0, this, arr_kProperty[0]);
        }
        TypeConstructor typeConstructor0 = classDescriptor0.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor0, "classDescriptor.typeConstructor");
        return kotlinTypeRefiner0.isRefinementNeededForTypeConstructor(typeConstructor0) ? kotlinTypeRefiner0.getOrPutScopeForClass(classDescriptor0, new t1(8, this, kotlinTypeRefiner0)) : ((MemberScope)StorageKt.getValue(notNullLazyValue0, this, arr_kProperty[0]));
    }
}

