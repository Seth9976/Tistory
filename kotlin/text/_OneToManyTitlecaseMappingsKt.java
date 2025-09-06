package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000E\n\u0002\u0010\f\n\u0000\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"titlecaseImpl", "", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class _OneToManyTitlecaseMappingsKt {
    @NotNull
    public static final String titlecaseImpl(char c) {
        String s = String.valueOf(c);
        Intrinsics.checkNotNull(s, "null cannot be cast to non-null type java.lang.String");
        Locale locale0 = Locale.ROOT;
        String s1 = s.toUpperCase(locale0);
        Intrinsics.checkNotNullExpressionValue(s1, "toUpperCase(...)");
        if(s1.length() > 1) {
            if(c != 329) {
                Intrinsics.checkNotNull(s1, "null cannot be cast to non-null type java.lang.String");
                String s2 = s1.substring(1);
                Intrinsics.checkNotNullExpressionValue(s2, "substring(...)");
                Intrinsics.checkNotNull(s2, "null cannot be cast to non-null type java.lang.String");
                String s3 = s2.toLowerCase(locale0);
                Intrinsics.checkNotNullExpressionValue(s3, "toLowerCase(...)");
                return s1.charAt(0) + s3;
            }
            return s1;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
}

