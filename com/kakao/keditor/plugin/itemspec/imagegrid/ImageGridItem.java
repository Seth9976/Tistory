package com.kakao.keditor.plugin.itemspec.imagegrid;

import a5.b;
import com.kakao.keditor.media.MediaItem;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Succeed;
import com.kakao.keditor.plugin.attrs.LoadingStatus;
import com.kakao.keditor.plugin.attrs.item.HasExtraUploadable;
import com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@KeditorItemType(type = "imageGrid")
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B/\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0006\u0012\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\f0\u000B\u00A2\u0006\u0002\u0010\rJ\u0016\u0010.\u001A\u00020\f2\u0006\u0010/\u001A\u00020\t2\u0006\u00100\u001A\u00020\fJ\u001C\u00101\u001A\u00020\f2\f\u00102\u001A\b\u0012\u0004\u0012\u00020\t0\u000B2\u0006\u00100\u001A\u00020\fJ\u0006\u00103\u001A\u000204J\u0006\u00105\u001A\u000204J)\u00106\u001A\u0002042!\u00107\u001A\u001D\u0012\u0013\u0012\u00110\f\u00A2\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020408J\b\u0010<\u001A\u00020=H\u0016J\u000E\u0010>\u001A\b\u0012\u0004\u0012\u00020\u00060\u000BH\u0016J\n\u0010?\u001A\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010@\u001A\u00020=2\u0006\u0010A\u001A\u00020\u0006H\u0016J\u0016\u0010B\u001A\u0002042\u0006\u0010C\u001A\u00020\f2\u0006\u0010D\u001A\u00020\fJ\u0006\u0010E\u001A\u00020=J\u000E\u0010F\u001A\u0002042\u0006\u0010;\u001A\u00020\fJ\u0010\u0010G\u001A\u0002042\u0006\u0010H\u001A\u00020\u0006H\u0016J\u000E\u0010I\u001A\u0002042\u0006\u0010;\u001A\u00020\fJ\u0006\u0010J\u001A\u00020\u0006J\b\u0010K\u001A\u00020\u0006H\u0016J\u000E\u0010L\u001A\u00020=2\u0006\u0010/\u001A\u00020\tR&\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000FX\u0094\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0005\u001A\u00020\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001A\u00020\f8F\u00A2\u0006\u0006\u001A\u0004\b\u001A\u0010\u001BR \u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\u001A\u0010 \u001A\u00020!X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000E\u0010&\u001A\u00020\fX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0011\u0010\'\u001A\u00020\f8F\u00A2\u0006\u0006\u001A\u0004\b(\u0010\u001BR \u0010\n\u001A\b\u0012\u0004\u0012\u00020\f0\u000BX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b)\u0010\u001D\"\u0004\b*\u0010\u001FR\u001A\u0010+\u001A\b\u0012\u0004\u0012\u00020,0\u000B8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b-\u0010\u001D\u00A8\u0006M"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridItem;", "Lcom/kakao/keditor/media/MediaItem;", "Lcom/kakao/keditor/plugin/attrs/item/RepresentativeImageProvider;", "Ljava/io/Serializable;", "Lcom/kakao/keditor/plugin/attrs/item/HasExtraUploadable;", "caption", "", "images", "", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "shape", "", "", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "bypassStored", "", "", "getBypassStored", "()Ljava/util/Map;", "setBypassStored", "(Ljava/util/Map;)V", "getCaption", "()Ljava/lang/String;", "setCaption", "(Ljava/lang/String;)V", "focusedImageIndex", "getFocusedImageIndex", "()I", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "loadingStatus", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "getLoadingStatus", "()Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "setLoadingStatus", "(Lcom/kakao/keditor/plugin/attrs/LoadingStatus;)V", "pendingClearRepresentViewIndex", "representativeImageIndex", "getRepresentativeImageIndex", "getShape", "setShape", "uploadables", "Lcom/kakao/keditor/plugin/attrs/item/Uploadable;", "getUploadables", "addImageAndFocusNext", "image", "maxImageCount", "addImagesAndFocusLastAdded", "imageList", "clearFocus", "", "clearRepresentativeInternal", "consumePendingClearRepresentViewIndex", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "containsRepresentativeImage", "", "getImageSrcList", "getRepresentativeImage", "hasImage", "representativeImageSrc", "moveImageTo", "fromIndex", "toIndex", "removeImageAndFocusNext", "setFocusedImage", "setRepresentativeImage", "representativeImage", "setRepresentativeImageInternal", "toComparableJsonString", "toString", "updateImage", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImageGridItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageGridItem.kt\ncom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n1#2:164\n1747#3,3:165\n1549#3:168\n1620#3,3:169\n288#3,2:172\n1747#3,3:174\n*S KotlinDebug\n*F\n+ 1 ImageGridItem.kt\ncom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridItem\n*L\n40#1:165,3\n42#1:168\n42#1:169,3\n44#1:172,2\n46#1:174,3\n*E\n"})
public final class ImageGridItem extends MediaItem implements HasExtraUploadable, RepresentativeImageProvider, Serializable {
    @NotNull
    private Map bypassStored;
    @NotNull
    private String caption;
    @NotNull
    private List images;
    @NotNull
    private LoadingStatus loadingStatus;
    private int pendingClearRepresentViewIndex;
    @NotNull
    private List shape;

    public ImageGridItem() {
        this(null, null, null, 7, null);
    }

    public ImageGridItem(@NotNull String s, @NotNull List list0, @NotNull List list1) {
        Intrinsics.checkNotNullParameter(s, "caption");
        Intrinsics.checkNotNullParameter(list0, "images");
        Intrinsics.checkNotNullParameter(list1, "shape");
        super();
        this.caption = s;
        this.images = list0;
        this.shape = list1;
        this.bypassStored = new LinkedHashMap();
        this.loadingStatus = Succeed.INSTANCE;
        this.pendingClearRepresentViewIndex = -1;
    }

    public ImageGridItem(String s, List list0, List list1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            s = "";
        }
        if((v & 2) != 0) {
            list0 = new ArrayList();
        }
        if((v & 4) != 0) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        this(s, list0, list1);
    }

    public final int addImageAndFocusNext(@NotNull ImageGridCellItem imageGridCellItem0, int v) {
        Intrinsics.checkNotNullParameter(imageGridCellItem0, "image");
        int v1 = this.getFocusedImageIndex() >= 0 ? this.getFocusedImageIndex() + 1 : this.images.size();
        if(v1 >= v) {
            return v1 - v + 1;
        }
        this.images.add(v1, imageGridCellItem0);
        if(this.getFocusedImageIndex() >= 0) {
            ((ImageGridCellItem)this.images.get(this.getFocusedImageIndex())).setFocused(false);
        }
        ((ImageGridCellItem)this.images.get(v1)).setFocused(true);
        return 0;
    }

    public final int addImagesAndFocusLastAdded(@NotNull List list0, int v) {
        Intrinsics.checkNotNullParameter(list0, "imageList");
        int v1 = v - this.images.size();
        int v2 = this.getFocusedImageIndex() >= 0 ? this.getFocusedImageIndex() + 1 : this.images.size();
        int v3 = c.coerceAtMost(list0.size(), v1);
        this.images.addAll(v2, list0.subList(0, v3));
        if(this.getFocusedImageIndex() >= 0) {
            ((ImageGridCellItem)this.images.get(this.getFocusedImageIndex())).setFocused(false);
        }
        ((ImageGridCellItem)this.images.get(v2 + v3 - 1)).setFocused(true);
        return c.coerceAtLeast(list0.size() - v1, 0);
    }

    public final void clearFocus() {
        int v = this.getFocusedImageIndex();
        if(v >= 0) {
            ((ImageGridCellItem)this.images.get(v)).setFocused(false);
        }
    }

    public final void clearRepresentativeInternal() {
        int v = this.getRepresentativeImageIndex();
        if(v >= 0) {
            ((ImageGridCellItem)this.images.get(v)).setRepresent(false);
        }
        this.pendingClearRepresentViewIndex = v;
    }

    public final void consumePendingClearRepresentViewIndex(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        int v = this.pendingClearRepresentViewIndex;
        if(v >= 0) {
            function10.invoke(v);
            this.pendingClearRepresentViewIndex = -1;
        }
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider
    public boolean containsRepresentativeImage() {
        Iterable iterable0 = this.images;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(((ImageGridCellItem)object0).isRepresent()) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @Override  // com.kakao.keditor.KeditorItem
    @NotNull
    public Map getBypassStored() {
        return this.bypassStored;
    }

    @NotNull
    public final String getCaption() {
        return this.caption;
    }

    public final int getFocusedImageIndex() {
        List list0 = this.images;
        for(Object object0: list0) {
            if(((ImageGridCellItem)object0).isFocused()) {
                return CollectionsKt___CollectionsKt.indexOf(list0, object0);
            }
            if(false) {
                break;
            }
        }
        return CollectionsKt___CollectionsKt.indexOf(list0, null);
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider
    @NotNull
    public List getImageSrcList() {
        Iterable iterable0 = this.images;
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        Iterator iterator0 = iterable0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            list0.add("");
        }
        return list0;
    }

    @NotNull
    public final List getImages() {
        return this.images;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    @NotNull
    public LoadingStatus getLoadingStatus() {
        return this.loadingStatus;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider
    @Nullable
    public String getRepresentativeImage() {
        for(Object object0: this.images) {
            if(((ImageGridCellItem)object0).isRepresent()) {
                return ((ImageGridCellItem)object0) == null ? null : "";
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final int getRepresentativeImageIndex() {
        List list0 = this.images;
        for(Object object0: list0) {
            if(((ImageGridCellItem)object0).isRepresent()) {
                return CollectionsKt___CollectionsKt.indexOf(list0, object0);
            }
            if(false) {
                break;
            }
        }
        return CollectionsKt___CollectionsKt.indexOf(list0, null);
    }

    @NotNull
    public final List getShape() {
        return this.shape;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.HasExtraUploadable
    @NotNull
    public List getUploadables() {
        return this.images;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider
    public boolean hasImage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "representativeImageSrc");
        Iterable iterable0 = this.images;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            Iterator iterator0 = iterable0.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                if(Intrinsics.areEqual("", s)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public final void moveImageTo(int v, int v1) {
        if(v == v1) {
            return;
        }
        ImageGridCellItem imageGridCellItem0 = (ImageGridCellItem)this.images.get(v);
        this.images.remove(v);
        if(v1 > v) {
            --v1;
        }
        this.images.add(v1, imageGridCellItem0);
    }

    public final boolean removeImageAndFocusNext() {
        int v = this.getFocusedImageIndex();
        if(v < 0) {
            return false;
        }
        this.images.remove(v);
        if(v <= CollectionsKt__CollectionsKt.getLastIndex(this.images)) {
            ((ImageGridCellItem)this.images.get(v)).setFocused(true);
            return true;
        }
        if(CollectionsKt__CollectionsKt.getLastIndex(this.images) >= 0) {
            ((ImageGridCellItem)this.images.get(CollectionsKt__CollectionsKt.getLastIndex(this.images))).setFocused(true);
        }
        return true;
    }

    @Override  // com.kakao.keditor.KeditorItem
    public void setBypassStored(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<set-?>");
        this.bypassStored = map0;
    }

    public final void setCaption(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.caption = s;
    }

    public final void setFocusedImage(int v) {
        this.clearFocus();
        if(v >= 0 && v <= CollectionsKt__CollectionsKt.getLastIndex(this.images)) {
            ((ImageGridCellItem)this.images.get(v)).setFocused(true);
        }
    }

    public final void setImages(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<set-?>");
        this.images = list0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Loadable
    public void setLoadingStatus(@NotNull LoadingStatus loadingStatus0) {
        Intrinsics.checkNotNullParameter(loadingStatus0, "<set-?>");
        this.loadingStatus = loadingStatus0;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.RepresentativeImageProvider
    public void setRepresentativeImage(@NotNull String s) {
        Object object0 = null;
        Intrinsics.checkNotNullParameter(s, "representativeImage");
        for(Object object1: this.images) {
            if(Intrinsics.areEqual("", s)) {
                object0 = object1;
                break;
            }
        }
        if(((ImageGridCellItem)object0) != null) {
            ((ImageGridCellItem)object0).setRepresent(true);
        }
    }

    public final void setRepresentativeImageInternal(int v) {
        this.clearRepresentativeInternal();
        if(v >= 0 && v <= CollectionsKt__CollectionsKt.getLastIndex(this.images)) {
            ((ImageGridCellItem)this.images.get(v)).setRepresent(true);
        }
    }

    public final void setShape(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<set-?>");
        this.shape = list0;
    }

    @NotNull
    public final String toComparableJsonString() {
        String s = this.caption;
        String s1 = CollectionsKt___CollectionsKt.joinToString$default(this.images, null, null, null, 0, null, com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem.toComparableJsonString.1.INSTANCE, 0x1F, null);
        String s2 = CollectionsKt___CollectionsKt.joinToString$default(this.shape, null, null, null, 0, null, null, 0x3F, null);
        return a.o(b.w("{\"caption\":\"", s, "\",\"images\":", s1, "\"shape\":"), s2, "}");

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem.toComparableJsonString.1 extends Lambda implements Function1 {
            public static final com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem.toComparableJsonString.1 INSTANCE;

            static {
                com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem.toComparableJsonString.1.INSTANCE = new com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem.toComparableJsonString.1();
            }

            public com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem.toComparableJsonString.1() {
                super(1);
            }

            @NotNull
            public final CharSequence invoke(@NotNull ImageGridCellItem imageGridCellItem0) {
                Intrinsics.checkNotNullParameter(imageGridCellItem0, "it");
                return "{\n\"src\":\"\",\"width\":null,\"height\":null,\"originWidth\":0,\"originHeight\":0,\"widthPercent\":0.0,\"alt\":null,\"isRepresent\":false,\"isFocused\":false,\"location\":\"LOCAL\",\"loadingStatus\":\"jebdyn.dexdec.irsb.Object_af45196d@6bac980f\"\n}";
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((ImageGridCellItem)object0));
            }
        }

    }

    @Override
    @NotNull
    public String toString() {
        List list0 = this.images;
        String s = this.caption;
        List list1 = this.shape;
        StringBuilder stringBuilder0 = new StringBuilder("ImageGridItem(images=");
        stringBuilder0.append(list0);
        stringBuilder0.append(", caption=");
        stringBuilder0.append(s);
        stringBuilder0.append(", shape=");
        return wb.a.e(stringBuilder0, list1, ")");
    }

    public final boolean updateImage(@NotNull ImageGridCellItem imageGridCellItem0) {
        Intrinsics.checkNotNullParameter(imageGridCellItem0, "image");
        int v = this.getFocusedImageIndex();
        if(v < 0) {
            return false;
        }
        this.images.set(v, imageGridCellItem0);
        imageGridCellItem0.setFocused(true);
        return true;
    }
}

