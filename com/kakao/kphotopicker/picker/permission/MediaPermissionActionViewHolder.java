package com.kakao.kphotopicker.picker.permission;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.material.snackbar.p;
import com.kakao.kphotopicker.databinding.KphotopickerItemMediaPermissionActionBinding;
import com.kakao.kphotopicker.loader.GalleryType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/kakao/kphotopicker/picker/permission/MediaPermissionActionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/kakao/kphotopicker/picker/permission/MediaPermissionAction;", "action", "", "bind", "(Lcom/kakao/kphotopicker/picker/permission/MediaPermissionAction;)V", "Companion", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMediaPermissionActionViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPermissionActionViewHolder.kt\ncom/kakao/kphotopicker/picker/permission/MediaPermissionActionViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,43:1\n262#2,2:44\n*S KotlinDebug\n*F\n+ 1 MediaPermissionActionViewHolder.kt\ncom/kakao/kphotopicker/picker/permission/MediaPermissionActionViewHolder\n*L\n21#1:44,2\n*E\n"})
public final class MediaPermissionActionViewHolder extends ViewHolder {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J/\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0010\u0010\t\u001A\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kphotopicker/picker/permission/MediaPermissionActionViewHolder$Companion;", "", "Landroid/view/ViewGroup;", "parent", "Lcom/kakao/kphotopicker/loader/GalleryType;", "galleryType", "Lkotlin/Function0;", "Landroid/app/Activity;", "Lcom/kakao/kphotopicker/picker/permission/MediaPermissionActionClickConsumer;", "clickConsumer", "Lcom/kakao/kphotopicker/picker/permission/MediaPermissionActionViewHolder;", "create", "(Landroid/view/ViewGroup;Lcom/kakao/kphotopicker/loader/GalleryType;Lkotlin/jvm/functions/Function0;)Lcom/kakao/kphotopicker/picker/permission/MediaPermissionActionViewHolder;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final MediaPermissionActionViewHolder create(@NotNull ViewGroup viewGroup0, @NotNull GalleryType galleryType0, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(viewGroup0, "parent");
            Intrinsics.checkNotNullParameter(galleryType0, "galleryType");
            Intrinsics.checkNotNullParameter(function00, "clickConsumer");
            KphotopickerItemMediaPermissionActionBinding kphotopickerItemMediaPermissionActionBinding0 = KphotopickerItemMediaPermissionActionBinding.inflate(LayoutInflater.from(viewGroup0.getContext()), viewGroup0, false);
            Intrinsics.checkNotNullExpressionValue(kphotopickerItemMediaPermissionActionBinding0, "inflate(...)");
            return new MediaPermissionActionViewHolder(kphotopickerItemMediaPermissionActionBinding0, galleryType0, function00, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final KphotopickerItemMediaPermissionActionBinding c;
    public final GalleryType d;
    public final Function0 e;

    static {
        MediaPermissionActionViewHolder.Companion = new Companion(null);
    }

    public MediaPermissionActionViewHolder(KphotopickerItemMediaPermissionActionBinding kphotopickerItemMediaPermissionActionBinding0, GalleryType galleryType0, Function0 function00, DefaultConstructorMarker defaultConstructorMarker0) {
        super(kphotopickerItemMediaPermissionActionBinding0.getRoot());
        this.c = kphotopickerItemMediaPermissionActionBinding0;
        this.d = galleryType0;
        this.e = function00;
    }

    public final void bind(@NotNull MediaPermissionAction mediaPermissionAction0) {
        Intrinsics.checkNotNullParameter(mediaPermissionAction0, "action");
        KphotopickerItemMediaPermissionActionBinding kphotopickerItemMediaPermissionActionBinding0 = this.c;
        kphotopickerItemMediaPermissionActionBinding0.mediaPermissionTitle.setText(mediaPermissionAction0.getTitleRes());
        Intrinsics.checkNotNullExpressionValue(kphotopickerItemMediaPermissionActionBinding0.mediaPermissionDesc, "mediaPermissionDesc");
        kphotopickerItemMediaPermissionActionBinding0.mediaPermissionDesc.setVisibility((mediaPermissionAction0.getDescRes() == null ? 8 : 0));
        if(mediaPermissionAction0.getDescRes() != null) {
            kphotopickerItemMediaPermissionActionBinding0.mediaPermissionDesc.setText(((int)mediaPermissionAction0.getDescRes()));
        }
        kphotopickerItemMediaPermissionActionBinding0.getRoot().setOnClickListener(new p(5, mediaPermissionAction0, this));
    }
}

