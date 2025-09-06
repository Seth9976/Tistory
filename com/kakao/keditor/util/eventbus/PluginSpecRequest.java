package com.kakao.keditor.util.eventbus;

import android.net.Uri;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItem;
import com.kakao.keditor.request.KeditorRequest;
import com.kakao.keditor.toolbar.category.OverlayCategory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001:\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "Lcom/kakao/keditor/request/KeditorRequest;", "requestType", "", "focusedPosition", "", "(Ljava/lang/String;I)V", "getFocusedPosition", "()I", "getRequestType", "()Ljava/lang/String;", "ApplyOverlayCategory", "ConvertContentSearchToVideo", "ConvertOpenGraphToVideo", "CreateBlockQuoteItem", "CreateItem", "CreateOpenGraphItem", "CreateTextListItem", "EditKeditorItem", "RunIconClick", "UpdateFocusedImageUri", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class PluginSpecRequest implements KeditorRequest {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000F\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000B\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/kakao/keditor/util/eventbus/PluginSpecRequest$ApplyOverlayCategory;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "overlayCategory", "Lcom/kakao/keditor/toolbar/category/OverlayCategory;", "(Lcom/kakao/keditor/toolbar/category/OverlayCategory;)V", "getOverlayCategory", "()Lcom/kakao/keditor/toolbar/category/OverlayCategory;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ApplyOverlayCategory extends PluginSpecRequest {
        @Nullable
        private final OverlayCategory overlayCategory;

        public ApplyOverlayCategory(@Nullable OverlayCategory overlayCategory0) {
            super("", 0, 2, null);
            this.overlayCategory = overlayCategory0;
        }

        @Nullable
        public final OverlayCategory component1() {
            return this.overlayCategory;
        }

        @NotNull
        public final ApplyOverlayCategory copy(@Nullable OverlayCategory overlayCategory0) {
            return new ApplyOverlayCategory(overlayCategory0);
        }

        public static ApplyOverlayCategory copy$default(ApplyOverlayCategory pluginSpecRequest$ApplyOverlayCategory0, OverlayCategory overlayCategory0, int v, Object object0) {
            if((v & 1) != 0) {
                overlayCategory0 = pluginSpecRequest$ApplyOverlayCategory0.overlayCategory;
            }
            return pluginSpecRequest$ApplyOverlayCategory0.copy(overlayCategory0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ApplyOverlayCategory ? Intrinsics.areEqual(this.overlayCategory, ((ApplyOverlayCategory)object0).overlayCategory) : false;
        }

        @Nullable
        public final OverlayCategory getOverlayCategory() {
            return this.overlayCategory;
        }

        @Override
        public int hashCode() {
            return this.overlayCategory == null ? 0 : this.overlayCategory.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ApplyOverlayCategory(overlayCategory=" + this.overlayCategory + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\u0015\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u0014\b\u0002\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0010\u001A\u00020\u00112\b\u0010\u0012\u001A\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0006HÖ\u0001R\u001D\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/kakao/keditor/util/eventbus/PluginSpecRequest$ConvertContentSearchToVideo;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "position", "", "attribute", "", "", "", "(ILjava/util/Map;)V", "getAttribute", "()Ljava/util/Map;", "getPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ConvertContentSearchToVideo extends PluginSpecRequest {
        @NotNull
        private final Map attribute;
        private final int position;

        public ConvertContentSearchToVideo(int v, @NotNull Map map0) {
            Intrinsics.checkNotNullParameter(map0, "attribute");
            super("video", v);
            this.position = v;
            this.attribute = map0;
        }

        public ConvertContentSearchToVideo(int v, Map map0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = -1;
            }
            this(v, map0);
        }

        public final int component1() {
            return this.position;
        }

        @NotNull
        public final Map component2() {
            return this.attribute;
        }

        @NotNull
        public final ConvertContentSearchToVideo copy(int v, @NotNull Map map0) {
            Intrinsics.checkNotNullParameter(map0, "attribute");
            return new ConvertContentSearchToVideo(v, map0);
        }

        public static ConvertContentSearchToVideo copy$default(ConvertContentSearchToVideo pluginSpecRequest$ConvertContentSearchToVideo0, int v, Map map0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = pluginSpecRequest$ConvertContentSearchToVideo0.position;
            }
            if((v1 & 2) != 0) {
                map0 = pluginSpecRequest$ConvertContentSearchToVideo0.attribute;
            }
            return pluginSpecRequest$ConvertContentSearchToVideo0.copy(v, map0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ConvertContentSearchToVideo)) {
                return false;
            }
            return this.position == ((ConvertContentSearchToVideo)object0).position ? Intrinsics.areEqual(this.attribute, ((ConvertContentSearchToVideo)object0).attribute) : false;
        }

        @NotNull
        public final Map getAttribute() {
            return this.attribute;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override
        public int hashCode() {
            return this.attribute.hashCode() + this.position * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "ConvertContentSearchToVideo(position=" + this.position + ", attribute=" + this.attribute + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/kakao/keditor/util/eventbus/PluginSpecRequest$ConvertOpenGraphToVideo;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "position", "", "item", "Lcom/kakao/keditor/KeditorItem;", "(ILcom/kakao/keditor/KeditorItem;)V", "getItem", "()Lcom/kakao/keditor/KeditorItem;", "getPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ConvertOpenGraphToVideo extends PluginSpecRequest {
        @NotNull
        private final KeditorItem item;
        private final int position;

        public ConvertOpenGraphToVideo(int v, @NotNull KeditorItem keditorItem0) {
            Intrinsics.checkNotNullParameter(keditorItem0, "item");
            super("video", v);
            this.position = v;
            this.item = keditorItem0;
        }

        public ConvertOpenGraphToVideo(int v, KeditorItem keditorItem0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = -1;
            }
            this(v, keditorItem0);
        }

        public final int component1() {
            return this.position;
        }

        @NotNull
        public final KeditorItem component2() {
            return this.item;
        }

        @NotNull
        public final ConvertOpenGraphToVideo copy(int v, @NotNull KeditorItem keditorItem0) {
            Intrinsics.checkNotNullParameter(keditorItem0, "item");
            return new ConvertOpenGraphToVideo(v, keditorItem0);
        }

        public static ConvertOpenGraphToVideo copy$default(ConvertOpenGraphToVideo pluginSpecRequest$ConvertOpenGraphToVideo0, int v, KeditorItem keditorItem0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = pluginSpecRequest$ConvertOpenGraphToVideo0.position;
            }
            if((v1 & 2) != 0) {
                keditorItem0 = pluginSpecRequest$ConvertOpenGraphToVideo0.item;
            }
            return pluginSpecRequest$ConvertOpenGraphToVideo0.copy(v, keditorItem0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ConvertOpenGraphToVideo)) {
                return false;
            }
            return this.position == ((ConvertOpenGraphToVideo)object0).position ? Intrinsics.areEqual(this.item, ((ConvertOpenGraphToVideo)object0).item) : false;
        }

        @NotNull
        public final KeditorItem getItem() {
            return this.item;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override
        public int hashCode() {
            return this.item.hashCode() + this.position * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "ConvertOpenGraphToVideo(position=" + this.position + ", item=" + this.item + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u001F\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/kakao/keditor/util/eventbus/PluginSpecRequest$CreateBlockQuoteItem;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "position", "", "item", "Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;", "(ILcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;)V", "getItem", "()Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;", "getPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class CreateBlockQuoteItem extends PluginSpecRequest {
        @Nullable
        private final ParagraphItem item;
        private final int position;

        public CreateBlockQuoteItem() {
            this(0, null, 3, null);
        }

        public CreateBlockQuoteItem(int v, @Nullable ParagraphItem paragraphItem0) {
            super("blockquote", v);
            this.position = v;
            this.item = paragraphItem0;
        }

        public CreateBlockQuoteItem(int v, ParagraphItem paragraphItem0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = -1;
            }
            if((v1 & 2) != 0) {
                paragraphItem0 = null;
            }
            this(v, paragraphItem0);
        }

        public final int component1() {
            return this.position;
        }

        @Nullable
        public final ParagraphItem component2() {
            return this.item;
        }

        @NotNull
        public final CreateBlockQuoteItem copy(int v, @Nullable ParagraphItem paragraphItem0) {
            return new CreateBlockQuoteItem(v, paragraphItem0);
        }

        public static CreateBlockQuoteItem copy$default(CreateBlockQuoteItem pluginSpecRequest$CreateBlockQuoteItem0, int v, ParagraphItem paragraphItem0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = pluginSpecRequest$CreateBlockQuoteItem0.position;
            }
            if((v1 & 2) != 0) {
                paragraphItem0 = pluginSpecRequest$CreateBlockQuoteItem0.item;
            }
            return pluginSpecRequest$CreateBlockQuoteItem0.copy(v, paragraphItem0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CreateBlockQuoteItem)) {
                return false;
            }
            return this.position == ((CreateBlockQuoteItem)object0).position ? Intrinsics.areEqual(this.item, ((CreateBlockQuoteItem)object0).item) : false;
        }

        @Nullable
        public final ParagraphItem getItem() {
            return this.item;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override
        public int hashCode() {
            return this.item == null ? this.position * 0x1F : this.position * 0x1F + this.item.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "CreateBlockQuoteItem(position=" + this.position + ", item=" + this.item + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/kakao/keditor/util/eventbus/PluginSpecRequest$CreateItem;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "type", "", "position", "", "(Ljava/lang/String;I)V", "getPosition", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class CreateItem extends PluginSpecRequest {
        private final int position;
        @NotNull
        private final String type;

        public CreateItem() {
            this(null, 0, 3, null);
        }

        public CreateItem(@NotNull String s, int v) {
            Intrinsics.checkNotNullParameter(s, "type");
            super(s, v);
            this.type = s;
            this.position = v;
        }

        public CreateItem(String s, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                s = "";
            }
            if((v1 & 2) != 0) {
                v = -1;
            }
            this(s, v);
        }

        @NotNull
        public final String component1() {
            return this.type;
        }

        public final int component2() {
            return this.position;
        }

        @NotNull
        public final CreateItem copy(@NotNull String s, int v) {
            Intrinsics.checkNotNullParameter(s, "type");
            return new CreateItem(s, v);
        }

        public static CreateItem copy$default(CreateItem pluginSpecRequest$CreateItem0, String s, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = pluginSpecRequest$CreateItem0.type;
            }
            if((v1 & 2) != 0) {
                v = pluginSpecRequest$CreateItem0.position;
            }
            return pluginSpecRequest$CreateItem0.copy(s, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CreateItem)) {
                return false;
            }
            return Intrinsics.areEqual(this.type, ((CreateItem)object0).type) ? this.position == ((CreateItem)object0).position : false;
        }

        public final int getPosition() {
            return this.position;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @Override
        public int hashCode() {
            return this.position + this.type.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "CreateItem(type=" + this.type + ", position=" + this.position + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u0019"}, d2 = {"Lcom/kakao/keditor/util/eventbus/PluginSpecRequest$CreateOpenGraphItem;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "position", "", "linkUrl", "", "next", "Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;", "(ILjava/lang/String;Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;)V", "getLinkUrl", "()Ljava/lang/String;", "getNext", "()Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;", "getPosition", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class CreateOpenGraphItem extends PluginSpecRequest {
        @NotNull
        private final String linkUrl;
        @Nullable
        private final ParagraphItem next;
        private final int position;

        public CreateOpenGraphItem(int v, @NotNull String s, @Nullable ParagraphItem paragraphItem0) {
            Intrinsics.checkNotNullParameter(s, "linkUrl");
            super("opengraph", v);
            this.position = v;
            this.linkUrl = s;
            this.next = paragraphItem0;
        }

        public CreateOpenGraphItem(int v, String s, ParagraphItem paragraphItem0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = -1;
            }
            if((v1 & 4) != 0) {
                paragraphItem0 = null;
            }
            this(v, s, paragraphItem0);
        }

        public final int component1() {
            return this.position;
        }

        @NotNull
        public final String component2() {
            return this.linkUrl;
        }

        @Nullable
        public final ParagraphItem component3() {
            return this.next;
        }

        @NotNull
        public final CreateOpenGraphItem copy(int v, @NotNull String s, @Nullable ParagraphItem paragraphItem0) {
            Intrinsics.checkNotNullParameter(s, "linkUrl");
            return new CreateOpenGraphItem(v, s, paragraphItem0);
        }

        public static CreateOpenGraphItem copy$default(CreateOpenGraphItem pluginSpecRequest$CreateOpenGraphItem0, int v, String s, ParagraphItem paragraphItem0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = pluginSpecRequest$CreateOpenGraphItem0.position;
            }
            if((v1 & 2) != 0) {
                s = pluginSpecRequest$CreateOpenGraphItem0.linkUrl;
            }
            if((v1 & 4) != 0) {
                paragraphItem0 = pluginSpecRequest$CreateOpenGraphItem0.next;
            }
            return pluginSpecRequest$CreateOpenGraphItem0.copy(v, s, paragraphItem0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CreateOpenGraphItem)) {
                return false;
            }
            if(this.position != ((CreateOpenGraphItem)object0).position) {
                return false;
            }
            return Intrinsics.areEqual(this.linkUrl, ((CreateOpenGraphItem)object0).linkUrl) ? Intrinsics.areEqual(this.next, ((CreateOpenGraphItem)object0).next) : false;
        }

        @NotNull
        public final String getLinkUrl() {
            return this.linkUrl;
        }

        @Nullable
        public final ParagraphItem getNext() {
            return this.next;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override
        public int hashCode() {
            int v = q.c(this.position * 0x1F, 0x1F, this.linkUrl);
            return this.next == null ? v : v + this.next.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "CreateOpenGraphItem(position=" + this.position + ", linkUrl=" + this.linkUrl + ", next=" + this.next + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u001F\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/kakao/keditor/util/eventbus/PluginSpecRequest$CreateTextListItem;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "position", "", "item", "Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;", "(ILcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;)V", "getItem", "()Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;", "getPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class CreateTextListItem extends PluginSpecRequest {
        @Nullable
        private final ParagraphItem item;
        private final int position;

        public CreateTextListItem() {
            this(0, null, 3, null);
        }

        public CreateTextListItem(int v, @Nullable ParagraphItem paragraphItem0) {
            super("list", v);
            this.position = v;
            this.item = paragraphItem0;
        }

        public CreateTextListItem(int v, ParagraphItem paragraphItem0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = -1;
            }
            if((v1 & 2) != 0) {
                paragraphItem0 = null;
            }
            this(v, paragraphItem0);
        }

        public final int component1() {
            return this.position;
        }

        @Nullable
        public final ParagraphItem component2() {
            return this.item;
        }

        @NotNull
        public final CreateTextListItem copy(int v, @Nullable ParagraphItem paragraphItem0) {
            return new CreateTextListItem(v, paragraphItem0);
        }

        public static CreateTextListItem copy$default(CreateTextListItem pluginSpecRequest$CreateTextListItem0, int v, ParagraphItem paragraphItem0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = pluginSpecRequest$CreateTextListItem0.position;
            }
            if((v1 & 2) != 0) {
                paragraphItem0 = pluginSpecRequest$CreateTextListItem0.item;
            }
            return pluginSpecRequest$CreateTextListItem0.copy(v, paragraphItem0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CreateTextListItem)) {
                return false;
            }
            return this.position == ((CreateTextListItem)object0).position ? Intrinsics.areEqual(this.item, ((CreateTextListItem)object0).item) : false;
        }

        @Nullable
        public final ParagraphItem getItem() {
            return this.item;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override
        public int hashCode() {
            return this.item == null ? this.position * 0x1F : this.position * 0x1F + this.item.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "CreateTextListItem(position=" + this.position + ", item=" + this.item + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u0019"}, d2 = {"Lcom/kakao/keditor/util/eventbus/PluginSpecRequest$EditKeditorItem;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "type", "", "position", "", "item", "Lcom/kakao/keditor/KeditorItem;", "(Ljava/lang/String;ILcom/kakao/keditor/KeditorItem;)V", "getItem", "()Lcom/kakao/keditor/KeditorItem;", "getPosition", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class EditKeditorItem extends PluginSpecRequest {
        @Nullable
        private final KeditorItem item;
        private final int position;
        @NotNull
        private final String type;

        public EditKeditorItem() {
            this(null, 0, null, 7, null);
        }

        public EditKeditorItem(@NotNull String s, int v, @Nullable KeditorItem keditorItem0) {
            Intrinsics.checkNotNullParameter(s, "type");
            super(s, v);
            this.type = s;
            this.position = v;
            this.item = keditorItem0;
        }

        public EditKeditorItem(String s, int v, KeditorItem keditorItem0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                s = "";
            }
            if((v1 & 2) != 0) {
                v = -1;
            }
            if((v1 & 4) != 0) {
                keditorItem0 = null;
            }
            this(s, v, keditorItem0);
        }

        @NotNull
        public final String component1() {
            return this.type;
        }

        public final int component2() {
            return this.position;
        }

        @Nullable
        public final KeditorItem component3() {
            return this.item;
        }

        @NotNull
        public final EditKeditorItem copy(@NotNull String s, int v, @Nullable KeditorItem keditorItem0) {
            Intrinsics.checkNotNullParameter(s, "type");
            return new EditKeditorItem(s, v, keditorItem0);
        }

        public static EditKeditorItem copy$default(EditKeditorItem pluginSpecRequest$EditKeditorItem0, String s, int v, KeditorItem keditorItem0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = pluginSpecRequest$EditKeditorItem0.type;
            }
            if((v1 & 2) != 0) {
                v = pluginSpecRequest$EditKeditorItem0.position;
            }
            if((v1 & 4) != 0) {
                keditorItem0 = pluginSpecRequest$EditKeditorItem0.item;
            }
            return pluginSpecRequest$EditKeditorItem0.copy(s, v, keditorItem0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof EditKeditorItem)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.type, ((EditKeditorItem)object0).type)) {
                return false;
            }
            return this.position == ((EditKeditorItem)object0).position ? Intrinsics.areEqual(this.item, ((EditKeditorItem)object0).item) : false;
        }

        @Nullable
        public final KeditorItem getItem() {
            return this.item;
        }

        public final int getPosition() {
            return this.position;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @Override
        public int hashCode() {
            int v = a.c(this.position, this.type.hashCode() * 0x1F, 0x1F);
            return this.item == null ? v : v + this.item.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "EditKeditorItem(type=" + this.type + ", position=" + this.position + ", item=" + this.item + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/kakao/keditor/util/eventbus/PluginSpecRequest$RunIconClick;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "type", "", "position", "", "(Ljava/lang/String;I)V", "getPosition", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RunIconClick extends PluginSpecRequest {
        private final int position;
        @NotNull
        private final String type;

        public RunIconClick() {
            this(null, 0, 3, null);
        }

        public RunIconClick(@NotNull String s, int v) {
            Intrinsics.checkNotNullParameter(s, "type");
            super(s, v);
            this.type = s;
            this.position = v;
        }

        public RunIconClick(String s, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                s = "";
            }
            if((v1 & 2) != 0) {
                v = -1;
            }
            this(s, v);
        }

        @NotNull
        public final String component1() {
            return this.type;
        }

        public final int component2() {
            return this.position;
        }

        @NotNull
        public final RunIconClick copy(@NotNull String s, int v) {
            Intrinsics.checkNotNullParameter(s, "type");
            return new RunIconClick(s, v);
        }

        public static RunIconClick copy$default(RunIconClick pluginSpecRequest$RunIconClick0, String s, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = pluginSpecRequest$RunIconClick0.type;
            }
            if((v1 & 2) != 0) {
                v = pluginSpecRequest$RunIconClick0.position;
            }
            return pluginSpecRequest$RunIconClick0.copy(s, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RunIconClick)) {
                return false;
            }
            return Intrinsics.areEqual(this.type, ((RunIconClick)object0).type) ? this.position == ((RunIconClick)object0).position : false;
        }

        public final int getPosition() {
            return this.position;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @Override
        public int hashCode() {
            return this.position + this.type.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "RunIconClick(type=" + this.type + ", position=" + this.position + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/kakao/keditor/util/eventbus/PluginSpecRequest$UpdateFocusedImageUri;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateFocusedImageUri extends PluginSpecRequest {
        @NotNull
        private final Uri uri;

        public UpdateFocusedImageUri(@NotNull Uri uri0) {
            Intrinsics.checkNotNullParameter(uri0, "uri");
            super("image", 0, 2, null);
            this.uri = uri0;
        }

        @NotNull
        public final Uri component1() {
            return this.uri;
        }

        @NotNull
        public final UpdateFocusedImageUri copy(@NotNull Uri uri0) {
            Intrinsics.checkNotNullParameter(uri0, "uri");
            return new UpdateFocusedImageUri(uri0);
        }

        public static UpdateFocusedImageUri copy$default(UpdateFocusedImageUri pluginSpecRequest$UpdateFocusedImageUri0, Uri uri0, int v, Object object0) {
            if((v & 1) != 0) {
                uri0 = pluginSpecRequest$UpdateFocusedImageUri0.uri;
            }
            return pluginSpecRequest$UpdateFocusedImageUri0.copy(uri0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateFocusedImageUri ? Intrinsics.areEqual(this.uri, ((UpdateFocusedImageUri)object0).uri) : false;
        }

        @NotNull
        public final Uri getUri() {
            return this.uri;
        }

        @Override
        public int hashCode() {
            return this.uri.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateFocusedImageUri(uri=" + this.uri + ")";
        }
    }

    private final int focusedPosition;
    @NotNull
    private final String requestType;

    public PluginSpecRequest(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "requestType");
        super();
        this.requestType = s;
        this.focusedPosition = v;
    }

    public PluginSpecRequest(String s, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            v = -1;
        }
        this(s, v);
    }

    public final int getFocusedPosition() {
        return this.focusedPosition;
    }

    @NotNull
    public final String getRequestType() {
        return this.requestType;
    }
}

