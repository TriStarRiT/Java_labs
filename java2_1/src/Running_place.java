public class Running_place implements Polosa{
    static int length;

    public Running_place(int length){
        this.length = length;
    }
    public Member member;

    public boolean start(Member member){
        if(member.runpr(length)){
            return false;
        }
        else{
            return true;
        }
    }
}
