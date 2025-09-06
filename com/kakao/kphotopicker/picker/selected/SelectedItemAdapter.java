package com.kakao.kphotopicker.picker.selected;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil.Callback;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.databinding.KphotopickerItemSelectedPickerBinding;
import com.kakao.kphotopicker.loader.BitmapLoader;
import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import com.kakao.kphotopicker.picker.MediaItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\u000B\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001F\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001B\u0010\u0017\u001A\u00020\u00112\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR$\u0010$\u001A\u0004\u0018\u00010\u001D8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/kakao/kphotopicker/picker/selected/SelectedItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "", "Lcom/kakao/kphotopicker/picker/MediaItem;", "mediaList", "setData", "(Ljava/util/List;)V", "g", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/kakao/kphotopicker/ItemClickListener;", "j", "Lcom/kakao/kphotopicker/ItemClickListener;", "getItemClickListener", "()Lcom/kakao/kphotopicker/ItemClickListener;", "setItemClickListener", "(Lcom/kakao/kphotopicker/ItemClickListener;)V", "itemClickListener", "SelectedMediaDiffUtil", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SelectedItemAdapter extends Adapter {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\nJ\u001F\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u001F\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/kakao/kphotopicker/picker/selected/SelectedItemAdapter$SelectedMediaDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "", "Lcom/kakao/kphotopicker/picker/MediaItem;", "oldList", "newList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "getOldListSize", "()I", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "(II)Z", "areContentsTheSame", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SelectedMediaDiffUtil extends Callback {
        public final List a;
        public final List b;

        public SelectedMediaDiffUtil(@NotNull List list0, @NotNull List list1) {
            Intrinsics.checkNotNullParameter(list0, "oldList");
            Intrinsics.checkNotNullParameter(list1, "newList");
            super();
            this.a = list0;
            this.b = list1;
        }

        // 去混淆评级： 低(23)
        @Override  // androidx.recyclerview.widget.DiffUtil$Callback
        public boolean areContentsTheSame(int v, int v1) {
            MediaItem mediaItem0 = (MediaItem)this.b.get(v1);
            MediaItem mediaItem1 = (MediaItem)this.a.get(v);
            return !(mediaItem0 instanceof Photo) || !(mediaItem1 instanceof Photo) ? mediaItem0 instanceof Video && mediaItem1 instanceof Video && mediaItem0.getId() == mediaItem1.getId() && Intrinsics.areEqual(((Video)mediaItem0).getUri(), ((Video)mediaItem1).getUri()) : mediaItem0.getId() == mediaItem1.getId() && Intrinsics.areEqual(((Photo)mediaItem0).getUri(), ((Photo)mediaItem1).getUri()) && Intrinsics.areEqual(((Photo)mediaItem0).getEditedPath(), ((Photo)mediaItem1).getEditedPath());
        }

        @Override  // androidx.recyclerview.widget.DiffUtil$Callback
        public boolean areItemsTheSame(int v, int v1) {
            MediaItem mediaItem0 = (MediaItem)this.b.get(v1);
            MediaItem mediaItem1 = (MediaItem)this.a.get(v);
            return mediaItem0.getId() == mediaItem1.getId();
        }

        @Override  // androidx.recyclerview.widget.DiffUtil$Callback
        public int getNewListSize() {
            return this.b.size();
        }

        @Override  // androidx.recyclerview.widget.DiffUtil$Callback
        public int getOldListSize() {
            return this.a.size();
        }
    }

    public final Context g;
    public final ArrayList h;
    public final BitmapLoader i;
    public ItemClickListener j;

    public SelectedItemAdapter(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.g = context0;
        this.h = new ArrayList();
        this.i = new BitmapLoader();
    }

    @NotNull
    public final Context getContext() {
        return this.g;
    }

    @Nullable
    public final ItemClickListener getItemClickListener() {
        return this.j;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.h.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof SelectedItemView) {
            ((SelectedItemView)recyclerView$ViewHolder0).bind(((MediaItem)this.h.get(v)), this.i, v);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        KphotopickerItemSelectedPickerBinding kphotopickerItemSelectedPickerBinding0 = KphotopickerItemSelectedPickerBinding.inflate(LayoutInflater.from(viewGroup0.getContext()), viewGroup0, false);
        Intrinsics.checkNotNullExpressionValue(kphotopickerItemSelectedPickerBinding0, "inflate(...)");
        return new SelectedItemView(kphotopickerItemSelectedPickerBinding0, this.j);
    }

    public final void setData(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "mediaList");
        DiffResult diffUtil$DiffResult0 = DiffUtil.calculateDiff(new SelectedMediaDiffUtil(this.h, list0));
        Intrinsics.checkNotNullExpressionValue(diffUtil$DiffResult0, "calculateDiff(...)");
        this.h.clear();
        this.h.addAll(list0);
        diffUtil$DiffResult0.dispatchUpdatesTo(this);
    }

    public final void setItemClickListener(@Nullable ItemClickListener itemClickListener0) {
        this.j = itemClickListener0;
    }
}

