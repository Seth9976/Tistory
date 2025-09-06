package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import df.a;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nStaticScopeForKotlinEnum.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticScopeForKotlinEnum.kt\norg/jetbrains/kotlin/resolve/scopes/StaticScopeForKotlinEnum\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1#2:63\n857#3,2:64\n857#3,2:66\n*S KotlinDebug\n*F\n+ 1 StaticScopeForKotlinEnum.kt\norg/jetbrains/kotlin/resolve/scopes/StaticScopeForKotlinEnum\n*L\n53#1:64,2\n56#1:66,2\n*E\n"})
public final class StaticScopeForKotlinEnum extends MemberScopeImpl {
    public final ClassDescriptor a;
    public final NotNullLazyValue b;
    public final NotNullLazyValue c;
    public static final KProperty[] d;

    static {
        StaticScopeForKotlinEnum.d = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StaticScopeForKotlinEnum.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public StaticScopeForKotlinEnum(@NotNull StorageManager storageManager0, @NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(classDescriptor0, "containingClass");
        super();
        this.a = classDescriptor0;
        classDescriptor0.getKind();
        this.b = storageManager0.createLazyValue(new a(this, 0));
        this.c = storageManager0.createLazyValue(new a(this, 1));
    }

    public static final ClassDescriptor access$getContainingClass$p(StaticScopeForKotlinEnum staticScopeForKotlinEnum0) {
        return staticScopeForKotlinEnum0.a;
    }

    @Nullable
    public Void getContributedClassifier(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public ClassifierDescriptor getContributedClassifier(Name name0, LookupLocation lookupLocation0) {
        return (ClassifierDescriptor)this.getContributedClassifier(name0, lookupLocation0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter0, Function1 function10) {
        return this.getContributedDescriptors(descriptorKindFilter0, function10);
    }

    @NotNull
    public List getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        return CollectionsKt___CollectionsKt.plus(((List)StorageKt.getValue(this.b, this, StaticScopeForKotlinEnum.d[0])), ((List)StorageKt.getValue(this.c, this, StaticScopeForKotlinEnum.d[1])));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public Collection getContributedFunctions(Name name0, LookupLocation lookupLocation0) {
        return this.getContributedFunctions(name0, lookupLocation0);
    }

    @NotNull
    public SmartList getContributedFunctions(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        Iterable iterable0 = (List)StorageKt.getValue(this.b, this, StaticScopeForKotlinEnum.d[0]);
        SmartList smartList0 = new SmartList();
        for(Object object0: iterable0) {
            if(Intrinsics.areEqual(((SimpleFunctionDescriptor)object0).getName(), name0)) {
                smartList0.add(object0);
            }
        }
        return smartList0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Collection getContributedVariables(@NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        Iterable iterable0 = (List)StorageKt.getValue(this.c, this, StaticScopeForKotlinEnum.d[1]);
        Collection collection0 = new SmartList();
        for(Object object0: iterable0) {
            if(Intrinsics.areEqual(((PropertyDescriptor)object0).getName(), name0)) {
                collection0.add(object0);
            }
        }
        return collection0;
    }
}

