package com.kakao.keditor.plugin.itemspec.paragraph;

import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.attrs.Alignment.Left;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.item.Aligned;
import com.kakao.keditor.plugin.attrs.item.NoUpdateWhenGotFocus;
import com.kakao.keditor.plugin.attrs.text.ParagraphStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000F\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010,\u001A\u00020-J\u0006\u0010.\u001A\u00020-J\u0006\u0010/\u001A\u00020-J\u0006\u00100\u001A\u00020\u0005J\b\u00101\u001A\u00020\u0005H\u0016J\u0006\u00102\u001A\u00020-R$\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\b@VX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u001A\u0010\u0004\u001A\u00020\u0005X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0006R$\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0007\u001A\u00020\u0011@FX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001C\u0010\u0017\u001A\u0004\u0018\u00010\u0018X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR\u0018\u0010\u001D\u001A\u00020\u001EX¦\u000E¢\u0006\f\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R\u0018\u0010#\u001A\u00020\u001EX¦\u000E¢\u0006\f\u001A\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u0018\u0010&\u001A\u00020\'X¦\u000E¢\u0006\f\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00063"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/TextItem;", "Lcom/kakao/keditor/KeditorItem;", "Lcom/kakao/keditor/plugin/attrs/item/Aligned;", "Lcom/kakao/keditor/plugin/attrs/item/NoUpdateWhenGotFocus;", "hasPendingFocus", "", "(Z)V", "value", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "alignment", "getAlignment", "()Lcom/kakao/keditor/plugin/attrs/Alignment;", "setAlignment", "(Lcom/kakao/keditor/plugin/attrs/Alignment;)V", "getHasPendingFocus", "()Z", "setHasPendingFocus", "Lcom/kakao/keditor/plugin/attrs/text/ParagraphStyle;", "paragraphStyle", "getParagraphStyle", "()Lcom/kakao/keditor/plugin/attrs/text/ParagraphStyle;", "setParagraphStyle", "(Lcom/kakao/keditor/plugin/attrs/text/ParagraphStyle;)V", "pendingStyle", "Landroid/text/style/CharacterStyle;", "getPendingStyle", "()Landroid/text/style/CharacterStyle;", "setPendingStyle", "(Landroid/text/style/CharacterStyle;)V", "selectionEnd", "", "getSelectionEnd", "()I", "setSelectionEnd", "(I)V", "selectionStart", "getSelectionStart", "setSelectionStart", "text", "Landroid/text/SpannableStringBuilder;", "getText", "()Landroid/text/SpannableStringBuilder;", "setText", "(Landroid/text/SpannableStringBuilder;)V", "clearSelection", "", "consumeFocus", "consumePendingStyle", "hasSelection", "isEmpty", "keepFocus", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class TextItem extends KeditorItem implements Aligned, NoUpdateWhenGotFocus {
    @NotNull
    private Alignment alignment;
    private boolean hasPendingFocus;
    @NotNull
    private ParagraphStyle paragraphStyle;
    @Nullable
    private CharacterStyle pendingStyle;

    public TextItem() {
        this(false, 1, null);
    }

    public TextItem(boolean z) {
        this.hasPendingFocus = z;
        this.paragraphStyle = ParagraphStyle.ParagraphStyle5;
        this.alignment = Left.INSTANCE;
    }

    public TextItem(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        this(z);
    }

    public final void clearSelection() {
        this.setSelectionStart(-1);
        this.setSelectionEnd(-1);
    }

    public final void consumeFocus() {
        this.setHasPendingFocus(false);
    }

    public final void consumePendingStyle() {
        this.pendingStyle = null;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    @NotNull
    public Alignment getAlignment() {
        return this.alignment;
    }

    public boolean getHasPendingFocus() {
        return this.hasPendingFocus;
    }

    @NotNull
    public final ParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    @Nullable
    public final CharacterStyle getPendingStyle() {
        return this.pendingStyle;
    }

    public abstract int getSelectionEnd();

    public abstract int getSelectionStart();

    @NotNull
    public abstract SpannableStringBuilder getText();

    public final boolean hasSelection() {
        return this.getSelectionStart() != -1 && this.getSelectionEnd() != -1;
    }

    @Override  // com.kakao.keditor.KeditorItem
    public boolean isEmpty() {
        return this.getText().length() == 0;
    }

    public final void keepFocus() {
        this.setHasPendingFocus(true);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    public void setAlignment(@NotNull Alignment alignment0) {
        Intrinsics.checkNotNullParameter(alignment0, "value");
        this.removeBypass("textAlign");
        this.alignment = alignment0;
    }

    public void setHasPendingFocus(boolean z) {
        this.hasPendingFocus = z;
    }

    public final void setParagraphStyle(@NotNull ParagraphStyle paragraphStyle0) {
        Intrinsics.checkNotNullParameter(paragraphStyle0, "value");
        this.removeBypass("size");
        this.paragraphStyle = paragraphStyle0;
    }

    public final void setPendingStyle(@Nullable CharacterStyle characterStyle0) {
        this.pendingStyle = characterStyle0;
    }

    public abstract void setSelectionEnd(int arg1);

    public abstract void setSelectionStart(int arg1);

    public abstract void setText(@NotNull SpannableStringBuilder arg1);
}

