package androidx.transition;

import a5.b;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TransitionValues {
    public final ArrayList a;
    public final Map values;
    public View view;

    @Deprecated
    public TransitionValues() {
        this.values = new HashMap();
        this.a = new ArrayList();
    }

    public TransitionValues(@NonNull View view0) {
        this.values = new HashMap();
        this.a = new ArrayList();
        this.view = view0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof TransitionValues && this.view == ((TransitionValues)object0).view && this.values.equals(((TransitionValues)object0).values);
    }

    @Override
    public int hashCode() {
        return this.values.hashCode() + this.view.hashCode() * 0x1F;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = b.u(("TransitionValues@" + Integer.toHexString(this.hashCode()) + ":\n"), "    view = ");
        stringBuilder0.append(this.view);
        stringBuilder0.append("\n");
        String s = stringBuilder0.toString() + "    values:";
        for(Object object0: this.values.keySet()) {
            s = s + "    " + ((String)object0) + ": " + this.values.get(((String)object0)) + "\n";
        }
        return s;
    }
}

