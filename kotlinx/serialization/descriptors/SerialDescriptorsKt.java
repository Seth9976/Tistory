package kotlinx.serialization.descriptors;

import a5.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.text.p;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.internal.ArrayListClassDesc;
import kotlinx.serialization.internal.HashMapClassDesc;
import kotlinx.serialization.internal.HashSetClassDesc;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001B\n\u0000\n\u0002\u0010\u000B\n\u0000\u001A\u0016\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n\u001A\u0018\u0010\u000B\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u0001H\u0007\u001AB\u0010\r\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\b2\u0012\u0010\u000E\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000F\"\u00020\u00012\u0019\b\u0002\u0010\u0010\u001A\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u00A2\u0006\u0002\b\u0014\u00A2\u0006\u0002\u0010\u0015\u001AL\u0010\u0016\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u00172\u0012\u0010\u000E\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000F\"\u00020\u00012\u0019\b\u0002\u0010\u0018\u001A\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u00A2\u0006\u0002\b\u0014H\u0007\u00A2\u0006\u0002\u0010\u0019\u001A\u0011\u0010\u001A\u001A\u00020\u0001\"\u0006\b\u0000\u0010\u001B\u0018\u0001H\u0087\b\u001A\u0010\u0010\u001A\u001A\u00020\u00012\u0006\u0010\u001C\u001A\u00020\u0001H\u0007\u001A\u0019\u0010\u001D\u001A\u00020\u0001\"\u0006\b\u0000\u0010\u001E\u0018\u0001\"\u0006\b\u0001\u0010\u001F\u0018\u0001H\u0087\b\u001A\u0018\u0010\u001D\u001A\u00020\u00012\u0006\u0010 \u001A\u00020\u00012\u0006\u0010!\u001A\u00020\u0001H\u0007\u001A\u0011\u0010\"\u001A\u00020\u0001\"\u0006\b\u0000\u0010\u001B\u0018\u0001H\u0086\b\u001A\u000E\u0010\"\u001A\u00020\u00012\u0006\u0010#\u001A\u00020$\u001A\u0011\u0010%\u001A\u00020\u0001\"\u0006\b\u0000\u0010\u001B\u0018\u0001H\u0087\b\u001A\u0010\u0010%\u001A\u00020\u00012\u0006\u0010\u001C\u001A\u00020\u0001H\u0007\u001A7\u0010&\u001A\u00020\u0013\"\u0006\b\u0000\u0010\u001B\u0018\u0001*\u00020\u00122\u0006\u0010\'\u001A\u00020\b2\u000E\b\u0002\u0010(\u001A\b\u0012\u0004\u0012\u00020*0)2\b\b\u0002\u0010+\u001A\u00020,H\u0086\b\"\u001B\u0010\u0000\u001A\u00020\u0001*\u00020\u00018F\u00A2\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005\u00A8\u0006-"}, d2 = {"nullable", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getNullable$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getNullable", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "PrimitiveSerialDescriptor", "serialName", "", "kind", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "SerialDescriptor", "original", "buildClassSerialDescriptor", "typeParameters", "", "builderAction", "Lkotlin/Function1;", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "buildSerialDescriptor", "Lkotlinx/serialization/descriptors/SerialKind;", "builder", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialKind;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "listSerialDescriptor", "T", "elementDescriptor", "mapSerialDescriptor", "K", "V", "keyDescriptor", "valueDescriptor", "serialDescriptor", "type", "Lkotlin/reflect/KType;", "setSerialDescriptor", "element", "elementName", "annotations", "", "", "isOptional", "", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
public final class SerialDescriptorsKt {
    @NotNull
    public static final SerialDescriptor PrimitiveSerialDescriptor(@NotNull String s, @NotNull PrimitiveKind primitiveKind0) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        Intrinsics.checkNotNullParameter(primitiveKind0, "kind");
        if(p.isBlank(s)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return PrimitivesKt.PrimitiveDescriptorSafe(s, primitiveKind0);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final SerialDescriptor SerialDescriptor(@NotNull String s, @NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "original");
        if(p.isBlank(s)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if(serialDescriptor0.getKind() instanceof PrimitiveKind) {
            throw new IllegalArgumentException("For primitive descriptors please use \'PrimitiveSerialDescriptor\' instead");
        }
        if(!Intrinsics.areEqual(s, serialDescriptor0.getSerialName())) {
            return new WrappedSerialDescriptor(s, serialDescriptor0);
        }
        StringBuilder stringBuilder0 = b.v("The name of the wrapped descriptor (", s, ") cannot be the same as the name of the original descriptor (");
        stringBuilder0.append(serialDescriptor0.getSerialName());
        stringBuilder0.append(')');
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    @NotNull
    public static final SerialDescriptor buildClassSerialDescriptor(@NotNull String s, @NotNull SerialDescriptor[] arr_serialDescriptor, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        Intrinsics.checkNotNullParameter(arr_serialDescriptor, "typeParameters");
        Intrinsics.checkNotNullParameter(function10, "builderAction");
        if(p.isBlank(s)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder0 = new ClassSerialDescriptorBuilder(s);
        function10.invoke(classSerialDescriptorBuilder0);
        List list0 = ArraysKt___ArraysKt.toList(arr_serialDescriptor);
        return new SerialDescriptorImpl(s, CLASS.INSTANCE, classSerialDescriptorBuilder0.getElementNames$kotlinx_serialization_core().size(), list0, classSerialDescriptorBuilder0);
    }

    public static SerialDescriptor buildClassSerialDescriptor$default(String s, SerialDescriptor[] arr_serialDescriptor, Function1 function10, int v, Object object0) {
        if((v & 4) != 0) {
            function10 = gg.b.x;
        }
        return SerialDescriptorsKt.buildClassSerialDescriptor(s, arr_serialDescriptor, function10);
    }

    @InternalSerializationApi
    @NotNull
    public static final SerialDescriptor buildSerialDescriptor(@NotNull String s, @NotNull SerialKind serialKind0, @NotNull SerialDescriptor[] arr_serialDescriptor, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        Intrinsics.checkNotNullParameter(serialKind0, "kind");
        Intrinsics.checkNotNullParameter(arr_serialDescriptor, "typeParameters");
        Intrinsics.checkNotNullParameter(function10, "builder");
        if(p.isBlank(s)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if(Intrinsics.areEqual(serialKind0, CLASS.INSTANCE)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use \'buildClassSerialDescriptor\' instead");
        }
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder0 = new ClassSerialDescriptorBuilder(s);
        function10.invoke(classSerialDescriptorBuilder0);
        return new SerialDescriptorImpl(s, serialKind0, classSerialDescriptorBuilder0.getElementNames$kotlinx_serialization_core().size(), ArraysKt___ArraysKt.toList(arr_serialDescriptor), classSerialDescriptorBuilder0);
    }

    public static SerialDescriptor buildSerialDescriptor$default(String s, SerialKind serialKind0, SerialDescriptor[] arr_serialDescriptor, Function1 function10, int v, Object object0) {
        if((v & 8) != 0) {
            function10 = gg.b.y;
        }
        return SerialDescriptorsKt.buildSerialDescriptor(s, serialKind0, arr_serialDescriptor, function10);
    }

    public static final void element(ClassSerialDescriptorBuilder classSerialDescriptorBuilder0, String s, List list0, boolean z) {
        Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "elementName");
        Intrinsics.checkNotNullParameter(list0, "annotations");
        Intrinsics.reifiedOperationMarker(6, "T");
        classSerialDescriptorBuilder0.element(s, SerializersKt.serializer(null).getDescriptor(), list0, z);
    }

    public static void element$default(ClassSerialDescriptorBuilder classSerialDescriptorBuilder0, String s, List list0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 4) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "elementName");
        Intrinsics.checkNotNullParameter(list0, "annotations");
        Intrinsics.reifiedOperationMarker(6, "T");
        classSerialDescriptorBuilder0.element(s, SerializersKt.serializer(null).getDescriptor(), list0, z);
    }

    @NotNull
    public static final SerialDescriptor getNullable(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        return serialDescriptor0.isNullable() ? serialDescriptor0 : new SerialDescriptorForNullable(serialDescriptor0);
    }

    public static void getNullable$annotations(SerialDescriptor serialDescriptor0) {
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor listSerialDescriptor() {
        Intrinsics.reifiedOperationMarker(6, "T");
        return SerialDescriptorsKt.listSerialDescriptor(SerializersKt.serializer(null).getDescriptor());
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final SerialDescriptor listSerialDescriptor(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "elementDescriptor");
        return new ArrayListClassDesc(serialDescriptor0);
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor mapSerialDescriptor() {
        Intrinsics.reifiedOperationMarker(6, "K");
        SerialDescriptor serialDescriptor0 = SerializersKt.serializer(null).getDescriptor();
        Intrinsics.reifiedOperationMarker(6, "V");
        return SerialDescriptorsKt.mapSerialDescriptor(serialDescriptor0, SerializersKt.serializer(null).getDescriptor());
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final SerialDescriptor mapSerialDescriptor(@NotNull SerialDescriptor serialDescriptor0, @NotNull SerialDescriptor serialDescriptor1) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "keyDescriptor");
        Intrinsics.checkNotNullParameter(serialDescriptor1, "valueDescriptor");
        return new HashMapClassDesc(serialDescriptor0, serialDescriptor1);
    }

    public static final SerialDescriptor serialDescriptor() {
        Intrinsics.reifiedOperationMarker(6, "T");
        return SerializersKt.serializer(null).getDescriptor();
    }

    @NotNull
    public static final SerialDescriptor serialDescriptor(@NotNull KType kType0) {
        Intrinsics.checkNotNullParameter(kType0, "type");
        return SerializersKt.serializer(kType0).getDescriptor();
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor setSerialDescriptor() {
        Intrinsics.reifiedOperationMarker(6, "T");
        return SerialDescriptorsKt.setSerialDescriptor(SerializersKt.serializer(null).getDescriptor());
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final SerialDescriptor setSerialDescriptor(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "elementDescriptor");
        return new HashSetClassDesc(serialDescriptor0);
    }
}

