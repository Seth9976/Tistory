package kotlin.internal.jdk8;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.internal.jdk7.JDK7PlatformImplementations;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.jdk8.PlatformThreadLocalRandom;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vd.a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u000EB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000F"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "<init>", "()V", "Ljava/util/regex/MatchResult;", "matchResult", "", "name", "Lkotlin/text/MatchGroup;", "getMatchResultNamedGroup", "(Ljava/util/regex/MatchResult;Ljava/lang/String;)Lkotlin/text/MatchGroup;", "Lkotlin/random/Random;", "defaultPlatformRandom", "()Lkotlin/random/Random;", "vd/a", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class JDK8PlatformImplementations extends JDK7PlatformImplementations {
    @Override  // kotlin.internal.PlatformImplementations
    @NotNull
    public Random defaultPlatformRandom() {
        return a.a != null && ((int)a.a) < 34 ? super.defaultPlatformRandom() : new PlatformThreadLocalRandom();
    }

    @Override  // kotlin.internal.PlatformImplementations
    @Nullable
    public MatchGroup getMatchResultNamedGroup(@NotNull MatchResult matchResult0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(matchResult0, "matchResult");
        Intrinsics.checkNotNullParameter(s, "name");
        Matcher matcher0 = matchResult0 instanceof Matcher ? ((Matcher)matchResult0) : null;
        if(matcher0 == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        IntRange intRange0 = new IntRange(matcher0.start(s), matcher0.end(s) - 1);
        if(((int)intRange0.getStart()) >= 0) {
            String s1 = matcher0.group(s);
            Intrinsics.checkNotNullExpressionValue(s1, "group(...)");
            return new MatchGroup(s1, intRange0);
        }
        return null;
    }
}

