package com.kakao.keditor.plugin.itemspec;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.dimen;
import com.kakao.keditor.internal.KeditorAdapter;
import com.kakao.keditor.widget.KeditorEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\b\u001A\u0004\u0018\u00010\tH\u0016J\n\u0010\n\u001A\u0004\u0018\u00010\u000BH\u0016J\u0012\u0010\f\u001A\u0004\u0018\u00010\r2\u0006\u0010\u000E\u001A\u00020\u000FH\u0016J!\u0010\u0010\u001A\u0004\u0018\u0001H\u0011\"\b\b\u0000\u0010\u0011*\u00020\u00122\u0006\u0010\u000E\u001A\u00020\u000FH\u0016¢\u0006\u0002\u0010\u0013J\u0012\u0010\u0010\u001A\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001A\u00020\u0003H\u0016J\u0017\u0010\u0015\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u000E\u001A\u00020\u000FH\u0016¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u001AH\u0016J5\u0010\u001B\u001A\u0004\u0018\u00010\u001C\"\b\b\u0000\u0010\u0011*\u00020\u00122\u0006\u0010\u000E\u001A\u00020\u000F2\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00020\u001C0\u001EH\u0016¢\u0006\u0002\u0010\u001FJ+\u0010 \u001A\u0004\u0018\u00010\u001C2\u0006\u0010\u000E\u001A\u00020\u000F2\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001C0\u001EH\u0016¢\u0006\u0002\u0010\u001FJ\u0010\u0010!\u001A\u00020\u00032\u0006\u0010\"\u001A\u00020\u0012H\u0016J\u0018\u0010#\u001A\u00020\u001C2\u0006\u0010$\u001A\u00020%2\u0006\u0010&\u001A\u00020\u0003H\u0016R\u0018\u0010\u0002\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\'"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/KeditorBridge;", "", "editorId", "", "getEditorId", "()I", "setEditorId", "(I)V", "findActivity", "Landroid/app/Activity;", "findKeditorView", "Lcom/kakao/keditor/KeditorView;", "getHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "getItem", "T", "Lcom/kakao/keditor/KeditorItem;", "(Landroid/view/View;)Lcom/kakao/keditor/KeditorItem;", "position", "getPosition", "(Landroid/view/View;)Ljava/lang/Integer;", "hasItemSpec", "", "type", "", "ifFoundItem", "", "block", "Lkotlin/Function1;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;", "ifFoundPosition", "indexOf", "item", "renderEditTextScrollToOffset", "keItemEdit", "Lcom/kakao/keditor/widget/KeditorEditText;", "offset", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface KeditorBridge {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Nullable
        public static Activity findActivity(@NotNull KeditorBridge keditorBridge0) {
            KeditorView keditorView0 = keditorBridge0.findKeditorView();
            Context context0 = keditorView0 == null ? null : keditorView0.getContext();
            return context0 instanceof Activity ? ((Activity)context0) : null;
        }

        @Nullable
        public static KeditorView findKeditorView(@NotNull KeditorBridge keditorBridge0) {
            int v = keditorBridge0.getEditorId();
            return Keditor.INSTANCE.findKeditorView(v);
        }

        @Nullable
        public static ViewHolder getHolder(@NotNull KeditorBridge keditorBridge0, @NotNull View view0) {
            Intrinsics.checkNotNullParameter(view0, "view");
            KeditorView keditorView0 = keditorBridge0.findKeditorView();
            return keditorView0 == null ? null : keditorView0.getChildViewHolder(view0);
        }

        @Nullable
        public static KeditorItem getItem(@NotNull KeditorBridge keditorBridge0, int v) {
            KeditorView keditorView0 = keditorBridge0.findKeditorView();
            return keditorView0 == null ? null : keditorView0.getItem$keditor_release(v);
        }

        @Nullable
        public static KeditorItem getItem(@NotNull KeditorBridge keditorBridge0, @NotNull View view0) {
            Intrinsics.checkNotNullParameter(view0, "view");
            Integer integer0 = keditorBridge0.getPosition(view0);
            if(integer0 != null) {
                int v = integer0.intValue();
                if(v != -1) {
                    KeditorView keditorView0 = keditorBridge0.findKeditorView();
                    KeditorItem keditorItem0 = keditorView0 == null ? null : keditorView0.getItem$keditor_release(v);
                    return keditorItem0 == null ? null : keditorItem0;
                }
            }
            return null;
        }

        @Nullable
        public static Integer getPosition(@NotNull KeditorBridge keditorBridge0, @NotNull View view0) {
            Intrinsics.checkNotNullParameter(view0, "view");
            ViewHolder recyclerView$ViewHolder0 = keditorBridge0.getHolder(view0);
            Integer integer0 = null;
            if(recyclerView$ViewHolder0 != null) {
                KeditorView keditorView0 = keditorBridge0.findKeditorView();
                Adapter recyclerView$Adapter0 = keditorView0 == null ? null : keditorView0.getAdapter();
                if(recyclerView$Adapter0 instanceof KeditorAdapter) {
                    integer0 = (KeditorAdapter)recyclerView$Adapter0;
                }
                return integer0 == null ? -1 : ((KeditorAdapter)integer0).itemIndexAt(recyclerView$ViewHolder0.getAdapterPosition());
            }
            return null;
        }

        public static boolean hasItemSpec(@NotNull KeditorBridge keditorBridge0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "type");
            KeditorView keditorView0 = keditorBridge0.findKeditorView();
            if(keditorView0 != null) {
                ItemSpecs itemSpecs0 = keditorView0.getItemSpecs();
                return itemSpecs0 == null ? false : itemSpecs0.hasType(s);
            }
            return false;
        }

        @Nullable
        public static Unit ifFoundItem(@NotNull KeditorBridge keditorBridge0, @NotNull View view0, @NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(view0, "view");
            Intrinsics.checkNotNullParameter(function10, "block");
            KeditorItem keditorItem0 = keditorBridge0.getItem(view0);
            if(keditorItem0 != null) {
                function10.invoke(keditorItem0);
                return Unit.INSTANCE;
            }
            return null;
        }

        @Nullable
        public static Unit ifFoundPosition(@NotNull KeditorBridge keditorBridge0, @NotNull View view0, @NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(view0, "view");
            Intrinsics.checkNotNullParameter(function10, "block");
            Integer integer0 = keditorBridge0.getPosition(view0);
            if(integer0 != null) {
                function10.invoke(integer0);
                return Unit.INSTANCE;
            }
            return null;
        }

        public static int indexOf(@NotNull KeditorBridge keditorBridge0, @NotNull KeditorItem keditorItem0) {
            Intrinsics.checkNotNullParameter(keditorItem0, "item");
            KeditorView keditorView0 = keditorBridge0.findKeditorView();
            return keditorView0 == null ? -1 : keditorView0.indexOf$keditor_release(keditorItem0);
        }

        public static void renderEditTextScrollToOffset(@NotNull KeditorBridge keditorBridge0, @NotNull KeditorEditText keditorEditText0, int v) {
            Intrinsics.checkNotNullParameter(keditorEditText0, "keItemEdit");
            int[] arr_v = new int[2];
            int[] arr_v1 = new int[2];
            Rect rect0 = new Rect();
            Layout layout0 = keditorEditText0.getLayout();
            layout0.getLineBounds(layout0.getLineForOffset(v), rect0);
            KeditorView keditorView0 = keditorBridge0.findKeditorView();
            if(keditorView0 != null) {
                keditorView0.getLocationInWindow(arr_v);
                keditorEditText0.getLocationInWindow(arr_v1);
                int v1 = arr_v[1];
                int v2 = keditorView0.getHeight();
                int v3 = keditorView0.getResources().getDimensionPixelSize(dimen.ke_grammar_height_offset);
                keditorView0.scrollBy(0, arr_v1[1] + rect0.bottom - (v2 + v1 - v3));
            }
        }
    }

    @Nullable
    Activity findActivity();

    @Nullable
    KeditorView findKeditorView();

    int getEditorId();

    @Nullable
    ViewHolder getHolder(@NotNull View arg1);

    @Nullable
    KeditorItem getItem(int arg1);

    @Nullable
    KeditorItem getItem(@NotNull View arg1);

    @Nullable
    Integer getPosition(@NotNull View arg1);

    boolean hasItemSpec(@NotNull String arg1);

    @Nullable
    Unit ifFoundItem(@NotNull View arg1, @NotNull Function1 arg2);

    @Nullable
    Unit ifFoundPosition(@NotNull View arg1, @NotNull Function1 arg2);

    int indexOf(@NotNull KeditorItem arg1);

    void renderEditTextScrollToOffset(@NotNull KeditorEditText arg1, int arg2);

    void setEditorId(int arg1);
}

