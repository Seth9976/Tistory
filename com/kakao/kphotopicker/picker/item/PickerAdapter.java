package com.kakao.kphotopicker.picker.item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.PickerViewModel;
import com.kakao.kphotopicker.R.drawable;
import com.kakao.kphotopicker.databinding.KphotopickerItemCameraPickerBinding;
import com.kakao.kphotopicker.databinding.KphotopickerItemLoadingPickerBinding;
import com.kakao.kphotopicker.databinding.KphotopickerItemPhotoPickerBinding;
import com.kakao.kphotopicker.databinding.KphotopickerItemVideoPickerBinding;
import com.kakao.kphotopicker.loader.BitmapLoader;
import com.kakao.kphotopicker.picker.Folder;
import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import com.kakao.kphotopicker.picker.MediaItem;
import com.kakao.kphotopicker.widget.ContentDescriptionKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nb.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\r\u001A\u00020\n¢\u0006\u0004\b\u000F\u0010\u0010J\u001F\u0010\u0014\u001A\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u0017\u001A\u00020\u00072\u0006\u0010\u0016\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001AR$\u0010\"\u001A\u0004\u0018\u00010\u001B8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!R$\u0010&\u001A\u0004\u0018\u00010\u001B8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b#\u0010\u001D\u001A\u0004\b$\u0010\u001F\"\u0004\b%\u0010!R?\u00100\u001A\u001F\u0012\u0013\u0012\u00110\n¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\'8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/kakao/kphotopicker/picker/item/PickerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/kakao/kphotopicker/PickerViewModel;", "pickerViewModel", "<init>", "(Lcom/kakao/kphotopicker/PickerViewModel;)V", "", "updateData", "()V", "", "getItemCount", "()I", "position", "Lcom/kakao/kphotopicker/picker/MediaItem;", "getItem", "(I)Lcom/kakao/kphotopicker/picker/MediaItem;", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemViewType", "(I)I", "Lcom/kakao/kphotopicker/ItemClickListener;", "j", "Lcom/kakao/kphotopicker/ItemClickListener;", "getItemClickListener", "()Lcom/kakao/kphotopicker/ItemClickListener;", "setItemClickListener", "(Lcom/kakao/kphotopicker/ItemClickListener;)V", "itemClickListener", "k", "getCameraClickListener", "setCameraClickListener", "cameraClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "l", "Lkotlin/jvm/functions/Function1;", "getOnLongClickedItem", "()Lkotlin/jvm/functions/Function1;", "setOnLongClickedItem", "(Lkotlin/jvm/functions/Function1;)V", "onLongClickedItem", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PickerAdapter extends Adapter {
    public final PickerViewModel g;
    public int h;
    public final BitmapLoader i;
    public ItemClickListener j;
    public ItemClickListener k;
    public Function1 l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;

    public PickerAdapter(@NotNull PickerViewModel pickerViewModel0) {
        Intrinsics.checkNotNullParameter(pickerViewModel0, "pickerViewModel");
        super();
        this.g = pickerViewModel0;
        this.i = new BitmapLoader();
        this.m = 1;
        this.n = 2;
        this.o = 3;
        this.p = 1;
    }

    public final List a() {
        List list0 = (List)this.g.getMediaItemList().getValue();
        return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
    }

    @Nullable
    public final ItemClickListener getCameraClickListener() {
        return this.k;
    }

    @Nullable
    public final MediaItem getItem(int v) {
        return v != 0 && v <= this.a().size() ? ((MediaItem)this.a().get(v - this.p)) : null;
    }

    @Nullable
    public final ItemClickListener getItemClickListener() {
        return this.j;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        Folder folder0 = (Folder)this.g.getCurrentFolder().getValue();
        return folder0 == null ? this.p : folder0.getBucketSize() + this.p;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        if(v == 0) {
            return 0;
        }
        MediaItem mediaItem0 = this.getItem(v);
        if(mediaItem0 == null) {
            return this.o;
        }
        if(mediaItem0 instanceof Photo) {
            return this.m;
        }
        if(!(mediaItem0 instanceof Video)) {
            throw new NoWhenBranchMatchedException();
        }
        return this.n;
    }

    @Nullable
    public final Function1 getOnLongClickedItem() {
        return this.l;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "holder");
        PickerViewModel pickerViewModel0 = this.g;
        BitmapLoader bitmapLoader0 = this.i;
        if(recyclerView$ViewHolder0 instanceof PhotoItemView) {
            MediaItem mediaItem0 = this.getItem(v);
            if(mediaItem0 != null && mediaItem0 instanceof Photo) {
                ((PhotoItemView)recyclerView$ViewHolder0).bind(((Photo)mediaItem0), bitmapLoader0, pickerViewModel0.getSelectionNo(mediaItem0), v);
                if(this.l != null) {
                    Context context0 = recyclerView$ViewHolder0.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                    if(!ContentDescriptionKt.isAccessibilityEnabled(context0)) {
                        d d0 = new d(recyclerView$ViewHolder0, this, v);
                        recyclerView$ViewHolder0.itemView.setOnLongClickListener(d0);
                    }
                }
            }
        }
        else if(recyclerView$ViewHolder0 instanceof VideoItemView) {
            MediaItem mediaItem1 = this.getItem(v);
            if(mediaItem1 != null && mediaItem1 instanceof Video) {
                ((VideoItemView)recyclerView$ViewHolder0).bind(((Video)mediaItem1), bitmapLoader0, pickerViewModel0.getSelectionNo(mediaItem1));
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        if(v == 0) {
            KphotopickerItemCameraPickerBinding kphotopickerItemCameraPickerBinding0 = KphotopickerItemCameraPickerBinding.inflate(LayoutInflater.from(viewGroup0.getContext()), viewGroup0, false);
            Intrinsics.checkNotNullExpressionValue(kphotopickerItemCameraPickerBinding0, "inflate(...)");
            return new CameraItemView(kphotopickerItemCameraPickerBinding0, this.k);
        }
        PickerViewModel pickerViewModel0 = this.g;
        if(v == this.m) {
            KphotopickerItemPhotoPickerBinding kphotopickerItemPhotoPickerBinding0 = KphotopickerItemPhotoPickerBinding.inflate(LayoutInflater.from(viewGroup0.getContext()), viewGroup0, false);
            Intrinsics.checkNotNullExpressionValue(kphotopickerItemPhotoPickerBinding0, "inflate(...)");
            if(pickerViewModel0.isSinglePick()) {
                kphotopickerItemPhotoPickerBinding0.indexBg.setBackgroundResource(drawable.kphotopicker_bg_thumb_check_singlepick);
                kphotopickerItemPhotoPickerBinding0.index.setVisibility(8);
            }
            return new PhotoItemView(kphotopickerItemPhotoPickerBinding0, this.j);
        }
        if(v == this.n) {
            KphotopickerItemVideoPickerBinding kphotopickerItemVideoPickerBinding0 = KphotopickerItemVideoPickerBinding.inflate(LayoutInflater.from(viewGroup0.getContext()), viewGroup0, false);
            Intrinsics.checkNotNullExpressionValue(kphotopickerItemVideoPickerBinding0, "inflate(...)");
            if(pickerViewModel0.isSinglePick()) {
                kphotopickerItemVideoPickerBinding0.indexBg.setBackgroundResource(drawable.kphotopicker_bg_thumb_check_singlepick);
                kphotopickerItemVideoPickerBinding0.index.setVisibility(8);
            }
            return new VideoItemView(kphotopickerItemVideoPickerBinding0, this.j);
        }
        if(v != this.o) {
            throw new Exception("invalid view type");
        }
        KphotopickerItemLoadingPickerBinding kphotopickerItemLoadingPickerBinding0 = KphotopickerItemLoadingPickerBinding.inflate(LayoutInflater.from(viewGroup0.getContext()), viewGroup0, false);
        Intrinsics.checkNotNullExpressionValue(kphotopickerItemLoadingPickerBinding0, "inflate(...)");
        return new LoadingItemView(kphotopickerItemLoadingPickerBinding0);
    }

    public final void setCameraClickListener(@Nullable ItemClickListener itemClickListener0) {
        this.k = itemClickListener0;
    }

    public final void setItemClickListener(@Nullable ItemClickListener itemClickListener0) {
        this.j = itemClickListener0;
    }

    public final void setOnLongClickedItem(@Nullable Function1 function10) {
        this.l = function10;
    }

    public final void updateData() {
        if(this.a().isEmpty()) {
            this.notifyDataSetChanged();
        }
        else {
            this.notifyItemChanged(this.h, ((int)(this.a().size() - this.h)));
        }
        this.h = this.a().size();
    }
}

