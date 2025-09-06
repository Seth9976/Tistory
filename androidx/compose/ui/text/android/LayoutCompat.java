package androidx.compose.ui.text.android;

import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u00C0\u0002\u0018\u00002\u00020\u0001:\b=>?@ABCDR\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000B\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u000B\u0010\u0004R\u0014\u0010\f\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000E\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u000E\u0010\u0004R\u0014\u0010\u000F\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u000F\u0010\u0004R\u0014\u0010\u0010\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001A\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001A\u0010\u0004R\u0014\u0010\u001B\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001B\u0010\u0004R\u0014\u0010\u001C\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001C\u0010\u0004R\u0014\u0010\u001D\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001D\u0010\u0004R\u0014\u0010\u001E\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001E\u0010\u0004R\u0014\u0010\u001F\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001F\u0010\u0004R\u0014\u0010 \u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010!\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b!\u0010\u0004R\u0014\u0010\"\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0014\u0010$\u001A\u00020#8\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001A\u00020#8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010(\u001A\u00020\'8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b*\u0010\u0004R\u0014\u0010+\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b+\u0010\u0004R\u0014\u0010,\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b,\u0010\u0004R\u0014\u0010-\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b-\u0010\u0004R\u0014\u0010.\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b.\u0010\u0004R\u0014\u0010/\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b/\u0010\u0004R\u0014\u00100\u001A\u00020\'8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b0\u0010)R\u001A\u00106\u001A\u0002018\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105R\u001A\u0010<\u001A\u0002078\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010;\u00A8\u0006E"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat;", "", "", "ALIGN_NORMAL", "I", "ALIGN_OPPOSITE", "ALIGN_CENTER", "ALIGN_LEFT", "ALIGN_RIGHT", "JUSTIFICATION_MODE_NONE", "JUSTIFICATION_MODE_INTER_WORD", "HYPHENATION_FREQUENCY_NONE", "HYPHENATION_FREQUENCY_NORMAL", "HYPHENATION_FREQUENCY_NORMAL_FAST", "HYPHENATION_FREQUENCY_FULL", "HYPHENATION_FREQUENCY_FULL_FAST", "BREAK_STRATEGY_SIMPLE", "BREAK_STRATEGY_HIGH_QUALITY", "BREAK_STRATEGY_BALANCED", "LINE_BREAK_STYLE_NONE", "LINE_BREAK_STYLE_LOOSE", "LINE_BREAK_STYLE_NORMAL", "LINE_BREAK_STYLE_STRICT", "LINE_BREAK_WORD_STYLE_NONE", "LINE_BREAK_WORD_STYLE_PHRASE", "TEXT_DIRECTION_LTR", "TEXT_DIRECTION_RTL", "TEXT_DIRECTION_FIRST_STRONG_LTR", "TEXT_DIRECTION_FIRST_STRONG_RTL", "TEXT_DIRECTION_ANY_RTL_LTR", "TEXT_DIRECTION_LOCALE", "TEXT_GRANULARITY_CHARACTER", "TEXT_GRANULARITY_WORD", "DEFAULT_ALIGNMENT", "DEFAULT_TEXT_DIRECTION", "", "DEFAULT_LINESPACING_MULTIPLIER", "F", "DEFAULT_LINESPACING_EXTRA", "", "DEFAULT_INCLUDE_PADDING", "Z", "DEFAULT_MAX_LINES", "DEFAULT_BREAK_STRATEGY", "DEFAULT_LINE_BREAK_STYLE", "DEFAULT_LINE_BREAK_WORD_STYLE", "DEFAULT_HYPHENATION_FREQUENCY", "DEFAULT_JUSTIFICATION_MODE", "DEFAULT_FALLBACK_LINE_SPACING", "Landroid/text/Layout$Alignment;", "a", "Landroid/text/Layout$Alignment;", "getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release", "()Landroid/text/Layout$Alignment;", "DEFAULT_LAYOUT_ALIGNMENT", "Landroid/text/TextDirectionHeuristic;", "b", "Landroid/text/TextDirectionHeuristic;", "getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release", "()Landroid/text/TextDirectionHeuristic;", "DEFAULT_TEXT_DIRECTION_HEURISTIC", "BreakStrategy", "HyphenationFrequency", "JustificationMode", "LineBreakStyle", "LineBreakWordStyle", "TextDirection", "TextGranularity", "TextLayoutAlignment", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LayoutCompat {
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$BreakStrategy;", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface BreakStrategy {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$HyphenationFrequency;", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface HyphenationFrequency {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$JustificationMode;", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface JustificationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$LineBreakStyle;", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface LineBreakStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$LineBreakWordStyle;", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface LineBreakWordStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$TextDirection;", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface TextDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$TextGranularity;", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface TextGranularity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$TextLayoutAlignment;", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface TextLayoutAlignment {
    }

    public static final int $stable = 0;
    public static final int ALIGN_CENTER = 2;
    public static final int ALIGN_LEFT = 3;
    public static final int ALIGN_NORMAL = 0;
    public static final int ALIGN_OPPOSITE = 1;
    public static final int ALIGN_RIGHT = 4;
    public static final int BREAK_STRATEGY_BALANCED = 2;
    public static final int BREAK_STRATEGY_HIGH_QUALITY = 1;
    public static final int BREAK_STRATEGY_SIMPLE = 0;
    public static final int DEFAULT_ALIGNMENT = 0;
    public static final int DEFAULT_BREAK_STRATEGY = 0;
    public static final boolean DEFAULT_FALLBACK_LINE_SPACING = true;
    public static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    public static final boolean DEFAULT_INCLUDE_PADDING = false;
    public static final int DEFAULT_JUSTIFICATION_MODE = 0;
    public static final float DEFAULT_LINESPACING_EXTRA = 0.0f;
    public static final float DEFAULT_LINESPACING_MULTIPLIER = 1.0f;
    public static final int DEFAULT_LINE_BREAK_STYLE = 0;
    public static final int DEFAULT_LINE_BREAK_WORD_STYLE = 0;
    public static final int DEFAULT_MAX_LINES = 0x7FFFFFFF;
    public static final int DEFAULT_TEXT_DIRECTION = 2;
    public static final int HYPHENATION_FREQUENCY_FULL = 2;
    public static final int HYPHENATION_FREQUENCY_FULL_FAST = 4;
    public static final int HYPHENATION_FREQUENCY_NONE = 0;
    public static final int HYPHENATION_FREQUENCY_NORMAL = 1;
    public static final int HYPHENATION_FREQUENCY_NORMAL_FAST = 3;
    @NotNull
    public static final LayoutCompat INSTANCE = null;
    public static final int JUSTIFICATION_MODE_INTER_WORD = 1;
    public static final int JUSTIFICATION_MODE_NONE = 0;
    public static final int LINE_BREAK_STYLE_LOOSE = 1;
    public static final int LINE_BREAK_STYLE_NONE = 0;
    public static final int LINE_BREAK_STYLE_NORMAL = 2;
    public static final int LINE_BREAK_STYLE_STRICT = 3;
    public static final int LINE_BREAK_WORD_STYLE_NONE = 0;
    public static final int LINE_BREAK_WORD_STYLE_PHRASE = 1;
    public static final int TEXT_DIRECTION_ANY_RTL_LTR = 4;
    public static final int TEXT_DIRECTION_FIRST_STRONG_LTR = 2;
    public static final int TEXT_DIRECTION_FIRST_STRONG_RTL = 3;
    public static final int TEXT_DIRECTION_LOCALE = 5;
    public static final int TEXT_DIRECTION_LTR = 0;
    public static final int TEXT_DIRECTION_RTL = 1;
    public static final int TEXT_GRANULARITY_CHARACTER = 0;
    public static final int TEXT_GRANULARITY_WORD = 1;
    public static final Layout.Alignment a;
    public static final TextDirectionHeuristic b;

    static {
        LayoutCompat.INSTANCE = new LayoutCompat();  // 初始化器: Ljava/lang/Object;-><init>()V
        LayoutCompat.a = Layout.Alignment.ALIGN_NORMAL;
        LayoutCompat.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        LayoutCompat.$stable = 8;
    }

    @NotNull
    public final Layout.Alignment getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() {
        return LayoutCompat.a;
    }

    @NotNull
    public final TextDirectionHeuristic getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() {
        return LayoutCompat.b;
    }
}

