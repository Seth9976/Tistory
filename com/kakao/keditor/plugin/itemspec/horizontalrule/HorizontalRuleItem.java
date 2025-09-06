package com.kakao.keditor.plugin.itemspec.horizontalrule;

import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment.Center;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.item.Aligned;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@KeditorItemType(type = "horizontalRule")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J\u000E\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0014J\u0006\u0010\u0015\u001A\u00020\u0014R$\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u0005@VX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0004\u001A\u00020\u000B@FX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/horizontalrule/HorizontalRuleItem;", "Lcom/kakao/keditor/KeditorItem;", "Lcom/kakao/keditor/plugin/attrs/item/Aligned;", "()V", "value", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "alignment", "getAlignment", "()Lcom/kakao/keditor/plugin/attrs/Alignment;", "setAlignment", "(Lcom/kakao/keditor/plugin/attrs/Alignment;)V", "", "style", "getStyle", "()Ljava/lang/String;", "setStyle", "(Ljava/lang/String;)V", "equals", "", "styleNum", "", "imageSrc", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class HorizontalRuleItem extends KeditorItem implements Aligned {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\b\b\u0001\u0010\u0005\u001A\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/horizontalrule/HorizontalRuleItem$Companion;", "", "()V", "newInstance", "Lcom/kakao/keditor/plugin/itemspec/horizontalrule/HorizontalRuleItem;", "styleNum", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHorizontalRuleItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HorizontalRuleItem.kt\ncom/kakao/keditor/plugin/itemspec/horizontalrule/HorizontalRuleItem$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final HorizontalRuleItem newInstance(@HorizontalRuleStyle int v) {
            HorizontalRuleItem horizontalRuleItem0 = new HorizontalRuleItem();
            horizontalRuleItem0.setStyle("style" + v);
            return horizontalRuleItem0;
        }
    }

    @NotNull
    public static final Companion Companion;
    @NotNull
    private Alignment alignment;
    @NotNull
    private String style;

    static {
        HorizontalRuleItem.Companion = new Companion(null);
    }

    public HorizontalRuleItem() {
        this.style = "style1";
        this.alignment = Center.INSTANCE;
    }

    public final boolean equals(int v) {
        return Intrinsics.areEqual(("style" + v), this.style);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    @NotNull
    public Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final String getStyle() {
        return this.style;
    }

    public final int imageSrc() {
        return Keditor.INSTANCE.getContext().getResources().getIdentifier("ke_item_horizontal_rule_" + this.style, "drawable", "net.daum.android.tistoryapp");
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    public void setAlignment(@NotNull Alignment alignment0) {
        Intrinsics.checkNotNullParameter(alignment0, "value");
        this.removeBypass("align");
        this.alignment = alignment0;
    }

    public final void setStyle(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.removeBypass("style");
        this.style = s;
    }
}

