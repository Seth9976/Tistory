package kotlin.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002R\u001A\u0010\b\u001A\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R\u001A\u0010\u000B\u001A\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001A\u0004\b\n\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/text/RegexOption;", "", "Lkotlin/text/FlagEnum;", "", "a", "I", "getValue", "()I", "value", "b", "getMask", "mask", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum RegexOption implements FlagEnum {
    IGNORE_CASE(2),
    MULTILINE(8),
    LITERAL(16),
    UNIX_LINES(1),
    COMMENTS(4),
    DOT_MATCHES_ALL(0x20),
    CANON_EQ(0x80);

    public final int a;
    public final int b;
    public static final RegexOption[] c;
    public static final EnumEntries d;

    static {
        RegexOption.c = arr_regexOption;
        Intrinsics.checkNotNullParameter(arr_regexOption, "entries");
        RegexOption.d = new a(arr_regexOption);
    }

    public RegexOption(int v1) {
        this.a = v1;
        this.b = v1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return RegexOption.d;
    }

    @Override  // kotlin.text.FlagEnum
    public int getMask() {
        return this.b;
    }

    @Override  // kotlin.text.FlagEnum
    public int getValue() {
        return this.a;
    }
}

