package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ResolutionScope {
    @SourceDebugExtension({"SMAP\nResolutionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolutionScope.kt\norg/jetbrains/kotlin/resolve/scopes/ResolutionScope$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    public static final class DefaultImpls {
        public static Collection getContributedDescriptors$default(ResolutionScope resolutionScope0, DescriptorKindFilter descriptorKindFilter0, Function1 function10, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if((v & 1) != 0) {
                descriptorKindFilter0 = DescriptorKindFilter.ALL;
            }
            if((v & 2) != 0) {
                function10 = MemberScope.Companion.getALL_NAME_FILTER();
            }
            return resolutionScope0.getContributedDescriptors(descriptorKindFilter0, function10);
        }

        public static void recordLookup(@NotNull ResolutionScope resolutionScope0, @NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
            Intrinsics.checkNotNullParameter(name0, "name");
            Intrinsics.checkNotNullParameter(lookupLocation0, "location");
            resolutionScope0.getContributedFunctions(name0, lookupLocation0);
        }
    }

    @Nullable
    ClassifierDescriptor getContributedClassifier(@NotNull Name arg1, @NotNull LookupLocation arg2);

    @NotNull
    Collection getContributedDescriptors(@NotNull DescriptorKindFilter arg1, @NotNull Function1 arg2);

    @NotNull
    Collection getContributedFunctions(@NotNull Name arg1, @NotNull LookupLocation arg2);

    void recordLookup(@NotNull Name arg1, @NotNull LookupLocation arg2);
}

