package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import d0.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nGivenFunctionsMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GivenFunctionsMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/GivenFunctionsMemberScope\n+ 2 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,91:1\n109#2,5:92\n109#2,5:97\n1360#3:102\n1446#3,5:103\n800#3,11:108\n1477#3:119\n1502#3,3:120\n1505#3,3:130\n1477#3:133\n1502#3,3:134\n1505#3,3:144\n766#3:147\n857#3,2:148\n361#4,7:123\n361#4,7:137\n*S KotlinDebug\n*F\n+ 1 GivenFunctionsMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/GivenFunctionsMemberScope\n*L\n51#1:92,5\n55#1:97,5\n61#1:102\n61#1:103,5\n62#1:108,11\n63#1:119\n63#1:120,3\n63#1:130,3\n64#1:133\n64#1:134,3\n64#1:144,3\n68#1:147\n68#1:148,2\n63#1:123,7\n64#1:137,7\n*E\n"})
public abstract class GivenFunctionsMemberScope extends MemberScopeImpl {
    public final ClassDescriptor a;
    public final NotNullLazyValue b;
    public static final KProperty[] c;

    static {
        GivenFunctionsMemberScope.c = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public GivenFunctionsMemberScope(@NotNull StorageManager storageManager0, @NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(classDescriptor0, "containingClass");
        super();
        this.a = classDescriptor0;
        this.b = storageManager0.createLazyValue(new s(this, 4));
    }

    public static final List access$createFakeOverrides(GivenFunctionsMemberScope givenFunctionsMemberScope0, List list0) {
        List list2;
        givenFunctionsMemberScope0.getClass();
        ArrayList arrayList0 = new ArrayList(3);
        Collection collection0 = givenFunctionsMemberScope0.a.getTypeConstructor().getSupertypes();
        Intrinsics.checkNotNullExpressionValue(collection0, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: collection0) {
            o.addAll(arrayList1, DefaultImpls.getContributedDescriptors$default(((KotlinType)object0).getMemberScope(), null, null, 3, null));
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object1: arrayList1) {
            if(object1 instanceof CallableMemberDescriptor) {
                arrayList2.add(object1);
            }
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object2: arrayList2) {
            Name name0 = ((CallableMemberDescriptor)object2).getName();
            ArrayList arrayList3 = linkedHashMap0.get(name0);
            if(arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap0.put(name0, arrayList3);
            }
            arrayList3.add(object2);
        }
        for(Object object3: linkedHashMap0.entrySet()) {
            Name name1 = (Name)((Map.Entry)object3).getKey();
            Iterable iterable0 = (List)((Map.Entry)object3).getValue();
            LinkedHashMap linkedHashMap1 = new LinkedHashMap();
            for(Object object4: iterable0) {
                Boolean boolean0 = Boolean.valueOf(((CallableMemberDescriptor)object4) instanceof FunctionDescriptor);
                ArrayList arrayList4 = linkedHashMap1.get(boolean0);
                if(arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap1.put(boolean0, arrayList4);
                }
                arrayList4.add(object4);
            }
            for(Object object5: linkedHashMap1.entrySet()) {
                boolean z = ((Boolean)((Map.Entry)object5).getKey()).booleanValue();
                List list1 = (List)((Map.Entry)object5).getValue();
                OverridingUtil overridingUtil0 = OverridingUtil.DEFAULT;
                if(z) {
                    list2 = new ArrayList();
                    for(Object object6: list0) {
                        if(Intrinsics.areEqual(((FunctionDescriptor)object6).getName(), name1)) {
                            ((ArrayList)list2).add(object6);
                        }
                    }
                }
                else {
                    list2 = CollectionsKt__CollectionsKt.emptyList();
                }
                GivenFunctionsMemberScope.createFakeOverrides.4 givenFunctionsMemberScope$createFakeOverrides$40 = new GivenFunctionsMemberScope.createFakeOverrides.4(arrayList0, givenFunctionsMemberScope0);
                overridingUtil0.generateOverridesInFunctionGroup(name1, list1, list2, givenFunctionsMemberScope0.a, givenFunctionsMemberScope$createFakeOverrides$40);
            }
        }
        return CollectionsKt.compact(arrayList0);
    }

    @NotNull
    public abstract List computeDeclaredFunctions();

    @NotNull
    public final ClassDescriptor getContainingClass() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Collection getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        return descriptorKindFilter0.acceptsKinds(DescriptorKindFilter.CALLABLES.getKindMask()) ? ((List)StorageKt.getValue(this.b, this, GivenFunctionsMemberScope.c[0])) : CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Collection getContributedFunctions(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        Iterable iterable0 = (List)StorageKt.getValue(this.b, this, GivenFunctionsMemberScope.c[0]);
        Collection collection0 = new SmartList();
        for(Object object0: iterable0) {
            if(object0 instanceof SimpleFunctionDescriptor && Intrinsics.areEqual(((SimpleFunctionDescriptor)object0).getName(), name0)) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Collection getContributedVariables(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        Iterable iterable0 = (List)StorageKt.getValue(this.b, this, GivenFunctionsMemberScope.c[0]);
        Collection collection0 = new SmartList();
        for(Object object0: iterable0) {
            if(object0 instanceof PropertyDescriptor && Intrinsics.areEqual(((PropertyDescriptor)object0).getName(), name0)) {
                collection0.add(object0);
            }
        }
        return collection0;
    }
}

