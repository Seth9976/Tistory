package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

public final class o extends Lambda implements Function0 {
    public final int w;
    public final r x;

    public o(r r0, int v) {
        this.w = v;
        this.x = r0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                r r0 = this.x;
                r0.getClass();
                NotNullLazyValue notNullLazyValue0 = r0.d;
                Collection collection0 = (List)StorageKt.getValue(notNullLazyValue0, r0, r.o[0]);
                DeserializedMemberScope deserializedMemberScope0 = r0.n;
                Iterable iterable1 = deserializedMemberScope0.getNonDeclaredFunctionNames();
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: iterable1) {
                    Name name1 = (Name)object1;
                    Iterable iterable2 = (List)StorageKt.getValue(notNullLazyValue0, r0, r.o[0]);
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object2: iterable2) {
                        if(Intrinsics.areEqual(((DeclarationDescriptor)object2).getName(), name1)) {
                            arrayList1.add(object2);
                        }
                    }
                    deserializedMemberScope0.computeNonDeclaredFunctions(name1, arrayList1);
                    kotlin.collections.o.addAll(arrayList0, arrayList1.subList(arrayList1.size(), arrayList1.size()));
                }
                return CollectionsKt___CollectionsKt.plus(collection0, arrayList0);
            }
            case 1: {
                r r1 = this.x;
                r1.getClass();
                NotNullLazyValue notNullLazyValue1 = r1.e;
                Collection collection1 = (List)StorageKt.getValue(notNullLazyValue1, r1, r.o[1]);
                DeserializedMemberScope deserializedMemberScope1 = r1.n;
                Iterable iterable3 = deserializedMemberScope1.getNonDeclaredVariableNames();
                ArrayList arrayList2 = new ArrayList();
                for(Object object3: iterable3) {
                    Name name2 = (Name)object3;
                    Iterable iterable4 = (List)StorageKt.getValue(notNullLazyValue1, r1, r.o[1]);
                    ArrayList arrayList3 = new ArrayList();
                    for(Object object4: iterable4) {
                        if(Intrinsics.areEqual(((DeclarationDescriptor)object4).getName(), name2)) {
                            arrayList3.add(object4);
                        }
                    }
                    deserializedMemberScope1.computeNonDeclaredProperties(name2, arrayList3);
                    kotlin.collections.o.addAll(arrayList2, arrayList3.subList(arrayList3.size(), arrayList3.size()));
                }
                return CollectionsKt___CollectionsKt.plus(collection1, arrayList2);
            }
            case 2: {
                r r2 = this.x;
                ArrayList arrayList4 = new ArrayList();
                for(Object object5: r2.c) {
                    TypeAliasDescriptor typeAliasDescriptor0 = r2.n.getC().getMemberDeserializer().loadTypeAlias(((TypeAlias)(((MessageLite)object5))));
                    if(typeAliasDescriptor0 != null) {
                        arrayList4.add(typeAliasDescriptor0);
                    }
                }
                return arrayList4;
            }
            case 3: {
                r r3 = this.x;
                ArrayList arrayList5 = new ArrayList();
                for(Object object6: r3.a) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor0 = r3.n.getC().getMemberDeserializer().loadFunction(((Function)(((MessageLite)object6))));
                    if(!r3.n.isDeclaredFunctionAvailable(simpleFunctionDescriptor0)) {
                        simpleFunctionDescriptor0 = null;
                    }
                    if(simpleFunctionDescriptor0 != null) {
                        arrayList5.add(simpleFunctionDescriptor0);
                    }
                }
                return arrayList5;
            }
            case 4: {
                r r4 = this.x;
                ArrayList arrayList6 = new ArrayList();
                for(Object object7: r4.b) {
                    PropertyDescriptor propertyDescriptor0 = r4.n.getC().getMemberDeserializer().loadProperty(((Property)(((MessageLite)object7))));
                    if(propertyDescriptor0 != null) {
                        arrayList6.add(propertyDescriptor0);
                    }
                }
                return arrayList6;
            }
            case 5: {
                this.x.getClass();
                Iterable iterable5 = (List)StorageKt.getValue(this.x.g, this.x, r.o[3]);
                LinkedHashMap linkedHashMap1 = new LinkedHashMap();
                for(Object object8: iterable5) {
                    Name name3 = ((SimpleFunctionDescriptor)object8).getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "it.name");
                    ArrayList arrayList7 = linkedHashMap1.get(name3);
                    if(arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        linkedHashMap1.put(name3, arrayList7);
                    }
                    arrayList7.add(object8);
                }
                return linkedHashMap1;
            }
            case 6: {
                this.x.getClass();
                Iterable iterable6 = (List)StorageKt.getValue(this.x.h, this.x, r.o[4]);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for(Object object9: iterable6) {
                    Name name4 = ((PropertyDescriptor)object9).getName();
                    Intrinsics.checkNotNullExpressionValue(name4, "it.name");
                    ArrayList arrayList8 = linkedHashMap2.get(name4);
                    if(arrayList8 == null) {
                        arrayList8 = new ArrayList();
                        linkedHashMap2.put(name4, arrayList8);
                    }
                    arrayList8.add(object9);
                }
                return linkedHashMap2;
            }
            default: {
                this.x.getClass();
                Iterable iterable0 = (List)StorageKt.getValue(this.x.f, this.x, r.o[2]);
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(iterable0, 10)), 16));
                for(Object object0: iterable0) {
                    Name name0 = ((TypeAliasDescriptor)object0).getName();
                    Intrinsics.checkNotNullExpressionValue(name0, "it.name");
                    linkedHashMap0.put(name0, object0);
                }
                return linkedHashMap0;
            }
        }
    }
}

