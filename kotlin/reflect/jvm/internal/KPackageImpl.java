package kotlin.reflect.jvm.internal;

import d0.s;
import fe.k;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001-B\u0013\u0012\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000BJ\u0019\u0010\u0010\u001A\u0004\u0018\u00010\t2\u0006\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u001A\u001A\u00020\u0019H\u0016¢\u0006\u0004\b\u001A\u0010\u001BR\u001E\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0018\u0010!\u001A\u0006\u0012\u0002\b\u00030\u00028TX\u0094\u0004¢\u0006\u0006\u001A\u0004\b \u0010\u001FR\u001E\u0010%\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b#\u0010$R\u001A\u0010(\u001A\b\u0012\u0004\u0012\u00020&0\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\'\u0010$R\u0014\u0010,\u001A\u00020)8BX\u0082\u0004¢\u0006\u0006\u001A\u0004\b*\u0010+¨\u0006."}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getProperties", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "getFunctions", "", "index", "getLocalProperty", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "getMethodOwner", "methodOwner", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "kotlin/reflect/jvm/internal/e0", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKPackageImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KPackageImpl.kt\nkotlin/reflect/jvm/internal/KPackageImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
public final class KPackageImpl extends KDeclarationContainerImpl {
    public final Class c;
    public final LazyVal d;

    public KPackageImpl(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "jClass");
        super();
        this.c = class0;
        LazyVal reflectProperties$LazyVal0 = ReflectProperties.lazy(new s(this, 6));
        Intrinsics.checkNotNullExpressionValue(reflectProperties$LazyVal0, "lazy { Data() }");
        this.d = reflectProperties$LazyVal0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof KPackageImpl && Intrinsics.areEqual(this.getJClass(), ((KPackageImpl)object0).getJClass());
    }

    @Override  // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection getConstructorDescriptors() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection getFunctions(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        e0 e00 = (e0)this.d.invoke();
        e00.getClass();
        Object object0 = e00.d.getValue(e00, e0.h[1]);
        Intrinsics.checkNotNullExpressionValue(object0, "<get-scope>(...)");
        return ((MemberScope)object0).getContributedFunctions(name0, NoLookupLocation.FROM_REFLECTION);
    }

    @Override  // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    public Class getJClass() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    public PropertyDescriptor getLocalProperty(int v) {
        e0 e00 = (e0)this.d.invoke();
        e00.getClass();
        Triple triple0 = (Triple)e00.f.getValue(e00, e0.h[3]);
        if(triple0 != null) {
            Object object0 = triple0.component1();
            Package protoBuf$Package0 = (Package)triple0.component2();
            Object object1 = triple0.component3();
            Intrinsics.checkNotNullExpressionValue(JvmProtoBuf.packageLocalVariable, "packageLocalVariable");
            Object object2 = ProtoBufUtilKt.getExtensionOrNull(protoBuf$Package0, JvmProtoBuf.packageLocalVariable, v);
            if(((Property)object2) != null) {
                TypeTable protoBuf$TypeTable0 = protoBuf$Package0.getTypeTable();
                Intrinsics.checkNotNullExpressionValue(protoBuf$TypeTable0, "packageProto.typeTable");
                return (PropertyDescriptor)UtilKt.deserializeToDescriptor(this.getJClass(), ((Property)object2), ((JvmNameResolver)object0), new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(protoBuf$TypeTable0), ((JvmMetadataVersion)object1), k.a);
            }
        }
        return null;
    }

    @Override  // kotlin.reflect.KDeclarationContainer
    @NotNull
    public Collection getMembers() {
        e0 e00 = (e0)this.d.invoke();
        e00.getClass();
        Object object0 = e00.g.getValue(e00, e0.h[4]);
        Intrinsics.checkNotNullExpressionValue(object0, "<get-members>(...)");
        return (Collection)object0;
    }

    @Override  // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Class getMethodOwner() {
        e0 e00 = (e0)this.d.invoke();
        e00.getClass();
        Class class0 = (Class)e00.e.getValue(e00, e0.h[2]);
        return class0 == null ? this.getJClass() : class0;
    }

    @Override  // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection getProperties(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        e0 e00 = (e0)this.d.invoke();
        e00.getClass();
        Object object0 = e00.d.getValue(e00, e0.h[1]);
        Intrinsics.checkNotNullExpressionValue(object0, "<get-scope>(...)");
        return ((MemberScope)object0).getContributedVariables(name0, NoLookupLocation.FROM_REFLECTION);
    }

    @Override
    public int hashCode() {
        return this.getJClass().hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "file class " + ReflectClassUtilKt.getClassId(this.getJClass()).asSingleFqName();
    }
}

