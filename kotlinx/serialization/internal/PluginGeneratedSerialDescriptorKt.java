package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialKind;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u001AN\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0002H\u00022\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052!\u0010\u0006\u001A\u001D\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0007H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000B\u001A\u001F\u0010\f\u001A\u00020\r*\u00020\u00032\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00030\u000FH\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"equalsImpl", "", "SD", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "other", "", "typeParamsAreEqual", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "otherDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "hashCodeImpl", "", "typeParams", "", "(Lkotlinx/serialization/descriptors/SerialDescriptor;[Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n159#2:135\n159#2:139\n1789#3,3:136\n1789#3,3:140\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n128#1:135\n129#1:139\n128#1:136,3\n129#1:140,3\n*E\n"})
public final class PluginGeneratedSerialDescriptorKt {
    public static final boolean equalsImpl(SerialDescriptor serialDescriptor0, Object object0, Function1 function10) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "typeParamsAreEqual");
        if(serialDescriptor0 == object0) {
            return true;
        }
        Intrinsics.reifiedOperationMarker(3, "SD");
        if(!(object0 instanceof SerialDescriptor)) {
            return false;
        }
        if(!Intrinsics.areEqual(serialDescriptor0.getSerialName(), ((SerialDescriptor)object0).getSerialName())) {
            return false;
        }
        if(!((Boolean)function10.invoke(object0)).booleanValue()) {
            return false;
        }
        if(serialDescriptor0.getElementsCount() != ((SerialDescriptor)object0).getElementsCount()) {
            return false;
        }
        int v = serialDescriptor0.getElementsCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!Intrinsics.areEqual(serialDescriptor0.getElementDescriptor(v1).getSerialName(), ((SerialDescriptor)object0).getElementDescriptor(v1).getSerialName())) {
                return false;
            }
            if(!Intrinsics.areEqual(serialDescriptor0.getElementDescriptor(v1).getKind(), ((SerialDescriptor)object0).getElementDescriptor(v1).getKind())) {
                return false;
            }
        }
        return true;
    }

    public static final int hashCodeImpl(@NotNull SerialDescriptor serialDescriptor0, @NotNull SerialDescriptor[] arr_serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(arr_serialDescriptor, "typeParams");
        int v = serialDescriptor0.getSerialName().hashCode();
        int v1 = Arrays.hashCode(arr_serialDescriptor);
        Iterable iterable0 = SerialDescriptorKt.getElementDescriptors(serialDescriptor0);
        Iterator iterator0 = iterable0.iterator();
        int v2 = 1;
        int v3;
        for(v3 = 1; true; v3 = v3 * 0x1F + v4) {
            int v4 = 0;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            String s = ((SerialDescriptor)object0).getSerialName();
            if(s != null) {
                v4 = s.hashCode();
            }
        }
        for(Object object1: iterable0) {
            SerialKind serialKind0 = ((SerialDescriptor)object1).getKind();
            v2 = v2 * 0x1F + (serialKind0 == null ? 0 : serialKind0.hashCode());
        }
        return ((v * 0x1F + v1) * 0x1F + v3) * 0x1F + v2;
    }
}

