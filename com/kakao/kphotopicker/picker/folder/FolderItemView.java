package com.kakao.kphotopicker.picker.folder;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.material.snackbar.p;
import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.R.string;
import com.kakao.kphotopicker.databinding.KphotopickerItemFolderPickerBinding;
import com.kakao.kphotopicker.loader.BitmapLoader;
import com.kakao.kphotopicker.picker.Folder;
import com.kakao.kphotopicker.picker.item.PhotoGalleryImageView;
import com.kakao.kphotopicker.widget.ContentDescriptionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/kphotopicker/picker/folder/FolderItemView;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/kakao/kphotopicker/databinding/KphotopickerItemFolderPickerBinding;", "binding", "Lcom/kakao/kphotopicker/ItemClickListener;", "itemClickListener", "<init>", "(Lcom/kakao/kphotopicker/databinding/KphotopickerItemFolderPickerBinding;Lcom/kakao/kphotopicker/ItemClickListener;)V", "Lcom/kakao/kphotopicker/picker/Folder;", "folder", "Lcom/kakao/kphotopicker/loader/BitmapLoader;", "bitmapLoader", "", "bind", "(Lcom/kakao/kphotopicker/picker/Folder;Lcom/kakao/kphotopicker/loader/BitmapLoader;)V", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FolderItemView extends ViewHolder {
    public final KphotopickerItemFolderPickerBinding c;
    public static final int d;

    public FolderItemView(@NotNull KphotopickerItemFolderPickerBinding kphotopickerItemFolderPickerBinding0, @Nullable ItemClickListener itemClickListener0) {
        Intrinsics.checkNotNullParameter(kphotopickerItemFolderPickerBinding0, "binding");
        super(kphotopickerItemFolderPickerBinding0.getRoot());
        this.c = kphotopickerItemFolderPickerBinding0;
        p p0 = new p(4, itemClickListener0, this);
        this.itemView.setOnClickListener(p0);
    }

    public final void bind(@NotNull Folder folder0, @NotNull BitmapLoader bitmapLoader0) {
        Intrinsics.checkNotNullParameter(folder0, "folder");
        Intrinsics.checkNotNullParameter(bitmapLoader0, "bitmapLoader");
        KphotopickerItemFolderPickerBinding kphotopickerItemFolderPickerBinding0 = this.c;
        PhotoGalleryImageView photoGalleryImageView0 = kphotopickerItemFolderPickerBinding0.image;
        Intrinsics.checkNotNullExpressionValue(photoGalleryImageView0, "image");
        String s = folder0.getThumbnailUrl();
        if(s == null) {
            s = "";
        }
        Long long0 = folder0.getDateModified();
        bitmapLoader0.loadImage(photoGalleryImageView0, s, (long0 == null ? 0L : ((long)long0)));
        String s1 = folder0.isAllItemsFolder() ? this.itemView.getResources().getString(string.picker_all_view) : folder0.getBucketName();
        Intrinsics.checkNotNull(s1);
        kphotopickerItemFolderPickerBinding0.folderName.setText(s1);
        kphotopickerItemFolderPickerBinding0.count.setText(String.valueOf(folder0.getBucketSize()));
        LinearLayout linearLayout0 = kphotopickerItemFolderPickerBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(linearLayout0, "getRoot(...)");
        ContentDescriptionKt.setContentDescriptionWith(linearLayout0, string.picker_folder_info, new Object[]{s1, folder0.getBucketSize()});
    }
}

