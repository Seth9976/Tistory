package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators;", "", "()V", "AbstractTextSegmentIterator", "CharacterTextSegmentIterator", "LineTextSegmentIterator", "PageTextSegmentIterator", "ParagraphTextSegmentIterator", "TextSegmentIterator", "WordTextSegmentIterator", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AccessibilityIterators {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\b\'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001A\u0004\u0018\u00010\f2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\tH\u0004¢\u0006\u0004\b\r\u0010\u000ER\"\u0010\u0005\u001A\u00020\u00048\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0005\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "<init>", "()V", "", "text", "", "initialize", "(Ljava/lang/String;)V", "", "start", "end", "", "getRange", "(II)[I", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        public static final int $stable = 8;
        public final int[] a;
        protected String text;

        public AbstractTextSegmentIterator() {
            this.a = new int[2];
        }

        @Nullable
        public final int[] getRange(int v, int v1) {
            if(v >= 0 && v1 >= 0 && v != v1) {
                this.a[0] = v;
                this.a[1] = v1;
                return this.a;
            }
            return null;
        }

        @NotNull
        public final String getText() {
            String s = this.text;
            if(s != null) {
                return s;
            }
            Intrinsics.throwUninitializedPropertyAccessException("text");
            return null;
        }

        public void initialize(@NotNull String s) {
            this.setText(s);
        }

        public final void setText(@NotNull String s) {
            this.text = s;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0017\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001A\u0004\u0018\u00010\t2\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0019\u0010\f\u001A\u0004\u0018\u00010\t2\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000B¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "", "text", "", "initialize", "(Ljava/lang/String;)V", "", "current", "", "following", "(I)[I", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001A\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator$Companion;", "", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "getInstance", "(Ljava/util/Locale;)Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final CharacterTextSegmentIterator getInstance(@NotNull Locale locale0) {
                if(CharacterTextSegmentIterator.c == null) {
                    CharacterTextSegmentIterator.c = new CharacterTextSegmentIterator(locale0, null);
                }
                CharacterTextSegmentIterator accessibilityIterators$CharacterTextSegmentIterator0 = CharacterTextSegmentIterator.c;
                Intrinsics.checkNotNull(accessibilityIterators$CharacterTextSegmentIterator0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return accessibilityIterators$CharacterTextSegmentIterator0;
            }
        }

        public static final int $stable;
        @NotNull
        public static final Companion Companion;
        public final BreakIterator b;
        public static CharacterTextSegmentIterator c;

        static {
            CharacterTextSegmentIterator.Companion = new Companion(null);
            CharacterTextSegmentIterator.$stable = 8;
        }

        public CharacterTextSegmentIterator(Locale locale0, DefaultConstructorMarker defaultConstructorMarker0) {
            this.b = BreakIterator.getCharacterInstance(locale0);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @Nullable
        public int[] following(int v) {
            int v1 = this.getText().length();
            if(v1 <= 0) {
                return null;
            }
            if(v >= v1) {
                return null;
            }
            if(v < 0) {
                v = 0;
            }
            while(true) {
                BreakIterator breakIterator0 = this.b;
                if(breakIterator0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator0 = null;
                }
                if(breakIterator0.isBoundary(v)) {
                    break;
                }
                BreakIterator breakIterator1 = this.b;
                if(breakIterator1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator1 = null;
                }
                v = breakIterator1.following(v);
                if(v == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.b;
            if(breakIterator2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator2 = null;
            }
            int v2 = breakIterator2.following(v);
            return v2 == -1 ? null : this.getRange(v, v2);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$AbstractTextSegmentIterator
        public void initialize(@NotNull String s) {
            super.initialize(s);
            BreakIterator breakIterator0 = this.b;
            if(breakIterator0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator0 = null;
            }
            breakIterator0.setText(s);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @Nullable
        public int[] preceding(int v) {
            int v1 = this.getText().length();
            if(v1 <= 0) {
                return null;
            }
            if(v <= 0) {
                return null;
            }
            if(v > v1) {
                v = v1;
            }
            while(true) {
                BreakIterator breakIterator0 = this.b;
                if(breakIterator0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator0 = null;
                }
                if(breakIterator0.isBoundary(v)) {
                    break;
                }
                BreakIterator breakIterator1 = this.b;
                if(breakIterator1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator1 = null;
                }
                v = breakIterator1.preceding(v);
                if(v == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.b;
            if(breakIterator2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator2 = null;
            }
            int v2 = breakIterator2.preceding(v);
            return v2 == -1 ? null : this.getRange(v2, v);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000F2\u00020\u0001:\u0001\u000FJ\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000E\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000E\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "", "text", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "", "initialize", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLayoutResult;)V", "", "current", "", "following", "(I)[I", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0018\u0010\t\u001A\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator$Companion;", "", "Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "getInstance", "()Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion {
            public androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final LineTextSegmentIterator getInstance() {
                if(LineTextSegmentIterator.c == null) {
                    LineTextSegmentIterator.c = new LineTextSegmentIterator(null);
                }
                LineTextSegmentIterator accessibilityIterators$LineTextSegmentIterator0 = LineTextSegmentIterator.c;
                Intrinsics.checkNotNull(accessibilityIterators$LineTextSegmentIterator0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return accessibilityIterators$LineTextSegmentIterator0;
            }
        }

        public static final int $stable;
        @NotNull
        public static final androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion Companion;
        public TextLayoutResult b;
        public static LineTextSegmentIterator c;
        public static final ResolvedTextDirection d;
        public static final ResolvedTextDirection e;

        static {
            LineTextSegmentIterator.Companion = new androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion(null);
            LineTextSegmentIterator.$stable = 8;
            LineTextSegmentIterator.d = ResolvedTextDirection.Rtl;
            LineTextSegmentIterator.e = ResolvedTextDirection.Ltr;
        }

        public LineTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final int a(int v, ResolvedTextDirection resolvedTextDirection0) {
            TextLayoutResult textLayoutResult0 = this.b;
            if(textLayoutResult0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult0 = null;
            }
            int v1 = textLayoutResult0.getLineStart(v);
            TextLayoutResult textLayoutResult1 = this.b;
            if(textLayoutResult1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult1 = null;
            }
            if(resolvedTextDirection0 != textLayoutResult1.getParagraphDirection(v1)) {
                TextLayoutResult textLayoutResult2 = this.b;
                if(textLayoutResult2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    throw new NullPointerException();
                }
                return textLayoutResult2.getLineStart(v);
            }
            TextLayoutResult textLayoutResult3 = this.b;
            if(textLayoutResult3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult3 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult3, v, false, 2, null) - 1;
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @Nullable
        public int[] following(int v) {
            int v1;
            if(this.getText().length() <= 0) {
                return null;
            }
            if(v >= this.getText().length()) {
                return null;
            }
            ResolvedTextDirection resolvedTextDirection0 = LineTextSegmentIterator.d;
            if(v < 0) {
                TextLayoutResult textLayoutResult0 = this.b;
                if(textLayoutResult0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult0 = null;
                }
                v1 = textLayoutResult0.getLineForOffset(0);
            }
            else {
                TextLayoutResult textLayoutResult1 = this.b;
                if(textLayoutResult1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult1 = null;
                }
                int v2 = textLayoutResult1.getLineForOffset(v);
                v1 = this.a(v2, resolvedTextDirection0) == v ? v2 : v2 + 1;
            }
            TextLayoutResult textLayoutResult2 = this.b;
            if(textLayoutResult2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult2 = null;
            }
            return v1 < textLayoutResult2.getLineCount() ? this.getRange(this.a(v1, resolvedTextDirection0), this.a(v1, LineTextSegmentIterator.e) + 1) : null;
        }

        public final void initialize(@NotNull String s, @NotNull TextLayoutResult textLayoutResult0) {
            this.setText(s);
            this.b = textLayoutResult0;
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @Nullable
        public int[] preceding(int v) {
            int v2;
            if(this.getText().length() <= 0) {
                return null;
            }
            if(v <= 0) {
                return null;
            }
            int v1 = this.getText().length();
            ResolvedTextDirection resolvedTextDirection0 = LineTextSegmentIterator.e;
            if(v > v1) {
                TextLayoutResult textLayoutResult0 = this.b;
                if(textLayoutResult0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult0 = null;
                }
                v2 = textLayoutResult0.getLineForOffset(this.getText().length());
                return v2 >= 0 ? this.getRange(this.a(v2, LineTextSegmentIterator.d), this.a(v2, resolvedTextDirection0) + 1) : null;
            }
            TextLayoutResult textLayoutResult1 = this.b;
            if(textLayoutResult1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult1 = null;
            }
            int v3 = textLayoutResult1.getLineForOffset(v);
            v2 = this.a(v3, resolvedTextDirection0) + 1 == v ? v3 : v3 - 1;
            return v2 >= 0 ? this.getRange(this.a(v2, LineTextSegmentIterator.d), this.a(v2, resolvedTextDirection0) + 1) : null;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J%\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000E\u001A\u0004\u0018\u00010\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0019\u0010\u0010\u001A\u0004\u0018\u00010\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0010\u0010\u000F¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "", "text", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "", "initialize", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/semantics/SemanticsNode;)V", "", "current", "", "following", "(I)[I", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAccessibilityIterators.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityIterators.android.kt\nandroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,533:1\n26#2:534\n26#2:535\n*S KotlinDebug\n*F\n+ 1 AccessibilityIterators.android.kt\nandroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator\n*L\n460#1:534\n494#1:535\n*E\n"})
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0018\u0010\t\u001A\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator$Companion;", "", "Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "getInstance", "()Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion {
            public androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final PageTextSegmentIterator getInstance() {
                if(PageTextSegmentIterator.d == null) {
                    PageTextSegmentIterator.d = new PageTextSegmentIterator(null);
                }
                PageTextSegmentIterator accessibilityIterators$PageTextSegmentIterator0 = PageTextSegmentIterator.d;
                Intrinsics.checkNotNull(accessibilityIterators$PageTextSegmentIterator0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return accessibilityIterators$PageTextSegmentIterator0;
            }
        }

        public static final int $stable;
        @NotNull
        public static final androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion Companion;
        public TextLayoutResult b;
        public SemanticsNode c;
        public static PageTextSegmentIterator d;
        public static final ResolvedTextDirection e;
        public static final ResolvedTextDirection f;

        static {
            PageTextSegmentIterator.Companion = new androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion(null);
            PageTextSegmentIterator.$stable = 8;
            PageTextSegmentIterator.e = ResolvedTextDirection.Rtl;
            PageTextSegmentIterator.f = ResolvedTextDirection.Ltr;
        }

        public PageTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker0) {
            new Rect();
        }

        public final int a(int v, ResolvedTextDirection resolvedTextDirection0) {
            TextLayoutResult textLayoutResult0 = this.b;
            if(textLayoutResult0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult0 = null;
            }
            int v1 = textLayoutResult0.getLineStart(v);
            TextLayoutResult textLayoutResult1 = this.b;
            if(textLayoutResult1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult1 = null;
            }
            if(resolvedTextDirection0 != textLayoutResult1.getParagraphDirection(v1)) {
                TextLayoutResult textLayoutResult2 = this.b;
                if(textLayoutResult2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    throw new NullPointerException();
                }
                return textLayoutResult2.getLineStart(v);
            }
            TextLayoutResult textLayoutResult3 = this.b;
            if(textLayoutResult3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult3 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult3, v, false, 2, null) - 1;
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @Nullable
        public int[] following(int v) {
            TextLayoutResult textLayoutResult0;
            int v2;
            int v1;
            if(this.getText().length() <= 0) {
                return null;
            }
            if(v >= this.getText().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode0 = this.c;
                if(semanticsNode0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    semanticsNode0 = null;
                }
                v1 = Math.round(semanticsNode0.getBoundsInRoot().getHeight());
                v2 = c.coerceAtLeast(0, v);
                textLayoutResult0 = this.b;
            }
            catch(IllegalStateException unused_ex) {
                return null;
            }
            if(textLayoutResult0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult0 = null;
            }
            int v3 = textLayoutResult0.getLineForOffset(v2);
            TextLayoutResult textLayoutResult1 = this.b;
            if(textLayoutResult1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult1 = null;
            }
            float f = textLayoutResult1.getLineTop(v3) + ((float)v1);
            TextLayoutResult textLayoutResult2 = this.b;
            if(textLayoutResult2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult2 = null;
            }
            TextLayoutResult textLayoutResult3 = this.b;
            if(textLayoutResult3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult3 = null;
            }
            if(f < textLayoutResult2.getLineTop(textLayoutResult3.getLineCount() - 1)) {
                TextLayoutResult textLayoutResult4 = this.b;
                if(textLayoutResult4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    throw new NullPointerException();
                }
                return this.getRange(v2, this.a(textLayoutResult4.getLineForVerticalPosition(f) - 1, PageTextSegmentIterator.f) + 1);
            }
            TextLayoutResult textLayoutResult5 = this.b;
            if(textLayoutResult5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                throw new NullPointerException();
            }
            return this.getRange(v2, this.a(textLayoutResult5.getLineCount() - 1, PageTextSegmentIterator.f) + 1);
        }

        public final void initialize(@NotNull String s, @NotNull TextLayoutResult textLayoutResult0, @NotNull SemanticsNode semanticsNode0) {
            this.setText(s);
            this.b = textLayoutResult0;
            this.c = semanticsNode0;
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @Nullable
        public int[] preceding(int v) {
            int v4;
            int v1;
            TextLayoutResult textLayoutResult0 = null;
            if(this.getText().length() <= 0) {
                return null;
            }
            if(v <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode0 = this.c;
                if(semanticsNode0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    semanticsNode0 = null;
                }
                v1 = Math.round(semanticsNode0.getBoundsInRoot().getHeight());
            }
            catch(IllegalStateException unused_ex) {
                return null;
            }
            int v2 = c.coerceAtMost(this.getText().length(), v);
            TextLayoutResult textLayoutResult1 = this.b;
            if(textLayoutResult1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult1 = null;
            }
            int v3 = textLayoutResult1.getLineForOffset(v2);
            TextLayoutResult textLayoutResult2 = this.b;
            if(textLayoutResult2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult2 = null;
            }
            float f = textLayoutResult2.getLineTop(v3) - ((float)v1);
            if(f > 0.0f) {
                TextLayoutResult textLayoutResult3 = this.b;
                if(textLayoutResult3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                }
                else {
                    textLayoutResult0 = textLayoutResult3;
                }
                v4 = textLayoutResult0.getLineForVerticalPosition(f);
            }
            else {
                v4 = 0;
            }
            if(v2 == this.getText().length() && v4 < v3) {
                ++v4;
            }
            return this.getRange(this.a(v4, PageTextSegmentIterator.e), v2);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "", "current", "", "following", "(I)[I", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator$Companion;", "", "Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "getInstance", "()Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion {
            public androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final ParagraphTextSegmentIterator getInstance() {
                if(ParagraphTextSegmentIterator.b == null) {
                    ParagraphTextSegmentIterator.b = new ParagraphTextSegmentIterator(null);
                }
                ParagraphTextSegmentIterator accessibilityIterators$ParagraphTextSegmentIterator0 = ParagraphTextSegmentIterator.b;
                Intrinsics.checkNotNull(accessibilityIterators$ParagraphTextSegmentIterator0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return accessibilityIterators$ParagraphTextSegmentIterator0;
            }
        }

        public static final int $stable;
        @NotNull
        public static final androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion Companion;
        public static ParagraphTextSegmentIterator b;

        static {
            ParagraphTextSegmentIterator.Companion = new androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion(null);
        }

        public ParagraphTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final boolean a(int v) {
            return v > 0 && this.getText().charAt(v - 1) != 10 && (v == this.getText().length() || this.getText().charAt(v) == 10);
        }

        public final boolean b(int v) {
            return this.getText().charAt(v) != 10 && (v == 0 || this.getText().charAt(v - 1) == 10);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @Nullable
        public int[] following(int v) {
            int v1 = this.getText().length();
            if(v1 <= 0) {
                return null;
            }
            if(v >= v1) {
                return null;
            }
            if(v < 0) {
                v = 0;
            }
            while(v < v1 && this.getText().charAt(v) == 10 && !this.b(v)) {
                ++v;
            }
            if(v >= v1) {
                return null;
            }
            int v2;
            for(v2 = v + 1; v2 < v1 && !this.a(v2); ++v2) {
            }
            return this.getRange(v, v2);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @Nullable
        public int[] preceding(int v) {
            int v1 = this.getText().length();
            if(v1 <= 0) {
                return null;
            }
            if(v <= 0) {
                return null;
            }
            if(v > v1) {
                v = v1;
            }
            while(v > 0 && this.getText().charAt(v - 1) == 10 && !this.a(v)) {
                --v;
            }
            if(v <= 0) {
                return null;
            }
            int v2;
            for(v2 = v - 1; v2 > 0 && !this.b(v2); --v2) {
            }
            return this.getRange(v2, v);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "", "following", "", "current", "", "preceding", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface TextSegmentIterator {
        @Nullable
        int[] following(int arg1);

        @Nullable
        int[] preceding(int arg1);
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001A\u0004\u0018\u00010\t2\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0019\u0010\f\u001A\u0004\u0018\u00010\t2\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000B¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "", "text", "", "initialize", "(Ljava/lang/String;)V", "", "current", "", "following", "(I)[I", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001A\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator$Companion;", "", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "getInstance", "(Ljava/util/Locale;)Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion {
            public androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final WordTextSegmentIterator getInstance(@NotNull Locale locale0) {
                if(WordTextSegmentIterator.c == null) {
                    WordTextSegmentIterator.c = new WordTextSegmentIterator(locale0, null);
                }
                WordTextSegmentIterator accessibilityIterators$WordTextSegmentIterator0 = WordTextSegmentIterator.c;
                Intrinsics.checkNotNull(accessibilityIterators$WordTextSegmentIterator0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return accessibilityIterators$WordTextSegmentIterator0;
            }
        }

        public static final int $stable;
        @NotNull
        public static final androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion Companion;
        public final BreakIterator b;
        public static WordTextSegmentIterator c;

        static {
            WordTextSegmentIterator.Companion = new androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion(null);
            WordTextSegmentIterator.$stable = 8;
        }

        public WordTextSegmentIterator(Locale locale0, DefaultConstructorMarker defaultConstructorMarker0) {
            this.b = BreakIterator.getWordInstance(locale0);
        }

        // 去混淆评级： 低(30)
        public final boolean a(int v) {
            return v > 0 && this.b(v - 1) && (v == this.getText().length() || !this.b(v));
        }

        public final boolean b(int v) {
            return v < 0 || v >= this.getText().length() ? false : Character.isLetterOrDigit(this.getText().codePointAt(v));
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @Nullable
        public int[] following(int v) {
            if(this.getText().length() <= 0) {
                return null;
            }
            if(v >= this.getText().length()) {
                return null;
            }
            if(v < 0) {
                v = 0;
            }
            while(!this.b(v) && (!this.b(v) || v != 0 && this.b(v - 1))) {
                BreakIterator breakIterator0 = this.b;
                if(breakIterator0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator0 = null;
                }
                v = breakIterator0.following(v);
                if(v == -1) {
                    return null;
                }
                if(false) {
                    break;
                }
            }
            BreakIterator breakIterator1 = this.b;
            if(breakIterator1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator1 = null;
            }
            int v1 = breakIterator1.following(v);
            return v1 == -1 || !this.a(v1) ? null : this.getRange(v, v1);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$AbstractTextSegmentIterator
        public void initialize(@NotNull String s) {
            super.initialize(s);
            BreakIterator breakIterator0 = this.b;
            if(breakIterator0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator0 = null;
            }
            breakIterator0.setText(s);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @Nullable
        public int[] preceding(int v) {
            int v1 = this.getText().length();
            if(v1 <= 0) {
                return null;
            }
            if(v <= 0) {
                return null;
            }
            if(v > v1) {
                v = v1;
            }
            while(v > 0 && !this.b(v - 1) && !this.a(v)) {
                BreakIterator breakIterator0 = this.b;
                if(breakIterator0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator0 = null;
                }
                v = breakIterator0.preceding(v);
                if(v == -1) {
                    return null;
                }
                if(false) {
                    break;
                }
            }
            BreakIterator breakIterator1 = this.b;
            if(breakIterator1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator1 = null;
            }
            int v2 = breakIterator1.preceding(v);
            return v2 == -1 || !this.b(v2) || v2 != 0 && this.b(v2 - 1) ? null : this.getRange(v2, v);
        }
    }

    public static final int $stable;

}

