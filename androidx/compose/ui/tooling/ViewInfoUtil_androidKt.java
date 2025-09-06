package androidx.compose.ui.tooling;

import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import o2.j;
import org.jetbrains.annotations.NotNull;
import pd.c;

@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\u001A9\u0010\b\u001A\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "Landroidx/compose/ui/tooling/ViewInfo;", "", "indentation", "Lkotlin/Function1;", "", "filter", "", "toDebugString", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)Ljava/lang/String;", "ui-tooling_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nViewInfoUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInfoUtil.android.kt\nandroidx/compose/ui/tooling/ViewInfoUtil_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1360#2:80\n1446#2,2:81\n1360#2:83\n1446#2,5:84\n1448#2,3:89\n1855#2,2:92\n*S KotlinDebug\n*F\n+ 1 ViewInfoUtil.android.kt\nandroidx/compose/ui/tooling/ViewInfoUtil_androidKt\n*L\n26#1:80\n26#1:81,2\n28#1:83\n28#1:84,5\n26#1:89,3\n66#1:92,2\n*E\n"})
public final class ViewInfoUtil_androidKt {
    public static final ArrayList a(List list0, Function1 function10) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            ViewInfo viewInfo0 = (ViewInfo)object0;
            ArrayList arrayList1 = ViewInfoUtil_androidKt.a(viewInfo0.getChildren(), function10);
            ArrayList arrayList2 = new ArrayList();
            for(Object object1: arrayList1) {
                ViewInfo viewInfo1 = (ViewInfo)object1;
                o.addAll(arrayList2, (viewInfo1.getLocation() == null ? viewInfo1.getChildren() : k.listOf(viewInfo1)));
            }
            o.addAll(arrayList0, (((Boolean)function10.invoke(viewInfo0)).booleanValue() ? k.listOf(new ViewInfo(viewInfo0.getFileName(), viewInfo0.getLineNumber(), viewInfo0.getBounds(), viewInfo0.getLocation(), arrayList2, viewInfo0.getLayoutInfo())) : k.listOf(new ViewInfo("<root>", -1, IntRect.Companion.getZero(), null, arrayList2, null))));
        }
        return arrayList0;
    }

    @NotNull
    public static final String toDebugString(@NotNull List list0, int v, @NotNull Function1 function10) {
        String s = p.repeat(".", v);
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: CollectionsKt___CollectionsKt.sortedWith(ViewInfoUtil_androidKt.a(list0, function10), c.compareBy(new Function1[]{j.z, j.A, j.B}))) {
            ViewInfo viewInfo0 = (ViewInfo)object0;
            if(viewInfo0.getLocation() == null) {
                stringBuilder0.append(s + "|<root>");
            }
            else {
                stringBuilder0.append(s + '|' + viewInfo0.getFileName() + ':' + viewInfo0.getLineNumber());
            }
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
            stringBuilder0.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
            String s1 = StringsKt__StringsKt.trim(ViewInfoUtil_androidKt.toDebugString(viewInfo0.getChildren(), v + 1, function10)).toString();
            if(s1.length() > 0) {
                stringBuilder0.append(s1);
                Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
                stringBuilder0.append('\n');
                Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
            }
        }
        return stringBuilder0.toString();
    }

    public static String toDebugString$default(List list0, int v, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            function10 = j.y;
        }
        return ViewInfoUtil_androidKt.toDebugString(list0, v, function10);
    }
}

