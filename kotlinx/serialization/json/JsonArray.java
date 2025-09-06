package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001-B\u0015\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0001H\u0096\u0003¢\u0006\u0004\b\b\u0010\tJ\u001E\u0010\f\u001A\u00020\u00072\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00010\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001A\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u000EH\u0096\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\u0006\u001A\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001A\u00020\u000E2\u0006\u0010\u0006\u001A\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0016\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00010\u001AH\u0096\u0001¢\u0006\u0004\b\u001B\u0010\u001CJ\u001E\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00010\u001A2\u0006\u0010\u000F\u001A\u00020\u000EH\u0096\u0001¢\u0006\u0004\b\u001B\u0010\u001DJ&\u0010 \u001A\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001E\u001A\u00020\u000E2\u0006\u0010\u001F\u001A\u00020\u000EH\u0096\u0001¢\u0006\u0004\b \u0010!J\u001A\u0010$\u001A\u00020\u00072\b\u0010#\u001A\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000F\u0010&\u001A\u00020\u000EH\u0016¢\u0006\u0004\b&\u0010\'J\u000F\u0010)\u001A\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001A\u00020\u000E8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b+\u0010\'¨\u0006."}, d2 = {"Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonElement;", "", "content", "<init>", "(Ljava/util/List;)V", "element", "", "contains", "(Lkotlinx/serialization/json/JsonElement;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Lkotlinx/serialization/json/JsonElement;", "indexOf", "(Lkotlinx/serialization/json/JsonElement;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getSize", "size", "Companion", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable(with = JsonArraySerializer.class)
public final class JsonArray extends JsonElement implements List, KMappedMarker {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/json/JsonArray$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KSerializer serializer() {
            return JsonArraySerializer.INSTANCE;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final List a;

    static {
        JsonArray.Companion = new Companion(null);
    }

    public JsonArray(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "content");
        super(null);
        this.a = list0;
    }

    @Override
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void add(int v, JsonElement jsonElement0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(JsonElement jsonElement0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof JsonElement ? this.contains(((JsonElement)object0)) : false;
    }

    public boolean contains(@NotNull JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(jsonElement0, "element");
        return this.a.contains(jsonElement0);
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.a.containsAll(collection0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return Intrinsics.areEqual(this.a, object0);
    }

    @Override
    public Object get(int v) {
        return this.get(v);
    }

    @NotNull
    public JsonElement get(int v) {
        return (JsonElement)this.a.get(v);
    }

    public int getSize() {
        return this.a.size();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final int indexOf(Object object0) {
        return object0 instanceof JsonElement ? this.indexOf(((JsonElement)object0)) : -1;
    }

    public int indexOf(@NotNull JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(jsonElement0, "element");
        return this.a.indexOf(jsonElement0);
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return this.a.iterator();
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return object0 instanceof JsonElement ? this.lastIndexOf(((JsonElement)object0)) : -1;
    }

    public int lastIndexOf(@NotNull JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(jsonElement0, "element");
        return this.a.lastIndexOf(jsonElement0);
    }

    @Override
    @NotNull
    public ListIterator listIterator() {
        return this.a.listIterator();
    }

    @Override
    @NotNull
    public ListIterator listIterator(int v) {
        return this.a.listIterator(v);
    }

    @Override
    public Object remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public JsonElement remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void replaceAll(UnaryOperator unaryOperator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public JsonElement set(int v, JsonElement jsonElement0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    public void sort(Comparator comparator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    @NotNull
    public List subList(int v, int v1) {
        return this.a.subList(v, v1);
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "array");
        return CollectionToArray.toArray(this, arr_object);
    }

    @Override
    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.a, ",", "[", "]", 0, null, null, 56, null);
    }
}

