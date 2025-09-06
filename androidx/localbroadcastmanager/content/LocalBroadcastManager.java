package androidx.localbroadcastmanager.content;

import a7.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.appcompat.app.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import jeb.synthetic.FIN;
import m4.a;

public final class LocalBroadcastManager {
    public final Context a;
    public final HashMap b;
    public final HashMap c;
    public final ArrayList d;
    public final j e;
    public static final Object f;
    public static LocalBroadcastManager g;

    static {
        LocalBroadcastManager.f = new Object();
    }

    public LocalBroadcastManager(Context context0) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.a = context0;
        this.e = new j(this, context0.getMainLooper());
    }

    public final void a() {
        int v;
        HashMap hashMap0;
        while(true) {
            hashMap0 = this.b;
            __monitor_enter(hashMap0);
            v = FIN.finallyOpen$NT();
            int v1 = this.d.size();
            if(v1 <= 0) {
                break;
            }
            b[] arr_b = new b[v1];
            this.d.toArray(arr_b);
            this.d.clear();
            FIN.finallyExec$NT(v);
            for(int v2 = 0; v2 < v1; ++v2) {
                b b0 = arr_b[v2];
                int v3 = ((ArrayList)b0.c).size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    a a0 = (a)((ArrayList)b0.c).get(v4);
                    if(!a0.d) {
                        a0.b.onReceive(this.a, ((Intent)b0.b));
                    }
                }
            }
        }
        FIN.finallyCodeBegin$NT(v);
        __monitor_exit(hashMap0);
        FIN.finallyCodeEnd$NT(v);
    }

    @NonNull
    public static LocalBroadcastManager getInstance(@NonNull Context context0) {
        synchronized(LocalBroadcastManager.f) {
            if(LocalBroadcastManager.g == null) {
                LocalBroadcastManager.g = new LocalBroadcastManager(context0.getApplicationContext());
            }
            return LocalBroadcastManager.g;
        }
    }

    public void registerReceiver(@NonNull BroadcastReceiver broadcastReceiver0, @NonNull IntentFilter intentFilter0) {
        synchronized(this.b) {
            a a0 = new a(broadcastReceiver0, intentFilter0);
            ArrayList arrayList0 = (ArrayList)this.b.get(broadcastReceiver0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList(1);
                this.b.put(broadcastReceiver0, arrayList0);
            }
            arrayList0.add(a0);
            for(int v1 = 0; v1 < intentFilter0.countActions(); ++v1) {
                String s = intentFilter0.getAction(v1);
                ArrayList arrayList1 = (ArrayList)this.c.get(s);
                if(arrayList1 == null) {
                    arrayList1 = new ArrayList(1);
                    this.c.put(s, arrayList1);
                }
                arrayList1.add(a0);
            }
        }
    }

    public boolean sendBroadcast(@NonNull Intent intent0) {
        String s4;
        int v2;
        ArrayList arrayList2;
        synchronized(this.b) {
            String s = intent0.getAction();
            String s1 = intent0.resolveTypeIfNeeded(this.a.getContentResolver());
            Uri uri0 = intent0.getData();
            String s2 = intent0.getScheme();
            Set set0 = intent0.getCategories();
            boolean z = (intent0.getFlags() & 8) != 0;
            if(z) {
                Log.v("LocalBroadcastManager", "Resolving type " + s1 + " scheme " + s2 + " of intent " + intent0);
            }
            String s3 = intent0.getAction();
            ArrayList arrayList0 = (ArrayList)this.c.get(s3);
            if(arrayList0 != null) {
                if(z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList0);
                }
                ArrayList arrayList1 = null;
                int v1 = 0;
                while(v1 < arrayList0.size()) {
                    a a0 = (a)arrayList0.get(v1);
                    if(z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + a0.a);
                    }
                    if(a0.c) {
                        if(z) {
                            Log.v("LocalBroadcastManager", "  Filter\'s target already added");
                        }
                        arrayList2 = arrayList0;
                        v2 = v1;
                    }
                    else {
                        arrayList2 = arrayList0;
                        v2 = v1;
                        int v3 = a0.a.match(s, s1, s2, uri0, set0, "LocalBroadcastManager");
                        if(v3 >= 0) {
                            if(z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(v3));
                            }
                            if(arrayList1 == null) {
                                arrayList1 = new ArrayList();
                            }
                            arrayList1.add(a0);
                            a0.c = true;
                        }
                        else if(z) {
                            switch(v3) {
                                case -4: {
                                    s4 = "category";
                                    break;
                                }
                                case -3: {
                                    s4 = "action";
                                    break;
                                }
                                case -2: {
                                    s4 = "data";
                                    break;
                                }
                                case -1: {
                                    s4 = "type";
                                    break;
                                }
                                default: {
                                    s4 = "unknown reason";
                                }
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + s4);
                        }
                    }
                    v1 = v2 + 1;
                    arrayList0 = arrayList2;
                }
                if(arrayList1 != null) {
                    for(int v4 = 0; v4 < arrayList1.size(); ++v4) {
                        ((a)arrayList1.get(v4)).c = false;
                    }
                    b b0 = new b(26, intent0, arrayList1);
                    this.d.add(b0);
                    if(!this.e.hasMessages(1)) {
                        this.e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public void sendBroadcastSync(@NonNull Intent intent0) {
        if(this.sendBroadcast(intent0)) {
            this.a();
        }
    }

    public void unregisterReceiver(@NonNull BroadcastReceiver broadcastReceiver0) {
        synchronized(this.b) {
            ArrayList arrayList0 = (ArrayList)this.b.remove(broadcastReceiver0);
            if(arrayList0 == null) {
                return;
            }
            for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                a a0 = (a)arrayList0.get(v1);
                a0.d = true;
                for(int v2 = 0; v2 < a0.a.countActions(); ++v2) {
                    String s = a0.a.getAction(v2);
                    ArrayList arrayList1 = (ArrayList)this.c.get(s);
                    if(arrayList1 != null) {
                        for(int v3 = arrayList1.size() - 1; v3 >= 0; --v3) {
                            a a1 = (a)arrayList1.get(v3);
                            if(a1.b == broadcastReceiver0) {
                                a1.d = true;
                                arrayList1.remove(v3);
                            }
                        }
                        if(arrayList1.size() <= 0) {
                            this.c.remove(s);
                        }
                    }
                }
            }
        }
    }
}

