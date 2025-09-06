package com.kakao.keditor.plugin;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorItemKt;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.dimen;
import com.kakao.keditor.event.common.AddItem;
import com.kakao.keditor.internal.KeditorAdapter;
import com.kakao.keditor.plugin.pluginspec.PluginSpecs;
import com.kakao.keditor.request.FocusedRequest;
import com.kakao.keditor.widget.KeditorEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0000\u001A\u0010\u0010\u0000\u001A\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0002\u001A\u0010\u0010\u0003\u001A\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u0002\u001A\u0018\u0010\u0005\u001A\u0004\u0018\u00010\u0006*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001A\u00020\b\u001A)\u0010\t\u001A\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u000B*\b\u0012\u0004\u0012\u0002H\n0\u00022\u0006\u0010\u0007\u001A\u00020\b\u00A2\u0006\u0002\u0010\f\u001A\u001D\u0010\r\u001A\u0004\u0018\u00010\u000E*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001A\u00020\b\u00A2\u0006\u0002\u0010\u000F\u001A=\u0010\u0010\u001A\u0004\u0018\u00010\u0011\"\b\b\u0000\u0010\n*\u00020\u000B*\b\u0012\u0004\u0012\u0002H\n0\u00022\u0006\u0010\u0007\u001A\u00020\b2\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00110\u0013\u00A2\u0006\u0002\u0010\u0014\u001A1\u0010\u0015\u001A\u0004\u0018\u00010\u0011*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001A\u00020\b2\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u00110\u0013\u00A2\u0006\u0002\u0010\u0014\u001A\u001D\u0010\u0016\u001A\u0004\u0018\u00010\u000E*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0017\u001A\u00020\u000B\u00A2\u0006\u0002\u0010\u0018\u001A\"\u0010\u0019\u001A\u00020\u000E\"\b\b\u0000\u0010\n*\u00020\u000B*\b\u0012\u0004\u0012\u0002H\n0\u00022\u0006\u0010\u001A\u001A\u00020\u001B\u001A?\u0010\u0019\u001A\u00020\u000E\"\b\b\u0000\u0010\n*\u00020\u000B*\b\u0012\u0004\u0012\u0002H\n0\u00022\u0006\u0010\u001C\u001A\u00020\u000E2\u0016\u0010\u001D\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\n0\u001E\"\u0004\u0018\u0001H\n\u00A2\u0006\u0002\u0010\u001F\u001A)\u0010 \u001A\u00020\u000E\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u000B*\b\u0012\u0004\u0012\u0002H\n0\u00022\b\b\u0002\u0010!\u001A\u00020\u000EH\u0086\b\u001A*\u0010\"\u001A\u00020\u0011\"\b\b\u0000\u0010\n*\u00020#*\b\u0012\u0004\u0012\u0002H\n0\u00022\u0006\u0010$\u001A\u00020%2\u0006\u0010&\u001A\u00020\u000E\u001A\u001A\u0010\'\u001A\u00020(*\u0012\u0012\u000E\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000B0\u00020)\u00A8\u0006*"}, d2 = {"findActivity", "Landroid/app/Activity;", "Lcom/kakao/keditor/plugin/KeditorPlugin;", "findKeditorView", "Lcom/kakao/keditor/KeditorView;", "getHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "getItem", "T", "Lcom/kakao/keditor/KeditorItem;", "(Lcom/kakao/keditor/plugin/KeditorPlugin;Landroid/view/View;)Lcom/kakao/keditor/KeditorItem;", "getPosition", "", "(Lcom/kakao/keditor/plugin/KeditorPlugin;Landroid/view/View;)Ljava/lang/Integer;", "ifFoundItem", "", "block", "Lkotlin/Function1;", "(Lcom/kakao/keditor/plugin/KeditorPlugin;Landroid/view/View;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;", "ifFoundPosition", "indexOf", "item", "(Lcom/kakao/keditor/plugin/KeditorPlugin;Lcom/kakao/keditor/KeditorItem;)Ljava/lang/Integer;", "insert", "focusedRequest", "Lcom/kakao/keditor/request/FocusedRequest;", "position", "items", "", "(Lcom/kakao/keditor/plugin/KeditorPlugin;I[Lcom/kakao/keditor/KeditorItem;)I", "pluginId", "ifNotFound", "renderEditTextScrollToOffset", "Lcom/kakao/keditor/plugin/itemspec/paragraph/TextItem;", "keItemEdit", "Lcom/kakao/keditor/widget/KeditorEditText;", "offset", "type", "", "Ljava/lang/Class;", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeditorPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeditorPlugin.kt\ncom/kakao/keditor/plugin/KeditorPluginKt\n+ 2 KeditorView.kt\ncom/kakao/keditor/KeditorView\n*L\n1#1,85:1\n832#2:86\n*S KotlinDebug\n*F\n+ 1 KeditorPlugin.kt\ncom/kakao/keditor/plugin/KeditorPluginKt\n*L\n36#1:86\n*E\n"})
public final class KeditorPluginKt {
    @Nullable
    public static final Activity findActivity(@NotNull KeditorPlugin keditorPlugin0) {
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        KeditorView keditorView0 = KeditorPluginKt.findKeditorView(keditorPlugin0);
        Context context0 = keditorView0 == null ? null : keditorView0.getContext();
        return context0 instanceof Activity ? ((Activity)context0) : null;
    }

    @Nullable
    public static final KeditorView findKeditorView(@NotNull KeditorPlugin keditorPlugin0) {
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        return Keditor.INSTANCE.findKeditorView(keditorPlugin0.getEditorId());
    }

    @Nullable
    public static final ViewHolder getHolder(@NotNull KeditorPlugin keditorPlugin0, @NotNull View view0) {
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        Intrinsics.checkNotNullParameter(view0, "view");
        KeditorView keditorView0 = KeditorPluginKt.findKeditorView(keditorPlugin0);
        return keditorView0 == null ? null : keditorView0.getChildViewHolder(view0);
    }

    @Nullable
    public static final KeditorItem getItem(@NotNull KeditorPlugin keditorPlugin0, @NotNull View view0) {
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        Intrinsics.checkNotNullParameter(view0, "view");
        Integer integer0 = KeditorPluginKt.getPosition(keditorPlugin0, view0);
        if(integer0 != null) {
            int v = integer0.intValue();
            if(v != -1) {
                KeditorView keditorView0 = KeditorPluginKt.findKeditorView(keditorPlugin0);
                KeditorItem keditorItem0 = keditorView0 == null ? null : keditorView0.getItem$keditor_release(v);
                return keditorItem0 == null ? null : keditorItem0;
            }
        }
        return null;
    }

    @Nullable
    public static final Integer getPosition(@NotNull KeditorPlugin keditorPlugin0, @NotNull View view0) {
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        Intrinsics.checkNotNullParameter(view0, "view");
        ViewHolder recyclerView$ViewHolder0 = KeditorPluginKt.getHolder(keditorPlugin0, view0);
        Integer integer0 = null;
        if(recyclerView$ViewHolder0 != null) {
            KeditorView keditorView0 = KeditorPluginKt.findKeditorView(keditorPlugin0);
            Adapter recyclerView$Adapter0 = keditorView0 == null ? null : keditorView0.getAdapter();
            if(recyclerView$Adapter0 instanceof KeditorAdapter) {
                integer0 = (KeditorAdapter)recyclerView$Adapter0;
            }
            return integer0 == null ? -1 : ((KeditorAdapter)integer0).itemIndexAt(recyclerView$ViewHolder0.getAdapterPosition());
        }
        return null;
    }

    @Nullable
    public static final Unit ifFoundItem(@NotNull KeditorPlugin keditorPlugin0, @NotNull View view0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(function10, "block");
        KeditorItem keditorItem0 = KeditorPluginKt.getItem(keditorPlugin0, view0);
        if(keditorItem0 != null) {
            function10.invoke(keditorItem0);
            return Unit.INSTANCE;
        }
        return null;
    }

    @Nullable
    public static final Unit ifFoundPosition(@NotNull KeditorPlugin keditorPlugin0, @NotNull View view0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(function10, "block");
        Integer integer0 = KeditorPluginKt.getPosition(keditorPlugin0, view0);
        if(integer0 != null) {
            function10.invoke(integer0);
            return Unit.INSTANCE;
        }
        return null;
    }

    @Nullable
    public static final Integer indexOf(@NotNull KeditorPlugin keditorPlugin0, @NotNull KeditorItem keditorItem0) {
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        KeditorView keditorView0 = KeditorPluginKt.findKeditorView(keditorPlugin0);
        return keditorView0 == null ? null : keditorView0.indexOf$keditor_release(keditorItem0);
    }

    public static final int insert(@NotNull KeditorPlugin keditorPlugin0, int v, @NotNull KeditorItem[] arr_keditorItem) {
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        Intrinsics.checkNotNullParameter(arr_keditorItem, "items");
        int v2 = 1;
        for(int v1 = 0; v1 < arr_keditorItem.length; ++v1) {
            KeditorItem keditorItem0 = arr_keditorItem[v1];
            if(keditorItem0 != null) {
                keditorPlugin0.post(new AddItem(((int)(v + v2)), keditorItem0, false, 4, null));
                Integer integer0 = KeditorPluginKt.indexOf(keditorPlugin0, keditorItem0);
                if(integer0 != null) {
                    v2 = (int)integer0;
                }
                ++v2;
            }
        }
        return v + v2;
    }

    public static final int insert(@NotNull KeditorPlugin keditorPlugin0, @NotNull FocusedRequest focusedRequest0) {
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        Intrinsics.checkNotNullParameter(focusedRequest0, "focusedRequest");
        int v = focusedRequest0.getFocusedPosition();
        KeditorItem keditorItem0 = focusedRequest0.getFocusedItem();
        if(keditorItem0 == null) {
            keditorItem0 = null;
        }
        return KeditorPluginKt.insert(keditorPlugin0, v, new KeditorItem[]{keditorItem0});
    }

    public static final int pluginId(KeditorPlugin keditorPlugin0, int v) {
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        KeditorView keditorView0 = KeditorPluginKt.findKeditorView(keditorPlugin0);
        if(keditorView0 != null) {
            PluginSpecs pluginSpecs0 = keditorView0.getPluginSpecs();
            Intrinsics.reifiedOperationMarker(4, "T");
            return pluginSpecs0.pluginId(KeditorItemKt.type(KeditorItem.class));
        }
        return v;
    }

    public static int pluginId$default(KeditorPlugin keditorPlugin0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = -1;
        }
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        KeditorView keditorView0 = KeditorPluginKt.findKeditorView(keditorPlugin0);
        if(keditorView0 != null) {
            PluginSpecs pluginSpecs0 = keditorView0.getPluginSpecs();
            Intrinsics.reifiedOperationMarker(4, "T");
            return pluginSpecs0.pluginId(KeditorItemKt.type(KeditorItem.class));
        }
        return v;
    }

    public static final void renderEditTextScrollToOffset(@NotNull KeditorPlugin keditorPlugin0, @NotNull KeditorEditText keditorEditText0, int v) {
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        Intrinsics.checkNotNullParameter(keditorEditText0, "keItemEdit");
        int[] arr_v = new int[2];
        int[] arr_v1 = new int[2];
        Rect rect0 = new Rect();
        Layout layout0 = keditorEditText0.getLayout();
        layout0.getLineBounds(layout0.getLineForOffset(v), rect0);
        KeditorView keditorView0 = KeditorPluginKt.findKeditorView(keditorPlugin0);
        if(keditorView0 != null) {
            keditorView0.getLocationInWindow(arr_v);
            keditorEditText0.getLocationInWindow(arr_v1);
            int v1 = arr_v[1];
            int v2 = keditorView0.getHeight();
            int v3 = keditorView0.getResources().getDimensionPixelSize(dimen.ke_grammar_height_offset);
            keditorView0.scrollBy(0, arr_v1[1] + rect0.bottom - (v2 + v1 - v3));
        }
    }

    @NotNull
    public static final String type(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "<this>");
        KeditorPluginType keditorPluginType0 = (KeditorPluginType)class0.getAnnotation(KeditorPluginType.class);
        if(keditorPluginType0 != null) {
            String s = keditorPluginType0.type();
            if(s != null) {
                return s;
            }
        }
        throw new Exception("[" + class0 + "] KeditorPlugin must have KeditorPluginType annotation!");
    }
}

