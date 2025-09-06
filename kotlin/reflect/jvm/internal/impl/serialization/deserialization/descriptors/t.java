package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

public final class t extends Lambda implements Function1 {
    public final int w;
    public final u x;

    public t(u u0, int v) {
        this.w = v;
        this.x = u0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Collection collection1;
        Collection collection0;
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((Name)object0), "it");
                Parser parser0 = Function.PARSER;
                Intrinsics.checkNotNullExpressionValue(parser0, "PARSER");
                byte[] arr_b1 = (byte[])this.x.a.get(((Name)object0));
                DeserializedMemberScope deserializedMemberScope0 = this.x.i;
                if(arr_b1 == null) {
                    collection0 = CollectionsKt__CollectionsKt.emptyList();
                }
                else {
                    List list0 = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.generateSequence(new DeserializedMemberScope.OptimizedImplementation.computeDescriptors.1.1(parser0, new ByteArrayInputStream(arr_b1), deserializedMemberScope0)));
                    collection0 = list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
                }
                ArrayList arrayList0 = new ArrayList(collection0.size());
                for(Object object1: collection0) {
                    Intrinsics.checkNotNullExpressionValue(((Function)object1), "it");
                    SimpleFunctionDescriptor simpleFunctionDescriptor0 = deserializedMemberScope0.getC().getMemberDeserializer().loadFunction(((Function)object1));
                    if(!deserializedMemberScope0.isDeclaredFunctionAvailable(simpleFunctionDescriptor0)) {
                        simpleFunctionDescriptor0 = null;
                    }
                    if(simpleFunctionDescriptor0 != null) {
                        arrayList0.add(simpleFunctionDescriptor0);
                    }
                }
                deserializedMemberScope0.computeNonDeclaredFunctions(((Name)object0), arrayList0);
                return CollectionsKt.compact(arrayList0);
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((Name)object0), "it");
                Parser parser1 = Property.PARSER;
                Intrinsics.checkNotNullExpressionValue(parser1, "PARSER");
                byte[] arr_b2 = (byte[])this.x.b.get(((Name)object0));
                DeserializedMemberScope deserializedMemberScope1 = this.x.i;
                if(arr_b2 == null) {
                    collection1 = CollectionsKt__CollectionsKt.emptyList();
                }
                else {
                    List list1 = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.generateSequence(new DeserializedMemberScope.OptimizedImplementation.computeDescriptors.1.1(parser1, new ByteArrayInputStream(arr_b2), deserializedMemberScope1)));
                    collection1 = list1 == null ? CollectionsKt__CollectionsKt.emptyList() : list1;
                }
                ArrayList arrayList1 = new ArrayList(collection1.size());
                for(Object object2: collection1) {
                    Intrinsics.checkNotNullExpressionValue(((Property)object2), "it");
                    PropertyDescriptor propertyDescriptor0 = deserializedMemberScope1.getC().getMemberDeserializer().loadProperty(((Property)object2));
                    if(propertyDescriptor0 != null) {
                        arrayList1.add(propertyDescriptor0);
                    }
                }
                deserializedMemberScope1.computeNonDeclaredProperties(((Name)object0), arrayList1);
                return CollectionsKt.compact(arrayList1);
            }
            default: {
                Intrinsics.checkNotNullParameter(((Name)object0), "it");
                u u0 = this.x;
                byte[] arr_b = (byte[])u0.c.get(((Name)object0));
                if(arr_b != null) {
                    TypeAlias protoBuf$TypeAlias0 = TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(arr_b), u0.i.getC().getComponents().getExtensionRegistryLite());
                    return protoBuf$TypeAlias0 == null ? null : u0.i.getC().getMemberDeserializer().loadTypeAlias(protoBuf$TypeAlias0);
                }
                return null;
            }
        }
    }
}

