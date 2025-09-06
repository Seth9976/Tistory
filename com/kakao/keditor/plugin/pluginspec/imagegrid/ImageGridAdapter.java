package com.kakao.keditor.plugin.pluginspec.imagegrid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.m;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.databinding.KeItemImageGridSingleBinding;
import com.kakao.keditor.delegate.ImageLoader.DefaultImpls;
import com.kakao.keditor.delegate.ImageLoader;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridCellItem;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem;
import com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout.Adapter;
import com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout.Cell;
import com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000B\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001)B-\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001A\u00020\t\u0012\b\b\u0002\u0010\n\u001A\u00020\t¢\u0006\u0002\u0010\u000BJ\u0018\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u00020\u001BH\u0016J\b\u0010\u001C\u001A\u00020\u0017H\u0016J\u0010\u0010\u001D\u001A\u00020\u00032\u0006\u0010\u001E\u001A\u00020\u001FH\u0016J\u0018\u0010 \u001A\u00020\u00172\u0006\u0010!\u001A\u00020\u001B2\u0006\u0010\"\u001A\u00020\u001BH\u0016J\u0016\u0010#\u001A\u00020\u00172\f\u0010$\u001A\b\u0012\u0004\u0012\u00020\u001B0\u0012H\u0016J\u0010\u0010%\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u001BH\u0002J\u0010\u0010&\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u001BH\u0002J\f\u0010\'\u001A\u00020\u001B*\u00020\u0002H\u0014J\f\u0010(\u001A\u00020\u001B*\u00020\u0002H\u0014R\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0010R\u001A\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0010¨\u0006*"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridAdapter;", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Adapter;", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridAdapter$ImageGridCell;", "autoTemplateLayout", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout;", "imageGridItem", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridItem;", "isEditable", "", "representativeImageEnabled", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout;Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridItem;ZZ)V", "getImageGridItem", "()Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridItem;", "setImageGridItem", "(Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridItem;)V", "()Z", "items", "", "getItems", "()Ljava/util/List;", "getRepresentativeImageEnabled", "onBindViewHolder", "", "holder", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Cell;", "position", "", "onChildrenSizesChanged", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onMoveCell", "fromIndex", "toIndex", "onTemplateChanged", "template", "setFocus", "setRepresentativeImage", "getHeight", "getWidth", "ImageGridCell", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImageGridAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageGridAdapter.kt\ncom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n1549#2:127\n1620#2,2:128\n1549#2:130\n1620#2,3:131\n1864#2,3:134\n1622#2:137\n*S KotlinDebug\n*F\n+ 1 ImageGridAdapter.kt\ncom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridAdapter\n*L\n105#1:127\n105#1:128,2\n106#1:130\n106#1:131,3\n111#1:134,3\n105#1:137\n*E\n"})
public final class ImageGridAdapter extends Adapter {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\tJ\u0016\u0010\f\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u000FR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridAdapter$ImageGridCell;", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout$Cell;", "binding", "Lcom/kakao/keditor/databinding/KeItemImageGridSingleBinding;", "onFocusClicked", "Lkotlin/Function1;", "", "", "onRepresentativeClicked", "(Lcom/kakao/keditor/databinding/KeItemImageGridSingleBinding;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getBinding", "()Lcom/kakao/keditor/databinding/KeItemImageGridSingleBinding;", "bind", "position", "item", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ImageGridCell extends Cell {
        @NotNull
        private final KeItemImageGridSingleBinding binding;
        @NotNull
        private final Function1 onFocusClicked;
        @NotNull
        private final Function1 onRepresentativeClicked;

        public ImageGridCell(@NotNull KeItemImageGridSingleBinding keItemImageGridSingleBinding0, @NotNull Function1 function10, @NotNull Function1 function11) {
            Intrinsics.checkNotNullParameter(keItemImageGridSingleBinding0, "binding");
            Intrinsics.checkNotNullParameter(function10, "onFocusClicked");
            Intrinsics.checkNotNullParameter(function11, "onRepresentativeClicked");
            View view0 = keItemImageGridSingleBinding0.getRoot();
            Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
            super(view0);
            this.binding = keItemImageGridSingleBinding0;
            this.onFocusClicked = function10;
            this.onRepresentativeClicked = function11;
        }

        public final void bind(int v, @NotNull ImageGridCellItem imageGridCellItem0) {
            Intrinsics.checkNotNullParameter(imageGridCellItem0, "item");
            m m0 = new m(17, this, imageGridCellItem0);
            this.binding.keItemImage.post(m0);
            KeItemImageGridSingleBinding keItemImageGridSingleBinding0 = this.binding;
            if(keItemImageGridSingleBinding0.getIsEditable()) {
                keItemImageGridSingleBinding0.setHasFocus(imageGridCellItem0.isFocused());
                keItemImageGridSingleBinding0.getRoot().setOnClickListener(new a(this, v, 0));
            }
            if(keItemImageGridSingleBinding0.getRepresentativeImageEnabled()) {
                keItemImageGridSingleBinding0.setIsRepresent(imageGridCellItem0.isRepresent());
                a a0 = new a(this, v, 1);
                keItemImageGridSingleBinding0.keItemImageRepresentImageBtn.setOnClickListener(a0);
            }
        }

        private static final void bind$lambda$0(ImageGridCell imageGridAdapter$ImageGridCell0, ImageGridCellItem imageGridCellItem0) {
            Intrinsics.checkNotNullParameter(imageGridAdapter$ImageGridCell0, "this$0");
            Intrinsics.checkNotNullParameter(imageGridCellItem0, "$item");
            ImageLoader imageLoader0 = Keditor.INSTANCE.getImageLoader();
            if(imageLoader0 != null) {
                Intrinsics.checkNotNullExpressionValue(imageGridAdapter$ImageGridCell0.binding.keItemImage, "keItemImage");
                DefaultImpls.loadImage$default(imageLoader0, imageGridAdapter$ImageGridCell0.binding.keItemImage, "", "imageGrid", null, null, null, null, null, false, 504, null);
            }
        }

        private static final void bind$lambda$3$lambda$1(ImageGridCell imageGridAdapter$ImageGridCell0, int v, View view0) {
            Intrinsics.checkNotNullParameter(imageGridAdapter$ImageGridCell0, "this$0");
            imageGridAdapter$ImageGridCell0.onFocusClicked.invoke(v);
        }

        private static final void bind$lambda$3$lambda$2(ImageGridCell imageGridAdapter$ImageGridCell0, int v, View view0) {
            Intrinsics.checkNotNullParameter(imageGridAdapter$ImageGridCell0, "this$0");
            Keditor.clickEvent$default(Keditor.INSTANCE, "kImageGrid", "representation", null, 4, null);
            imageGridAdapter$ImageGridCell0.onRepresentativeClicked.invoke(v);
        }

        @NotNull
        public final KeItemImageGridSingleBinding getBinding() {
            return this.binding;
        }
    }

    @Nullable
    private ImageGridItem imageGridItem;
    private final boolean isEditable;
    private final boolean representativeImageEnabled;

    public ImageGridAdapter(@NotNull AutoTemplateLayout autoTemplateLayout0, @Nullable ImageGridItem imageGridItem0, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(autoTemplateLayout0, "autoTemplateLayout");
        super(autoTemplateLayout0);
        this.imageGridItem = imageGridItem0;
        this.isEditable = z;
        this.representativeImageEnabled = z1;
    }

    public ImageGridAdapter(AutoTemplateLayout autoTemplateLayout0, ImageGridItem imageGridItem0, boolean z, boolean z1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            imageGridItem0 = null;
        }
        if((v & 4) != 0) {
            z = false;
        }
        if((v & 8) != 0) {
            z1 = false;
        }
        this(autoTemplateLayout0, imageGridItem0, z, z1);
    }

    public int getHeight(@NotNull ImageGridCellItem imageGridCellItem0) {
        Intrinsics.checkNotNullParameter(imageGridCellItem0, "<this>");
        return imageGridCellItem0.getOriginHeight();
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout$Adapter
    public int getHeight(Object object0) {
        return this.getHeight(((ImageGridCellItem)object0));
    }

    @Nullable
    public final ImageGridItem getImageGridItem() {
        return this.imageGridItem;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout$Adapter
    @NotNull
    public List getItems() {
        ImageGridItem imageGridItem0 = this.imageGridItem;
        if(imageGridItem0 != null) {
            List list0 = imageGridItem0.getImages();
            return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public final boolean getRepresentativeImageEnabled() {
        return this.representativeImageEnabled;
    }

    public int getWidth(@NotNull ImageGridCellItem imageGridCellItem0) {
        Intrinsics.checkNotNullParameter(imageGridCellItem0, "<this>");
        return imageGridCellItem0.getOriginWidth();
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout$Adapter
    public int getWidth(Object object0) {
        return this.getWidth(((ImageGridCellItem)object0));
    }

    public final boolean isEditable() {
        return this.isEditable;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout$Adapter
    public void onBindViewHolder(@NotNull Cell autoTemplateLayout$Cell0, int v) {
        Intrinsics.checkNotNullParameter(autoTemplateLayout$Cell0, "holder");
        ImageGridItem imageGridItem0 = this.imageGridItem;
        if(imageGridItem0 != null) {
            List list0 = imageGridItem0.getImages();
            if(list0 != null) {
                ImageGridCellItem imageGridCellItem0 = (ImageGridCellItem)list0.get(v);
                if(imageGridCellItem0 != null) {
                    ((ImageGridCell)autoTemplateLayout$Cell0).bind(v, imageGridCellItem0);
                }
            }
        }
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout$Adapter
    public void onChildrenSizesChanged() {
        ImageGridItem imageGridItem0 = this.imageGridItem;
        if(imageGridItem0 != null) {
            Iterable iterable0 = imageGridItem0.getShape();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            int v = 0;
            for(Object object0: iterable0) {
                int v1 = ((Number)object0).intValue() + v;
                Iterable iterable1 = imageGridItem0.getImages().subList(v, v1);
                ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(iterable1, 10));
                Iterator iterator1 = iterable1.iterator();
                while(true) {
                    double f = 0.0;
                    if(!iterator1.hasNext()) {
                        break;
                    }
                    Object object1 = iterator1.next();
                    ImageGridCellItem imageGridCellItem0 = (ImageGridCellItem)object1;
                    if(imageGridCellItem0.getOriginHeight() != 0) {
                        f = ((double)imageGridCellItem0.getOriginWidth()) / ((double)imageGridCellItem0.getOriginHeight());
                    }
                    arrayList1.add(f);
                }
                double f1 = CollectionsKt___CollectionsKt.sumOfDouble(arrayList1);
                int v2 = 0;
                for(Object object2: arrayList1) {
                    if(v2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    ((ImageGridCellItem)imageGridItem0.getImages().get(v2 + v)).setWidthPercent((f1 == 0.0 ? 0.0 : ((Number)object2).doubleValue() * 100.0 / f1));
                    ++v2;
                }
                arrayList0.add(Unit.INSTANCE);
                v = v1;
            }
        }
    }

    @NotNull
    public ImageGridCell onCreateViewHolder(@NotNull ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        KeItemImageGridSingleBinding keItemImageGridSingleBinding0 = KeItemImageGridSingleBinding.inflate(LayoutInflater.from(viewGroup0.getContext()), viewGroup0, false);
        keItemImageGridSingleBinding0.setIsEditable(this.isEditable);
        keItemImageGridSingleBinding0.setRepresentativeImageEnabled(this.representativeImageEnabled);
        Intrinsics.checkNotNullExpressionValue(keItemImageGridSingleBinding0, "apply(...)");
        return new ImageGridCell(keItemImageGridSingleBinding0, new Function1() {
            {
                super(1, object0, ImageGridAdapter.class, "setFocus", "setFocus(I)V", 0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Number)object0).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int v) {
                ((ImageGridAdapter)this.receiver).setFocus(v);
            }
        }, new Function1() {
            {
                super(1, object0, ImageGridAdapter.class, "setRepresentativeImage", "setRepresentativeImage(I)V", 0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Number)object0).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int v) {
                ((ImageGridAdapter)this.receiver).setRepresentativeImage(v);
            }
        });
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout$Adapter
    public Cell onCreateViewHolder(ViewGroup viewGroup0) {
        return this.onCreateViewHolder(viewGroup0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout$Adapter
    public void onMoveCell(int v, int v1) {
        ImageGridItem imageGridItem0 = this.imageGridItem;
        if(imageGridItem0 != null) {
            imageGridItem0.moveImageTo(v, v1);
        }
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout$Adapter
    public void onTemplateChanged(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "template");
        ImageGridItem imageGridItem0 = this.imageGridItem;
        if(imageGridItem0 != null) {
            imageGridItem0.setShape(list0);
        }
    }

    private final void setFocus(int v) {
        int v1 = this.imageGridItem == null ? -1 : this.imageGridItem.getFocusedImageIndex();
        ImageGridItem imageGridItem0 = this.imageGridItem;
        if(imageGridItem0 != null) {
            imageGridItem0.setFocusedImage(v);
        }
        if(v1 >= 0) {
            this.notifyItemChangedWithSameSize(v1);
        }
        this.notifyItemChangedWithSameSize(v);
    }

    public final void setImageGridItem(@Nullable ImageGridItem imageGridItem0) {
        this.imageGridItem = imageGridItem0;
    }

    private final void setRepresentativeImage(int v) {
        int v1 = this.imageGridItem == null ? -1 : this.imageGridItem.getRepresentativeImageIndex();
        if(v1 == v) {
            ImageGridItem imageGridItem0 = this.imageGridItem;
            if(imageGridItem0 != null) {
                imageGridItem0.clearRepresentativeInternal();
            }
        }
        else {
            ImageGridItem imageGridItem1 = this.imageGridItem;
            if(imageGridItem1 != null) {
                imageGridItem1.setRepresentativeImageInternal(v);
            }
            if(v1 >= 0) {
                this.notifyItemChangedWithSameSize(v1);
            }
        }
        this.notifyItemChangedWithSameSize(v);
    }
}

