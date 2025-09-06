package coil.memory;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.FloatRange;
import coil.util.-Utils;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001AJ\b\u0010\r\u001A\u00020\u000EH&J\u0013\u0010\u000F\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001A\u00020\u0004H¦\u0002J\u0010\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0011\u001A\u00020\u0004H&J\u0019\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00020\u0010H¦\u0002J\u0010\u0010\u0016\u001A\u00020\u000E2\u0006\u0010\u0017\u001A\u00020\bH&R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001A\u00020\bX¦\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0012\u0010\u000B\u001A\u00020\bX¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001BÀ\u0006\u0001"}, d2 = {"Lcoil/memory/MemoryCache;", "", "keys", "", "Lcoil/memory/MemoryCache$Key;", "getKeys", "()Ljava/util/Set;", "maxSize", "", "getMaxSize", "()I", "size", "getSize", "clear", "", "get", "Lcoil/memory/MemoryCache$Value;", "key", "remove", "", "set", "value", "trimMemory", "level", "Builder", "Key", "Value", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface MemoryCache {
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00002\b\b\u0001\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001A\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcoil/memory/MemoryCache$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "percent", "maxSizePercent", "(D)Lcoil/memory/MemoryCache$Builder;", "", "size", "maxSizeBytes", "(I)Lcoil/memory/MemoryCache$Builder;", "", "enable", "strongReferencesEnabled", "(Z)Lcoil/memory/MemoryCache$Builder;", "weakReferencesEnabled", "Lcoil/memory/MemoryCache;", "build", "()Lcoil/memory/MemoryCache;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
    public static final class Builder {
        public final Context a;
        public double b;
        public int c;
        public boolean d;
        public boolean e;

        public Builder(@NotNull Context context0) {
            this.a = context0;
            this.b = -Utils.defaultMemoryCacheSizePercent(context0);
            this.d = true;
            this.e = true;
        }

        @NotNull
        public final MemoryCache build() {
            RealWeakMemoryCache realWeakMemoryCache0 = this.e ? new RealWeakMemoryCache() : new EmptyWeakMemoryCache();
            if(this.d) {
                int v = this.b > 0.0 ? -Utils.calculateMemoryCacheSize(this.a, this.b) : this.c;
                return v <= 0 ? new RealMemoryCache(new EmptyStrongMemoryCache(realWeakMemoryCache0), realWeakMemoryCache0) : new RealMemoryCache(new RealStrongMemoryCache(v, realWeakMemoryCache0), realWeakMemoryCache0);
            }
            return new RealMemoryCache(new EmptyStrongMemoryCache(realWeakMemoryCache0), realWeakMemoryCache0);
        }

        @NotNull
        public final Builder maxSizeBytes(int v) {
            if(v < 0) {
                throw new IllegalArgumentException("size must be >= 0.");
            }
            this.b = 0.0;
            this.c = v;
            return this;
        }

        @NotNull
        public final Builder maxSizePercent(@FloatRange(from = 0.0, to = 1.0) double f) {
            if(0.0 > f || f > 1.0) {
                throw new IllegalArgumentException("size must be in the range [0.0, 1.0].");
            }
            this.c = 0;
            this.b = f;
            return this;
        }

        @NotNull
        public final Builder strongReferencesEnabled(boolean z) {
            this.d = z;
            return this;
        }

        @NotNull
        public final Builder weakReferencesEnabled(boolean z) {
            this.e = z;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0014\b\u0002\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001F\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u0013R#\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcelable;", "", "key", "", "extras", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcoil/memory/MemoryCache$Key;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getKey", "b", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Key\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,216:1\n215#2,2:217\n*S KotlinDebug\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Key\n*L\n86#1:217,2\n*E\n"})
    public static final class Key implements Parcelable {
        @Deprecated
        @JvmField
        @NotNull
        public static final Parcelable.Creator CREATOR;
        public final String a;
        public final Map b;

        static {
            Key.CREATOR = new MemoryCache.Key.Companion.CREATOR.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public Key(@NotNull String s, @NotNull Map map0) {
            this.a = s;
            this.b = map0;
        }

        public Key(String s, Map map0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                map0 = x.emptyMap();
            }
            this(s, map0);
        }

        @NotNull
        public final Key copy(@NotNull String s, @NotNull Map map0) {
            return new Key(s, map0);
        }

        public static Key copy$default(Key memoryCache$Key0, String s, Map map0, int v, Object object0) {
            if((v & 1) != 0) {
                s = memoryCache$Key0.a;
            }
            if((v & 2) != 0) {
                map0 = memoryCache$Key0.b;
            }
            return memoryCache$Key0.copy(s, map0);
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        // 去混淆评级： 低(40)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Key && Intrinsics.areEqual(this.a, ((Key)object0).a) && Intrinsics.areEqual(this.b, ((Key)object0).b);
        }

        @NotNull
        public final Map getExtras() {
            return this.b;
        }

        @NotNull
        public final String getKey() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "Key(key=" + this.a + ", extras=" + this.b + ')';
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel0, int v) {
            parcel0.writeString(this.a);
            parcel0.writeInt(this.b.size());
            for(Object object0: this.b.entrySet()) {
                String s = (String)((Map.Entry)object0).getKey();
                String s1 = (String)((Map.Entry)object0).getValue();
                parcel0.writeString(s);
                parcel0.writeString(s1);
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\t\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R#\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Lcoil/memory/MemoryCache$Value;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "", "extras", "<init>", "(Landroid/graphics/Bitmap;Ljava/util/Map;)V", "copy", "(Landroid/graphics/Bitmap;Ljava/util/Map;)Lcoil/memory/MemoryCache$Value;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "b", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Value {
        public final Bitmap a;
        public final Map b;

        public Value(@NotNull Bitmap bitmap0, @NotNull Map map0) {
            this.a = bitmap0;
            this.b = map0;
        }

        public Value(Bitmap bitmap0, Map map0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                map0 = x.emptyMap();
            }
            this(bitmap0, map0);
        }

        @NotNull
        public final Value copy(@NotNull Bitmap bitmap0, @NotNull Map map0) {
            return new Value(bitmap0, map0);
        }

        public static Value copy$default(Value memoryCache$Value0, Bitmap bitmap0, Map map0, int v, Object object0) {
            if((v & 1) != 0) {
                bitmap0 = memoryCache$Value0.a;
            }
            if((v & 2) != 0) {
                map0 = memoryCache$Value0.b;
            }
            return memoryCache$Value0.copy(bitmap0, map0);
        }

        // 去混淆评级： 低(40)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Value && Intrinsics.areEqual(this.a, ((Value)object0).a) && Intrinsics.areEqual(this.b, ((Value)object0).b);
        }

        @NotNull
        public final Bitmap getBitmap() {
            return this.a;
        }

        @NotNull
        public final Map getExtras() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "Value(bitmap=" + this.a + ", extras=" + this.b + ')';
        }
    }

    void clear();

    @Nullable
    Value get(@NotNull Key arg1);

    @NotNull
    Set getKeys();

    int getMaxSize();

    int getSize();

    boolean remove(@NotNull Key arg1);

    void set(@NotNull Key arg1, @NotNull Value arg2);

    void trimMemory(int arg1);
}

