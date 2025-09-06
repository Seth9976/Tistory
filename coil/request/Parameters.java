package coil.request;

import coil.util.-Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0003\'&(B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001A\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\u0006\u0010\t\u001A\u00020\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\f\u001A\u0004\u0018\u00010\u00032\u0006\u0010\t\u001A\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000E\u001A\u0004\u0018\u00010\u00042\u0006\u0010\t\u001A\u00020\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001B\u0010\u0014\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0004\b\u0016\u0010\u0015J\"\u0010\u0018\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001B\u001A\u00020\u00102\b\u0010\u001A\u001A\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001E\u001A\u00020\u001DH\u0016¢\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010 \u001A\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J\r\u0010#\u001A\u00020\"¢\u0006\u0004\b#\u0010$R\u0011\u0010%\u001A\u00020\u001D8G¢\u0006\u0006\u001A\u0004\b%\u0010\u001F¨\u0006)"}, d2 = {"Lcoil/request/Parameters;", "", "Lkotlin/Pair;", "", "Lcoil/request/Parameters$Entry;", "<init>", "()V", "", "T", "key", "value", "(Ljava/lang/String;)Ljava/lang/Object;", "memoryCacheKey", "(Ljava/lang/String;)Ljava/lang/String;", "entry", "(Ljava/lang/String;)Lcoil/request/Parameters$Entry;", "", "isEmpty", "()Z", "", "values", "()Ljava/util/Map;", "memoryCacheKeys", "", "iterator", "()Ljava/util/Iterator;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcoil/request/Parameters$Builder;", "newBuilder", "()Lcoil/request/Parameters$Builder;", "size", "Companion", "Builder", "Entry", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Parameters.kt\ncoil/request/Parameters\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Collections.kt\ncoil/util/-Collections\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,138:1\n453#2:139\n403#2:140\n1238#3,4:141\n72#4,8:145\n125#5:153\n152#5,3:154\n*S KotlinDebug\n*F\n+ 1 Parameters.kt\ncoil/request/Parameters\n*L\n44#1:139\n44#1:140\n44#1:141,4\n53#1:145,8\n59#1:153\n59#1:154,3\n*E\n"})
public final class Parameters implements Iterable, KMappedMarker {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\n\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J-\u0010\u000B\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u00072\b\u0010\t\u001A\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\r\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u000F\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcoil/request/Parameters$Builder;", "", "<init>", "()V", "Lcoil/request/Parameters;", "parameters", "(Lcoil/request/Parameters;)V", "", "key", "value", "memoryCacheKey", "set", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lcoil/request/Parameters$Builder;", "remove", "(Ljava/lang/String;)Lcoil/request/Parameters$Builder;", "build", "()Lcoil/request/Parameters;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Builder {
        public final Map a;

        public Builder() {
            this.a = new LinkedHashMap();
        }

        public Builder(@NotNull Parameters parameters0) {
            this.a = x.toMutableMap(parameters0.a);
        }

        @NotNull
        public final Parameters build() {
            return new Parameters(-Collections.toImmutableMap(this.a), null);
        }

        @NotNull
        public final Builder remove(@NotNull String s) {
            this.a.remove(s);
            return this;
        }

        @JvmOverloads
        @NotNull
        public final Builder set(@NotNull String s, @Nullable Object object0) {
            return Builder.set$default(this, s, object0, null, 4, null);
        }

        @JvmOverloads
        @NotNull
        public final Builder set(@NotNull String s, @Nullable Object object0, @Nullable String s1) {
            Entry parameters$Entry0 = new Entry(object0, s1);
            this.a.put(s, parameters$Entry0);
            return this;
        }

        public static Builder set$default(Builder parameters$Builder0, String s, Object object0, String s1, int v, Object object1) {
            if((v & 4) != 0) {
                if(object0 != null) {
                    return parameters$Builder0.set(s, object0, object0.toString());
                }
                s1 = null;
            }
            return parameters$Builder0.set(s, object0, s1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/request/Parameters$Companion;", "", "Lcoil/request/Parameters;", "EMPTY", "Lcoil/request/Parameters;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001B\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001A\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u000E\u0010\u000FR\u0019\u0010\u0002\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u000F¨\u0006\u0017"}, d2 = {"Lcoil/request/Parameters$Entry;", "", "value", "", "memoryCacheKey", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "b", "Ljava/lang/String;", "getMemoryCacheKey", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Entry {
        public final Object a;
        public final String b;

        public Entry(@Nullable Object object0, @Nullable String s) {
            this.a = object0;
            this.b = s;
        }

        // 去混淆评级： 低(40)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Entry && Intrinsics.areEqual(this.a, ((Entry)object0).a) && Intrinsics.areEqual(this.b, ((Entry)object0).b);
        }

        @Nullable
        public final String getMemoryCacheKey() {
            return this.b;
        }

        @Nullable
        public final Object getValue() {
            return this.a;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            String s = this.b;
            if(s != null) {
                v = s.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Entry(value=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", memoryCacheKey=");
            return a.b(')', this.b, stringBuilder0);
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final Parameters EMPTY;
    public final Map a;

    static {
        Parameters.Companion = new Companion(null);
        Parameters.EMPTY = new Parameters();
    }

    public Parameters() {
        this(x.emptyMap());
    }

    public Parameters(Map map0) {
        this.a = map0;
    }

    public Parameters(Map map0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(map0);
    }

    @Nullable
    public final Entry entry(@NotNull String s) {
        return (Entry)this.a.get(s);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof Parameters && Intrinsics.areEqual(this.a, ((Parameters)object0).a);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    @NotNull
    public Iterator iterator() {
        ArrayList arrayList0 = new ArrayList(this.a.size());
        for(Object object0: this.a.entrySet()) {
            arrayList0.add(TuplesKt.to(((String)((Map.Entry)object0).getKey()), ((Entry)((Map.Entry)object0).getValue())));
        }
        return arrayList0.iterator();
    }

    @Nullable
    public final String memoryCacheKey(@NotNull String s) {
        Entry parameters$Entry0 = (Entry)this.a.get(s);
        return parameters$Entry0 == null ? null : parameters$Entry0.getMemoryCacheKey();
    }

    @NotNull
    public final Map memoryCacheKeys() {
        if(this.isEmpty()) {
            return x.emptyMap();
        }
        Map map0 = new LinkedHashMap();
        for(Object object0: this.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = ((Entry)map$Entry0.getValue()).getMemoryCacheKey();
            if(s != null) {
                map0.put(map$Entry0.getKey(), s);
            }
        }
        return map0;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @JvmName(name = "size")
    public final int size() {
        return this.a.size();
    }

    @Override
    @NotNull
    public String toString() {
        return "Parameters(entries=" + this.a + ')';
    }

    @Nullable
    public final Object value(@NotNull String s) {
        Entry parameters$Entry0 = (Entry)this.a.get(s);
        return parameters$Entry0 == null ? null : parameters$Entry0.getValue();
    }

    @NotNull
    public final Map values() {
        if(this.isEmpty()) {
            return x.emptyMap();
        }
        Map map0 = new LinkedHashMap(w.mapCapacity(this.a.size()));
        for(Object object0: this.a.entrySet()) {
            map0.put(((Map.Entry)object0).getKey(), ((Entry)((Map.Entry)object0).getValue()).getValue());
        }
        return map0;
    }
}

