package androidx.compose.ui.text;

import android.graphics.Typeface;
import android.text.Layout.Alignment;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.text.HtmlCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A1\u0010\b\u001A\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001A+\u0010\u000B\u001A\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Companion;", "", "htmlString", "Landroidx/compose/ui/text/TextLinkStyles;", "linkStyles", "Landroidx/compose/ui/text/LinkInteractionListener;", "linkInteractionListener", "Landroidx/compose/ui/text/AnnotatedString;", "fromHtml", "(Landroidx/compose/ui/text/AnnotatedString$Companion;Ljava/lang/String;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)Landroidx/compose/ui/text/AnnotatedString;", "Landroid/text/Spanned;", "toAnnotatedString", "(Landroid/text/Spanned;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)Landroidx/compose/ui/text/AnnotatedString;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHtml.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/Html_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,292:1\n1#2:293\n13579#3,2:294\n*S KotlinDebug\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/Html_androidKt\n*L\n89#1:294,2\n*E\n"})
public final class Html_androidKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Layout.Alignment.values().length];
            try {
                arr_v[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final Html_androidKt.TagHandler.1 a;

    static {
        Html_androidKt.a = new Html_androidKt.TagHandler.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public static final AnnotatedString fromHtml(@NotNull Companion annotatedString$Companion0, @NotNull String s, @Nullable TextLinkStyles textLinkStyles0, @Nullable LinkInteractionListener linkInteractionListener0) {
        return Html_androidKt.toAnnotatedString(HtmlCompat.fromHtml(("<ContentHandlerReplacementTag />" + s), 0x3F, null, Html_androidKt.a), textLinkStyles0, linkInteractionListener0);
    }

    public static AnnotatedString fromHtml$default(Companion annotatedString$Companion0, String s, TextLinkStyles textLinkStyles0, LinkInteractionListener linkInteractionListener0, int v, Object object0) {
        if((v & 2) != 0) {
            textLinkStyles0 = null;
        }
        if((v & 4) != 0) {
            linkInteractionListener0 = null;
        }
        return Html_androidKt.fromHtml(annotatedString$Companion0, s, textLinkStyles0, linkInteractionListener0);
    }

    @VisibleForTesting
    @NotNull
    public static final AnnotatedString toAnnotatedString(@NotNull Spanned spanned0, @Nullable TextLinkStyles textLinkStyles0, @Nullable LinkInteractionListener linkInteractionListener0) {
        GenericFontFamily genericFontFamily0;
        int v4;
        Builder annotatedString$Builder0 = new Builder(spanned0.length()).append(spanned0);
        Object[] arr_object = spanned0.getSpans(0, annotatedString$Builder0.getLength(), Object.class);
        for(int v = 0; v < arr_object.length; ++v) {
            SpanStyle spanStyle0 = null;
            Object object0 = arr_object[v];
            long v1 = TextRangeKt.TextRange(spanned0.getSpanStart(object0), spanned0.getSpanEnd(object0));
            int v2 = TextRange.getStart-impl(v1);
            int v3 = TextRange.getEnd-impl(v1);
            if(!(object0 instanceof AbsoluteSizeSpan)) {
                if(object0 instanceof AlignmentSpan) {
                    Layout.Alignment layout$Alignment0 = ((AlignmentSpan)object0).getAlignment();
                    switch((layout$Alignment0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[layout$Alignment0.ordinal()])) {
                        case 1: {
                            v4 = 5;
                            break;
                        }
                        case 2: {
                            v4 = 3;
                            break;
                        }
                        case 3: {
                            v4 = 6;
                            break;
                        }
                        default: {
                            v4 = 0x80000000;
                        }
                    }
                    annotatedString$Builder0.addStyle(new ParagraphStyle(v4, 0, 0L, null, null, null, 0, 0, null, 510, null), v2, v3);
                }
                else if(object0 instanceof d) {
                    annotatedString$Builder0.addStringAnnotation(((d)object0).a, ((d)object0).b, v2, v3);
                }
                else if(object0 instanceof BackgroundColorSpan) {
                    annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, ColorKt.Color(((BackgroundColorSpan)object0).getBackgroundColor()), null, null, null, null, 0xF7FF, null), v2, v3);
                }
                else if(object0 instanceof ForegroundColorSpan) {
                    annotatedString$Builder0.addStyle(new SpanStyle(ColorKt.Color(((ForegroundColorSpan)object0).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFE, null), v2, v3);
                }
                else if(object0 instanceof RelativeSizeSpan) {
                    annotatedString$Builder0.addStyle(new SpanStyle(0L, TextUnitKt.getEm(((RelativeSizeSpan)object0).getSizeChange()), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFD, null), v2, v3);
                }
                else if(object0 instanceof StrikethroughSpan) {
                    annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getLineThrough(), null, null, null, 0xEFFF, null), v2, v3);
                }
                else if(object0 instanceof StyleSpan) {
                    switch(((StyleSpan)object0).getStyle()) {
                        case 1: {
                            spanStyle0 = new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null);
                            break;
                        }
                        case 2: {
                            spanStyle0 = new SpanStyle(0L, 0L, null, FontStyle.box-impl(1), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFF7, null);
                            break;
                        }
                        case 3: {
                            spanStyle0 = new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), FontStyle.box-impl(1), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFF3, null);
                        }
                    }
                    if(spanStyle0 != null) {
                        annotatedString$Builder0.addStyle(spanStyle0, v2, v3);
                    }
                }
                else if(object0 instanceof SubscriptSpan) {
                    annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, BaselineShift.box-impl(-0.5f), null, null, 0L, null, null, null, null, 0xFEFF, null), v2, v3);
                }
                else if(object0 instanceof SuperscriptSpan) {
                    annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, BaselineShift.box-impl(0.5f), null, null, 0L, null, null, null, null, 0xFEFF, null), v2, v3);
                }
                else if(object0 instanceof TypefaceSpan) {
                    String s = ((TypefaceSpan)object0).getFamily();
                    androidx.compose.ui.text.font.FontFamily.Companion fontFamily$Companion0 = FontFamily.Companion;
                    if(Intrinsics.areEqual(s, "cursive")) {
                        genericFontFamily0 = fontFamily$Companion0.getCursive();
                    }
                    else if(Intrinsics.areEqual(s, fontFamily$Companion0.getMonospace().getName())) {
                        genericFontFamily0 = fontFamily$Companion0.getMonospace();
                    }
                    else if(Intrinsics.areEqual(s, fontFamily$Companion0.getSansSerif().getName())) {
                        genericFontFamily0 = fontFamily$Companion0.getSansSerif();
                    }
                    else if(Intrinsics.areEqual(s, fontFamily$Companion0.getSerif().getName())) {
                        genericFontFamily0 = fontFamily$Companion0.getSerif();
                    }
                    else {
                        String s1 = ((TypefaceSpan)object0).getFamily();
                        if(s1 != null && s1.length() != 0) {
                            Typeface typeface0 = Typeface.create(s1, 0);
                            Typeface typeface1 = Typeface.DEFAULT;
                            if(Intrinsics.areEqual(typeface0, typeface1) || Intrinsics.areEqual(typeface0, Typeface.create(typeface1, 0))) {
                                typeface0 = null;
                            }
                            if(typeface0 != null) {
                                spanStyle0 = AndroidTypeface_androidKt.FontFamily(typeface0);
                            }
                        }
                        genericFontFamily0 = spanStyle0;
                    }
                    annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, null, null, null, genericFontFamily0, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFDF, null), v2, v3);
                }
                else if(object0 instanceof UnderlineSpan) {
                    annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, null, 0xEFFF, null), v2, v3);
                }
                else if(object0 instanceof URLSpan) {
                    String s2 = ((URLSpan)object0).getURL();
                    if(s2 != null) {
                        annotatedString$Builder0.addLink(new Url(s2, textLinkStyles0, linkInteractionListener0), v2, v3);
                    }
                }
            }
        }
        return annotatedString$Builder0.toAnnotatedString();
    }

    public static AnnotatedString toAnnotatedString$default(Spanned spanned0, TextLinkStyles textLinkStyles0, LinkInteractionListener linkInteractionListener0, int v, Object object0) {
        if((v & 1) != 0) {
            textLinkStyles0 = null;
        }
        if((v & 2) != 0) {
            linkInteractionListener0 = null;
        }
        return Html_androidKt.toAnnotatedString(spanned0, textLinkStyles0, linkInteractionListener0);
    }
}

