package com.kakao.kandinsky.launcher;

import a5.b;
import e.v;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import r0.a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b/\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIBw\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\b\b\u0002\u0010\n\u001A\u00020\u0007\u0012\b\b\u0002\u0010\u000B\u001A\u00020\u0002\u0012\u0014\b\u0002\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000E\b\u0002\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0011\u0010\u0012B\u0085\u0001\b\u0011\u0012\u0006\u0010\u0013\u001A\u00020\u0004\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0016\u0010\t\u001A\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0014\u0010\f\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u000E\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\u000E\u0018\u00010\r\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014\u00A2\u0006\u0004\b\u0011\u0010\u0016J(\u0010\u001F\u001A\u00020\u001C2\u0006\u0010\u0017\u001A\u00020\u00002\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001B\u001A\u00020\u001AH\u00C1\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010 \u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u001E\u0010$\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010!J\u001C\u0010)\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010%J\u0016\u0010*\u001A\b\u0012\u0004\u0012\u00020\u000E0\rH\u00C6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0010\u0010,\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b,\u0010\'J\u0080\u0001\u0010-\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\b\b\u0002\u0010\n\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\u00022\u0014\b\u0002\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u000E\b\u0002\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\b\b\u0002\u0010\u0010\u001A\u00020\u0007H\u00C6\u0001\u00A2\u0006\u0004\b-\u0010.J\u0010\u0010/\u001A\u00020\u0007H\u00D6\u0001\u00A2\u0006\u0004\b/\u0010\'J\u0010\u00100\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b0\u0010#J\u001A\u00102\u001A\u00020\u00022\b\u00101\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u0010!R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010#R%\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010%R\u0017\u0010\n\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010\'R\u0017\u0010\u000B\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b@\u00105\u001A\u0004\bA\u0010!R#\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006\u00A2\u0006\f\n\u0004\bB\u0010;\u001A\u0004\bC\u0010%R\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r8\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010+R\u0017\u0010\u0010\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\bG\u0010>\u001A\u0004\bH\u0010\'\u00A8\u0006K"}, d2 = {"Lcom/kakao/kandinsky/launcher/KandinskyInput;", "", "", "allowGenerateBitmap", "", "index", "", "", "Lcom/kakao/kandinsky/history/KPhotoKey;", "selectedItems", "defaultSignature", "allowSystemFont", "fontResources", "", "Lcom/kakao/kandinsky/launcher/KandinskyMenu;", "menu", "referrer", "<init>", "(ZILjava/util/Map;Ljava/lang/String;ZLjava/util/Map;Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZILjava/util/Map;Ljava/lang/String;ZLjava/util/Map;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$kandinsky_release", "(Lcom/kakao/kandinsky/launcher/KandinskyInput;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()I", "component3", "()Ljava/util/Map;", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "copy", "(ZILjava/util/Map;Ljava/lang/String;ZLjava/util/Map;Ljava/util/List;Ljava/lang/String;)Lcom/kakao/kandinsky/launcher/KandinskyInput;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getAllowGenerateBitmap", "b", "I", "getIndex", "c", "Ljava/util/Map;", "getSelectedItems", "d", "Ljava/lang/String;", "getDefaultSignature", "e", "getAllowSystemFont", "f", "getFontResources", "g", "Ljava/util/List;", "getMenu", "h", "getReferrer", "Companion", "$serializer", "kandinsky_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class KandinskyInput {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/kandinsky/launcher/KandinskyInput.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/kandinsky/launcher/KandinskyInput;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/kandinsky/launcher/KandinskyInput;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/kandinsky/launcher/KandinskyInput;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kandinsky_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        public static final int $stable;
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer kandinskyInput$$serializer0 = new .serializer();  // 初始化器: Ljava/lang/Object;-><init>()V
            .serializer.INSTANCE = kandinskyInput$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.kandinsky.launcher.KandinskyInput", kandinskyInput$$serializer0, 8);
            pluginGeneratedSerialDescriptor0.addElement("allowGenerateBitmap", true);
            pluginGeneratedSerialDescriptor0.addElement("index", true);
            pluginGeneratedSerialDescriptor0.addElement("selectedItems", true);
            pluginGeneratedSerialDescriptor0.addElement("defaultSignature", true);
            pluginGeneratedSerialDescriptor0.addElement("allowSystemFont", true);
            pluginGeneratedSerialDescriptor0.addElement("fontResources", true);
            pluginGeneratedSerialDescriptor0.addElement("menu", true);
            pluginGeneratedSerialDescriptor0.addElement("referrer", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            KSerializer[] arr_kSerializer = KandinskyInput.i;
            return new KSerializer[]{BooleanSerializer.INSTANCE, IntSerializer.INSTANCE, arr_kSerializer[2], StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, arr_kSerializer[5], arr_kSerializer[6], StringSerializer.INSTANCE};
        }

        public KandinskyInput deserialize(Decoder decoder0) {
            int v2;
            Map map3;
            Map map2;
            int v1;
            boolean z3;
            String s2;
            String s1;
            boolean z2;
            List list0;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = KandinskyInput.i;
            if(compositeDecoder0.decodeSequentially()) {
                boolean z = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 0);
                int v = compositeDecoder0.decodeIntElement(serialDescriptor0, 1);
                Map map0 = (Map)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], null);
                String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                boolean z1 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 4);
                Map map1 = (Map)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], null);
                list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], null);
                z2 = z;
                s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 7);
                s2 = s;
                z3 = z1;
                v1 = 0xFF;
                map2 = map1;
                map3 = map0;
                v2 = v;
            }
            else {
                boolean z4 = false;
                int v3 = 0;
                int v4 = 0;
                List list1 = null;
                Map map4 = null;
                String s3 = null;
                String s4 = null;
                Map map5 = null;
                boolean z5 = false;
                boolean z6 = true;
                while(z6) {
                    int v5 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v5) {
                        case -1: {
                            z6 = false;
                            break;
                        }
                        case 0: {
                            v3 |= 1;
                            z4 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 0);
                            break;
                        }
                        case 1: {
                            v4 = compositeDecoder0.decodeIntElement(serialDescriptor0, 1);
                            v3 |= 2;
                            break;
                        }
                        case 2: {
                            map4 = (Map)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], map4);
                            v3 |= 4;
                            break;
                        }
                        case 3: {
                            s3 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                            v3 |= 8;
                            break;
                        }
                        case 4: {
                            z5 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 4);
                            v3 |= 16;
                            break;
                        }
                        case 5: {
                            map5 = (Map)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], map5);
                            v3 |= 0x20;
                            break;
                        }
                        case 6: {
                            list1 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], list1);
                            v3 |= 0x40;
                            break;
                        }
                        case 7: {
                            s4 = compositeDecoder0.decodeStringElement(serialDescriptor0, 7);
                            v3 |= 0x80;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v5);
                        }
                    }
                }
                z2 = z4;
                list0 = list1;
                map2 = map5;
                z3 = z5;
                v1 = v3;
                v2 = v4;
                map3 = map4;
                s2 = s3;
                s1 = s4;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new KandinskyInput(v1, z2, v2, map3, s2, z3, map2, list0, s1, null);
        }

        @Override  // kotlinx.serialization.DeserializationStrategy
        public Object deserialize(Decoder decoder0) {
            return this.deserialize(decoder0);
        }

        @Override  // kotlinx.serialization.KSerializer
        public SerialDescriptor getDescriptor() {
            return .serializer.a;
        }

        public void serialize(Encoder encoder0, KandinskyInput kandinskyInput0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(kandinskyInput0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            KandinskyInput.write$Self$kandinsky_release(kandinskyInput0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((KandinskyInput)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/kandinsky/launcher/KandinskyInput$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/launcher/KandinskyInput;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kandinsky_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    public static final int $stable;
    public static final Companion Companion;
    public final boolean a;
    public final int b;
    public final Map c;
    public final String d;
    public final boolean e;
    public final Map f;
    public final List g;
    public final String h;
    public static final KSerializer[] i;

    static {
        KandinskyInput.Companion = new Companion(null);
        KandinskyInput.$stable = 8;
        KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(v.a);
        KandinskyInput.i = new KSerializer[]{null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, kSerializer0), null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE), new ArrayListSerializer(KandinskyMenu.Companion.serializer()), null};
    }

    public KandinskyInput() {
        this(false, 0, null, null, false, null, null, null, 0xFF, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public KandinskyInput(int v, boolean z, int v1, Map map0, String s, boolean z1, Map map1, List list0, String s1, SerializationConstructorMarker serializationConstructorMarker0) {
        this.a = (v & 1) == 0 ? false : z;
        this.b = (v & 2) == 0 ? 0 : v1;
        this.c = (v & 4) == 0 ? x.emptyMap() : map0;
        this.d = (v & 8) == 0 ? "" : s;
        this.e = (v & 16) == 0 ? true : z1;
        this.f = (v & 0x20) == 0 ? x.emptyMap() : map1;
        this.g = (v & 0x40) == 0 ? CollectionsKt__CollectionsKt.emptyList() : list0;
        if((v & 0x80) == 0) {
            this.h = "";
            return;
        }
        this.h = s1;
    }

    public KandinskyInput(boolean z, int v, Map map0, String s, boolean z1, Map map1, List list0, String s1) {
        Intrinsics.checkNotNullParameter(map0, "selectedItems");
        Intrinsics.checkNotNullParameter(s, "defaultSignature");
        Intrinsics.checkNotNullParameter(map1, "fontResources");
        Intrinsics.checkNotNullParameter(list0, "menu");
        Intrinsics.checkNotNullParameter(s1, "referrer");
        super();
        this.a = z;
        this.b = v;
        this.c = map0;
        this.d = s;
        this.e = z1;
        this.f = map1;
        this.g = list0;
        this.h = s1;
    }

    public KandinskyInput(boolean z, int v, Map map0, String s, boolean z1, Map map1, List list0, String s1, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        Map map2 = (v1 & 4) == 0 ? map0 : x.emptyMap();
        String s2 = "";
        Map map3 = (v1 & 0x20) == 0 ? map1 : x.emptyMap();
        List list1 = (v1 & 0x40) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList();
        if((v1 & 0x80) == 0) {
            s2 = s1;
        }
        this(((v1 & 1) == 0 ? z : false), ((v1 & 2) == 0 ? v : 0), map2, ((v1 & 8) == 0 ? s : ""), ((v1 & 16) == 0 ? z1 : true), map3, list1, s2);
    }

    public final boolean component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final Map component3() {
        return this.c;
    }

    public final String component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final Map component6() {
        return this.f;
    }

    public final List component7() {
        return this.g;
    }

    public final String component8() {
        return this.h;
    }

    public final KandinskyInput copy(boolean z, int v, Map map0, String s, boolean z1, Map map1, List list0, String s1) {
        Intrinsics.checkNotNullParameter(map0, "selectedItems");
        Intrinsics.checkNotNullParameter(s, "defaultSignature");
        Intrinsics.checkNotNullParameter(map1, "fontResources");
        Intrinsics.checkNotNullParameter(list0, "menu");
        Intrinsics.checkNotNullParameter(s1, "referrer");
        return new KandinskyInput(z, v, map0, s, z1, map1, list0, s1);
    }

    public static KandinskyInput copy$default(KandinskyInput kandinskyInput0, boolean z, int v, Map map0, String s, boolean z1, Map map1, List list0, String s1, int v1, Object object0) {
        boolean z2 = (v1 & 1) == 0 ? z : kandinskyInput0.a;
        int v2 = (v1 & 2) == 0 ? v : kandinskyInput0.b;
        Map map2 = (v1 & 4) == 0 ? map0 : kandinskyInput0.c;
        String s2 = (v1 & 8) == 0 ? s : kandinskyInput0.d;
        boolean z3 = (v1 & 16) == 0 ? z1 : kandinskyInput0.e;
        Map map3 = (v1 & 0x20) == 0 ? map1 : kandinskyInput0.f;
        List list1 = (v1 & 0x40) == 0 ? list0 : kandinskyInput0.g;
        return (v1 & 0x80) == 0 ? kandinskyInput0.copy(z2, v2, map2, s2, z3, map3, list1, s1) : kandinskyInput0.copy(z2, v2, map2, s2, z3, map3, list1, kandinskyInput0.h);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof KandinskyInput)) {
            return false;
        }
        if(this.a != ((KandinskyInput)object0).a) {
            return false;
        }
        if(this.b != ((KandinskyInput)object0).b) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((KandinskyInput)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((KandinskyInput)object0).d)) {
            return false;
        }
        if(this.e != ((KandinskyInput)object0).e) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((KandinskyInput)object0).f)) {
            return false;
        }
        return Intrinsics.areEqual(this.g, ((KandinskyInput)object0).g) ? Intrinsics.areEqual(this.h, ((KandinskyInput)object0).h) : false;
    }

    public final boolean getAllowGenerateBitmap() {
        return this.a;
    }

    public final boolean getAllowSystemFont() {
        return this.e;
    }

    public final String getDefaultSignature() [...] // 潜在的解密器

    public final Map getFontResources() {
        return this.f;
    }

    public final int getIndex() {
        return this.b;
    }

    public final List getMenu() {
        return this.g;
    }

    public final String getReferrer() [...] // 潜在的解密器

    public final Map getSelectedItems() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.h.hashCode() + b.c(this.g, (this.f.hashCode() + a.e(q.c((this.c.hashCode() + a.c(this.b, Boolean.hashCode(this.a) * 0x1F, 0x1F)) * 0x1F, 0x1F, this.d), 0x1F, this.e)) * 0x1F, 0x1F);
    }

    @Override
    public String toString() {
        return "KandinskyInput(allowGenerateBitmap=" + this.a + ", index=" + this.b + ", selectedItems=" + this.c + ", defaultSignature=" + this.d + ", allowSystemFont=" + this.e + ", fontResources=" + this.f + ", menu=" + this.g + ", referrer=" + this.h + ")";
    }

    @JvmStatic
    public static final void write$Self$kandinsky_release(KandinskyInput kandinskyInput0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || kandinskyInput0.a) {
            compositeEncoder0.encodeBooleanElement(serialDescriptor0, 0, kandinskyInput0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || kandinskyInput0.b != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 1, kandinskyInput0.b);
        }
        boolean z = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2);
        KSerializer[] arr_kSerializer = KandinskyInput.i;
        if(z) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], kandinskyInput0.c);
        }
        else {
            Map map0 = x.emptyMap();
            if(!Intrinsics.areEqual(kandinskyInput0.c, map0)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], kandinskyInput0.c);
            }
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || !Intrinsics.areEqual(kandinskyInput0.d, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 3, kandinskyInput0.d);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || !kandinskyInput0.e) {
            compositeEncoder0.encodeBooleanElement(serialDescriptor0, 4, kandinskyInput0.e);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], kandinskyInput0.f);
        }
        else {
            Map map1 = x.emptyMap();
            if(!Intrinsics.areEqual(kandinskyInput0.f, map1)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], kandinskyInput0.f);
            }
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 6) || !Intrinsics.areEqual(kandinskyInput0.g, CollectionsKt__CollectionsKt.emptyList())) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], kandinskyInput0.g);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 7) || !Intrinsics.areEqual(kandinskyInput0.h, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 7, kandinskyInput0.h);
        }
    }
}

