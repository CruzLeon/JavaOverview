package org.example.packageVisibility.protectedScope;

class ProtectedMember{
    protected int  miprotectedVar = 0;
}
class PrivateMember{
}

class ScopePrivate extends PrivateMember{
    public int miPrivateVar = 9;
}
public class ScopeProtected extends ProtectedMember{

    public static void main(String[] args) {
        ScopeProtected scopeProtected = new ScopeProtected();
        System.out.println(scopeProtected.miprotectedVar);

        PrivateMember scopePrivate = new ScopePrivate();
        // fuera de alcance System.out.println(scopePrivate.miPrivateVar);
    }
}
