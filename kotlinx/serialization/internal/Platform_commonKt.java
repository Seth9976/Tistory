package kotlinx.serialization.internal;

import androidx.room.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001A\u0019\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A!\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00000\u0006*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001A$\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\t*\u0006\u0012\u0002\b\u00030\nH\u0081\b¢\u0006\u0004\b\u000B\u0010\f\u001A$\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\t*\u0006\u0012\u0002\b\u00030\rH\u0081\b¢\u0006\u0004\b\u000B\u0010\u000E\u001A$\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F\"\u0004\b\u0000\u0010\t*\u0006\u0012\u0002\b\u00030\u000FH\u0081\b¢\u0006\u0004\b\u000B\u0010\u0010\u001A\u0017\u0010\u0013\u001A\u00020\u0012*\u0006\u0012\u0002\b\u00030\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001A\u0017\u0010\u0015\u001A\u00020\u0002*\u0006\u0012\u0002\b\u00030\u0011H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001A\u0017\u0010\u0015\u001A\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0018\u001A\u0019\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001A0\u0011*\u00020\u0019H\u0000¢\u0006\u0004\b\u001B\u0010\u001C\u001A\u0013\u0010\u001E\u001A\u00020\u0019*\u00020\u001DH\u0000¢\u0006\u0004\b\u001E\u0010\u001F\u001A=\u0010%\u001A\u00020$\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010 *\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010#\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0080\bø\u0001\u0000¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\'"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "cachedSerialNames", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Set;", "", "", "compactArray", "(Ljava/util/List;)[Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "Lkotlinx/serialization/KSerializer;", "cast", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/SerializationStrategy;)Lkotlinx/serialization/SerializationStrategy;", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlin/reflect/KClass;", "", "serializerNotRegistered", "(Lkotlin/reflect/KClass;)Ljava/lang/Void;", "notRegisteredMessage", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "className", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/reflect/KType;", "", "kclass", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "Lkotlin/reflect/KTypeProjection;", "typeOrThrow", "(Lkotlin/reflect/KTypeProjection;)Lkotlin/reflect/KType;", "K", "", "Lkotlin/Function1;", "selector", "", "elementsHashCodeBy", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)I", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPlatform.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1#2:183\n37#3,2:184\n1789#4,3:186\n*S KotlinDebug\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n75#1:184,2\n159#1:186,3\n*E\n"})
public final class Platform_commonKt {
    public static final SerialDescriptor[] a;

    static {
        Platform_commonKt.a = new SerialDescriptor[0];
    }

    @NotNull
    public static final Set cachedSerialNames(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        if(serialDescriptor0 instanceof CachedNames) {
            return ((CachedNames)serialDescriptor0).getSerialNames();
        }
        Set set0 = new HashSet(serialDescriptor0.getElementsCount());
        int v = serialDescriptor0.getElementsCount();
        for(int v1 = 0; v1 < v; ++v1) {
            set0.add(serialDescriptor0.getElementName(v1));
        }
        return set0;
    }

    @PublishedApi
    @NotNull
    public static final DeserializationStrategy cast(@NotNull DeserializationStrategy deserializationStrategy0) {
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "<this>");
        return deserializationStrategy0;
    }

    @PublishedApi
    @NotNull
    public static final KSerializer cast(@NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kSerializer0, "<this>");
        return kSerializer0;
    }

    @PublishedApi
    @NotNull
    public static final SerializationStrategy cast(@NotNull SerializationStrategy serializationStrategy0) {
        Intrinsics.checkNotNullParameter(serializationStrategy0, "<this>");
        return serializationStrategy0;
    }

    @NotNull
    public static final SerialDescriptor[] compactArray(@Nullable List list0) {
        if(list0 == null || list0.isEmpty()) {
            list0 = null;
        }
        if(list0 != null) {
            SerialDescriptor[] arr_serialDescriptor = (SerialDescriptor[])list0.toArray(new SerialDescriptor[0]);
            return arr_serialDescriptor == null ? Platform_commonKt.a : arr_serialDescriptor;
        }
        return Platform_commonKt.a;
    }

    public static final int elementsHashCodeBy(@NotNull Iterable iterable0, @NotNull Function1 function10) {
        int v = 1;
        Iterator iterator0 = a.n(iterable0, "<this>", function10, "selector");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = function10.invoke(object0);
            v = v * 0x1F + (object1 == null ? 0 : object1.hashCode());
        }
        return v;
    }

    @NotNull
    public static final KClass kclass(@NotNull KType kType0) {
        Intrinsics.checkNotNullParameter(kType0, "<this>");
        KClassifier kClassifier0 = kType0.getClassifier();
        if(!(kClassifier0 instanceof KClass)) {
            throw kClassifier0 instanceof KTypeParameter ? new IllegalArgumentException("Captured type parameter " + kClassifier0 + " from generic non-reified function. Such functionality cannot be supported because " + kClassifier0 + " is erased, either specify serializer explicitly or make calling function inline with reified " + kClassifier0 + '.') : new IllegalArgumentException("Only KClass supported as classifier, got " + kClassifier0);
        }
        return (KClass)kClassifier0;
    }

    @NotNull
    public static final String notRegisteredMessage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "className");
        return "Serializer for class \'" + s + "\' is not found.\nPlease ensure that class is marked as \'@Serializable\' and that the serialization compiler plugin is applied.\n";
    }

    @NotNull
    public static final String notRegisteredMessage(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        String s = kClass0.getSimpleName();
        if(s == null) {
            s = "<local class name not available>";
        }
        return Platform_commonKt.notRegisteredMessage(s);
    }

    @NotNull
    public static final Void serializerNotRegistered(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(kClass0));
    }

    @NotNull
    public static final KType typeOrThrow(@NotNull KTypeProjection kTypeProjection0) {
        Intrinsics.checkNotNullParameter(kTypeProjection0, "<this>");
        KType kType0 = kTypeProjection0.getType();
        if(kType0 == null) {
            throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kTypeProjection0.getType()).toString());
        }
        return kType0;
    }
}

