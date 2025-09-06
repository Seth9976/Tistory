package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001B\n\u0002\b\b\u001Ao\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000E\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00020\u00072\u000E\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0014\u0010\t\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00070\u00072\u000E\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\f\u001A_\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000E\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00020\u00072\u000E\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0014\u0010\u000E\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00070\u0007H\u0001¢\u0006\u0002\u0010\u000F\u001A9\u0010\u0010\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000E\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"createAnnotatedEnumSerializer", "Lkotlinx/serialization/KSerializer;", "T", "", "serialName", "", "values", "", "names", "entryAnnotations", "", "classAnnotations", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;", "createMarkedEnumSerializer", "annotations", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;", "createSimpleEnumSerializer", "(Ljava/lang/String;[Ljava/lang/Enum;)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,151:1\n13374#2,2:152\n13309#2,2:154\n13376#2:156\n13309#2,2:157\n13374#2,2:159\n13309#2,2:161\n13376#2:163\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumsKt\n*L\n70#1:152,2\n73#1:154,2\n70#1:156\n91#1:157,2\n94#1:159,2\n97#1:161,2\n94#1:163\n*E\n"})
public final class EnumsKt {
    @InternalSerializationApi
    @NotNull
    public static final KSerializer createAnnotatedEnumSerializer(@NotNull String s, @NotNull Enum[] arr_enum, @NotNull String[] arr_s, @NotNull Annotation[][] arr2_annotation, @Nullable Annotation[] arr_annotation) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        Intrinsics.checkNotNullParameter(arr_enum, "values");
        Intrinsics.checkNotNullParameter(arr_s, "names");
        Intrinsics.checkNotNullParameter(arr2_annotation, "entryAnnotations");
        EnumDescriptor enumDescriptor0 = new EnumDescriptor(s, arr_enum.length);
        if(arr_annotation != null) {
            for(int v = 0; v < arr_annotation.length; ++v) {
                enumDescriptor0.pushClassAnnotation(arr_annotation[v]);
            }
        }
        int v1 = 0;
        for(int v2 = 0; v1 < arr_enum.length; ++v2) {
            Enum enum0 = arr_enum[v1];
            String s1 = (String)ArraysKt___ArraysKt.getOrNull(arr_s, v2);
            if(s1 == null) {
                s1 = enum0.name();
            }
            PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor0, s1, false, 2, null);
            Annotation[] arr_annotation1 = (Annotation[])ArraysKt___ArraysKt.getOrNull(arr2_annotation, v2);
            if(arr_annotation1 != null) {
                int v3 = arr_annotation1.length;
                for(int v4 = 0; v4 < v3; ++v4) {
                    enumDescriptor0.pushAnnotation(arr_annotation1[v4]);
                }
            }
            ++v1;
        }
        return new EnumSerializer(s, arr_enum, enumDescriptor0);
    }

    @InternalSerializationApi
    @NotNull
    public static final KSerializer createMarkedEnumSerializer(@NotNull String s, @NotNull Enum[] arr_enum, @NotNull String[] arr_s, @NotNull Annotation[][] arr2_annotation) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        Intrinsics.checkNotNullParameter(arr_enum, "values");
        Intrinsics.checkNotNullParameter(arr_s, "names");
        Intrinsics.checkNotNullParameter(arr2_annotation, "annotations");
        EnumDescriptor enumDescriptor0 = new EnumDescriptor(s, arr_enum.length);
        int v = 0;
        for(int v1 = 0; v < arr_enum.length; ++v1) {
            Enum enum0 = arr_enum[v];
            String s1 = (String)ArraysKt___ArraysKt.getOrNull(arr_s, v1);
            if(s1 == null) {
                s1 = enum0.name();
            }
            PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor0, s1, false, 2, null);
            Annotation[] arr_annotation = (Annotation[])ArraysKt___ArraysKt.getOrNull(arr2_annotation, v1);
            if(arr_annotation != null) {
                int v2 = arr_annotation.length;
                for(int v3 = 0; v3 < v2; ++v3) {
                    enumDescriptor0.pushAnnotation(arr_annotation[v3]);
                }
            }
            ++v;
        }
        return new EnumSerializer(s, arr_enum, enumDescriptor0);
    }

    @InternalSerializationApi
    @NotNull
    public static final KSerializer createSimpleEnumSerializer(@NotNull String s, @NotNull Enum[] arr_enum) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        Intrinsics.checkNotNullParameter(arr_enum, "values");
        return new EnumSerializer(s, arr_enum);
    }
}

