package com.google.android.material.datepicker;

import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.ViewUtils;
import com.kakao.keditor.plugin.itemspec.image.ImageItemSpec;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItemSpec;
import com.kakao.keditor.plugin.itemspec.video.VideoItemSpec;
import com.kakao.keditor.plugin.pluginspec.poll.creator.PollItemViewHolder;
import com.kakao.tistory.presentation.view.bottomsheet.ReportDialogFragment;
import f8.c;

public final class i implements View.OnFocusChangeListener {
    public final int a;
    public final Object b;

    public i(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        switch(this.a) {
            case 0: {
                EditText[] arr_editText = (EditText[])this.b;
                for(int v = 0; true; ++v) {
                    if(v >= arr_editText.length) {
                        ViewUtils.hideKeyboard(view0, false);
                        break;
                    }
                    if(arr_editText[v].hasFocus()) {
                        break;
                    }
                }
                return;
            }
            case 1: {
                ImageItemSpec.a(((ImageItemSpec)this.b), view0, z);
                return;
            }
            case 2: {
                ImageGridItemSpec.a(((ImageGridItemSpec)this.b), view0, z);
                return;
            }
            case 3: {
                VideoItemSpec.a(((VideoItemSpec)this.b), view0, z);
                return;
            }
            case 4: {
                PollItemViewHolder.b(((PollItemViewHolder)this.b), view0, z);
                return;
            }
            case 5: {
                boolean z1 = ((c)this.b).u();
                ((c)this.b).t(z1);
                return;
            }
            case 6: {
                f8.i i0 = (f8.i)this.b;
                i0.l = z;
                i0.q();
                if(!z) {
                    i0.t(false);
                    i0.m = false;
                }
                return;
            }
            default: {
                ReportDialogFragment.a(((ReportDialogFragment)this.b), view0, z);
            }
        }
    }
}

