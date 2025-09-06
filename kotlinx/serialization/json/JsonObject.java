package kotlinx.serialization.json;

import ig.c;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\u001E\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u00012\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001(B\u001B\u0012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u000E\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001A\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001AR&\u0010\u001F\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001C0\u001B8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001ER\u001A\u0010!\u001A\b\u0012\u0004\u0012\u00020\u00030\u001B8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b \u0010\u001ER\u0014\u0010#\u001A\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\"\u0010\u0018R\u001A\u0010\'\u001A\b\u0012\u0004\u0012\u00020\u00010$8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/json/JsonElement;", "", "", "content", "<init>", "(Ljava/util/Map;)V", "key", "", "containsKey", "(Ljava/lang/String;)Z", "value", "containsValue", "(Lkotlinx/serialization/json/JsonElement;)Z", "get", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", "keys", "getSize", "size", "", "getValues", "()Ljava/util/Collection;", "values", "Companion", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable(with = JsonObjectSerializer.class)
public final class JsonObject extends JsonElement implements Map, KMappedMarker {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/json/JsonObject$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonObject;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KSerializer serializer() {
            return JsonObjectSerializer.INSTANCE;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Map a;

    static {
        JsonObject.Companion = new Companion(null);
    }

    public JsonObject(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "content");
        super(null);
        this.a = map0;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object compute(Object object0, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public JsonElement compute(String s, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object computeIfAbsent(Object object0, Function function0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public JsonElement computeIfAbsent(String s, Function function0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object computeIfPresent(Object object0, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public JsonElement computeIfPresent(String s, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean containsKey(Object object0) {
        return object0 instanceof String ? this.containsKey(((String)object0)) : false;
    }

    public boolean containsKey(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        return this.a.containsKey(s);
    }

    @Override
    public final boolean containsValue(Object object0) {
        return object0 instanceof JsonElement ? this.containsValue(((JsonElement)object0)) : false;
    }

    public boolean containsValue(@NotNull JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(jsonElement0, "value");
        return this.a.containsValue(jsonElement0);
    }

    @Override
    public final Set entrySet() {
        return this.getEntries();
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return Intrinsics.areEqual(this.a, object0);
    }

    @Override
    public final Object get(Object object0) {
        return !(object0 instanceof String) ? null : this.get(((String)object0));
    }

    public final JsonElement get(Object object0) {
        return object0 instanceof String ? this.get(((String)object0)) : null;
    }

    @Nullable
    public JsonElement get(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        return (JsonElement)this.a.get(s);
    }

    @NotNull
    public Set getEntries() {
        return this.a.entrySet();
    }

    @NotNull
    public Set getKeys() {
        return this.a.keySet();
    }

    public int getSize() {
        return this.a.size();
    }

    @NotNull
    public Collection getValues() {
        return this.a.values();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Set keySet() {
        return this.getKeys();
    }

    @Override
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public JsonElement merge(String s, JsonElement jsonElement0, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object put(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public JsonElement put(String s, JsonElement jsonElement0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void putAll(Map map0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object putIfAbsent(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public JsonElement putIfAbsent(String s, JsonElement jsonElement0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object remove(Object object0) {
        return this.remove(object0);
    }

    public JsonElement remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean remove(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object replace(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public JsonElement replace(String s, JsonElement jsonElement0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean replace(Object object0, Object object1, Object object2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean replace(String s, JsonElement jsonElement0, JsonElement jsonElement1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void replaceAll(BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.a.entrySet(), ",", "{", "}", 0, null, c.y, 24, null);
    }

    @Override
    public final Collection values() {
        return this.getValues();
    }
}

