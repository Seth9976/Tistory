package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

public final class n0 {
    public final CopyOnWriteArrayList a;
    public final FragmentManager b;

    public n0(FragmentManager fragmentManager0) {
        this.a = new CopyOnWriteArrayList();
        this.b = fragmentManager0;
    }

    public final void a(Fragment fragment0, Bundle bundle0, boolean z) {
        Fragment fragment1 = this.b.x;
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().n.a(fragment0, bundle0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((m0)object0).b) {
            }
        }
    }

    public final void b(Fragment fragment0, boolean z) {
        Context context0 = this.b.getHost().b;
        Fragment fragment1 = this.b.x;
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().n.b(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((m0)object0).b) {
            }
        }
    }

    public final void c(Fragment fragment0, Bundle bundle0, boolean z) {
        Fragment fragment1 = this.b.x;
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().n.c(fragment0, bundle0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((m0)object0).b) {
            }
        }
    }

    public final void d(Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.x;
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().n.d(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((m0)object0).b) {
            }
        }
    }

    public final void e(Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.x;
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().n.e(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((m0)object0).b) {
            }
        }
    }

    public final void f(Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.x;
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().n.f(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((m0)object0).b) {
            }
        }
    }

    public final void g(Fragment fragment0, boolean z) {
        Context context0 = this.b.getHost().b;
        Fragment fragment1 = this.b.x;
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().n.g(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((m0)object0).b) {
            }
        }
    }

    public final void h(Fragment fragment0, Bundle bundle0, boolean z) {
        Fragment fragment1 = this.b.x;
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().n.h(fragment0, bundle0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((m0)object0).b) {
            }
        }
    }

    public final void i(Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.x;
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().n.i(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((m0)object0).b) {
            }
        }
    }

    public final void j(Fragment fragment0, Bundle bundle0, boolean z) {
        Fragment fragment1 = this.b.x;
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().n.j(fragment0, bundle0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((m0)object0).b) {
            }
        }
    }

    public final void k(Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.x;
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().n.k(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((m0)object0).b) {
            }
        }
    }

    public final void l(Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.x;
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().n.l(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((m0)object0).b) {
            }
        }
    }

    public final void m(Fragment fragment0, View view0, Bundle bundle0, boolean z) {
        FragmentManager fragmentManager0 = this.b;
        Fragment fragment1 = fragmentManager0.x;
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().n.m(fragment0, view0, bundle0, true);
        }
        for(Object object0: this.a) {
            m0 m00 = (m0)object0;
            if(!z || m00.b) {
                m00.a.onFragmentViewCreated(fragmentManager0, fragment0, view0, bundle0);
            }
        }
    }

    public final void n(Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.x;
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().n.n(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((m0)object0).b) {
            }
        }
    }
}

