package com.kakao.keditor.plugin.itemspec.emoticon;

import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.item.Aligned;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@KeditorItemType(type = "emoticon")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\tR$\u0010\u0007\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b@VX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER\u0011\u0010\u0005\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0011\u001A\u00020\u0012¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0006\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/emoticon/EmoticonItem;", "Lcom/kakao/keditor/KeditorItem;", "Lcom/kakao/keditor/plugin/attrs/item/Aligned;", "packId", "", "id", "src", "alignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/keditor/plugin/attrs/Alignment;)V", "value", "getAlignment", "()Lcom/kakao/keditor/plugin/attrs/Alignment;", "setAlignment", "(Lcom/kakao/keditor/plugin/attrs/Alignment;)V", "getId", "()Ljava/lang/String;", "isAnimation", "", "()Z", "getPackId", "getSrc", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EmoticonItem extends KeditorItem implements Aligned {
    @NotNull
    private Alignment alignment;
    @NotNull
    private final String id;
    private final boolean isAnimation;
    @NotNull
    private final String packId;
    @NotNull
    private final String src;

    public EmoticonItem(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull Alignment alignment0) {
        Intrinsics.checkNotNullParameter(s, "packId");
        Intrinsics.checkNotNullParameter(s1, "id");
        Intrinsics.checkNotNullParameter(s2, "src");
        Intrinsics.checkNotNullParameter(alignment0, "alignment");
        super();
        this.packId = s;
        this.id = s1;
        this.src = s2;
        this.alignment = alignment0;
        this.isAnimation = Intrinsics.areEqual(s, "friends1") || Intrinsics.areEqual(s, "niniz");
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    @NotNull
    public Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getPackId() {
        return this.packId;
    }

    @NotNull
    public final String getSrc() {
        return this.src;
    }

    public final boolean isAnimation() {
        return this.isAnimation;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    public void setAlignment(@NotNull Alignment alignment0) {
        Intrinsics.checkNotNullParameter(alignment0, "value");
        this.removeBypass("align");
        this.alignment = alignment0;
    }
}

