package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001E\u0010\u0006\u001A\u00020\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/KType;", "Ljava/lang/reflect/Type;", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "javaType", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1549#3:232\n1620#3,3:233\n1549#3:236\n1620#3,3:237\n1549#3:240\n1620#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
public final class TypesJVMKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[KVariance.values().length];
            try {
                arr_v[KVariance.IN.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KVariance.INVARIANT.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KVariance.OUT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final Type a(KType kType0, boolean z) {
        KClassifier kClassifier0 = kType0.getClassifier();
        if(kClassifier0 instanceof KTypeParameter) {
            return new d(((KTypeParameter)kClassifier0));
        }
        if(!(kClassifier0 instanceof KClass)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + kType0);
        }
        Type type0 = z ? JvmClassMappingKt.getJavaObjectType(((KClass)kClassifier0)) : JvmClassMappingKt.getJavaClass(((KClass)kClassifier0));
        List list0 = kType0.getArguments();
        if(list0.isEmpty()) {
            return type0;
        }
        if(((Class)type0).isArray()) {
            if(((Class)type0).getComponentType().isPrimitive()) {
                return type0;
            }
            KTypeProjection kTypeProjection0 = (KTypeProjection)CollectionsKt___CollectionsKt.singleOrNull(list0);
            if(kTypeProjection0 == null) {
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType0);
            }
            KVariance kVariance0 = kTypeProjection0.component1();
            KType kType1 = kTypeProjection0.component2();
            switch((kVariance0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kVariance0.ordinal()])) {
                case -1: 
                case 1: {
                    break;
                }
                case 2: 
                case 3: {
                    Intrinsics.checkNotNull(kType1);
                    Type type1 = TypesJVMKt.a(kType1, false);
                    if(!(type1 instanceof Class)) {
                        return new a(type1);
                    }
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return type0;
        }
        return TypesJVMKt.b(((Class)type0), list0);
    }

    public static final String access$typeToString(Type type0) {
        String s;
        if(type0 instanceof Class) {
            if(((Class)type0).isArray()) {
                Sequence sequence0 = SequencesKt__SequencesKt.generateSequence(type0, e.a);
                s = ((Class)SequencesKt___SequencesKt.last(sequence0)).getName() + p.repeat("[]", SequencesKt___SequencesKt.count(sequence0));
            }
            else {
                s = ((Class)type0).getName();
            }
            Intrinsics.checkNotNull(s);
            return s;
        }
        return type0.toString();
    }

    public static final c b(Class class0, List list0) {
        Class class1 = class0.getDeclaringClass();
        if(class1 == null) {
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object0: list0) {
                arrayList0.add(TypesJVMKt.c(((KTypeProjection)object0)));
            }
            return new c(class0, null, arrayList0);
        }
        if(Modifier.isStatic(class0.getModifiers())) {
            ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object1: list0) {
                arrayList1.add(TypesJVMKt.c(((KTypeProjection)object1)));
            }
            return new c(class0, class1, arrayList1);
        }
        TypeVariable[] arr_typeVariable = class0.getTypeParameters();
        c c0 = TypesJVMKt.b(class1, list0.subList(arr_typeVariable.length, list0.size()));
        Iterable iterable0 = list0.subList(0, arr_typeVariable.length);
        ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object2: iterable0) {
            arrayList2.add(TypesJVMKt.c(((KTypeProjection)object2)));
        }
        return new c(class0, c0, arrayList2);
    }

    public static final Type c(KTypeProjection kTypeProjection0) {
        KVariance kVariance0 = kTypeProjection0.getVariance();
        if(kVariance0 == null) {
            return f.c.getSTAR();
        }
        KType kType0 = kTypeProjection0.getType();
        Intrinsics.checkNotNull(kType0);
        switch(WhenMappings.$EnumSwitchMapping$0[kVariance0.ordinal()]) {
            case 1: {
                return new f(null, TypesJVMKt.a(kType0, true));
            }
            case 2: {
                return TypesJVMKt.a(kType0, true);
            }
            case 3: {
                return new f(TypesJVMKt.a(kType0, true), null);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public static final Type getJavaType(@NotNull KType kType0) {
        Intrinsics.checkNotNullParameter(kType0, "<this>");
        if(kType0 instanceof KTypeBase) {
            Type type0 = ((KTypeBase)kType0).getJavaType();
            return type0 == null ? TypesJVMKt.a(kType0, false) : type0;
        }
        return TypesJVMKt.a(kType0, false);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.4")
    @LowPriorityInOverloadResolution
    public static void getJavaType$annotations(KType kType0) {
    }
}

