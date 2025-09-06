package androidx.compose.ui.autofill;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u001A\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001\u001A\u0014\u0010\u0006\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\bH\u0001¨\u0006\t"}, d2 = {"performAutofill", "", "Landroidx/compose/ui/autofill/AndroidAutofill;", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "populateViewStructure", "root", "Landroid/view/ViewStructure;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,143:1\n151#2,3:144\n33#2,4:147\n154#2,2:151\n38#2:153\n156#2:154\n37#3,2:155\n26#4:157\n26#4:158\n26#4:159\n26#4:160\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n*L\n94#1:144,3\n94#1:147,4\n94#1:151,2\n94#1:153\n94#1:154\n94#1:155,2\n107#1:157\n108#1:158\n109#1:159\n110#1:160\n*E\n"})
public final class AndroidAutofill_androidKt {
    @RequiresApi(26)
    @ExperimentalComposeUiApi
    public static final void performAutofill(@NotNull AndroidAutofill androidAutofill0, @NotNull SparseArray sparseArray0) {
        int v = sparseArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = sparseArray0.keyAt(v1);
            AutofillValue autofillValue0 = (AutofillValue)sparseArray0.get(v2);
            AutofillApi26Helper autofillApi26Helper0 = AutofillApi26Helper.INSTANCE;
            if(autofillApi26Helper0.isText(autofillValue0)) {
                androidAutofill0.getAutofillTree().performAutofill(v2, autofillApi26Helper0.textValue(autofillValue0).toString());
            }
            else {
                if(autofillApi26Helper0.isDate(autofillValue0)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if(autofillApi26Helper0.isList(autofillValue0)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if(autofillApi26Helper0.isToggle(autofillValue0)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
                continue;
            }
        }
    }

    @RequiresApi(26)
    @ExperimentalComposeUiApi
    public static final void populateViewStructure(@NotNull AndroidAutofill androidAutofill0, @NotNull ViewStructure viewStructure0) {
        int v = AutofillApi23Helper.INSTANCE.addChildCount(viewStructure0, androidAutofill0.getAutofillTree().getChildren().size());
        for(Object object0: androidAutofill0.getAutofillTree().getChildren().entrySet()) {
            int v1 = ((Number)((Map.Entry)object0).getKey()).intValue();
            AutofillNode autofillNode0 = (AutofillNode)((Map.Entry)object0).getValue();
            AutofillApi23Helper autofillApi23Helper0 = AutofillApi23Helper.INSTANCE;
            ViewStructure viewStructure1 = autofillApi23Helper0.newChild(viewStructure0, v);
            if(viewStructure1 != null) {
                AutofillApi26Helper autofillApi26Helper0 = AutofillApi26Helper.INSTANCE;
                AutofillId autofillId0 = autofillApi26Helper0.getAutofillId(viewStructure0);
                Intrinsics.checkNotNull(autofillId0);
                autofillApi26Helper0.setAutofillId(viewStructure1, autofillId0, v1);
                autofillApi23Helper0.setId(viewStructure1, v1, "net.daum.android.tistoryapp", null, null);
                autofillApi26Helper0.setAutofillType(viewStructure1, 1);
                List list0 = autofillNode0.getAutofillTypes();
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v2 = list0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    arrayList0.add(AndroidAutofillType_androidKt.getAndroidType(((AutofillType)list0.get(v3))));
                }
                autofillApi26Helper0.setAutofillHints(viewStructure1, ((String[])arrayList0.toArray(new String[0])));
                Rect rect0 = autofillNode0.getBoundingBox();
                if(rect0 == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                }
                else {
                    int v4 = Math.round(rect0.getLeft());
                    int v5 = Math.round(rect0.getTop());
                    AutofillApi23Helper.INSTANCE.setDimens(viewStructure1, v4, v5, 0, 0, Math.round(rect0.getRight()) - v4, Math.round(rect0.getBottom()) - v5);
                }
            }
            ++v;
        }
    }
}

