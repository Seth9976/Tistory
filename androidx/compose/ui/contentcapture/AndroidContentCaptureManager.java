package androidx.compose.ui.contentcapture;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.autofill.AutofillId;
import androidx.activity.h;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import l1.a;
import l1.c;
import l1.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001^B\u001F\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u000E\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00A2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0010\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u0010\u0010\u000FJ\u0017\u0010\u0013\u001A\u00020\r2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001A\u00020\r2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0018\u001A\u00020\rH\u0080@\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u001B\u001A\u00020\rH\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010 \u001A\u00020\r2\u0006\u0010\u001D\u001A\u00020\u001CH\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010\"\u001A\u00020\rH\u0000\u00A2\u0006\u0004\b!\u0010\u001AJ\u000F\u0010$\u001A\u00020\rH\u0000\u00A2\u0006\u0004\b#\u0010\u001AJ\u000F\u0010&\u001A\u00020\rH\u0000\u00A2\u0006\u0004\b%\u0010\u001AJ/\u00100\u001A\u00020\r2\u0006\u0010(\u001A\u00020\'2\u0006\u0010*\u001A\u00020)2\u000E\u0010-\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010,0+H\u0001\u00A2\u0006\u0004\b.\u0010/J\'\u00107\u001A\u00020\r2\u0006\u00101\u001A\u00020\u00002\u000E\u00104\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010302H\u0001\u00A2\u0006\u0004\b5\u00106R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010;R*\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010I\u001A\u0004\u0018\u00010\u00078\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0018\n\u0004\bB\u0010C\u0012\u0004\bH\u0010\u001A\u001A\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001A\u0010O\u001A\u00020J8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bK\u0010L\u001A\u0004\bM\u0010NR(\u0010X\u001A\b\u0012\u0004\u0012\u00020Q0P8@@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bR\u0010S\u001A\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001A\u0010]\u001A\u00020Y8@X\u0080\u0004\u00A2\u0006\f\u0012\u0004\b\\\u0010\u001A\u001A\u0004\bZ\u0010[\u00A8\u0006_"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "Landroidx/compose/ui/contentcapture/ContentCaptureManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "Lkotlin/Function0;", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "onContentCaptureSession", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "boundsUpdatesEventLoop$ui_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boundsUpdatesEventLoop", "onSemanticsChange$ui_release", "()V", "onSemanticsChange", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "onLayoutChange$ui_release", "(Landroidx/compose/ui/node/LayoutNode;)V", "onLayoutChange", "onShowTranslation$ui_release", "onShowTranslation", "onHideTranslation$ui_release", "onHideTranslation", "onClearTranslation$ui_release", "onClearTranslation", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests$ui_release", "([J[ILjava/util/function/Consumer;)V", "onCreateVirtualViewTranslationRequests", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "onVirtualViewTranslationResponses$ui_release", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;Landroid/util/LongSparseArray;)V", "onVirtualViewTranslationResponses", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "b", "Lkotlin/jvm/functions/Function0;", "getOnContentCaptureSession", "()Lkotlin/jvm/functions/Function0;", "setOnContentCaptureSession", "(Lkotlin/jvm/functions/Function0;)V", "c", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "getContentCaptureSession$ui_release", "()Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "setContentCaptureSession$ui_release", "(Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;)V", "getContentCaptureSession$ui_release$annotations", "contentCaptureSession", "Landroid/os/Handler;", "k", "Landroid/os/Handler;", "getHandler$ui_release", "()Landroid/os/Handler;", "handler", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "l", "Landroidx/collection/IntObjectMap;", "getCurrentSemanticsNodes$ui_release", "()Landroidx/collection/IntObjectMap;", "setCurrentSemanticsNodes$ui_release", "(Landroidx/collection/IntObjectMap;)V", "currentSemanticsNodes", "", "isEnabled$ui_release", "()Z", "isEnabled$ui_release$annotations", "isEnabled", "l1/c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidContentCaptureManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSet.kt\nandroidx/collection/IntSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n*L\n1#1,650:1\n33#2,6:651\n33#2,4:684\n38#2:697\n33#2,6:698\n33#2,4:729\n38#2:742\n151#2,3:837\n33#2,4:840\n154#2,2:844\n38#2:846\n156#2:847\n151#2,3:875\n33#2,4:878\n154#2,2:882\n38#2:884\n156#2:885\n33#2,6:886\n33#2,6:892\n262#3,4:657\n232#3,7:661\n243#3,3:669\n246#3,2:673\n266#3,2:675\n249#3,6:677\n268#3:683\n262#3,4:848\n232#3,7:852\n243#3,3:860\n246#3,2:864\n266#3,2:866\n249#3,6:868\n268#3:874\n1810#4:668\n1672#4:672\n1810#4:713\n1672#4:717\n1810#4:752\n1672#4:756\n1810#4:796\n1672#4:800\n1810#4:821\n1672#4:825\n1810#4:859\n1672#4:863\n1810#4:907\n1672#4:911\n1810#4:932\n1672#4:936\n1810#4:957\n1672#4:961\n66#5,9:688\n66#5,9:733\n66#5,9:760\n66#5,9:777\n396#6,3:704\n354#6,6:707\n364#6,3:714\n367#6,2:718\n399#6,2:720\n370#6,6:722\n401#6:728\n396#6,3:743\n354#6,6:746\n364#6,3:753\n367#6,2:757\n399#6:759\n400#6:769\n370#6,6:770\n401#6:776\n382#6,4:786\n354#6,6:790\n364#6,3:797\n367#6,2:801\n387#6,2:803\n370#6,6:805\n389#6:811\n408#6,3:812\n354#6,6:815\n364#6,3:822\n367#6,2:826\n412#6,2:828\n370#6,6:830\n414#6:836\n408#6,3:898\n354#6,6:901\n364#6,3:908\n367#6,2:912\n412#6,2:914\n370#6,6:916\n414#6:922\n408#6,3:923\n354#6,6:926\n364#6,3:933\n367#6,2:937\n412#6,2:939\n370#6,6:941\n414#6:947\n408#6,3:948\n354#6,6:951\n364#6,3:958\n367#6,2:962\n412#6,2:964\n370#6,6:966\n414#6:972\n*S KotlinDebug\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager\n*L\n235#1:651,6\n253#1:684,4\n253#1:697\n268#1:698,6\n281#1:729,4\n281#1:742\n458#1:837,3\n458#1:840,4\n458#1:844,2\n458#1:846\n458#1:847\n466#1:875,3\n466#1:878,4\n466#1:882,2\n466#1:884\n466#1:885\n480#1:886,6\n488#1:892,6\n246#1:657,4\n246#1:661,7\n246#1:669,3\n246#1:673,2\n246#1:675,2\n246#1:677,6\n246#1:683\n464#1:848,4\n464#1:852,7\n464#1:860,3\n464#1:864,2\n464#1:866,2\n464#1:868,6\n464#1:874\n246#1:668\n246#1:672\n275#1:713\n275#1:717\n296#1:752\n296#1:756\n345#1:796\n345#1:800\n456#1:821\n456#1:825\n464#1:859\n464#1:863\n526#1:907\n526#1:911\n537#1:932\n537#1:936\n548#1:957\n548#1:961\n255#1:688,9\n284#1:733,9\n300#1:760,9\n338#1:777,9\n275#1:704,3\n275#1:707,6\n275#1:714,3\n275#1:718,2\n275#1:720,2\n275#1:722,6\n275#1:728\n296#1:743,3\n296#1:746,6\n296#1:753,3\n296#1:757,2\n296#1:759\n296#1:769\n296#1:770,6\n296#1:776\n345#1:786,4\n345#1:790,6\n345#1:797,3\n345#1:801,2\n345#1:803,2\n345#1:805,6\n345#1:811\n456#1:812,3\n456#1:815,6\n456#1:822,3\n456#1:826,2\n456#1:828,2\n456#1:830,6\n456#1:836\n526#1:898,3\n526#1:901,6\n526#1:908,3\n526#1:912,2\n526#1:914,2\n526#1:916,6\n526#1:922\n537#1:923,3\n537#1:926,6\n537#1:933,3\n537#1:937,2\n537#1:939,2\n537#1:941,6\n537#1:947\n548#1:948,3\n548#1:951,6\n548#1:958,3\n548#1:962,2\n548#1:964,2\n548#1:966,6\n548#1:972\n*E\n"})
public final class AndroidContentCaptureManager implements View.OnAttachStateChangeListener, ContentCaptureManager, DefaultLifecycleObserver {
    public static final int $stable = 8;
    public final AndroidComposeView a;
    public Function0 b;
    public ContentCaptureSessionCompat c;
    public final MutableIntObjectMap d;
    public final MutableIntSet e;
    public final long f;
    public int g;
    public boolean h;
    public final ArraySet i;
    public final Channel j;
    public final Handler k;
    public IntObjectMap l;
    public long m;
    public final MutableIntObjectMap n;
    public SemanticsNodeCopy o;
    public boolean p;
    public final h q;

    public AndroidContentCaptureManager(@NotNull AndroidComposeView androidComposeView0, @NotNull Function0 function00) {
        this.a = androidComposeView0;
        this.b = function00;
        this.d = new MutableIntObjectMap(0, 1, null);
        this.e = new MutableIntSet(0, 1, null);
        this.f = 100L;
        this.g = 1;
        this.h = true;
        this.i = new ArraySet(0, 1, null);
        this.j = ChannelKt.Channel$default(1, null, null, 6, null);
        this.k = new Handler(Looper.getMainLooper());
        this.l = IntObjectMapKt.intObjectMapOf();
        this.n = IntObjectMapKt.mutableIntObjectMapOf();
        this.o = new SemanticsNodeCopy(androidComposeView0.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
        this.q = new h(this, 28);
    }

    public final void a() {
        ArrayList arrayList3;
        ArrayList arrayList1;
        ContentCaptureSessionCompat contentCaptureSessionCompat0 = this.c;
        if(contentCaptureSessionCompat0 == null) {
            return;
        }
        if(Build.VERSION.SDK_INT < 29) {
            return;
        }
        MutableIntObjectMap mutableIntObjectMap0 = this.d;
        if(mutableIntObjectMap0.isNotEmpty()) {
            ArrayList arrayList0 = new ArrayList();
            Object[] arr_object = mutableIntObjectMap0.values;
            long[] arr_v = mutableIntObjectMap0.metadata;
            int v = arr_v.length - 2;
            if(v >= 0) {
                int v1 = 0;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_24;
                    }
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((v2 & 0xFFL) < 0x80L) {
                            arrayList0.add(((ViewStructureCompat)arr_object[(v1 << 3) + v4]));
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                    label_24:
                        if(v1 != v) {
                            ++v1;
                            continue;
                        }
                    }
                    goto label_27;
                }
            }
            else {
            label_27:
                arrayList1 = new ArrayList(arrayList0.size());
                int v5 = arrayList0.size();
            }
            for(int v6 = 0; v6 < v5; ++v6) {
                arrayList1.add(((ViewStructureCompat)arrayList0.get(v6)).toViewStructure());
            }
            contentCaptureSessionCompat0.notifyViewsAppeared(arrayList1);
            mutableIntObjectMap0.clear();
        }
        MutableIntSet mutableIntSet0 = this.e;
        if(mutableIntSet0.isNotEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int[] arr_v1 = mutableIntSet0.elements;
            long[] arr_v2 = mutableIntSet0.metadata;
            int v7 = arr_v2.length - 2;
            if(v7 >= 0) {
                int v8 = 0;
                while(true) {
                    long v9 = arr_v2[v8];
                    if((~v9 << 7 & v9 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_55;
                    }
                    int v10 = 8 - (~(v8 - v7) >>> 0x1F);
                    for(int v11 = 0; v11 < v10; ++v11) {
                        if((v9 & 0xFFL) < 0x80L) {
                            arrayList2.add(((int)arr_v1[(v8 << 3) + v11]));
                        }
                        v9 >>= 8;
                    }
                    if(v10 == 8) {
                    label_55:
                        if(v8 != v7) {
                            ++v8;
                            continue;
                        }
                    }
                    goto label_58;
                }
            }
            else {
            label_58:
                arrayList3 = new ArrayList(arrayList2.size());
                int v12 = arrayList2.size();
            }
            for(int v13 = 0; v13 < v12; ++v13) {
                arrayList3.add(((long)((Number)arrayList2.get(v13)).intValue()));
            }
            contentCaptureSessionCompat0.notifyViewsDisappeared(CollectionsKt___CollectionsKt.toLongArray(arrayList3));
            mutableIntSet0.clear();
        }
    }

    public final void b(SemanticsNode semanticsNode0, SemanticsNodeCopy semanticsNodeCopy0) {
        int v9;
        List list1;
        List list0 = semanticsNode0.getReplacedChildren$ui_release();
        int v = list0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            SemanticsNode semanticsNode1 = (SemanticsNode)list0.get(v2);
            if(this.getCurrentSemanticsNodes$ui_release().contains(semanticsNode1.getId()) && !semanticsNodeCopy0.getChildren().contains(semanticsNode1.getId())) {
                this.e(semanticsNode1);
            }
        }
        MutableIntObjectMap mutableIntObjectMap0 = this.n;
        int[] arr_v = mutableIntObjectMap0.keys;
        long[] arr_v1 = mutableIntObjectMap0.metadata;
        int v3 = arr_v1.length - 2;
        if(v3 >= 0) {
            int v4 = 0;
            while(true) {
                long v5 = arr_v1[v4];
                if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_36;
                }
                int v6 = 8 - (~(v4 - v3) >>> 0x1F);
                for(int v7 = 0; v7 < v6; ++v7) {
                    if((0xFFL & v5) < 0x80L) {
                        int v8 = arr_v[(v4 << 3) + v7];
                        if(!this.getCurrentSemanticsNodes$ui_release().contains(v8)) {
                            MutableIntObjectMap mutableIntObjectMap1 = this.d;
                            if(mutableIntObjectMap1.containsKey(v8)) {
                                mutableIntObjectMap1.remove(v8);
                            }
                            else {
                                this.e.add(v8);
                            }
                        }
                    }
                    v5 >>= 8;
                }
                if(v6 == 8) {
                label_36:
                    if(v4 != v3) {
                        ++v4;
                        continue;
                    }
                    break;
                }
                else {
                    list1 = semanticsNode0.getReplacedChildren$ui_release();
                    v9 = list1.size();
                }
                goto label_44;
            }
        }
        list1 = semanticsNode0.getReplacedChildren$ui_release();
        v9 = list1.size();
    label_44:
        for(int v1 = 0; v1 < v9; ++v1) {
            SemanticsNode semanticsNode2 = (SemanticsNode)list1.get(v1);
            if(this.getCurrentSemanticsNodes$ui_release().contains(semanticsNode2.getId()) && mutableIntObjectMap0.contains(semanticsNode2.getId())) {
                Object object0 = mutableIntObjectMap0.get(semanticsNode2.getId());
                if(object0 == null) {
                    throw a.b("node not present in pruned tree before this change");
                }
                this.b(semanticsNode2, ((SemanticsNodeCopy)object0));
                continue;
            }
        }
    }

    @Nullable
    public final Object boundsUpdatesEventLoop$ui_release(@NotNull Continuation continuation0) {
        AndroidContentCaptureManager androidContentCaptureManager0;
        Object object1;
        Object object0;
        d d0;
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v = d0.s;
            if((v & 0x80000000) == 0) {
                d0 = new d(this, continuation0);
            }
            else {
                d0.s = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, continuation0);
        }
        try {
            object0 = d0.q;
            object1 = qd.a.getCOROUTINE_SUSPENDED();
            switch(d0.s) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_18;
                }
                case 2: {
                    goto label_22;
                }
            }
        }
        catch(Throwable throwable0) {
            androidContentCaptureManager0.i.clear();
            throw throwable0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ResultKt.throwOnFailure(object0);
        try {
            androidContentCaptureManager0 = this;
            ChannelIterator channelIterator0 = this.j.iterator();
            androidContentCaptureManager0 = this;
            goto label_26;
        label_18:
            ChannelIterator channelIterator1 = d0.p;
            androidContentCaptureManager0 = d0.o;
            ResultKt.throwOnFailure(object0);
            goto label_34;
        label_22:
            channelIterator1 = d0.p;
            androidContentCaptureManager0 = d0.o;
            ResultKt.throwOnFailure(object0);
            while(true) {
                channelIterator0 = channelIterator1;
            label_26:
                d0.o = androidContentCaptureManager0;
                d0.p = channelIterator0;
                d0.s = 1;
                Object object2 = channelIterator0.hasNext(d0);
                if(object2 == object1) {
                    return object1;
                }
                channelIterator1 = channelIterator0;
                object0 = object2;
            label_34:
                if(!((Boolean)object0).booleanValue()) {
                    goto label_51;
                }
                channelIterator1.next();
                if(androidContentCaptureManager0.isEnabled$ui_release()) {
                    androidContentCaptureManager0.a();
                }
                if(!androidContentCaptureManager0.p) {
                    androidContentCaptureManager0.p = true;
                    androidContentCaptureManager0.k.post(androidContentCaptureManager0.q);
                }
                androidContentCaptureManager0.i.clear();
                d0.o = androidContentCaptureManager0;
                d0.p = channelIterator1;
                d0.s = 2;
                if(DelayKt.delay(androidContentCaptureManager0.f, d0) == object1) {
                    break;
                }
            }
            return object1;
        }
        catch(Throwable throwable0) {
            androidContentCaptureManager0.i.clear();
            throw throwable0;
        }
    label_51:
        androidContentCaptureManager0.i.clear();
        return Unit.INSTANCE;
    }

    public final void c(int v, String s) {
        if(Build.VERSION.SDK_INT < 29) {
            return;
        }
        ContentCaptureSessionCompat contentCaptureSessionCompat0 = this.c;
        if(contentCaptureSessionCompat0 == null) {
            return;
        }
        AutofillId autofillId0 = contentCaptureSessionCompat0.newAutofillId(((long)v));
        if(autofillId0 == null) {
            throw a.b("Invalid content capture ID");
        }
        contentCaptureSessionCompat0.notifyViewTextChanged(autofillId0, s);
    }

    public final void d(SemanticsNode semanticsNode0, SemanticsNodeCopy semanticsNodeCopy0) {
        int v8;
        List list1;
        Channel channel0;
        MutableIntSet mutableIntSet0 = new MutableIntSet(0, 1, null);
        List list0 = semanticsNode0.getReplacedChildren$ui_release();
        int v1 = list0.size();
        for(int v2 = 0; true; ++v2) {
            channel0 = this.j;
            ArraySet arraySet0 = this.i;
            if(v2 >= v1) {
                break;
            }
            SemanticsNode semanticsNode1 = (SemanticsNode)list0.get(v2);
            if(this.getCurrentSemanticsNodes$ui_release().contains(semanticsNode1.getId())) {
                if(!semanticsNodeCopy0.getChildren().contains(semanticsNode1.getId())) {
                    if(arraySet0.add(semanticsNode0.getLayoutNode$ui_release())) {
                        channel0.trySend-JP2dKIU(Unit.INSTANCE);
                    }
                    return;
                }
                mutableIntSet0.add(semanticsNode1.getId());
            }
        }
        MutableIntSet mutableIntSet1 = semanticsNodeCopy0.getChildren();
        int[] arr_v = mutableIntSet1.elements;
        long[] arr_v1 = mutableIntSet1.metadata;
        int v3 = arr_v1.length - 2;
        if(v3 >= 0) {
            int v4 = 0;
            while(true) {
                long v5 = arr_v1[v4];
                if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_39;
                }
                int v6 = 8 - (~(v4 - v3) >>> 0x1F);
                for(int v7 = 0; v7 < v6; ++v7) {
                    if((0xFFL & v5) < 0x80L && !mutableIntSet0.contains(arr_v[(v4 << 3) + v7])) {
                        if(arraySet0.add(semanticsNode0.getLayoutNode$ui_release())) {
                            channel0.trySend-JP2dKIU(Unit.INSTANCE);
                        }
                        return;
                    }
                    v5 >>= 8;
                }
                if(v6 == 8) {
                label_39:
                    if(v4 != v3) {
                        ++v4;
                        continue;
                    }
                    break;
                }
                else {
                    list1 = semanticsNode0.getReplacedChildren$ui_release();
                    v8 = list1.size();
                }
                goto label_47;
            }
        }
        list1 = semanticsNode0.getReplacedChildren$ui_release();
        v8 = list1.size();
    label_47:
        for(int v = 0; v < v8; ++v) {
            SemanticsNode semanticsNode2 = (SemanticsNode)list1.get(v);
            if(this.getCurrentSemanticsNodes$ui_release().contains(semanticsNode2.getId())) {
                Object object0 = this.n.get(semanticsNode2.getId());
                if(object0 == null) {
                    throw a.b("node not present in pruned tree before this change");
                }
                this.d(semanticsNode2, ((SemanticsNodeCopy)object0));
                continue;
            }
        }
    }

    public final void e(SemanticsNode semanticsNode0) {
        AutofillId autofillId0;
        if(!this.isEnabled$ui_release()) {
            return;
        }
        SemanticsConfiguration semanticsConfiguration0 = semanticsNode0.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties0 = SemanticsProperties.INSTANCE;
        Boolean boolean0 = (Boolean)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, semanticsProperties0.getIsShowingTextSubstitution());
        if(this.g == 1 && Intrinsics.areEqual(boolean0, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsActions.INSTANCE.getShowTextSubstitution());
            if(accessibilityAction0 != null) {
                Function1 function10 = (Function1)accessibilityAction0.getAction();
                if(function10 != null) {
                    Boolean boolean1 = (Boolean)function10.invoke(Boolean.FALSE);
                }
            }
        }
        else if(this.g == 2 && Intrinsics.areEqual(boolean0, Boolean.FALSE)) {
            AccessibilityAction accessibilityAction1 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsActions.INSTANCE.getShowTextSubstitution());
            if(accessibilityAction1 != null) {
                Function1 function11 = (Function1)accessibilityAction1.getAction();
                if(function11 != null) {
                    Boolean boolean2 = (Boolean)function11.invoke(Boolean.TRUE);
                }
            }
        }
        int v = semanticsNode0.getId();
        ContentCaptureSessionCompat contentCaptureSessionCompat0 = this.c;
        ViewStructureCompat viewStructureCompat0 = null;
        if(contentCaptureSessionCompat0 != null && Build.VERSION.SDK_INT >= 29) {
            AutofillIdCompat autofillIdCompat0 = ViewCompatShims.getAutofillId(this.a);
            if(autofillIdCompat0 != null) {
                SemanticsNode semanticsNode1 = semanticsNode0.getParent();
                if(semanticsNode1 == null) {
                    autofillId0 = autofillIdCompat0.toAutofillId();
                label_31:
                    ViewStructureCompat viewStructureCompat1 = contentCaptureSessionCompat0.newVirtualViewStructure(autofillId0, ((long)semanticsNode0.getId()));
                    if(viewStructureCompat1 != null) {
                        SemanticsConfiguration semanticsConfiguration1 = semanticsNode0.getUnmergedConfig$ui_release();
                        if(!semanticsConfiguration1.contains(semanticsProperties0.getPassword())) {
                            Bundle bundle0 = viewStructureCompat1.getExtras();
                            if(bundle0 != null) {
                                bundle0.putLong("android.view.contentcapture.EventTimestamp", this.m);
                            }
                            String s = (String)SemanticsConfigurationKt.getOrNull(semanticsConfiguration1, semanticsProperties0.getTestTag());
                            if(s != null) {
                                viewStructureCompat1.setId(semanticsNode0.getId(), null, null, s);
                            }
                            Object object0 = SemanticsConfigurationKt.getOrNull(semanticsConfiguration1, semanticsProperties0.getText());
                            if(((List)object0) != null) {
                                viewStructureCompat1.setClassName("android.widget.TextView");
                                viewStructureCompat1.setText(ListUtilsKt.fastJoinToString$default(((List)object0), "\n", null, null, 0, null, null, 62, null));
                            }
                            AnnotatedString annotatedString0 = (AnnotatedString)SemanticsConfigurationKt.getOrNull(semanticsConfiguration1, semanticsProperties0.getEditableText());
                            if(annotatedString0 != null) {
                                viewStructureCompat1.setClassName("android.widget.EditText");
                                viewStructureCompat1.setText(annotatedString0);
                            }
                            Object object1 = SemanticsConfigurationKt.getOrNull(semanticsConfiguration1, semanticsProperties0.getContentDescription());
                            if(((List)object1) != null) {
                                viewStructureCompat1.setContentDescription(ListUtilsKt.fastJoinToString$default(((List)object1), "\n", null, null, 0, null, null, 62, null));
                            }
                            Role role0 = (Role)SemanticsConfigurationKt.getOrNull(semanticsConfiguration1, semanticsProperties0.getRole());
                            if(role0 != null) {
                                String s1 = SemanticsUtils_androidKt.toLegacyClassName-V4PA4sw(role0.unbox-impl());
                                if(s1 != null) {
                                    viewStructureCompat1.setClassName(s1);
                                }
                            }
                            TextLayoutResult textLayoutResult0 = SemanticsUtils_androidKt.getTextLayoutResult(semanticsConfiguration1);
                            if(textLayoutResult0 != null) {
                                TextLayoutInput textLayoutInput0 = textLayoutResult0.getLayoutInput();
                                float f = TextUnit.getValue-impl(textLayoutInput0.getStyle().getFontSize-XSAIIZE());
                                float f1 = textLayoutInput0.getDensity().getDensity();
                                viewStructureCompat1.setTextStyle(textLayoutInput0.getDensity().getFontScale() * (f1 * f), 0, 0, 0);
                            }
                            Rect rect0 = semanticsNode0.getBoundsInParent$ui_release();
                            viewStructureCompat1.setDimens(((int)rect0.getLeft()), ((int)rect0.getTop()), 0, 0, ((int)rect0.getWidth()), ((int)rect0.getHeight()));
                            viewStructureCompat0 = viewStructureCompat1;
                        }
                    }
                }
                else {
                    autofillId0 = contentCaptureSessionCompat0.newAutofillId(((long)semanticsNode1.getId()));
                    if(autofillId0 != null) {
                        goto label_31;
                    }
                }
            }
        }
        if(viewStructureCompat0 != null) {
            MutableIntSet mutableIntSet0 = this.e;
            if(mutableIntSet0.contains(v)) {
                mutableIntSet0.remove(v);
            }
            else {
                this.d.set(v, viewStructureCompat0);
            }
        }
        List list0 = semanticsNode0.getReplacedChildren$ui_release();
        int v2 = list0.size();
        for(int v1 = 0; v1 < v2; ++v1) {
            this.e(((SemanticsNode)list0.get(v1)));
        }
    }

    public final void f(SemanticsNode semanticsNode0) {
        if(!this.isEnabled$ui_release()) {
            return;
        }
        int v = semanticsNode0.getId();
        MutableIntObjectMap mutableIntObjectMap0 = this.d;
        if(mutableIntObjectMap0.containsKey(v)) {
            mutableIntObjectMap0.remove(v);
        }
        else {
            this.e.add(v);
        }
        List list0 = semanticsNode0.getReplacedChildren$ui_release();
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            this.f(((SemanticsNode)list0.get(v2)));
        }
    }

    @Nullable
    public final ContentCaptureSessionCompat getContentCaptureSession$ui_release() {
        return this.c;
    }

    @VisibleForTesting
    public static void getContentCaptureSession$ui_release$annotations() {
    }

    @NotNull
    public final IntObjectMap getCurrentSemanticsNodes$ui_release() {
        if(this.h) {
            this.h = false;
            this.l = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.a.getSemanticsOwner());
            this.m = System.currentTimeMillis();
        }
        return this.l;
    }

    @NotNull
    public final Handler getHandler$ui_release() {
        return this.k;
    }

    @NotNull
    public final Function0 getOnContentCaptureSession() {
        return this.b;
    }

    @NotNull
    public final AndroidComposeView getView() {
        return this.a;
    }

    // 去混淆评级： 低(30)
    public final boolean isEnabled$ui_release() {
        return this.c != null;
    }

    public static void isEnabled$ui_release$annotations() {
    }

    public final void onClearTranslation$ui_release() {
        this.g = 1;
        IntObjectMap intObjectMap0 = this.getCurrentSemanticsNodes$ui_release();
        Object[] arr_object = intObjectMap0.values;
        long[] arr_v = intObjectMap0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            SemanticsConfiguration semanticsConfiguration0 = ((SemanticsNodeWithAdjustedBounds)arr_object[(v1 << 3) + v4]).getSemanticsNode().getUnmergedConfig$ui_release();
                            if(SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) != null) {
                                AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsActions.INSTANCE.getClearTextSubstitution());
                                if(accessibilityAction0 != null) {
                                    Function0 function00 = (Function0)accessibilityAction0.getAction();
                                    if(function00 != null) {
                                        Boolean boolean0 = (Boolean)function00.invoke();
                                    }
                                }
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_24;
                    }
                    break;
                }
            label_24:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    @RequiresApi(0x1F)
    public final void onCreateVirtualViewTranslationRequests$ui_release(@NotNull long[] arr_v, @NotNull int[] arr_v1, @NotNull Consumer consumer0) {
        c.a.b(this, arr_v, arr_v1, consumer0);
    }

    public final void onHideTranslation$ui_release() {
        this.g = 1;
        IntObjectMap intObjectMap0 = this.getCurrentSemanticsNodes$ui_release();
        Object[] arr_object = intObjectMap0.values;
        long[] arr_v = intObjectMap0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            SemanticsConfiguration semanticsConfiguration0 = ((SemanticsNodeWithAdjustedBounds)arr_object[(v1 << 3) + v4]).getSemanticsNode().getUnmergedConfig$ui_release();
                            if(Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.TRUE)) {
                                AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsActions.INSTANCE.getShowTextSubstitution());
                                if(accessibilityAction0 != null) {
                                    Function1 function10 = (Function1)accessibilityAction0.getAction();
                                    if(function10 != null) {
                                        Boolean boolean0 = (Boolean)function10.invoke(Boolean.FALSE);
                                    }
                                }
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_24;
                    }
                    break;
                }
            label_24:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final void onLayoutChange$ui_release(@NotNull LayoutNode layoutNode0) {
        this.h = true;
        if(this.isEnabled$ui_release() && this.i.add(layoutNode0)) {
            this.j.trySend-JP2dKIU(Unit.INSTANCE);
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.h = true;
        if(this.isEnabled$ui_release() && !this.p) {
            this.p = true;
            this.k.post(this.q);
        }
    }

    public final void onShowTranslation$ui_release() {
        this.g = 2;
        IntObjectMap intObjectMap0 = this.getCurrentSemanticsNodes$ui_release();
        Object[] arr_object = intObjectMap0.values;
        long[] arr_v = intObjectMap0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            SemanticsConfiguration semanticsConfiguration0 = ((SemanticsNodeWithAdjustedBounds)arr_object[(v1 << 3) + v4]).getSemanticsNode().getUnmergedConfig$ui_release();
                            if(Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.FALSE)) {
                                AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsActions.INSTANCE.getShowTextSubstitution());
                                if(accessibilityAction0 != null) {
                                    Function1 function10 = (Function1)accessibilityAction0.getAction();
                                    if(function10 != null) {
                                        Boolean boolean0 = (Boolean)function10.invoke(Boolean.TRUE);
                                    }
                                }
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_24;
                    }
                    break;
                }
            label_24:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull LifecycleOwner lifecycleOwner0) {
        this.c = (ContentCaptureSessionCompat)this.b.invoke();
        this.e(this.a.getSemanticsOwner().getUnmergedRootSemanticsNode());
        this.a();
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner lifecycleOwner0) {
        this.f(this.a.getSemanticsOwner().getUnmergedRootSemanticsNode());
        this.a();
        this.c = null;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View view0) {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View view0) {
        this.k.removeCallbacks(this.q);
        this.c = null;
    }

    @RequiresApi(0x1F)
    public final void onVirtualViewTranslationResponses$ui_release(@NotNull AndroidContentCaptureManager androidContentCaptureManager0, @NotNull LongSparseArray longSparseArray0) {
        c.a.c(androidContentCaptureManager0, longSparseArray0);
    }

    public final void setContentCaptureSession$ui_release(@Nullable ContentCaptureSessionCompat contentCaptureSessionCompat0) {
        this.c = contentCaptureSessionCompat0;
    }

    public final void setCurrentSemanticsNodes$ui_release(@NotNull IntObjectMap intObjectMap0) {
        this.l = intObjectMap0;
    }

    public final void setOnContentCaptureSession(@NotNull Function0 function00) {
        this.b = function00;
    }
}

