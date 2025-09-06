package com.kakao.kphotopicker.picker.selected;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.R.string;
import com.kakao.kphotopicker.databinding.KphotopickerItemSelectedPickerBinding;
import com.kakao.kphotopicker.loader.BitmapLoader;
import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import com.kakao.kphotopicker.picker.MediaItem;
import com.kakao.kphotopicker.util.DateTimeUtil;
import com.kakao.kphotopicker.widget.ContentDescriptionKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pb.a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000EJ%\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\r\u0010\u0011R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/kakao/kphotopicker/picker/selected/SelectedItemView;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/kakao/kphotopicker/databinding/KphotopickerItemSelectedPickerBinding;", "binding", "Lcom/kakao/kphotopicker/ItemClickListener;", "itemClickListener", "<init>", "(Lcom/kakao/kphotopicker/databinding/KphotopickerItemSelectedPickerBinding;Lcom/kakao/kphotopicker/ItemClickListener;)V", "Lcom/kakao/kphotopicker/picker/MediaItem;", "mediaItem", "Lcom/kakao/kphotopicker/loader/BitmapLoader;", "bitmapLoader", "", "bind", "(Lcom/kakao/kphotopicker/picker/MediaItem;Lcom/kakao/kphotopicker/loader/BitmapLoader;)V", "", "position", "(Lcom/kakao/kphotopicker/picker/MediaItem;Lcom/kakao/kphotopicker/loader/BitmapLoader;I)V", "d", "Lcom/kakao/kphotopicker/ItemClickListener;", "getItemClickListener", "()Lcom/kakao/kphotopicker/ItemClickListener;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SelectedItemView extends ViewHolder {
    public final KphotopickerItemSelectedPickerBinding c;
    public final ItemClickListener d;
    public static final int e;

    public SelectedItemView(@NotNull KphotopickerItemSelectedPickerBinding kphotopickerItemSelectedPickerBinding0, @Nullable ItemClickListener itemClickListener0) {
        Intrinsics.checkNotNullParameter(kphotopickerItemSelectedPickerBinding0, "binding");
        super(kphotopickerItemSelectedPickerBinding0.getRoot());
        this.c = kphotopickerItemSelectedPickerBinding0;
        this.d = itemClickListener0;
    }

    public final void bind(@NotNull MediaItem mediaItem0, @NotNull BitmapLoader bitmapLoader0) {
        Intrinsics.checkNotNullParameter(mediaItem0, "mediaItem");
        Intrinsics.checkNotNullParameter(bitmapLoader0, "bitmapLoader");
        a a0 = new a(this, 0);
        this.c.unpick.setOnClickListener(a0);
        Intrinsics.checkNotNullExpressionValue(this.c.image, "image");
        bitmapLoader0.loadGridImage(this.c.image, mediaItem0);
    }

    public final void bind(@NotNull MediaItem mediaItem0, @NotNull BitmapLoader bitmapLoader0, int v) {
        int v2;
        Intrinsics.checkNotNullParameter(mediaItem0, "mediaItem");
        Intrinsics.checkNotNullParameter(bitmapLoader0, "bitmapLoader");
        this.bind(mediaItem0, bitmapLoader0);
        long v1 = mediaItem0.getDataTaken();
        String s = DateTimeUtil.INSTANCE.getDateTimeWithTimeStamp(v1);
        KphotopickerItemSelectedPickerBinding kphotopickerItemSelectedPickerBinding0 = this.c;
        View view0 = kphotopickerItemSelectedPickerBinding0.unpick;
        Intrinsics.checkNotNullExpressionValue(view0, "unpick");
        if(mediaItem0 instanceof Photo) {
            v2 = string.cd_picker_unpick_selected_photo;
        }
        else if(mediaItem0 instanceof Video) {
            v2 = string.cd_picker_unpick_selected_video;
        }
        else {
            throw new NoWhenBranchMatchedException();
        }
        ContentDescriptionKt.setContentDescriptionWith(view0, v2, new Object[]{((int)(v + 1))});
        Intrinsics.checkNotNullExpressionValue(kphotopickerItemSelectedPickerBinding0.unpick, "unpick");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(Button.class);
        ContentDescriptionKt.applyAccessibilityInfo$default(kphotopickerItemSelectedPickerBinding0.unpick, kClass0, s, null, null, 12, null);
        a a0 = new a(this, 1);
        kphotopickerItemSelectedPickerBinding0.unpick.setOnClickListener(a0);
        Intrinsics.checkNotNullExpressionValue(kphotopickerItemSelectedPickerBinding0.image, "image");
        bitmapLoader0.loadGridImage(kphotopickerItemSelectedPickerBinding0.image, mediaItem0);
    }

    @Nullable
    public final ItemClickListener getItemClickListener() {
        return this.d;
    }
}

