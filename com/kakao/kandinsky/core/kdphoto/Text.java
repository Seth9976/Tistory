package com.kakao.kandinsky.core.kdphoto;

import android.graphics.Matrix;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import com.kakao.kandinsky.utils.MatrixValues;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Immutable
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0011\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<B3\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\r\b\u0002\u0010\u0006\u001A\u00070\u0004\u00A2\u0006\u0002\b\u0005\u0012\u000B\u0010\b\u001A\u00070\u0007\u00A2\u0006\u0002\b\u0005\u0012\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b\u000B\u0010\fBK\b\u0011\u0012\u0006\u0010\r\u001A\u00020\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\r\u0010\u0006\u001A\t\u0018\u00010\u0004\u00A2\u0006\u0002\b\u0005\u0012\r\u0010\b\u001A\t\u0018\u00010\u0007\u00A2\u0006\u0002\b\u0005\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u00A2\u0006\u0004\b\u000B\u0010\u0010J(\u0010\u0019\u001A\u00020\u00162\u0006\u0010\u0011\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0014H\u00C1\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001A\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u001B\u0010\u001E\u001A\u00070\u0004\u00A2\u0006\u0002\b\u0005H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001B\u0010!\u001A\u00070\u0007\u00A2\u0006\u0002\b\u0005H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010\"\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#JE\u0010&\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\r\b\u0002\u0010\u0006\u001A\u00070\u0004\u00A2\u0006\u0002\b\u00052\r\b\u0002\u0010\b\u001A\u00070\u0007\u00A2\u0006\u0002\b\u00052\b\b\u0002\u0010\n\u001A\u00020\tH\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010(\u001A\u00020\'H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010)J\u0010\u0010*\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b*\u0010\u001BJ\u001A\u0010.\u001A\u00020-2\b\u0010,\u001A\u0004\u0018\u00010+H\u00D6\u0003\u00A2\u0006\u0004\b.\u0010/R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001BR%\u0010\u0006\u001A\u00070\u0004\u00A2\u0006\u0002\b\u00058\u0016X\u0096\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u0010\u001DR%\u0010\b\u001A\u00070\u0007\u00A2\u0006\u0002\b\u00058\u0016X\u0096\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u0010 R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010#\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006>"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Text;", "Lcom/kakao/kandinsky/core/kdphoto/Decoration$Absolute;", "", "no", "Lcom/kakao/kandinsky/utils/MatrixValues;", "Lkotlinx/serialization/Contextual;", "matrixValues", "Landroidx/compose/ui/geometry/Size;", "size", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "textData", "<init>", "(ILkotlinx/collections/immutable/ImmutableList;JLcom/kakao/kandinsky/core/kdphoto/TextData;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/geometry/Size;Lcom/kakao/kandinsky/core/kdphoto/TextData;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$kdphoto_release", "(Lcom/kakao/kandinsky/core/kdphoto/Text;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2-pp_Gbr8", "()Lkotlinx/collections/immutable/ImmutableList;", "component2", "component3-NH-jbRc", "()J", "component3", "component4", "()Lcom/kakao/kandinsky/core/kdphoto/TextData;", "copy-FXPwcMo", "(ILkotlinx/collections/immutable/ImmutableList;JLcom/kakao/kandinsky/core/kdphoto/TextData;)Lcom/kakao/kandinsky/core/kdphoto/Text;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getNo", "b", "Lkotlinx/collections/immutable/ImmutableList;", "getMatrixValues-pp_Gbr8", "c", "J", "getSize-NH-jbRc", "d", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "getTextData", "Companion", "$serializer", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class Text implements Absolute {
    @StabilityInferred(parameters = 1)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/kandinsky/core/kdphoto/Text.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Text;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/kandinsky/core/kdphoto/Text;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/kandinsky/core/kdphoto/Text;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        public static final int $stable;
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer text$$serializer0 = new .serializer();  // 初始化器: Ljava/lang/Object;-><init>()V
            .serializer.INSTANCE = text$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.kandinsky.core.kdphoto.Text", text$$serializer0, 4);
            pluginGeneratedSerialDescriptor0.addElement("no", false);
            pluginGeneratedSerialDescriptor0.addElement("matrixValues", true);
            pluginGeneratedSerialDescriptor0.addElement("size", false);
            pluginGeneratedSerialDescriptor0.addElement("textData", false);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer[] arr_kSerializer = Text.e;
            return new KSerializer[]{IntSerializer.INSTANCE, arr_kSerializer[1], arr_kSerializer[2], com.kakao.kandinsky.core.kdphoto.TextData..serializer.INSTANCE};
        }

        @NotNull
        public Text deserialize(@NotNull Decoder decoder0) {
            ImmutableList immutableList0;
            int v2;
            TextData textData0;
            int v1;
            Size size0;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = Text.e;
            if(compositeDecoder0.decodeSequentially()) {
                int v = compositeDecoder0.decodeIntElement(serialDescriptor0, 0);
                MatrixValues matrixValues0 = (MatrixValues)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], null);
                size0 = (Size)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], null);
                v1 = v;
                textData0 = (TextData)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 3, com.kakao.kandinsky.core.kdphoto.TextData..serializer.INSTANCE, null);
                v2 = 15;
                immutableList0 = matrixValues0 == null ? null : matrixValues0.unbox-impl();
            }
            else {
                int v3 = 0;
                int v4 = 0;
                Size size1 = null;
                TextData textData1 = null;
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
                            size1 = (Size)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], size1);
                            v4 |= 4;
                            break;
                        }
                        case 3: {
                            textData1 = (TextData)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 3, com.kakao.kandinsky.core.kdphoto.TextData..serializer.INSTANCE, textData1);
                            v4 |= 8;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v5);
                        }
                    }
                }
                size0 = size1;
                v1 = v3;
                textData0 = textData1;
                v2 = v4;
                immutableList0 = immutableList1;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new Text(v2, v1, immutableList0, size0, textData0, null, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull Text text0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(text0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            Text.write$Self$kdphoto_release(text0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((Text)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Text$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Text;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int a;
    public final ImmutableList b;
    public final long c;
    public final TextData d;
    public static final KSerializer[] e;

    static {
        Text.Companion = new Companion(null);
        Text.e = new KSerializer[]{null, new ContextualSerializer(Reflection.getOrCreateKotlinClass(MatrixValues.class), null, new KSerializer[0]), new ContextualSerializer(Reflection.getOrCreateKotlinClass(Size.class), null, new KSerializer[0]), null};
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public Text(int v, int v1, ImmutableList immutableList0, Size size0, TextData textData0, SerializationConstructorMarker serializationConstructorMarker0, DefaultConstructorMarker defaultConstructorMarker0) {
        if(13 != (v & 13)) {
            PluginExceptionsKt.throwMissingFieldException(v, 13, .serializer.INSTANCE.getDescriptor());
        }
        super();
        this.a = v1;
        this.b = (v & 2) == 0 ? MatrixValues.constructor-impl$default(null, 1, null) : immutableList0;
        this.c = size0.unbox-impl();
        this.d = textData0;
    }

    public Text(int v, ImmutableList immutableList0, long v1, TextData textData0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 2) != 0) {
            immutableList0 = MatrixValues.constructor-impl$default(null, 1, null);
        }
        this(v, immutableList0, v1, textData0, null);
    }

    public Text(int v, ImmutableList immutableList0, long v1, TextData textData0, DefaultConstructorMarker defaultConstructorMarker0) {
        Intrinsics.checkNotNullParameter(immutableList0, "matrixValues");
        Intrinsics.checkNotNullParameter(textData0, "textData");
        super();
        this.a = v;
        this.b = immutableList0;
        this.c = v1;
        this.d = textData0;
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

    @NotNull
    public final TextData component4() {
        return this.d;
    }

    @NotNull
    public final Text copy-FXPwcMo(int v, @NotNull ImmutableList immutableList0, long v1, @NotNull TextData textData0) {
        Intrinsics.checkNotNullParameter(immutableList0, "matrixValues");
        Intrinsics.checkNotNullParameter(textData0, "textData");
        return new Text(v, immutableList0, v1, textData0, null);
    }

    public static Text copy-FXPwcMo$default(Text text0, int v, ImmutableList immutableList0, long v1, TextData textData0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = text0.a;
        }
        if((v2 & 2) != 0) {
            immutableList0 = text0.b;
        }
        if((v2 & 4) != 0) {
            v1 = text0.c;
        }
        if((v2 & 8) != 0) {
            textData0 = text0.d;
        }
        return text0.copy-FXPwcMo(v, immutableList0, v1, textData0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Text)) {
            return false;
        }
        if(this.a != ((Text)object0).a) {
            return false;
        }
        if(!MatrixValues.equals-impl0(this.b, ((Text)object0).b)) {
            return false;
        }
        return Size.equals-impl0(this.c, ((Text)object0).c) ? Intrinsics.areEqual(this.d, ((Text)object0).d) : false;
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

    @Override  // com.kakao.kandinsky.core.kdphoto.Decoration$Absolute
    public int getNo() {
        return this.a;
    }

    @Override  // com.kakao.kandinsky.core.kdphoto.Decoration$Absolute
    public long getSize-NH-jbRc() {
        return this.c;
    }

    @NotNull
    public final TextData getTextData() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode() + (Size.hashCode-impl(this.c) + (MatrixValues.hashCode-impl(this.b) + this.a * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        String s = Size.toString-impl(this.c);
        StringBuilder stringBuilder0 = new StringBuilder("Text(no=");
        a.j(stringBuilder0, this.a, ", matrixValues=", "MatrixValues(values=" + this.b + ")", ", size=");
        stringBuilder0.append(s);
        stringBuilder0.append(", textData=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @JvmStatic
    public static final void write$Self$kdphoto_release(Text text0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        compositeEncoder0.encodeIntElement(serialDescriptor0, 0, text0.getNo());
        boolean z = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1);
        KSerializer[] arr_kSerializer = Text.e;
        if(z || !MatrixValues.equals-impl0(text0.getMatrixValues-pp_Gbr8(), MatrixValues.constructor-impl$default(null, 1, null))) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], MatrixValues.box-impl(text0.getMatrixValues-pp_Gbr8()));
        }
        compositeEncoder0.encodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], Size.box-impl(text0.getSize-NH-jbRc()));
        compositeEncoder0.encodeSerializableElement(serialDescriptor0, 3, com.kakao.kandinsky.core.kdphoto.TextData..serializer.INSTANCE, text0.d);
    }
}

