package okhttp3;

import androidx.room.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001A2\u00020\u0001:\u0001\u001AJ\u001D\u0010\u0004\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\f\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\u000E\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000BJ\u000F\u0010\u000F\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u000F\u0010\u000BJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\f\u001A\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\f\u0010\u000BR\u0017\u0010\u000E\u001A\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001A\u0004\b\u000E\u0010\u000B¨\u0006\u001B"}, d2 = {"Lokhttp3/MediaType;", "", "Ljava/nio/charset/Charset;", "defaultValue", "charset", "(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "", "name", "parameter", "(Ljava/lang/String;)Ljava/lang/String;", "-deprecated_type", "()Ljava/lang/String;", "type", "-deprecated_subtype", "subtype", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Ljava/lang/String;", "c", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MediaType {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0006\u001A\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001A\u0004\u0018\u00010\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\u0004\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u0005J\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00032\u0006\u0010\t\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u000B\u0010\u0005R\u001C\u0010\u000E\u001A\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0010\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001C\u0010\u0013\u001A\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000F¨\u0006\u0014"}, d2 = {"Lokhttp3/MediaType$Companion;", "", "", "Lokhttp3/MediaType;", "get", "(Ljava/lang/String;)Lokhttp3/MediaType;", "toMediaType", "parse", "toMediaTypeOrNull", "mediaType", "-deprecated_get", "-deprecated_parse", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PARAMETER", "Ljava/util/regex/Pattern;", "QUOTED", "Ljava/lang/String;", "TOKEN", "TYPE_SUBTYPE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nMediaType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n1#2:182\n37#3,2:183\n*S KotlinDebug\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n*L\n148#1:183,2\n*E\n"})
    public static final class Companion {
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @JvmName(name = "-deprecated_get")
        @NotNull
        public final MediaType -deprecated_get(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "mediaType");
            return this.get(s);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @JvmName(name = "-deprecated_parse")
        @Nullable
        public final MediaType -deprecated_parse(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "mediaType");
            return this.parse(s);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmName(name = "get")
        @JvmStatic
        @NotNull
        public final MediaType get(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "<this>");
            Matcher matcher0 = MediaType.e.matcher(s);
            if(!matcher0.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + s + '\"').toString());
            }
            String s1 = matcher0.group(1);
            Intrinsics.checkNotNullExpressionValue(s1, "typeSubtype.group(1)");
            Locale locale0 = Locale.US;
            String s2 = a.k(locale0, "US", s1, locale0, "this as java.lang.String).toLowerCase(locale)");
            String s3 = matcher0.group(2);
            Intrinsics.checkNotNullExpressionValue(s3, "typeSubtype.group(2)");
            Intrinsics.checkNotNullExpressionValue(locale0, "US");
            String s4 = s3.toLowerCase(locale0);
            Intrinsics.checkNotNullExpressionValue(s4, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList0 = new ArrayList();
            Matcher matcher1 = MediaType.f.matcher(s);
            int v = matcher0.end();
            while(v < s.length()) {
                matcher1.region(v, s.length());
                if(matcher1.lookingAt()) {
                    String s5 = matcher1.group(1);
                    if(s5 == null) {
                        v = matcher1.end();
                        continue;
                    }
                    String s6 = matcher1.group(2);
                    if(s6 == null) {
                        s6 = matcher1.group(3);
                    }
                    else if(p.startsWith$default(s6, "\'", false, 2, null) && p.endsWith$default(s6, "\'", false, 2, null) && s6.length() > 2) {
                        s6 = s6.substring(1, s6.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(s6, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList0.add(s5);
                    arrayList0.add(s6);
                    v = matcher1.end();
                    continue;
                }
                StringBuilder stringBuilder0 = new StringBuilder("Parameter is not formatted correctly: \"");
                String s7 = s.substring(v);
                Intrinsics.checkNotNullExpressionValue(s7, "this as java.lang.String).substring(startIndex)");
                stringBuilder0.append(s7);
                stringBuilder0.append("\" for: \"");
                throw new IllegalArgumentException(wb.a.b('\"', s, stringBuilder0).toString());
            }
            return new MediaType(s, s2, s4, ((String[])arrayList0.toArray(new String[0])), null);
        }

        @JvmName(name = "parse")
        @JvmStatic
        @Nullable
        public final MediaType parse(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "<this>");
            try {
                return this.get(s);
            }
            catch(IllegalArgumentException unused_ex) {
                return null;
            }
        }
    }

    @NotNull
    public static final Companion Companion;
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;
    public static final Pattern e;
    public static final Pattern f;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "subtype", imports = {}))
    @JvmName(name = "-deprecated_subtype")
    @NotNull
    public final String -deprecated_subtype() {
        return this.c;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "type", imports = {}))
    @JvmName(name = "-deprecated_type")
    @NotNull
    public final String -deprecated_type() {
        return this.b;
    }

    static {
        MediaType.Companion = new Companion(null);
        MediaType.e = Pattern.compile("([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)");
        MediaType.f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    }

    public MediaType(String s, String s1, String s2, String[] arr_s, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = arr_s;
    }

    @JvmOverloads
    @Nullable
    public final Charset charset() {
        return MediaType.charset$default(this, null, 1, null);
    }

    @JvmOverloads
    @Nullable
    public final Charset charset(@Nullable Charset charset0) {
        String s = this.parameter("charset");
        if(s == null) {
            return charset0;
        }
        try {
            return Charset.forName(s);
        }
        catch(IllegalArgumentException unused_ex) {
            return charset0;
        }
    }

    public static Charset charset$default(MediaType mediaType0, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = null;
        }
        return mediaType0.charset(charset0);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof MediaType && Intrinsics.areEqual(((MediaType)object0).a, this.a);
    }

    @JvmName(name = "get")
    @JvmStatic
    @NotNull
    public static final MediaType get(@NotNull String s) {
        return MediaType.Companion.get(s);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Nullable
    public final String parameter(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        String[] arr_s = this.d;
        int v1 = ProgressionUtilKt.getProgressionLastElement(0, arr_s.length - 1, 2);
        if(v1 >= 0) {
            for(int v = 0; true; v += 2) {
                if(p.equals(arr_s[v], s, true)) {
                    return arr_s[v + 1];
                }
                if(v == v1) {
                    break;
                }
            }
        }
        return null;
    }

    @JvmName(name = "parse")
    @JvmStatic
    @Nullable
    public static final MediaType parse(@NotNull String s) {
        return MediaType.Companion.parse(s);
    }

    @JvmName(name = "subtype")
    @NotNull
    public final String subtype() {
        return this.c;
    }

    @Override
    @NotNull
    public String toString() {
        return this.a;
    }

    @JvmName(name = "type")
    @NotNull
    public final String type() {
        return this.b;
    }
}

