package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Iterator;
import java.util.List;
import ke.c;
import ke.d;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nfindClassInModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n1#1,66:1\n43#1,2:67\n*S KotlinDebug\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n23#1:67,2\n*E\n"})
public final class FindClassInModuleKt {
    @Nullable
    public static final ClassDescriptor findClassAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor0, @NotNull ClassId classId0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(classId0, "classId");
        ClassifierDescriptor classifierDescriptor0 = FindClassInModuleKt.findClassifierAcrossModuleDependencies(moduleDescriptor0, classId0);
        return classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
    }

    @Nullable
    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor0, @NotNull ClassId classId0) {
        ClassifierDescriptor classifierDescriptor0;
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(classId0, "classId");
        ModuleDescriptor moduleDescriptor1 = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor0);
        if(moduleDescriptor1 == null) {
            FqName fqName0 = classId0.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(fqName0, "classId.packageFqName");
            PackageViewDescriptor packageViewDescriptor0 = moduleDescriptor0.getPackage(fqName0);
            List list0 = classId0.getRelativeClassName().pathSegments();
            Intrinsics.checkNotNullExpressionValue(list0, "classId.relativeClassName.pathSegments()");
            MemberScope memberScope0 = packageViewDescriptor0.getMemberScope();
            Object object0 = CollectionsKt___CollectionsKt.first(list0);
            Intrinsics.checkNotNullExpressionValue(object0, "segments.first()");
            classifierDescriptor0 = memberScope0.getContributedClassifier(((Name)object0), NoLookupLocation.FROM_DESERIALIZATION);
            if(classifierDescriptor0 == null) {
                return null;
            }
            for(Object object1: list0.subList(1, list0.size())) {
                if(!(classifierDescriptor0 instanceof ClassDescriptor)) {
                    return null;
                }
                MemberScope memberScope1 = ((ClassDescriptor)classifierDescriptor0).getUnsubstitutedInnerClassesScope();
                Intrinsics.checkNotNullExpressionValue(((Name)object1), "name");
                ClassifierDescriptor classifierDescriptor1 = memberScope1.getContributedClassifier(((Name)object1), NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptor0 = classifierDescriptor1 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor1) : null;
                if(classifierDescriptor0 == null) {
                    return null;
                }
            }
            return classifierDescriptor0;
        }
        FqName fqName1 = classId0.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(fqName1, "classId.packageFqName");
        PackageViewDescriptor packageViewDescriptor1 = moduleDescriptor1.getPackage(fqName1);
        List list1 = classId0.getRelativeClassName().pathSegments();
        Intrinsics.checkNotNullExpressionValue(list1, "classId.relativeClassName.pathSegments()");
        MemberScope memberScope2 = packageViewDescriptor1.getMemberScope();
        Object object2 = CollectionsKt___CollectionsKt.first(list1);
        Intrinsics.checkNotNullExpressionValue(object2, "segments.first()");
        ClassifierDescriptor classifierDescriptor2 = memberScope2.getContributedClassifier(((Name)object2), NoLookupLocation.FROM_DESERIALIZATION);
        if(classifierDescriptor2 != null) {
            Iterator iterator1 = list1.subList(1, list1.size()).iterator();
            while(true) {
                if(!iterator1.hasNext()) {
                    goto label_51;
                }
                Object object3 = iterator1.next();
                if(!(classifierDescriptor2 instanceof ClassDescriptor)) {
                    break;
                }
                MemberScope memberScope3 = ((ClassDescriptor)classifierDescriptor2).getUnsubstitutedInnerClassesScope();
                Intrinsics.checkNotNullExpressionValue(((Name)object3), "name");
                ClassifierDescriptor classifierDescriptor3 = memberScope3.getContributedClassifier(((Name)object3), NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptor2 = classifierDescriptor3 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor3) : null;
                if(classifierDescriptor2 == null) {
                    break;
                }
            }
        }
        classifierDescriptor2 = null;
    label_51:
        if(classifierDescriptor2 == null) {
            FqName fqName2 = classId0.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(fqName2, "classId.packageFqName");
            PackageViewDescriptor packageViewDescriptor2 = moduleDescriptor0.getPackage(fqName2);
            List list2 = classId0.getRelativeClassName().pathSegments();
            Intrinsics.checkNotNullExpressionValue(list2, "classId.relativeClassName.pathSegments()");
            MemberScope memberScope4 = packageViewDescriptor2.getMemberScope();
            Object object4 = CollectionsKt___CollectionsKt.first(list2);
            Intrinsics.checkNotNullExpressionValue(object4, "segments.first()");
            classifierDescriptor0 = memberScope4.getContributedClassifier(((Name)object4), NoLookupLocation.FROM_DESERIALIZATION);
            if(classifierDescriptor0 != null) {
                for(Object object5: list2.subList(1, list2.size())) {
                    if(!(classifierDescriptor0 instanceof ClassDescriptor)) {
                        return null;
                    }
                    MemberScope memberScope5 = ((ClassDescriptor)classifierDescriptor0).getUnsubstitutedInnerClassesScope();
                    Intrinsics.checkNotNullExpressionValue(((Name)object5), "name");
                    ClassifierDescriptor classifierDescriptor4 = memberScope5.getContributedClassifier(((Name)object5), NoLookupLocation.FROM_DESERIALIZATION);
                    classifierDescriptor0 = classifierDescriptor4 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor4) : null;
                    if(classifierDescriptor0 == null) {
                        return null;
                    }
                }
                return classifierDescriptor0;
            }
            return null;
        }
        return classifierDescriptor2;
    }

    @NotNull
    public static final ClassDescriptor findNonGenericClassAcrossDependencies(@NotNull ModuleDescriptor moduleDescriptor0, @NotNull ClassId classId0, @NotNull NotFoundClasses notFoundClasses0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(classId0, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses0, "notFoundClasses");
        ClassDescriptor classDescriptor0 = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor0, classId0);
        return classDescriptor0 == null ? notFoundClasses0.getClass(classId0, SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt__SequencesKt.generateSequence(classId0, c.a), d.w))) : classDescriptor0;
    }

    @Nullable
    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor0, @NotNull ClassId classId0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(classId0, "classId");
        ClassifierDescriptor classifierDescriptor0 = FindClassInModuleKt.findClassifierAcrossModuleDependencies(moduleDescriptor0, classId0);
        return classifierDescriptor0 instanceof TypeAliasDescriptor ? ((TypeAliasDescriptor)classifierDescriptor0) : null;
    }
}

