package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.g;
import androidx.lifecycle.SavedStateHandle;
import g.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0016\u0010\u0007\u001A\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0016\u0010\u0007\u001A\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ#\u0010 \u001A\u00028\u0000\"\u0004\b\u0000\u0010\u001B2\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00000\u001CH\u0000¢\u0006\u0004\b\u001E\u0010\u001FJ#\u0010!\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u001B2\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00000\u001CH\u0016¢\u0006\u0004\b!\u0010\u001FR \u0010)\u001A\u00020\"8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b\'\u0010(\u001A\u0004\b%\u0010&¨\u0006*"}, d2 = {"Landroidx/navigation/serialization/RouteDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "Landroid/os/Bundle;", "bundle", "", "", "Landroidx/navigation/NavType;", "typeMap", "<init>", "(Landroid/os/Bundle;Ljava/util/Map;)V", "Landroidx/lifecycle/SavedStateHandle;", "handle", "(Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "decodeElementIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "", "decodeValue", "()Ljava/lang/Object;", "", "decodeNull", "()Ljava/lang/Void;", "", "decodeNotNullMark", "()Z", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "decodeRouteWithArgs$navigation_common_release", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "decodeRouteWithArgs", "decodeSerializableValue", "Lkotlinx/serialization/modules/SerializersModule;", "b", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule$annotations", "()V", "serializersModule", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RouteDecoder extends AbstractDecoder {
    public final g a;
    public final SerializersModule b;

    public RouteDecoder(@NotNull Bundle bundle0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(bundle0, "bundle");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        super();
        this.b = SerializersModuleKt.getEmptySerializersModule();
        this.a = new g(new a(bundle0, map0));
    }

    public RouteDecoder(@NotNull SavedStateHandle savedStateHandle0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(savedStateHandle0, "handle");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        super();
        this.b = SerializersModuleKt.getEmptySerializersModule();
        this.a = new g(new a(savedStateHandle0, map0));
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull SerialDescriptor serialDescriptor0) {
        String s;
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        g g0 = this.a;
        g0.getClass();
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        int v = g0.a;
        do {
            ++v;
            if(v >= serialDescriptor0.getElementsCount()) {
                return -1;
            }
            s = serialDescriptor0.getElementName(v);
        }
        while(!((b)g0.b).g(s));
        g0.a = v;
        g0.c = s;
        return v;
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder
    public boolean decodeNotNullMark() {
        return ((b)this.a.b).j(((String)this.a.c)) == null ? 0 : 1;
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder
    @Nullable
    public Void decodeNull() {
        return null;
    }

    public final Object decodeRouteWithArgs$navigation_common_release(@NotNull DeserializationStrategy deserializationStrategy0) {
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        return super.decodeSerializableValue(deserializationStrategy0);
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder
    public Object decodeSerializableValue(@NotNull DeserializationStrategy deserializationStrategy0) {
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        return this.a.b();
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder
    @NotNull
    public Object decodeValue() {
        return this.a.b();
    }

    @Override  // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.b;
    }

    public static void getSerializersModule$annotations() {
    }
}

