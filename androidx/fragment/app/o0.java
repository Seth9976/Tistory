package androidx.fragment.app;

import android.content.res.Configuration;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.util.Consumer;

public final class o0 implements Consumer {
    public final int a;
    public final FragmentManager b;

    public o0(FragmentManager fragmentManager0, int v) {
        this.a = v;
        this.b = fragmentManager0;
        super();
    }

    @Override  // androidx.core.util.Consumer
    public final void accept(Object object0) {
        switch(this.a) {
            case 0: {
                FragmentManager fragmentManager1 = this.b;
                if(fragmentManager1.F()) {
                    fragmentManager1.h(false, ((Configuration)object0));
                }
                return;
            }
            case 1: {
                FragmentManager fragmentManager2 = this.b;
                if(fragmentManager2.F() && ((int)(((Integer)object0))) == 80) {
                    fragmentManager2.l(false);
                }
                return;
            }
            case 2: {
                FragmentManager fragmentManager3 = this.b;
                if(fragmentManager3.F()) {
                    fragmentManager3.m(((MultiWindowModeChangedInfo)object0).isInMultiWindowMode(), false);
                }
                return;
            }
            default: {
                FragmentManager fragmentManager0 = this.b;
                if(fragmentManager0.F()) {
                    fragmentManager0.r(((PictureInPictureModeChangedInfo)object0).isInPictureInPictureMode(), false);
                }
            }
        }
    }
}

