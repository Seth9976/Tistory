package kotlin.text;

import a5.b;
import fe.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.k;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\f\u0018\u0000 72\u00060\u0001j\u0002`\u0002:\u00017B\u0011\b\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\u0005\u0010\fB\u001F\b\u0016\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\n0\r\u00A2\u0006\u0004\b\u0005\u0010\u000FJ\u0018\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00020\u0010H\u0086\u0004\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0019\u001A\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0017\u001A\u00020\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ%\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00180\u001B2\u0006\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0017\u001A\u00020\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010\u001E\u001A\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\u0004\b\u001E\u0010\u001FJ!\u0010!\u001A\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010 \u001A\u00020\u0016H\u0007\u00A2\u0006\u0004\b!\u0010\u001AJ\u001F\u0010\"\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010 \u001A\u00020\u0016H\u0007\u00A2\u0006\u0004\b\"\u0010#J\u001D\u0010%\u001A\u00020\u00072\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010$\u001A\u00020\u0007\u00A2\u0006\u0004\b%\u0010&J)\u0010%\u001A\u00020\u00072\u0006\u0010\u0011\u001A\u00020\u00102\u0012\u0010(\u001A\u000E\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\'\u00A2\u0006\u0004\b%\u0010)J\u001D\u0010*\u001A\u00020\u00072\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010$\u001A\u00020\u0007\u00A2\u0006\u0004\b*\u0010&J%\u0010-\u001A\b\u0012\u0004\u0012\u00020\u00070,2\u0006\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010+\u001A\u00020\u0016\u00A2\u0006\u0004\b-\u0010.J\'\u0010/\u001A\b\u0012\u0004\u0012\u00020\u00070\u001B2\u0006\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010+\u001A\u00020\u0016H\u0007\u00A2\u0006\u0004\b/\u0010\u001DJ\u000F\u00100\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b0\u00101J\r\u00102\u001A\u00020\u0003\u00A2\u0006\u0004\b2\u00103R\u0011\u0010\b\u001A\u00020\u00078F\u00A2\u0006\u0006\u001A\u0004\b4\u00101R\u0017\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\n0\r8F\u00A2\u0006\u0006\u001A\u0004\b5\u00106\u00A8\u00068"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "", "pattern", "(Ljava/lang/String;)V", "Lkotlin/text/RegexOption;", "option", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "", "options", "(Ljava/lang/String;Ljava/util/Set;)V", "", "input", "", "matches", "(Ljava/lang/CharSequence;)Z", "containsMatchIn", "", "startIndex", "Lkotlin/text/MatchResult;", "find", "(Ljava/lang/CharSequence;I)Lkotlin/text/MatchResult;", "Lkotlin/sequences/Sequence;", "findAll", "(Ljava/lang/CharSequence;I)Lkotlin/sequences/Sequence;", "matchEntire", "(Ljava/lang/CharSequence;)Lkotlin/text/MatchResult;", "index", "matchAt", "matchesAt", "(Ljava/lang/CharSequence;I)Z", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "transform", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "replaceFirst", "limit", "", "split", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "splitToSequence", "toString", "()Ljava/lang/String;", "toPattern", "()Ljava/util/regex/Pattern;", "getPattern", "getOptions", "()Ljava/util/Set;", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n22#2,3:398\n1#3:401\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n103#1:398,3\n*E\n"})
public final class Regex implements Serializable {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "", "literal", "Lkotlin/text/Regex;", "fromLiteral", "(Ljava/lang/String;)Lkotlin/text/Regex;", "escape", "(Ljava/lang/String;)Ljava/lang/String;", "escapeReplacement", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final int access$ensureUnicodeCase(Companion regex$Companion0, int v) {
            regex$Companion0.getClass();
            return (v & 2) == 0 ? v : v | 0x40;
        }

        @NotNull
        public final String escape(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "literal");
            String s1 = Pattern.quote(s);
            Intrinsics.checkNotNullExpressionValue(s1, "quote(...)");
            return s1;
        }

        @NotNull
        public final String escapeReplacement(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "literal");
            String s1 = Matcher.quoteReplacement(s);
            Intrinsics.checkNotNullExpressionValue(s1, "quoteReplacement(...)");
            return s1;
        }

        @NotNull
        public final Regex fromLiteral(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "literal");
            return new Regex(s, RegexOption.LITERAL);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Pattern a;
    public Set b;

    static {
        Regex.Companion = new Companion(null);
    }

    public Regex(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "pattern");
        Pattern pattern0 = Pattern.compile(s);
        Intrinsics.checkNotNullExpressionValue(pattern0, "compile(...)");
        this(pattern0);
    }

    public Regex(@NotNull String s, @NotNull Set set0) {
        Intrinsics.checkNotNullParameter(s, "pattern");
        Intrinsics.checkNotNullParameter(set0, "options");
        int v = RegexKt.access$toInt(set0);
        Pattern pattern0 = Pattern.compile(s, Companion.access$ensureUnicodeCase(Regex.Companion, v));
        Intrinsics.checkNotNullExpressionValue(pattern0, "compile(...)");
        this(pattern0);
    }

    public Regex(@NotNull String s, @NotNull RegexOption regexOption0) {
        Intrinsics.checkNotNullParameter(s, "pattern");
        Intrinsics.checkNotNullParameter(regexOption0, "option");
        Pattern pattern0 = Pattern.compile(s, Companion.access$ensureUnicodeCase(Regex.Companion, regexOption0.getValue()));
        Intrinsics.checkNotNullExpressionValue(pattern0, "compile(...)");
        this(pattern0);
    }

    @PublishedApi
    public Regex(@NotNull Pattern pattern0) {
        Intrinsics.checkNotNullParameter(pattern0, "nativePattern");
        super();
        this.a = pattern0;
    }

    public final boolean containsMatchIn(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        return this.a.matcher(charSequence0).find();
    }

    @Nullable
    public final MatchResult find(@NotNull CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        Matcher matcher0 = this.a.matcher(charSequence0);
        Intrinsics.checkNotNullExpressionValue(matcher0, "matcher(...)");
        return RegexKt.access$findNext(matcher0, v, charSequence0);
    }

    public static MatchResult find$default(Regex regex0, CharSequence charSequence0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return regex0.find(charSequence0, v);
    }

    @NotNull
    public final Sequence findAll(@NotNull CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        if(v >= 0 && v <= charSequence0.length()) {
            return SequencesKt__SequencesKt.generateSequence(new n(this, charSequence0, v), f.a);
        }
        StringBuilder stringBuilder0 = b.s(v, "Start index out of bounds: ", ", input length: ");
        stringBuilder0.append(charSequence0.length());
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public static Sequence findAll$default(Regex regex0, CharSequence charSequence0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return regex0.findAll(charSequence0, v);
    }

    @NotNull
    public final Set getOptions() {
        Set set0 = this.b;
        if(set0 == null) {
            int v = this.a.flags();
            EnumSet enumSet0 = EnumSet.allOf(RegexOption.class);
            Intrinsics.checkNotNull(enumSet0);
            o.retainAll(enumSet0, new Function1() {
                public final int w;

                {
                    this.w = v;
                    super(1);
                }

                @NotNull
                public final Boolean invoke(Enum enum0) {
                    int v = ((FlagEnum)enum0).getMask();
                    int v1 = ((FlagEnum)enum0).getValue();
                    return (v & this.w) == v1;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.invoke(((Enum)object0));
                }
            });
            set0 = Collections.unmodifiableSet(enumSet0);
            Intrinsics.checkNotNullExpressionValue(set0, "unmodifiableSet(...)");
            this.b = set0;
        }
        return set0;
    }

    @NotNull
    public final String getPattern() {
        String s = this.a.pattern();
        Intrinsics.checkNotNullExpressionValue(s, "pattern(...)");
        return s;
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public final MatchResult matchAt(@NotNull CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        Matcher matcher0 = this.a.matcher(charSequence0).useAnchoringBounds(false).useTransparentBounds(true).region(v, charSequence0.length());
        if(matcher0.lookingAt()) {
            Intrinsics.checkNotNull(matcher0);
            return new e(matcher0, charSequence0);
        }
        return null;
    }

    @Nullable
    public final MatchResult matchEntire(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        Matcher matcher0 = this.a.matcher(charSequence0);
        Intrinsics.checkNotNullExpressionValue(matcher0, "matcher(...)");
        return RegexKt.access$matchEntire(matcher0, charSequence0);
    }

    public final boolean matches(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        return this.a.matcher(charSequence0).matches();
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public final boolean matchesAt(@NotNull CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        return this.a.matcher(charSequence0).useAnchoringBounds(false).useTransparentBounds(true).region(v, charSequence0.length()).lookingAt();
    }

    @NotNull
    public final String replace(@NotNull CharSequence charSequence0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        Intrinsics.checkNotNullParameter(s, "replacement");
        String s1 = this.a.matcher(charSequence0).replaceAll(s);
        Intrinsics.checkNotNullExpressionValue(s1, "replaceAll(...)");
        return s1;
    }

    @NotNull
    public final String replace(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        Intrinsics.checkNotNullParameter(function10, "transform");
        int v = 0;
        MatchResult matchResult0 = Regex.find$default(this, charSequence0, 0, 2, null);
        if(matchResult0 == null) {
            return charSequence0.toString();
        }
        int v1 = charSequence0.length();
        StringBuilder stringBuilder0 = new StringBuilder(v1);
        do {
            stringBuilder0.append(charSequence0, v, ((int)matchResult0.getRange().getStart()));
            stringBuilder0.append(((CharSequence)function10.invoke(matchResult0)));
            v = ((int)matchResult0.getRange().getEndInclusive()) + 1;
            matchResult0 = matchResult0.next();
        }
        while(v < v1 && matchResult0 != null);
        if(v < v1) {
            stringBuilder0.append(charSequence0, v, v1);
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @NotNull
    public final String replaceFirst(@NotNull CharSequence charSequence0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        Intrinsics.checkNotNullParameter(s, "replacement");
        String s1 = this.a.matcher(charSequence0).replaceFirst(s);
        Intrinsics.checkNotNullExpressionValue(s1, "replaceFirst(...)");
        return s1;
    }

    @NotNull
    public final List split(@NotNull CharSequence charSequence0, int v) {
        int v1 = 10;
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        StringsKt__StringsKt.requireNonNegativeLimit(v);
        Matcher matcher0 = this.a.matcher(charSequence0);
        if(v != 1 && matcher0.find()) {
            if(v > 0) {
                v1 = c.coerceAtMost(v, 10);
            }
            List list0 = new ArrayList(v1);
            int v2 = 0;
            do {
                ((ArrayList)list0).add(charSequence0.subSequence(v2, matcher0.start()).toString());
                v2 = matcher0.end();
            }
            while((v - 1 < 0 || ((ArrayList)list0).size() != v - 1) && matcher0.find());
            ((ArrayList)list0).add(charSequence0.subSequence(v2, charSequence0.length()).toString());
            return list0;
        }
        return k.listOf(charSequence0.toString());
    }

    public static List split$default(Regex regex0, CharSequence charSequence0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return regex0.split(charSequence0, v);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public final Sequence splitToSequence(@NotNull CharSequence charSequence0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        StringsKt__StringsKt.requireNonNegativeLimit(v);
        return SequencesKt__SequenceBuilderKt.sequence(new g(this, charSequence0, v, null));
    }

    public static Sequence splitToSequence$default(Regex regex0, CharSequence charSequence0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return regex0.splitToSequence(charSequence0, v);
    }

    @NotNull
    public final Pattern toPattern() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        String s = this.a.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }
}

