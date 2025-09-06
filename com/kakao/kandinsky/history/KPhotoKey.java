package com.kakao.kandinsky.history;

import e.v;
import e.w;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001A\u00020\b\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001A\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001C\u0010\u0017J\u0010\u0010\u001D\u001A\u00020\bHÖ\u0001¢\u0006\u0004\b\u001D\u0010\u001EJ\u001A\u0010!\u001A\u00020 2\b\u0010\u001F\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lcom/kakao/kandinsky/history/KPhotoKey;", "", "", "uri", "", "id", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$kandinsky_release", "(Lcom/kakao/kandinsky/history/KPhotoKey;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/kakao/kandinsky/history/KPhotoKey;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUri", "b", "Ljava/lang/Long;", "getId", "Companion", "e/v", "e/w", "kandinsky_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final class KPhotoKey {
    public static final int $stable;
    public static final w Companion;
    public final String a;
    public final Long b;

    static {
        KPhotoKey.Companion = new w();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public KPhotoKey(int v, String s, Long long0, SerializationConstructorMarker serializationConstructorMarker0) {
        if(3 != (v & 3)) {
            PluginExceptionsKt.throwMissingFieldException(v, 3, v.a.getDescriptor());
        }
        super();
        this.a = s;
        this.b = long0;
    }

    public KPhotoKey(String s, Long long0) {
        Intrinsics.checkNotNullParameter(s, "uri");
        super();
        this.a = s;
        this.b = long0;
    }

    public final String component1() {
        return this.a;
    }

    public final Long component2() {
        return this.b;
    }

    public final KPhotoKey copy(String s, Long long0) {
        Intrinsics.checkNotNullParameter(s, "uri");
        return new KPhotoKey(s, long0);
    }

    public static KPhotoKey copy$default(KPhotoKey kPhotoKey0, String s, Long long0, int v, Object object0) {
        if((v & 1) != 0) {
            s = kPhotoKey0.a;
        }
        if((v & 2) != 0) {
            long0 = kPhotoKey0.b;
        }
        return kPhotoKey0.copy(s, long0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof KPhotoKey)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((KPhotoKey)object0).a) ? Intrinsics.areEqual(this.b, ((KPhotoKey)object0).b) : false;
    }

    public final Long getId() {
        return this.b;
    }

    public final String getUri() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public String toString() {
        return "KPhotoKey(uri=" + this.a + ", id=" + this.b + ")";
    }

    @JvmStatic
    public static final void write$Self$kandinsky_release(KPhotoKey kPhotoKey0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        compositeEncoder0.encodeStringElement(serialDescriptor0, 0, kPhotoKey0.a);
        compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 1, LongSerializer.INSTANCE, kPhotoKey0.b);
    }
}

