package com.kakao.keditor.plugin.itemspec.paragraph;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.kakao.keditor.plugin.KeditorItemType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@KeditorItemType(type = "paragraph")
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b\u0017\u0018\u0000 (2\u00020\u0001:\u0001(B!\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010#\u001A\u00020\u0005J\b\u0010$\u001A\u00020 H\u0016J\u000E\u0010%\u001A\u00020&2\u0006\u0010\u0019\u001A\u00020\'R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u001A\u0010\n\u001A\u00020\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER\u001A\u0010\u0006\u001A\u00020\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\f\"\u0004\b\u000F\u0010\u000ER\u001A\u0010\u0010\u001A\u00020\u0011X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001A\u0010\u0016\u001A\u00020\u0011X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001A\u0010\u0019\u001A\u00020\u001AX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\u0014\u0010\u001F\u001A\u00020 8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b!\u0010\"¨\u0006)"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/SingleTextItem;", "content", "Landroid/text/Spannable;", "hasPendingFocus", "", "isHeadingType", "(Landroid/text/Spannable;ZZ)V", "getContent", "()Landroid/text/Spannable;", "disableOnTextChanged", "getDisableOnTextChanged", "()Z", "setDisableOnTextChanged", "(Z)V", "setHeadingType", "selectionEnd", "", "getSelectionEnd", "()I", "setSelectionEnd", "(I)V", "selectionStart", "getSelectionStart", "setSelectionStart", "text", "Landroid/text/SpannableStringBuilder;", "getText", "()Landroid/text/SpannableStringBuilder;", "setText", "(Landroid/text/SpannableStringBuilder;)V", "type", "", "getType", "()Ljava/lang/String;", "isParagraphHeadType", "toString", "updateText", "", "", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class ParagraphItem extends SingleTextItem {
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u0006H\u0007J\u001C\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem$Companion;", "", "()V", "newHeadingInstance", "Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;", "hasFocus", "", "newInstance", "isHeadingType", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final ParagraphItem newHeadingInstance(boolean z) {
            return new ParagraphItem(new SpannableStringBuilder(""), z, false, 4, null);
        }

        public static ParagraphItem newHeadingInstance$default(Companion paragraphItem$Companion0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = false;
            }
            return paragraphItem$Companion0.newHeadingInstance(z);
        }

        @JvmStatic
        @NotNull
        public final ParagraphItem newInstance(boolean z, boolean z1) {
            return new ParagraphItem(new SpannableStringBuilder(""), z, z1);
        }

        public static ParagraphItem newInstance$default(Companion paragraphItem$Companion0, boolean z, boolean z1, int v, Object object0) {
            if((v & 1) != 0) {
                z = false;
            }
            if((v & 2) != 0) {
                z1 = false;
            }
            return paragraphItem$Companion0.newInstance(z, z1);
        }
    }

    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Spannable content;
    private boolean disableOnTextChanged;
    private boolean isHeadingType;
    private int selectionEnd;
    private int selectionStart;
    @NotNull
    private SpannableStringBuilder text;

    static {
        ParagraphItem.Companion = new Companion(null);
    }

    public ParagraphItem(@NotNull Spannable spannable0, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(spannable0, "content");
        super(z);
        this.content = spannable0;
        this.isHeadingType = z1;
        this.text = new SpannableStringBuilder(spannable0);
        this.selectionStart = -1;
        this.selectionEnd = -1;
    }

    public ParagraphItem(Spannable spannable0, boolean z, boolean z1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            z1 = false;
        }
        this(spannable0, z, z1);
    }

    @NotNull
    public final Spannable getContent() {
        return this.content;
    }

    public final boolean getDisableOnTextChanged() {
        return this.disableOnTextChanged;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public int getSelectionEnd() {
        return this.selectionEnd;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public int getSelectionStart() {
        return this.selectionStart;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    @NotNull
    public SpannableStringBuilder getText() {
        return this.text;
    }

    // 去混淆评级： 低(20)
    @Override  // com.kakao.keditor.KeditorItem
    @NotNull
    public String getType() {
        return this.isHeadingType ? "heading" : "paragraph";
    }

    public final boolean isHeadingType() {
        return this.isHeadingType;
    }

    // 去混淆评级： 低(20)
    public final boolean isParagraphHeadType() {
        return this.isHeadingType && this.getParagraphStyle().isHead();
    }

    @JvmStatic
    @NotNull
    public static final ParagraphItem newHeadingInstance(boolean z) {
        return ParagraphItem.Companion.newHeadingInstance(z);
    }

    @JvmStatic
    @NotNull
    public static final ParagraphItem newInstance(boolean z, boolean z1) {
        return ParagraphItem.Companion.newInstance(z, z1);
    }

    public final void setDisableOnTextChanged(boolean z) {
        this.disableOnTextChanged = z;
    }

    public final void setHeadingType(boolean z) {
        this.isHeadingType = z;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public void setSelectionEnd(int v) {
        this.selectionEnd = v;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public void setSelectionStart(int v) {
        this.selectionStart = v;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public void setText(@NotNull SpannableStringBuilder spannableStringBuilder0) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder0, "<set-?>");
        this.text = spannableStringBuilder0;
    }

    @Override
    @NotNull
    public String toString() {
        return "ParagraphItem(content=" + this.content + ", text=" + this.getText() + ", selectionStart=" + this.getSelectionStart() + ", selectionEnd=" + this.getSelectionEnd() + ")";
    }

    public final void updateText(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "text");
        if(charSequence0 instanceof SpannableStringBuilder) {
            this.setText(((SpannableStringBuilder)charSequence0));
        }
    }
}

