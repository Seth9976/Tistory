package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import j0.t1;
import java.util.Collection;
import je.b;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ClassId getCLONEABLE_CLASS_ID() {
            return JvmBuiltInClassDescriptorFactory.g;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final ModuleDescriptor a;
    public final Function1 b;
    public final NotNullLazyValue c;
    public static final KProperty[] d;
    public static final FqName e;
    public static final Name f;
    public static final ClassId g;

    static {
        JvmBuiltInClassDescriptorFactory.d = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltInClassDescriptorFactory.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        JvmBuiltInClassDescriptorFactory.Companion = new Companion(null);
        JvmBuiltInClassDescriptorFactory.e = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;
        Name name0 = FqNames.cloneable.shortName();
        Intrinsics.checkNotNullExpressionValue(name0, "cloneable.shortName()");
        JvmBuiltInClassDescriptorFactory.f = name0;
        ClassId classId0 = ClassId.topLevel(FqNames.cloneable.toSafe());
        Intrinsics.checkNotNullExpressionValue(classId0, "topLevel(StandardNames.FqNames.cloneable.toSafe())");
        JvmBuiltInClassDescriptorFactory.g = classId0;
    }

    public JvmBuiltInClassDescriptorFactory(@NotNull StorageManager storageManager0, @NotNull ModuleDescriptor moduleDescriptor0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(function10, "computeContainingDeclaration");
        super();
        this.a = moduleDescriptor0;
        this.b = function10;
        this.c = storageManager0.createLazyValue(new t1(3, this, storageManager0));
    }

    public JvmBuiltInClassDescriptorFactory(StorageManager storageManager0, ModuleDescriptor moduleDescriptor0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            function10 = b.w;
        }
        this(storageManager0, moduleDescriptor0, function10);
    }

    public static final Name access$getCLONEABLE_NAME$cp() {
        return JvmBuiltInClassDescriptorFactory.f;
    }

    public static final Function1 access$getComputeContainingDeclaration$p(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory0) {
        return jvmBuiltInClassDescriptorFactory0.b;
    }

    public static final FqName access$getKOTLIN_FQ_NAME$cp() {
        return JvmBuiltInClassDescriptorFactory.e;
    }

    public static final ModuleDescriptor access$getModuleDescriptor$p(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory0) {
        return jvmBuiltInClassDescriptorFactory0.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @Nullable
    public ClassDescriptor createClass(@NotNull ClassId classId0) {
        Intrinsics.checkNotNullParameter(classId0, "classId");
        return Intrinsics.areEqual(classId0, JvmBuiltInClassDescriptorFactory.g) ? ((ClassDescriptorImpl)StorageKt.getValue(this.c, this, JvmBuiltInClassDescriptorFactory.d[0])) : null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @NotNull
    public Collection getAllContributedClassesIfPossible(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "packageFqName");
        return Intrinsics.areEqual(fqName0, JvmBuiltInClassDescriptorFactory.e) ? e0.setOf(((ClassDescriptorImpl)StorageKt.getValue(this.c, this, JvmBuiltInClassDescriptorFactory.d[0]))) : f0.emptySet();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(@NotNull FqName fqName0, @NotNull Name name0) {
        Intrinsics.checkNotNullParameter(fqName0, "packageFqName");
        Intrinsics.checkNotNullParameter(name0, "name");
        return Intrinsics.areEqual(name0, JvmBuiltInClassDescriptorFactory.f) && Intrinsics.areEqual(fqName0, JvmBuiltInClassDescriptorFactory.e);
    }
}

