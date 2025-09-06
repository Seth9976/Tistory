package com.kakao.keditor.plugin.pluginspec.image;

import androidx.room.a;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.media.MediaItem;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Ready;
import com.kakao.keditor.plugin.attrs.LoadingStatus;
import com.kakao.keditor.plugin.attrs.Style.Center;
import com.kakao.keditor.plugin.attrs.Style;
import com.kakao.keditor.plugin.attrs.item.ImageUploadable;
import com.kakao.keditor.plugin.attrs.item.Linkable;
import com.kakao.keditor.plugin.attrs.item.Location;
import com.kakao.keditor.plugin.attrs.item.MobileStyle.Companion;
import com.kakao.keditor.plugin.attrs.item.MobileStyle;
import com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider;
import com.kakao.keditor.plugin.attrs.item.Styled.DefaultImpls;
import com.kakao.keditor.plugin.attrs.item.Styled;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "image")
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00A2\u0006\u0002\u0010\u0006J\b\u0010S\u001A\u00020\u0018H\u0016J\u000E\u0010T\u001A\b\u0012\u0004\u0012\u00020\b0UH\u0016J\n\u0010V\u001A\u0004\u0018\u00010\bH\u0016J\u0010\u0010W\u001A\u00020\u00182\u0006\u0010X\u001A\u00020\bH\u0016J\u0006\u0010Y\u001A\u00020\u0018J\u0010\u0010Z\u001A\u00020[2\u0006\u0010\\\u001A\u00020\bH\u0016J\b\u0010]\u001A\u00020\bH\u0016J\u0010\u0010^\u001A\u00020[2\u0006\u0010D\u001A\u00020\bH\u0016R\u001C\u0010\u0007\u001A\u0004\u0018\u00010\bX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u001C\u0010\r\u001A\u0004\u0018\u00010\bX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\n\"\u0004\b\u000F\u0010\fR\u001E\u0010\u0010\u001A\u0004\u0018\u00010\u0011X\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0016\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001E\u0010\u0017\u001A\u0004\u0018\u00010\u0018X\u0086\u000E\u00A2\u0006\u0010\n\u0002\u0010\u001C\u001A\u0004\b\u0017\u0010\u0019\"\u0004\b\u001A\u0010\u001BR\u001A\u0010\u001D\u001A\u00020\u0018X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R\u001C\u0010!\u001A\u0004\u0018\u00010\bX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\"\u0010\n\"\u0004\b#\u0010\fR\u001A\u0010$\u001A\u00020%X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001A\u0010*\u001A\u00020+X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001C\u00100\u001A\u0004\u0018\u00010\bX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b1\u0010\n\"\u0004\b2\u0010\fR$\u00105\u001A\u0002042\u0006\u00103\u001A\u000204@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b6\u00107\"\u0004\b8\u00109R\u001A\u0010:\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001A\u0010?\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b@\u0010<\"\u0004\bA\u0010>R\u0014\u0010B\u001A\u00020\b8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bC\u0010\nR$\u0010D\u001A\u00020\b2\u0006\u00103\u001A\u00020\b@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bE\u0010\n\"\u0004\bF\u0010\fR$\u0010H\u001A\u00020G2\u0006\u00103\u001A\u00020G@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001C\u0010M\u001A\u0004\u0018\u00010\bX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bN\u0010\n\"\u0004\bO\u0010\fR\u001E\u0010P\u001A\u0004\u0018\u00010\u0011X\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0016\u001A\u0004\bQ\u0010\u0013\"\u0004\bR\u0010\u0015\u00A8\u0006_"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/image/ImageItem;", "Lcom/kakao/keditor/media/MediaItem;", "Lcom/kakao/keditor/plugin/attrs/item/ImageUploadable;", "Lcom/kakao/keditor/plugin/attrs/item/Styled;", "Lcom/kakao/keditor/plugin/attrs/item/Linkable;", "Lcom/kakao/keditor/plugin/attrs/item/RepresentativeImageProvider;", "()V", "alt", "", "getAlt", "()Ljava/lang/String;", "setAlt", "(Ljava/lang/String;)V", "caption", "getCaption", "setCaption", "height", "", "getHeight", "()Ljava/lang/Integer;", "setHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isLinkNewWindow", "", "()Ljava/lang/Boolean;", "setLinkNewWindow", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isRepresent", "()Z", "setRepresent", "(Z)V", "link", "getLink", "setLink", "loadingStatus", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "getLoadingStatus", "()Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "setLoadingStatus", "(Lcom/kakao/keditor/plugin/attrs/LoadingStatus;)V", "location", "Lcom/kakao/keditor/plugin/attrs/item/Location;", "getLocation", "()Lcom/kakao/keditor/plugin/attrs/item/Location;", "setLocation", "(Lcom/kakao/keditor/plugin/attrs/item/Location;)V", "mimeType", "getMimeType", "setMimeType", "value", "Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;", "mobileStyle", "getMobileStyle", "()Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;", "setMobileStyle", "(Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;)V", "originHeight", "getOriginHeight", "()I", "setOriginHeight", "(I)V", "originWidth", "getOriginWidth", "setOriginWidth", "path", "getPath", "src", "getSrc", "setSrc", "Lcom/kakao/keditor/plugin/attrs/Style;", "style", "getStyle", "()Lcom/kakao/keditor/plugin/attrs/Style;", "setStyle", "(Lcom/kakao/keditor/plugin/attrs/Style;)V", "title", "getTitle", "setTitle", "width", "getWidth", "setWidth", "containsRepresentativeImage", "getImageSrcList", "", "getRepresentativeImage", "hasImage", "representativeImageSrc", "isGif", "setRepresentativeImage", "", "representativeImage", "toString", "uploadSucceed", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImageItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageItem.kt\ncom/kakao/keditor/plugin/pluginspec/image/ImageItem\n+ 2 Keditor.kt\ncom/kakao/keditor/Keditor\n*L\n1#1,68:1\n136#2,12:69\n*S KotlinDebug\n*F\n+ 1 ImageItem.kt\ncom/kakao/keditor/plugin/pluginspec/image/ImageItem\n*L\n29#1:69,12\n*E\n"})
public final class ImageItem extends MediaItem implements ImageUploadable, Linkable, RepresentativeImageProvider, Styled {
    @Nullable
    private String alt;
    @Nullable
    private String caption;
    @Nullable
    private Integer height;
    @Nullable
    private Boolean isLinkNewWindow;
    private boolean isRepresent;
    @Nullable
    private String link;
    @NotNull
    private LoadingStatus loadingStatus;
    @NotNull
    private Location location;
    @Nullable
    private String mimeType;
    @NotNull
    private MobileStyle mobileStyle;
    private int originHeight;
    private int originWidth;
    @NotNull
    private String src;
    @NotNull
    private Style style;
    @Nullable
    private String title;
    @Nullable
    private Integer width;

    public ImageItem() {
        this.src = "";
        this.style = Center.INSTANCE;
        Companion mobileStyle$Companion0 = MobileStyle.Companion;
        Object object0 = Keditor.INSTANCE.getConfig().get("image_style");
        String s = null;
        if(!(object0 instanceof List)) {
            object0 = null;
        }
        List list0 = (List)object0;
        if(list0 == null) {
            list0 = null;
        }
        if(list0 != null) {
            s = (String)CollectionsKt___CollectionsKt.first(list0);
        }
        this.mobileStyle = mobileStyle$Companion0.byName("width" + s);
        this.location = Location.LOCAL;
        this.loadingStatus = Ready.INSTANCE;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider
    public boolean containsRepresentativeImage() {
        return this.isRepresent;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Styled
    @NotNull
    public Alignment getAlignment() {
        return DefaultImpls.getAlignment(this);
    }

    @Nullable
    public final String getAlt() {
        return this.alt;
    }

    @Nullable
    public final String getCaption() {
        return this.caption;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    @Nullable
    public Integer getHeight() {
        return this.height;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider
    @NotNull
    public List getImageSrcList() {
        return k.listOf(this.getSrc());
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Linkable
    @Nullable
    public String getLink() {
        return this.link;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    @NotNull
    public LoadingStatus getLoadingStatus() {
        return this.loadingStatus;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    @NotNull
    public Location getLocation() {
        return this.location;
    }

    @Nullable
    public final String getMimeType() {
        return this.mimeType;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Styled
    @NotNull
    public MobileStyle getMobileStyle() {
        return this.mobileStyle;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public int getOriginHeight() {
        return this.originHeight;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public int getOriginWidth() {
        return this.originWidth;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    @NotNull
    public String getPath() {
        return this.getSrc();
    }

    // 去混淆评级： 低(20)
    @Override  // com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider
    @Nullable
    public String getRepresentativeImage() {
        return this.isRepresent ? this.getSrc() : null;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.ImageUploadable
    @NotNull
    public String getSrc() {
        return this.src;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Styled
    @NotNull
    public Style getStyle() {
        return this.style;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    @Nullable
    public Integer getWidth() {
        return this.width;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider
    public boolean hasImage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "representativeImageSrc");
        return Intrinsics.areEqual(this.getSrc(), s);
    }

    public final boolean isGif() {
        return this.mimeType == null ? false : StringsKt__StringsKt.contains(this.mimeType, "image/gif", true);
    }

    @Nullable
    public final Boolean isLinkNewWindow() {
        return this.isLinkNewWindow;
    }

    public final boolean isRepresent() {
        return this.isRepresent;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Styled
    public void setAlignment(@NotNull Alignment alignment0) {
        DefaultImpls.setAlignment(this, alignment0);
    }

    public final void setAlt(@Nullable String s) {
        this.alt = s;
    }

    public final void setCaption(@Nullable String s) {
        this.caption = s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setHeight(@Nullable Integer integer0) {
        this.height = integer0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Linkable
    public void setLink(@Nullable String s) {
        this.link = s;
    }

    public final void setLinkNewWindow(@Nullable Boolean boolean0) {
        this.isLinkNewWindow = boolean0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public void setLoadingStatus(@NotNull LoadingStatus loadingStatus0) {
        Intrinsics.checkNotNullParameter(loadingStatus0, "<set-?>");
        this.loadingStatus = loadingStatus0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    public void setLocation(@NotNull Location location0) {
        Intrinsics.checkNotNullParameter(location0, "<set-?>");
        this.location = location0;
    }

    public final void setMimeType(@Nullable String s) {
        this.mimeType = s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Styled
    public void setMobileStyle(@NotNull MobileStyle mobileStyle0) {
        Intrinsics.checkNotNullParameter(mobileStyle0, "value");
        this.removeBypass("mobileStyle");
        this.mobileStyle = mobileStyle0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setOriginHeight(int v) {
        this.originHeight = v;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setOriginWidth(int v) {
        this.originWidth = v;
    }

    public final void setRepresent(boolean z) {
        this.isRepresent = z;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider
    public void setRepresentativeImage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "representativeImage");
        if(this.hasImage(s)) {
            this.isRepresent = true;
        }
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.ImageUploadable
    public void setSrc(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.src = s;
        this.setLocation((new Regex("https?://").containsMatchIn(s) ? Location.UPLOADED : Location.LOCAL));
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Styled
    public void setStyle(@NotNull Style style0) {
        Intrinsics.checkNotNullParameter(style0, "value");
        this.removeBypass("style");
        this.style = style0;
    }

    public final void setTitle(@Nullable String s) {
        this.title = s;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.MediaUploadable
    public void setWidth(@Nullable Integer integer0) {
        this.width = integer0;
    }

    @Override
    @NotNull
    public String toString() {
        Boolean boolean0 = this.isLinkNewWindow;
        String s = this.title;
        String s1 = this.alt;
        String s2 = this.caption;
        String s3 = this.mimeType;
        boolean z = this.isRepresent;
        StringBuilder stringBuilder0 = new StringBuilder("ImageItem(src=\'");
        stringBuilder0.append(this.getSrc());
        stringBuilder0.append("\', width=");
        stringBuilder0.append(this.getWidth());
        stringBuilder0.append(", height=");
        stringBuilder0.append(this.getHeight());
        stringBuilder0.append(", originWidth=");
        stringBuilder0.append(this.getOriginWidth());
        stringBuilder0.append(", originHeight=");
        stringBuilder0.append(this.getOriginHeight());
        stringBuilder0.append(", style=");
        stringBuilder0.append(this.getStyle());
        stringBuilder0.append(", mobileStyle=");
        stringBuilder0.append(this.getMobileStyle());
        stringBuilder0.append(", link=");
        stringBuilder0.append(this.getLink());
        stringBuilder0.append(", isLinkNewWindow=");
        stringBuilder0.append(boolean0);
        stringBuilder0.append(", title=");
        stringBuilder0.append(s);
        stringBuilder0.append(", alt=");
        a.w(stringBuilder0, s1, ", caption=", s2, ", mimeType=");
        stringBuilder0.append(s3);
        stringBuilder0.append(", isRepresent=");
        stringBuilder0.append(z);
        stringBuilder0.append(", location=");
        stringBuilder0.append(this.getLocation());
        stringBuilder0.append(", loadingStatus=");
        stringBuilder0.append(this.getLoadingStatus());
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    public void uploadFailed(@Nullable String s) {
        com.kakao.keditor.plugin.attrs.item.ImageUploadable.DefaultImpls.uploadFailed(this, s);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Uploadable
    public void uploadSucceed(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "src");
        com.kakao.keditor.plugin.attrs.item.ImageUploadable.DefaultImpls.uploadSucceed(this, s);
        this.setSrc(s);
    }
}

