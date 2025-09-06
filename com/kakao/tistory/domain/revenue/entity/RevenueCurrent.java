package com.kakao.tistory.domain.revenue.entity;

import com.kakao.tistory.domain.blog.entity.b;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0014\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B1\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u00A2\u0006\u0004\b\n\u0010\u000BBM\b\u0011\u0012\u0006\u0010\r\u001A\u00020\f\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u00A2\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001A\u00020\u00162\u0006\u0010\u0011\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0014H\u00C1\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001A\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001BJ\u0010\u0010\u001D\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001BJ\u0012\u0010 \u001A\u0004\u0018\u00010\bH\u00C6\u0003\u00A2\u0006\u0004\b \u0010!JD\u0010\"\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00022\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\bH\u00C6\u0001\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b$\u0010\u001BJ\u0010\u0010%\u001A\u00020\fH\u00D6\u0001\u00A2\u0006\u0004\b%\u0010&J\u001A\u0010)\u001A\u00020(2\b\u0010\'\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010\u001BR\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b.\u0010,\u001A\u0004\b/\u0010\u001BR\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001ER\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b3\u0010,\u001A\u0004\b4\u0010\u001BR\u0019\u0010\t\u001A\u0004\u0018\u00010\b8\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010!R\u0011\u00108\u001A\u00020(8F\u00A2\u0006\u0006\u001A\u0004\b8\u00109\u00A8\u0006<"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/RevenueCurrent;", "", "", "vendor", "label", "Lcom/kakao/tistory/domain/revenue/entity/VendorStatus;", "status", "currency", "", "earnings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/revenue/entity/VendorStatus;Ljava/lang/String;Ljava/lang/Double;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/revenue/entity/VendorStatus;Ljava/lang/String;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/revenue/entity/RevenueCurrent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/kakao/tistory/domain/revenue/entity/VendorStatus;", "component4", "component5", "()Ljava/lang/Double;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/revenue/entity/VendorStatus;Ljava/lang/String;Ljava/lang/Double;)Lcom/kakao/tistory/domain/revenue/entity/RevenueCurrent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getVendor", "b", "getLabel", "c", "Lcom/kakao/tistory/domain/revenue/entity/VendorStatus;", "getStatus", "d", "getCurrency", "e", "Ljava/lang/Double;", "getEarnings", "isConnected", "()Z", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class RevenueCurrent {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/revenue/entity/RevenueCurrent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueCurrent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/revenue/entity/RevenueCurrent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/revenue/entity/RevenueCurrent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer revenueCurrent$$serializer0 = new .serializer();
            .serializer.INSTANCE = revenueCurrent$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.revenue.entity.RevenueCurrent", revenueCurrent$$serializer0, 5);
            pluginGeneratedSerialDescriptor0.addElement("vendor", false);
            pluginGeneratedSerialDescriptor0.addElement("label", false);
            pluginGeneratedSerialDescriptor0.addElement("status", false);
            pluginGeneratedSerialDescriptor0.addElement("currency", false);
            pluginGeneratedSerialDescriptor0.addElement("earnings", false);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer kSerializer0 = RevenueCurrent.f[2];
            KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(DoubleSerializer.INSTANCE);
            return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializer0, StringSerializer.INSTANCE, kSerializer1};
        }

        @NotNull
        public RevenueCurrent deserialize(@NotNull Decoder decoder0) {
            String s5;
            int v;
            Double double0;
            String s4;
            String s3;
            VendorStatus vendorStatus0;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = RevenueCurrent.f;
            String s = null;
            if(compositeDecoder0.decodeSequentially()) {
                String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                vendorStatus0 = (VendorStatus)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], null);
                s3 = s1;
                s4 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                double0 = (Double)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 4, DoubleSerializer.INSTANCE, null);
                v = 0x1F;
                s5 = s2;
            }
            else {
                int v1 = 0;
                String s6 = null;
                VendorStatus vendorStatus1 = null;
                String s7 = null;
                Double double1 = null;
                boolean z = true;
                while(z) {
                    int v2 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            s6 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            vendorStatus1 = (VendorStatus)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], vendorStatus1);
                            v1 |= 4;
                            break;
                        }
                        case 3: {
                            s7 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                            v1 |= 8;
                            break;
                        }
                        case 4: {
                            double1 = (Double)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 4, DoubleSerializer.INSTANCE, double1);
                            v1 |= 16;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v2);
                        }
                    }
                }
                v = v1;
                s3 = s;
                s5 = s6;
                vendorStatus0 = vendorStatus1;
                s4 = s7;
                double0 = double1;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new RevenueCurrent(v, s3, s5, vendorStatus0, s4, double0, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull RevenueCurrent revenueCurrent0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(revenueCurrent0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            RevenueCurrent.write$Self$domain_release(revenueCurrent0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((RevenueCurrent)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/RevenueCurrent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueCurrent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final String a;
    public final String b;
    public final VendorStatus c;
    public final String d;
    public final Double e;
    public static final KSerializer[] f;

    static {
        RevenueCurrent.Companion = new Companion(null);
        RevenueCurrent.f = new KSerializer[]{null, null, EnumsKt.createSimpleEnumSerializer("com.kakao.tistory.domain.revenue.entity.VendorStatus", VendorStatus.values()), null, null};
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public RevenueCurrent(int v, String s, String s1, VendorStatus vendorStatus0, String s2, Double double0, SerializationConstructorMarker serializationConstructorMarker0) {
        if(0x1F != (v & 0x1F)) {
            PluginExceptionsKt.throwMissingFieldException(v, 0x1F, .serializer.INSTANCE.getDescriptor());
        }
        super();
        this.a = s;
        this.b = s1;
        this.c = vendorStatus0;
        this.d = s2;
        this.e = double0;
    }

    public RevenueCurrent(@NotNull String s, @NotNull String s1, @NotNull VendorStatus vendorStatus0, @NotNull String s2, @Nullable Double double0) {
        Intrinsics.checkNotNullParameter(s, "vendor");
        Intrinsics.checkNotNullParameter(s1, "label");
        Intrinsics.checkNotNullParameter(vendorStatus0, "status");
        Intrinsics.checkNotNullParameter(s2, "currency");
        super();
        this.a = s;
        this.b = s1;
        this.c = vendorStatus0;
        this.d = s2;
        this.e = double0;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final VendorStatus component3() {
        return this.c;
    }

    @NotNull
    public final String component4() {
        return this.d;
    }

    @Nullable
    public final Double component5() {
        return this.e;
    }

    @NotNull
    public final RevenueCurrent copy(@NotNull String s, @NotNull String s1, @NotNull VendorStatus vendorStatus0, @NotNull String s2, @Nullable Double double0) {
        Intrinsics.checkNotNullParameter(s, "vendor");
        Intrinsics.checkNotNullParameter(s1, "label");
        Intrinsics.checkNotNullParameter(vendorStatus0, "status");
        Intrinsics.checkNotNullParameter(s2, "currency");
        return new RevenueCurrent(s, s1, vendorStatus0, s2, double0);
    }

    public static RevenueCurrent copy$default(RevenueCurrent revenueCurrent0, String s, String s1, VendorStatus vendorStatus0, String s2, Double double0, int v, Object object0) {
        if((v & 1) != 0) {
            s = revenueCurrent0.a;
        }
        if((v & 2) != 0) {
            s1 = revenueCurrent0.b;
        }
        if((v & 4) != 0) {
            vendorStatus0 = revenueCurrent0.c;
        }
        if((v & 8) != 0) {
            s2 = revenueCurrent0.d;
        }
        if((v & 16) != 0) {
            double0 = revenueCurrent0.e;
        }
        return revenueCurrent0.copy(s, s1, vendorStatus0, s2, double0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RevenueCurrent)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((RevenueCurrent)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((RevenueCurrent)object0).b)) {
            return false;
        }
        if(this.c != ((RevenueCurrent)object0).c) {
            return false;
        }
        return Intrinsics.areEqual(this.d, ((RevenueCurrent)object0).d) ? Intrinsics.areEqual(this.e, ((RevenueCurrent)object0).e) : false;
    }

    @NotNull
    public final String getCurrency() {
        return this.d;
    }

    @Nullable
    public final Double getEarnings() {
        return this.e;
    }

    @NotNull
    public final String getLabel() {
        return this.b;
    }

    @NotNull
    public final VendorStatus getStatus() {
        return this.c;
    }

    @NotNull
    public final String getVendor() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = b.a(this.d, (this.c.hashCode() + b.a(this.b, this.a.hashCode() * 0x1F, 0x1F)) * 0x1F, 0x1F);
        return this.e == null ? v : v + this.e.hashCode();
    }

    public final boolean isConnected() {
        return this.c == VendorStatus.CONNECTED;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = a5.b.w("RevenueCurrent(vendor=", this.a, ", label=", this.b, ", status=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", currency=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", earnings=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @JvmStatic
    public static final void write$Self$domain_release(RevenueCurrent revenueCurrent0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        compositeEncoder0.encodeStringElement(serialDescriptor0, 0, revenueCurrent0.a);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 1, revenueCurrent0.b);
        compositeEncoder0.encodeSerializableElement(serialDescriptor0, 2, RevenueCurrent.f[2], revenueCurrent0.c);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 3, revenueCurrent0.d);
        compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 4, DoubleSerializer.INSTANCE, revenueCurrent0.e);
    }
}

