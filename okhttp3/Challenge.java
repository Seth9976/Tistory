package okhttp3;

import androidx.room.a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.x;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0014\u0010\u0005\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u0015\u0010\f\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0005\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\b\u001A\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u000FJ\u000F\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u001A\u001A\u00020\u0019H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001C\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u001C\u0010\u000FR\u0017\u0010\u0003\u001A\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u0003\u0010\u000FR%\u0010\u0005\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u00048G¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b\u0005\u0010\u0011R\u0013\u0010\b\u001A\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001A\u0004\b\b\u0010\u000FR\u0011\u0010\u000B\u001A\u00020\n8G¢\u0006\u0006\u001A\u0004\b\u000B\u0010\u0014¨\u0006!"}, d2 = {"Lokhttp3/Challenge;", "", "", "scheme", "", "authParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "realm", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/nio/charset/Charset;", "charset", "withCharset", "(Ljava/nio/charset/Charset;)Lokhttp3/Challenge;", "-deprecated_scheme", "()Ljava/lang/String;", "-deprecated_authParams", "()Ljava/util/Map;", "-deprecated_realm", "-deprecated_charset", "()Ljava/nio/charset/Charset;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "a", "Ljava/lang/String;", "b", "Ljava/util/Map;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Challenge {
    public final String a;
    public final Map b;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "authParams", imports = {}))
    @JvmName(name = "-deprecated_authParams")
    @NotNull
    public final Map -deprecated_authParams() {
        return this.b;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "charset", imports = {}))
    @JvmName(name = "-deprecated_charset")
    @NotNull
    public final Charset -deprecated_charset() {
        return this.charset();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "realm", imports = {}))
    @JvmName(name = "-deprecated_realm")
    @Nullable
    public final String -deprecated_realm() {
        return this.realm();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "scheme", imports = {}))
    @JvmName(name = "-deprecated_scheme")
    @NotNull
    public final String -deprecated_scheme() {
        return this.a;
    }

    public Challenge(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "scheme");
        Intrinsics.checkNotNullParameter(s1, "realm");
        Map map0 = Collections.singletonMap("realm", s1);
        Intrinsics.checkNotNullExpressionValue(map0, "singletonMap(\"realm\", realm)");
        this(s, map0);
    }

    public Challenge(@NotNull String s, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(s, "scheme");
        Intrinsics.checkNotNullParameter(map0, "authParams");
        super();
        this.a = s;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            String s1 = (String)((Map.Entry)object0).getKey();
            String s2 = (String)((Map.Entry)object0).getValue();
            linkedHashMap0.put((s1 == null ? null : a.k(Locale.US, "US", s1, Locale.US, "this as java.lang.String).toLowerCase(locale)")), s2);
        }
        Map map1 = Collections.unmodifiableMap(linkedHashMap0);
        Intrinsics.checkNotNullExpressionValue(map1, "unmodifiableMap<String?, String>(newAuthParams)");
        this.b = map1;
    }

    @JvmName(name = "authParams")
    @NotNull
    public final Map authParams() {
        return this.b;
    }

    @JvmName(name = "charset")
    @NotNull
    public final Charset charset() {
        String s = (String)this.b.get("charset");
        if(s != null) {
            try {
                Charset charset0 = Charset.forName(s);
                Intrinsics.checkNotNullExpressionValue(charset0, "forName(charset)");
                return charset0;
            }
            catch(Exception unused_ex) {
            }
        }
        Charset charset1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(charset1, "ISO_8859_1");
        return charset1;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof Challenge && Intrinsics.areEqual(((Challenge)object0).a, this.a) && Intrinsics.areEqual(((Challenge)object0).b, this.b);
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + q.c(899, 0x1F, this.a);
    }

    @JvmName(name = "realm")
    @Nullable
    public final String realm() {
        return (String)this.b.get("realm");
    }

    @JvmName(name = "scheme")
    @NotNull
    public final String scheme() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        return this.a + " authParams=" + this.b;
    }

    @NotNull
    public final Challenge withCharset(@NotNull Charset charset0) {
        Intrinsics.checkNotNullParameter(charset0, "charset");
        Map map0 = x.toMutableMap(this.b);
        String s = charset0.name();
        Intrinsics.checkNotNullExpressionValue(s, "charset.name()");
        map0.put("charset", s);
        return new Challenge(this.a, map0);
    }
}

