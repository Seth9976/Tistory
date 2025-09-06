package com.kakao.keditor.plugin.itemspec.blockquote;

import android.graphics.Rect;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.R.dimen;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.plugin.attrs.text.FontStyle;
import com.kakao.keditor.plugin.itemspec.EnumList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00182\u00020\u0001:\u0004\u0018\u0019\u001A\u001BB1\b\u0004\u0012\b\b\u0001\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0003\u0012\u0006\u0010\t\u001A\u00020\u0003¢\u0006\u0002\u0010\nJ\u0018\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0016J\u0006\u0010\u0017\u001A\u00020\u0016R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u000E\u0010\u0006\u001A\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0003\u001C\u001D\u001E¨\u0006\u001F"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteType;", "", "backgroundDrawable", "", "defaultFontStyle", "Lcom/kakao/keditor/plugin/attrs/text/FontStyle;", "padding", "Landroid/graphics/Rect;", "quoteGravity", "quoteVisible", "(ILcom/kakao/keditor/plugin/attrs/text/FontStyle;Landroid/graphics/Rect;II)V", "getDefaultFontStyle", "()Lcom/kakao/keditor/plugin/attrs/text/FontStyle;", "applyQuoteType", "", "editText", "Landroid/widget/EditText;", "quoteIcon", "Landroid/view/View;", "equals", "", "style", "", "name", "Companion", "Style1", "Style2", "Style3", "Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteType$Style1;", "Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteType$Style2;", "Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteType$Style3;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class BlockQuoteType {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000E\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000E\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteType$Companion;", "Lcom/kakao/keditor/plugin/itemspec/EnumList;", "()V", "typeSet", "", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion implements EnumList {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        @Override  // com.kakao.keditor.plugin.itemspec.EnumList
        @NotNull
        public Set typeSet() {
            return f0.setOf(new String[]{"blockquotetype$style1", Style2.INSTANCE.name(), Style3.INSTANCE.name()});
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteType$Style1;", "Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteType;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Style1 extends BlockQuoteType {
        @NotNull
        public static final Style1 INSTANCE;

        static {
            Style1.INSTANCE = new Style1();
        }

        private Style1() {
            Rect rect0 = new Rect(0, 0, 0, 0);
            super(0, FontStyle.BON_MYUNGJO, rect0, 17, 0, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteType$Style2;", "Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteType;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Style2 extends BlockQuoteType {
        @NotNull
        public static final Style2 INSTANCE;

        static {
            Style2.INSTANCE = new Style2();
        }

        private Style2() {
            int v = drawable.ke_ic_quote_img_2;
            Rect rect0 = new Rect(Keditor.INSTANCE.getContext().getResources().getDimensionPixelOffset(dimen.ke_block_quote_type_style2_padding_left), Keditor.INSTANCE.getContext().getResources().getDimensionPixelOffset(dimen.ke_block_quote_type_style2_padding_top), Keditor.INSTANCE.getContext().getResources().getDimensionPixelOffset(dimen.ke_block_quote_type_style2_padding_right), Keditor.INSTANCE.getContext().getResources().getDimensionPixelOffset(dimen.ke_block_quote_type_style2_padding_bottom));
            super(v, FontStyle.BON_GOTHIC_L, rect0, 0, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteType$Style3;", "Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteType;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Style3 extends BlockQuoteType {
        @NotNull
        public static final Style3 INSTANCE;

        static {
            Style3.INSTANCE = new Style3();
        }

        private Style3() {
            int v = drawable.ke_ic_quote_img_3;
            Rect rect0 = new Rect(Keditor.INSTANCE.getContext().getResources().getDimensionPixelOffset(dimen.ke_block_quote_type_style3_padding_left), Keditor.INSTANCE.getContext().getResources().getDimensionPixelOffset(dimen.ke_block_quote_type_style3_padding_top), Keditor.INSTANCE.getContext().getResources().getDimensionPixelOffset(dimen.ke_block_quote_type_style3_padding_right), Keditor.INSTANCE.getContext().getResources().getDimensionPixelOffset(dimen.ke_block_quote_type_style3_padding_bottom));
            super(v, FontStyle.BON_GOTHIC_L, rect0, 0, 8, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    private final int backgroundDrawable;
    @NotNull
    private final FontStyle defaultFontStyle;
    @NotNull
    private final Rect padding;
    private final int quoteGravity;
    private final int quoteVisible;

    static {
        BlockQuoteType.Companion = new Companion(null);
    }

    private BlockQuoteType(@DrawableRes int v, FontStyle fontStyle0, Rect rect0, int v1, int v2) {
        this.backgroundDrawable = v;
        this.defaultFontStyle = fontStyle0;
        this.padding = rect0;
        this.quoteGravity = v1;
        this.quoteVisible = v2;
    }

    public BlockQuoteType(int v, FontStyle fontStyle0, Rect rect0, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, fontStyle0, rect0, v1, v2);
    }

    public final void applyQuoteType(@NotNull EditText editText0, @Nullable View view0) {
        Intrinsics.checkNotNullParameter(editText0, "editText");
        editText0.setBackgroundResource(this.backgroundDrawable);
        editText0.setPadding(this.padding.left, this.padding.top, this.padding.right, this.padding.bottom);
        editText0.setGravity(this.quoteGravity);
        if(view0 != null) {
            view0.setVisibility(this.quoteVisible);
        }
    }

    public final boolean equals(@Nullable String s) {
        return Intrinsics.areEqual(this.name(), s);
    }

    @NotNull
    public final FontStyle getDefaultFontStyle() {
        return this.defaultFontStyle;
    }

    @NotNull
    public final String name() {
        String s = this.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(s, "getSimpleName(...)");
        String s1 = s.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(s1, "toLowerCase(...)");
        return s1;
    }
}

