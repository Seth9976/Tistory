package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public interface PackagePartProvider {
    public static final class Empty implements PackagePartProvider {
        @NotNull
        public static final Empty INSTANCE;

        static {
            Empty.INSTANCE = new Empty();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider
        @NotNull
        public List findPackageParts(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "packageFqName");
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    List findPackageParts(@NotNull String arg1);
}

