package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000B\u001A\u00020\n\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00052\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001A\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000B\u0010\fJ;\u0010\u000F\u001A\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00052\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000F\u0010\u0010J2\u0010\u0011\u001A\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00052\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "", "<init>", "()V", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "key", "value", "", "set", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Ljava/lang/Object;)V", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "get", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;)Ljava/lang/Object;", "Key", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSchemaCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n372#2,7:54\n1#3:61\n*S KotlinDebug\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n*L\n25#1:54,7\n*E\n"})
public final class DescriptorSchemaCache {
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "T", "", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Key {
    }

    public final Map a;

    public DescriptorSchemaCache() {
        this.a = CreateMapForCacheKt.createMapForCache(16);
    }

    @Nullable
    public final Object get(@NotNull SerialDescriptor serialDescriptor0, @NotNull Key descriptorSchemaCache$Key0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(descriptorSchemaCache$Key0, "key");
        Map map0 = (Map)this.a.get(serialDescriptor0);
        Object object0 = map0 == null ? null : map0.get(descriptorSchemaCache$Key0);
        return object0 == null ? null : object0;
    }

    @NotNull
    public final Object getOrPut(@NotNull SerialDescriptor serialDescriptor0, @NotNull Key descriptorSchemaCache$Key0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(descriptorSchemaCache$Key0, "key");
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        Object object0 = this.get(serialDescriptor0, descriptorSchemaCache$Key0);
        if(object0 != null) {
            return object0;
        }
        Object object1 = function00.invoke();
        this.set(serialDescriptor0, descriptorSchemaCache$Key0, object1);
        return object1;
    }

    public final void set(@NotNull SerialDescriptor serialDescriptor0, @NotNull Key descriptorSchemaCache$Key0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(descriptorSchemaCache$Key0, "key");
        Intrinsics.checkNotNullParameter(object0, "value");
        Map map0 = this.a;
        Map map1 = map0.get(serialDescriptor0);
        if(map1 == null) {
            map1 = CreateMapForCacheKt.createMapForCache(2);
            map0.put(serialDescriptor0, map1);
        }
        map1.put(descriptorSchemaCache$Key0, object0);
    }
}

