package androidx.navigation.serialization;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B1\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001A\u0010\t\u001A\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u0006¢\u0006\u0004\b\n\u0010\u000BJ\'\u0010\u000E\u001A\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00062\u0006\u0010\f\u001A\u00020\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ+\u0010\u0012\u001A\u00020\u0011\"\u0004\b\u0001\u0010\u00022\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\f\u001A\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001F\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001B\u001A\u00020\u00112\u0006\u0010\f\u001A\u00020\u0001H\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001D\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u001D\u0010\u001ER\u001A\u0010$\u001A\u00020\u001F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/navigation/serialization/RouteEncoder;", "", "T", "Lkotlinx/serialization/encoding/AbstractEncoder;", "Lkotlinx/serialization/KSerializer;", "serializer", "", "", "Landroidx/navigation/NavType;", "typeMap", "<init>", "(Lkotlinx/serialization/KSerializer;Ljava/util/Map;)V", "value", "", "encodeToArgMap", "(Ljava/lang/Object;)Ljava/util/Map;", "Lkotlinx/serialization/SerializationStrategy;", "", "encodeSerializableValue", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "encodeElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "encodeValue", "(Ljava/lang/Object;)V", "encodeNull", "()V", "Lkotlinx/serialization/modules/SerializersModule;", "c", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RouteEncoder extends AbstractEncoder {
    public final KSerializer a;
    public final Map b;
    public final SerializersModule c;
    public final LinkedHashMap d;
    public int e;

    public RouteEncoder(@NotNull KSerializer kSerializer0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(kSerializer0, "serializer");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        super();
        this.a = kSerializer0;
        this.b = map0;
        this.c = SerializersModuleBuildersKt.EmptySerializersModule();
        this.d = new LinkedHashMap();
        this.e = -1;
    }

    public final void a(Object object0) {
        String s = this.a.getDescriptor().getElementName(this.e);
        NavType navType0 = (NavType)this.b.get(s);
        if(navType0 == null) {
            throw new IllegalStateException(("Cannot find NavType for argument " + s + ". Please provide NavType through typeMap.").toString());
        }
        List list0 = navType0 instanceof CollectionNavType ? ((CollectionNavType)navType0).serializeAsValues(object0) : k.listOf(navType0.serializeAsValue(object0));
        this.d.put(s, list0);
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public boolean encodeElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        this.e = v;
        return true;
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeNull() {
        this.a(null);
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeSerializableValue(@NotNull SerializationStrategy serializationStrategy0, Object object0) {
        Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
        this.a(object0);
    }

    @NotNull
    public final Map encodeToArgMap(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "value");
        super.encodeSerializableValue(this.a, object0);
        return x.toMap(this.d);
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeValue(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "value");
        this.a(object0);
    }

    @Override  // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.c;
    }
}

