package kotlin.text;

import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0002\b0\b\u00C6\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000B\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u000B\u0010\u0004R\u0014\u0010\f\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000E\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u000E\u0010\u0004R\u001A\u0010\u000F\u001A\u00020\u00028\u0006X\u0087T\u00A2\u0006\f\n\u0004\b\u000F\u0010\u0004\u0012\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0012\u001A\u00020\u00028\u0006X\u0087T\u00A2\u0006\f\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001A\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001A\u0010\u0004R\u0014\u0010\u001B\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001B\u0010\u0004R\u0014\u0010\u001C\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001C\u0010\u0004R\u0014\u0010\u001D\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001D\u0010\u0004R\u0014\u0010\u001E\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001E\u0010\u0004R\u0014\u0010\u001F\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001F\u0010\u0004R\u0014\u0010 \u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010!\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b!\u0010\u0004R\u0014\u0010\"\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0014\u0010#\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b#\u0010\u0004R\u0014\u0010$\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b$\u0010\u0004R\u0014\u0010%\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b%\u0010\u0004R\u0014\u0010&\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b&\u0010\u0004R\u0014\u0010\'\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\'\u0010\u0004R\u0014\u0010(\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b(\u0010\u0004R\u0014\u0010)\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b)\u0010\u0004R\u0014\u0010*\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b*\u0010\u0004R\u0014\u0010+\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b+\u0010\u0004R\u0014\u0010,\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b,\u0010\u0004R\u0014\u0010-\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b-\u0010\u0004R\u001A\u0010.\u001A\u00020\u00028\u0006X\u0087T\u00A2\u0006\f\n\u0004\b.\u0010\u0004\u0012\u0004\b/\u0010\u0011R\u001A\u00100\u001A\u00020\u00028\u0006X\u0087T\u00A2\u0006\f\n\u0004\b0\u0010\u0004\u0012\u0004\b1\u0010\u0011\u00A8\u00062"}, d2 = {"Lkotlin/text/Typography;", "", "", "quote", "C", "dollar", "amp", "less", "greater", "nbsp", "times", "cent", "pound", "section", "copyright", "leftGuillemet", "getLeftGuillemet$annotations", "()V", "rightGuillemet", "getRightGuillemet$annotations", "registered", "degree", "plusMinus", "paragraph", "middleDot", "half", "ndash", "mdash", "leftSingleQuote", "rightSingleQuote", "lowSingleQuote", "leftDoubleQuote", "rightDoubleQuote", "lowDoubleQuote", "dagger", "doubleDagger", "bullet", "ellipsis", "prime", "doublePrime", "euro", "tm", "almostEqual", "notEqual", "lessOrEqual", "greaterOrEqual", "leftGuillemete", "getLeftGuillemete$annotations", "rightGuillemete", "getRightGuillemete$annotations", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Typography {
    @NotNull
    public static final Typography INSTANCE = null;
    public static final char almostEqual = '≈';
    public static final char amp = '&';
    public static final char bullet = '•';
    public static final char cent = '¢';
    public static final char copyright = '©';
    public static final char dagger = '†';
    public static final char degree = '°';
    public static final char dollar = '$';
    public static final char doubleDagger = '‡';
    public static final char doublePrime = '″';
    public static final char ellipsis = '…';
    public static final char euro = '€';
    public static final char greater = '>';
    public static final char greaterOrEqual = '≥';
    public static final char half = '½';
    public static final char leftDoubleQuote = '“';
    public static final char leftGuillemet = '«';
    public static final char leftGuillemete = '«';
    public static final char leftSingleQuote = '‘';
    public static final char less = '<';
    public static final char lessOrEqual = '≤';
    public static final char lowDoubleQuote = '„';
    public static final char lowSingleQuote = '‚';
    public static final char mdash = '—';
    public static final char middleDot = '·';
    public static final char nbsp = ' ';
    public static final char ndash = '–';
    public static final char notEqual = '≠';
    public static final char paragraph = '¶';
    public static final char plusMinus = '±';
    public static final char pound = '£';
    public static final char prime = '′';
    public static final char quote = '\"';
    public static final char registered = '®';
    public static final char rightDoubleQuote = '”';
    public static final char rightGuillemet = '»';
    public static final char rightGuillemete = '»';
    public static final char rightSingleQuote = '’';
    public static final char section = '§';
    public static final char times = '×';
    public static final char tm = '™';

    static {
        Typography.INSTANCE = new Typography();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @SinceKotlin(version = "1.6")
    public static void getLeftGuillemet$annotations() {
    }

    @Deprecated(message = "This constant has a typo in the name. Use leftGuillemet instead.", replaceWith = @ReplaceWith(expression = "Typography.leftGuillemet", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.6")
    public static void getLeftGuillemete$annotations() {
    }

    @SinceKotlin(version = "1.6")
    public static void getRightGuillemet$annotations() {
    }

    @Deprecated(message = "This constant has a typo in the name. Use rightGuillemet instead.", replaceWith = @ReplaceWith(expression = "Typography.rightGuillemet", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.6")
    public static void getRightGuillemete$annotations() {
    }
}

