package kotlin.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b%\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013J\u0018\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0017\u0010\u0012\u001A\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001Aj\u0002\b\u001Bj\u0002\b\u001Cj\u0002\b\u001Dj\u0002\b\u001Ej\u0002\b\u001Fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1¨\u00062"}, d2 = {"Lkotlin/text/CharCategory;", "", "", "char", "", "contains", "(C)Z", "", "a", "I", "getValue", "()I", "value", "", "b", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "Companion", "UNASSIGNED", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "TITLECASE_LETTER", "MODIFIER_LETTER", "OTHER_LETTER", "NON_SPACING_MARK", "ENCLOSING_MARK", "COMBINING_SPACING_MARK", "DECIMAL_DIGIT_NUMBER", "LETTER_NUMBER", "OTHER_NUMBER", "SPACE_SEPARATOR", "LINE_SEPARATOR", "PARAGRAPH_SEPARATOR", "CONTROL", "FORMAT", "PRIVATE_USE", "SURROGATE", "DASH_PUNCTUATION", "START_PUNCTUATION", "END_PUNCTUATION", "CONNECTOR_PUNCTUATION", "OTHER_PUNCTUATION", "MATH_SYMBOL", "CURRENCY_SYMBOL", "MODIFIER_SYMBOL", "OTHER_SYMBOL", "INITIAL_QUOTE_PUNCTUATION", "FINAL_QUOTE_PUNCTUATION", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum CharCategory {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/CharCategory$Companion;", "", "", "category", "Lkotlin/text/CharCategory;", "valueOf", "(I)Lkotlin/text/CharCategory;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final CharCategory valueOf(int v) {
            if(new IntRange(0, 16).contains(v)) {
                return (CharCategory)CharCategory.getEntries().get(v);
            }
            if(!new IntRange(18, 30).contains(v)) {
                throw new IllegalArgumentException("Category #" + v + " is not defined.");
            }
            return (CharCategory)CharCategory.getEntries().get(v - 1);
        }
    }

    UNASSIGNED(0, "Cn"),
    UPPERCASE_LETTER(1, "Lu"),
    LOWERCASE_LETTER(2, "Ll"),
    TITLECASE_LETTER(3, "Lt"),
    MODIFIER_LETTER(4, "Lm"),
    OTHER_LETTER(5, "Lo"),
    NON_SPACING_MARK(6, "Mn"),
    ENCLOSING_MARK(7, "Me"),
    COMBINING_SPACING_MARK(8, "Mc"),
    DECIMAL_DIGIT_NUMBER(9, "Nd"),
    LETTER_NUMBER(10, "Nl"),
    OTHER_NUMBER(11, "No"),
    SPACE_SEPARATOR(12, "Zs"),
    LINE_SEPARATOR(13, "Zl"),
    PARAGRAPH_SEPARATOR(14, "Zp"),
    CONTROL(15, "Cc"),
    FORMAT(16, "Cf"),
    PRIVATE_USE(18, "Co"),
    SURROGATE(19, "Cs"),
    DASH_PUNCTUATION(20, "Pd"),
    START_PUNCTUATION(21, "Ps"),
    END_PUNCTUATION(22, "Pe"),
    CONNECTOR_PUNCTUATION(23, "Pc"),
    OTHER_PUNCTUATION(24, "Po"),
    MATH_SYMBOL(25, "Sm"),
    CURRENCY_SYMBOL(26, "Sc"),
    MODIFIER_SYMBOL(27, "Sk"),
    OTHER_SYMBOL(28, "So"),
    INITIAL_QUOTE_PUNCTUATION(29, "Pi"),
    FINAL_QUOTE_PUNCTUATION(30, "Pf");

    @NotNull
    public static final Companion Companion;
    public final int a;
    public final String b;
    public static final CharCategory[] c;
    public static final EnumEntries d;

    static {
        CharCategory.c = arr_charCategory;
        Intrinsics.checkNotNullParameter(arr_charCategory, "entries");
        CharCategory.d = new a(arr_charCategory);
        CharCategory.Companion = new Companion(null);
    }

    public CharCategory(int v1, String s1) {
        this.a = v1;
        this.b = s1;
    }

    public final boolean contains(char c) {
        return Character.getType(c) == this.a;
    }

    @NotNull
    public final String getCode() {
        return this.b;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return CharCategory.d;
    }

    public final int getValue() {
        return this.a;
    }
}

