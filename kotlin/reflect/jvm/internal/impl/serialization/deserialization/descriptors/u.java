package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.n;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.NameAndTypeMemberComparator;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

public final class u implements Implementation {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final Map c;
    public final MemoizedFunctionToNotNull d;
    public final MemoizedFunctionToNotNull e;
    public final MemoizedFunctionToNullable f;
    public final NotNullLazyValue g;
    public final NotNullLazyValue h;
    public final DeserializedMemberScope i;
    public static final KProperty[] j;

    static {
        u.j = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(u.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(u.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
    }

    public u(DeserializedMemberScope deserializedMemberScope0, List list0, List list1, List list2) {
        Intrinsics.checkNotNullParameter(list0, "functionList");
        Map map0;
        Intrinsics.checkNotNullParameter(list1, "propertyList");
        Intrinsics.checkNotNullParameter(list2, "typeAliasList");
        this.i = deserializedMemberScope0;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: list0) {
            Name name0 = NameResolverUtilKt.getName(deserializedMemberScope0.getC().getNameResolver(), ((Function)(((MessageLite)object0))).getName());
            ArrayList arrayList0 = linkedHashMap0.get(name0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                linkedHashMap0.put(name0, arrayList0);
            }
            arrayList0.add(object0);
        }
        this.a = u.a(linkedHashMap0);
        DeserializedMemberScope deserializedMemberScope1 = this.i;
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        for(Object object1: list1) {
            Name name1 = NameResolverUtilKt.getName(deserializedMemberScope1.getC().getNameResolver(), ((Property)(((MessageLite)object1))).getName());
            ArrayList arrayList1 = linkedHashMap1.get(name1);
            if(arrayList1 == null) {
                arrayList1 = new ArrayList();
                linkedHashMap1.put(name1, arrayList1);
            }
            arrayList1.add(object1);
        }
        this.b = u.a(linkedHashMap1);
        if(this.i.getC().getComponents().getConfiguration().getTypeAliasesAllowed()) {
            DeserializedMemberScope deserializedMemberScope2 = this.i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for(Object object2: list2) {
                Name name2 = NameResolverUtilKt.getName(deserializedMemberScope2.getC().getNameResolver(), ((TypeAlias)(((MessageLite)object2))).getName());
                ArrayList arrayList2 = linkedHashMap2.get(name2);
                if(arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(name2, arrayList2);
                }
                arrayList2.add(object2);
            }
            map0 = u.a(linkedHashMap2);
        }
        else {
            map0 = x.emptyMap();
        }
        this.c = map0;
        this.d = this.i.getC().getStorageManager().createMemoizedFunction(new t(this, 0));
        this.e = this.i.getC().getStorageManager().createMemoizedFunction(new t(this, 1));
        this.f = this.i.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new t(this, 2));
        this.g = this.i.getC().getStorageManager().createLazyValue(new s(this, this.i, 0));
        this.h = this.i.getC().getStorageManager().createLazyValue(new s(this, this.i, 1));
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap0) {
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(w.mapCapacity(linkedHashMap0.size()));
        for(Object object0: linkedHashMap0.entrySet()) {
            Object object1 = ((Map.Entry)object0).getKey();
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            Iterable iterable0 = (Iterable)((Map.Entry)object0).getValue();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            for(Object object2: iterable0) {
                ((AbstractMessageLite)object2).writeDelimitedTo(byteArrayOutputStream0);
                arrayList0.add(Unit.INSTANCE);
            }
            linkedHashMap1.put(object1, byteArrayOutputStream0.toByteArray());
        }
        return linkedHashMap1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$Implementation
    public final void addFunctionsAndPropertiesTo(Collection collection0, DescriptorKindFilter descriptorKindFilter0, Function1 function10, LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(collection0, "result");
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        if(descriptorKindFilter0.acceptsKinds(0x20)) {
            Collection collection1 = this.getVariableNames();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: collection1) {
                Name name0 = (Name)object0;
                if(((Boolean)function10.invoke(name0)).booleanValue()) {
                    arrayList0.addAll(this.getContributedVariables(name0, lookupLocation0));
                }
            }
            Intrinsics.checkNotNullExpressionValue(NameAndTypeMemberComparator.INSTANCE, "INSTANCE");
            n.sortWith(arrayList0, NameAndTypeMemberComparator.INSTANCE);
            collection0.addAll(arrayList0);
        }
        if(descriptorKindFilter0.acceptsKinds(16)) {
            Collection collection2 = this.getFunctionNames();
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: collection2) {
                Name name1 = (Name)object1;
                if(((Boolean)function10.invoke(name1)).booleanValue()) {
                    arrayList1.addAll(this.getContributedFunctions(name1, lookupLocation0));
                }
            }
            Intrinsics.checkNotNullExpressionValue(NameAndTypeMemberComparator.INSTANCE, "INSTANCE");
            n.sortWith(arrayList1, NameAndTypeMemberComparator.INSTANCE);
            collection0.addAll(arrayList1);
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$Implementation
    public final Collection getContributedFunctions(Name name0, LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return !this.getFunctionNames().contains(name0) ? CollectionsKt__CollectionsKt.emptyList() : ((Collection)this.d.invoke(name0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$Implementation
    public final Collection getContributedVariables(Name name0, LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return !this.getVariableNames().contains(name0) ? CollectionsKt__CollectionsKt.emptyList() : ((Collection)this.e.invoke(name0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$Implementation
    public final Set getFunctionNames() {
        return (Set)StorageKt.getValue(this.g, this, u.j[0]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$Implementation
    public final TypeAliasDescriptor getTypeAliasByName(Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        return (TypeAliasDescriptor)this.f.invoke(name0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$Implementation
    public final Set getTypeAliasNames() {
        return this.c.keySet();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$Implementation
    public final Set getVariableNames() {
        return (Set)StorageKt.getValue(this.h, this, u.j[1]);
    }
}

