package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nUnsignedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnsignedType.kt\norg/jetbrains/kotlin/builtins/UnsignedTypes\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,122:1\n11335#2:123\n11670#2,3:124\n11335#2:127\n11670#2,3:128\n11670#2,3:131\n*S KotlinDebug\n*F\n+ 1 UnsignedType.kt\norg/jetbrains/kotlin/builtins/UnsignedTypes\n*L\n36#1:123\n36#1:124,3\n37#1:127\n37#1:128,3\n47#1:131,3\n*E\n"})
public final class UnsignedTypes {
    @NotNull
    public static final UnsignedTypes INSTANCE;
    public static final Set a;
    public static final Set b;
    public static final HashMap c;
    public static final HashMap d;
    public static final LinkedHashSet e;

    static {
        UnsignedTypes.INSTANCE = new UnsignedTypes();  // 初始化器: Ljava/lang/Object;-><init>()V
        UnsignedType[] arr_unsignedType = UnsignedType.values();
        ArrayList arrayList0 = new ArrayList(arr_unsignedType.length);
        for(int v1 = 0; v1 < arr_unsignedType.length; ++v1) {
            arrayList0.add(arr_unsignedType[v1].getTypeName());
        }
        UnsignedTypes.a = CollectionsKt___CollectionsKt.toSet(arrayList0);
        UnsignedArrayType[] arr_unsignedArrayType = UnsignedArrayType.values();
        ArrayList arrayList1 = new ArrayList(arr_unsignedArrayType.length);
        for(int v2 = 0; v2 < arr_unsignedArrayType.length; ++v2) {
            arrayList1.add(arr_unsignedArrayType[v2].getTypeName());
        }
        UnsignedTypes.b = CollectionsKt___CollectionsKt.toSet(arrayList1);
        UnsignedTypes.c = new HashMap();
        UnsignedTypes.d = new HashMap();
        Name name0 = Name.identifier("ubyteArrayOf");
        Pair pair0 = TuplesKt.to(UnsignedArrayType.UBYTEARRAY, name0);
        Name name1 = Name.identifier("ushortArrayOf");
        Pair pair1 = TuplesKt.to(UnsignedArrayType.USHORTARRAY, name1);
        Name name2 = Name.identifier("uintArrayOf");
        Pair pair2 = TuplesKt.to(UnsignedArrayType.UINTARRAY, name2);
        Name name3 = Name.identifier("ulongArrayOf");
        x.hashMapOf(new Pair[]{pair0, pair1, pair2, TuplesKt.to(UnsignedArrayType.ULONGARRAY, name3)});
        UnsignedType[] arr_unsignedType1 = UnsignedType.values();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(int v3 = 0; v3 < arr_unsignedType1.length; ++v3) {
            linkedHashSet0.add(arr_unsignedType1[v3].getArrayClassId().getShortClassName());
        }
        UnsignedTypes.e = linkedHashSet0;
        UnsignedType[] arr_unsignedType2 = UnsignedType.values();
        for(int v = 0; v < arr_unsignedType2.length; ++v) {
            UnsignedType unsignedType0 = arr_unsignedType2[v];
            UnsignedTypes.c.put(unsignedType0.getArrayClassId(), unsignedType0.getClassId());
            UnsignedTypes.d.put(unsignedType0.getClassId(), unsignedType0.getArrayClassId());
        }
    }

    @Nullable
    public final ClassId getUnsignedClassIdByArrayClassId(@NotNull ClassId classId0) {
        Intrinsics.checkNotNullParameter(classId0, "arrayClassId");
        return (ClassId)UnsignedTypes.c.get(classId0);
    }

    public final boolean isShortNameOfUnsignedArray(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        return UnsignedTypes.e.contains(name0);
    }

    public final boolean isUnsignedClass(@NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "descriptor");
        DeclarationDescriptor declarationDescriptor1 = declarationDescriptor0.getContainingDeclaration();
        if(declarationDescriptor1 instanceof PackageFragmentDescriptor && Intrinsics.areEqual(((PackageFragmentDescriptor)declarationDescriptor1).getFqName(), StandardNames.BUILT_INS_PACKAGE_FQ_NAME)) {
            Name name0 = declarationDescriptor0.getName();
            return UnsignedTypes.a.contains(name0);
        }
        return false;
    }

    @JvmStatic
    public static final boolean isUnsignedType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
        if(TypeUtils.noExpectedType(kotlinType0)) {
            return false;
        }
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        return classifierDescriptor0 == null ? false : UnsignedTypes.INSTANCE.isUnsignedClass(classifierDescriptor0);
    }
}

