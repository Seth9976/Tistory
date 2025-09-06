package com.kakao.keditor.internal;

import androidx.recyclerview.widget.RecyclerView.Adapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J+\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\r\u001A\u00020\f2\u0012\u0010\u000E\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000F\"\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0011\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\fH\u0016J\u0016\u0010\u0015\u001A\u00028\u00002\u0006\u0010\u0016\u001A\u00020\fH\u0086\u0004¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001A\u00020\fH\u0016J\u0018\u0010\u0019\u001A\u0004\u0018\u00018\u00002\u0006\u0010\u0016\u001A\u00020\fH\u0086\u0004¢\u0006\u0002\u0010\u0017J\u0013\u0010\u001A\u001A\u00020\f2\u0006\u0010\u0013\u001A\u00028\u0000¢\u0006\u0002\u0010\u001BJ\u0011\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u0016\u001A\u00020\fH\u0086\u0004J\u000B\u0010\u001E\u001A\u00028\u0000¢\u0006\u0002\u0010\u001FJ\u001D\u0010 \u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u0013\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u0017\u0010\"\u001A\u00020\u00122\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000#H\u0086\u0004R\u0014\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00078F¢\u0006\u0006\u001A\u0004\b\t\u0010\n¨\u0006$"}, d2 = {"Lcom/kakao/keditor/internal/BaseAdapter;", "T", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "data", "", "items", "getItems", "()Ljava/util/List;", "add", "", "position", "addItems", "", "(I[Ljava/lang/Object;)I", "delete", "", "item", "(Ljava/lang/Object;)V", "get", "index", "(I)Ljava/lang/Object;", "getItemCount", "getOrNull", "indexOf", "(Ljava/lang/Object;)I", "isValidIndex", "", "last", "()Ljava/lang/Object;", "setItem", "(ILjava/lang/Object;)V", "setItems", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class BaseAdapter extends Adapter {
    @NotNull
    private final List data;

    public BaseAdapter() {
        this.data = new ArrayList();
    }

    public int add(int v, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "addItems");
        Collection collection0 = ArraysKt___ArraysKt.toList(arr_object);
        this.data.addAll(v, collection0);
        this.notifyItemRangeInserted(v, arr_object.length);
        return v;
    }

    public static int add$default(BaseAdapter baseAdapter0, int v, Object[] arr_object, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
        }
        if((v1 & 1) != 0) {
            v = baseAdapter0.data.size() - 1;
        }
        return baseAdapter0.add(v, arr_object);
    }

    public void delete(int v) {
        this.data.remove(v);
        this.notifyItemRemoved(v);
    }

    public void delete(Object object0) {
        this.delete(this.data.indexOf(object0));
    }

    public final Object get(int v) {
        return this.getItems().get(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.getItems().size();
    }

    @NotNull
    public final List getItems() {
        return this.data;
    }

    @Nullable
    public final Object getOrNull(int v) {
        return CollectionsKt___CollectionsKt.getOrNull(this.getItems(), v);
    }

    // 去混淆评级： 低(20)
    public final int indexOf(Object object0) {
        return this.data.contains(object0) ? this.data.indexOf(object0) : -1;
    }

    public final boolean isValidIndex(int v) {
        return v >= 0 && v <= CollectionsKt__CollectionsKt.getLastIndex(this.getItems());
    }

    public final Object last() {
        return this.getItems().get(CollectionsKt__CollectionsKt.getLastIndex(this.getItems()));
    }

    public void setItem(int v, Object object0) {
        this.data.set(v, object0);
        this.notifyItemChanged(v);
    }

    public final void setItems(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "items");
        this.data.clear();
        this.data.addAll(list0);
        this.notifyDataSetChanged();
    }
}

