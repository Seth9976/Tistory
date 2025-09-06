package com.kakao.keditor.plugin.attrs.text.spans;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u0007J\u0018\u0010\t\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\fH\u0002J\u0016\u0010\r\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\f2\u0006\u0010\n\u001A\u00020\u0007J\u001C\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0014J*\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\f0\u0016J\u000E\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u000B\u001A\u00020\fJ\u0016\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001A\u001A\u00020\f2\u0006\u0010\u001B\u001A\u00020\fJ\u000E\u0010\u001C\u001A\u00020\f2\u0006\u0010\u001D\u001A\u00020\fJ\u000E\u0010\u001E\u001A\u00020\u001F2\u0006\u0010\u0011\u001A\u00020\u0012J\u000E\u0010 \u001A\u00020\u001F2\u0006\u0010\u0011\u001A\u00020\u0012¨\u0006!"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/spans/SpanUtil;", "", "()V", "clearSpan", "Landroid/text/SpannableStringBuilder;", "stringBuilder", "cursorPosition", "", "clearOffset", "getFlag", "start", "style", "Landroid/text/style/CharacterStyle;", "getInEx", "span", "getSpans", "", "spannable", "Landroid/text/Spannable;", "selection", "Lcom/kakao/keditor/plugin/attrs/text/spans/Selection;", "clazz", "Ljava/lang/Class;", "isKEStyle", "", "isSameSpan", "it", "requestSpan", "newSpan", "org", "updateFirstCharacterFlags", "", "updateRangeFlag", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSpanUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanUtil.kt\ncom/kakao/keditor/plugin/attrs/text/spans/SpanUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1855#2,2:118\n1855#2,2:120\n1855#2,2:122\n*S KotlinDebug\n*F\n+ 1 SpanUtil.kt\ncom/kakao/keditor/plugin/attrs/text/spans/SpanUtil\n*L\n54#1:118,2\n66#1:120,2\n77#1:122,2\n*E\n"})
public final class SpanUtil {
    @NotNull
    public static final SpanUtil INSTANCE;

    static {
        SpanUtil.INSTANCE = new SpanUtil();
    }

    @NotNull
    public final SpannableStringBuilder clearSpan(@NotNull SpannableStringBuilder spannableStringBuilder0, int v, int v1) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder0, "stringBuilder");
        for(Object object0: this.getSpans(spannableStringBuilder0, new Selection(v, v))) {
            CharacterStyle characterStyle0 = SpanUtil.INSTANCE.newSpan(((CharacterStyle)object0));
            int v2 = spannableStringBuilder0.getSpanStart(((CharacterStyle)object0));
            int v3 = spannableStringBuilder0.getSpanEnd(((CharacterStyle)object0));
            spannableStringBuilder0.removeSpan(((CharacterStyle)object0));
            spannableStringBuilder0.setSpan(characterStyle0, v2, v3 - v1, SpanUtil.INSTANCE.getFlag(v2, ((CharacterStyle)object0)));
        }
        return spannableStringBuilder0;
    }

    public static SpannableStringBuilder clearSpan$default(SpanUtil spanUtil0, SpannableStringBuilder spannableStringBuilder0, int v, int v1, int v2, Object object0) {
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        return spanUtil0.clearSpan(spannableStringBuilder0, v, v1);
    }

    private final int getFlag(int v, CharacterStyle characterStyle0) {
        if(!(characterStyle0 instanceof KeURLSpan) && !(characterStyle0 instanceof KeImageSpan)) {
            return v == 0 ? 18 : 34;
        }
        return 33;
    }

    public final int getInEx(@NotNull CharacterStyle characterStyle0, int v) {
        Intrinsics.checkNotNullParameter(characterStyle0, "span");
        if(!(characterStyle0 instanceof URLSpan) && !(characterStyle0 instanceof KeImageSpan)) {
            return v == 0 ? 18 : 34;
        }
        return 33;
    }

    @NotNull
    public final List getSpans(@NotNull Spannable spannable0, @NotNull Selection selection0) {
        Intrinsics.checkNotNullParameter(spannable0, "spannable");
        Intrinsics.checkNotNullParameter(selection0, "selection");
        List list0 = new ArrayList();
        KeSpan[] arr_keSpan = (KeSpan[])spannable0.getSpans(selection0.getStart(), selection0.getEnd(), KeSpan.class);
        Intrinsics.checkNotNull(arr_keSpan);
        List list1 = ArraysKt___ArraysKt.toMutableList(arr_keSpan);
        Intrinsics.checkNotNull(list1, "null cannot be cast to non-null type kotlin.collections.Collection<android.text.style.CharacterStyle>");
        list0.addAll(list1);
        return list0;
    }

    @NotNull
    public final List getSpans(@NotNull Spannable spannable0, @NotNull Selection selection0, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(spannable0, "spannable");
        Intrinsics.checkNotNullParameter(selection0, "selection");
        Intrinsics.checkNotNullParameter(class0, "clazz");
        Object[] arr_object = spannable0.getSpans(selection0.getStart(), selection0.getEnd(), class0);
        Intrinsics.checkNotNullExpressionValue(arr_object, "getSpans(...)");
        return ArraysKt___ArraysKt.toMutableList(arr_object);
    }

    public final boolean isKEStyle(@NotNull CharacterStyle characterStyle0) {
        Intrinsics.checkNotNullParameter(characterStyle0, "style");
        return characterStyle0 instanceof KeSpan;
    }

    public final boolean isSameSpan(@NotNull CharacterStyle characterStyle0, @NotNull CharacterStyle characterStyle1) {
        Intrinsics.checkNotNullParameter(characterStyle0, "it");
        Intrinsics.checkNotNullParameter(characterStyle1, "requestSpan");
        return Intrinsics.areEqual(characterStyle0.getClass(), characterStyle1.getClass()) && (!(characterStyle0 instanceof StyleSpan) || !(characterStyle1 instanceof StyleSpan) || ((StyleSpan)characterStyle0).getStyle() == ((StyleSpan)characterStyle1).getStyle());
    }

    @NotNull
    public final CharacterStyle newSpan(@NotNull CharacterStyle characterStyle0) {
        Intrinsics.checkNotNullParameter(characterStyle0, "org");
        if(characterStyle0 instanceof KeUnderlineSpan) {
            return new KeUnderlineSpan();
        }
        if(characterStyle0 instanceof KeBoldSpan) {
            return new KeBoldSpan();
        }
        if(characterStyle0 instanceof KeItalicSpan) {
            return new KeItalicSpan();
        }
        if(characterStyle0 instanceof KeBackgroundColorSpan) {
            return new KeBackgroundColorSpan(((KeBackgroundColorSpan)characterStyle0).getContext(), ((KeBackgroundColorSpan)characterStyle0).getBackgroundColor());
        }
        if(characterStyle0 instanceof KeForegroundColorSpan) {
            return new KeForegroundColorSpan(((KeForegroundColorSpan)characterStyle0).getContext(), ((KeForegroundColorSpan)characterStyle0).getForegroundColor());
        }
        if(characterStyle0 instanceof KeStrikethroughSpan) {
            return new KeStrikethroughSpan();
        }
        if(characterStyle0 instanceof KeURLSpan) {
            return new KeURLSpan(((KeURLSpan)characterStyle0).getUrl(), ((KeURLSpan)characterStyle0).isLinkNewWindow(), ((KeURLSpan)characterStyle0).getLinkTitle());
        }
        if(characterStyle0 instanceof KeTypefaceSpan) {
            return new KeTypefaceSpan(((KeTypefaceSpan)characterStyle0).getFamily(), ((KeTypefaceSpan)characterStyle0).getType());
        }
        if(characterStyle0 instanceof KeFontSizeSpan) {
            return new KeFontSizeSpan(((KeFontSizeSpan)characterStyle0).getSize());
        }
        if(characterStyle0 instanceof KeImageSpan) {
            Drawable drawable0 = ((KeImageSpan)characterStyle0).getDrawable();
            Intrinsics.checkNotNullExpressionValue(drawable0, "getDrawable(...)");
            return new KeImageSpan(drawable0, ((KeImageSpan)characterStyle0).getImageAttr());
        }
        return characterStyle0 instanceof KeGrammarErrorSpan ? new KeGrammarErrorSpan(((KeGrammarErrorSpan)characterStyle0).getContext(), ((KeGrammarErrorSpan)characterStyle0).isFocused(), ((KeGrammarErrorSpan)characterStyle0).getOnCLickAction()) : new StyleSpan(0);
    }

    public final void updateFirstCharacterFlags(@NotNull Spannable spannable0) {
        Intrinsics.checkNotNullParameter(spannable0, "spannable");
        for(Object object0: this.getSpans(spannable0, new Selection(0, 1))) {
            int v = spannable0.getSpanStart(((CharacterStyle)object0));
            int v1 = spannable0.getSpanEnd(((CharacterStyle)object0));
            spannable0.removeSpan(((CharacterStyle)object0));
            spannable0.setSpan(((CharacterStyle)object0), v, v1, SpanUtil.INSTANCE.getFlag(v, ((CharacterStyle)object0)));
        }
    }

    public final void updateRangeFlag(@NotNull Spannable spannable0) {
        Intrinsics.checkNotNullParameter(spannable0, "spannable");
        if(spannable0.length() == 0) {
            return;
        }
        for(Object object0: this.getSpans(spannable0, new Selection(0, spannable0.length()))) {
            int v = spannable0.getSpanStart(((CharacterStyle)object0));
            int v1 = spannable0.getSpanEnd(((CharacterStyle)object0));
            spannable0.removeSpan(((CharacterStyle)object0));
            spannable0.setSpan(((CharacterStyle)object0), v, v1, SpanUtil.INSTANCE.getFlag(v, ((CharacterStyle)object0)));
        }
    }
}

