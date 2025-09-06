package com.kakao.kandinsky.core.kdphoto;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.SizeF;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import com.kakao.kandinsky.utils.MatrixValues;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Immutable
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0003QPRBN\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\r\b\u0002\u0010\u0006\u001A\u00070\u0004\u00A2\u0006\u0002\b\u0005\u0012\u000B\u0010\b\u001A\u00070\u0007\u00A2\u0006\u0002\b\u0005\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\r\b\u0002\u0010\r\u001A\u00070\u0007\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0004\b\u000E\u0010\u000FBb\b\u0011\u0012\u0006\u0010\u0010\u001A\u00020\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\r\u0010\u0006\u001A\t\u0018\u00010\u0004\u00A2\u0006\u0002\b\u0005\u0012\r\u0010\b\u001A\t\u0018\u00010\u0007\u00A2\u0006\u0002\b\u0005\u0012\u0006\u0010\n\u001A\u00020\t\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u000B\u0012\r\u0010\r\u001A\t\u0018\u00010\u0007\u00A2\u0006\u0002\b\u0005\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u00A2\u0006\u0004\b\u000E\u0010\u0013J(\u0010\u001C\u001A\u00020\u00192\u0006\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u0017H\u00C1\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001D\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u001B\u0010!\u001A\u00070\u0004\u00A2\u0006\u0002\b\u0005H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u001B\u0010$\u001A\u00070\u0007\u00A2\u0006\u0002\b\u0005H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b%\u0010&J\u0010\u0010\'\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010(J\u001B\u0010*\u001A\u00070\u0007\u00A2\u0006\u0002\b\u0005H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b)\u0010#J^\u0010-\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\r\b\u0002\u0010\u0006\u001A\u00070\u0004\u00A2\u0006\u0002\b\u00052\r\b\u0002\u0010\b\u001A\u00070\u0007\u00A2\u0006\u0002\b\u00052\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\r\b\u0002\u0010\r\u001A\u00070\u0007\u00A2\u0006\u0002\b\u0005H\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\b+\u0010,J\u0010\u0010/\u001A\u00020.H\u00D6\u0001\u00A2\u0006\u0004\b/\u00100J\u0010\u00101\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b1\u0010\u001EJ\u001A\u00105\u001A\u0002042\b\u00103\u001A\u0004\u0018\u000102H\u00D6\u0003\u00A2\u0006\u0004\b5\u00106R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010\u001ER%\u0010\u0006\u001A\u00070\u0004\u00A2\u0006\u0002\b\u00058\u0016X\u0096\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010 R%\u0010\b\u001A\u00070\u0007\u00A2\u0006\u0002\b\u00058\u0016X\u0096\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010#R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010&R\u0017\u0010\f\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\bC\u0010D\u001A\u0004\bE\u0010(R\"\u0010\r\u001A\u00070\u0007\u00A2\u0006\u0002\b\u00058\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bF\u0010>\u001A\u0004\bG\u0010#R\u0011\u0010K\u001A\u00020H8F\u00A2\u0006\u0006\u001A\u0004\bI\u0010JR\u0011\u0010O\u001A\u00020L8F\u00A2\u0006\u0006\u001A\u0004\bM\u0010N\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006S"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "Lcom/kakao/kandinsky/core/kdphoto/Decoration$Absolute;", "", "no", "Lcom/kakao/kandinsky/utils/MatrixValues;", "Lkotlinx/serialization/Contextual;", "matrixValues", "Landroidx/compose/ui/geometry/Size;", "size", "", "intensity", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;", "mosaicType", "blockSizeRatio", "<init>", "(ILkotlinx/collections/immutable/ImmutableList;JFLcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/geometry/Size;FLcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;Landroidx/compose/ui/geometry/Size;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$kdphoto_release", "(Lcom/kakao/kandinsky/core/kdphoto/Mosaic;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2-pp_Gbr8", "()Lkotlinx/collections/immutable/ImmutableList;", "component2", "component3-NH-jbRc", "()J", "component3", "component4", "()F", "component5", "()Lcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;", "component6-NH-jbRc", "component6", "copy-lcW1YYU", "(ILkotlinx/collections/immutable/ImmutableList;JFLcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;J)Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getNo", "b", "Lkotlinx/collections/immutable/ImmutableList;", "getMatrixValues-pp_Gbr8", "c", "J", "getSize-NH-jbRc", "d", "F", "getIntensity", "e", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;", "getMosaicType", "f", "getBlockSizeRatio-NH-jbRc", "Landroid/graphics/RectF;", "getAndroidRect", "()Landroid/graphics/RectF;", "androidRect", "Landroid/util/SizeF;", "getAndroidBlockSizeRatio", "()Landroid/util/SizeF;", "androidBlockSizeRatio", "Companion", "$serializer", "Type", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class Mosaic implements Absolute {
    @StabilityInferred(parameters = 1)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/kandinsky/core/kdphoto/Mosaic.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/kandinsky/core/kdphoto/Mosaic;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        public static final int $stable;
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer mosaic$$serializer0 = new .serializer();  // 初始化器: Ljava/lang/Object;-><init>()V
            .serializer.INSTANCE = mosaic$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.kandinsky.core.kdphoto.Mosaic", mosaic$$serializer0, 6);
            pluginGeneratedSerialDescriptor0.addElement("no", false);
            pluginGeneratedSerialDescriptor0.addElement("matrixValues", true);
            pluginGeneratedSerialDescriptor0.addElement("size", false);
            pluginGeneratedSerialDescriptor0.addElement("intensity", true);
            pluginGeneratedSerialDescriptor0.addElement("mosaicType", true);
            pluginGeneratedSerialDescriptor0.addElement("blockSizeRatio", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer[] arr_kSerializer = Mosaic.g;
            return new KSerializer[]{IntSerializer.INSTANCE, arr_kSerializer[1], arr_kSerializer[2], FloatSerializer.INSTANCE, arr_kSerializer[4], arr_kSerializer[5]};
        }

        @NotNull
        public Mosaic deserialize(@NotNull Decoder decoder0) {
            ImmutableList immutableList0;
            Size size2;
            Type mosaic$Type1;
            int v2;
            float f1;
            int v1;
            Size size1;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = Mosaic.g;
            if(compositeDecoder0.decodeSequentially()) {
                int v = compositeDecoder0.decodeIntElement(serialDescriptor0, 0);
                MatrixValues matrixValues0 = (MatrixValues)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], null);
                Size size0 = (Size)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], null);
                float f = compositeDecoder0.decodeFloatElement(serialDescriptor0, 3);
                Type mosaic$Type0 = (Type)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], null);
                size1 = (Size)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], null);
                v1 = v;
                f1 = f;
                v2 = 0x3F;
                mosaic$Type1 = mosaic$Type0;
                size2 = size0;
                immutableList0 = matrixValues0 == null ? null : matrixValues0.unbox-impl();
            }
            else {
                float f2 = 0.0f;
                int v3 = 0;
                int v4 = 0;
                Size size3 = null;
                Type mosaic$Type2 = null;
                Size size4 = null;
                ImmutableList immutableList1 = null;
                boolean z = true;
                while(z) {
                    int v5 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v5) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            v3 = compositeDecoder0.decodeIntElement(serialDescriptor0, 0);
                            v4 |= 1;
                            break;
                        }
                        case 1: {
                            MatrixValues matrixValues1 = (MatrixValues)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], (immutableList1 == null ? null : MatrixValues.box-impl(immutableList1)));
                            immutableList1 = matrixValues1 == null ? null : matrixValues1.unbox-impl();
                            v4 |= 2;
                            break;
                        }
                        case 2: {
                            size4 = (Size)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], size4);
                            v4 |= 4;
                            break;
                        }
                        case 3: {
                            f2 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 3);
                            v4 |= 8;
                            break;
                        }
                        case 4: {
                            mosaic$Type2 = (Type)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], mosaic$Type2);
                            v4 |= 16;
                            break;
                        }
                        case 5: {
                            size3 = (Size)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], size3);
                            v4 |= 0x20;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v5);
                        }
                    }
                }
                size1 = size3;
                v1 = v3;
                f1 = f2;
                v2 = v4;
                mosaic$Type1 = mosaic$Type2;
                size2 = size4;
                immutableList0 = immutableList1;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new Mosaic(v2, v1, immutableList0, size2, f1, mosaic$Type1, size1, null, null);
        }

        @Override  // kotlinx.serialization.DeserializationStrategy
        public Object deserialize(Decoder decoder0) {
            return this.deserialize(decoder0);
        }

        @Override  // kotlinx.serialization.KSerializer
        @NotNull
        public SerialDescriptor getDescriptor() {
            return .serializer.a;
        }

        public void serialize(@NotNull Encoder encoder0, @NotNull Mosaic mosaic0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(mosaic0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            Mosaic.write$Self$kdphoto_release(mosaic0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((Mosaic)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Mosaic$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;", "", "Circle", "Rectangle", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum Type {
        Circle,
        Rectangle;

        public static final Type[] a;
        public static final EnumEntries b;

        static {
            Type.a = arr_mosaic$Type;
            Intrinsics.checkNotNullParameter(arr_mosaic$Type, "entries");
            Type.b = new a(arr_mosaic$Type);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return Type.b;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int a;
    public final ImmutableList b;
    public final long c;
    public final float d;
    public final Type e;
    public final long f;
    public static final KSerializer[] g;

    static {
        Mosaic.Companion = new Companion(null);
        Mosaic.g = new KSerializer[]{null, new ContextualSerializer(Reflection.getOrCreateKotlinClass(MatrixValues.class), null, new KSerializer[0]), new ContextualSerializer(Reflection.getOrCreateKotlinClass(Size.class), null, new KSerializer[0]), null, EnumsKt.createSimpleEnumSerializer("com.kakao.kandinsky.core.kdphoto.Mosaic.Type", Type.values()), new ContextualSerializer(Reflection.getOrCreateKotlinClass(Size.class), null, new KSerializer[0])};
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public Mosaic(int v, int v1, ImmutableList immutableList0, Size size0, float f, Type mosaic$Type0, Size size1, SerializationConstructorMarker serializationConstructorMarker0, DefaultConstructorMarker defaultConstructorMarker0) {
        if(5 != (v & 5)) {
            PluginExceptionsKt.throwMissingFieldException(v, 5, .serializer.INSTANCE.getDescriptor());
        }
        super();
        this.a = v1;
        this.b = (v & 2) == 0 ? MatrixValues.constructor-impl$default(null, 1, null) : immutableList0;
        this.c = size0.unbox-impl();
        this.d = (v & 8) == 0 ? 1.0f : f;
        this.e = (v & 16) == 0 ? Type.Circle : mosaic$Type0;
        this.f = (v & 0x20) == 0 ? 0L : size1.unbox-impl();
    }

    public Mosaic(int v, ImmutableList immutableList0, long v1, float f, Type mosaic$Type0, long v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, ((v3 & 2) == 0 ? immutableList0 : MatrixValues.constructor-impl$default(null, 1, null)), v1, ((v3 & 8) == 0 ? f : 1.0f), ((v3 & 16) == 0 ? mosaic$Type0 : Type.Circle), ((v3 & 0x20) == 0 ? v2 : 0L), null);
    }

    public Mosaic(int v, ImmutableList immutableList0, long v1, float f, Type mosaic$Type0, long v2, DefaultConstructorMarker defaultConstructorMarker0) {
        Intrinsics.checkNotNullParameter(immutableList0, "matrixValues");
        Intrinsics.checkNotNullParameter(mosaic$Type0, "mosaicType");
        super();
        this.a = v;
        this.b = immutableList0;
        this.c = v1;
        this.d = f;
        this.e = mosaic$Type0;
        this.f = v2;
    }

    public final int component1() {
        return this.a;
    }

    @NotNull
    public final ImmutableList component2-pp_Gbr8() {
        return this.b;
    }

    public final long component3-NH-jbRc() {
        return this.c;
    }

    public final float component4() {
        return this.d;
    }

    @NotNull
    public final Type component5() {
        return this.e;
    }

    public final long component6-NH-jbRc() {
        return this.f;
    }

    @NotNull
    public final Mosaic copy-lcW1YYU(int v, @NotNull ImmutableList immutableList0, long v1, float f, @NotNull Type mosaic$Type0, long v2) {
        Intrinsics.checkNotNullParameter(immutableList0, "matrixValues");
        Intrinsics.checkNotNullParameter(mosaic$Type0, "mosaicType");
        return new Mosaic(v, immutableList0, v1, f, mosaic$Type0, v2, null);
    }

    public static Mosaic copy-lcW1YYU$default(Mosaic mosaic0, int v, ImmutableList immutableList0, long v1, float f, Type mosaic$Type0, long v2, int v3, Object object0) {
        int v4 = (v3 & 1) == 0 ? v : mosaic0.a;
        ImmutableList immutableList1 = (v3 & 2) == 0 ? immutableList0 : mosaic0.b;
        long v5 = (v3 & 4) == 0 ? v1 : mosaic0.c;
        float f1 = (v3 & 8) == 0 ? f : mosaic0.d;
        Type mosaic$Type1 = (v3 & 16) == 0 ? mosaic$Type0 : mosaic0.e;
        return (v3 & 0x20) == 0 ? mosaic0.copy-lcW1YYU(v4, immutableList1, v5, f1, mosaic$Type1, v2) : mosaic0.copy-lcW1YYU(v4, immutableList1, v5, f1, mosaic$Type1, mosaic0.f);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Mosaic)) {
            return false;
        }
        if(this.a != ((Mosaic)object0).a) {
            return false;
        }
        if(!MatrixValues.equals-impl0(this.b, ((Mosaic)object0).b)) {
            return false;
        }
        if(!Size.equals-impl0(this.c, ((Mosaic)object0).c)) {
            return false;
        }
        if(Float.compare(this.d, ((Mosaic)object0).d) != 0) {
            return false;
        }
        return this.e == ((Mosaic)object0).e ? Size.equals-impl0(this.f, ((Mosaic)object0).f) : false;
    }

    @NotNull
    public final SizeF getAndroidBlockSizeRatio() {
        return new SizeF(Size.getWidth-impl(this.f), Size.getHeight-impl(this.f));
    }

    @NotNull
    public final RectF getAndroidRect() {
        return new RectF(-Size.getWidth-impl(this.getSize-NH-jbRc()) / 2.0f, -Size.getHeight-impl(this.getSize-NH-jbRc()) / 2.0f, Size.getWidth-impl(this.getSize-NH-jbRc()) / 2.0f, Size.getHeight-impl(this.getSize-NH-jbRc()) / 2.0f);
    }

    public final long getBlockSizeRatio-NH-jbRc() {
        return this.f;
    }

    public final float getIntensity() {
        return this.d;
    }

    @Override  // com.kakao.kandinsky.core.kdphoto.Decoration$Absolute
    @NotNull
    public Matrix getMatrix() {
        return com.kakao.kandinsky.core.kdphoto.Decoration.Absolute.DefaultImpls.getMatrix(this);
    }

    @Override  // com.kakao.kandinsky.core.kdphoto.Decoration$Absolute
    @NotNull
    public ImmutableList getMatrixValues-pp_Gbr8() {
        return this.b;
    }

    @NotNull
    public final Type getMosaicType() {
        return this.e;
    }

    @Override  // com.kakao.kandinsky.core.kdphoto.Decoration$Absolute
    public int getNo() {
        return this.a;
    }

    @Override  // com.kakao.kandinsky.core.kdphoto.Decoration$Absolute
    public long getSize-NH-jbRc() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return Size.hashCode-impl(this.f) + (this.e.hashCode() + r0.a.b(this.d, (Size.hashCode-impl(this.c) + (MatrixValues.hashCode-impl(this.b) + this.a * 0x1F) * 0x1F) * 0x1F, 0x1F)) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        String s = Size.toString-impl(this.c);
        String s1 = Size.toString-impl(this.f);
        StringBuilder stringBuilder0 = new StringBuilder("Mosaic(no=");
        wb.a.j(stringBuilder0, this.a, ", matrixValues=", "MatrixValues(values=" + this.b + ")", ", size=");
        stringBuilder0.append(s);
        stringBuilder0.append(", intensity=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", mosaicType=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", blockSizeRatio=");
        stringBuilder0.append(s1);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @JvmStatic
    public static final void write$Self$kdphoto_release(Mosaic mosaic0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        compositeEncoder0.encodeIntElement(serialDescriptor0, 0, mosaic0.getNo());
        boolean z = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1);
        KSerializer[] arr_kSerializer = Mosaic.g;
        if(z || !MatrixValues.equals-impl0(mosaic0.getMatrixValues-pp_Gbr8(), MatrixValues.constructor-impl$default(null, 1, null))) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], MatrixValues.box-impl(mosaic0.getMatrixValues-pp_Gbr8()));
        }
        compositeEncoder0.encodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], Size.box-impl(mosaic0.getSize-NH-jbRc()));
        boolean z1 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3);
        float f = mosaic0.d;
        if(z1 || Float.compare(f, 1.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 3, f);
        }
        boolean z2 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4);
        Type mosaic$Type0 = mosaic0.e;
        if(z2 || mosaic$Type0 != Type.Circle) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], mosaic$Type0);
        }
        boolean z3 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5);
        long v = mosaic0.f;
        if(z3 || !Size.equals-impl0(v, 0L)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], Size.box-impl(v));
        }
    }
}

