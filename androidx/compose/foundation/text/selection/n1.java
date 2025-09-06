package androidx.compose.foundation.text.selection;

import androidx.compose.ui.platform.a0;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pd.c;

public final class n1 implements Comparator {
    public final int a;
    public final Serializable b;

    public n1(Serializable serializable0, int v) {
        this.a = v;
        this.b = serializable0;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        Serializable serializable0 = this.b;
        switch(this.a) {
            case 0: {
                return ((Number)((p1)serializable0).invoke(object0, object1)).intValue();
            }
            case 1: {
                return ((Number)((a0)serializable0).invoke(object0, object1)).intValue();
            }
            default: {
                Intrinsics.checkNotNullParameter(((Function1[])serializable0), "$selectors");
                for(int v = 0; v < ((Function1[])serializable0).length; ++v) {
                    Function1 function10 = ((Function1[])serializable0)[v];
                    int v1 = c.compareValues(((Comparable)function10.invoke(object0)), ((Comparable)function10.invoke(object1)));
                    if(v1 != 0) {
                        return v1;
                    }
                }
                return 0;
            }
        }
    }
}

