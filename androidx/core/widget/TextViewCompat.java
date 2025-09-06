package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode.Callback;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.text.PrecomputedTextCompat.Params.Builder;
import androidx.core.text.PrecomputedTextCompat.Params;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p3.l;
import p3.m;
import p3.n;
import p3.o;
import p3.p;
import p3.q;

public final class TextViewCompat {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AutoSizeTextType {
    }

    public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;

    public static int getAutoSizeMaxTextSize(@NonNull TextView textView0) {
        if(Build.VERSION.SDK_INT >= 27) {
            return n.a(textView0);
        }
        return textView0 instanceof AutoSizeableTextView ? ((AutoSizeableTextView)textView0).getAutoSizeMaxTextSize() : -1;
    }

    public static int getAutoSizeMinTextSize(@NonNull TextView textView0) {
        if(Build.VERSION.SDK_INT >= 27) {
            return n.b(textView0);
        }
        return textView0 instanceof AutoSizeableTextView ? ((AutoSizeableTextView)textView0).getAutoSizeMinTextSize() : -1;
    }

    public static int getAutoSizeStepGranularity(@NonNull TextView textView0) {
        if(Build.VERSION.SDK_INT >= 27) {
            return n.c(textView0);
        }
        return textView0 instanceof AutoSizeableTextView ? ((AutoSizeableTextView)textView0).getAutoSizeStepGranularity() : -1;
    }

    @NonNull
    public static int[] getAutoSizeTextAvailableSizes(@NonNull TextView textView0) {
        if(Build.VERSION.SDK_INT >= 27) {
            return n.d(textView0);
        }
        return textView0 instanceof AutoSizeableTextView ? ((AutoSizeableTextView)textView0).getAutoSizeTextAvailableSizes() : new int[0];
    }

    public static int getAutoSizeTextType(@NonNull TextView textView0) {
        if(Build.VERSION.SDK_INT >= 27) {
            return n.e(textView0);
        }
        return textView0 instanceof AutoSizeableTextView ? ((AutoSizeableTextView)textView0).getAutoSizeTextType() : 0;
    }

    @Nullable
    public static ColorStateList getCompoundDrawableTintList(@NonNull TextView textView0) {
        Preconditions.checkNotNull(textView0);
        return l.b(textView0);
    }

    @Nullable
    public static PorterDuff.Mode getCompoundDrawableTintMode(@NonNull TextView textView0) {
        Preconditions.checkNotNull(textView0);
        return l.c(textView0);
    }

    @NonNull
    public static Drawable[] getCompoundDrawablesRelative(@NonNull TextView textView0) {
        return textView0.getCompoundDrawablesRelative();
    }

    public static int getFirstBaselineToTopHeight(@NonNull TextView textView0) {
        return textView0.getPaddingTop() - textView0.getPaint().getFontMetricsInt().top;
    }

    public static int getLastBaselineToBottomHeight(@NonNull TextView textView0) {
        return textView0.getPaddingBottom() + textView0.getPaint().getFontMetricsInt().bottom;
    }

    public static int getMaxLines(@NonNull TextView textView0) {
        return textView0.getMaxLines();
    }

    public static int getMinLines(@NonNull TextView textView0) {
        return textView0.getMinLines();
    }

    @NonNull
    public static Params getTextMetricsParams(@NonNull TextView textView0) {
        TextDirectionHeuristic textDirectionHeuristic0;
        int v = Build.VERSION.SDK_INT;
        if(v >= 28) {
            return new Params(o.c(textView0));
        }
        boolean z = true;
        Builder precomputedTextCompat$Params$Builder0 = new Builder(new TextPaint(textView0.getPaint()));
        precomputedTextCompat$Params$Builder0.setBreakStrategy(l.a(textView0));
        precomputedTextCompat$Params$Builder0.setHyphenationFrequency(l.d(textView0));
        if(textView0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic0 = TextDirectionHeuristics.LTR;
        }
        else if(v < 28 || (textView0.getInputType() & 15) != 3) {
            if(textView0.getLayoutDirection() != 1) {
                z = false;
            }
            switch(textView0.getTextDirection()) {
                case 2: {
                    textDirectionHeuristic0 = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                }
                case 3: {
                    textDirectionHeuristic0 = TextDirectionHeuristics.LTR;
                    break;
                }
                case 4: {
                    textDirectionHeuristic0 = TextDirectionHeuristics.RTL;
                    break;
                }
                case 5: {
                    textDirectionHeuristic0 = TextDirectionHeuristics.LOCALE;
                    break;
                }
                case 6: {
                    textDirectionHeuristic0 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                }
                case 7: {
                    textDirectionHeuristic0 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                }
                default: {
                    textDirectionHeuristic0 = z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
                }
            }
        }
        else {
            switch(Character.getDirectionality(o.b(m.a(textView0.getTextLocale()))[0].codePointAt(0))) {
                case 1: 
                case 2: {
                    textDirectionHeuristic0 = TextDirectionHeuristics.RTL;
                    break;
                }
                default: {
                    textDirectionHeuristic0 = TextDirectionHeuristics.LTR;
                }
            }
        }
        precomputedTextCompat$Params$Builder0.setTextDirection(textDirectionHeuristic0);
        return precomputedTextCompat$Params$Builder0.build();
    }

    public static void setAutoSizeTextTypeUniformWithConfiguration(@NonNull TextView textView0, int v, int v1, int v2, int v3) throws IllegalArgumentException {
        if(Build.VERSION.SDK_INT >= 27) {
            n.f(textView0, v, v1, v2, v3);
            return;
        }
        if(textView0 instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView)textView0).setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
        }
    }

    public static void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull TextView textView0, @NonNull int[] arr_v, int v) throws IllegalArgumentException {
        if(Build.VERSION.SDK_INT >= 27) {
            n.g(textView0, arr_v, v);
            return;
        }
        if(textView0 instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView)textView0).setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
        }
    }

    public static void setAutoSizeTextTypeWithDefaults(@NonNull TextView textView0, int v) {
        if(Build.VERSION.SDK_INT >= 27) {
            n.h(textView0, v);
            return;
        }
        if(textView0 instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView)textView0).setAutoSizeTextTypeWithDefaults(v);
        }
    }

    public static void setCompoundDrawableTintList(@NonNull TextView textView0, @Nullable ColorStateList colorStateList0) {
        Preconditions.checkNotNull(textView0);
        l.f(textView0, colorStateList0);
    }

    public static void setCompoundDrawableTintMode(@NonNull TextView textView0, @Nullable PorterDuff.Mode porterDuff$Mode0) {
        Preconditions.checkNotNull(textView0);
        l.g(textView0, porterDuff$Mode0);
    }

    public static void setCompoundDrawablesRelative(@NonNull TextView textView0, @Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        textView0.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(@NonNull TextView textView0, @DrawableRes int v, @DrawableRes int v1, @DrawableRes int v2, @DrawableRes int v3) {
        textView0.setCompoundDrawablesRelativeWithIntrinsicBounds(v, v1, v2, v3);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(@NonNull TextView textView0, @Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        textView0.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
    }

    public static void setCustomSelectionActionModeCallback(@NonNull TextView textView0, @NonNull ActionMode.Callback actionMode$Callback0) {
        textView0.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(textView0, actionMode$Callback0));
    }

    public static void setFirstBaselineToTopHeight(@NonNull TextView textView0, @IntRange(from = 0L) @Px int v) {
        Preconditions.checkArgumentNonnegative(v);
        if(Build.VERSION.SDK_INT >= 28) {
            o.d(textView0, v);
            return;
        }
        Paint.FontMetricsInt paint$FontMetricsInt0 = textView0.getPaint().getFontMetricsInt();
        int v1 = textView0.getIncludeFontPadding() ? paint$FontMetricsInt0.top : paint$FontMetricsInt0.ascent;
        if(v > Math.abs(v1)) {
            textView0.setPadding(textView0.getPaddingLeft(), v + v1, textView0.getPaddingRight(), textView0.getPaddingBottom());
        }
    }

    public static void setLastBaselineToBottomHeight(@NonNull TextView textView0, @IntRange(from = 0L) @Px int v) {
        Preconditions.checkArgumentNonnegative(v);
        Paint.FontMetricsInt paint$FontMetricsInt0 = textView0.getPaint().getFontMetricsInt();
        int v1 = textView0.getIncludeFontPadding() ? paint$FontMetricsInt0.bottom : paint$FontMetricsInt0.descent;
        if(v > Math.abs(v1)) {
            textView0.setPadding(textView0.getPaddingLeft(), textView0.getPaddingTop(), textView0.getPaddingRight(), v - v1);
        }
    }

    public static void setLineHeight(@NonNull TextView textView0, @IntRange(from = 0L) @Px int v) {
        Preconditions.checkArgumentNonnegative(v);
        int v1 = textView0.getPaint().getFontMetricsInt(null);
        if(v != v1) {
            textView0.setLineSpacing(((float)(v - v1)), 1.0f);
        }
    }

    public static void setLineHeight(@NonNull TextView textView0, int v, @FloatRange(from = 0.0) float f) {
        if(Build.VERSION.SDK_INT >= 34) {
            p.a(textView0, v, f);
            return;
        }
        TextViewCompat.setLineHeight(textView0, Math.round(TypedValue.applyDimension(v, f, textView0.getResources().getDisplayMetrics())));
    }

    public static void setPrecomputedText(@NonNull TextView textView0, @NonNull PrecomputedTextCompat precomputedTextCompat0) {
        if(Build.VERSION.SDK_INT >= 29) {
            textView0.setText(o.a(precomputedTextCompat0.getPrecomputedText()));
            return;
        }
        if(!TextViewCompat.getTextMetricsParams(textView0).equalsWithoutTextDirection(precomputedTextCompat0.getParams())) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        textView0.setText(precomputedTextCompat0);
    }

    public static void setTextAppearance(@NonNull TextView textView0, @StyleRes int v) {
        textView0.setTextAppearance(v);
    }

    public static void setTextMetricsParams(@NonNull TextView textView0, @NonNull Params precomputedTextCompat$Params0) {
        TextDirectionHeuristic textDirectionHeuristic0 = precomputedTextCompat$Params0.getTextDirection();
        TextDirectionHeuristic textDirectionHeuristic1 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int v = 1;
        if(textDirectionHeuristic0 != textDirectionHeuristic1) {
            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            if(textDirectionHeuristic0 != textDirectionHeuristic2) {
                if(textDirectionHeuristic0 == TextDirectionHeuristics.ANYRTL_LTR) {
                    v = 2;
                }
                else if(textDirectionHeuristic0 == TextDirectionHeuristics.LTR) {
                    v = 3;
                }
                else if(textDirectionHeuristic0 == TextDirectionHeuristics.RTL) {
                    v = 4;
                }
                else if(textDirectionHeuristic0 == TextDirectionHeuristics.LOCALE) {
                    v = 5;
                }
                else if(textDirectionHeuristic0 == textDirectionHeuristic2) {
                    v = 6;
                }
                else if(textDirectionHeuristic0 == textDirectionHeuristic1) {
                    v = 7;
                }
            }
        }
        textView0.setTextDirection(v);
        textView0.getPaint().set(precomputedTextCompat$Params0.getTextPaint());
        l.e(textView0, precomputedTextCompat$Params0.getBreakStrategy());
        l.h(textView0, precomputedTextCompat$Params0.getHyphenationFrequency());
    }

    // 去混淆评级： 低(20)
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback unwrapCustomSelectionActionModeCallback(@Nullable ActionMode.Callback actionMode$Callback0) {
        return actionMode$Callback0 instanceof q ? ((q)actionMode$Callback0).a : actionMode$Callback0;
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback wrapCustomSelectionActionModeCallback(@NonNull TextView textView0, @Nullable ActionMode.Callback actionMode$Callback0) {
        return Build.VERSION.SDK_INT <= 27 && !(actionMode$Callback0 instanceof q) && actionMode$Callback0 != null ? new q(textView0, actionMode$Callback0) : actionMode$Callback0;
    }
}

