package com.kakao.kphotopicker.picker.folder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.PickerViewModel;
import com.kakao.kphotopicker.databinding.KphotopickerItemFolderPickerBinding;
import com.kakao.kphotopicker.loader.BitmapLoader;
import com.kakao.kphotopicker.picker.Folder;
import com.kakao.kphotopicker.widget.ContentDescriptionKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\u000B\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001F\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0010\u001A\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001E\u001A\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"Lcom/kakao/kphotopicker/picker/folder/FolderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/kakao/kphotopicker/PickerViewModel;", "pickerViewModel", "<init>", "(Lcom/kakao/kphotopicker/PickerViewModel;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lcom/kakao/kphotopicker/picker/Folder;", "getFolder", "(I)Lcom/kakao/kphotopicker/picker/Folder;", "Lcom/kakao/kphotopicker/ItemClickListener;", "h", "Lcom/kakao/kphotopicker/ItemClickListener;", "getItemClickListener", "()Lcom/kakao/kphotopicker/ItemClickListener;", "setItemClickListener", "(Lcom/kakao/kphotopicker/ItemClickListener;)V", "itemClickListener", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FolderAdapter extends Adapter {
    public final PickerViewModel g;
    public ItemClickListener h;
    public final BitmapLoader i;

    public FolderAdapter(@NotNull PickerViewModel pickerViewModel0) {
        Intrinsics.checkNotNullParameter(pickerViewModel0, "pickerViewModel");
        super();
        this.g = pickerViewModel0;
        this.i = new BitmapLoader();
    }

    public final List a() {
        List list0 = (List)this.g.getFolderItemList().getValue();
        return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
    }

    @NotNull
    public final Folder getFolder(int v) {
        return (Folder)this.a().get(v);
    }

    @Nullable
    public final ItemClickListener getItemClickListener() {
        return this.h;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a().size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof FolderItemView) {
            ((FolderItemView)recyclerView$ViewHolder0).bind(((Folder)this.a().get(v)), this.i);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        KphotopickerItemFolderPickerBinding kphotopickerItemFolderPickerBinding0 = KphotopickerItemFolderPickerBinding.inflate(LayoutInflater.from(viewGroup0.getContext()), viewGroup0, false);
        Intrinsics.checkNotNullExpressionValue(kphotopickerItemFolderPickerBinding0, "inflate(...)");
        ViewHolder recyclerView$ViewHolder0 = new FolderItemView(kphotopickerItemFolderPickerBinding0, this.h);
        Intrinsics.checkNotNullExpressionValue(recyclerView$ViewHolder0.itemView, "itemView");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(Button.class);
        ContentDescriptionKt.applyAccessibilityInfo$default(recyclerView$ViewHolder0.itemView, kClass0, null, null, null, 14, null);
        return recyclerView$ViewHolder0;
    }

    public final void setItemClickListener(@Nullable ItemClickListener itemClickListener0) {
        this.h = itemClickListener0;
    }
}

