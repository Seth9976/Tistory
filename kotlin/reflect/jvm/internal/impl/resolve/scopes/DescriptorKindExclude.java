package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import org.jetbrains.annotations.NotNull;

public abstract class DescriptorKindExclude {
    public static final class NonExtensions extends DescriptorKindExclude {
        @NotNull
        public static final NonExtensions INSTANCE;
        public static final int a;

        // 去混淆评级： 低(20)
        static {
            NonExtensions.INSTANCE = new NonExtensions();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/resolve/scopes/DescriptorKindExclude;-><init>()V
            NonExtensions.a = 15;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int getFullyExcludedDescriptorKinds() {
            return NonExtensions.a;
        }
    }

    public static final class TopLevelPackages extends DescriptorKindExclude {
        @NotNull
        public static final TopLevelPackages INSTANCE;

        static {
            TopLevelPackages.INSTANCE = new TopLevelPackages();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/resolve/scopes/DescriptorKindExclude;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int getFullyExcludedDescriptorKinds() {
            return 0;
        }
    }

    public abstract int getFullyExcludedDescriptorKinds();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

