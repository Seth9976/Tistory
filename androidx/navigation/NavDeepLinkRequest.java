package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0017B\'\b\u0007\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0017\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u0007\u0010\u000BJ\u000F\u0010\f\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\rR\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001A\u0004\b\u0016\u0010\r¨\u0006\u0018"}, d2 = {"Landroidx/navigation/NavDeepLinkRequest;", "", "Landroid/net/Uri;", "uri", "", "action", "mimeType", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "(Landroid/content/Intent;)V", "toString", "()Ljava/lang/String;", "a", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "b", "Ljava/lang/String;", "getAction", "c", "getMimeType", "Builder", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class NavDeepLinkRequest {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000F2\u00020\u0001:\u0001\u000FJ\u0015\u0010\u0004\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000B\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u0006¢\u0006\u0004\b\u000B\u0010\tJ\r\u0010\r\u001A\u00020\f¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Landroidx/navigation/NavDeepLinkRequest$Builder;", "", "Landroid/net/Uri;", "uri", "setUri", "(Landroid/net/Uri;)Landroidx/navigation/NavDeepLinkRequest$Builder;", "", "action", "setAction", "(Ljava/lang/String;)Landroidx/navigation/NavDeepLinkRequest$Builder;", "mimeType", "setMimeType", "Landroidx/navigation/NavDeepLinkRequest;", "build", "()Landroidx/navigation/NavDeepLinkRequest;", "Companion", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nNavDeepLinkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkRequest.kt\nandroidx/navigation/NavDeepLinkRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
    public static final class Builder {
        @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Landroidx/navigation/NavDeepLinkRequest$Builder$Companion;", "", "Landroid/net/Uri;", "uri", "Landroidx/navigation/NavDeepLinkRequest$Builder;", "fromUri", "(Landroid/net/Uri;)Landroidx/navigation/NavDeepLinkRequest$Builder;", "", "action", "fromAction", "(Ljava/lang/String;)Landroidx/navigation/NavDeepLinkRequest$Builder;", "mimeType", "fromMimeType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @JvmStatic
            @NotNull
            public final Builder fromAction(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "action");
                if(s.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
                }
                Builder navDeepLinkRequest$Builder0 = new Builder(null);
                navDeepLinkRequest$Builder0.setAction(s);
                return navDeepLinkRequest$Builder0;
            }

            @JvmStatic
            @NotNull
            public final Builder fromMimeType(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "mimeType");
                Builder navDeepLinkRequest$Builder0 = new Builder(null);
                navDeepLinkRequest$Builder0.setMimeType(s);
                return navDeepLinkRequest$Builder0;
            }

            @JvmStatic
            @NotNull
            public final Builder fromUri(@NotNull Uri uri0) {
                Intrinsics.checkNotNullParameter(uri0, "uri");
                Builder navDeepLinkRequest$Builder0 = new Builder(null);
                navDeepLinkRequest$Builder0.setUri(uri0);
                return navDeepLinkRequest$Builder0;
            }
        }

        @NotNull
        public static final Companion Companion;
        public Uri a;
        public String b;
        public String c;

        static {
            Builder.Companion = new Companion(null);
        }

        public Builder(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final NavDeepLinkRequest build() {
            return new NavDeepLinkRequest(this.a, this.b, this.c);
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
        public static final Builder fromUri(@NotNull Uri uri0) {
            return Builder.Companion.fromUri(uri0);
        }

        @NotNull
        public final Builder setAction(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "action");
            if(s.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
            }
            this.b = s;
            return this;
        }

        @NotNull
        public final Builder setMimeType(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "mimeType");
            if(!new Regex("^[-\\w*.]+/[-\\w+*.]+$").matches(s)) {
                throw new IllegalArgumentException(("The given mimeType " + s + " does not match to required \"type/subtype\" format").toString());
            }
            this.c = s;
            return this;
        }

        @NotNull
        public final Builder setUri(@NotNull Uri uri0) {
            Intrinsics.checkNotNullParameter(uri0, "uri");
            this.a = uri0;
            return this;
        }
    }

    public final Uri a;
    public final String b;
    public final String c;

    @RestrictTo({Scope.LIBRARY_GROUP})
    public NavDeepLinkRequest(@NotNull Intent intent0) {
        Intrinsics.checkNotNullParameter(intent0, "intent");
        this(intent0.getData(), intent0.getAction(), intent0.getType());
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public NavDeepLinkRequest(@Nullable Uri uri0, @Nullable String s, @Nullable String s1) {
        this.a = uri0;
        this.b = s;
        this.c = s1;
    }

    @Nullable
    public String getAction() {
        return this.b;
    }

    @Nullable
    public String getMimeType() {
        return this.c;
    }

    @Nullable
    public Uri getUri() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("NavDeepLinkRequest{");
        if(this.getUri() != null) {
            stringBuilder0.append(" uri=");
            stringBuilder0.append(String.valueOf(this.getUri()));
        }
        if(this.getAction() != null) {
            stringBuilder0.append(" action=");
            stringBuilder0.append(this.getAction());
        }
        if(this.getMimeType() != null) {
            stringBuilder0.append(" mimetype=");
            stringBuilder0.append(this.getMimeType());
        }
        stringBuilder0.append(" }");
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "sb.toString()");
        return s;
    }
}

