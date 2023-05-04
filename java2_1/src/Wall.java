public class Wall implements Polosa {
    static int height;

    public Wall(int height){
        this.height = height;
    }
    public Member member;

    public boolean start(Member member){
        if(member.jumppr(height)==true){
            return false;
        }
        else{
            return true;
        }
    }
}
