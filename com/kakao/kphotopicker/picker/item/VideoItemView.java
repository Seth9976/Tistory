package com.kakao.kphotopicker.picker.item;

import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.R.id;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.R.string;
import com.kakao.kphotopicker.databinding.KphotopickerItemVideoPickerBinding;
import com.kakao.kphotopicker.loader.BitmapLoader;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import com.kakao.kphotopicker.util.DateTimeUtil;
import com.kakao.kphotopicker.widget.ContentDescriptionKt;
import com.kakao.kphotopicker.widget.CustomAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import nb.f;
import nb.g;
import nb.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\'\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\r\u001A\u0004\u0018\u00010\f¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/kakao/kphotopicker/picker/item/VideoItemView;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/kakao/kphotopicker/databinding/KphotopickerItemVideoPickerBinding;", "binding", "Lcom/kakao/kphotopicker/ItemClickListener;", "itemClickListener", "<init>", "(Lcom/kakao/kphotopicker/databinding/KphotopickerItemVideoPickerBinding;Lcom/kakao/kphotopicker/ItemClickListener;)V", "Lcom/kakao/kphotopicker/picker/MediaItem$Video;", "video", "Lcom/kakao/kphotopicker/loader/BitmapLoader;", "bitmapLoader", "", "selectedNo", "", "bind", "(Lcom/kakao/kphotopicker/picker/MediaItem$Video;Lcom/kakao/kphotopicker/loader/BitmapLoader;Ljava/lang/Integer;)V", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class VideoItemView extends ViewHolder {
    public final KphotopickerItemVideoPickerBinding c;
    public final ItemClickListener d;
    public static final int e;

    public VideoItemView(@NotNull KphotopickerItemVideoPickerBinding kphotopickerItemVideoPickerBinding0, @Nullable ItemClickListener itemClickListener0) {
        Intrinsics.checkNotNullParameter(kphotopickerItemVideoPickerBinding0, "binding");
        super(kphotopickerItemVideoPickerBinding0.getRoot());
        this.c = kphotopickerItemVideoPickerBinding0;
        this.d = itemClickListener0;
    }

    public final void bind(@NotNull Video mediaItem$Video0, @NotNull BitmapLoader bitmapLoader0, @Nullable Integer integer0) {
        String s;
        Intrinsics.checkNotNullParameter(mediaItem$Video0, "video");
        Intrinsics.checkNotNullParameter(bitmapLoader0, "bitmapLoader");
        KphotopickerItemVideoPickerBinding kphotopickerItemVideoPickerBinding0 = this.c;
        boolean z = false;
        kphotopickerItemVideoPickerBinding0.border.setVisibility((integer0 == null ? 8 : 0));
        TextView textView0 = kphotopickerItemVideoPickerBinding0.index;
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
        kphotopickerItemVideoPickerBinding0.indexBg.setSelected(integer0 != null);
        Intrinsics.checkNotNullExpressionValue(kphotopickerItemVideoPickerBinding0.layerIndex, "layerIndex");
        Intrinsics.checkNotNullExpressionValue(this.itemView, "itemView");
        PickerAdapterKt.setWidthHeightByParent(kphotopickerItemVideoPickerBinding0.layerIndex, this.itemView, 0.5f);
        f f0 = new f(this, 0);
        this.itemView.setOnClickListener(f0);
        f f1 = new f(this, 1);
        kphotopickerItemVideoPickerBinding0.layerIndex.setOnClickListener(f1);
        Intrinsics.checkNotNullExpressionValue(kphotopickerItemVideoPickerBinding0.image, "image");
        bitmapLoader0.loadGridImage(kphotopickerItemVideoPickerBinding0.image, mediaItem$Video0);
        int v = mediaItem$Video0.getDuration();
        int v1 = v / 1000 / 3600;
        int v2 = v / 1000 / 60 % 60;
        int v3 = v / 1000 % 60;
        String s1 = v1 > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{v1, v2, v3}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{v2, v3}, 2));
        Intrinsics.checkNotNullExpressionValue(s1, "format(...)");
        kphotopickerItemVideoPickerBinding0.videoDurationText.setText(s1);
        Triple triple0 = new Triple(v1, v2, v3);
        String s2 = DateTimeUtil.INSTANCE.getDateTimeWithTimeStamp(mediaItem$Video0.getDataTaken());
        if(integer0 != null) {
            z = true;
        }
        ArrayList arrayList0 = new ArrayList();
        if(((Number)triple0.getFirst()).intValue() > 0) {
            String s3 = kphotopickerItemVideoPickerBinding0.getRoot().getResources().getString(string.cd_duration_hours, new Object[]{triple0.getFirst()});
            Intrinsics.checkNotNullExpressionValue(s3, "getString(...)");
            arrayList0.add(s3);
        }
        if(((Number)triple0.getSecond()).intValue() > 0) {
            String s4 = kphotopickerItemVideoPickerBinding0.getRoot().getResources().getString(string.cd_duration_minutes, new Object[]{triple0.getSecond()});
            Intrinsics.checkNotNullExpressionValue(s4, "getString(...)");
            arrayList0.add(s4);
        }
        String s5 = kphotopickerItemVideoPickerBinding0.getRoot().getResources().getString(string.cd_duration_seconds, new Object[]{triple0.getThird()});
        Intrinsics.checkNotNullExpressionValue(s5, "getString(...)");
        arrayList0.add(s5);
        if(z) {
            FrameLayout frameLayout0 = kphotopickerItemVideoPickerBinding0.getRoot();
            Intrinsics.checkNotNullExpressionValue(frameLayout0, "getRoot(...)");
            ContentDescriptionKt.setContentDescriptionWith(frameLayout0, string.cd_video_selected_with_playtime, new Object[]{integer0, s2, arrayList0});
        }
        else {
            FrameLayout frameLayout1 = kphotopickerItemVideoPickerBinding0.getRoot();
            Intrinsics.checkNotNullExpressionValue(frameLayout1, "getRoot(...)");
            ContentDescriptionKt.setContentDescriptionWith(frameLayout1, string.cd_video_unselected_with_playtime, new Object[]{s2, arrayList0});
        }
        FrameLayout frameLayout2 = kphotopickerItemVideoPickerBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "getRoot(...)");
        ContentDescriptionKt.applyAccessibilityInfo$default(frameLayout2, Reflection.getOrCreateKotlinClass(Button.class), null, ((int)(z ? string.cd_unselect : string.cd_select)), CollectionsKt__CollectionsKt.listOf(new CustomAction[]{new CustomAction(id.accessibility_custom_action_0, (z ? string.action_unselect : string.action_select), new g(this)), new CustomAction(id.accessibility_custom_action_1, string.action_show_large_image, new h(this))}), 2, null);
    }
}

