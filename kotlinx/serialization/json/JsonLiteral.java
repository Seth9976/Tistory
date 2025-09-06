package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.StringOpsKt;
import kotlinx.serialization.json.internal.SuppressAnimalSniffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000E\b\u0000\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u000E\u001A\u00020\u00042\b\u0010\r\u001A\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0005\u0010\u0015R\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u001A\u0010\u001D\u001A\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\f¨\u0006\u001E"}, d2 = {"Lkotlinx/serialization/json/JsonLiteral;", "Lkotlinx/serialization/json/JsonPrimitive;", "", "body", "", "isString", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "coerceToInlineType", "<init>", "(Ljava/lang/Object;ZLkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "()Z", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getCoerceToInlineType$kotlinx_serialization_json", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Ljava/lang/String;", "getContent", "content", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonLiteral\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,347:1\n1#2:348\n*E\n"})
public final class JsonLiteral extends JsonPrimitive {
    public final boolean a;
    public final SerialDescriptor b;
    public final String c;

    public JsonLiteral(@NotNull Object object0, boolean z, @Nullable SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(object0, "body");
        super(null);
        this.a = z;
        this.b = serialDescriptor0;
        this.c = object0.toString();
        if(serialDescriptor0 != null && !serialDescriptor0.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public JsonLiteral(Object object0, boolean z, SerialDescriptor serialDescriptor0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            serialDescriptor0 = null;
        }
        this(object0, z, serialDescriptor0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return JsonLiteral.class == class0 && this.isString() == ((JsonLiteral)object0).isString() ? Intrinsics.areEqual(this.getContent(), ((JsonLiteral)object0).getContent()) : false;
        }
        return false;
    }

    @Nullable
    public final SerialDescriptor getCoerceToInlineType$kotlinx_serialization_json() {
        return this.b;
    }

    @Override  // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public String getContent() {
        return this.c;
    }

    @Override
    @SuppressAnimalSniffer
    public int hashCode() {
        return this.getContent().hashCode() + Boolean.hashCode(this.isString()) * 0x1F;
    }

    @Override  // kotlinx.serialization.json.JsonPrimitive
    public boolean isString() {
        return this.a;
    }

    @Override  // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public String toString() {
        if(this.isString()) {
            StringBuilder stringBuilder0 = new StringBuilder();
            StringOpsKt.printQuoted(stringBuilder0, this.getContent());
            String s = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
            return s;
        }
        return this.getContent();
    }
}

