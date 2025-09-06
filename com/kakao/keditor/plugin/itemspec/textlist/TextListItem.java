package com.kakao.keditor.plugin.itemspec.textlist;

import android.text.SpannableStringBuilder;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.itemspec.paragraph.GrammarCheckTextItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@KeditorItemType(type = "list")
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u000F\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010.\u001A\u00020/J\u000E\u00100\u001A\b\u0012\u0004\u0012\u00020\"01H\u0016R\u001A\u0010\u0005\u001A\u00020\u0006X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001A\u0010\u0002\u001A\u00020\u0003X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u0004R\u001A\u0010\u000E\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\f\"\u0004\b\u000F\u0010\u0004R \u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001A\u00020\u00188F¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR\u001A\u0010\u001B\u001A\u00020\u0006X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001C\u0010\b\"\u0004\b\u001D\u0010\nR\u001A\u0010\u001E\u001A\u00020\u0006X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010\b\"\u0004\b \u0010\nR$\u0010#\u001A\u00020\"2\u0006\u0010!\u001A\u00020\"@FX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001A\u0010(\u001A\u00020)X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00063"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/textlist/TextListItem;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/GrammarCheckTextItem;", "hasPendingFocus", "", "(Z)V", "focused", "", "getFocused", "()I", "setFocused", "(I)V", "getHasPendingFocus", "()Z", "setHasPendingFocus", "isDead", "setDead", "items", "", "Lcom/kakao/keditor/plugin/itemspec/textlist/TextListItemContent;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "listType", "Lcom/kakao/keditor/plugin/itemspec/textlist/ListType;", "getListType", "()Lcom/kakao/keditor/plugin/itemspec/textlist/ListType;", "selectionEnd", "getSelectionEnd", "setSelectionEnd", "selectionStart", "getSelectionStart", "setSelectionStart", "value", "", "style", "getStyle", "()Ljava/lang/String;", "setStyle", "(Ljava/lang/String;)V", "text", "Landroid/text/SpannableStringBuilder;", "getText", "()Landroid/text/SpannableStringBuilder;", "setText", "(Landroid/text/SpannableStringBuilder;)V", "die", "", "parseGrammarCheckTexts", "", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextListItem.kt\ncom/kakao/keditor/plugin/itemspec/textlist/TextListItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1549#2:44\n1620#2,3:45\n*S KotlinDebug\n*F\n+ 1 TextListItem.kt\ncom/kakao/keditor/plugin/itemspec/textlist/TextListItem\n*L\n29#1:44\n29#1:45,3\n*E\n"})
public final class TextListItem extends GrammarCheckTextItem {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/textlist/TextListItem$Companion;", "", "()V", "newInstance", "Lcom/kakao/keditor/plugin/itemspec/textlist/TextListItem;", "hasFocus", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final TextListItem newInstance(boolean z) {
            TextListItem textListItem0 = new TextListItem(z);
            textListItem0.setFocused(0);
            textListItem0.getItems().add(new TextListItemContent(new SpannableStringBuilder(""), 0, 1));
            return textListItem0;
        }

        public static TextListItem newInstance$default(Companion textListItem$Companion0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = false;
            }
            return textListItem$Companion0.newInstance(z);
        }
    }

    @NotNull
    public static final Companion Companion;
    private int focused;
    private boolean hasPendingFocus;
    private boolean isDead;
    @NotNull
    private List items;
    private int selectionEnd;
    private int selectionStart;
    @NotNull
    private String style;
    @NotNull
    private SpannableStringBuilder text;

    static {
        TextListItem.Companion = new Companion(null);
    }

    public TextListItem() {
        this(false, 1, null);
    }

    public TextListItem(boolean z) {
        super(z);
        this.hasPendingFocus = z;
        this.items = new ArrayList();
        this.style = "disc";
        this.focused = -1;
        this.text = new SpannableStringBuilder("");
        this.selectionStart = -1;
        this.selectionEnd = -1;
    }

    public TextListItem(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        this(z);
    }

    public final void die() {
        this.isDead = true;
    }

    public final int getFocused() {
        return this.focused;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.GrammarCheckTextItem
    public boolean getHasPendingFocus() {
        return this.hasPendingFocus;
    }

    @NotNull
    public final List getItems() {
        return this.items;
    }

    @NotNull
    public final ListType getListType() {
        return ListType.Companion.getByName(this.style);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public int getSelectionEnd() {
        return this.selectionEnd;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public int getSelectionStart() {
        return this.selectionStart;
    }

    @NotNull
    public final String getStyle() {
        return this.style;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    @NotNull
    public SpannableStringBuilder getText() {
        return this.text;
    }

    public final boolean isDead() {
        return this.isDead;
    }

    @JvmStatic
    @NotNull
    public static final TextListItem newInstance(boolean z) {
        return TextListItem.Companion.newInstance(z);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.GrammarCheckTextItem
    @NotNull
    public List parseGrammarCheckTexts() {
        Iterable iterable0 = this.items;
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            list0.add(((TextListItemContent)object0).getText().toString());
        }
        return list0;
    }

    public final void setDead(boolean z) {
        this.isDead = z;
    }

    public final void setFocused(int v) {
        this.focused = v;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.GrammarCheckTextItem
    public void setHasPendingFocus(boolean z) {
        this.hasPendingFocus = z;
    }

    public final void setItems(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<set-?>");
        this.items = list0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public void setSelectionEnd(int v) {
        this.selectionEnd = v;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public void setSelectionStart(int v) {
        this.selectionStart = v;
    }

    public final void setStyle(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.removeBypass("style");
        this.style = s;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public void setText(@NotNull SpannableStringBuilder spannableStringBuilder0) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder0, "<set-?>");
        this.text = spannableStringBuilder0;
    }
}

