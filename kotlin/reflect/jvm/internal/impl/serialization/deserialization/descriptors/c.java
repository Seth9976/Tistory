package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import j2.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class c extends AbstractClassTypeConstructor {
    public final NotNullLazyValue c;
    public final DeserializedClassDescriptor d;

    public c(DeserializedClassDescriptor deserializedClassDescriptor0) {
        this.d = deserializedClassDescriptor0;
        super(deserializedClassDescriptor0.getC().getStorageManager());
        this.c = deserializedClassDescriptor0.getC().getStorageManager().createLazyValue(new j(deserializedClassDescriptor0, 15));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection computeSupertypes() {
        String s1;
        DeserializedClassDescriptor deserializedClassDescriptor0 = this.d;
        Iterable iterable0 = ProtoTypeTableUtilKt.supertypes(deserializedClassDescriptor0.getClassProto(), deserializedClassDescriptor0.getC().getTypeTable());
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(deserializedClassDescriptor0.getC().getTypeDeserializer().type(((Type)object0)));
        }
        Iterable iterable1 = CollectionsKt___CollectionsKt.plus(arrayList0, deserializedClassDescriptor0.getC().getComponents().getAdditionalClassPartsProvider().getSupertypes(deserializedClassDescriptor0));
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: iterable1) {
            ClassifierDescriptor classifierDescriptor0 = ((KotlinType)object1).getConstructor().getDeclarationDescriptor();
            MockClassDescriptor notFoundClasses$MockClassDescriptor0 = classifierDescriptor0 instanceof MockClassDescriptor ? ((MockClassDescriptor)classifierDescriptor0) : null;
            if(notFoundClasses$MockClassDescriptor0 != null) {
                arrayList1.add(notFoundClasses$MockClassDescriptor0);
            }
        }
        if(!arrayList1.isEmpty()) {
            ErrorReporter errorReporter0 = deserializedClassDescriptor0.getC().getComponents().getErrorReporter();
            ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(arrayList1, 10));
            for(Object object2: arrayList1) {
                MockClassDescriptor notFoundClasses$MockClassDescriptor1 = (MockClassDescriptor)object2;
                ClassId classId0 = DescriptorUtilsKt.getClassId(notFoundClasses$MockClassDescriptor1);
                if(classId0 == null) {
                    s1 = notFoundClasses$MockClassDescriptor1.getName().asString();
                }
                else {
                    FqName fqName0 = classId0.asSingleFqName();
                    if(fqName0 != null) {
                        String s = fqName0.asString();
                        if(s != null) {
                            s1 = s;
                        }
                    }
                }
                arrayList2.add(s1);
            }
            errorReporter0.reportIncompleteHierarchy(deserializedClassDescriptor0, arrayList2);
        }
        return CollectionsKt___CollectionsKt.toList(iterable1);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
    public final ClassDescriptor getDeclarationDescriptor() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
    public final ClassifierDescriptor getDeclarationDescriptor() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return (List)this.c.invoke();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final SupertypeLoopChecker getSupertypeLoopChecker() {
        return EMPTY.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return true;
    }

    @Override
    public final String toString() {
        String s = this.d.getName().toString();
        Intrinsics.checkNotNullExpressionValue(s, "name.toString()");
        return s;
    }
}

