package androidx.navigation;

import a5.b;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.collections.x;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import kotlinx.serialization.SerializersKt;
import md.c;
import n4.h;
import n4.i;
import n4.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001C\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003:;<B\'\b\u0000\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\b\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0006\u0010\tJ\u0017\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\u0010\u001A\u00020\u000FH\u0000\u00A2\u0006\u0004\b\f\u0010\u0011J\u0017\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0005\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001A\u001A\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001A\u00020\n2\u0014\u0010\u0018\u001A\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0007\u00A2\u0006\u0004\b\u001A\u0010\u001BJ/\u0010\u001D\u001A\u00020\u00192\b\u0010\u0015\u001A\u0004\u0018\u00010\n2\u0014\u0010\u0018\u001A\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001BJ\u0019\u0010!\u001A\u00020\u00122\b\u0010\u001E\u001A\u0004\u0018\u00010\nH\u0000\u00A2\u0006\u0004\b\u001F\u0010 J\u001A\u0010#\u001A\u00020\u000B2\b\u0010\"\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b#\u0010$J\u000F\u0010%\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*R\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b+\u0010(\u001A\u0004\b,\u0010*R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b-\u0010(\u001A\u0004\b.\u0010*R*\u00102\u001A\u00020\u000B2\u0006\u0010/\u001A\u00020\u000B8G@@X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b0\u00101\u001A\u0004\b2\u00103\"\u0004\b4\u00105R\u001A\u00109\u001A\b\u0012\u0004\u0012\u00020\u0002068@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b7\u00108\u00A8\u0006="}, d2 = {"Landroidx/navigation/NavDeepLink;", "", "", "uriPattern", "action", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "uri", "(Ljava/lang/String;)V", "Landroid/net/Uri;", "", "matches$navigation_common_release", "(Landroid/net/Uri;)Z", "matches", "Landroidx/navigation/NavDeepLinkRequest;", "deepLinkRequest", "(Landroidx/navigation/NavDeepLinkRequest;)Z", "", "getMimeTypeMatchRating", "(Ljava/lang/String;)I", "deepLink", "", "Landroidx/navigation/NavArgument;", "arguments", "Landroid/os/Bundle;", "getMatchingArguments", "(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;", "getMatchingPathAndQueryArgs$navigation_common_release", "getMatchingPathAndQueryArgs", "requestedLink", "calculateMatchingPathSegments$navigation_common_release", "(Landroid/net/Uri;)I", "calculateMatchingPathSegments", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "getUriPattern", "()Ljava/lang/String;", "b", "getAction", "c", "getMimeType", "<set-?>", "p", "Z", "isExactDeepLink", "()Z", "setExactDeepLink$navigation_common_release", "(Z)V", "", "getArgumentsNames$navigation_common_release", "()Ljava/util/List;", "argumentsNames", "Builder", "n4/h", "n4/i", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,761:1\n1360#2:762\n1446#2,5:763\n1559#2:768\n1590#2,4:769\n1559#2:773\n1590#2,4:774\n1855#2,2:780\n1855#2:782\n1559#2:783\n1590#2,4:784\n1856#2:788\n215#3,2:778\n1#4:789\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n*L\n86#1:762\n86#1:763,5\n232#1:768\n232#1:769,4\n249#1:773\n249#1:774,4\n310#1:780,2\n319#1:782\n331#1:783\n331#1:784,4\n319#1:788\n271#1:778,2\n*E\n"})
public final class NavDeepLink {
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001A2\u00020\u0001:\u0001\u001AB\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JC\u0010\u0006\u001A\u00020\u0000\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u00012\u0006\u0010\t\u001A\u00020\u00042\u001D\b\u0002\u0010\u000E\u001A\u0017\u0012\u0004\u0012\u00020\u000B\u0012\r\u0012\u000B\u0012\u0002\b\u00030\f¢\u0006\u0002\b\r0\nH\u0086\b¢\u0006\u0004\b\u0006\u0010\u000FJI\u0010\u0006\u001A\u00020\u0000\"\b\b\u0000\u0010\b*\u00020\u00012\u0006\u0010\t\u001A\u00020\u00042\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u00102\u0018\b\u0002\u0010\u000E\u001A\u0012\u0012\u0004\u0012\u00020\u000B\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\nH\u0007¢\u0006\u0004\b\u0006\u0010\u0012J\u0015\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0007J\u0015\u0010\u0016\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0007J\r\u0010\u0018\u001A\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Landroidx/navigation/NavDeepLink$Builder;", "", "<init>", "()V", "", "uriPattern", "setUriPattern", "(Ljava/lang/String;)Landroidx/navigation/NavDeepLink$Builder;", "T", "basePath", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Ljava/lang/String;Ljava/util/Map;)Landroidx/navigation/NavDeepLink$Builder;", "Lkotlin/reflect/KClass;", "route", "(Ljava/lang/String;Lkotlin/reflect/KClass;Ljava/util/Map;)Landroidx/navigation/NavDeepLink$Builder;", "action", "setAction", "mimeType", "setMimeType", "Landroidx/navigation/NavDeepLink;", "build", "()Landroidx/navigation/NavDeepLink;", "Companion", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,761:1\n1#2:762\n*E\n"})
    public static final class Builder {
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JC\u0010\u0005\u001A\u00020\u0004\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u00012\u0006\u0010\b\u001A\u00020\u00022\u001D\b\u0002\u0010\r\u001A\u0017\u0012\u0004\u0012\u00020\n\u0012\r\u0012\u000B\u0012\u0002\b\u00030\u000B¢\u0006\u0002\b\f0\tH\u0087\b¢\u0006\u0004\b\u0005\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Landroidx/navigation/NavDeepLink$Builder$Companion;", "", "", "uriPattern", "Landroidx/navigation/NavDeepLink$Builder;", "fromUriPattern", "(Ljava/lang/String;)Landroidx/navigation/NavDeepLink$Builder;", "T", "basePath", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Ljava/lang/String;Ljava/util/Map;)Landroidx/navigation/NavDeepLink$Builder;", "action", "fromAction", "mimeType", "fromMimeType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,761:1\n1#2:762\n*E\n"})
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @JvmStatic
            @NotNull
            public final Builder fromAction(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "action");
                if(s.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                }
                Builder navDeepLink$Builder0 = new Builder();
                navDeepLink$Builder0.setAction(s);
                return navDeepLink$Builder0;
            }

            @JvmStatic
            @NotNull
            public final Builder fromMimeType(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "mimeType");
                Builder navDeepLink$Builder0 = new Builder();
                navDeepLink$Builder0.setMimeType(s);
                return navDeepLink$Builder0;
            }

            @JvmStatic
            @NotNull
            public final Builder fromUriPattern(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "uriPattern");
                Builder navDeepLink$Builder0 = new Builder();
                navDeepLink$Builder0.setUriPattern(s);
                return navDeepLink$Builder0;
            }

            @JvmStatic
            public final Builder fromUriPattern(String s, Map map0) {
                Intrinsics.checkNotNullParameter(s, "basePath");
                Intrinsics.checkNotNullParameter(map0, "typeMap");
                Builder navDeepLink$Builder0 = new Builder();
                Intrinsics.reifiedOperationMarker(4, "T");
                navDeepLink$Builder0.setUriPattern(s, Reflection.getOrCreateKotlinClass(Object.class), map0);
                return navDeepLink$Builder0;
            }

            public static Builder fromUriPattern$default(Companion navDeepLink$Builder$Companion0, String s, Map map0, int v, Object object0) {
                if((v & 2) != 0) {
                    map0 = x.emptyMap();
                }
                Intrinsics.checkNotNullParameter(s, "basePath");
                Intrinsics.checkNotNullParameter(map0, "typeMap");
                Builder navDeepLink$Builder0 = new Builder();
                Intrinsics.reifiedOperationMarker(4, "T");
                navDeepLink$Builder0.setUriPattern(s, Reflection.getOrCreateKotlinClass(Object.class), map0);
                return navDeepLink$Builder0;
            }
        }

        @NotNull
        public static final Companion Companion;
        public String a;
        public String b;
        public String c;

        static {
            Builder.Companion = new Companion(null);
        }

        @NotNull
        public final NavDeepLink build() {
            return new NavDeepLink(this.a, this.b, this.c);
        }

        @JvmStatic
        @NotNull
        public static final Builder fromAction(@NotNull String s) {
            return Builder.Companion.fromAction(s);
        }

        @JvmStatic
        @NotNull
        public static final Builder fromMimeType(@NotNull String s) {
            return Builder.Companion.fromMimeType(s);
        }

        @JvmStatic
        @NotNull
        public static final Builder fromUriPattern(@NotNull String s) {
            return Builder.Companion.fromUriPattern(s);
        }

        @NotNull
        public final Builder setAction(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "action");
            if(s.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.b = s;
            return this;
        }

        @NotNull
        public final Builder setMimeType(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "mimeType");
            this.c = s;
            return this;
        }

        @NotNull
        public final Builder setUriPattern(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "uriPattern");
            this.a = s;
            return this;
        }

        public final Builder setUriPattern(String s, Map map0) {
            Intrinsics.checkNotNullParameter(s, "basePath");
            Intrinsics.checkNotNullParameter(map0, "typeMap");
            Intrinsics.reifiedOperationMarker(4, "T");
            return this.setUriPattern(s, Reflection.getOrCreateKotlinClass(Object.class), map0);
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @NotNull
        public final Builder setUriPattern(@NotNull String s, @NotNull KClass kClass0, @NotNull Map map0) {
            Intrinsics.checkNotNullParameter(s, "basePath");
            Intrinsics.checkNotNullParameter(kClass0, "route");
            Intrinsics.checkNotNullParameter(map0, "typeMap");
            this.a = RouteSerializerKt.generateRoutePattern(SerializersKt.serializer(kClass0), map0, s);
            return this;
        }

        public static Builder setUriPattern$default(Builder navDeepLink$Builder0, String s, Map map0, int v, Object object0) {
            if((v & 2) != 0) {
                map0 = x.emptyMap();
            }
            Intrinsics.checkNotNullParameter(s, "basePath");
            Intrinsics.checkNotNullParameter(map0, "typeMap");
            Intrinsics.reifiedOperationMarker(4, "T");
            return navDeepLink$Builder0.setUriPattern(s, Reflection.getOrCreateKotlinClass(Object.class), map0);
        }

        public static Builder setUriPattern$default(Builder navDeepLink$Builder0, String s, KClass kClass0, Map map0, int v, Object object0) {
            if((v & 4) != 0) {
                map0 = x.emptyMap();
            }
            return navDeepLink$Builder0.setUriPattern(s, kClass0, map0);
        }
    }

    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public boolean i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final String n;
    public final Lazy o;
    public boolean p;
    public static final Pattern q;
    public static final Pattern r;

    static {
        NavDeepLink.q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
        NavDeepLink.r = Pattern.compile("\\{(.+?)\\}");
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public NavDeepLink(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "uri");
        this(s, null, null);
    }

    public NavDeepLink(@Nullable String s, @Nullable String s1, @Nullable String s2) {
        List list1;
        this.a = s;
        this.b = s1;
        this.c = s2;
        ArrayList arrayList0 = new ArrayList();
        this.d = arrayList0;
        this.f = c.lazy(new j(this, 6));
        this.g = c.lazy(new j(this, 4));
        j j0 = new j(this, 7);
        this.h = c.lazy(LazyThreadSafetyMode.NONE, j0);
        j j1 = new j(this, 1);
        this.j = c.lazy(LazyThreadSafetyMode.NONE, j1);
        j j2 = new j(this, 0);
        this.k = c.lazy(LazyThreadSafetyMode.NONE, j2);
        j j3 = new j(this, 3);
        this.l = c.lazy(LazyThreadSafetyMode.NONE, j3);
        this.m = c.lazy(new j(this, 2));
        this.o = c.lazy(new j(this, 5));
        if(s != null) {
            StringBuilder stringBuilder0 = new StringBuilder("^");
            if(!NavDeepLink.q.matcher(s).find()) {
                stringBuilder0.append("http[s]?://");
            }
            Matcher matcher0 = Pattern.compile("(\\?|\\#|$)").matcher(s);
            matcher0.find();
            String s3 = s.substring(0, matcher0.start());
            Intrinsics.checkNotNullExpressionValue(s3, "substring(...)");
            NavDeepLink.a(s3, arrayList0, stringBuilder0);
            this.p = !StringsKt__StringsKt.contains$default(stringBuilder0, ".*", false, 2, null) && !StringsKt__StringsKt.contains$default(stringBuilder0, "([^/]+?)", false, 2, null);
            stringBuilder0.append("($|(\\?(.)*)|(\\#(.)*))");
            String s4 = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s4, "uriRegex.toString()");
            this.e = p.replace$default(s4, ".*", "\\E.*\\Q", false, 4, null);
        }
        if(s2 != null) {
            if(!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(s2).matches()) {
                throw new IllegalArgumentException(("The given mimeType " + s2 + " does not match to required \"type/subtype\" format").toString());
            }
            Intrinsics.checkNotNullParameter(s2, "mimeType");
            List list0 = new Regex("/").split(s2, 0);
            if(!list0.isEmpty()) {
                ListIterator listIterator0 = list0.listIterator(list0.size());
                while(listIterator0.hasPrevious()) {
                    if(((String)listIterator0.previous()).length() == 0) {
                        continue;
                    }
                    list1 = CollectionsKt___CollectionsKt.take(list0, listIterator0.nextIndex() + 1);
                    this.n = p.replace$default(b.o("^(", ((String)list1.get(0)), "|[*]+)/(", ((String)list1.get(1)), "|[*]+)$"), "*|[*]", "[\\s\\S]", false, 4, null);
                    return;
                }
            }
            list1 = CollectionsKt__CollectionsKt.emptyList();
            this.n = p.replace$default(b.o("^(", ((String)list1.get(0)), "|[*]+)/(", ((String)list1.get(1)), "|[*]+)$"), "*|[*]", "[\\s\\S]", false, 4, null);
        }
    }

    public static void a(String s, ArrayList arrayList0, StringBuilder stringBuilder0) {
        Matcher matcher0 = NavDeepLink.r.matcher(s);
        int v;
        for(v = 0; matcher0.find(); v = matcher0.end()) {
            String s1 = matcher0.group(1);
            Intrinsics.checkNotNull(s1, "null cannot be cast to non-null type kotlin.String");
            arrayList0.add(s1);
            if(matcher0.start() > v) {
                String s2 = s.substring(v, matcher0.start());
                Intrinsics.checkNotNullExpressionValue(s2, "substring(...)");
                stringBuilder0.append(Pattern.quote(s2));
            }
            stringBuilder0.append("([^/]*?|)");
        }
        if(v < s.length()) {
            String s3 = s.substring(v);
            Intrinsics.checkNotNullExpressionValue(s3, "substring(...)");
            stringBuilder0.append(Pattern.quote(s3));
        }
    }

    public static final Pair access$getFragArgsAndRegex(NavDeepLink navDeepLink0) {
        return (Pair)navDeepLink0.j.getValue();
    }

    public static final String access$getFragRegex(NavDeepLink navDeepLink0) {
        return (String)navDeepLink0.l.getValue();
    }

    public static final Pair access$parseFragment(NavDeepLink navDeepLink0) {
        String s = navDeepLink0.a;
        if(s != null && Uri.parse(s).getFragment() != null) {
            ArrayList arrayList0 = new ArrayList();
            String s1 = Uri.parse(s).getFragment();
            StringBuilder stringBuilder0 = new StringBuilder();
            Intrinsics.checkNotNull(s1);
            NavDeepLink.a(s1, arrayList0, stringBuilder0);
            String s2 = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s2, "fragRegex.toString()");
            return TuplesKt.to(arrayList0, s2);
        }
        return null;
    }

    public static final Map access$parseQuery(NavDeepLink navDeepLink0) {
        navDeepLink0.getClass();
        Map map0 = new LinkedHashMap();
        if(((Boolean)navDeepLink0.g.getValue()).booleanValue()) {
            String s = navDeepLink0.a;
            Uri uri0 = Uri.parse(s);
            for(Object object0: uri0.getQueryParameterNames()) {
                String s1 = (String)object0;
                StringBuilder stringBuilder0 = new StringBuilder();
                List list0 = uri0.getQueryParameters(s1);
                if(list0.size() > 1) {
                    throw new IllegalArgumentException(("Query parameter " + s1 + " must only be present once in " + s + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                Intrinsics.checkNotNullExpressionValue(list0, "queryParams");
                String s2 = (String)CollectionsKt___CollectionsKt.firstOrNull(list0);
                if(s2 == null) {
                    navDeepLink0.i = true;
                    s2 = s1;
                }
                Matcher matcher0 = NavDeepLink.r.matcher(s2);
                i i0 = new i();
                int v;
                for(v = 0; matcher0.find(); v = matcher0.end()) {
                    String s3 = matcher0.group(1);
                    Intrinsics.checkNotNull(s3, "null cannot be cast to non-null type kotlin.String");
                    Intrinsics.checkNotNullParameter(s3, "name");
                    i0.b.add(s3);
                    Intrinsics.checkNotNullExpressionValue(s2, "queryParam");
                    String s4 = s2.substring(v, matcher0.start());
                    Intrinsics.checkNotNullExpressionValue(s4, "substring(...)");
                    stringBuilder0.append(Pattern.quote(s4));
                    stringBuilder0.append("(.+?)?");
                }
                if(v < s2.length()) {
                    Intrinsics.checkNotNullExpressionValue(s2, "queryParam");
                    String s5 = s2.substring(v);
                    Intrinsics.checkNotNullExpressionValue(s5, "substring(...)");
                    stringBuilder0.append(Pattern.quote(s5));
                }
                String s6 = stringBuilder0.toString();
                Intrinsics.checkNotNullExpressionValue(s6, "argRegex.toString()");
                i0.a = p.replace$default(s6, ".*", "\\E.*\\Q", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(s1, "paramName");
                map0.put(s1, i0);
            }
        }
        return map0;
    }

    public final boolean b(Matcher matcher0, Bundle bundle0, Map map0) {
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(this.d, 10));
        int v = 0;
        for(Object object0: this.d) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String s = (String)object0;
            String s1 = Uri.decode(matcher0.group(v + 1));
            NavArgument navArgument0 = (NavArgument)map0.get(s);
            try {
                Intrinsics.checkNotNullExpressionValue(s1, "value");
                if(navArgument0 == null) {
                    bundle0.putString(s, s1);
                }
                else {
                    navArgument0.getType().parseAndPut(bundle0, s, s1);
                }
            }
            catch(IllegalArgumentException unused_ex) {
                return false;
            }
            arrayList0.add(Unit.INSTANCE);
            ++v;
        }
        return true;
    }

    public final boolean c(Uri uri0, Bundle bundle0, Map map0) {
        Unit unit0;
        boolean z;
        for(Object object0: ((Map)this.h.getValue()).entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            i i0 = (i)((Map.Entry)object0).getValue();
            List list0 = uri0.getQueryParameters(s);
            if(this.i) {
                String s1 = uri0.getQuery();
                if(s1 != null && !Intrinsics.areEqual(s1, uri0.toString())) {
                    list0 = k.listOf(s1);
                }
            }
            Intrinsics.checkNotNullExpressionValue(list0, "inputParams");
            Bundle bundle1 = BundleKt.bundleOf(new Pair[0]);
            for(Object object1: i0.b) {
                String s2 = (String)object1;
                NavArgument navArgument0 = (NavArgument)map0.get(s2);
                NavType navType0 = navArgument0 == null ? null : navArgument0.getType();
                if(navType0 instanceof CollectionNavType && !navArgument0.isDefaultValuePresent()) {
                    ((CollectionNavType)navType0).put(bundle1, s2, ((CollectionNavType)navType0).emptyCollection());
                }
            }
            for(Object object2: list0) {
                Matcher matcher0 = i0.a == null ? null : Pattern.compile(i0.a, 0x20).matcher(((String)object2));
                if(matcher0 != null && matcher0.matches()) {
                    ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(i0.b, 10));
                    int v = 0;
                    for(Object object3: i0.b) {
                        if(v < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        String s3 = (String)object3;
                        String s4 = matcher0.group(v + 1);
                        if(s4 == null) {
                            s4 = "";
                        }
                        else {
                            Intrinsics.checkNotNullExpressionValue(s4, "argMatcher.group(index + 1) ?: \"\"");
                        }
                        NavArgument navArgument1 = (NavArgument)map0.get(s3);
                        try {
                            if(bundle1.containsKey(s3)) {
                                if(bundle1.containsKey(s3)) {
                                    if(navArgument1 != null) {
                                        NavType navType1 = navArgument1.getType();
                                        navType1.parseAndPut(bundle1, s3, s4, navType1.get(bundle1, s3));
                                    }
                                    z = false;
                                }
                                else {
                                    z = true;
                                }
                                unit0 = Boolean.valueOf(z);
                            }
                            else {
                                if(navArgument1 == null) {
                                    bundle1.putString(s3, s4);
                                }
                                else {
                                    navArgument1.getType().parseAndPut(bundle1, s3, s4);
                                }
                                unit0 = Unit.INSTANCE;
                            }
                        }
                        catch(IllegalArgumentException unused_ex) {
                            unit0 = Unit.INSTANCE;
                        }
                        arrayList0.add(unit0);
                        ++v;
                    }
                    continue;
                }
                return false;
            }
            bundle0.putAll(bundle1);
        }
        return true;
    }

    public final int calculateMatchingPathSegments$navigation_common_release(@Nullable Uri uri0) {
        if(uri0 != null) {
            String s = this.a;
            if(s != null) {
                List list0 = uri0.getPathSegments();
                List list1 = Uri.parse(s).getPathSegments();
                Intrinsics.checkNotNullExpressionValue(list0, "requestedPathSegments");
                Intrinsics.checkNotNullExpressionValue(list1, "uriPathSegments");
                return CollectionsKt___CollectionsKt.intersect(list0, list1).size();
            }
        }
        return 0;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 != null && object0 instanceof NavDeepLink && Intrinsics.areEqual(this.a, ((NavDeepLink)object0).a) && Intrinsics.areEqual(this.b, ((NavDeepLink)object0).b) && Intrinsics.areEqual(this.c, ((NavDeepLink)object0).c);
    }

    @Nullable
    public final String getAction() {
        return this.b;
    }

    @NotNull
    public final List getArgumentsNames$navigation_common_release() {
        ArrayList arrayList0 = this.d;
        Iterable iterable0 = ((Map)this.h.getValue()).values();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: iterable0) {
            o.addAll(arrayList1, ((i)object0).b);
        }
        return CollectionsKt___CollectionsKt.plus(CollectionsKt___CollectionsKt.plus(arrayList0, arrayList1), ((List)this.k.getValue()));
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Nullable
    public final Bundle getMatchingArguments(@NotNull Uri uri0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(uri0, "deepLink");
        Intrinsics.checkNotNullParameter(map0, "arguments");
        Pattern pattern0 = (Pattern)this.f.getValue();
        Matcher matcher0 = pattern0 == null ? null : pattern0.matcher(uri0.toString());
        if(matcher0 == null) {
            return null;
        }
        if(!matcher0.matches()) {
            return null;
        }
        Bundle bundle0 = new Bundle();
        if(!this.b(matcher0, bundle0, map0)) {
            return null;
        }
        if(((Boolean)this.g.getValue()).booleanValue() && !this.c(uri0, bundle0, map0)) {
            return null;
        }
        String s = uri0.getFragment();
        Pattern pattern1 = (Pattern)this.m.getValue();
        Matcher matcher1 = pattern1 == null ? null : pattern1.matcher(String.valueOf(s));
        if(matcher1 != null && matcher1.matches()) {
            Iterable iterable0 = (List)this.k.getValue();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            int v = 0;
            for(Object object0: iterable0) {
                if(v < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String s1 = (String)object0;
                String s2 = Uri.decode(matcher1.group(v + 1));
                NavArgument navArgument0 = (NavArgument)map0.get(s1);
                try {
                    Intrinsics.checkNotNullExpressionValue(s2, "value");
                    if(navArgument0 == null) {
                        bundle0.putString(s1, s2);
                    }
                    else {
                        navArgument0.getType().parseAndPut(bundle0, s1, s2);
                    }
                }
                catch(IllegalArgumentException unused_ex) {
                    break;
                }
                arrayList0.add(Unit.INSTANCE);
                ++v;
            }
        }
        return NavArgumentKt.missingRequiredArguments(map0, new n4.k(0, bundle0)).isEmpty() ? bundle0 : null;
    }

    @NotNull
    public final Bundle getMatchingPathAndQueryArgs$navigation_common_release(@Nullable Uri uri0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "arguments");
        Bundle bundle0 = new Bundle();
        if(uri0 == null) {
            return bundle0;
        }
        Pattern pattern0 = (Pattern)this.f.getValue();
        Matcher matcher0 = pattern0 == null ? null : pattern0.matcher(uri0.toString());
        if(matcher0 == null) {
            return bundle0;
        }
        if(!matcher0.matches()) {
            return bundle0;
        }
        this.b(matcher0, bundle0, map0);
        if(((Boolean)this.g.getValue()).booleanValue()) {
            this.c(uri0, bundle0, map0);
        }
        return bundle0;
    }

    @Nullable
    public final String getMimeType() {
        return this.c;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final int getMimeTypeMatchRating(@NotNull String s) {
        List list3;
        List list1;
        Intrinsics.checkNotNullParameter(s, "mimeType");
        String s1 = this.c;
        if(s1 != null) {
            Pattern pattern0 = (Pattern)this.o.getValue();
            Intrinsics.checkNotNull(pattern0);
            if(pattern0.matcher(s).matches()) {
                Intrinsics.checkNotNullParameter(s1, "mimeType");
                int v = 0;
                List list0 = new Regex("/").split(s1, 0);
                if(!list0.isEmpty()) {
                    ListIterator listIterator0 = list0.listIterator(list0.size());
                    while(listIterator0.hasPrevious()) {
                        if(((String)listIterator0.previous()).length() == 0) {
                            continue;
                        }
                        list1 = CollectionsKt___CollectionsKt.take(list0, listIterator0.nextIndex() + 1);
                        goto label_16;
                    }
                }
                list1 = CollectionsKt__CollectionsKt.emptyList();
            label_16:
                String s2 = (String)list1.get(0);
                String s3 = (String)list1.get(1);
                Intrinsics.checkNotNullParameter(s, "mimeType");
                h h0 = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
                List list2 = new Regex("/").split(s, 0);
                if(!list2.isEmpty()) {
                    ListIterator listIterator1 = list2.listIterator(list2.size());
                    while(listIterator1.hasPrevious()) {
                        if(((String)listIterator1.previous()).length() == 0) {
                            continue;
                        }
                        list3 = CollectionsKt___CollectionsKt.take(list2, listIterator1.nextIndex() + 1);
                        goto label_28;
                    }
                }
                list3 = CollectionsKt__CollectionsKt.emptyList();
            label_28:
                h0.a = (String)list3.get(0);
                h0.b = (String)list3.get(1);
                Intrinsics.checkNotNullParameter(h0, "other");
                if(Intrinsics.areEqual(s2, h0.a)) {
                    v = 2;
                }
                return Intrinsics.areEqual(s3, h0.b) ? v + 1 : v;
            }
        }
        return -1;
    }

    @Nullable
    public final String getUriPattern() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final boolean isExactDeepLink() {
        return this.p;
    }

    public final boolean matches$navigation_common_release(@NotNull Uri uri0) {
        Intrinsics.checkNotNullParameter(uri0, "uri");
        return this.matches$navigation_common_release(new NavDeepLinkRequest(uri0, null, null));
    }

    public final boolean matches$navigation_common_release(@NotNull NavDeepLinkRequest navDeepLinkRequest0) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest0, "deepLinkRequest");
        Uri uri0 = navDeepLinkRequest0.getUri();
        Lazy lazy0 = this.f;
        if((uri0 == null ? 1 : 0) != (((Pattern)lazy0.getValue()) == null ? 0 : 1)) {
            if(uri0 == null) {
                goto label_8;
            }
            Pattern pattern0 = (Pattern)lazy0.getValue();
            Intrinsics.checkNotNull(pattern0);
            if(pattern0.matcher(uri0.toString()).matches()) {
            label_8:
                String s = navDeepLinkRequest0.getAction();
                if((s == null ? 1 : 0) != (this.b == null ? 0 : 1) && (s == null || Intrinsics.areEqual(this.b, s))) {
                    String s1 = navDeepLinkRequest0.getMimeType();
                    if((s1 == null ? 1 : 0) == (this.c == null ? 0 : 1)) {
                        return false;
                    }
                    if(s1 != null) {
                        Pattern pattern1 = (Pattern)this.o.getValue();
                        Intrinsics.checkNotNull(pattern1);
                        return pattern1.matcher(s1).matches();
                    }
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void setExactDeepLink$navigation_common_release(boolean z) {
        this.p = z;
    }
}

