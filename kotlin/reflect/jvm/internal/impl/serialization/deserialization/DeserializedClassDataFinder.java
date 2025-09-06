package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nDeserializedClassDataFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDataFinder.kt\norg/jetbrains/kotlin/serialization/deserialization/DeserializedClassDataFinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public final class DeserializedClassDataFinder implements ClassDataFinder {
    public final PackageFragmentProvider a;

    public DeserializedClassDataFinder(@NotNull PackageFragmentProvider packageFragmentProvider0) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider0, "packageFragmentProvider");
        super();
        this.a = packageFragmentProvider0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    public ClassData findClassData(@NotNull ClassId classId0) {
        Intrinsics.checkNotNullParameter(classId0, "classId");
        FqName fqName0 = classId0.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(fqName0, "classId.packageFqName");
        for(Object object0: PackageFragmentProviderKt.packageFragments(this.a, fqName0)) {
            PackageFragmentDescriptor packageFragmentDescriptor0 = (PackageFragmentDescriptor)object0;
            if(packageFragmentDescriptor0 instanceof DeserializedPackageFragment) {
                ClassData classData0 = ((DeserializedPackageFragment)packageFragmentDescriptor0).getClassDataFinder().findClassData(classId0);
                if(classData0 != null) {
                    return classData0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }
}

