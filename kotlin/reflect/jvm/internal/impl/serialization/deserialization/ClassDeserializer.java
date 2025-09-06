package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import fg.c;
import java.util.Set;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nClassDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/ClassDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1#2:92\n288#3,2:93\n*S KotlinDebug\n*F\n+ 1 ClassDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/ClassDeserializer\n*L\n57#1:93,2\n*E\n"})
public final class ClassDeserializer {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Set getBLACK_LIST() {
            return ClassDeserializer.c;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final DeserializationComponents a;
    public final MemoizedFunctionToNullable b;
    public static final Set c;

    static {
        ClassDeserializer.Companion = new Companion(null);
        ClassDeserializer.c = e0.setOf(ClassId.topLevel(FqNames.cloneable.toSafe()));
    }

    public ClassDeserializer(@NotNull DeserializationComponents deserializationComponents0) {
        Intrinsics.checkNotNullParameter(deserializationComponents0, "components");
        super();
        this.a = deserializationComponents0;
        this.b = deserializationComponents0.getStorageManager().createMemoizedFunctionWithNullableValues(new c(this, 27));
    }

    public static final ClassDescriptor access$createClass(ClassDeserializer classDeserializer0, a a0) {
        classDeserializer0.getClass();
        ClassId classId0 = a0.a;
        DeserializationComponents deserializationComponents0 = classDeserializer0.a;
        for(Object object0: deserializationComponents0.getFictitiousClassDescriptorFactories()) {
            ClassDescriptor classDescriptor0 = ((ClassDescriptorFactory)object0).createClass(classId0);
            if(classDescriptor0 != null) {
                return classDescriptor0;
            }
            if(false) {
                break;
            }
        }
        if(!ClassDeserializer.c.contains(classId0)) {
            ClassData classData0 = a0.b;
            if(classData0 == null) {
                classData0 = deserializationComponents0.getClassDataFinder().findClassData(classId0);
                if(classData0 != null) {
                    goto label_15;
                }
            }
            else {
            label_15:
                NameResolver nameResolver0 = classData0.component1();
                Class protoBuf$Class0 = classData0.component2();
                BinaryVersion binaryVersion0 = classData0.component3();
                SourceElement sourceElement0 = classData0.component4();
                ClassId classId1 = classId0.getOuterClassId();
                if(classId1 == null) {
                    FqName fqName0 = classId0.getPackageFqName();
                    Intrinsics.checkNotNullExpressionValue(fqName0, "classId.packageFqName");
                    for(Object object1: PackageFragmentProviderKt.packageFragments(deserializationComponents0.getPackageFragmentProvider(), fqName0)) {
                        if(!(((PackageFragmentDescriptor)object1) instanceof DeserializedPackageFragment)) {
                            goto label_39;
                        }
                        Name name1 = classId0.getShortClassName();
                        Intrinsics.checkNotNullExpressionValue(name1, "classId.shortClassName");
                        if(!((DeserializedPackageFragment)(((PackageFragmentDescriptor)object1))).hasTopLevelClass(name1)) {
                            continue;
                        }
                        goto label_39;
                    }
                    object1 = null;
                label_39:
                    if(((PackageFragmentDescriptor)object1) != null) {
                        TypeTable protoBuf$TypeTable0 = protoBuf$Class0.getTypeTable();
                        Intrinsics.checkNotNullExpressionValue(protoBuf$TypeTable0, "classProto.typeTable");
                        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable0 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(protoBuf$TypeTable0);
                        VersionRequirementTable protoBuf$VersionRequirementTable0 = protoBuf$Class0.getVersionRequirementTable();
                        Intrinsics.checkNotNullExpressionValue(protoBuf$VersionRequirementTable0, "classProto.versionRequirementTable");
                        kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable versionRequirementTable0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion.create(protoBuf$VersionRequirementTable0);
                        return new DeserializedClassDescriptor(classDeserializer0.a.createContext(((PackageFragmentDescriptor)object1), nameResolver0, typeTable0, versionRequirementTable0, binaryVersion0, null), protoBuf$Class0, nameResolver0, binaryVersion0, sourceElement0);
                    }
                }
                else {
                    ClassDescriptor classDescriptor1 = ClassDeserializer.deserializeClass$default(classDeserializer0, classId1, null, 2, null);
                    DeserializedClassDescriptor deserializedClassDescriptor0 = classDescriptor1 instanceof DeserializedClassDescriptor ? ((DeserializedClassDescriptor)classDescriptor1) : null;
                    if(deserializedClassDescriptor0 != null) {
                        Name name0 = classId0.getShortClassName();
                        Intrinsics.checkNotNullExpressionValue(name0, "classId.shortClassName");
                        if(deserializedClassDescriptor0.hasNestedClass$deserialization(name0)) {
                            return new DeserializedClassDescriptor(deserializedClassDescriptor0.getC(), protoBuf$Class0, nameResolver0, binaryVersion0, sourceElement0);
                        }
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public final ClassDescriptor deserializeClass(@NotNull ClassId classId0, @Nullable ClassData classData0) {
        Intrinsics.checkNotNullParameter(classId0, "classId");
        a a0 = new a(classId0, classData0);
        return (ClassDescriptor)this.b.invoke(a0);
    }

    public static ClassDescriptor deserializeClass$default(ClassDeserializer classDeserializer0, ClassId classId0, ClassData classData0, int v, Object object0) {
        if((v & 2) != 0) {
            classData0 = null;
        }
        return classDeserializer0.deserializeClass(classId0, classData0);
    }
}

