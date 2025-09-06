package androidx.fragment.app;

import a5.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

public final class c1 implements OpGenerator {
    public final String a;
    public final FragmentManager b;

    public c1(FragmentManager fragmentManager0, String s) {
        this.b = fragmentManager0;
        this.a = s;
    }

    @Override  // androidx.fragment.app.FragmentManager$OpGenerator
    public final boolean generateOps(ArrayList arrayList0, ArrayList arrayList1) {
        String s1;
        FragmentManager fragmentManager0 = this.b;
        String s = this.a;
        int v = fragmentManager0.z(s, -1, true);
        if(v < 0) {
            return false;
        }
        int v1 = v;
        while(v1 < fragmentManager0.d.size()) {
            a a0 = (a)fragmentManager0.d.get(v1);
            if(a0.r) {
                ++v1;
                continue;
            }
            fragmentManager0.X(new IllegalArgumentException("saveBackStack(\"" + s + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + a0 + " that did not use setReorderingAllowed(true)."));
            throw null;
        }
        HashSet hashSet0 = new HashSet();
        for(int v2 = v; v2 < fragmentManager0.d.size(); ++v2) {
            a a1 = (a)fragmentManager0.d.get(v2);
            HashSet hashSet1 = new HashSet();
            HashSet hashSet2 = new HashSet();
            for(Object object0: a1.c) {
                p1 p10 = (p1)object0;
                Fragment fragment0 = p10.b;
                if(fragment0 != null) {
                    if(!p10.c || (p10.a == 1 || p10.a == 2 || p10.a == 8)) {
                        hashSet0.add(fragment0);
                        hashSet1.add(fragment0);
                    }
                    if(p10.a == 1 || p10.a == 2) {
                        hashSet2.add(fragment0);
                    }
                }
            }
            hashSet1.removeAll(hashSet2);
            if(!hashSet1.isEmpty()) {
                StringBuilder stringBuilder0 = b.v("saveBackStack(\"", s, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if(hashSet1.size() == 1) {
                    Object object1 = hashSet1.iterator().next();
                    s1 = " " + object1;
                }
                else {
                    s1 = "s " + hashSet1;
                }
                stringBuilder0.append(s1);
                stringBuilder0.append(" in ");
                stringBuilder0.append(a1);
                stringBuilder0.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                fragmentManager0.X(new IllegalArgumentException(stringBuilder0.toString()));
                throw null;
            }
        }
        ArrayDeque arrayDeque0 = new ArrayDeque(hashSet0);
        while(!arrayDeque0.isEmpty()) {
            Fragment fragment1 = (Fragment)arrayDeque0.removeFirst();
            if(fragment1.mRetainInstance) {
                StringBuilder stringBuilder1 = b.v("saveBackStack(\"", s, "\") must not contain retained fragments. Found ");
                stringBuilder1.append((hashSet0.contains(fragment1) ? "direct reference to retained " : "retained child "));
                stringBuilder1.append("fragment ");
                stringBuilder1.append(fragment1);
                fragmentManager0.X(new IllegalArgumentException(stringBuilder1.toString()));
                throw null;
            }
            for(Object object2: fragment1.mChildFragmentManager.c.e()) {
                Fragment fragment2 = (Fragment)object2;
                if(fragment2 != null) {
                    arrayDeque0.addLast(fragment2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object3: hashSet0) {
            arrayList2.add(((Fragment)object3).mWho);
        }
        ArrayList arrayList3 = new ArrayList(fragmentManager0.d.size() - v);
        for(int v3 = v; v3 < fragmentManager0.d.size(); ++v3) {
            arrayList3.add(null);
        }
        d d0 = new d(arrayList2, arrayList3);
        for(int v4 = fragmentManager0.d.size() - 1; v4 >= v; --v4) {
            a a2 = (a)fragmentManager0.d.remove(v4);
            a a3 = new a(a2);
            ArrayList arrayList4 = a3.c;
            for(int v5 = arrayList4.size() - 1; v5 >= 0; --v5) {
                p1 p11 = (p1)arrayList4.get(v5);
                if(p11.c) {
                    if(p11.a == 8) {
                        p11.c = false;
                        arrayList4.remove(v5 - 1);
                        --v5;
                    }
                    else {
                        int v6 = p11.b.mContainerId;
                        p11.a = 2;
                        p11.c = false;
                        for(int v7 = v5 - 1; v7 >= 0; --v7) {
                            p1 p12 = (p1)arrayList4.get(v7);
                            if(p12.c && p12.b.mContainerId == v6) {
                                arrayList4.remove(v7);
                                --v5;
                            }
                        }
                    }
                }
            }
            arrayList3.set(v4 - v, new c(a3));
            a2.w = true;
            arrayList0.add(a2);
            arrayList1.add(Boolean.TRUE);
        }
        fragmentManager0.j.put(s, d0);
        return true;
    }
}

