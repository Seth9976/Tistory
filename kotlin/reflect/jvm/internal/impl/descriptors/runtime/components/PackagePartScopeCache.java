package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nPackagePartScopeCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackagePartScopeCache.kt\norg/jetbrains/kotlin/descriptors/runtime/components/PackagePartScopeCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n73#2,2:43\n1603#3,9:45\n1855#3:54\n1856#3:56\n1612#3:57\n1603#3,9:58\n1855#3:67\n1856#3:69\n1612#3:70\n1#4:55\n1#4:68\n1#4:71\n*S KotlinDebug\n*F\n+ 1 PackagePartScopeCache.kt\norg/jetbrains/kotlin/descriptors/runtime/components/PackagePartScopeCache\n*L\n22#1:43,2\n27#1:45,9\n27#1:54\n27#1:56\n27#1:57\n35#1:58,9\n35#1:67\n35#1:69\n35#1:70\n27#1:55\n35#1:68\n22#1:71\n*E\n"})
public final class PackagePartScopeCache {
    public final DeserializedDescriptorResolver a;
    public final ReflectKotlinClassFinder b;
    public final ConcurrentHashMap c;

    public PackagePartScopeCache(@NotNull DeserializedDescriptorResolver deserializedDescriptorResolver0, @NotNull ReflectKotlinClassFinder reflectKotlinClassFinder0) {
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver0, "resolver");
        Intrinsics.checkNotNullParameter(reflectKotlinClassFinder0, "kotlinClassFinder");
        super();
        this.a = deserializedDescriptorResolver0;
        this.b = reflectKotlinClassFinder0;
        this.c = new ConcurrentHashMap();
    }

    @NotNull
    public final MemberScope getPackagePartScope(@NotNull ReflectKotlinClass reflectKotlinClass0) {
        List list0;
        Intrinsics.checkNotNullParameter(reflectKotlinClass0, "fileClass");
        ConcurrentHashMap concurrentHashMap0 = this.c;
        ClassId classId0 = reflectKotlinClass0.getClassId();
        MemberScope memberScope0 = concurrentHashMap0.get(classId0);
        if(memberScope0 == null) {
            FqName fqName0 = reflectKotlinClass0.getClassId().getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(fqName0, "fileClass.classId.packageFqName");
            DeserializedDescriptorResolver deserializedDescriptorResolver0 = this.a;
            if(reflectKotlinClass0.getClassHeader().getKind() == Kind.MULTIFILE_CLASS) {
                Iterable iterable0 = reflectKotlinClass0.getClassHeader().getMultifilePartNames();
                list0 = new ArrayList();
                for(Object object0: iterable0) {
                    ClassId classId1 = ClassId.topLevel(JvmClassName.byInternalName(((String)object0)).getFqNameForTopLevelClassMaybeWithDollars());
                    Intrinsics.checkNotNullExpressionValue(classId1, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                    JvmMetadataVersion jvmMetadataVersion0 = DeserializationHelpersKt.jvmMetadataVersionOrDefault(deserializedDescriptorResolver0.getComponents().getConfiguration());
                    KotlinJvmBinaryClass kotlinJvmBinaryClass0 = KotlinClassFinderKt.findKotlinClass(this.b, classId1, jvmMetadataVersion0);
                    if(kotlinJvmBinaryClass0 != null) {
                        list0.add(kotlinJvmBinaryClass0);
                    }
                }
            }
            else {
                list0 = k.listOf(reflectKotlinClass0);
            }
            EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor0 = new EmptyPackageFragmentDescriptor(deserializedDescriptorResolver0.getComponents().getModuleDescriptor(), fqName0);
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: list0) {
                MemberScope memberScope1 = deserializedDescriptorResolver0.createKotlinPackagePartScope(emptyPackageFragmentDescriptor0, ((KotlinJvmBinaryClass)object1));
                if(memberScope1 != null) {
                    arrayList0.add(memberScope1);
                }
            }
            List list1 = CollectionsKt___CollectionsKt.toList(arrayList0);
            MemberScope memberScope2 = ChainedMemberScope.Companion.create("package " + fqName0 + " (" + reflectKotlinClass0 + ')', list1);
            Object object2 = concurrentHashMap0.putIfAbsent(classId0, memberScope2);
            memberScope0 = object2 == null ? memberScope2 : object2;
        }
        Intrinsics.checkNotNullExpressionValue(memberScope0, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return memberScope0;
    }
}

