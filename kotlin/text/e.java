package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

public final class e implements MatchResult {
    public final Matcher a;
    public final CharSequence b;
    public final MatcherMatchResult.groups.1 c;
    public MatcherMatchResult.groupValues.1 d;

    public e(Matcher matcher0, CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(matcher0, "matcher");
        Intrinsics.checkNotNullParameter(charSequence0, "input");
        super();
        this.a = matcher0;
        this.b = charSequence0;
        this.c = new MatcherMatchResult.groups.1(this);
    }

    @Override  // kotlin.text.MatchResult
    public final Destructured getDestructured() {
        return DefaultImpls.getDestructured(this);
    }

    @Override  // kotlin.text.MatchResult
    public final List getGroupValues() {
        if(this.d == null) {
            this.d = new MatcherMatchResult.groupValues.1(this);
        }
        List list0 = this.d;
        Intrinsics.checkNotNull(list0);
        return list0;
    }

    @Override  // kotlin.text.MatchResult
    public final MatchGroupCollection getGroups() {
        return this.c;
    }

    @Override  // kotlin.text.MatchResult
    public final IntRange getRange() {
        return RegexKt.access$range(this.a);
    }

    @Override  // kotlin.text.MatchResult
    public final String getValue() {
        String s = this.a.group();
        Intrinsics.checkNotNullExpressionValue(s, "group(...)");
        return s;
    }

    @Override  // kotlin.text.MatchResult
    public final MatchResult next() {
        Matcher matcher0 = this.a;
        int v = matcher0.end() + (matcher0.end() == matcher0.start() ? 1 : 0);
        CharSequence charSequence0 = this.b;
        if(v <= charSequence0.length()) {
            Matcher matcher1 = matcher0.pattern().matcher(charSequence0);
            Intrinsics.checkNotNullExpressionValue(matcher1, "matcher(...)");
            return RegexKt.access$findNext(matcher1, v, charSequence0);
        }
        return null;
    }
}

