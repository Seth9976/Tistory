package d4;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import g.b;

public final class f extends b {
    public final TextView b;
    public final d c;
    public boolean d;

    public f(TextView textView0) {
        this.b = textView0;
        this.d = true;
        this.c = new d(textView0);
    }

    @Override  // g.b
    public final void C(boolean z) {
        if(z) {
            this.K();
        }
    }

    @Override  // g.b
    public final void D(boolean z) {
        this.d = z;
        this.K();
        InputFilter[] arr_inputFilter = this.o(this.b.getFilters());
        this.b.setFilters(arr_inputFilter);
    }

    @Override  // g.b
    public final void K() {
        TransformationMethod transformationMethod0 = this.L(this.b.getTransformationMethod());
        this.b.setTransformationMethod(transformationMethod0);
    }

    @Override  // g.b
    public final TransformationMethod L(TransformationMethod transformationMethod0) {
        if(this.d) {
            return !(transformationMethod0 instanceof j) && !(transformationMethod0 instanceof PasswordTransformationMethod) ? new j(transformationMethod0) : transformationMethod0;
        }
        return transformationMethod0 instanceof j ? ((j)transformationMethod0).a : transformationMethod0;
    }

    @Override  // g.b
    public final InputFilter[] o(InputFilter[] arr_inputFilter) {
        d d0;
        if(!this.d) {
            SparseArray sparseArray0 = new SparseArray(1);
            for(int v1 = 0; v1 < arr_inputFilter.length; ++v1) {
                InputFilter inputFilter0 = arr_inputFilter[v1];
                if(inputFilter0 instanceof d) {
                    sparseArray0.put(v1, inputFilter0);
                }
            }
            if(sparseArray0.size() != 0) {
                InputFilter[] arr_inputFilter1 = new InputFilter[arr_inputFilter.length - sparseArray0.size()];
                int v2 = 0;
                for(int v = 0; v < arr_inputFilter.length; ++v) {
                    if(sparseArray0.indexOfKey(v) < 0) {
                        arr_inputFilter1[v2] = arr_inputFilter[v];
                        ++v2;
                    }
                }
                return arr_inputFilter1;
            }
            return arr_inputFilter;
        }
        int v3 = 0;
        while(true) {
            d0 = this.c;
            if(v3 >= arr_inputFilter.length) {
                break;
            }
            if(arr_inputFilter[v3] != d0) {
                ++v3;
                continue;
            }
            return arr_inputFilter;
        }
        InputFilter[] arr_inputFilter2 = new InputFilter[arr_inputFilter.length + 1];
        System.arraycopy(arr_inputFilter, 0, arr_inputFilter2, 0, arr_inputFilter.length);
        arr_inputFilter2[arr_inputFilter.length] = d0;
        return arr_inputFilter2;
    }

    @Override  // g.b
    public final boolean r() {
        return this.d;
    }
}

