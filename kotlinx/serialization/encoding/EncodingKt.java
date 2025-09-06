package kotlinx.serialization.encoding;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A;\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0019\b\u0004\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u001Ab\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u000B*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\f\u0010\f\u001A\b\u0012\u0004\u0012\u0002H\u000B0\r24\b\u0004\u0010\u0007\u001A.\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u000B\u0012\u0004\u0012\u00020\u00010\u000E¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u001A3\u0010\u0012\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0019\b\u0004\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"encodeCollection", "", "Lkotlinx/serialization/encoding/Encoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "collectionSize", "", "block", "Lkotlin/Function1;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlin/ExtensionFunctionType;", "E", "collection", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "index", "encodeStructure", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,507:1\n488#1,2:508\n490#1,2:513\n1864#2,3:510\n*S KotlinDebug\n*F\n+ 1 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n*L\n501#1:508,2\n501#1:513,2\n502#1:510,3\n*E\n"})
public final class EncodingKt {
    public static final void encodeCollection(@NotNull Encoder encoder0, @NotNull SerialDescriptor serialDescriptor0, int v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(encoder0, "<this>");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(function10, "block");
        CompositeEncoder compositeEncoder0 = encoder0.beginCollection(serialDescriptor0, v);
        function10.invoke(compositeEncoder0);
        compositeEncoder0.endStructure(serialDescriptor0);
    }

    public static final void encodeCollection(@NotNull Encoder encoder0, @NotNull SerialDescriptor serialDescriptor0, @NotNull Collection collection0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(encoder0, "<this>");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(collection0, "collection");
        Intrinsics.checkNotNullParameter(function30, "block");
        CompositeEncoder compositeEncoder0 = encoder0.beginCollection(serialDescriptor0, collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            function30.invoke(compositeEncoder0, v, object0);
            ++v;
        }
        compositeEncoder0.endStructure(serialDescriptor0);
    }

    public static final void encodeStructure(@NotNull Encoder encoder0, @NotNull SerialDescriptor serialDescriptor0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(encoder0, "<this>");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(function10, "block");
        CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
        function10.invoke(compositeEncoder0);
        compositeEncoder0.endStructure(serialDescriptor0);
    }
}

