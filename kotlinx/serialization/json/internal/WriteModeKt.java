package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind.CONTEXTUAL;
import kotlinx.serialization.descriptors.SerialKind.ENUM;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind.LIST;
import kotlinx.serialization.descriptors.StructureKind.MAP;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0000\u001AS\u0010\u0004\u001A\u0002H\u0005\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u0002H\u0005\"\b\b\u0002\u0010\u0007*\u0002H\u0005*\u00020\b2\u0006\u0010\t\u001A\u00020\u00012\f\u0010\n\u001A\b\u0012\u0004\u0012\u0002H\u00060\u000B2\f\u0010\f\u001A\b\u0012\u0004\u0012\u0002H\u00070\u000BH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001A\u0014\u0010\u000E\u001A\u00020\u000F*\u00020\b2\u0006\u0010\u0010\u001A\u00020\u0001H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"carrierDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "module", "Lkotlinx/serialization/modules/SerializersModule;", "selectMapMode", "T", "R1", "R2", "Lkotlinx/serialization/json/Json;", "mapDescriptor", "ifMap", "Lkotlin/Function0;", "ifList", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "switchMode", "Lkotlinx/serialization/json/internal/WriteMode;", "desc", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWriteMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,53:1\n36#1,9:54\n*S KotlinDebug\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n26#1:54,9\n*E\n"})
public final class WriteModeKt {
    @NotNull
    public static final SerialDescriptor carrierDescriptor(@NotNull SerialDescriptor serialDescriptor0, @NotNull SerializersModule serializersModule0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(serializersModule0, "module");
        if(Intrinsics.areEqual(serialDescriptor0.getKind(), CONTEXTUAL.INSTANCE)) {
            SerialDescriptor serialDescriptor1 = ContextAwareKt.getContextualDescriptor(serializersModule0, serialDescriptor0);
            if(serialDescriptor1 != null) {
                SerialDescriptor serialDescriptor2 = WriteModeKt.carrierDescriptor(serialDescriptor1, serializersModule0);
                return serialDescriptor2 == null ? serialDescriptor0 : serialDescriptor2;
            }
            return serialDescriptor0;
        }
        return serialDescriptor0.isInline() ? WriteModeKt.carrierDescriptor(serialDescriptor0.getElementDescriptor(0), serializersModule0) : serialDescriptor0;
    }

    public static final Object selectMapMode(@NotNull Json json0, @NotNull SerialDescriptor serialDescriptor0, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(json0, "<this>");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "mapDescriptor");
        Intrinsics.checkNotNullParameter(function00, "ifMap");
        Intrinsics.checkNotNullParameter(function01, "ifList");
        SerialDescriptor serialDescriptor1 = WriteModeKt.carrierDescriptor(serialDescriptor0.getElementDescriptor(0), json0.getSerializersModule());
        SerialKind serialKind0 = serialDescriptor1.getKind();
        if(!(serialKind0 instanceof PrimitiveKind) && !Intrinsics.areEqual(serialKind0, ENUM.INSTANCE)) {
            if(!json0.getConfiguration().getAllowStructuredMapKeys()) {
                throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptor1);
            }
            return function01.invoke();
        }
        return function00.invoke();
    }

    @NotNull
    public static final WriteMode switchMode(@NotNull Json json0, @NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(json0, "<this>");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "desc");
        SerialKind serialKind0 = serialDescriptor0.getKind();
        if(serialKind0 instanceof PolymorphicKind) {
            return WriteMode.POLY_OBJ;
        }
        if(Intrinsics.areEqual(serialKind0, LIST.INSTANCE)) {
            return WriteMode.LIST;
        }
        if(Intrinsics.areEqual(serialKind0, MAP.INSTANCE)) {
            SerialDescriptor serialDescriptor1 = WriteModeKt.carrierDescriptor(serialDescriptor0.getElementDescriptor(0), json0.getSerializersModule());
            SerialKind serialKind1 = serialDescriptor1.getKind();
            if(!(serialKind1 instanceof PrimitiveKind) && !Intrinsics.areEqual(serialKind1, ENUM.INSTANCE)) {
                if(!json0.getConfiguration().getAllowStructuredMapKeys()) {
                    throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptor1);
                }
                return WriteMode.LIST;
            }
            return WriteMode.MAP;
        }
        return WriteMode.OBJ;
    }
}

