package com.kakao.kphotopicker.picker.item;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.R.id;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.R.string;
import com.kakao.kphotopicker.databinding.KphotopickerItemPhotoPickerBinding;
import com.kakao.kphotopicker.loader.BitmapLoader;
import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.util.DateTimeUtil;
import com.kakao.kphotopicker.widget.ContentDescriptionKt;
import com.kakao.kphotopicker.widget.CustomAction;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import nb.a;
import nb.b;
import nb.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\r\u001A\u0004\u0018\u00010\f2\u0006\u0010\u000E\u001A\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/kakao/kphotopicker/picker/item/PhotoItemView;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/kakao/kphotopicker/databinding/KphotopickerItemPhotoPickerBinding;", "binding", "Lcom/kakao/kphotopicker/ItemClickListener;", "itemClickListener", "<init>", "(Lcom/kakao/kphotopicker/databinding/KphotopickerItemPhotoPickerBinding;Lcom/kakao/kphotopicker/ItemClickListener;)V", "Lcom/kakao/kphotopicker/picker/MediaItem$Photo;", "photo", "Lcom/kakao/kphotopicker/loader/BitmapLoader;", "bitmapLoader", "", "selectedNo", "position", "", "bind", "(Lcom/kakao/kphotopicker/picker/MediaItem$Photo;Lcom/kakao/kphotopicker/loader/BitmapLoader;Ljava/lang/Integer;I)V", "d", "Lcom/kakao/kphotopicker/ItemClickListener;", "getItemClickListener", "()Lcom/kakao/kphotopicker/ItemClickListener;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PhotoItemView extends ViewHolder {
    public final KphotopickerItemPhotoPickerBinding c;
    public final ItemClickListener d;
    public static final int e;

    public PhotoItemView(@NotNull KphotopickerItemPhotoPickerBinding kphotopickerItemPhotoPickerBinding0, @Nullable ItemClickListener itemClickListener0) {
        Intrinsics.checkNotNullParameter(kphotopickerItemPhotoPickerBinding0, "binding");
        super(kphotopickerItemPhotoPickerBinding0.getRoot());
        this.c = kphotopickerItemPhotoPickerBinding0;
        this.d = itemClickListener0;
    }

    public final void bind(@NotNull Photo mediaItem$Photo0, @NotNull BitmapLoader bitmapLoader0, @Nullable Integer integer0, int v) {
        String s;
        Intrinsics.checkNotNullParameter(mediaItem$Photo0, "photo");
        Intrinsics.checkNotNullParameter(bitmapLoader0, "bitmapLoader");
        KphotopickerItemPhotoPickerBinding kphotopickerItemPhotoPickerBinding0 = this.c;
        int v1 = 8;
        boolean z = false;
        kphotopickerItemPhotoPickerBinding0.border.setVisibility((integer0 == null ? 8 : 0));
        TextView textView0 = kphotopickerItemPhotoPickerBinding0.index;
        if(integer0 == null) {
            s = "";
        }
        else {
            s = integer0.toString();
            if(s == null) {
                s = "";
            }
        }
        textView0.setText(s);
        kphotopickerItemPhotoPickerBinding0.indexBg.setSelected(integer0 != null);
        View view0 = kphotopickerItemPhotoPickerBinding0.gif;
        if(mediaItem$Photo0.isGif()) {
            v1 = 0;
        }
        view0.setVisibility(v1);
        Intrinsics.checkNotNullExpressionValue(kphotopickerItemPhotoPickerBinding0.layerIndex, "layerIndex");
        Intrinsics.checkNotNullExpressionValue(this.itemView, "itemView");
        PickerAdapterKt.setWidthHeightByParent(kphotopickerItemPhotoPickerBinding0.layerIndex, this.itemView, 0.5f);
        Intrinsics.checkNotNullExpressionValue(kphotopickerItemPhotoPickerBinding0.image, "image");
        bitmapLoader0.loadGridImage(kphotopickerItemPhotoPickerBinding0.image, mediaItem$Photo0);
        a a0 = new a(this, v, 0);
        this.itemView.setOnClickListener(a0);
        a a1 = new a(this, v, 1);
        kphotopickerItemPhotoPickerBinding0.layerIndex.setOnClickListener(a1);
        String s1 = DateTimeUtil.INSTANCE.getDateTimeWithTimeStamp(mediaItem$Photo0.getDataTaken());
        if(integer0 == null) {
            FrameLayout frameLayout1 = kphotopickerItemPhotoPickerBinding0.getRoot();
            Intrinsics.checkNotNullExpressionValue(frameLayout1, "getRoot(...)");
            ContentDescriptionKt.setContentDescriptionWith(frameLayout1, string.cd_photo_unselected, new Object[]{s1});
        }
        else {
            z = true;
            FrameLayout frameLayout0 = kphotopickerItemPhotoPickerBinding0.getRoot();
            Intrinsics.checkNotNullExpressionValue(frameLayout0, "getRoot(...)");
            ContentDescriptionKt.setContentDescriptionWith(frameLayout0, string.cd_photo_selected, new Object[]{integer0, s1});
        }
        FrameLayout frameLayout2 = kphotopickerItemPhotoPickerBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "getRoot(...)");
        ContentDescriptionKt.applyAccessibilityInfo$default(frameLayout2, Reflection.getOrCreateKotlinClass(Button.class), null, ((int)(z ? string.cd_unselect : string.cd_select)), CollectionsKt__CollectionsKt.listOf(new CustomAction[]{new CustomAction(id.accessibility_custom_action_0, (z ? string.action_unselect : string.action_select), new b(this)), new CustomAction(id.accessibility_custom_action_1, string.action_show_large_image, new c(this))}), 2, null);
    }

    @Nullable
    public final ItemClickListener getItemClickListener() {
        return this.d;
    }
}

