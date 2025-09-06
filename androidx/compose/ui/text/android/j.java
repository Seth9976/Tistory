package androidx.compose.ui.text.android;

import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import l3.d;
import y0.p;

public final class j implements Comparator {
    public final int a;

    public j(int v) {
        this.a = v;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        switch(this.a) {
            case 0: {
                return ((Number)((Pair)object0).getSecond()).intValue() - ((Number)((Pair)object0).getFirst()).intValue() - (((Number)((Pair)object1).getSecond()).intValue() - ((Number)((Pair)object1).getFirst()).intValue());
            }
            case 1: {
                if(((byte[])object0).length != ((byte[])object1).length) {
                    return ((byte[])object0).length - ((byte[])object1).length;
                }
                for(int v = 0; v < ((byte[])object0).length; ++v) {
                    int v1 = ((byte[])object0)[v];
                    int v2 = ((byte[])object1)[v];
                    if(v1 != v2) {
                        return v1 - v2;
                    }
                }
                return 0;
            }
            case 2: {
                return ((LayoutNode)object0).getMeasurePassDelegate$ui_release().getZIndex$ui_release() == ((LayoutNode)object1).getMeasurePassDelegate$ui_release().getZIndex$ui_release() ? Intrinsics.compare(((LayoutNode)object0).getPlaceOrder$ui_release(), ((LayoutNode)object1).getPlaceOrder$ui_release()) : Float.compare(((LayoutNode)object0).getMeasurePassDelegate$ui_release().getZIndex$ui_release(), ((LayoutNode)object1).getMeasurePassDelegate$ui_release().getZIndex$ui_release());
            }
            case 3: {
                return ((Double)object0).compareTo(((Double)object1));
            }
            case 4: {
                return ((CustomAttribute)object0).getKey().compareTo(((CustomAttribute)object1).getKey());
            }
            case 5: {
                int v3 = ((d)object0).c;
                int v4 = ((d)object1).c;
                if(v3 < v4) {
                    return -1;
                }
                return v3 > v4 ? 1 : Integer.compare(((d)object1).d, ((d)object0).d);
            }
            case 6: {
                return ((File)object1).getName().compareTo(((File)object0).getName());
            }
            case 7: {
                return ((File)object0).getName().substring(0, CrashlyticsReportPersistence.e).compareTo(((File)object1).getName().substring(0, CrashlyticsReportPersistence.e));
            }
            default: {
                return Intrinsics.compare(((p)object0).b, ((p)object1).b);
            }
        }
    }
}

