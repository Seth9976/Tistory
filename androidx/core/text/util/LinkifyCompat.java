package androidx.core.text.util;

import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify.MatchFilter;
import android.text.util.Linkify.TransformFilter;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.text.android.j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l3.a;
import l3.b;
import l3.c;
import l3.d;

public final class LinkifyCompat {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LinkifyMask {
    }

    public static final String[] a;
    public static final j b;

    static {
        LinkifyCompat.a = new String[0];
        LinkifyCompat.b = new j(5);
    }

    public static void a(TextView textView0) {
        if(!(textView0.getMovementMethod() instanceof LinkMovementMethod) && textView0.getLinksClickable()) {
            textView0.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public static void addLinks(@NonNull TextView textView0, @NonNull Pattern pattern0, @Nullable String s) {
        Linkify.addLinks(textView0, pattern0, s);
    }

    public static void addLinks(@NonNull TextView textView0, @NonNull Pattern pattern0, @Nullable String s, @Nullable Linkify.MatchFilter linkify$MatchFilter0, @Nullable Linkify.TransformFilter linkify$TransformFilter0) {
        Linkify.addLinks(textView0, pattern0, s, linkify$MatchFilter0, linkify$TransformFilter0);
    }

    // 去混淆评级： 低(20)
    public static void addLinks(@NonNull TextView textView0, @NonNull Pattern pattern0, @Nullable String s, @Nullable String[] arr_s, @Nullable Linkify.MatchFilter linkify$MatchFilter0, @Nullable Linkify.TransformFilter linkify$TransformFilter0) {
        c.a(textView0, pattern0, s, arr_s, linkify$MatchFilter0, linkify$TransformFilter0);
    }

    // 去混淆评级： 低(40)
    public static boolean addLinks(@NonNull Spannable spannable0, int v) {
        return Linkify.addLinks(spannable0, v);
    }

    // 去混淆评级： 低(30)
    public static boolean addLinks(@NonNull Spannable spannable0, @NonNull Pattern pattern0, @Nullable String s) {
        return Linkify.addLinks(spannable0, pattern0, s);
    }

    // 去混淆评级： 低(30)
    public static boolean addLinks(@NonNull Spannable spannable0, @NonNull Pattern pattern0, @Nullable String s, @Nullable Linkify.MatchFilter linkify$MatchFilter0, @Nullable Linkify.TransformFilter linkify$TransformFilter0) {
        return Linkify.addLinks(spannable0, pattern0, s, linkify$MatchFilter0, linkify$TransformFilter0);
    }

    // 去混淆评级： 中等(60)
    public static boolean addLinks(@NonNull Spannable spannable0, @NonNull Pattern pattern0, @Nullable String s, @Nullable String[] arr_s, @Nullable Linkify.MatchFilter linkify$MatchFilter0, @Nullable Linkify.TransformFilter linkify$TransformFilter0) {
        return c.b(spannable0, pattern0, s, arr_s, linkify$MatchFilter0, linkify$TransformFilter0);
    }

    // 去混淆评级： 中等(60)
    public static boolean addLinks(@NonNull TextView textView0, int v) {
        return Linkify.addLinks(textView0, v);
    }

    public static String b(String s) {
        MatchResult matchResult2;
        MatchResult matchResult1;
        int v7;
        if(Build.VERSION.SDK_INT >= 28) {
            return WebView.findAddress(s);
        }
        Pattern pattern0 = b.c;
        Matcher matcher0 = pattern0.matcher(s);
        int v = 0;
        while(matcher0.find(v)) {
            if(b.a(matcher0.group(0))) {
                int v1 = matcher0.start();
                int v2 = matcher0.end();
                Pattern pattern1 = b.b;
                Matcher matcher1 = pattern1.matcher(s);
                String s1 = "";
                boolean z = false;
                int v3 = -1;
                int v4 = -1;
                int v5 = 1;
                int v6 = 1;
                boolean z1 = true;
                while(true) {
                    if(v2 < s.length()) {
                        if(!matcher1.find(v2)) {
                            v7 = -s.length();
                            break;
                        }
                        else if(matcher1.end() - matcher1.start() > 25) {
                            v7 = -matcher1.end();
                            break;
                        }
                        else {
                            while(v2 < matcher1.start()) {
                                if("\n\u000B\f\r\u0085  ".indexOf(s.charAt(v2)) != -1) {
                                    ++v5;
                                }
                                ++v2;
                            }
                            if(v5 <= 5) {
                                ++v6;
                                if(v6 <= 14) {
                                    if(v2 > 0 && ":,\"\'\t                　\n\u000B\f\r\u0085  ".indexOf(s.charAt(v2 - 1)) == -1) {
                                        matchResult1 = null;
                                    }
                                    else {
                                        Matcher matcher2 = pattern0.matcher(s).region(v2, s.length());
                                        if(matcher2.lookingAt()) {
                                            MatchResult matchResult0 = matcher2.toMatchResult();
                                            matchResult1 = b.a(matchResult0.group(0)) ? matchResult0 : null;
                                        }
                                        else {
                                            matchResult1 = null;
                                        }
                                    }
                                    if(matchResult1 == null) {
                                        String s2 = matcher1.group(0);
                                        if(b.e.matcher(s2).matches()) {
                                            z = true;
                                        }
                                        else if(v6 == 5 && !z) {
                                            v2 = matcher1.end();
                                            goto label_92;
                                        }
                                        else if(z && v6 > 4) {
                                            if(v2 > 0 && ",*•\t                　\n\u000B\f\r\u0085  ".indexOf(s.charAt(v2 - 1)) == -1) {
                                                matchResult2 = null;
                                            }
                                            else {
                                                Matcher matcher3 = b.d.matcher(s).region(v2, s.length());
                                                if(matcher3.lookingAt()) {
                                                    matchResult2 = matcher3.toMatchResult();
                                                }
                                            }
                                            if(matchResult2 != null) {
                                                if(!s1.equals("et") || !matchResult2.group(0).equals("al")) {
                                                    Matcher matcher4 = pattern1.matcher(s);
                                                    if(matcher4.find(matchResult2.end())) {
                                                        String s3 = matcher4.group(0);
                                                        int v8;
                                                        for(v8 = matchResult2.groupCount(); v8 > 0; --v8) {
                                                            if(matchResult2.group(v8) != null) {
                                                                --v8;
                                                                break;
                                                            }
                                                        }
                                                        if(b.g.matcher(s3).matches()) {
                                                            a a0 = b.a[v8];
                                                            a0.getClass();
                                                            int v9 = Integer.parseInt(s3.substring(0, 2));
                                                            if(a0.a <= v9 && v9 <= a0.b || v9 == a0.c || v9 == a0.d) {
                                                                v7 = matcher4.end();
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        v4 = matchResult2.end();
                                                    }
                                                }
                                                else {
                                                    v2 = matchResult2.end();
                                                    goto label_92;
                                                }
                                            }
                                        }
                                        z1 = false;
                                    }
                                    else if(z1 && v5 > 1) {
                                        v7 = -v2;
                                        break;
                                    }
                                    else if(v3 == -1) {
                                        v3 = v2;
                                    }
                                    s1 = matcher1.group(0);
                                    v2 = matcher1.end();
                                    continue;
                                }
                            }
                        }
                    }
                label_92:
                    if(v4 > 0) {
                        v7 = v4;
                    }
                    else {
                        if(v3 <= 0) {
                            v3 = v2;
                        }
                        v7 = -v3;
                    }
                    break;
                }
                if(v7 > 0) {
                    return s.substring(v1, v7);
                }
                v = -v7;
            }
            else {
                v = matcher0.end();
            }
        }
        return null;
    }

    public static void c(ArrayList arrayList0, Spannable spannable0, Pattern pattern0, String[] arr_s, Linkify.MatchFilter linkify$MatchFilter0) {
        Matcher matcher0 = pattern0.matcher(spannable0);
        while(matcher0.find()) {
            int v = matcher0.start();
            int v1 = matcher0.end();
            String s = matcher0.group(0);
            if((linkify$MatchFilter0 == null || linkify$MatchFilter0.acceptMatch(spannable0, v, v1)) && s != null) {
                d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
                d0.b = LinkifyCompat.d(s, arr_s, matcher0, null);
                d0.c = v;
                d0.d = v1;
                arrayList0.add(d0);
            }
        }
    }

    public static String d(String s, String[] arr_s, Matcher matcher0, Linkify.TransformFilter linkify$TransformFilter0) {
        boolean z;
        if(linkify$TransformFilter0 != null) {
            s = linkify$TransformFilter0.transformUrl(matcher0, s);
        }
        for(int v = 0; true; ++v) {
            z = false;
            if(v >= arr_s.length) {
                break;
            }
            z = true;
            String s1 = arr_s[v];
            if(s.regionMatches(true, 0, s1, 0, s1.length())) {
                if(s.regionMatches(false, 0, s1, 0, s1.length())) {
                    break;
                }
                StringBuilder stringBuilder0 = a5.b.t(s1);
                stringBuilder0.append(s.substring(s1.length()));
                return stringBuilder0.toString();
            }
        }
        return z || arr_s.length <= 0 ? s : r0.a.o(new StringBuilder(), arr_s[0], s);
    }

    public static boolean e() [...] // 潜在的解密器
}

