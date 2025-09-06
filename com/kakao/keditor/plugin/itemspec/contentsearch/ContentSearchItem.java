package com.kakao.keditor.plugin.itemspec.contentsearch;

import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.item.Aligned;
import com.kakao.keditor.plugin.itemspec.contentsearch.attrs.DataParser;
import com.kakao.keditor.plugin.itemspec.contentsearch.attrs.Kind;
import com.kakao.keditor.plugin.itemspec.contentsearch.entity.ContentItem;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "contentSearch")
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000BJ\t\u0010\u001A\u001A\u00020\u0004HÆ\u0003J\t\u0010\u001B\u001A\u00020\u0006HÆ\u0003J\u0015\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0003J3\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00062\u0014\b\u0002\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0001J\u0013\u0010\u001E\u001A\u00020\u001F2\b\u0010 \u001A\u0004\u0018\u00010\nHÖ\u0003J\t\u0010!\u001A\u00020\"HÖ\u0001J\t\u0010#\u001A\u00020\tHÖ\u0001R\u001A\u0010\u0005\u001A\u00020\u0006X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001B\u0010\u0010\u001A\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0012\u0010\u0013R\u001D\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/contentsearch/ContentSearchItem;", "Lcom/kakao/keditor/KeditorItem;", "Lcom/kakao/keditor/plugin/attrs/item/Aligned;", "kind", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "alignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "data", "", "", "", "(Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;Lcom/kakao/keditor/plugin/attrs/Alignment;Ljava/util/Map;)V", "getAlignment", "()Lcom/kakao/keditor/plugin/attrs/Alignment;", "setAlignment", "(Lcom/kakao/keditor/plugin/attrs/Alignment;)V", "contentItem", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/entity/ContentItem;", "getContentItem", "()Lcom/kakao/keditor/plugin/itemspec/contentsearch/entity/ContentItem;", "contentItem$delegate", "Lkotlin/Lazy;", "getData", "()Ljava/util/Map;", "getKind", "()Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ContentSearchItem extends KeditorItem implements Aligned {
    @NotNull
    private Alignment alignment;
    @NotNull
    private final Lazy contentItem$delegate;
    @NotNull
    private final Map data;
    @NotNull
    private final Kind kind;

    public ContentSearchItem(@NotNull Kind kind0, @NotNull Alignment alignment0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(kind0, "kind");
        Intrinsics.checkNotNullParameter(alignment0, "alignment");
        Intrinsics.checkNotNullParameter(map0, "data");
        super();
        this.kind = kind0;
        this.alignment = alignment0;
        this.data = map0;
        this.contentItem$delegate = c.lazy(new Function0() {
            {
                ContentSearchItem.this = contentSearchItem0;
                super(0);
            }

            @NotNull
            public final ContentItem invoke() {
                Kind kind0 = ContentSearchItem.this.getKind();
                Map map0 = ContentSearchItem.this.getData();
                return DataParser.INSTANCE.parseBy(kind0, map0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
    }

    @NotNull
    public final Kind component1() {
        return this.kind;
    }

    @NotNull
    public final Alignment component2() {
        return this.alignment;
    }

    @NotNull
    public final Map component3() {
        return this.data;
    }

    @NotNull
    public final ContentSearchItem copy(@NotNull Kind kind0, @NotNull Alignment alignment0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(kind0, "kind");
        Intrinsics.checkNotNullParameter(alignment0, "alignment");
        Intrinsics.checkNotNullParameter(map0, "data");
        return new ContentSearchItem(kind0, alignment0, map0);
    }

    public static ContentSearchItem copy$default(ContentSearchItem contentSearchItem0, Kind kind0, Alignment alignment0, Map map0, int v, Object object0) {
        if((v & 1) != 0) {
            kind0 = contentSearchItem0.kind;
        }
        if((v & 2) != 0) {
            alignment0 = contentSearchItem0.alignment;
        }
        if((v & 4) != 0) {
            map0 = contentSearchItem0.data;
        }
        return contentSearchItem0.copy(kind0, alignment0, map0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ContentSearchItem)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.kind, ((ContentSearchItem)object0).kind)) {
            return false;
        }
        return Intrinsics.areEqual(this.alignment, ((ContentSearchItem)object0).alignment) ? Intrinsics.areEqual(this.data, ((ContentSearchItem)object0).data) : false;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    @NotNull
    public Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final ContentItem getContentItem() {
        return (ContentItem)this.contentItem$delegate.getValue();
    }

    @NotNull
    public final Map getData() {
        return this.data;
    }

    @NotNull
    public final Kind getKind() {
        return this.kind;
    }

    @Override
    public int hashCode() {
        return this.data.hashCode() + (this.alignment.hashCode() + this.kind.hashCode() * 0x1F) * 0x1F;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    public void setAlignment(@NotNull Alignment alignment0) {
        Intrinsics.checkNotNullParameter(alignment0, "<set-?>");
        this.alignment = alignment0;
    }

    @Override
    @NotNull
    public String toString() {
        return "ContentSearchItem(kind=" + this.kind + ", alignment=" + this.alignment + ", data=" + this.data + ")";
    }
}

