package com.kakao.tistory.presentation.common.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.p;
import md.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\n\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u0006J\u001D\u0010\f\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\u0002¢\u0006\u0004\b\u000F\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/common/utils/UrlUtils;", "", "", "url", "", "isUrl", "(Ljava/lang/String;)Z", "getUrlWithHttps", "(Ljava/lang/String;)Ljava/lang/String;", "isGif", "isThumbnailUrl", "size", "toThumbnailUrl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "s", "getEncodedURI", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class UrlUtils {
    public static final int $stable;
    @NotNull
    public static final UrlUtils INSTANCE;
    public static final Lazy a;

    static {
        UrlUtils.INSTANCE = new UrlUtils();
        UrlUtils.a = c.lazy(b.a);
        UrlUtils.$stable = 8;
    }

    @NotNull
    public final String getEncodedURI(@NotNull String s) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(s, "s");
        Pattern pattern0 = Pattern.compile("[가-힣]");
        for(Matcher matcher0 = pattern0.matcher(s); matcher0.find(); matcher0 = pattern0.matcher(s)) {
            String s1 = s.substring(matcher0.start(), matcher0.end());
            Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
            String s2 = URLEncoder.encode(s1, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(s2, "encode(...)");
            s = p.replace(s, s1, s2, false);
        }
        return s;
    }

    @NotNull
    public final String getUrlWithHttps(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "url");
        return this.isUrl(s) ? s : "https://" + s;
    }

    public final boolean isGif(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "url");
        return new Regex(".*.gif$", RegexOption.IGNORE_CASE).matches(s);
    }

    public final boolean isThumbnailUrl(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "url");
        return ((Regex)UrlUtils.a.getValue()).matches(s);
    }

    public final boolean isUrl(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "url");
        Locale locale0 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale0, "getDefault(...)");
        String s1 = s.toLowerCase(locale0);
        Intrinsics.checkNotNullExpressionValue(s1, "toLowerCase(...)");
        if(!p.startsWith$default(s1, "http://", false, 2, null)) {
            Locale locale1 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale1, "getDefault(...)");
            String s2 = s.toLowerCase(locale1);
            Intrinsics.checkNotNullExpressionValue(s2, "toLowerCase(...)");
            return p.startsWith$default(s2, "https://", false, 2, null);
        }
        return true;
    }

    @NotNull
    public final String toThumbnailUrl(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "url");
        Intrinsics.checkNotNullParameter(s1, "size");
        return a5.b.f(2, "https://img1.daumcdn.net/thumb/%s/?scode=mtistory2&fname=%s", "format(...)", new Object[]{s1, URLEncoder.encode(s, "UTF-8")});
    }
}

