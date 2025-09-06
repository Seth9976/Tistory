package com.kakao.kphotopicker.picker.permission;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.kphotopicker.loader.GalleryType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0010\u0010\b\u001A\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001F\u0010\u000F\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001F\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u0014\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/kakao/kphotopicker/picker/permission/MediaPermissionActionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kakao/kphotopicker/picker/permission/MediaPermissionActionViewHolder;", "Lcom/kakao/kphotopicker/loader/GalleryType;", "galleryType", "Lkotlin/Function0;", "Landroid/app/Activity;", "Lcom/kakao/kphotopicker/picker/permission/MediaPermissionActionClickConsumer;", "clickConsumer", "<init>", "(Lcom/kakao/kphotopicker/loader/GalleryType;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/kakao/kphotopicker/picker/permission/MediaPermissionActionViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lcom/kakao/kphotopicker/picker/permission/MediaPermissionActionViewHolder;I)V", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MediaPermissionActionAdapter extends Adapter {
    public final GalleryType g;
    public final Function0 h;

    public MediaPermissionActionAdapter(@NotNull GalleryType galleryType0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(galleryType0, "galleryType");
        Intrinsics.checkNotNullParameter(function00, "clickConsumer");
        super();
        this.g = galleryType0;
        this.h = function00;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return MediaPermissionAction.values().length;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.onBindViewHolder(((MediaPermissionActionViewHolder)recyclerView$ViewHolder0), v);
    }

    public void onBindViewHolder(@NotNull MediaPermissionActionViewHolder mediaPermissionActionViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(mediaPermissionActionViewHolder0, "holder");
        mediaPermissionActionViewHolder0.bind(MediaPermissionAction.Companion.from(v));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.onCreateViewHolder(viewGroup0, v);
    }

    @NotNull
    public MediaPermissionActionViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        return MediaPermissionActionViewHolder.Companion.create(viewGroup0, this.g, this.h);
    }
}

