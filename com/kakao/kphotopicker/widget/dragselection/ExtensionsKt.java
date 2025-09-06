package com.kakao.kphotopicker.widget.dragselection;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.DimenRes;
import androidx.annotation.Px;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0016\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001A\u00020\u0001H\u0001\u001A\u0014\u0010\u0004\u001A\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0000\u001A\u0018\u0010\b\u001A\u00020\t*\u000E\u0012\u0002\b\u00030\nj\u0006\u0012\u0002\b\u0003`\u000BH\u0000*\u001E\b\u0000\u0010\f\u001A\u0004\b\u0000\u0010\r\"\b\u0012\u0004\u0012\u0002H\r0\n2\b\u0012\u0004\u0012\u0002H\r0\n¨\u0006\u000E"}, d2 = {"dimen", "", "Landroid/content/Context;", "res", "getItemPosition", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroid/view/MotionEvent;", "isEmpty", "", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kakao/kphotopicker/widget/dragselection/ListAdapter;", "ListAdapter", "T", "kphotopicker_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ExtensionsKt {
    @Px
    public static final int dimen(@NotNull Context context0, @DimenRes int v) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        return context0.getResources().getDimensionPixelSize(v);
    }

    public static final int getItemPosition(@NotNull RecyclerView recyclerView0, @NotNull MotionEvent motionEvent0) {
        Intrinsics.checkNotNullParameter(recyclerView0, "<this>");
        Intrinsics.checkNotNullParameter(motionEvent0, "e");
        View view0 = recyclerView0.findChildViewUnder(motionEvent0.getX(), motionEvent0.getY());
        return view0 == null ? -1 : recyclerView0.getChildAdapterPosition(view0);
    }

    public static final boolean isEmpty(@NotNull Adapter recyclerView$Adapter0) {
        Intrinsics.checkNotNullParameter(recyclerView$Adapter0, "<this>");
        return recyclerView$Adapter0.getItemCount() == 0;
    }
}

