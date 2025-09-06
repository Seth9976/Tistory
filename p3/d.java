package p3;

import androidx.core.widget.ContentLoadingProgressBar;

public final class d implements Runnable {
    public final int a;
    public final ContentLoadingProgressBar b;

    public d(ContentLoadingProgressBar contentLoadingProgressBar0, int v) {
        this.a = v;
        this.b = contentLoadingProgressBar0;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                this.b.b = false;
                this.b.a = -1L;
                this.b.setVisibility(8);
                return;
            }
            case 1: {
                ContentLoadingProgressBar contentLoadingProgressBar1 = this.b;
                contentLoadingProgressBar1.c = false;
                if(!contentLoadingProgressBar1.d) {
                    contentLoadingProgressBar1.a = System.currentTimeMillis();
                    contentLoadingProgressBar1.setVisibility(0);
                }
                return;
            }
            case 2: {
                ContentLoadingProgressBar contentLoadingProgressBar2 = this.b;
                contentLoadingProgressBar2.a = -1L;
                contentLoadingProgressBar2.d = false;
                contentLoadingProgressBar2.removeCallbacks(contentLoadingProgressBar2.e);
                contentLoadingProgressBar2.b = false;
                if(!contentLoadingProgressBar2.c) {
                    contentLoadingProgressBar2.postDelayed(contentLoadingProgressBar2.f, 500L);
                    contentLoadingProgressBar2.c = true;
                }
                return;
            }
            default: {
                ContentLoadingProgressBar contentLoadingProgressBar0 = this.b;
                contentLoadingProgressBar0.d = true;
                contentLoadingProgressBar0.removeCallbacks(contentLoadingProgressBar0.f);
                contentLoadingProgressBar0.c = false;
                long v = System.currentTimeMillis() - contentLoadingProgressBar0.a;
                if(v >= 500L || contentLoadingProgressBar0.a == -1L) {
                    contentLoadingProgressBar0.setVisibility(8);
                }
                else if(!contentLoadingProgressBar0.b) {
                    contentLoadingProgressBar0.postDelayed(contentLoadingProgressBar0.e, 500L - v);
                    contentLoadingProgressBar0.b = true;
                }
            }
        }
    }
}

