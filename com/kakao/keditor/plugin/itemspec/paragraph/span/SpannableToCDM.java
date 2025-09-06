package com.kakao.keditor.plugin.itemspec.paragraph.span;

import a5.b;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.cdm.ImageAttribute;
import com.kakao.keditor.plugin.attrs.text.spans.KeBackgroundColorSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeBoldSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeFontSizeSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeForegroundColorSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeImageSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeItalicSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeStrikethroughSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeTypefaceSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeURLSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeUnderlineSpan;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.c;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\b2\u000E\u0010\n\u001A\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000BH\u0002J \u0010\r\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\tH\u0002J\u0012\u0010\u0011\u001A\u00020\u000F2\b\u0010\u0012\u001A\u0004\u0018\u00010\fH\u0002J \u0010\u0013\u001A\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00142\b\u0010\u0012\u001A\u0004\u0018\u00010\fH\u0002J\u0016\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001A\u00020\u0006H\u0002J&\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u000F0\b2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u00020\u0019H\u0002J\u0016\u0010\u001B\u001A\u00020\u000F2\u0006\u0010\u001C\u001A\u00020\u000F2\u0006\u0010\u0005\u001A\u00020\u0006J\u0018\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\tH\u0002J\u0018\u0010!\u001A\u00020\u001E2\u0006\u0010\"\u001A\u00020\t2\u0006\u0010#\u001A\u00020\tH\u0002J\u0016\u0010$\u001A\u00020\u00042\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0016\u0010%\u001A\u00020\u00042\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006&"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/span/SpannableToCDM;", "", "()V", "addTextSpanInfo", "", "inputText", "Landroid/text/SpannableStringBuilder;", "spanList", "", "Lcom/kakao/keditor/plugin/itemspec/paragraph/span/TextSpanInfo;", "spanClass", "Ljava/lang/Class;", "Landroid/text/style/CharacterStyle;", "createCDM", "parentModel", "Lcom/kakao/keditor/cdm/CDM$Item;", "parentSpan", "createCdmItem", "span", "createKeditorModelAttribute", "", "", "createSpanList", "createTextModel", "start", "", "end", "generate", "item", "intersectSpans", "", "targetSpanInfo", "spanInfo", "isTargetBelongSpan", "prevSpan", "targetSpan", "linkSpanListToTree", "splitCrossedSpan", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSpannableToCDM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableToCDM.kt\ncom/kakao/keditor/plugin/itemspec/paragraph/span/SpannableToCDM\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,240:1\n13309#2,2:241\n1#3:243\n1855#4,2:244\n*S KotlinDebug\n*F\n+ 1 SpannableToCDM.kt\ncom/kakao/keditor/plugin/itemspec/paragraph/span/SpannableToCDM\n*L\n51#1:241,2\n218#1:244,2\n*E\n"})
public final class SpannableToCDM {
    @NotNull
    public static final SpannableToCDM INSTANCE;

    static {
        SpannableToCDM.INSTANCE = new SpannableToCDM();
    }

    private final void addTextSpanInfo(SpannableStringBuilder spannableStringBuilder0, List list0, Class class0) {
        CharacterStyle[] arr_characterStyle = (CharacterStyle[])spannableStringBuilder0.getSpans(0, spannableStringBuilder0.length(), class0);
        if(arr_characterStyle != null) {
            for(int v = 0; v < arr_characterStyle.length; ++v) {
                CharacterStyle characterStyle0 = arr_characterStyle[v];
                list0.add(new TextSpanInfo(spannableStringBuilder0.getSpanStart(characterStyle0), spannableStringBuilder0.getSpanEnd(characterStyle0), characterStyle0, null, 8, null));
            }
        }
    }

    private final void createCDM(Item cDM$Item0, SpannableStringBuilder spannableStringBuilder0, TextSpanInfo textSpanInfo0) {
        boolean z = textSpanInfo0.getSpan() == null;
        Item cDM$Item1 = z ? cDM$Item0 : this.createCdmItem(textSpanInfo0.getSpan());
        if(cDM$Item1.getChildren() == null) {
            cDM$Item1.setChildren(new ArrayList());
        }
        int v = textSpanInfo0.getStart();
        int v1 = textSpanInfo0.getEnd();
        for(Object object0: textSpanInfo0.getChildren()) {
            TextSpanInfo textSpanInfo1 = (TextSpanInfo)object0;
            if(v < textSpanInfo1.getStart()) {
                List list0 = cDM$Item1.getChildren();
                Intrinsics.checkNotNull(list0);
                list0.addAll(this.createTextModel(spannableStringBuilder0, v, textSpanInfo1.getStart()));
            }
            this.createCDM(cDM$Item1, spannableStringBuilder0, textSpanInfo1);
            v = textSpanInfo1.getEnd();
        }
        if(v < v1) {
            List list1 = cDM$Item1.getChildren();
            Intrinsics.checkNotNull(list1);
            list1.addAll(this.createTextModel(spannableStringBuilder0, v, v1));
        }
        if(!z) {
            List list2 = cDM$Item0.getChildren();
            Intrinsics.checkNotNull(list2);
            list2.add(cDM$Item1);
        }
    }

    // 去混淆评级： 低(20)
    private final Item createCdmItem(CharacterStyle characterStyle0) {
        return characterStyle0 instanceof KeImageSpan ? new Item("image", this.createKeditorModelAttribute(characterStyle0), null, 4, null) : new Item("text", this.createKeditorModelAttribute(characterStyle0), null, 4, null);
    }

    private final Map createKeditorModelAttribute(CharacterStyle characterStyle0) {
        Map map0 = new LinkedHashMap();
        if(characterStyle0 instanceof StyleSpan) {
            if(((StyleSpan)characterStyle0).getStyle().equals(1)) {
                map0.put("textStyle", "bold");
                return map0;
            }
            if(((StyleSpan)characterStyle0).getStyle().equals(2)) {
                map0.put("textStyle", "italic");
                return map0;
            }
        }
        else {
            if(characterStyle0 instanceof KeUnderlineSpan) {
                map0.put("textStyle", "underline");
                return map0;
            }
            if(characterStyle0 instanceof KeStrikethroughSpan) {
                map0.put("textStyle", "lineThrough");
                return map0;
            }
            if(characterStyle0 instanceof KeURLSpan) {
                map0.put("link", ((KeURLSpan)characterStyle0).getUrl());
                Boolean boolean0 = ((KeURLSpan)characterStyle0).isLinkNewWindow();
                if(boolean0 != null) {
                    map0.put("isLinkNewWindow", boolean0);
                }
                String s = ((KeURLSpan)characterStyle0).getLinkTitle();
                if(s != null) {
                    map0.put("title", s);
                    return map0;
                }
            }
            else {
                if(characterStyle0 instanceof KeForegroundColorSpan) {
                    map0.put("textColor", b.f(1, "#%06X", "format(...)", new Object[]{((int)(((KeForegroundColorSpan)characterStyle0).getForegroundColor() & 0xFFFFFF))}));
                    return map0;
                }
                if(characterStyle0 instanceof KeBackgroundColorSpan) {
                    map0.put("backgroundColor", b.f(1, "#%06X", "format(...)", new Object[]{((int)(((KeBackgroundColorSpan)characterStyle0).getBackgroundColor() & 0xFFFFFF))}));
                    return map0;
                }
                if(characterStyle0 instanceof KeTypefaceSpan) {
                    String s1 = ((KeTypefaceSpan)characterStyle0).getFamily();
                    Intrinsics.checkNotNull(s1);
                    map0.put("fontFamily", s1);
                    return map0;
                }
                if(characterStyle0 instanceof KeFontSizeSpan) {
                    map0.put("size", "size" + ((KeFontSizeSpan)characterStyle0).getCharacterSize().getFontSize());
                    return map0;
                }
                if(characterStyle0 instanceof KeImageSpan) {
                    ImageAttribute imageAttribute0 = ((KeImageSpan)characterStyle0).getImageAttr();
                    map0.put("originWidth", imageAttribute0.getOriginWidth());
                    map0.put("originHeight", imageAttribute0.getOriginHeight());
                    String s2 = imageAttribute0.getSrc();
                    if(s2 != null) {
                        map0.put("src", s2);
                    }
                    Integer integer0 = imageAttribute0.getWidth();
                    if(integer0 != null) {
                        map0.put("width", integer0.intValue());
                    }
                    Integer integer1 = imageAttribute0.getHeight();
                    if(integer1 != null) {
                        map0.put("height", integer1.intValue());
                    }
                    String s3 = imageAttribute0.getStyle();
                    if(s3 != null) {
                        map0.put("style", s3);
                    }
                    String s4 = imageAttribute0.getMobileStyle();
                    if(s4 != null) {
                        map0.put("mobileStyle", s4);
                    }
                    String s5 = imageAttribute0.getLink();
                    if(s5 != null) {
                        map0.put("link", s5);
                    }
                    Boolean boolean1 = imageAttribute0.isLinkNewWindow();
                    if(boolean1 != null) {
                        map0.put("isLinkNewWindow", boolean1);
                    }
                    String s6 = imageAttribute0.getTitle();
                    if(s6 != null) {
                        map0.put("title", s6);
                    }
                    String s7 = imageAttribute0.getAlt();
                    if(s7 != null) {
                        map0.put("alt", s7);
                    }
                    String s8 = imageAttribute0.getCaption();
                    if(s8 != null) {
                        map0.put("caption", s8);
                    }
                    String s9 = imageAttribute0.getMimeType();
                    if(s9 != null) {
                        map0.put("mimeType", s9);
                    }
                }
            }
        }
        return map0;
    }

    private final List createSpanList(SpannableStringBuilder spannableStringBuilder0) {
        List list0 = new ArrayList();
        this.addTextSpanInfo(spannableStringBuilder0, list0, KeBoldSpan.class);
        this.addTextSpanInfo(spannableStringBuilder0, list0, KeItalicSpan.class);
        this.addTextSpanInfo(spannableStringBuilder0, list0, KeUnderlineSpan.class);
        this.addTextSpanInfo(spannableStringBuilder0, list0, KeStrikethroughSpan.class);
        this.addTextSpanInfo(spannableStringBuilder0, list0, KeURLSpan.class);
        this.addTextSpanInfo(spannableStringBuilder0, list0, KeForegroundColorSpan.class);
        this.addTextSpanInfo(spannableStringBuilder0, list0, KeBackgroundColorSpan.class);
        this.addTextSpanInfo(spannableStringBuilder0, list0, KeTypefaceSpan.class);
        this.addTextSpanInfo(spannableStringBuilder0, list0, KeFontSizeSpan.class);
        this.addTextSpanInfo(spannableStringBuilder0, list0, KeImageSpan.class);
        return list0;
    }

    private final List createTextModel(SpannableStringBuilder spannableStringBuilder0, int v, int v1) {
        String s = spannableStringBuilder0.subSequence(v, v1).toString();
        List list0 = new ArrayList();
        boolean z = false;
        for(Object object0: StringsKt__StringsKt.split$default(s, new char[]{'\n'}, false, 0, 6, null)) {
            String s1 = (String)object0;
            if(z) {
                list0.add(new Item("break", null, null, 6, null));
            }
            if(s1.length() > 0) {
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                linkedHashMap0.put("text", s1);
                list0.add(new Item("text", linkedHashMap0, null, 4, null));
            }
            z = true;
        }
        return list0;
    }

    @NotNull
    public final Item generate(@NotNull Item cDM$Item0, @NotNull SpannableStringBuilder spannableStringBuilder0) {
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(spannableStringBuilder0, "inputText");
        List list0 = this.createSpanList(spannableStringBuilder0);
        this.splitCrossedSpan(list0);
        TextSpanInfo textSpanInfo0 = new TextSpanInfo(0, spannableStringBuilder0.length(), null, null, 12, null);
        list0.add(0, textSpanInfo0);
        this.linkSpanListToTree(list0);
        this.createCDM(cDM$Item0, spannableStringBuilder0, textSpanInfo0);
        return cDM$Item0;
    }

    private final boolean intersectSpans(TextSpanInfo textSpanInfo0, TextSpanInfo textSpanInfo1) {
        return textSpanInfo0.getEnd() > textSpanInfo1.getStart() && textSpanInfo0.getEnd() < textSpanInfo1.getEnd();
    }

    private final boolean isTargetBelongSpan(TextSpanInfo textSpanInfo0, TextSpanInfo textSpanInfo1) {
        return textSpanInfo0.getStart() <= textSpanInfo1.getStart() && textSpanInfo1.getEnd() <= textSpanInfo0.getEnd();
    }

    private final void linkSpanListToTree(List list0) {
        for(int v = list0.size() - 1; -1 < v; --v) {
            TextSpanInfo textSpanInfo0 = (TextSpanInfo)list0.get(v);
            for(int v1 = v - 1; -1 < v1; --v1) {
                TextSpanInfo textSpanInfo1 = (TextSpanInfo)list0.get(v1);
                if(this.isTargetBelongSpan(textSpanInfo1, textSpanInfo0)) {
                    textSpanInfo1.getChildren().add(0, textSpanInfo0);
                    break;
                }
            }
        }
    }

    private final void splitCrossedSpan(List list0) {
        n.sortWith(list0, c.compareBy(new Function1[]{com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.1.INSTANCE, com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.2.INSTANCE}));
        int v = list0.size();
        int v1 = 0;
        while(v1 < v) {
            TextSpanInfo textSpanInfo0 = (TextSpanInfo)list0.get(v1);
            ++v1;
            int v2 = v1;
            boolean z = false;
            while(v2 < v) {
                TextSpanInfo textSpanInfo1 = (TextSpanInfo)list0.get(v2);
                if(this.intersectSpans(textSpanInfo0, textSpanInfo1)) {
                    list0.add(v2 + 1, new TextSpanInfo(textSpanInfo0.getEnd(), textSpanInfo1.getEnd(), textSpanInfo1.getSpan(), null, 8, null));
                    textSpanInfo1.setEnd(textSpanInfo0.getEnd());
                    v = list0.size();
                    v2 += 2;
                    z = true;
                }
                else {
                    if(textSpanInfo0.getEnd() < textSpanInfo1.getStart()) {
                        break;
                    }
                    ++v2;
                }
            }
            if(z) {
                n.sortWith(list0, c.compareBy(new Function1[]{com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.3.INSTANCE, com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.4.INSTANCE}));
            }
        }

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u000F\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/plugin/itemspec/paragraph/span/TextSpanInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.1 extends Lambda implements Function1 {
            public static final com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.1 INSTANCE;

            static {
                com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.1.INSTANCE = new com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.1();
            }

            public com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.1() {
                super(1);
            }

            @Nullable
            public final Comparable invoke(@NotNull TextSpanInfo textSpanInfo0) {
                Intrinsics.checkNotNullParameter(textSpanInfo0, "it");
                return textSpanInfo0.getStart();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((TextSpanInfo)object0));
            }
        }


        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u000F\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/plugin/itemspec/paragraph/span/TextSpanInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.2 extends Lambda implements Function1 {
            public static final com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.2 INSTANCE;

            static {
                com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.2.INSTANCE = new com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.2();
            }

            public com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.2() {
                super(1);
            }

            @Nullable
            public final Comparable invoke(@NotNull TextSpanInfo textSpanInfo0) {
                Intrinsics.checkNotNullParameter(textSpanInfo0, "it");
                return (int)(-textSpanInfo0.getEnd());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((TextSpanInfo)object0));
            }
        }


        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u000F\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/plugin/itemspec/paragraph/span/TextSpanInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.3 extends Lambda implements Function1 {
            public static final com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.3 INSTANCE;

            static {
                com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.3.INSTANCE = new com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.3();
            }

            public com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.3() {
                super(1);
            }

            @Nullable
            public final Comparable invoke(@NotNull TextSpanInfo textSpanInfo0) {
                Intrinsics.checkNotNullParameter(textSpanInfo0, "it");
                return textSpanInfo0.getStart();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((TextSpanInfo)object0));
            }
        }


        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u000F\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/plugin/itemspec/paragraph/span/TextSpanInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.4 extends Lambda implements Function1 {
            public static final com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.4 INSTANCE;

            static {
                com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.4.INSTANCE = new com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.4();
            }

            public com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM.splitCrossedSpan.4() {
                super(1);
            }

            @Nullable
            public final Comparable invoke(@NotNull TextSpanInfo textSpanInfo0) {
                Intrinsics.checkNotNullParameter(textSpanInfo0, "it");
                return (int)(-textSpanInfo0.getEnd());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((TextSpanInfo)object0));
            }
        }

    }
}

