package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

public final class r implements Implementation {
    public final List a;
    public final List b;
    public final List c;
    public final NotNullLazyValue d;
    public final NotNullLazyValue e;
    public final NotNullLazyValue f;
    public final NotNullLazyValue g;
    public final NotNullLazyValue h;
    public final NotNullLazyValue i;
    public final NotNullLazyValue j;
    public final NotNullLazyValue k;
    public final NotNullLazyValue l;
    public final NotNullLazyValue m;
    public final DeserializedMemberScope n;
    public static final KProperty[] o;

    static {
        r.o = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(r.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(r.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(r.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(r.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(r.class), "allProperties", "getAllProperties()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(r.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(r.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(r.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(r.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(r.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
    }

    public r(DeserializedMemberScope deserializedMemberScope0, List list0, List list1, List list2) {
        Intrinsics.checkNotNullParameter(list0, "functionList");
        Intrinsics.checkNotNullParameter(list1, "propertyList");
        Intrinsics.checkNotNullParameter(list2, "typeAliasList");
        this.n = deserializedMemberScope0;
        this.a = list0;
        this.b = list1;
        if(!deserializedMemberScope0.getC().getComponents().getConfiguration().getTypeAliasesAllowed()) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        }
        this.c = list2;
        this.d = deserializedMemberScope0.getC().getStorageManager().createLazyValue(new o(this, 3));
        this.e = deserializedMemberScope0.getC().getStorageManager().createLazyValue(new o(this, 4));
        this.f = deserializedMemberScope0.getC().getStorageManager().createLazyValue(new o(this, 2));
        this.g = deserializedMemberScope0.getC().getStorageManager().createLazyValue(new o(this, 0));
        this.h = deserializedMemberScope0.getC().getStorageManager().createLazyValue(new o(this, 1));
        this.i = deserializedMemberScope0.getC().getStorageManager().createLazyValue(new o(this, 7));
        this.j = deserializedMemberScope0.getC().getStorageManager().createLazyValue(new o(this, 5));
        this.k = deserializedMemberScope0.getC().getStorageManager().createLazyValue(new o(this, 6));
        this.l = deserializedMemberScope0.getC().getStorageManager().createLazyValue(new p(this, deserializedMemberScope0));
        this.m = deserializedMemberScope0.getC().getStorageManager().createLazyValue(new q(this, deserializedMemberScope0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$Implementation
    public final void addFunctionsAndPropertiesTo(Collection collection0, DescriptorKindFilter descriptorKindFilter0, Function1 function10, LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(collection0, "result");
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        KProperty[] arr_kProperty = r.o;
        if(descriptorKindFilter0.acceptsKinds(0x20)) {
            for(Object object0: ((List)StorageKt.getValue(this.h, this, arr_kProperty[4]))) {
                Name name0 = ((PropertyDescriptor)object0).getName();
                Intrinsics.checkNotNullExpressionValue(name0, "it.name");
                if(((Boolean)function10.invoke(name0)).booleanValue()) {
                    collection0.add(object0);
                }
            }
        }
        if(descriptorKindFilter0.acceptsKinds(16)) {
            for(Object object1: ((List)StorageKt.getValue(this.g, this, arr_kProperty[3]))) {
                Name name1 = ((SimpleFunctionDescriptor)object1).getName();
                Intrinsics.checkNotNullExpressionValue(name1, "it.name");
                if(((Boolean)function10.invoke(name1)).booleanValue()) {
                    collection0.add(object1);
                }
            }
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$Implementation
    public final Collection getContributedFunctions(Name name0, LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        if(!this.getFunctionNames().contains(name0)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Collection collection0 = (Collection)((Map)StorageKt.getValue(this.j, this, r.o[6])).get(name0);
        return collection0 == null ? CollectionsKt__CollectionsKt.emptyList() : collection0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$Implementation
    public final Collection getContributedVariables(Name name0, LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        if(!this.getVariableNames().contains(name0)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Collection collection0 = (Collection)((Map)StorageKt.getValue(this.k, this, r.o[7])).get(name0);
        return collection0 == null ? CollectionsKt__CollectionsKt.emptyList() : collection0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$Implementation
    public final Set getFunctionNames() {
        return (Set)StorageKt.getValue(this.l, this, r.o[8]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$Implementation
    public final TypeAliasDescriptor getTypeAliasByName(Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        return (TypeAliasDescriptor)((Map)StorageKt.getValue(this.i, this, r.o[5])).get(name0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$Implementation
    public final Set getTypeAliasNames() {
        Set set0 = new LinkedHashSet();
        for(Object object0: this.c) {
            set0.add(NameResolverUtilKt.getName(this.n.getC().getNameResolver(), ((TypeAlias)(((MessageLite)object0))).getName()));
        }
        return set0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$Implementation
    public final Set getVariableNames() {
        return (Set)StorageKt.getValue(this.m, this, r.o[9]);
    }
}

