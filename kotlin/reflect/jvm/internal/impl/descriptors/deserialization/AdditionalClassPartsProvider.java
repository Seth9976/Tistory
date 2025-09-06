package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

public interface AdditionalClassPartsProvider {
    public static final class None implements AdditionalClassPartsProvider {
        @NotNull
        public static final None INSTANCE;

        static {
            None.INSTANCE = new None();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        public Collection getConstructors(@NotNull ClassDescriptor classDescriptor0) {
            Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        public Collection getFunctions(@NotNull Name name0, @NotNull ClassDescriptor classDescriptor0) {
            Intrinsics.checkNotNullParameter(name0, "name");
            Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        public Collection getFunctionsNames(@NotNull ClassDescriptor classDescriptor0) {
            Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        public Collection getSupertypes(@NotNull ClassDescriptor classDescriptor0) {
            Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    Collection getConstructors(@NotNull ClassDescriptor arg1);

    @NotNull
    Collection getFunctions(@NotNull Name arg1, @NotNull ClassDescriptor arg2);

    @NotNull
    Collection getFunctionsNames(@NotNull ClassDescriptor arg1);

    @NotNull
    Collection getSupertypes(@NotNull ClassDescriptor arg1);
}

