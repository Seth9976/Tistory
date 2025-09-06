package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nProtoBasedClassDataFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoBasedClassDataFinder.kt\norg/jetbrains/kotlin/serialization/deserialization/ProtoBasedClassDataFinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1194#2,2:44\n1222#2,4:46\n*S KotlinDebug\n*F\n+ 1 ProtoBasedClassDataFinder.kt\norg/jetbrains/kotlin/serialization/deserialization/ProtoBasedClassDataFinder\n*L\n32#1:44,2\n32#1:46,4\n*E\n"})
public final class ProtoBasedClassDataFinder implements ClassDataFinder {
    public final NameResolver a;
    public final BinaryVersion b;
    public final Function1 c;
    public final LinkedHashMap d;

    public ProtoBasedClassDataFinder(@NotNull PackageFragment protoBuf$PackageFragment0, @NotNull NameResolver nameResolver0, @NotNull BinaryVersion binaryVersion0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(protoBuf$PackageFragment0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(binaryVersion0, "metadataVersion");
        Intrinsics.checkNotNullParameter(function10, "classSource");
        super();
        this.a = nameResolver0;
        this.b = binaryVersion0;
        this.c = function10;
        List list0 = protoBuf$PackageFragment0.getClass_List();
        Intrinsics.checkNotNullExpressionValue(list0, "proto.class_List");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(list0, 10)), 16));
        for(Object object0: list0) {
            linkedHashMap0.put(NameResolverUtilKt.getClassId(this.a, ((Class)object0).getFqName()), object0);
        }
        this.d = linkedHashMap0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    public ClassData findClassData(@NotNull ClassId classId0) {
        Intrinsics.checkNotNullParameter(classId0, "classId");
        Class protoBuf$Class0 = (Class)this.d.get(classId0);
        if(protoBuf$Class0 == null) {
            return null;
        }
        SourceElement sourceElement0 = (SourceElement)this.c.invoke(classId0);
        return new ClassData(this.a, protoBuf$Class0, this.b, sourceElement0);
    }

    @NotNull
    public final Collection getAllClassIds() {
        return this.d.keySet();
    }
}

