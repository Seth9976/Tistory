package androidx.navigation;

import androidx.navigation.serialization.RouteSerializerKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@NavDeepLinkDsl
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B:\b\u0010\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u0006\u0012\u001B\u0010\f\u001A\u0017\u0012\u0004\u0012\u00020\t\u0012\r\u0012\u000B\u0012\u0002\b\u00030\n¢\u0006\u0002\b\u000B0\b¢\u0006\u0004\b\u0002\u0010\rJ\u000F\u0010\u0011\u001A\u00020\u000EH\u0000¢\u0006\u0004\b\u000F\u0010\u0010R$\u0010\u0018\u001A\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R.\u0010\u001D\u001A\u0004\u0018\u00010\u00042\b\u0010\u0019\u001A\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\u0013\u001A\u0004\b\u001B\u0010\u0015\"\u0004\b\u001C\u0010\u0017R$\u0010!\u001A\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u0013\u001A\u0004\b\u001F\u0010\u0015\"\u0004\b \u0010\u0017¨\u0006\""}, d2 = {"Landroidx/navigation/NavDeepLinkDslBuilder;", "", "<init>", "()V", "", "basePath", "Lkotlin/reflect/KClass;", "route", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Ljava/lang/String;Lkotlin/reflect/KClass;Ljava/util/Map;)V", "Landroidx/navigation/NavDeepLink;", "build$navigation_common_release", "()Landroidx/navigation/NavDeepLink;", "build", "d", "Ljava/lang/String;", "getUriPattern", "()Ljava/lang/String;", "setUriPattern", "(Ljava/lang/String;)V", "uriPattern", "p", "e", "getAction", "setAction", "action", "f", "getMimeType", "setMimeType", "mimeType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavDeepLinkDslBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkDslBuilder.kt\nandroidx/navigation/NavDeepLinkDslBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
public final class NavDeepLinkDslBuilder {
    public final Builder a;
    public final KClass b;
    public final Map c;
    public String d;
    public String e;
    public String f;

    public NavDeepLinkDslBuilder() {
        this.a = new Builder();
        this.c = x.emptyMap();
    }

    public NavDeepLinkDslBuilder(@NotNull String s, @NotNull KClass kClass0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(s, "basePath");
        Intrinsics.checkNotNullParameter(kClass0, "route");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        super();
        this.a = new Builder();
        this.c = x.emptyMap();
        if(s.length() <= 0) {
            throw new IllegalArgumentException("The basePath for NavDeepLink from KClass cannot be empty");
        }
        this.d = RouteSerializerKt.generateRoutePattern(SerializersKt.serializer(kClass0), map0, s);
        this.b = kClass0;
        this.c = map0;
    }

    @NotNull
    public final NavDeepLink build$navigation_common_release() {
        String s = this.d;
        if(s == null && this.e == null && this.f == null) {
            throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.");
        }
        Builder navDeepLink$Builder0 = this.a;
        if(s != null) {
            navDeepLink$Builder0.setUriPattern(s);
        }
        String s1 = this.e;
        if(s1 != null) {
            navDeepLink$Builder0.setAction(s1);
        }
        String s2 = this.f;
        if(s2 != null) {
            navDeepLink$Builder0.setMimeType(s2);
        }
        return navDeepLink$Builder0.build();
    }

    @Nullable
    public final String getAction() {
        return this.e;
    }

    @Nullable
    public final String getMimeType() {
        return this.f;
    }

    @Nullable
    public final String getUriPattern() {
        return this.d;
    }

    public final void setAction(@Nullable String s) {
        if(s != null && s.length() == 0) {
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        this.e = s;
    }

    public final void setMimeType(@Nullable String s) {
        this.f = s;
    }

    public final void setUriPattern(@Nullable String s) {
        this.d = s;
    }
}

