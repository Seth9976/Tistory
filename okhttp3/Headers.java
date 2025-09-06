package okhttp3;

import androidx.room.a;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.o;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\u0018\u0000 .2\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002/.J\u001A\u0010\u0005\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0086\u0002\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001A\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000B\u001A\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001A\u00020\u0003H\u0007\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u0010\u001A\u00020\rH\u0007\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00020\r\u00A2\u0006\u0004\b\u0004\u0010\u0012J\u0015\u0010\u0013\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00020\r\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00030\u0014\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u001B\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001B\u001A\u00020\u001A\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\"\u0010\u001E\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u001DH\u0096\u0002\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\r\u0010!\u001A\u00020 \u00A2\u0006\u0004\b!\u0010\"J\u001A\u0010&\u001A\u00020%2\b\u0010$\u001A\u0004\u0018\u00010#H\u0096\u0002\u00A2\u0006\u0004\b&\u0010\'J\u000F\u0010(\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b(\u0010\u000FJ\u000F\u0010)\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\b)\u0010*J\u001F\u0010,\u001A\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00170+\u00A2\u0006\u0004\b,\u0010-R\u0011\u0010\u0010\u001A\u00020\r8G\u00A2\u0006\u0006\u001A\u0004\b\u0010\u0010\u000F\u00A8\u00060"}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "name", "get", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Date;", "getDate", "(Ljava/lang/String;)Ljava/util/Date;", "Ljava/time/Instant;", "getInstant", "(Ljava/lang/String;)Ljava/time/Instant;", "", "-deprecated_size", "()I", "size", "index", "(I)Ljava/lang/String;", "value", "", "names", "()Ljava/util/Set;", "", "values", "(Ljava/lang/String;)Ljava/util/List;", "", "byteCount", "()J", "", "iterator", "()Ljava/util/Iterator;", "Lokhttp3/Headers$Builder;", "newBuilder", "()Lokhttp3/Headers$Builder;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "", "toMultimap", "()Ljava/util/Map;", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Headers implements Iterable, KMappedMarker {
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\b\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\t\u0010\u0007J\u001D\u0010\t\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0004\u00A2\u0006\u0004\b\t\u0010\fJ\u001D\u0010\r\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0004\u00A2\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u001D\u0010\t\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0012\u00A2\u0006\u0004\b\t\u0010\u0013J\u001F\u0010\t\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0014H\u0007\u00A2\u0006\u0004\b\t\u0010\u0015J \u0010\u0016\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0012H\u0086\u0002\u00A2\u0006\u0004\b\u0016\u0010\u0013J \u0010\u0016\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0014H\u0087\u0002\u00A2\u0006\u0004\b\u0016\u0010\u0015J\u001F\u0010\b\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u0006\u0010\fJ\u0015\u0010\u0017\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0017\u0010\u0007J \u0010\u0016\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0004H\u0086\u0002\u00A2\u0006\u0004\b\u0016\u0010\fJ\u001A\u0010\u0018\u001A\u0004\u0018\u00010\u00042\u0006\u0010\n\u001A\u00020\u0004H\u0086\u0002\u00A2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001A\u001A\u00020\u000E\u00A2\u0006\u0004\b\u001A\u0010\u001BR \u0010!\u001A\b\u0012\u0004\u0012\u00020\u00040\u001C8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 \u00A8\u0006\""}, d2 = {"Lokhttp3/Headers$Builder;", "", "<init>", "()V", "", "line", "addLenient$okhttp", "(Ljava/lang/String;)Lokhttp3/Headers$Builder;", "addLenient", "add", "name", "value", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "addUnsafeNonAscii", "Lokhttp3/Headers;", "headers", "addAll", "(Lokhttp3/Headers;)Lokhttp3/Headers$Builder;", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)Lokhttp3/Headers$Builder;", "Ljava/time/Instant;", "(Ljava/lang/String;Ljava/time/Instant;)Lokhttp3/Headers$Builder;", "set", "removeAll", "get", "(Ljava/lang/String;)Ljava/lang/String;", "build", "()Lokhttp3/Headers;", "", "a", "Ljava/util/List;", "getNamesAndValues$okhttp", "()Ljava/util/List;", "namesAndValues", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,458:1\n1#2:459\n37#3,2:460\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n*L\n359#1:460,2\n*E\n"})
    public static final class Builder {
        public final ArrayList a;

        public Builder() {
            this.a = new ArrayList(20);
        }

        @NotNull
        public final Builder add(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "line");
            int v = StringsKt__StringsKt.indexOf$default(s, ':', 0, false, 6, null);
            if(v == -1) {
                throw new IllegalArgumentException(("Unexpected header: " + s).toString());
            }
            String s1 = s.substring(0, v);
            Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String…ing(startIndex, endIndex)");
            String s2 = StringsKt__StringsKt.trim(s1).toString();
            String s3 = s.substring(v + 1);
            Intrinsics.checkNotNullExpressionValue(s3, "this as java.lang.String).substring(startIndex)");
            this.add(s2, s3);
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "value");
            Companion.access$checkName(Headers.Companion, s);
            Companion.access$checkValue(Headers.Companion, s1, s);
            this.addLenient$okhttp(s, s1);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder add(@NotNull String s, @NotNull Instant instant0) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(instant0, "value");
            this.add(s, new Date(instant0.toEpochMilli()));
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String s, @NotNull Date date0) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(date0, "value");
            this.add(s, DatesKt.toHttpDateString(date0));
            return this;
        }

        @NotNull
        public final Builder addAll(@NotNull Headers headers0) {
            Intrinsics.checkNotNullParameter(headers0, "headers");
            int v = headers0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                this.addLenient$okhttp(headers0.name(v1), headers0.value(v1));
            }
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "line");
            int v = StringsKt__StringsKt.indexOf$default(s, ':', 1, false, 4, null);
            if(v != -1) {
                String s1 = s.substring(0, v);
                Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                String s2 = s.substring(v + 1);
                Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String).substring(startIndex)");
                this.addLenient$okhttp(s1, s2);
                return this;
            }
            if(s.charAt(0) == 58) {
                String s3 = s.substring(1);
                Intrinsics.checkNotNullExpressionValue(s3, "this as java.lang.String).substring(startIndex)");
                this.addLenient$okhttp("", s3);
                return this;
            }
            this.addLenient$okhttp("", s);
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "value");
            this.a.add(s);
            String s2 = StringsKt__StringsKt.trim(s1).toString();
            this.a.add(s2);
            return this;
        }

        @NotNull
        public final Builder addUnsafeNonAscii(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "value");
            Companion.access$checkName(Headers.Companion, s);
            this.addLenient$okhttp(s, s1);
            return this;
        }

        @NotNull
        public final Headers build() {
            return new Headers(((String[])this.a.toArray(new String[0])), null);
        }

        @Nullable
        public final String get(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            ArrayList arrayList0 = this.a;
            int v = arrayList0.size() - 2;
            int v1 = ProgressionUtilKt.getProgressionLastElement(v, 0, -2);
            if(v1 <= v) {
                while(true) {
                    if(p.equals(s, ((String)arrayList0.get(v)), true)) {
                        return (String)arrayList0.get(v + 1);
                    }
                    if(v == v1) {
                        break;
                    }
                    v -= 2;
                }
            }
            return null;
        }

        @NotNull
        public final List getNamesAndValues$okhttp() {
            return this.a;
        }

        @NotNull
        public final Builder removeAll(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            for(int v = 0; true; v += 2) {
                ArrayList arrayList0 = this.a;
                if(v >= arrayList0.size()) {
                    break;
                }
                if(p.equals(s, ((String)arrayList0.get(v)), true)) {
                    arrayList0.remove(v);
                    arrayList0.remove(v);
                    v -= 2;
                }
            }
            return this;
        }

        @NotNull
        public final Builder set(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "value");
            Companion.access$checkName(Headers.Companion, s);
            Companion.access$checkValue(Headers.Companion, s1, s);
            this.removeAll(s);
            this.addLenient$okhttp(s, s1);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder set(@NotNull String s, @NotNull Instant instant0) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(instant0, "value");
            return this.set(s, new Date(instant0.toEpochMilli()));
        }

        @NotNull
        public final Builder set(@NotNull String s, @NotNull Date date0) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(date0, "value");
            this.set(s, DatesKt.toHttpDateString(date0));
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J#\u0010\b\u001A\u00020\u00052\u0012\u0010\u0004\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u0006\u001A\u00020\u00052\u0012\u0010\u0004\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\u0007J\u001F\u0010\f\u001A\u00020\u0005*\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0004\b\u0006\u0010\u000BJ#\u0010\u0006\u001A\u00020\u00052\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0004\b\t\u0010\u000B¨\u0006\u000E"}, d2 = {"Lokhttp3/Headers$Companion;", "", "", "", "namesAndValues", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "headersOf", "-deprecated_of", "", "(Ljava/util/Map;)Lokhttp3/Headers;", "toHeaders", "headers", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,458:1\n1#2:459\n*E\n"})
    public static final class Companion {
        @Deprecated(level = DeprecationLevel.ERROR, message = "function moved to extension", replaceWith = @ReplaceWith(expression = "headers.toHeaders()", imports = {}))
        @JvmName(name = "-deprecated_of")
        @NotNull
        public final Headers -deprecated_of(@NotNull Map map0) {
            Intrinsics.checkNotNullParameter(map0, "headers");
            return this.of(map0);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "function name changed", replaceWith = @ReplaceWith(expression = "headersOf(*namesAndValues)", imports = {}))
        @JvmName(name = "-deprecated_of")
        @NotNull
        public final Headers -deprecated_of(@NotNull String[] arr_s) {
            Intrinsics.checkNotNullParameter(arr_s, "namesAndValues");
            return this.of(((String[])Arrays.copyOf(arr_s, arr_s.length)));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static void a(String s) {
            if(s.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int v = s.length();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = s.charAt(v1);
                if(33 > v2 || v2 >= 0x7F) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", new Object[]{v2, v1, s}).toString());
                }
            }
        }

        public static final void access$checkName(Companion headers$Companion0, String s) {
            headers$Companion0.getClass();
            Companion.a(s);
        }

        public static final void access$checkValue(Companion headers$Companion0, String s, String s1) {
            headers$Companion0.getClass();
            Companion.b(s, s1);
        }

        public static final String access$get(Companion headers$Companion0, String[] arr_s, String s) {
            headers$Companion0.getClass();
            int v = arr_s.length - 2;
            int v1 = ProgressionUtilKt.getProgressionLastElement(v, 0, -2);
            if(v1 <= v) {
                while(true) {
                    if(p.equals(s, arr_s[v], true)) {
                        return arr_s[v + 1];
                    }
                    if(v == v1) {
                        break;
                    }
                    v -= 2;
                }
            }
            return null;
        }

        public static void b(String s, String s1) {
            int v = s.length();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = s.charAt(v1);
                if(v2 != 9 && (0x20 > v2 || v2 >= 0x7F)) {
                    throw new IllegalArgumentException((Util.format("Unexpected char %#04x at %d in %s value", new Object[]{v2, v1, s1}) + (Util.isSensitiveHeader(s1) ? "" : ": " + s)).toString());
                }
            }
        }

        @JvmName(name = "of")
        @JvmStatic
        @NotNull
        public final Headers of(@NotNull Map map0) {
            Intrinsics.checkNotNullParameter(map0, "<this>");
            String[] arr_s = new String[map0.size() * 2];
            int v = 0;
            for(Object object0: map0.entrySet()) {
                String s = (String)((Map.Entry)object0).getKey();
                String s1 = (String)((Map.Entry)object0).getValue();
                String s2 = StringsKt__StringsKt.trim(s).toString();
                String s3 = StringsKt__StringsKt.trim(s1).toString();
                Companion.a(s2);
                Companion.b(s3, s2);
                arr_s[v] = s2;
                arr_s[v + 1] = s3;
                v += 2;
            }
            return new Headers(arr_s, null);
        }

        @JvmName(name = "of")
        @JvmStatic
        @NotNull
        public final Headers of(@NotNull String[] arr_s) {
            Intrinsics.checkNotNullParameter(arr_s, "namesAndValues");
            if(arr_s.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] arr_s1 = (String[])arr_s.clone();
            for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                String s = arr_s1[v1];
                if(s == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                arr_s1[v1] = StringsKt__StringsKt.trim(s).toString();
            }
            int v2 = ProgressionUtilKt.getProgressionLastElement(0, arr_s1.length - 1, 2);
            if(v2 >= 0) {
                for(int v = 0; true; v += 2) {
                    String s1 = arr_s1[v];
                    String s2 = arr_s1[v + 1];
                    Companion.a(s1);
                    Companion.b(s2, s1);
                    if(v == v2) {
                        break;
                    }
                }
            }
            return new Headers(arr_s1, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final String[] a;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    @JvmName(name = "-deprecated_size")
    public final int -deprecated_size() {
        return this.size();
    }

    static {
        Headers.Companion = new Companion(null);
    }

    public Headers(String[] arr_s, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = arr_s;
    }

    public final long byteCount() {
        String[] arr_s = this.a;
        long v = (long)(arr_s.length * 2);
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            v += (long)arr_s[v1].length();
        }
        return v;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof Headers && Arrays.equals(this.a, ((Headers)object0).a);
    }

    @Nullable
    public final String get(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return Companion.access$get(Headers.Companion, this.a, s);
    }

    @Nullable
    public final Date getDate(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        String s1 = this.get(s);
        return s1 == null ? null : DatesKt.toHttpDateOrNull(s1);
    }

    @IgnoreJRERequirement
    @Nullable
    public final Instant getInstant(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        Date date0 = this.getDate(s);
        return date0 == null ? null : date0.toInstant();
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override
    @NotNull
    public Iterator iterator() {
        int v = this.size();
        Pair[] arr_pair = new Pair[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_pair[v1] = TuplesKt.to(this.name(v1), this.value(v1));
        }
        return ArrayIteratorKt.iterator(arr_pair);
    }

    @NotNull
    public final String name(int v) {
        return this.a[v * 2];
    }

    @NotNull
    public final Set names() {
        TreeSet treeSet0 = new TreeSet(p.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            treeSet0.add(this.name(v1));
        }
        Set set0 = Collections.unmodifiableSet(treeSet0);
        Intrinsics.checkNotNullExpressionValue(set0, "unmodifiableSet(result)");
        return set0;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder headers$Builder0 = new Builder();
        o.addAll(headers$Builder0.getNamesAndValues$okhttp(), this.a);
        return headers$Builder0;
    }

    @JvmName(name = "of")
    @JvmStatic
    @NotNull
    public static final Headers of(@NotNull Map map0) {
        return Headers.Companion.of(map0);
    }

    @JvmName(name = "of")
    @JvmStatic
    @NotNull
    public static final Headers of(@NotNull String[] arr_s) {
        return Headers.Companion.of(arr_s);
    }

    @JvmName(name = "size")
    public final int size() {
        return this.a.length / 2;
    }

    @NotNull
    public final Map toMultimap() {
        Map map0 = new TreeMap(p.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = this.name(v1);
            String s1 = a.k(Locale.US, "US", s, Locale.US, "this as java.lang.String).toLowerCase(locale)");
            List list0 = (List)((TreeMap)map0).get(s1);
            if(list0 == null) {
                list0 = new ArrayList(2);
                map0.put(s1, list0);
            }
            list0.add(this.value(v1));
        }
        return map0;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = this.name(v1);
            String s1 = this.value(v1);
            stringBuilder0.append(s);
            stringBuilder0.append(": ");
            if(Util.isSensitiveHeader(s)) {
                s1 = "██";
            }
            stringBuilder0.append(s1);
            stringBuilder0.append("\n");
        }
        String s2 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s2, "StringBuilder().apply(builderAction).toString()");
        return s2;
    }

    @NotNull
    public final String value(int v) {
        return this.a[v * 2 + 1];
    }

    @NotNull
    public final List values(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        int v = this.size();
        List list0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            if(p.equals(s, this.name(v1), true)) {
                if(list0 == null) {
                    list0 = new ArrayList(2);
                }
                list0.add(this.value(v1));
            }
        }
        if(list0 != null) {
            List list1 = Collections.unmodifiableList(list0);
            Intrinsics.checkNotNullExpressionValue(list1, "{\n      Collections.unmodifiableList(result)\n    }");
            return list1;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }
}

