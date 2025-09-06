package com.kakao.keditor.plugin.itemspec.paragraph;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.kakao.common.widget.ContentDescriptionKt;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.event.common.AddItem;
import com.kakao.keditor.event.common.RefreshPosition;
import com.kakao.keditor.plugin.KeditorPlugin;
import com.kakao.keditor.plugin.KeditorPluginKt;
import com.kakao.keditor.standard.EditTextStandardKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001AS\u0010\u0000\u001A\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\n\u0010\u0005\u001A\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\b\u001A\u00020\t2\u0012\u0010\n\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u000B\"\u0002H\u00022\b\b\u0002\u0010\f\u001A\u00020\r¢\u0006\u0002\u0010\u000E\u001A\"\u0010\u000F\u001A\u00020\u0010\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0001\u001A(\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00030\u0012*\u00020\u00042\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u00122\b\b\u0002\u0010\f\u001A\u00020\r\u001A\u0012\u0010\u0013\u001A\u00020\u0004*\u00020\u00042\u0006\u0010\u0014\u001A\u00020\u0004\u001A \u0010\u0015\u001A\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016*\u00020\u0004¨\u0006\u0018"}, d2 = {"insert", "", "T", "Lcom/kakao/keditor/KeditorItem;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;", "plugin", "Lcom/kakao/keditor/plugin/KeditorPlugin;", "position", "flow", "Lcom/kakao/keditor/event/EventFlow;", "items", "", "focusOnNextParagraph", "", "(Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;Lcom/kakao/keditor/plugin/KeditorPlugin;ILcom/kakao/keditor/event/EventFlow;[Lcom/kakao/keditor/KeditorItem;Z)I", "insertEmptyParagraphItem", "", "itemListAfterSplit", "", "merge", "requested", "splitText", "Lkotlin/Triple;", "Landroid/text/SpannableStringBuilder;", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nParagraphItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphItem.kt\ncom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItemKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
public final class ParagraphItemKt {
    public static final int insert(@NotNull ParagraphItem paragraphItem0, @NotNull KeditorPlugin keditorPlugin0, int v, @NotNull EventFlow eventFlow0, @NotNull KeditorItem[] arr_keditorItem, boolean z) {
        Intrinsics.checkNotNullParameter(paragraphItem0, "<this>");
        Intrinsics.checkNotNullParameter(keditorPlugin0, "plugin");
        Intrinsics.checkNotNullParameter(eventFlow0, "flow");
        Intrinsics.checkNotNullParameter(arr_keditorItem, "items");
        SpannableStringBuilder spannableStringBuilder0 = null;
        CharSequence charSequence0 = !paragraphItem0.hasSelection() || paragraphItem0.getSelectionStart() >= paragraphItem0.getText().length() ? null : paragraphItem0.getText().subSequence(paragraphItem0.getSelectionStart(), paragraphItem0.getText().length());
        if(charSequence0 != null) {
            CharSequence charSequence1 = paragraphItem0.getText().subSequence(0, paragraphItem0.getSelectionStart());
            Intrinsics.checkNotNull(charSequence1, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
            paragraphItem0.setText(((SpannableStringBuilder)charSequence1));
        }
        eventFlow0.post(new RefreshPosition(v));
        int v1 = v + 1;
        for(int v2 = 0; v2 < arr_keditorItem.length; ++v2) {
            KeditorItem keditorItem0 = arr_keditorItem[v2];
            eventFlow0.post(new AddItem(v1, keditorItem0, true));
            Integer integer0 = KeditorPluginKt.indexOf(keditorPlugin0, keditorItem0);
            if(integer0 != null) {
                v1 = (int)integer0;
            }
            ++v1;
        }
        Integer integer1 = v1;
        if(charSequence0 instanceof SpannableStringBuilder) {
            spannableStringBuilder0 = (SpannableStringBuilder)charSequence0;
        }
        eventFlow0.post(new AddItem(integer1, new ParagraphItem((spannableStringBuilder0 == null ? new SpannableStringBuilder("") : spannableStringBuilder0), !ContentDescriptionKt.isAccessibilityEnabled(Keditor.INSTANCE.getContext()) && z, false, 4, null), false, 4, null));
        return v1;
    }

    public static int insert$default(ParagraphItem paragraphItem0, KeditorPlugin keditorPlugin0, int v, EventFlow eventFlow0, KeditorItem[] arr_keditorItem, boolean z, int v1, Object object0) {
        if((v1 & 16) != 0) {
            z = true;
        }
        return ParagraphItemKt.insert(paragraphItem0, keditorPlugin0, v, eventFlow0, arr_keditorItem, z);
    }

    public static final void insertEmptyParagraphItem(@NotNull KeditorPlugin keditorPlugin0, int v) {
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        keditorPlugin0.getFlow().post(new AddItem(v, new ParagraphItem(new SpannableStringBuilder(""), true, false, 4, null), false, 4, null));
    }

    @NotNull
    public static final List itemListAfterSplit(@NotNull ParagraphItem paragraphItem0, @NotNull List list0, boolean z) {
        Intrinsics.checkNotNullParameter(paragraphItem0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "items");
        List list1 = new ArrayList();
        SpannableStringBuilder spannableStringBuilder0 = null;
        CharSequence charSequence0 = !paragraphItem0.hasSelection() || paragraphItem0.getSelectionStart() >= paragraphItem0.getText().length() ? null : paragraphItem0.getText().subSequence(paragraphItem0.getSelectionStart(), paragraphItem0.getText().length());
        boolean z1 = false;
        if(charSequence0 != null) {
            CharSequence charSequence1 = paragraphItem0.getText().subSequence(0, paragraphItem0.getSelectionStart());
            Intrinsics.checkNotNull(charSequence1, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
            paragraphItem0.setText(((SpannableStringBuilder)charSequence1));
        }
        list1.add(paragraphItem0);
        list1.addAll(list0);
        if(charSequence0 != null || !(CollectionsKt___CollectionsKt.last(list0) instanceof ParagraphItem)) {
            if(charSequence0 instanceof SpannableStringBuilder) {
                spannableStringBuilder0 = (SpannableStringBuilder)charSequence0;
            }
            SpannableStringBuilder spannableStringBuilder1 = spannableStringBuilder0 == null ? new SpannableStringBuilder("") : spannableStringBuilder0;
            if(!ContentDescriptionKt.isAccessibilityEnabled(Keditor.INSTANCE.getContext()) && z) {
                z1 = true;
            }
            list1.add(new ParagraphItem(spannableStringBuilder1, z1, false, 4, null));
        }
        return list1;
    }

    public static List itemListAfterSplit$default(ParagraphItem paragraphItem0, List list0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        return ParagraphItemKt.itemListAfterSplit(paragraphItem0, list0, z);
    }

    @NotNull
    public static final ParagraphItem merge(@NotNull ParagraphItem paragraphItem0, @NotNull ParagraphItem paragraphItem1) {
        Intrinsics.checkNotNullParameter(paragraphItem0, "<this>");
        Intrinsics.checkNotNullParameter(paragraphItem1, "requested");
        paragraphItem0.setDisableOnTextChanged(true);
        CharSequence charSequence0 = paragraphItem1.getText().subSequence(0, paragraphItem1.getText().length());
        Intrinsics.checkNotNullExpressionValue(charSequence0, "subSequence(...)");
        if(paragraphItem0.getText().length() > 0) {
            EditTextStandardKt.appendWithoutExpandingSpans(paragraphItem0.getText(), "\n");
        }
        paragraphItem0.getText().append(charSequence0);
        paragraphItem0.setDisableOnTextChanged(false);
        return paragraphItem0;
    }

    @NotNull
    public static final Triple splitText(@NotNull ParagraphItem paragraphItem0) {
        SpannableStringBuilder spannableStringBuilder1;
        Intrinsics.checkNotNullParameter(paragraphItem0, "<this>");
        int v = paragraphItem0.getSelectionStart();
        int v1 = paragraphItem0.getSelectionEnd();
        if(v > v1) {
            int v2 = v1;
            v1 = v;
            v = v2;
        }
        if(v > 0 && v < paragraphItem0.getText().length() && paragraphItem0.getText().charAt(v) == 10 && v == v1) {
            --v;
        }
        int v3 = StringsKt__StringsKt.lastIndexOf(paragraphItem0.getText(), '\n', v, true);
        int v4 = StringsKt__StringsKt.indexOf(paragraphItem0.getText(), '\n', v1, true);
        if(v3 == -1) {
            v3 = 0;
        }
        if(v4 == -1) {
            v4 = paragraphItem0.getText().length();
        }
        SpannableStringBuilder spannableStringBuilder0 = null;
        if(v3 != 0 || 0 < paragraphItem0.getText().length() && paragraphItem0.getText().charAt(0) == 10) {
            CharSequence charSequence0 = paragraphItem0.getText().subSequence(0, v3);
            Intrinsics.checkNotNull(charSequence0, "null cannot be cast to non-null type android.text.Spannable");
            spannableStringBuilder1 = new SpannableStringBuilder(((Spannable)charSequence0));
            ++v3;
            if(v4 < v3) {
                v4 = v3;
            }
        }
        else {
            spannableStringBuilder1 = null;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(paragraphItem0.getText(), v3, v4);
        if(v4 < paragraphItem0.getText().length()) {
            CharSequence charSequence1 = paragraphItem0.getText().subSequence(v4 + 1, paragraphItem0.getText().length());
            Intrinsics.checkNotNull(charSequence1, "null cannot be cast to non-null type android.text.Spannable");
            spannableStringBuilder0 = new SpannableStringBuilder(((Spannable)charSequence1));
        }
        return new Triple(spannableStringBuilder1, spannableStringBuilder2, spannableStringBuilder0);
    }
}

