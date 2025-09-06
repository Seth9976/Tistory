package okhttp3;

import androidx.room.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import kotlin.text.q;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001F\u0018\u0000 42\u00020\u0001:\u000254J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u001A\u0010\b\u001A\u00020\u00042\b\u0010\u0007\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0017\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\rH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u000FJ\u000F\u0010\u0013\u001A\u00020\rH\u0007\u00A2\u0006\u0004\b\u0012\u0010\u000FJ\u000F\u0010\u0016\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u001A\u001A\u00020\u0017H\u0007\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001C\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u001B\u0010\u0015J\u000F\u0010\u001E\u001A\u00020\rH\u0007\u00A2\u0006\u0004\b\u001D\u0010\u000FJ\u000F\u0010 \u001A\u00020\rH\u0007\u00A2\u0006\u0004\b\u001F\u0010\u000FJ\u000F\u0010\"\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b!\u0010\u0015J\u000F\u0010$\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b#\u0010\u0015J\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010%\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b&\u0010\'R\u0017\u0010\u0011\u001A\u00020\r8\u0007\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b\u0011\u0010\u000FR\u0017\u0010\u0013\u001A\u00020\r8\u0007\u00A2\u0006\f\n\u0004\b*\u0010)\u001A\u0004\b\u0013\u0010\u000FR\u0017\u0010\u001A\u001A\u00020\u00178\u0007\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b\u001A\u0010\u0019R\u0017\u0010\u001E\u001A\u00020\r8\u0007\u00A2\u0006\f\n\u0004\b-\u0010)\u001A\u0004\b\u001E\u0010\u000FR\u0017\u0010 \u001A\u00020\r8\u0007\u00A2\u0006\f\n\u0004\b.\u0010)\u001A\u0004\b \u0010\u000FR\u0017\u0010$\u001A\u00020\u00048\u0007\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b$\u0010\u0015R\u0017\u0010\"\u001A\u00020\u00048\u0007\u00A2\u0006\f\n\u0004\b1\u00100\u001A\u0004\b\"\u0010\u0015R\u0017\u0010\u0016\u001A\u00020\u00048\u0007\u00A2\u0006\f\n\u0004\b2\u00100\u001A\u0004\b\u0016\u0010\u0015R\u0017\u0010\u001C\u001A\u00020\u00048\u0007\u00A2\u0006\f\n\u0004\b3\u00100\u001A\u0004\b\u001C\u0010\u0015\u00A8\u00066"}, d2 = {"Lokhttp3/Cookie;", "", "Lokhttp3/HttpUrl;", "url", "", "matches", "(Lokhttp3/HttpUrl;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "-deprecated_name", "name", "-deprecated_value", "value", "-deprecated_persistent", "()Z", "persistent", "", "-deprecated_expiresAt", "()J", "expiresAt", "-deprecated_hostOnly", "hostOnly", "-deprecated_domain", "domain", "-deprecated_path", "path", "-deprecated_httpOnly", "httpOnly", "-deprecated_secure", "secure", "forObsoleteRfc2965", "toString$okhttp", "(Z)Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "c", "J", "d", "e", "f", "Z", "g", "h", "i", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Cookie {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\t\u001A\u00020\u00002\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000B\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\u0004¢\u0006\u0004\b\u000B\u0010\u0006J\u0015\u0010\f\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0015\u0010\r\u001A\u00020\u00002\u0006\u0010\r\u001A\u00020\u0004¢\u0006\u0004\b\r\u0010\u0006J\r\u0010\u000E\u001A\u00020\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0010\u001A\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u000FJ\r\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "<init>", "()V", "", "name", "(Ljava/lang/String;)Lokhttp3/Cookie$Builder;", "value", "", "expiresAt", "(J)Lokhttp3/Cookie$Builder;", "domain", "hostOnlyDomain", "path", "secure", "()Lokhttp3/Cookie$Builder;", "httpOnly", "Lokhttp3/Cookie;", "build", "()Lokhttp3/Cookie;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nokhttp3/Cookie$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1#2:615\n*E\n"})
    public static final class Builder {
        public String a;
        public String b;
        public long c;
        public String d;
        public String e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;

        public Builder() {
            this.c = 0xE677D21FDBFFL;
            this.e = "/";
        }

        @NotNull
        public final Cookie build() {
            String s = this.a;
            if(s == null) {
                throw new NullPointerException("builder.name == null");
            }
            String s1 = this.b;
            if(s1 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long v = this.c;
            String s2 = this.d;
            if(s2 == null) {
                throw new NullPointerException("builder.domain == null");
            }
            return new Cookie(s, s1, v, s2, this.e, this.f, this.g, this.h, this.i, null);
        }

        @NotNull
        public final Builder domain(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "domain");
            String s1 = HostnamesKt.toCanonicalHost(s);
            if(s1 == null) {
                throw new IllegalArgumentException("unexpected domain: " + s);
            }
            this.d = s1;
            this.i = false;
            return this;
        }

        @NotNull
        public final Builder expiresAt(long v) {
            if(v <= 0L) {
                v = 0x8000000000000000L;
            }
            if(v > 0xE677D21FDBFFL) {
                v = 0xE677D21FDBFFL;
            }
            this.c = v;
            this.h = true;
            return this;
        }

        @NotNull
        public final Builder hostOnlyDomain(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "domain");
            String s1 = HostnamesKt.toCanonicalHost(s);
            if(s1 == null) {
                throw new IllegalArgumentException("unexpected domain: " + s);
            }
            this.d = s1;
            this.i = true;
            return this;
        }

        @NotNull
        public final Builder httpOnly() {
            this.g = true;
            return this;
        }

        @NotNull
        public final Builder name(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            if(!Intrinsics.areEqual(StringsKt__StringsKt.trim(s).toString(), s)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.a = s;
            return this;
        }

        @NotNull
        public final Builder path(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "path");
            if(!p.startsWith$default(s, "/", false, 2, null)) {
                throw new IllegalArgumentException("path must start with \'/\'");
            }
            this.e = s;
            return this;
        }

        @NotNull
        public final Builder secure() {
            this.f = true;
            return this;
        }

        @NotNull
        public final Builder value(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "value");
            if(!Intrinsics.areEqual(StringsKt__StringsKt.trim(s).toString(), s)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.b = s;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J!\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0000¢\u0006\u0004\b\u000B\u0010\fJ%\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00060\u000F2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001C\u0010\u0014\u001A\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001C\u0010\u0016\u001A\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001C\u0010\u0017\u001A\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001C\u0010\u0018\u001A\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lokhttp3/Cookie$Companion;", "", "Lokhttp3/HttpUrl;", "url", "", "setCookie", "Lokhttp3/Cookie;", "parse", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "", "currentTimeMillis", "parse$okhttp", "(JLokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "Lokhttp3/Headers;", "headers", "", "parseAll", "(Lokhttp3/HttpUrl;Lokhttp3/Headers;)Ljava/util/List;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static int a(String s, int v, int v1, boolean z) {
            while(v < v1) {
                int v2 = s.charAt(v);
                if((v2 < 0x20 && v2 != 9 || v2 >= 0x7F || 0x30 <= v2 && v2 < 58 || 97 <= v2 && v2 < 0x7B || 65 <= v2 && v2 < 91 || v2 == 58 ? 1 : 0) == !z) {
                    return v;
                }
                ++v;
            }
            return v1;
        }

        public static final boolean access$domainMatch(Companion cookie$Companion0, String s, String s1) {
            cookie$Companion0.getClass();
            return Companion.b(s, s1);
        }

        public static final boolean access$pathMatch(Companion cookie$Companion0, HttpUrl httpUrl0, String s) {
            cookie$Companion0.getClass();
            String s1 = httpUrl0.encodedPath();
            return Intrinsics.areEqual(s1, s) || p.startsWith$default(s1, s, false, 2, null) && (p.endsWith$default(s, "/", false, 2, null) || s1.charAt(s.length()) == 0x2F);
        }

        // 去混淆评级： 低(40)
        public static boolean b(String s, String s1) {
            return Intrinsics.areEqual(s, s1) ? true : p.endsWith$default(s, s1, false, 2, null) && s.charAt(s.length() - s1.length() - 1) == 46 && !Util.canParseAsIpAddress(s);
        }

        public static long c(int v, String s) {
            int v1 = Companion.a(s, 0, v, false);
            Matcher matcher0 = Cookie.m.matcher(s);
            int v2 = -1;
            int v3 = -1;
            int v4 = -1;
            int v5 = -1;
            int v6 = -1;
            int v7 = -1;
            while(v1 < v) {
                int v8 = Companion.a(s, v1 + 1, v, true);
                matcher0.region(v1, v8);
                if(v3 == -1 && matcher0.usePattern(Cookie.m).matches()) {
                    String s1 = matcher0.group(1);
                    Intrinsics.checkNotNullExpressionValue(s1, "matcher.group(1)");
                    v3 = Integer.parseInt(s1);
                    String s2 = matcher0.group(2);
                    Intrinsics.checkNotNullExpressionValue(s2, "matcher.group(2)");
                    v6 = Integer.parseInt(s2);
                    String s3 = matcher0.group(3);
                    Intrinsics.checkNotNullExpressionValue(s3, "matcher.group(3)");
                    v7 = Integer.parseInt(s3);
                }
                else if(v4 == -1 && matcher0.usePattern(Cookie.l).matches()) {
                    String s4 = matcher0.group(1);
                    Intrinsics.checkNotNullExpressionValue(s4, "matcher.group(1)");
                    v4 = Integer.parseInt(s4);
                }
                else if(v5 == -1 && matcher0.usePattern(Cookie.k).matches()) {
                    String s5 = matcher0.group(1);
                    Intrinsics.checkNotNullExpressionValue(s5, "matcher.group(1)");
                    String s6 = a.k(Locale.US, "US", s5, Locale.US, "this as java.lang.String).toLowerCase(locale)");
                    Intrinsics.checkNotNullExpressionValue("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*", "MONTH_PATTERN.pattern()");
                    v5 = StringsKt__StringsKt.indexOf$default("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*", s6, 0, false, 6, null) / 4;
                }
                else if(v2 == -1 && matcher0.usePattern(Cookie.j).matches()) {
                    String s7 = matcher0.group(1);
                    Intrinsics.checkNotNullExpressionValue(s7, "matcher.group(1)");
                    v2 = Integer.parseInt(s7);
                }
                v1 = Companion.a(s, v8 + 1, v, false);
            }
            if(70 <= v2 && v2 < 100) {
                v2 += 1900;
            }
            if(v2 >= 0 && v2 < 70) {
                v2 += 2000;
            }
            if(v2 < 1601 || v5 == -1 || 1 > v4 || v4 >= 0x20 || v3 < 0 || v3 >= 24 || v6 < 0 || v6 >= 60 || v7 < 0 || v7 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar0 = new GregorianCalendar(Util.UTC);
            gregorianCalendar0.setLenient(false);
            gregorianCalendar0.set(1, v2);
            gregorianCalendar0.set(2, v5 - 1);
            gregorianCalendar0.set(5, v4);
            gregorianCalendar0.set(11, v3);
            gregorianCalendar0.set(12, v6);
            gregorianCalendar0.set(13, v7);
            gregorianCalendar0.set(14, 0);
            return gregorianCalendar0.getTimeInMillis();
        }

        @JvmStatic
        @Nullable
        public final Cookie parse(@NotNull HttpUrl httpUrl0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(httpUrl0, "url");
            Intrinsics.checkNotNullParameter(s, "setCookie");
            return this.parse$okhttp(System.currentTimeMillis(), httpUrl0, s);
        }

        @Nullable
        public final Cookie parse$okhttp(long v, @NotNull HttpUrl httpUrl0, @NotNull String s) {
            String s9;
            long v11;
            long v8;
            long v7;
            Intrinsics.checkNotNullParameter(httpUrl0, "url");
            Intrinsics.checkNotNullParameter(s, "setCookie");
            int v1 = Util.delimiterOffset$default(s, ';', 0, 0, 6, null);
            int v2 = Util.delimiterOffset$default(s, '=', 0, v1, 2, null);
            if(v2 == v1) {
                return null;
            }
            String s1 = Util.trimSubstring$default(s, 0, v2, 1, null);
            if(s1.length() == 0 || Util.indexOfControlOrNonAscii(s1) != -1) {
                return null;
            }
            String s2 = Util.trimSubstring(s, v2 + 1, v1);
            if(Util.indexOfControlOrNonAscii(s2) != -1) {
                return null;
            }
            int v3 = v1 + 1;
            int v4 = s.length();
            String s3 = null;
            String s4 = null;
            boolean z = false;
            boolean z1 = false;
            boolean z2 = false;
            boolean z3 = true;
            long v5 = -1L;
            long v6 = 0xE677D21FDBFFL;
            while(true) {
                v7 = 0x7FFFFFFFFFFFFFFFL;
                v8 = 0x8000000000000000L;
                if(v3 >= v4) {
                    break;
                }
                int v9 = Util.delimiterOffset(s, ';', v3, v4);
                int v10 = Util.delimiterOffset(s, '=', v3, v9);
                String s5 = Util.trimSubstring(s, v3, v10);
                String s6 = v10 >= v9 ? "" : Util.trimSubstring(s, v10 + 1, v9);
                if(p.equals(s5, "expires", true)) {
                    try {
                        v6 = Companion.c(s6.length(), s6);
                        z2 = true;
                    }
                    catch(IllegalArgumentException unused_ex) {
                    }
                }
                else if(p.equals(s5, "max-age", true)) {
                    try {
                        v11 = Long.parseLong(s6);
                        goto label_45;
                    }
                    catch(NumberFormatException numberFormatException0) {
                        try {
                            NumberFormatException numberFormatException1 = numberFormatException0;
                            if(!new Regex("-?\\d+").matches(s6)) {
                                throw numberFormatException1;
                            }
                            if(p.startsWith$default(s6, "-", false, 2, null)) {
                                v7 = 0x8000000000000000L;
                            }
                            v5 = v7;
                            goto label_48;
                        label_45:
                            if(v11 > 0L) {
                                v8 = v11;
                            }
                            v5 = v8;
                        label_48:
                            z2 = true;
                        }
                        catch(NumberFormatException unused_ex) {
                        }
                    }
                }
                else if(p.equals(s5, "domain", true)) {
                    try {
                        if(!p.endsWith$default(s6, ".", false, 2, null)) {
                            String s7 = HostnamesKt.toCanonicalHost(StringsKt__StringsKt.removePrefix(s6, "."));
                            if(s7 != null) {
                                s3 = s7;
                                z3 = false;
                            }
                        }
                    }
                    catch(IllegalArgumentException unused_ex) {
                    }
                }
                else if(p.equals(s5, "path", true)) {
                    s4 = s6;
                }
                else if(p.equals(s5, "secure", true)) {
                    z = true;
                }
                else if(p.equals(s5, "httponly", true)) {
                    z1 = true;
                }
                v3 = v9 + 1;
            }
            if(v5 != 0x8000000000000000L) {
                if(v5 == -1L) {
                    v8 = v6;
                }
                else {
                    if(v5 <= 0x20C49BA5E353F7L) {
                        v7 = v5 * 1000L;
                    }
                    long v12 = v + v7;
                    v8 = Long.compare(v12, v) < 0 || v12 > 0xE677D21FDBFFL ? 0xE677D21FDBFFL : v12;
                }
            }
            String s8 = httpUrl0.host();
            if(s3 == null) {
                s9 = s8;
            }
            else {
                if(!Companion.b(s8, s3)) {
                    return null;
                }
                s9 = s3;
            }
            String s10 = "/";
            if(s8.length() != s9.length() && PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(s9) == null) {
                return null;
            }
            if(s4 != null && p.startsWith$default(s4, "/", false, 2, null)) {
                return new Cookie(s1, s2, v8, s9, s4, z, z1, z2, z3, null);
            }
            String s11 = httpUrl0.encodedPath();
            int v13 = StringsKt__StringsKt.lastIndexOf$default(s11, '/', 0, false, 6, null);
            if(v13 != 0) {
                s10 = s11.substring(0, v13);
                Intrinsics.checkNotNullExpressionValue(s10, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            return new Cookie(s1, s2, v8, s9, s10, z, z1, z2, z3, null);
        }

        @JvmStatic
        @NotNull
        public final List parseAll(@NotNull HttpUrl httpUrl0, @NotNull Headers headers0) {
            Intrinsics.checkNotNullParameter(httpUrl0, "url");
            Intrinsics.checkNotNullParameter(headers0, "headers");
            List list0 = headers0.values("Set-Cookie");
            int v = list0.size();
            List list1 = null;
            for(int v1 = 0; v1 < v; ++v1) {
                Cookie cookie0 = this.parse(httpUrl0, ((String)list0.get(v1)));
                if(cookie0 != null) {
                    if(list1 == null) {
                        list1 = new ArrayList();
                    }
                    list1.add(cookie0);
                }
            }
            if(list1 != null) {
                List list2 = Collections.unmodifiableList(list1);
                Intrinsics.checkNotNullExpressionValue(list2, "{\n        Collections.un…ableList(cookies)\n      }");
                return list2;
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    public static final Companion Companion;
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public static final Pattern j;
    public static final Pattern k;
    public static final Pattern l;
    public static final Pattern m;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "domain", imports = {}))
    @JvmName(name = "-deprecated_domain")
    @NotNull
    public final String -deprecated_domain() {
        return this.d;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "expiresAt", imports = {}))
    @JvmName(name = "-deprecated_expiresAt")
    public final long -deprecated_expiresAt() {
        return this.c;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hostOnly", imports = {}))
    @JvmName(name = "-deprecated_hostOnly")
    public final boolean -deprecated_hostOnly() {
        return this.i;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "httpOnly", imports = {}))
    @JvmName(name = "-deprecated_httpOnly")
    public final boolean -deprecated_httpOnly() {
        return this.g;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "name", imports = {}))
    @JvmName(name = "-deprecated_name")
    @NotNull
    public final String -deprecated_name() {
        return this.a;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "path", imports = {}))
    @JvmName(name = "-deprecated_path")
    @NotNull
    public final String -deprecated_path() {
        return this.e;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "persistent", imports = {}))
    @JvmName(name = "-deprecated_persistent")
    public final boolean -deprecated_persistent() {
        return this.h;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "secure", imports = {}))
    @JvmName(name = "-deprecated_secure")
    public final boolean -deprecated_secure() {
        return this.f;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "value", imports = {}))
    @JvmName(name = "-deprecated_value")
    @NotNull
    public final String -deprecated_value() {
        return this.b;
    }

    static {
        Cookie.Companion = new Companion(null);
        Cookie.j = Pattern.compile("(\\d{2,4})[^\\d]*");
        Cookie.k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
        Cookie.l = Pattern.compile("(\\d{1,2})[^\\d]*");
        Cookie.m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    }

    public Cookie(String s, String s1, long v, String s2, String s3, boolean z, boolean z1, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = s2;
        this.e = s3;
        this.f = z;
        this.g = z1;
        this.h = z2;
        this.i = z3;
    }

    @JvmName(name = "domain")
    @NotNull
    public final String domain() {
        return this.d;
    }

    // 去混淆评级： 中等(50)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof Cookie && Intrinsics.areEqual(((Cookie)object0).a, this.a) && Intrinsics.areEqual(((Cookie)object0).b, this.b) && ((Cookie)object0).c == this.c && Intrinsics.areEqual(((Cookie)object0).d, this.d) && Intrinsics.areEqual(((Cookie)object0).e, this.e) && ((Cookie)object0).f == this.f && ((Cookie)object0).g == this.g && ((Cookie)object0).h == this.h && ((Cookie)object0).i == this.i;
    }

    @JvmName(name = "expiresAt")
    public final long expiresAt() {
        return this.c;
    }

    @Override
    @IgnoreJRERequirement
    public int hashCode() {
        return Boolean.hashCode(this.i) + r0.a.e(r0.a.e(r0.a.e(q.c(q.c(wb.a.k(this.c, q.c(q.c(0x20F, 0x1F, this.a), 0x1F, this.b), 0x1F), 0x1F, this.d), 0x1F, this.e), 0x1F, this.f), 0x1F, this.g), 0x1F, this.h);
    }

    @JvmName(name = "hostOnly")
    public final boolean hostOnly() {
        return this.i;
    }

    @JvmName(name = "httpOnly")
    public final boolean httpOnly() {
        return this.g;
    }

    public final boolean matches(@NotNull HttpUrl httpUrl0) {
        Intrinsics.checkNotNullParameter(httpUrl0, "url");
        if(!(this.i ? Intrinsics.areEqual(httpUrl0.host(), this.d) : Companion.access$domainMatch(Cookie.Companion, httpUrl0.host(), this.d))) {
            return false;
        }
        return Companion.access$pathMatch(Cookie.Companion, httpUrl0, this.e) ? !this.f || httpUrl0.isHttps() : false;
    }

    @JvmName(name = "name")
    @NotNull
    public final String name() {
        return this.a;
    }

    @JvmStatic
    @Nullable
    public static final Cookie parse(@NotNull HttpUrl httpUrl0, @NotNull String s) {
        return Cookie.Companion.parse(httpUrl0, s);
    }

    @JvmStatic
    @NotNull
    public static final List parseAll(@NotNull HttpUrl httpUrl0, @NotNull Headers headers0) {
        return Cookie.Companion.parseAll(httpUrl0, headers0);
    }

    @JvmName(name = "path")
    @NotNull
    public final String path() {
        return this.e;
    }

    @JvmName(name = "persistent")
    public final boolean persistent() {
        return this.h;
    }

    @JvmName(name = "secure")
    public final boolean secure() {
        return this.f;
    }

    @Override
    @NotNull
    public String toString() {
        return this.toString$okhttp(false);
    }

    @NotNull
    public final String toString$okhttp(boolean z) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a);
        stringBuilder0.append('=');
        stringBuilder0.append(this.b);
        if(this.h) {
            long v = this.c;
            if(v == 0x8000000000000000L) {
                stringBuilder0.append("; max-age=0");
            }
            else {
                stringBuilder0.append("; expires=");
                stringBuilder0.append(DatesKt.toHttpDateString(new Date(v)));
            }
        }
        if(!this.i) {
            stringBuilder0.append("; domain=");
            if(z) {
                stringBuilder0.append(".");
            }
            stringBuilder0.append(this.d);
        }
        stringBuilder0.append("; path=");
        stringBuilder0.append(this.e);
        if(this.f) {
            stringBuilder0.append("; secure");
        }
        if(this.g) {
            stringBuilder0.append("; httponly");
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString()");
        return s;
    }

    @JvmName(name = "value")
    @NotNull
    public final String value() {
        return this.b;
    }
}

