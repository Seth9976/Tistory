package coil.request;

import coil.util.-Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\u001E\u0010\u0003\u001A\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u0003\u001A\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000E\u0010\u0006\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u001D\u0010\t\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcoil/request/Tags;", "", "T", "tag", "()Ljava/lang/Object;", "Ljava/lang/Class;", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "", "asMap", "()Ljava/util/Map;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Tags {
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\'\u0010\u0006\u001A\u00020\u00052\u0016\u0010\u0004\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcoil/request/Tags$Companion;", "", "", "Ljava/lang/Class;", "tags", "Lcoil/request/Tags;", "from", "(Ljava/util/Map;)Lcoil/request/Tags;", "EMPTY", "Lcoil/request/Tags;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final Tags from(@NotNull Map map0) {
            return new Tags(-Collections.toImmutableMap(map0), null);
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final Tags EMPTY;
    public final Map a;

    static {
        Tags.Companion = new Companion(null);
        Tags.EMPTY = new Tags(x.emptyMap());
    }

    public Tags(Map map0) {
        this.a = map0;
    }

    public Tags(Map map0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(map0);
    }

    @NotNull
    public final Map asMap() {
        return this.a;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof Tags && Intrinsics.areEqual(this.a, ((Tags)object0).a);
    }

    @JvmStatic
    @NotNull
    public static final Tags from(@NotNull Map map0) {
        return Tags.Companion.from(map0);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public final Object tag() {
        Intrinsics.reifiedOperationMarker(4, "T");
        return this.tag(Object.class);
    }

    @Nullable
    public final Object tag(@NotNull Class class0) {
        return class0.cast(this.a.get(class0));
    }

    @Override
    @NotNull
    public String toString() {
        return "Tags(tags=" + this.a + ')';
    }
}

