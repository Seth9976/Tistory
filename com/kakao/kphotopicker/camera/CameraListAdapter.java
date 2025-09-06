package com.kakao.kphotopicker.camera;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.material.snackbar.p;
import com.kakao.kphotopicker.databinding.KphotopickerItemCameraItemBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001CB#\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001A\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J#\u0010\u0013\u001A\u00020\u00042\n\u0010\u0011\u001A\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001D\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001D"}, d2 = {"Lcom/kakao/kphotopicker/camera/CameraListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kakao/kphotopicker/camera/CameraListAdapter$CameraItemViewHolder;", "Lkotlin/Function0;", "", "onPhotoClick", "onVideoClick", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/kakao/kphotopicker/camera/CameraListAdapter$CameraItemViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lcom/kakao/kphotopicker/camera/CameraListAdapter$CameraItemViewHolder;I)V", "", "", "i", "Ljava/util/List;", "getList", "()Ljava/util/List;", "list", "CameraItemViewHolder", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CameraListAdapter extends Adapter {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/kphotopicker/camera/CameraListAdapter$CameraItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/kakao/kphotopicker/databinding/KphotopickerItemCameraItemBinding;", "binding", "<init>", "(Lcom/kakao/kphotopicker/camera/CameraListAdapter;Lcom/kakao/kphotopicker/databinding/KphotopickerItemCameraItemBinding;)V", "", "text", "", "bind", "(Ljava/lang/String;)V", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public final class CameraItemViewHolder extends ViewHolder {
        public final KphotopickerItemCameraItemBinding c;
        public final CameraListAdapter d;
        public static final int e;

        public CameraItemViewHolder(@NotNull KphotopickerItemCameraItemBinding kphotopickerItemCameraItemBinding0) {
            Intrinsics.checkNotNullParameter(kphotopickerItemCameraItemBinding0, "binding");
            this.d = cameraListAdapter0;
            super(kphotopickerItemCameraItemBinding0.getRoot());
            this.c = kphotopickerItemCameraItemBinding0;
        }

        public final void bind(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "text");
            this.c.cameraItemText.setText(s);
            p p0 = new p(3, this, this.d);
            this.c.getRoot().setOnClickListener(p0);
        }
    }

    public final Function0 g;
    public final Function0 h;
    public final List i;

    public CameraListAdapter(@NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(function00, "onPhotoClick");
        Intrinsics.checkNotNullParameter(function01, "onVideoClick");
        super();
        this.g = function00;
        this.h = function01;
        this.i = CollectionsKt__CollectionsKt.listOf(new String[]{"사진 촬영", "동영상 촬영"});
    }

    public static final Function0 access$getOnPhotoClick$p(CameraListAdapter cameraListAdapter0) {
        return cameraListAdapter0.g;
    }

    public static final Function0 access$getOnVideoClick$p(CameraListAdapter cameraListAdapter0) {
        return cameraListAdapter0.h;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.i.size();
    }

    @NotNull
    public final List getList() {
        return this.i;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.onBindViewHolder(((CameraItemViewHolder)recyclerView$ViewHolder0), v);
    }

    public void onBindViewHolder(@NotNull CameraItemViewHolder cameraListAdapter$CameraItemViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(cameraListAdapter$CameraItemViewHolder0, "holder");
        cameraListAdapter$CameraItemViewHolder0.bind(((String)this.i.get(v)));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.onCreateViewHolder(viewGroup0, v);
    }

    @NotNull
    public CameraItemViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        KphotopickerItemCameraItemBinding kphotopickerItemCameraItemBinding0 = KphotopickerItemCameraItemBinding.inflate(LayoutInflater.from(viewGroup0.getContext()), viewGroup0, false);
        Intrinsics.checkNotNullExpressionValue(kphotopickerItemCameraItemBinding0, "inflate(...)");
        return new CameraItemViewHolder(this, kphotopickerItemCameraItemBinding0);
    }
}

