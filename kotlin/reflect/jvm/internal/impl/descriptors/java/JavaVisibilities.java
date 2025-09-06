package kotlin.reflect.jvm.internal.impl.descriptors.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Internal;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Protected;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaVisibilities {
    public static final class PackageVisibility extends Visibility {
        @NotNull
        public static final PackageVisibility INSTANCE;

        static {
            PackageVisibility.INSTANCE = new PackageVisibility("package", false);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;-><init>(Ljava/lang/String;Z)V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @Nullable
        public Integer compareTo(@NotNull Visibility visibility0) {
            Intrinsics.checkNotNullParameter(visibility0, "visibility");
            if(this == visibility0) {
                return 0;
            }
            return Visibilities.INSTANCE.isPrivate(visibility0) ? 1 : -1;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public String getInternalDisplayName() {
            return "public/*package*/";
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public Visibility normalize() {
            return Protected.INSTANCE;
        }
    }

    public static final class ProtectedAndPackage extends Visibility {
        @NotNull
        public static final ProtectedAndPackage INSTANCE;

        static {
            ProtectedAndPackage.INSTANCE = new ProtectedAndPackage("protected_and_package", true);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;-><init>(Ljava/lang/String;Z)V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @Nullable
        public Integer compareTo(@NotNull Visibility visibility0) {
            Intrinsics.checkNotNullParameter(visibility0, "visibility");
            if(Intrinsics.areEqual(this, visibility0)) {
                return 0;
            }
            if(visibility0 == Internal.INSTANCE) {
                return null;
            }
            return Visibilities.INSTANCE.isPrivate(visibility0) ? 1 : -1;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public String getInternalDisplayName() {
            return "protected/*protected and package*/";
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public Visibility normalize() {
            return Protected.INSTANCE;
        }
    }

    public static final class ProtectedStaticVisibility extends Visibility {
        @NotNull
        public static final ProtectedStaticVisibility INSTANCE;

        static {
            ProtectedStaticVisibility.INSTANCE = new ProtectedStaticVisibility("protected_static", true);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;-><init>(Ljava/lang/String;Z)V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public String getInternalDisplayName() {
            return "protected/*protected static*/";
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public Visibility normalize() {
            return Protected.INSTANCE;
        }
    }

    @NotNull
    public static final JavaVisibilities INSTANCE;

    static {
        JavaVisibilities.INSTANCE = new JavaVisibilities();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

