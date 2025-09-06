package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nJvmBuiltIns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltIns.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
public final class JvmBuiltIns extends KotlinBuiltIns {
    public static enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK;

    }

    public static final class Settings {
        public final ModuleDescriptor a;
        public final boolean b;

        public Settings(@NotNull ModuleDescriptor moduleDescriptor0, boolean z) {
            Intrinsics.checkNotNullParameter(moduleDescriptor0, "ownerModuleDescriptor");
            super();
            this.a = moduleDescriptor0;
            this.b = z;
        }

        @NotNull
        public final ModuleDescriptor getOwnerModuleDescriptor() {
            return this.a;
        }

        public final boolean isAdditionalBuiltInsFeatureSupported() {
            return this.b;
        }
    }

    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Kind.values().length];
            try {
                arr_v[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Kind.FALLBACK.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public Function0 f;
    public final NotNullLazyValue g;
    public static final KProperty[] h;

    static {
        JvmBuiltIns.h = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltIns.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    public JvmBuiltIns(@NotNull StorageManager storageManager0, @NotNull Kind jvmBuiltIns$Kind0) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(jvmBuiltIns$Kind0, "kind");
        super(storageManager0);
        this.g = storageManager0.createLazyValue(new b(this, storageManager0));
        switch(WhenMappings.$EnumSwitchMapping$0[jvmBuiltIns$Kind0.ordinal()]) {
            case 2: {
                this.createBuiltInsModule(false);
                return;
            }
            case 3: {
                this.createBuiltInsModule(true);
            }
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    public AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return this.getCustomizer();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public Iterable getClassDescriptorFactories() {
        return this.getClassDescriptorFactories();
    }

    @NotNull
    public List getClassDescriptorFactories() {
        Iterable iterable0 = super.getClassDescriptorFactories();
        Intrinsics.checkNotNullExpressionValue(iterable0, "super.getClassDescriptorFactories()");
        StorageManager storageManager0 = this.getStorageManager();
        Intrinsics.checkNotNullExpressionValue(storageManager0, "storageManager");
        ModuleDescriptorImpl moduleDescriptorImpl0 = this.getBuiltInsModule();
        Intrinsics.checkNotNullExpressionValue(moduleDescriptorImpl0, "builtInsModule");
        return CollectionsKt___CollectionsKt.plus(iterable0, new JvmBuiltInClassDescriptorFactory(storageManager0, moduleDescriptorImpl0, null, 4, null));
    }

    @NotNull
    public final JvmBuiltInsCustomizer getCustomizer() {
        return (JvmBuiltInsCustomizer)StorageKt.getValue(this.g, this, JvmBuiltIns.h[0]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    public PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return this.getCustomizer();
    }

    public final void initialize(@NotNull ModuleDescriptor moduleDescriptor0, boolean z) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "moduleDescriptor");
        this.setPostponedSettingsComputation(new c(moduleDescriptor0, z));
    }

    public final void setPostponedSettingsComputation(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "computation");
        this.f = function00;
    }
}

