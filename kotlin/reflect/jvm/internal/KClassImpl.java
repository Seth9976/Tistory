package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000\u00B2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u001B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001lB\u0015\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\u00A2\u0006\u0004\b\t\u0010\nJ\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001D\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0010J\u0019\u0010\u0015\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0014\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001C\u001A\u00020\u00182\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u001C\u0010\u001AJ\u000F\u0010\u001D\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010 \u001A\u00020\u001FH\u0016\u00A2\u0006\u0004\b \u0010!R \u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R9\u0010-\u001A$\u0012 \u0012\u001E (*\u000E\u0018\u00010\'R\b\u0012\u0004\u0012\u00028\u00000\u00000\'R\b\u0012\u0004\u0012\u00028\u00000\u00000&8\u0006\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R\u001A\u00102\u001A\b\u0012\u0004\u0012\u00020/0.8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b0\u00101R\u001E\u00106\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003030\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b4\u00105R\u001A\u00109\u001A\b\u0012\u0004\u0012\u0002070\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b8\u00105R\u0016\u0010;\u001A\u0004\u0018\u00010\u001F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b:\u0010!R\u0016\u0010=\u001A\u0004\u0018\u00010\u001F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b<\u0010!R \u0010@\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000>0\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b?\u00105R\u001E\u0010B\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bA\u00105R\u0016\u0010E\u001A\u0004\u0018\u00018\u00008VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bC\u0010DR\u001A\u0010H\u001A\b\u0012\u0004\u0012\u00020F0.8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bG\u00101R\u001A\u0010K\u001A\b\u0012\u0004\u0012\u00020I0.8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bJ\u00101R\"\u0010M\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040.8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bL\u00101R\u0016\u0010Q\u001A\u0004\u0018\u00010N8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bO\u0010PR\u0014\u0010R\u001A\u00020\u00188VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bR\u0010SR\u0014\u0010T\u001A\u00020\u00188VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bT\u0010SR\u0014\u0010U\u001A\u00020\u00188VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bU\u0010SR\u0014\u0010V\u001A\u00020\u00188VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bV\u0010SR\u0014\u0010W\u001A\u00020\u00188VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bW\u0010SR\u0014\u0010X\u001A\u00020\u00188VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bX\u0010SR\u0014\u0010Y\u001A\u00020\u00188VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bY\u0010SR\u0014\u0010Z\u001A\u00020\u00188VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bZ\u0010SR\u001A\u0010[\u001A\u00020\u00188VX\u0096\u0004\u00A2\u0006\f\u0012\u0004\b\\\u0010]\u001A\u0004\b[\u0010SR\u0014\u0010a\u001A\u00020^8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b_\u0010`R\u0014\u0010e\u001A\u00020b8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bc\u0010dR\u0014\u0010i\u001A\u00020f8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bg\u0010hR\u0014\u0010k\u001A\u00020f8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bj\u0010h\u00A8\u0006m"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "", "T", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getProperties", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "getFunctions", "", "index", "getLocalProperty", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "value", "", "isInstance", "(Ljava/lang/Object;)Z", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "kotlin.jvm.PlatformType", "d", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "getData", "()Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "data", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "constructorDescriptors", "getSimpleName", "simpleName", "getQualifiedName", "qualifiedName", "Lkotlin/reflect/KFunction;", "getConstructors", "constructors", "getNestedClasses", "nestedClasses", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KType;", "getSupertypes", "supertypes", "getSealedSubclasses", "sealedSubclasses", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility", "isFinal", "()Z", "isOpen", "isAbstract", "isSealed", "isData", "isInner", "isCompanion", "isFun", "isValue", "isValue$annotations", "()V", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "Data", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class KClassImpl extends KDeclarationContainerImpl implements KClass, KClassifierImpl, KTypeParameterOwnerImpl {
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001B\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004R!\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\nR\u001D\u0010\u0010\u001A\u0004\u0018\u00010\f8FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b\r\u0010\b\u001A\u0004\b\u000E\u0010\u000FR\u001D\u0010\u0013\u001A\u0004\u0018\u00010\f8FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b\u0011\u0010\b\u001A\u0004\b\u0012\u0010\u000FR-\u0010\u001B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148FX\u0086\u0084\u0002\u00A2\u0006\u0012\n\u0004\b\u0016\u0010\b\u0012\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u0017\u0010\u0018R%\u0010\u001F\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001C0\u00148FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b\u001D\u0010\b\u001A\u0004\b\u001E\u0010\u0018R#\u0010%\u001A\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002\u00A2\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010\u001A\u001A\u0004\b\"\u0010#R!\u0010)\u001A\b\u0012\u0004\u0012\u00020&0\u00058FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b\'\u0010\b\u001A\u0004\b(\u0010\nR!\u0010-\u001A\b\u0012\u0004\u0012\u00020*0\u00058FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b+\u0010\b\u001A\u0004\b,\u0010\nR)\u00100\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001C0\u00058FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b.\u0010\b\u001A\u0004\b/\u0010\nR%\u00104\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003010\u00148FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b2\u0010\b\u001A\u0004\b3\u0010\u0018R%\u00107\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003010\u00148FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b5\u0010\b\u001A\u0004\b6\u0010\u0018R%\u0010:\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003010\u00148FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b8\u0010\b\u001A\u0004\b9\u0010\u0018R%\u0010=\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003010\u00148FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b;\u0010\b\u001A\u0004\b<\u0010\u0018R%\u0010@\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003010\u00148FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b>\u0010\b\u001A\u0004\b?\u0010\u0018\u00A8\u0006A"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "", "", "d", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getAnnotations", "()Ljava/util/List;", "annotations", "", "e", "getSimpleName", "()Ljava/lang/String;", "simpleName", "f", "getQualifiedName", "qualifiedName", "", "Lkotlin/reflect/KFunction;", "g", "getConstructors", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lkotlin/reflect/KClass;", "h", "getNestedClasses", "nestedClasses", "i", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "getObjectInstance", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lkotlin/reflect/KTypeParameter;", "j", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KType;", "k", "getSupertypes", "supertypes", "l", "getSealedSubclasses", "sealedSubclasses", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "m", "getDeclaredNonStaticMembers", "declaredNonStaticMembers", "q", "getAllNonStaticMembers", "allNonStaticMembers", "r", "getAllStaticMembers", "allStaticMembers", "s", "getDeclaredMembers", "declaredMembers", "t", "getAllMembers", "allMembers", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public final class Data extends kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Data {
        public final LazySoftVal c;
        public final LazySoftVal d;
        public final LazySoftVal e;
        public final LazySoftVal f;
        public final LazySoftVal g;
        public final LazySoftVal h;
        public final LazyVal i;
        public final LazySoftVal j;
        public final LazySoftVal k;
        public final LazySoftVal l;
        public final LazySoftVal m;
        public final LazySoftVal n;
        public final LazySoftVal o;
        public final LazySoftVal p;
        public final LazySoftVal q;
        public final LazySoftVal r;
        public final LazySoftVal s;
        public final LazySoftVal t;
        public static final KProperty[] u;

        static {
            Data.u = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "annotations", "getAnnotations()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "simpleName", "getSimpleName()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "constructors", "getConstructors()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "supertypes", "getSupertypes()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        }

        public Data() {
            this.c = ReflectProperties.lazySoft(new k(kClassImpl0));
            this.d = ReflectProperties.lazySoft(new f(this));
            this.e = ReflectProperties.lazySoft(new r(this, kClassImpl0));
            this.f = ReflectProperties.lazySoft(new p(kClassImpl0));
            this.g = ReflectProperties.lazySoft(new g(kClassImpl0));
            this.h = ReflectProperties.lazySoft(new n(this));
            this.i = ReflectProperties.lazy(new o(this, kClassImpl0));
            this.j = ReflectProperties.lazySoft(new v(this, kClassImpl0));
            this.k = ReflectProperties.lazySoft(new u(this, kClassImpl0));
            this.l = ReflectProperties.lazySoft(new q(this));
            this.m = ReflectProperties.lazySoft(new i(kClassImpl0));
            this.n = ReflectProperties.lazySoft(new j(kClassImpl0));
            this.o = ReflectProperties.lazySoft(new l(kClassImpl0));
            this.p = ReflectProperties.lazySoft(new m(kClassImpl0));
            this.q = ReflectProperties.lazySoft(new d(this));
            this.r = ReflectProperties.lazySoft(new e(this));
            this.s = ReflectProperties.lazySoft(new h(this));
            this.t = ReflectProperties.lazySoft(new c(this));
        }

        public static final String access$calculateLocalClassName(Data kClassImpl$Data0, Class class0) {
            kClassImpl$Data0.getClass();
            String s = class0.getSimpleName();
            Method method0 = class0.getEnclosingMethod();
            if(method0 != null) {
                StringBuilder stringBuilder0 = a.f(s, "name");
                stringBuilder0.append(method0.getName());
                stringBuilder0.append('$');
                return StringsKt__StringsKt.substringAfter$default(s, stringBuilder0.toString(), null, 2, null);
            }
            Constructor constructor0 = class0.getEnclosingConstructor();
            if(constructor0 != null) {
                StringBuilder stringBuilder1 = a.f(s, "name");
                stringBuilder1.append(constructor0.getName());
                stringBuilder1.append('$');
                return StringsKt__StringsKt.substringAfter$default(s, stringBuilder1.toString(), null, 2, null);
            }
            Intrinsics.checkNotNullExpressionValue(s, "name");
            return StringsKt__StringsKt.substringAfter$default(s, '$', null, 2, null);
        }

        public static final Collection access$getDeclaredStaticMembers(Data kClassImpl$Data0) {
            kClassImpl$Data0.getClass();
            Object object0 = kClassImpl$Data0.n.getValue(kClassImpl$Data0, Data.u[11]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-declaredStaticMembers>(...)");
            return (Collection)object0;
        }

        public static final Collection access$getInheritedNonStaticMembers(Data kClassImpl$Data0) {
            kClassImpl$Data0.getClass();
            Object object0 = kClassImpl$Data0.o.getValue(kClassImpl$Data0, Data.u[12]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-inheritedNonStaticMembers>(...)");
            return (Collection)object0;
        }

        public static final Collection access$getInheritedStaticMembers(Data kClassImpl$Data0) {
            kClassImpl$Data0.getClass();
            Object object0 = kClassImpl$Data0.p.getValue(kClassImpl$Data0, Data.u[13]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-inheritedStaticMembers>(...)");
            return (Collection)object0;
        }

        @NotNull
        public final Collection getAllMembers() {
            Object object0 = this.t.getValue(this, Data.u[17]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-allMembers>(...)");
            return (Collection)object0;
        }

        @NotNull
        public final Collection getAllNonStaticMembers() {
            Object object0 = this.q.getValue(this, Data.u[14]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-allNonStaticMembers>(...)");
            return (Collection)object0;
        }

        @NotNull
        public final Collection getAllStaticMembers() {
            Object object0 = this.r.getValue(this, Data.u[15]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-allStaticMembers>(...)");
            return (Collection)object0;
        }

        @NotNull
        public final List getAnnotations() {
            Object object0 = this.d.getValue(this, Data.u[1]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-annotations>(...)");
            return (List)object0;
        }

        @NotNull
        public final Collection getConstructors() {
            Object object0 = this.g.getValue(this, Data.u[4]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-constructors>(...)");
            return (Collection)object0;
        }

        @NotNull
        public final Collection getDeclaredMembers() {
            Object object0 = this.s.getValue(this, Data.u[16]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-declaredMembers>(...)");
            return (Collection)object0;
        }

        @NotNull
        public final Collection getDeclaredNonStaticMembers() {
            Object object0 = this.m.getValue(this, Data.u[10]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-declaredNonStaticMembers>(...)");
            return (Collection)object0;
        }

        @NotNull
        public final ClassDescriptor getDescriptor() {
            Object object0 = this.c.getValue(this, Data.u[0]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-descriptor>(...)");
            return (ClassDescriptor)object0;
        }

        @NotNull
        public final Collection getNestedClasses() {
            Object object0 = this.h.getValue(this, Data.u[5]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-nestedClasses>(...)");
            return (Collection)object0;
        }

        @Nullable
        public final Object getObjectInstance() {
            return this.i.getValue(this, Data.u[6]);
        }

        @Nullable
        public final String getQualifiedName() {
            return (String)this.f.getValue(this, Data.u[3]);
        }

        @NotNull
        public final List getSealedSubclasses() {
            Object object0 = this.l.getValue(this, Data.u[9]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-sealedSubclasses>(...)");
            return (List)object0;
        }

        @Nullable
        public final String getSimpleName() {
            return (String)this.e.getValue(this, Data.u[2]);
        }

        @NotNull
        public final List getSupertypes() {
            Object object0 = this.k.getValue(this, Data.u[8]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-supertypes>(...)");
            return (List)object0;
        }

        @NotNull
        public final List getTypeParameters() {
            Object object0 = this.j.getValue(this, Data.u[7]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-typeParameters>(...)");
            return (List)object0;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Kind.values().length];
            try {
                arr_v[Kind.FILE_FACADE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Kind.MULTIFILE_CLASS.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Kind.UNKNOWN.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Kind.CLASS.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final Class c;
    public final LazyVal d;

    public KClassImpl(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "jClass");
        super();
        this.c = class0;
        LazyVal reflectProperties$LazyVal0 = ReflectProperties.lazy(new w(this));
        Intrinsics.checkNotNullExpressionValue(reflectProperties$LazyVal0, "lazy { Data() }");
        this.d = reflectProperties$LazyVal0;
    }

    public static final ClassId access$getClassId(KClassImpl kClassImpl0) {
        kClassImpl0.getClass();
        return RuntimeTypeMapper.INSTANCE.mapJvmClassToKotlinClassId(kClassImpl0.getJClass());
    }

    public static final Void access$reportUnresolvedClass(KClassImpl kClassImpl0) {
        Kind kotlinClassHeader$Kind0;
        kClassImpl0.getClass();
        ReflectKotlinClass reflectKotlinClass0 = ReflectKotlinClass.Factory.create(kClassImpl0.getJClass());
        if(reflectKotlinClass0 == null) {
            kotlinClassHeader$Kind0 = null;
        }
        else {
            KotlinClassHeader kotlinClassHeader0 = reflectKotlinClass0.getClassHeader();
            kotlinClassHeader$Kind0 = kotlinClassHeader0 == null ? null : kotlinClassHeader0.getKind();
        }
        switch((kotlinClassHeader$Kind0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kotlinClassHeader$Kind0.ordinal()])) {
            case 1: 
            case 2: 
            case 3: {
                throw new UnsupportedOperationException("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: " + kClassImpl0.getJClass());
            }
            case 4: {
                throw new UnsupportedOperationException("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It\'s not a Kotlin class or interface, so the reflection library has no idea what declarations it has. Please use Java reflection to inspect this class: " + kClassImpl0.getJClass());
            }
            case 5: {
                throw new KotlinReflectionInternalError("Unknown class: " + kClassImpl0.getJClass() + " (kind = " + kotlinClassHeader$Kind0 + ')');
            }
            case -1: 
            case 6: {
                throw new KotlinReflectionInternalError("Unresolved class: " + kClassImpl0.getJClass());
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.reflect.KClass
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof KClassImpl && Intrinsics.areEqual(JvmClassMappingKt.getJavaObjectType(this), JvmClassMappingKt.getJavaObjectType(((KClass)object0)));
    }

    @Override  // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List getAnnotations() {
        return ((Data)this.d.invoke()).getAnnotations();
    }

    @Override  // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection getConstructorDescriptors() {
        ClassDescriptor classDescriptor0 = this.getDescriptor();
        if(classDescriptor0.getKind() != ClassKind.INTERFACE && classDescriptor0.getKind() != ClassKind.OBJECT) {
            Collection collection0 = classDescriptor0.getConstructors();
            Intrinsics.checkNotNullExpressionValue(collection0, "descriptor.constructors");
            return collection0;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.KClass
    @NotNull
    public Collection getConstructors() {
        return ((Data)this.d.invoke()).getConstructors();
    }

    @NotNull
    public final LazyVal getData() {
        return this.d;
    }

    @NotNull
    public ClassDescriptor getDescriptor() {
        return ((Data)this.d.invoke()).getDescriptor();
    }

    @Override  // kotlin.reflect.jvm.internal.KClassifierImpl
    public ClassifierDescriptor getDescriptor() {
        return this.getDescriptor();
    }

    @Override  // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection getFunctions(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        return CollectionsKt___CollectionsKt.plus(this.getMemberScope$kotlin_reflection().getContributedFunctions(name0, NoLookupLocation.FROM_REFLECTION), this.getStaticScope$kotlin_reflection().getContributedFunctions(name0, NoLookupLocation.FROM_REFLECTION));
    }

    @Override  // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    public Class getJClass() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    public PropertyDescriptor getLocalProperty(int v) {
        if(Intrinsics.areEqual(this.getJClass().getSimpleName(), "DefaultImpls")) {
            Class class0 = this.getJClass().getDeclaringClass();
            if(class0 != null && class0.isInterface()) {
                KClass kClass0 = JvmClassMappingKt.getKotlinClass(class0);
                Intrinsics.checkNotNull(kClass0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                return ((KClassImpl)kClass0).getLocalProperty(v);
            }
        }
        ClassDescriptor classDescriptor0 = this.getDescriptor();
        DeserializedClassDescriptor deserializedClassDescriptor0 = classDescriptor0 instanceof DeserializedClassDescriptor ? ((DeserializedClassDescriptor)classDescriptor0) : null;
        if(deserializedClassDescriptor0 != null) {
            Intrinsics.checkNotNullExpressionValue(JvmProtoBuf.classLocalVariable, "classLocalVariable");
            Object object0 = ProtoBufUtilKt.getExtensionOrNull(deserializedClassDescriptor0.getClassProto(), JvmProtoBuf.classLocalVariable, v);
            return ((Property)object0) == null ? null : ((PropertyDescriptor)UtilKt.deserializeToDescriptor(this.getJClass(), ((Property)object0), deserializedClassDescriptor0.getC().getNameResolver(), deserializedClassDescriptor0.getC().getTypeTable(), deserializedClassDescriptor0.getMetadataVersion(), fe.f.a));
        }
        return null;
    }

    @NotNull
    public final MemberScope getMemberScope$kotlin_reflection() {
        return this.getDescriptor().getDefaultType().getMemberScope();
    }

    @Override  // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    @NotNull
    public Collection getMembers() {
        return ((Data)this.d.invoke()).getAllMembers();
    }

    @Override  // kotlin.reflect.KClass
    @NotNull
    public Collection getNestedClasses() {
        return ((Data)this.d.invoke()).getNestedClasses();
    }

    @Override  // kotlin.reflect.KClass
    @Nullable
    public Object getObjectInstance() {
        return ((Data)this.d.invoke()).getObjectInstance();
    }

    @Override  // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection getProperties(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        return CollectionsKt___CollectionsKt.plus(this.getMemberScope$kotlin_reflection().getContributedVariables(name0, NoLookupLocation.FROM_REFLECTION), this.getStaticScope$kotlin_reflection().getContributedVariables(name0, NoLookupLocation.FROM_REFLECTION));
    }

    @Override  // kotlin.reflect.KClass
    @Nullable
    public String getQualifiedName() {
        return ((Data)this.d.invoke()).getQualifiedName();
    }

    @Override  // kotlin.reflect.KClass
    @NotNull
    public List getSealedSubclasses() {
        return ((Data)this.d.invoke()).getSealedSubclasses();
    }

    @Override  // kotlin.reflect.KClass
    @Nullable
    public String getSimpleName() {
        return ((Data)this.d.invoke()).getSimpleName();
    }

    @NotNull
    public final MemberScope getStaticScope$kotlin_reflection() {
        MemberScope memberScope0 = this.getDescriptor().getStaticScope();
        Intrinsics.checkNotNullExpressionValue(memberScope0, "descriptor.staticScope");
        return memberScope0;
    }

    @Override  // kotlin.reflect.KClass
    @NotNull
    public List getSupertypes() {
        return ((Data)this.d.invoke()).getSupertypes();
    }

    @Override  // kotlin.reflect.KClass
    @NotNull
    public List getTypeParameters() {
        return ((Data)this.d.invoke()).getTypeParameters();
    }

    @Override  // kotlin.reflect.KClass
    @Nullable
    public KVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility0 = this.getDescriptor().getVisibility();
        Intrinsics.checkNotNullExpressionValue(descriptorVisibility0, "descriptor.visibility");
        return UtilKt.toKVisibility(descriptorVisibility0);
    }

    @Override  // kotlin.reflect.KClass
    public int hashCode() {
        return JvmClassMappingKt.getJavaObjectType(this).hashCode();
    }

    @Override  // kotlin.reflect.KClass
    public boolean isAbstract() {
        return this.getDescriptor().getModality() == Modality.ABSTRACT;
    }

    @Override  // kotlin.reflect.KClass
    public boolean isCompanion() {
        return this.getDescriptor().isCompanionObject();
    }

    @Override  // kotlin.reflect.KClass
    public boolean isData() {
        return this.getDescriptor().isData();
    }

    @Override  // kotlin.reflect.KClass
    public boolean isFinal() {
        return this.getDescriptor().getModality() == Modality.FINAL;
    }

    @Override  // kotlin.reflect.KClass
    public boolean isFun() {
        return this.getDescriptor().isFun();
    }

    @Override  // kotlin.reflect.KClass
    public boolean isInner() {
        return this.getDescriptor().isInner();
    }

    @Override  // kotlin.reflect.KClass
    public boolean isInstance(@Nullable Object object0) {
        Integer integer0 = ReflectClassUtilKt.getFunctionClassArity(this.getJClass());
        if(integer0 != null) {
            return TypeIntrinsics.isFunctionOfArity(object0, integer0.intValue());
        }
        Class class0 = ReflectClassUtilKt.getWrapperByPrimitive(this.getJClass());
        if(class0 == null) {
            class0 = this.getJClass();
        }
        return class0.isInstance(object0);
    }

    @Override  // kotlin.reflect.KClass
    public boolean isOpen() {
        return this.getDescriptor().getModality() == Modality.OPEN;
    }

    @Override  // kotlin.reflect.KClass
    public boolean isSealed() {
        return this.getDescriptor().getModality() == Modality.SEALED;
    }

    @Override  // kotlin.reflect.KClass
    public boolean isValue() {
        return this.getDescriptor().isValue();
    }

    @Override
    @NotNull
    public String toString() {
        ClassId classId0 = RuntimeTypeMapper.INSTANCE.mapJvmClassToKotlinClassId(this.getJClass());
        FqName fqName0 = classId0.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(fqName0, "classId.packageFqName");
        String s = fqName0.isRoot() ? "" : fqName0.asString() + '.';
        String s1 = classId0.getRelativeClassName().asString();
        Intrinsics.checkNotNullExpressionValue(s1, "classId.relativeClassName.asString()");
        return "class " + (s + kotlin.text.p.replace$default(s1, '.', '$', false, 4, null));
    }
}

